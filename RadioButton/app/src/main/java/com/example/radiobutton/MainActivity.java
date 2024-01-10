package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private RadioGroup radioGroup;
    private RadioButton gender;
    private TextView textRes;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.showBtn);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        
        textRes = (TextView) findViewById(R.id.textRes);

        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(selectedId);
                textRes.setText(gender.getText().toString() + " is Selected");
            }
        });

    }
}