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
import com.asciimovie.drxzt.elderlyassistant.activity.Coummunity.CommunityActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.Sports.SportsActivity;
//import com.asciimovie.drxzt.elderlyassistant.activity.Story.StoryActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.news.NewsActivity;


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
                break;
            case R.id.btn_food:
                Intent intent4 = new Intent(getActivity(), FoodActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_sport:
                Intent intent5 = new Intent(getActivity(), SportsActivity.class);
                startActivity(intent5);
                break;
            case R.id.btn_news:
                Intent intent6 = new Intent(getActivity(), NewsActivity.class);
                startActivity(intent6);
                break;
            case R.id.btn_story:
//                Intent intent7 = new Intent(getActivity(), StoryActivity.class);
//                startActivity(intent7);
                break;
        }
    }
}
