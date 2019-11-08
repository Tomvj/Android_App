package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {
    TextView txtview;
    ImageView court1,court2,court3,court4;
    String info=null;
    String username=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage2);
//        txtview=(TextView)findViewById(R.id.textview2);
//        txtview.setText(getIntent().getStringExtra("name") +" Start to Play");
        username=getIntent().getStringExtra("name");
        //System.out.println("Name is:"+name);
        court1=findViewById(R.id.courtbtn1);
        court2=findViewById(R.id.courtbtn2);
        court3=findViewById(R.id.courtbtn3);
        court4=findViewById(R.id.courtbtn4);

    }

    public void Goto(View view) {

        switch(view.getId()) {
            case R.id.courtbtn1:
                info = "Court 1 ";
                break;

            case R.id.courtbtn2:
                info = "Court 2  ";
                break;

            case R.id.courtbtn3:
                info = "Court 3  ";
                break;

            case R.id.courtbtn4:
                info = "Court 4  ";
                break;

                default: ;
        }
        Intent intent = new Intent(this, PickEvent.class);
        intent.putExtra("send", info);
        intent.putExtra("uname",username);
        startActivity(intent);

    }
}

