package com.asciimovie.drxzt.elderlyassistant.activity.time;

import android.opengl.Visibility;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.base.BaseActivity;

public class TimeSelectActivity extends BaseActivity {

    private ImageView iv_menu;
    private TextView tv_delet;
    private TextView tv_Add;
    private ImageView iv_time;
    private ImageView iv_date;


    private int mMenu=0;   //判断menu是否展开

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_time_select);

        LinearLayout linearLayout =findViewById(R.id.menu);
        linearLayout.setVisibility(View.GONE);
        LinearLayout show1 =findViewById(R.id.show1);
        show1.setVisibility(View.GONE);
        LinearLayout show2 =findViewById(R.id.show2);
        show2.setVisibility(View.GONE);

        iv_menu=findViewById(R.id.iv_star);
        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMenu==0){
                    linearLayout.setVisibility(View.VISIBLE);
                    mMenu=1;
                }else{
                    linearLayout.setVisibility(View.GONE);
                    mMenu=0;
                }
            }
        });

        iv_date=findViewById(R.id.iv_date);
        iv_time=findViewById(R.id.iv_time);
        iv_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show1.setVisibility(View.GONE);
                show2.setVisibility(View.VISIBLE);
            }
        });
        iv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2.setVisibility(View.GONE);
            }
        });


        tv_delet=findViewById(R.id.tv_delet);
        tv_Add=findViewById(R.id.tv_add);
        tv_delet.setOnClickListener(new View.OnClickListener() {            //删除操作不需要
            @Override
            public void onClick(View v) {
                if(mMenu==0){
                    linearLayout.setVisibility(View.VISIBLE);
                    mMenu=1;
                }else{
                    linearLayout.setVisibility(View.GONE);
                    mMenu=0;
                }
            }
        });

        tv_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMenu==0){
                    linearLayout.setVisibility(View.VISIBLE);
                    mMenu=1;
                }else{
                    linearLayout.setVisibility(View.GONE);
                    mMenu=0;
                }
                show1.setVisibility(View.VISIBLE);
            }
        });

    }
}
