package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mock Test");

    }
    public void mock(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://parivahan.gov.in/sarathiservice/stalllogin.do"));
        startActivity(googleIntent);
    }
    public void online(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://driving-tests.in/"));
        startActivity(googleIntent);
    }
    public void sample(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservice/pdf/STALL_QB_ENGLISH_NEW.pdf"));
        startActivity(googleIntent);
    }



}
