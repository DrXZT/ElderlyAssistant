package com.asciimovie.drxzt.elderlyassistant.activity.radio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.FoodActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class RadioActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        button=findViewById(R.id.btn_back);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                Intent intent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}
