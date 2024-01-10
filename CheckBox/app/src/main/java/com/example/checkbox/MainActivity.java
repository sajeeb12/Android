package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox milk,sugar,water;
    private Button showBtn;
    private TextView show;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milk = (CheckBox) findViewById(R.id.milk);
        sugar = (CheckBox) findViewById(R.id.sugar);
        water = (CheckBox) findViewById(R.id.water);

        showBtn = (Button) findViewById(R.id.showBtn);
        show = (TextView) findViewById(R.id.show);

        showBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        StringBuilder s = new StringBuilder();
        if(view.getId()==R.id.showBtn){
            if(milk.isChecked()){
                s.append("Milk is Selected\n");
            }
            if(sugar.isChecked()){
                s.append("Sugar is Selected\n");
            }
            if(water.isChecked()){
                s.append("Water is Selected");
            }
            show.setText(s.toString());
        }
    }
}