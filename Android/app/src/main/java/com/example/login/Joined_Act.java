package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Joined_Act extends AppCompatActivity {
 TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joined_);
        tv=(TextView)findViewById(R.id.txtview_reg);
        tv.setText(getIntent().getStringExtra("data"));
        tv.setText(getIntent().getStringExtra("data"));
    }
}
