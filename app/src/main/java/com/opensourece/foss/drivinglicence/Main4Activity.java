package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        OnClickButton6();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Driving License");
    }
    public void DR(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/newDLDet.do "));
        startActivity(googleIntent);
    }
    public void serviceDR(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/dlServicesDet.do "));
        startActivity(googleIntent);
    }
    public void OnClickButton6()
    {
        b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main7noteActivity");
                startActivity(i);
            }
        });
    }
}
