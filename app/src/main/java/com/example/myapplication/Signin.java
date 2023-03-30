package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button btnsignup=findViewById(R.id.btnsignup);
        EditText etusername=  findViewById(R.id.etUsername);

        Button btnsignin=findViewById(R.id.btSignin);





        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Signin.this,signup.class);

                startActivity(i);
            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i=new Intent(Signin.this,HomeActivity.class);
                i.putExtra("NAME",etusername.getText().toString());
                startActivity(i);



            }
        });


    }
}