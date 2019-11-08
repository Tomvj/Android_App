package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Select_Option extends AppCompatActivity {
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__option);
        tv=findViewById(R.id.txtview);
        tv.setText(getIntent().getStringExtra("name"));
    }

    public void toHome(View view) {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }

    public void gotostudent(View view) {
        Intent intent = new Intent(this,Batch_Schedule.class);
        startActivity(intent);
    }
}
