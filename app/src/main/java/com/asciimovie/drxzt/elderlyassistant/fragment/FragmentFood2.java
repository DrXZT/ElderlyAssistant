package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.Coummunity.CommunityActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1BeefPotatoActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1FragrantfloweredgarlicEggActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1LeanmeatGreenchineseonionActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1LiverSpinachActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1PorkGarlicActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1SesameKelpActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Food1TofuCarrotActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodSpinachActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;
import com.asciimovie.drxzt.elderlyassistant.base.BaseActivity;
import com.asciimovie.drxzt.elderlyassistant.base.BaseFragment;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.OnClick;

public class FragmentFood2 extends BaseFragment implements View.OnClickListener {


    protected BaseActivity mActivity;

    public FragmentFood2() {
        super(R.layout.fragment_food_2);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_2, container, false);


        Button button1 = view.findViewById(R.id.btn_porkGarlic);
        Button button2 = view.findViewById(R.id.btn_beefPotato);
        Button button3 = view.findViewById(R.id.btn_meantGreen);
        Button button4 = view.findViewById(R.id.btn_sesameKelp);
        Button button5 = view.findViewById(R.id.btn_liverSpinach);
        Button button6 = view.findViewById(R.id.btn_tofuCarrot);
        Button button7 = view.findViewById(R.id.btn_fragrantEgg);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        return view;
    }

    @Override
    public void initViews() {
    }


    @Override
    public void onClick(View view) {
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
}
