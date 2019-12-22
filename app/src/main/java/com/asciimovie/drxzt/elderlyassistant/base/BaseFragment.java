package com.asciimovie.drxzt.elderlyassistant.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1PorkGarlicActivity;

import java.io.Serializable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public  abstract class BaseFragment extends Fragment {

    protected BaseActivity mActivity;
    protected int mLayoutId = 0;// 布局Id
    Unbinder unbinder;
    protected View rootView;

    public BaseFragment(int resId) {
        mLayoutId = resId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(mLayoutId, null);
        this.rootView = rootView;
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }

    /**
     * 初始化界面，对相关界面控件进行赋值
     */
    public abstract void initViews();

    protected void startActivity(Class<?> cls) {
//        startActivity(cls, null);
        Intent intent1 = new Intent(getActivity(), cls);
        startActivity(intent1);
    }

    public void startActivity(Class<?> cls, Object obj) {
        if (!isAdded()) {
            return;
        }
        Intent intent = new Intent(mActivity, cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        if (obj != null) {
            intent.putExtra("data", (Serializable) obj);
        }
        startActivity(intent);
        mActivity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    /**
     * 带着数据，设置返回码，从本页面跳转到下个页面，重写onActivityResult可以获取从下个页面带回来的数据
     *
     * @param cls         需要跳转到的页面
     * @param obj         传递给下个页面的数据
     * @param requestCode 返回码
     */
    public void startActivityForResult(Class<?> cls, Object obj, int requestCode) {
        Intent intent = new Intent(mActivity, cls);
        if (obj != null) {
            intent.putExtra("data", (Serializable) obj);
        }
        startActivityForResult(intent, requestCode);
        mActivity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

}
