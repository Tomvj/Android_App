package com.example.login;

import android.hardware.usb.UsbRequest;
import android.widget.EditText;

public class UserDetails {

    public String username;
    public String Email;
    public String phno;
    public String gender;

    public UserDetails(String username, String email, String phno, String gender) {
        this.username = username;
        Email = email;
        this.phno = phno;
        this.gender = gender;
    }

}
