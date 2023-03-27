package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        EditText ettxt= findViewById(R.id.txtmessage);
        Button btnShare=findViewById(R.id.btnshare);
        Button btnClear=findViewById(R.id.btclear);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ettxt.setText("");

            }
        });

       btnShare.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(Intent.ACTION_SEND);
               i.putExtra(Intent.EXTRA_TEXT,btnShare.getText().toString());
               i.setType("text/plain");
               startActivity(i);
           }
       });


    }
}