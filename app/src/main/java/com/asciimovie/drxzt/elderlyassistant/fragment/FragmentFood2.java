package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1BeefPotatoActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1FragrantfloweredgarlicEggActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1LeanmeatGreenchineseonionActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1LiverSpinachActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1PorkGarlicActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1SesameKelpActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1TofuCarrotActivity;
import com.asciimovie.drxzt.elderlyassistant.base.BaseActivity;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentFood2 extends Fragment {

    @BindView(R.id.btn_porkGarlic)
    TextView tvMenu4;

    protected BaseActivity mActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_2, container, false);
        return view;
    }

    @OnClick({R.id.btn_porkGarlic,R.id.btn_beefPotato,R.id.btn_meantGreen,R.id.btn_sesameKelp,R.id.btn_liverSpinach,R.id.btn_tofuCarrot,R.id.btn_fragrantEgg})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_porkGarlic:
                startActivity(Food1PorkGarlicActivity.class);
                break;
            case R.id.btn_beefPotato:
                startActivity(Food1BeefPotatoActivity.class);
                break;
            case R.id.btn_meantGreen:
                startActivity(Food1LeanmeatGreenchineseonionActivity.class);
                break;
            case R.id.btn_sesameKelp:
                startActivity(Food1SesameKelpActivity.class);
                break;
            case R.id.btn_liverSpinach:
                startActivity(Food1LiverSpinachActivity.class);
                break;
            case R.id.btn_tofuCarrot:
                startActivity(Food1TofuCarrotActivity.class);
                break;
            case R.id.btn_fragrantEgg:
                startActivity(Food1FragrantfloweredgarlicEggActivity.class);
                break;
        }
    }
    protected void startActivity(Class<?> cls) {
        startActivity(cls, null);
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

}
