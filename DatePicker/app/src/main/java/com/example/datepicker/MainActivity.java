package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button btn;
    private DatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text =(TextView) findViewById(R.id.currentDate);
        btn = (Button) findViewById(R.id.dateBtn);
        date = (DatePicker) findViewById(R.id.datePicker);

        text.setText(currentDate());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(currentDate());
            }
        });
    }
    String currentDate(){
        StringBuilder s = new StringBuilder();
        s.append(date.getDayOfMonth()+"/");
        s.append((date.getMonth()+1)+"/");
        s.append(date.getYear());

        return s.toString();
    }
}