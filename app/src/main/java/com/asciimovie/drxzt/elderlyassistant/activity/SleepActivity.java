package com.asciimovie.drxzt.elderlyassistant.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;

public class SleepActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        button1 = findViewById(R.id.iv_walk);
        button2 = findViewById(R.id.iv_run);
        button3 = findViewById(R.id.iv_exercise);
        button4 = findViewById(R.id.iv_squaredance);
        button5 = findViewById(R.id.iv_taijiquan);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_walk:
                Intent intent1 = new Intent(SleepActivity.this,WalkActivity.class);
                startActivity(intent1);
            case R.id.iv_run:
                Intent intent2 = new Intent(SleepActivity.this,RunActivity.class);
                startActivity(intent2);
            case R.id.iv_exercise:
                Intent intent3 = new Intent(SleepActivity.this,ExerciseActivity.class);
                startActivity(intent3);
            case R.id.iv_squaredance:
                Intent intent4 = new Intent(SleepActivity.this,SquaredanceActivity.class);
                startActivity(intent4);
            case R.id.iv_taijiquan:
                Intent intent5 = new Intent(SleepActivity.this,TaijiquanActivity.class);
                startActivity(intent5);


        }

    }
}
