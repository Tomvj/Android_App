package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup_form extends AppCompatActivity {
    Button button;
    EditText txt_name, txt_mail, txt_number, txt_password;
    RadioButton male, female;
    DatabaseReference myRef;
    String data = null;
    private FirebaseAuth mAuth;
    DatabaseReference databaseReference;
    String gender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        //getSupportActionBar().setTitle("Sign Up");
        txt_name = findViewById(R.id.name);
        txt_mail = findViewById(R.id.mailid);
        txt_number = findViewById(R.id.number);
        txt_password = findViewById(R.id.password);
        male = findViewById(R.id.mbtn);
        female = findViewById(R.id.fbtn);

        databaseReference = FirebaseDatabase.getInstance().getReference("UserDetails");
        mAuth = FirebaseAuth.getInstance();

        button = findViewById(R.id.continuebutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = txt_name.getText().toString();
                final String email = txt_mail.getText().toString();
                final String phno = txt_number.getText().toString();
                String password = txt_password.getText().toString();

                //Gender Selection
                if (male.isChecked()) {
                    gender = "Male";
                }
                if (female.isChecked()) {
                    gender = "Female";
                }
                //Data Casting
                if (TextUtils.isEmpty(username)) {
                    txt_name.setError("Username is required");
                    txt_name.requestFocus();
                }
                if (TextUtils.isEmpty(email)) {
                    txt_mail.setError("Email is Required");
                    txt_mail.requestFocus();
                }
                mAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(Signup_form.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    //Details Intialize
                                    UserDetails userDetails = new UserDetails(
                                            username, email, phno, gender);

                                    //Firebase Connectivity
                                    FirebaseDatabase.getInstance().getReference("UserDetails")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(userDetails).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            Toast.makeText(Signup_form.this, "Registerd Successfully", Toast.LENGTH_SHORT).show();
                                            startActivity(new Intent(getApplicationContext(), Select_Option.class));
                                        }
                                    });
                                } else {
                                    Toast.makeText(Signup_form.this, "Please try again Later", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });
            }
        });
    }
}
