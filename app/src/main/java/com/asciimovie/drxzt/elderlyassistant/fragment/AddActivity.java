package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.main.MainActivity;

public class AddActivity extends AppCompatActivity {

    EditText editText_note;
    Button button_commit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_list);

        editText_note = findViewById(R.id.et_note);
        button_commit = findViewById(R.id.btn_commit);

        button_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value_note = editText_note.getText().toString().trim();
                Note note= new Note(value_note);
                note.save();
                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
