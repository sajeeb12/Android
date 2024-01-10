package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView first,sec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (ImageView) findViewById(R.id.id1);
        sec = (ImageView) findViewById(R.id.id2);

        first.setOnClickListener(this);
        sec.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.id1){
            Toast.makeText(this, "Mostafiz is clicked", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Sajeeb is clicked", Toast.LENGTH_SHORT).show();
        }
    }
}