package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodBaconActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodPineappleActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodPotatoActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodShrimpActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodSpinachActivity;

public class FragmentFood3 extends Fragment implements View.OnClickListener {

    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_3, container, false);
        button4 = view.findViewById(R.id.btn_spinach);
        button5 = view.findViewById(R.id.btn_potato);
        button6 = view.findViewById(R.id.btn_pineapple);
        button7 = view.findViewById(R.id.btn_bacon);
        button8 = view.findViewById(R.id.btn_shrimp);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_spinach:
                Intent intent1 = new Intent(getActivity(), FoodSpinachActivity.class);
                startActivity(intent1);
            case R.id.btn_potato:
                Intent intent2 = new Intent(getActivity(), FoodPotatoActivity.class);
                startActivity(intent2);
            case R.id.btn_pineapple:
                Intent intent3 = new Intent(getActivity(), FoodPineappleActivity.class);
                startActivity(intent3);
            case R.id.btn_bacon:
                Intent intent4 = new Intent(getActivity(), FoodBaconActivity.class);
                startActivity(intent4);
            case R.id.btn_shrimp:
                Intent intent5 = new Intent(getActivity(), FoodShrimpActivity.class);
                startActivity(intent5);
        }
    }
}
