package com.asciimovie.drxzt.elderlyassistant.activity.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodSpinachActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener{

    View view_1;
    View view_2;
    View view_3;
    View view_4;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        view_1 =findViewById(R.id.view_1);
        view_2 =findViewById(R.id.view_2);
        view_3 =findViewById(R.id.view_3);
        view_4 =findViewById(R.id.view_4);

        btn_back=findViewById(R.id.btn_back);

        view_1.setOnClickListener(this);
        view_2.setOnClickListener(this);
        view_3.setOnClickListener(this);
        view_4.setOnClickListener(this);
        btn_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.btn_back:
                Intent intent = new Intent(NewsActivity.this, MainActivity.class);
                startActivity(intent);

                break;
            case R.id.view_1:
                Intent intent1 = new Intent(NewsActivity.this, News1Activity.class);
                startActivity(intent1);

                break;
            case R.id.view_2:
                Intent intent2 = new Intent(NewsActivity.this, News2Activity.class);
                startActivity(intent2);
                break;
            case R.id.view_3:
                Intent intent3 = new Intent(NewsActivity.this, News3Activity.class);
                startActivity(intent3);
                break;
            case R.id.view_4:
                Intent intent4 = new Intent(NewsActivity.this, News4Activity.class);
                startActivity(intent4);
                break;




        }

    }
}
