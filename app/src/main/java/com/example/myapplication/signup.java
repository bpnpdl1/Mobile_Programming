package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.setting) {
            Toast.makeText(this,"Setting Clicked",Toast.LENGTH_SHORT).show();

        } else if (item.getItemId() == R.id.logout) {
            Toast.makeText(this,"Logout Clicked",Toast.LENGTH_SHORT).show();



        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnsignin=  findViewById(R.id.btnsignin);

        Button btnsignup=findViewById(R.id.btnsignup);

        EditText etUsername=findViewById(R.id.etUsername);
        EditText etAddress=findViewById(R.id.etAddress);
        EditText etContact=findViewById(R.id.etContact);
        EditText etEmail= findViewById(R.id.etEmail);
        EditText etDob=findViewById(R.id.etDob);

        RadioGroup rgGender=findViewById(R.id.rgGender);
        RadioButton rbMale =findViewById(R.id.rbMale);
        RadioButton rbFemale =findViewById(R.id.rbFemale);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(signup.this,Signin.class);
                startActivity(i);
            }
        });

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(signup.this,ProfileActivity.class);
                i.putExtra("Username",etUsername.getText().toString());
                i.putExtra("Email",etEmail.getText().toString());
                i.putExtra("Address",etAddress.getText().toString());
                i.putExtra("Contact",etContact.getText().toString());
                i.putExtra("Dob",etDob.getText().toString());





                int selectedGenderId = rgGender.getCheckedRadioButtonId();
                if (selectedGenderId == R.id.rbMale) {
                    i.putExtra("Gender","Male");
                } else if (selectedGenderId == R.id.rbFemale) {


                    i.putExtra("Gender","Female");
                }



                startActivity(i);


            }
        });





    }
}