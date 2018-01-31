package com.example.derren.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    public void onClick(View v){

        TextView tv = (TextView)findViewById(R.id.Output);
        String entry = (String)tv.getText();

        switch(v.getId()){

            case R.id.buttonAC:
                entry += "1";



        }

        tv.setText(entry);

    }


}
