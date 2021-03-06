package com.asciimovie.drxzt.elderlyassistant.activity.main;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.base.BaseActivity;
import com.asciimovie.drxzt.elderlyassistant.fragment.CallFragment;
import com.asciimovie.drxzt.elderlyassistant.fragment.MainFragment;
import com.asciimovie.drxzt.elderlyassistant.fragment.MessageFragment;
import com.asciimovie.drxzt.elderlyassistant.fragment.Person2Fragment;
import com.asciimovie.drxzt.elderlyassistant.fragment.PersonFragment;



public class MainActivity extends BaseActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.main_tab);
        button2 = findViewById(R.id.call_tab);
        button3 = findViewById(R.id.message_tab);
        button4 = findViewById(R.id.person_tab);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        replaceFragment(new MainFragment());









    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_tab:
                replaceFragment(new MainFragment());
                break;
            case R.id.call_tab:
//                replaceFragment(new CallFragment());
                Intent dialIntent =  new Intent(Intent.ACTION_CALL_BUTTON);//跳转到拨号界面
                startActivity(dialIntent);
                break;
            case R.id.message_tab:
//                replaceFragment(new MessageFragment());
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:10086"));
                intent.putExtra("sms_body","The SMS text");
                startActivity(intent);
                break;
            case R.id.person_tab:
                if(sure==1){
                    replaceFragment(new Person2Fragment());

                }else{
                    replaceFragment(new PersonFragment());

                }
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
