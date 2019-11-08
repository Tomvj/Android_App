package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Confrimation_Act extends AppCompatActivity {
    TextView tv0,tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confrimation_);
        tv0=(TextView)findViewById(R.id.txtview0);
        tv1=(TextView)findViewById(R.id.txtview1);
        tv2=(TextView)findViewById(R.id.txtview2);
        tv3=(TextView)findViewById(R.id.txtview3);
        tv0.setText("User Name: "+getIntent().getStringExtra("usname"));
        tv1.setText(getIntent().getStringExtra("dateid"));
        tv2.setText(getIntent().getStringExtra("timeid"));
        tv3.setText(getIntent().getStringExtra("hourid"));
    }
}
