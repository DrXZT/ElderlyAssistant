package com.asciimovie.drxzt.elderlyassistant.activity.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.entity.UserDO;

public class LoginActivity extends AppCompatActivity {
    private EditText userNameEdit;
    private Button loginButton;
    private EditText passwordEdit;
    String userId;
    String password;
    UserDO loginUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userNameEdit =  findViewById(R.id.userNameEdit);
        loginButton = findViewById(R.id.loginButton);
        passwordEdit = findViewById(R.id.passwordEdit);
        userId=userNameEdit.getText().toString();
        password=userNameEdit.getText().toString();
    }
}
