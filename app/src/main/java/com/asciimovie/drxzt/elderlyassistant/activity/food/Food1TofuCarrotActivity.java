package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;

public class Food1TofuCarrotActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btn_back;
    Button btn_collect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food1_liver_spinach);
        btn_back = findViewById(R.id.btn_back);
        btn_collect = findViewById(R.id.btn_collect);
        btn_back.setOnClickListener(this);
        btn_collect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
