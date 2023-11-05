package com.example.lab1_io;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign items in display(activity_main.xml) into a variable.
        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
    }
    public void displayText(View view){
        tvMessage.setText("Welcome to ICT602 OCT 2023");
    }

    public void testingFunction(View view){
        //this is a new function
        //membazir function
    }


}