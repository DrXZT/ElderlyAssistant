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

public class FragmentFood2 extends Fragment implements View.OnClickListener {




    protected BaseActivity mActivity;



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

//    @Override
//    public void initViews() {
//    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_porkGarlic:
                Intent intent1 = new Intent(getActivity(), Food1PorkGarlicActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_beefPotato:
                Intent intent2 = new Intent(getActivity(), Food1BeefPotatoActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_meantGreen:
                Intent intent3 = new Intent(getActivity(), Food1LeanmeatGreenchineseonionActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_sesameKelp:
                Intent intent4 = new Intent(getActivity(), Food1SesameKelpActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_liverSpinach:
                Intent intent5 = new Intent(getActivity(), Food1LiverSpinachActivity.class);
                startActivity(intent5);
                break;
            case R.id.btn_tofuCarrot:
                Intent intent6 = new Intent(getActivity(), Food1TofuCarrotActivity.class);
                startActivity(intent6);
                break;
            case R.id.btn_fragrantEgg:
                Intent intent7 = new Intent(getActivity(), Food1FragrantfloweredgarlicEggActivity.class);
                startActivity(intent7);
                break;
        }
    }
}
