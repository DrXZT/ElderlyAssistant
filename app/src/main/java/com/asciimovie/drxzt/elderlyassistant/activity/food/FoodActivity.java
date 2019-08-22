package com.asciimovie.drxzt.elderlyassistant.activity.food;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood1;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood2;
import com.asciimovie.drxzt.elderlyassistant.fragment.FragmentFood3;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener  {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        button1 = findViewById(R.id.rb_1);
        button2 = findViewById(R.id.rb_2);
        button3 = findViewById(R.id.rb_3);

        button4 = findViewById(R.id.btn_spinach);
        button5 = findViewById(R.id.btn_potato);
        button6 = findViewById(R.id.btn_pineapple);
        button7 = findViewById(R.id.btn_bacon);
        button8 = findViewById(R.id.btn_shrimp);


        replaceFragment(new FragmentFood1());



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




    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rb_1:
                replaceFragment(new FragmentFood1());
                button1.setTextColor(000000);
            case R.id.rb_2:
                replaceFragment(new FragmentFood2());
                button1.setTextColor(000000);
            case R.id.rb_3:
                replaceFragment(new FragmentFood3());
                button1.setTextColor(000000);

        }
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
