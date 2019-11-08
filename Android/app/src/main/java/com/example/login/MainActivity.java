package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setTitle("Welcome");
        Log.d("IN","onCreate");
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });
    }

    public void openActivity2() {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("IN","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("IN","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("IN","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("IN","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("IN","onDestroy");
    }
    public void display(View view) {
        Intent i= new Intent(this,Signup_form.class);
        startActivity(i);
    }
}
