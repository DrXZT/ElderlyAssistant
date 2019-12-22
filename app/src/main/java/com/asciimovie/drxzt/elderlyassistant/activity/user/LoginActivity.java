package com.asciimovie.drxzt.elderlyassistant.activity.user;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;
import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.base.BaseActivity;
import com.asciimovie.drxzt.elderlyassistant.entity.ResponseDo;
import com.asciimovie.drxzt.elderlyassistant.entity.UserDO;
import com.asciimovie.drxzt.elderlyassistant.fragment.Person2Fragment;
import com.asciimovie.drxzt.elderlyassistant.fragment.PersonFragment;
import com.asciimovie.drxzt.elderlyassistant.util.MyOkHttpPost;
import com.asciimovie.drxzt.elderlyassistant.util.ToastUtil;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static com.asciimovie.drxzt.elderlyassistant.enumtype.constant.SERVICE_URL;


public class LoginActivity extends BaseActivity implements View.OnClickListener  {
    private Button mBtn_back;
    private EditText mLogin_password;
    private EditText mLogin_phone;
    private Button mBtn_getCode;
    private Button mBtn_login;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mBtn_back = findViewById(R.id.btn_back);

        //mLogin_password=  findViewById(R.id.login_password);
        mBtn_getCode = findViewById(R.id.btn_getCode);
        mBtn_login =  findViewById(R.id.btn_login);
        mLogin_phone=findViewById(R.id.phone);

        mBtn_back.setOnClickListener(this);
        mBtn_login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)  {
        switch (v.getId()){
            case R.id.btn_back:
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_login:
//                new Thread(() -> {
//                String userPhone =mLogin_phone.getText().toString().trim();
//                String password=mLogin_password.getText().toString().trim();
//                try {
//                    JSONObject jsonObject =new JSONObject();
//                    jsonObject.put("phone",userPhone);
//                    jsonObject.put("password",password);
//                    MyOkHttpPost.PostJSONObject(SERVICE_URL+"/user/login",jsonObject.toString(), new Callback() {
//                        @Override
//                        public void onFailure(@NotNull Call call, @NotNull IOException e) {
//                            e.printStackTrace();
//                        }
//                        @Override
//                        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
//                            String responseData = Objects.requireNonNull(response.body()).string();
//                            parseJSONWithGSON(responseData);
//                        }
//                    });
//
//                }catch (Exception e){
//                    e.printStackTrace();
//                    ToastUtil.toast(LoginActivity.this,"登录失败");
//                }
//                }).start();
                sure=1;
                Intent intent1 = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent1);

                break;
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

    //解析密码登录返回token
    private void parseJSONWithGSON(String jsonData) {
        ResponseDo loginInformation = JSONObject.parseObject(jsonData,ResponseDo.class);
        if (loginInformation.getCode().equals("0000")){
            SharedPreferences preferences = getSharedPreferences("userId", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            UserDO userDO =JSONObject.parseObject(loginInformation.getResult(),UserDO.class);
            editor.putString("userId",userDO.getid().toString());
            editor.apply();
            //登入后传递个人数据到碎片
            Person2Fragment discoverFragment = new Person2Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("user", loginInformation.getResult());
            discoverFragment.setArguments(bundle);
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            replaceFragment(new Person2Fragment());
        }else{
            new Handler(Looper.getMainLooper()).post(() -> Toast.makeText(this, loginInformation.getDescription(), Toast.LENGTH_LONG).show());
            throw new RuntimeException(loginInformation.getDescription());
        }
    }
}
