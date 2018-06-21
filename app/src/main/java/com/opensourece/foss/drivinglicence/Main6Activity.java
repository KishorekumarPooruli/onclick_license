package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Conductor License");

    }
    public void cond(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/NewCLHome.do "));
        startActivity(googleIntent);
    }
    public void condservice(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/displayCLServices.do"));
        startActivity(googleIntent);
    }

}
