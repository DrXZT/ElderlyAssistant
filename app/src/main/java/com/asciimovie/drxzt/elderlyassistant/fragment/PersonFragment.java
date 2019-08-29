package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.user.LoginActivity;

public class PersonFragment extends Fragment implements View.OnClickListener  {

    Button button5;
    Button button6;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);



        button5 = view.findViewById(R.id.btn_head);
        button6 = view.findViewById(R.id.btn_head2);

        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_head:
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_head2:
                Intent intent2 = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent2);
                break;
        }

    }
}
