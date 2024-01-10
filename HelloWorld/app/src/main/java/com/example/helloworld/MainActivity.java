package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView text;
    private int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        text = (TextView) findViewById(R.id.after_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText("Login is Clicked: "+count);
                count = count+1;
                if(count>10){
                    count = 1;
                }
            }
        });
    }

}