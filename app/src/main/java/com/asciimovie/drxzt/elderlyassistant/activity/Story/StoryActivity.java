package com.asciimovie.drxzt.elderlyassistant.activity.Story;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.Coummunity.CommunityActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.Coummunity.VolunteerActivity;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class StoryActivity extends AppCompatActivity implements View.OnClickListener{
    View view;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        view=findViewById(R.id.view_1);
        button=findViewById(R.id.btn_back);

        view.setOnClickListener(this);
        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_back:
                Intent intent = new Intent(StoryActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.view_1:
                Intent intent1 = new Intent(StoryActivity.this, Stroy2Activity.class);
                startActivity(intent1);
                break;
        }

    }
}
