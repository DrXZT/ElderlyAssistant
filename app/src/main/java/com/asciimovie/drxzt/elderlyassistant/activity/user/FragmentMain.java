package com.asciimovie.drxzt.elderlyassistant.activity.user;

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
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class FragmentMain extends Fragment implements View.OnClickListener {


    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        button7 = view.findViewById(R.id.btn_food);
        button8 = view.findViewById(R.id.btn_sport);
        button9 = view.findViewById(R.id.btn_sleep);
        button10 = view.findViewById(R.id.btn_community);
        button11 = view.findViewById(R.id.btn_news);
        button12 = view.findViewById(R.id.btn_radio);
        button13 = view.findViewById(R.id.btn_story);

        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_community:
                Intent intent3 = new Intent(getActivity(), CommunityActivity.class);
                startActivity(intent3);
            case R.id.btn_food:
                Intent intent4 = new Intent(getActivity(), FoodActivity.class);
                startActivity(intent4);
            case R.id.btn_sleep:
                Intent intent5 = new Intent(getActivity(),SleepActivity.class);
                startActivity(intent5);
        }


    }
}
