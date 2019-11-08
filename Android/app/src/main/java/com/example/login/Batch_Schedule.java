package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Batch_Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch__schedule);
    }

    public void Register_student(View view) {
        Intent intent = new Intent(this,Student_Reg.class);
        startActivity(intent);
    }

    public void Weekend_student(View view) {
        Intent intent = new Intent(this,weekend_reg.class);
        startActivity(intent);
    }
}
