package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Student_Reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__reg);
    }

    public void success_reg(View view) {
        Intent intent = new Intent(this,Joined_Act.class);
        String news ="Practise Session will starts tomorrow 6-AM";
        intent.putExtra("data",news);
        startActivity(intent);
    }
}
