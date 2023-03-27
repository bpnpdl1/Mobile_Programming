package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btMenu=findViewById(R.id.btMenu);
        registerForContextMenu(btMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.option1){
            Toast.makeText(this,"Copy is selected",Toast.LENGTH_SHORT).show();
        } else if (item.getItemId()==R.id.option2) {
            Toast.makeText(this,"Succesfully Pasted",Toast.LENGTH_SHORT).show();

        }
        return super.onContextItemSelected(item);
    }


}