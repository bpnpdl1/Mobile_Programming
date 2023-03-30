package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        TextView tvInfo=findViewById(R.id.tvinfo);

        String Username=getIntent().getStringExtra("Username");
        String Address=getIntent().getStringExtra("Address");
        String Dob=getIntent().getStringExtra("Dob");
        String Gender=getIntent().getStringExtra("Gender");

        tvInfo.setText("Username: "+Username +" \n Address: "+Address +" \n DOB: "+Dob +" \n Gender: "+Gender );


    }
}