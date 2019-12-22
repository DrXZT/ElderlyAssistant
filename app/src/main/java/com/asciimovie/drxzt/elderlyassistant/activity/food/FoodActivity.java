package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood1;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood2;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood3;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener  {
    Button button;
    Button button1;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_food);

        button = findViewById(R.id.btn_back);
        button1 = findViewById(R.id.rb_1);
        button2 = findViewById(R.id.rb_2);
        button3 = findViewById(R.id.rb_3);
        button = findViewById(R.id.btn_back);


        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        replaceFragment(new FragmentFood1());
        button1.setTextColor(Color.BLACK);
        button2.setTextColor(Color.parseColor("#4e4e4e"));
        button3.setTextColor(Color.parseColor("#4e4e4e"));


    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                Intent intent = new Intent(FoodActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.rb_1:
                replaceFragment(new FragmentFood1());
                button1.setTextColor(Color.BLACK);
                button2.setTextColor(Color.parseColor("#4e4e4e"));
                button3.setTextColor(Color.parseColor("#4e4e4e"));
                break;
            case R.id.rb_2:
                replaceFragment(new FragmentFood2());
                button1.setTextColor(Color.parseColor("#4e4e4e"));
                button2.setTextColor(Color.BLACK);
                button3.setTextColor(Color.parseColor("#4e4e4e"));
                break;
            case R.id.rb_3:
                replaceFragment(new FragmentFood3());
                button1.setTextColor(Color.parseColor("#4e4e4e"));
                button2.setTextColor(Color.parseColor("#4e4e4e"));
                button3.setTextColor(Color.BLACK);
                break;

            default:
                break;

        }
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fl_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

