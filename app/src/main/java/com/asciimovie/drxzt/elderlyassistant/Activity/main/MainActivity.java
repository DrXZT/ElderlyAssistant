package com.asciimovie.drxzt.elderlyassistant.Activity.main;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.Activity.user.*;
import com.asciimovie.drxzt.elderlyassistant.R;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.main_tab);
        Button button2 = findViewById(R.id.call_tab);
        Button button3 = findViewById(R.id.message_tab);
        Button button4 = findViewById(R.id.person_tab);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        replaceFragment(new FragmentMain());


        Button button5 = findViewById(R.id.btn_head);
        Button button6 = findViewById(R.id.btn_head2);

        Button button7 = findViewById(R.id.btn_food);
        Button button8 = findViewById(R.id.btn_sport);
        Button button9 = findViewById(R.id.btn_sleep);
        Button button10 = findViewById(R.id.btn_community);
        Button button11 = findViewById(R.id.btn_news);
        Button button12 = findViewById(R.id.btn_radio);
        Button button13 = findViewById(R.id.btn_story);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_tab:
                replaceFragment(new FragmentMain());
                break;
            case R.id.call_tab:
                replaceFragment(new FragmentCall());
                break;
            case R.id.message_tab:
                replaceFragment(new FragmentMessage());
                break;
            case R.id.person_tab:
                replaceFragment(new FragmentPerson());
                break;
            case R.id.btn_head:
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_head2:
                Intent intent2 = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_community:
                Intent intent3 = new Intent(MainActivity.this,CommunityActivity.class);
                startActivity(intent3);
            case R.id.btn_food:
                Intent intent4 = new Intent(MainActivity.this,FoodActivity.class);
                startActivity(intent4);

            default:
                break;

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

//之前写的
//public class MainActivity extends AppCompatActivity {
//
//    private TextView mTextView;
//    private RadioGroup mTabs_rg;
//    private RadioButton mMain_tab;
//    private RadioButton mCall_tab;
//    private RadioButton mMassage_tab;
//    private RadioButton mPerson_tab;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mTabs_rg = (RadioGroup) findViewById(R.id.tabs_rg);
//        mMain_tab = (RadioButton) findViewById(R.id.main_tab);
//        mCall_tab = (RadioButton) findViewById(R.id.call_tab);
//        mMassage_tab = (RadioButton) findViewById(R.id.massage_tab);
//        mPerson_tab = (RadioButton) findViewById(R.id.person_tab);
//        mCall_tab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent dialIntent =  new Intent(Intent.ACTION_CALL_BUTTON);//跳转到拨号界面
//                startActivity(dialIntent);
//            }
//        });
//        mMassage_tab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String action = Intent.ACTION_SENDTO;
//                Intent intent = new Intent(action);//跳转发短信界面
//                startActivity(intent);
//            }
//        });
//    }
//}
