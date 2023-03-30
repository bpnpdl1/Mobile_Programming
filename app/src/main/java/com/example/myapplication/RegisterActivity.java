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

public class RegisterActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        Button btRegister=findViewById(R.id.btRegister);

        EditText etUsername=findViewById(R.id.etUsername);
        EditText etAddress=findViewById(R.id.etAddress);
        EditText etDob=findViewById(R.id.etDob);

        RadioGroup rgGender=findViewById(R.id.rgGender);
        RadioButton rbMale =findViewById(R.id.rbMale);
        RadioButton rbFemale =findViewById(R.id.rbFemale);



        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(RegisterActivity.this,ShowActivity.class);
                i.putExtra("Username",etUsername.getText().toString());
                i.putExtra("Address",etAddress.getText().toString());
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