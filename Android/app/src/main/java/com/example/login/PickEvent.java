package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.Printer;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class PickEvent extends AppCompatActivity {
    Button datebtn;
    TextView dateview,timeview,courtview;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    int Hour =1;
    String username=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_event);
        username=getIntent().getStringExtra("uname");
        courtview=(TextView)findViewById(R.id.ReceiveCourt);
        courtview.setText(getIntent().getStringExtra("send")+ "is Selected");
        courtview.setText(getIntent().getStringExtra("send")+ "is Selected");
        courtview.setText(getIntent().getStringExtra("send")+ "is Selected");
        courtview.setText(getIntent().getStringExtra("send")+ "is Selected");
        b1=(Button)findViewById(R.id.tbtn1);
        b2=(Button)findViewById(R.id.tbtn2);
        b3=(Button)findViewById(R.id.tbtn3);
        b4=(Button)findViewById(R.id.tbtn4);
        b5=(Button)findViewById(R.id.tbtn5);
        b6=(Button)findViewById(R.id.tbtn6);
        b7=(Button)findViewById(R.id.tbtn7);
        b8=(Button)findViewById(R.id.tbtn8);
        b9=(Button)findViewById(R.id.tbtn9);
        b10=(Button)findViewById(R.id.tbtn10);
       // bookbtn=findViewById(R.id.bookcourt);
        datebtn=findViewById(R.id.datebutton);
        dateview=findViewById(R.id.datetextview);
        datebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pickadate();
            }
        });
    }

    private void Pickadate() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                //String Date = date+"-"+month+"-"+year;
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,date);
                CharSequence Date = DateFormat.format("MMM d, yyyy",calendar);
                dateview.setText("Selected Date: "+Date);

            }
        },year,month,date);
        datePickerDialog.show();
    }
    public void book(View view) {

        String dateselected = dateview.getText().toString();
        String timeselected=null;
        String hour=null;
        switch (view.getId()){
            case R.id.tbtn1:
                //Hour++;
                timeselected ="Time Slots: 5-6 AM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,  +Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn2:
                timeselected ="Time Slots: 6-7 AM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"6-7 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn3:
                timeselected ="Time Slots: 7-8 AM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"7-8 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn4:
                timeselected ="Time Slots: 8-9 AM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"8-9 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn5:
                timeselected ="Time Slots: 4-5 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"4-5 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn6:
                timeselected ="Time Slots: 5-6 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"5-6 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn7:
                timeselected ="Time Slots: 6-7 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"6-7 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn8:
                timeselected ="Time Slots: 7-8 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"7-8 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn9:
                timeselected ="Time Slots: 8-9 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"8-9 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tbtn10:
                timeselected ="Time Slots: 9-10 PM";
                hour ="Duration:  " +Hour+" Hour";
                Toast.makeText(this,"9-10 slot is Picked "+Hour+" Hour is Added",Toast.LENGTH_SHORT).show();
                break;
        }
        Intent intent = new Intent(this,Confrimation_Act.class);
        intent.putExtra("dateid",dateselected);
        intent.putExtra("timeid",timeselected);
        intent.putExtra("hourid",hour);
        intent.putExtra("usname",username);
        startActivity(intent);
    }
}


