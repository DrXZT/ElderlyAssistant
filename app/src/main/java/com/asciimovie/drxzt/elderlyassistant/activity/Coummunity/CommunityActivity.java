package com.asciimovie.drxzt.elderlyassistant.activity.Coummunity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
public class CommunityActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_community);
        Button button1 = findViewById(R.id.btn_volunteer);
        Button button2 = findViewById(R.id.btn_sale);
        Button button3 = findViewById(R.id.btn_service);
        Button button4 = findViewById(R.id.btn_festivals);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_volunteer:
                Intent intent1 = new Intent(CommunityActivity.this ,VolunteerActivity.class);
                startActivity(intent1);
            case R.id.btn_sale:
                Intent intent2 = new Intent(CommunityActivity.this, SaleActivity.class);
                startActivity(intent2);
            case R.id.btn_service:
                Intent intent3 = new Intent(CommunityActivity.this, ServiceActivity.class);
                startActivity(intent3);
            case R.id.btn_festivals:
                Intent intent4 = new Intent(CommunityActivity.this, FestivalsActivity.class);
                startActivity(intent4);

        }

    }
}
