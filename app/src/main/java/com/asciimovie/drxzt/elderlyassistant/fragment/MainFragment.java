package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;


import com.asciimovie.drxzt.elderlyassistant.R;

import com.asciimovie.drxzt.elderlyassistant.activity.Coummunity.CommunityActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.Sleep.SleepActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.Sports.SportsActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.Story.StoryActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.news.NewsActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.radio.RadioActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.time.TimeSelectActivity;

import org.litepal.LitePal;


import java.util.ArrayList;
import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


public class MainFragment extends Fragment implements View.OnClickListener {

//    private List<Memorial> memorialList = new ArrayList<>();
    private List<Note> noteList = new ArrayList<>();

    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;

    Button button14;

    View viewTime;

    private View contentView;
    private Context mContext;
    private PopupWindow popupWindow;
    public static RecyclerView recyclerView;


    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

//        recyclerView = view.findViewById(R.id.recycler_view);

        initPopupWindow();//初始化PopupWindow
//        LitePal.getDatabase();//创建数据

//        initMemorial();//初始化备忘录数据

        button7 = view.findViewById(R.id.btn_food);
        button8 = view.findViewById(R.id.btn_sport);
        button9 = view.findViewById(R.id.btn_sleep);
        button10 = view.findViewById(R.id.btn_community);
        button11 = view.findViewById(R.id.btn_news);
        button12 = view.findViewById(R.id.btn_radio);
        button13 = view.findViewById(R.id.btn_story);
//        button14 = view.findViewById(R.id.btn_add);
        viewTime=view.findViewById(R.id.view_timeselect);


        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
//        button14.setOnClickListener(this);
        viewTime.setOnClickListener(this);

        return view;
    }

//    private void initMemorial() {
//        for(int i = 0; i<2;i++);
//        Memorial square1 = new Memorial(R.drawable.square1);
//        memorialList.add(square1);
//        Memorial square2 = new Memorial(R.drawable.square2);
//        memorialList.add(square2);
//        Memorial square3 = new Memorial(R.drawable.square3);
//        memorialList.add(square3);
//    }

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
                Intent intent7 = new Intent(getActivity(), NewsActivity.class);
                startActivity(intent7);
                break;

            case R.id.btn_sleep:
                Intent intentSleep = new Intent(getActivity(), SleepActivity.class);
                startActivity(intentSleep);
                break;
            case R.id.btn_radio:
                Intent intentradio = new Intent(getActivity(), RadioActivity.class);
                startActivity(intentradio);
                break;
            case R.id.btn_story:
                Intent intentstory = new Intent(getActivity(), StoryActivity.class);
                startActivity(intentstory);
                break;

            case R.id.view_timeselect:
                Intent intent8 = new Intent(getActivity(), TimeSelectActivity.class);
                startActivity(intent8);
                break;

            default:
                break;

        }


    }

    private void initNoteRecyclerView(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        MemoAdapter adapter = new MemoAdapter(noteList);
        recyclerView.setAdapter(adapter);
        adapter.setOnRecyclerViewListener(new MemoAdapter.OnRecyclerViewListener() {
            @Override    //在MemoAdaptert里面没有写清楚的方法，这里重新写
            public void onItemClick(int position) {
//                popupWindow.showAtLocation(.findViewById(R.id.recycler_view));
            }

            @Override
            public boolean onItemLongClick(int position) {
                return false;
            }
        });



    }
    private void initPopupWindow(){

        LayoutInflater lf = (LayoutInflater) getActivity()
                .getSystemService(LAYOUT_INFLATER_SERVICE);
        contentView = lf.inflate(R.layout.popup, null, false);
        popupWindow = new PopupWindow(contentView,50,200);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
//        popupWindow.setOutsideTouchable(true);
//        popupWindow.showAsDropDown(contentView,50,0);

        //一下代码为点击非PopupWindow区域，PopupWindow会消失
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });

        Button button1 = contentView.findViewById(R.id.btn_add);
        Button button2 = contentView.findViewById(R.id.btn_delete);
        Button button3 = contentView.findViewById(R.id.btn_revise);
        Button button4 = contentView.findViewById(R.id.btn_cancel);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(),AddActivity.class);
                startActivity(intent1);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();

            }
        });

    }
}
