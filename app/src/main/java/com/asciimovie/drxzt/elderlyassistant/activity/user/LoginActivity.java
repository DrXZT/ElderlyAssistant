package com.asciimovie.drxzt.elderlyassistant.activity.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;
import com.asciimovie.drxzt.elderlyassistant.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn_back;
    private TextView mTv_title;
    private TextView mTv_pn;
    private TextView mTv_code;
    private EditText mLogin_code;
    private Button mBtn_getCode;
    private Button mBtn_login;
    private TextView mTv_m;
    private TextView mTv_other;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mBtn_back = findViewById(R.id.btn_back);
        mTv_title =  findViewById(R.id.tv_title);
        mTv_pn =  findViewById(R.id.tv_pn);
        mTv_code = findViewById(R.id.tv_code);
        mLogin_code=  findViewById(R.id.login_code);
        mBtn_getCode = findViewById(R.id.btn_getCode);
        mBtn_login =  findViewById(R.id.btn_login);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                replaceFragment(new FragmentPerson2());

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
