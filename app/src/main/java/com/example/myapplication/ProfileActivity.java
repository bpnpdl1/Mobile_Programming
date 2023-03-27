package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView tvUsername=findViewById(R.id.tvUsername);
        TextView tvAddress=findViewById(R.id.tvAddress);
        TextView tvContact=findViewById(R.id.tvContact);
        TextView tvEmail= findViewById(R.id.tvEmail);
        TextView tvDob=findViewById(R.id.tvDob);
        TextView tvGender=findViewById(R.id.tvGender);

        String Username=getIntent().getStringExtra("Username");
        tvUsername.setText("Username: "+Username);

        String Email=getIntent().getStringExtra("Email");
        tvEmail.setText("Email: "+Email);

        String Address=getIntent().getStringExtra("Address");
        tvAddress.setText("Address: "+Address);

        String Contact=getIntent().getStringExtra("Contact");
        tvContact.setText("Contact: "+Contact);

        String Dob=getIntent().getStringExtra("Dob");
        tvDob.setText("Dob: "+Dob);

        String gender=getIntent().getStringExtra("Gender");
        tvGender.setText("Gender: "+gender);



    }
}