package com.asciimovie.drxzt.elderlyassistant.activity.Coummunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_service);
        button1 = findViewById(R.id.btn_back);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_back:
                Intent intent1 = new Intent(ServiceActivity.this, CommunityActivity.class);
                startActivity(intent1);
        }
    }
}
