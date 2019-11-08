package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView text;
    //String Username="Thomas";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1= (EditText)findViewById(R.id.mailid);
        ed2=(EditText)findViewById(R.id.password);
        text = (TextView)findViewById(R.id.t);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();

            }
        });
        //getSupportActionBar().setTitle("Login");
    }

    public void openActivity3() {
        Intent i = new Intent(this,Signup_form.class);
        startActivity(i);
    }

    public void Homepage(View view) {


        //System.out.println("Value of Value==="+value);
       // TextView getText=(TextView)ed.getText();

        String value = ed1.getText().toString();
        String Pass =ed2.getText().toString();
        //System.out.println("GetText"+getText);
        //if(value.equalsIgnoreCase("Thomas") && Pass.equals("12345")) {
            Intent i1 = new Intent(this, Select_Option.class);
            i1.putExtra("name", value);
            startActivity(i1);
        }
        //else{
          //  Toast.makeText(this,"Username  or Password is Incorrect..Please enter valid Username or Password",Toast.LENGTH_LONG).show();
        //}
    //}
}

