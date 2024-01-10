package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button inc,dec,res;
    private TextView textVal;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inc = (Button) findViewById(R.id.increase);
        dec = (Button) findViewById(R.id.decrease);
        res = (Button) findViewById(R.id.reset);
        textVal = (TextView) findViewById(R.id.text_value);

        Handler handle = new Handler();
        inc.setOnClickListener(handle);
        dec.setOnClickListener(handle);
        res.setOnClickListener(handle);



//        inc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count++;
//                textVal.setText(Integer.toString(count));
//
//            }
//        });
//
//        dec.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count--;
//                textVal.setText(Integer.toString(count));
//
//            }
//        });
//        res.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                count = 0;
//                textVal.setText(Integer.toString(count));
//            }
//        });
    }
    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.increase){
                count++;
                textVal.setText(Integer.toString(count));
//                Log.d("tag","something");
            }
            else if(view.getId()==R.id.decrease){
                count--;
                textVal.setText(Integer.toString(count));
            }
            else{
                count = 0;
                textVal.setText(Integer.toString(count));
            }
        }
    }


}