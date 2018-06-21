package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Docx Upload/Status");
    }
    public void upload(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/uploadMain.do\n "));
        startActivity(googleIntent);
    }
    public void viewapp(View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/viewDocuments.do\n"));
        startActivity(googleIntent);
    }
    public void appli (View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/applViewStatus.do "));
        startActivity(googleIntent);
    }
    public void printllr (View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/printlearerslicenceinstruction.do "));
        startActivity(googleIntent);
    }
    public void rto (View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tnsta.gov.in/transport/know_RtoLoad.do "));
        startActivity(googleIntent);
    }
    public void printform (View view) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parivahan.gov.in/sarathiservicecov5/printform.do "));
        startActivity(googleIntent);
    }




}
