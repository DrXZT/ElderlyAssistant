package com.asciimovie.drxzt.elderlyassistant.activity.Coummunity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class VolunteerActivity extends AppCompatActivity implements View.OnClickListener {

    private View view_star;
    private View view_back;
    private ImageView ivStar;

    private int choose=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_volunteer);

        view_star=findViewById(R.id.view_star);
        view_back=findViewById(R.id.view_back);
        ivStar=findViewById(R.id.iv_star);

        view_back.setOnClickListener(this);
        view_star.setOnClickListener(this);
        ivStar.setSelected(false);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.view_star: {
                if (choose == 0) {
                    ivStar.setSelected(true);
                    choose = 1;
                } else {
                    ivStar.setSelected(false);
                    choose = 0;
                }
                break;
            }
            case R.id.view_back:{
                Intent intent = new Intent(VolunteerActivity.this, CommunityActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
