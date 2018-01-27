package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // find the button and define its onClick behaviour


    public void setText(View v) {
        EditText text1 = findViewById(R.id.editText1);
        String theText = text1.getText().toString();
        System.out.println(theText);
        TextView textDisplay =  findViewById(R.id.textView);
        textDisplay.setText(theText);

    }

}
