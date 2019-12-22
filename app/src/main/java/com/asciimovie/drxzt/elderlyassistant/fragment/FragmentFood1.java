package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.*;


public class FragmentFood1 extends Fragment implements View.OnClickListener{
    Button btn_celery;
    Button btn_dried_small_shrimps;
    Button btn_medlar;
    Button btn_crucian;
    Button btn_fishhead;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_1, container, false);
        btn_celery = view.findViewById(R.id.btn_celery);
        btn_dried_small_shrimps = view.findViewById(R.id.btn_dried_small_shrimps);
        btn_medlar = view.findViewById(R.id.btn_medlar);
        btn_crucian = view.findViewById(R.id.btn_crucian);
        btn_fishhead = view.findViewById(R.id.btn_fishhead);

        btn_celery.setOnClickListener(this);
        btn_dried_small_shrimps.setOnClickListener(this);
        btn_medlar.setOnClickListener(this);
        btn_crucian.setOnClickListener(this);
        btn_fishhead.setOnClickListener(this);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_celery:
                Intent intent1 = new Intent(getActivity(), FoodCeleryActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_dried_small_shrimps:
                Intent intent2 = new Intent(getActivity(), Food2DriedSmallShrimpsActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_medlar:
                Intent intent3 = new Intent(getActivity(), Food2MedlarActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_crucian:
                Intent intent4 = new Intent(getActivity(), Food2CrucianActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_fishhead:
                Intent intent5 = new Intent(getActivity(), Food2FishHeadActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
