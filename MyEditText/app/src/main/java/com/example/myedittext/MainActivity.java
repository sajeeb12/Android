package com.example.myedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text1,text2;
    private Button addBtn,subBtn;
    private TextView res;
    private double value1,value2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.editText1);
        text2 = (EditText) findViewById(R.id.editText2);

        addBtn = (Button) findViewById(R.id.add);
        subBtn = (Button) findViewById(R.id.sub);

        res = (TextView) findViewById(R.id.res);



        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        try {
            value1 = Double.parseDouble(text1.getText().toString());
            value2 = Double.parseDouble(text2.getText().toString());
            if(view.getId()==R.id.add){

                result = value1 + value2;
                res.setText("Result is: "+result);
                text1.setText("");
                text2.setText("");
            }
            else{

                result = value1 - value2;
                res.setText("Result is: "+result);
                text1.setText("");
                text2.setText("");
            }


        }catch(Exception e){
//            res.setText("Enter Value Properly");
            Toast toast = Toast.makeText(this, "Enter Number Properly", Toast.LENGTH_SHORT);
            toast.show();

        }
        


    }
}