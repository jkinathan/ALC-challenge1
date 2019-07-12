package com.example.alc1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");
        actionBar.setHomeButtonEnabled(true);


    }
}
