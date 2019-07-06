package com.asciimovie.drxzt.elderlyassistant.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.asciimovie.drxzt.elderlyassistant.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private RadioGroup mTabs_rg;
    private RadioButton mMain_tab;
    private RadioButton mCall_tab;
    private RadioButton mMassage_tab;
    private RadioButton mPerson_tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        mTabs_rg = (RadioGroup) findViewById(R.id.tabs_rg);
        mMain_tab = (RadioButton) findViewById(R.id.main_tab);
        mCall_tab = (RadioButton) findViewById(R.id.call_tab);
        mMassage_tab = (RadioButton) findViewById(R.id.massage_tab);
        mPerson_tab = (RadioButton) findViewById(R.id.person_tab);
        mCall_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dialIntent =  new Intent(Intent.ACTION_CALL_BUTTON);//跳转到拨号界面
                startActivity(dialIntent);
            }
        });
        mMassage_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String action = Intent.ACTION_SENDTO;
                Intent intent = new Intent(action);//跳转发短信界面
                startActivity(intent);
            }
        });
    }
}
