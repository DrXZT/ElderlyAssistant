package com.asciimovie.drxzt.elderlyassistant.activity.Sports;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class SportsActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sport_sports);

        button = findViewById(R.id.btn_back);

        button1 = findViewById(R.id.btn_walk);
        button2 = findViewById(R.id.btn_run);
        button3 = findViewById(R.id.btn_exercise);
        button4 = findViewById(R.id.btn_squaredance);
        button5 = findViewById(R.id.btn_taijiquan);
    

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                Intent intent = new Intent(SportsActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_walk:
                Intent intent1 = new Intent(SportsActivity.this,WalkActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_run:
                Intent intent2 = new Intent(SportsActivity.this,RunActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_exercise:
                Intent intent3 = new Intent(SportsActivity.this,ExerciseActivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_squaredance:
                Intent intent4 = new Intent(SportsActivity.this,SquaredanceActivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_taijiquan:
                Intent intent5 = new Intent(SportsActivity.this,TaijiquanActivity.class);
                startActivity(intent5);
                break;
            default:
                break;


        }

    }
}
