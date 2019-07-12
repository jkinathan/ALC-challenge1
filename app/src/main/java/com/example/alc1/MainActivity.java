package com.example.alc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //so we locate the 1st button in main activity
        Button button1 = findViewById(R.id.aboutbtn);
        //then this for the 2nd button
        Button button2 = findViewById(R.id.myprofilebtn);

        //capture button1 click
        button1.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //then we start ActivityB.class
                Intent myIntent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(myIntent);// this then starts the activity

            }
        });

        //capture button2 profile click
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //then start the activity
                Intent myIntent = new Intent(MainActivity.this, ActivityC.class);
                startActivity(myIntent);//then start profile activity when button is clicked
            }
        });

    }
}
