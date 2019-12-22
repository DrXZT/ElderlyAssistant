package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;

public class Food1BeefPotatoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food1_beef_potato);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.btn_back:
//
//        }
    }
}

