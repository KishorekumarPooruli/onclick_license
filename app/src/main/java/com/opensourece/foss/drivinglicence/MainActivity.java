package com.opensourece.foss.drivinglicence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        setContentView(R.layout.activity_main);
        OnClickButton();
        OnClickButton1();
        OnClickButton2();
        OnClickButton3();
        OnClickButton4();
        OnClickButton8();
    }
    //-----------Activity2-----------//
    public void OnClickButton()
    {
        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main2Activity");
                startActivity(i);
            }
        });
    }
    //----------------Activity 3----//
    public void OnClickButton1()
    {
        b2 = (Button)findViewById(R.id.button10);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main3Activity");
                startActivity(i);
            }
        });
    }
    //---------------Activity4------------//
    public void OnClickButton2()
    {
        b3 = (Button)findViewById(R.id.button11);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main4Activity");
                startActivity(i);
            }
        });
    }
    //------------------------Activity5---------//
    public void OnClickButton3()
    {
        b4 = (Button)findViewById(R.id.button19);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main5Activity");
                startActivity(i);
            }
        });
    }
    //-----------------Activity6-----------------//
    public void OnClickButton4()
    {
        b5 = (Button)findViewById(R.id.button20);
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main6Activity");
                startActivity(i);
            }
        });
    }
    //-------------------ABOUT--------------------------//
    public void OnClickButton8()
    {
        b8 = (Button)findViewById(R.id.button2);
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i =new Intent("com.opensourece.foss.drivinglicence.Main7aboutActivity");
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuitem,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.feedback:
                Toast.makeText(MainActivity.this,"Feedback Form",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, EmailactivityActivity.class));
                break;
            case R.id.info:

                Intent intent = new Intent(getApplicationContext(),appinfo.class);
                startActivity(intent);
                break;

            case R.id.exit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                break;
            case R.id.credit:
                Toast.makeText(MainActivity.this,"Credits",Toast.LENGTH_LONG).show();

                startActivity(new Intent(this,Main7aboutActivity.class));
                break;


        }
        return super.onOptionsItemSelected(item);

    }




}
