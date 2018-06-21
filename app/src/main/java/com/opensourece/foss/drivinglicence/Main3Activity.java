package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    private  Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        OnClickButton5();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Learner License");
    }

    public void LLR(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/newLLDet.do "));
        startActivity(googleIntent);
    }
    public void service(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/displayLLServices.do "));
        startActivity(googleIntent);
    }
    public void OnClickButton5()
    {
        b6 = (Button)findViewById(R.id.button4);
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main7noteActivity");
                startActivity(i);
            }
        });
    }

}
