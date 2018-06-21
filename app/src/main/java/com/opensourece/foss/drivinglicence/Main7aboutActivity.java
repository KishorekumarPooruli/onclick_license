package com.opensourece.foss.drivinglicence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main7aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Credits");
    }
}
