package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox ct1,ct2,ct3;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ct1=(CheckBox)findViewById(R.id.c1);
        ct2=(CheckBox)findViewById(R.id.c2);
        ct3=(CheckBox)findViewById(R.id.c3);
        et1=(EditText)findViewById(R.id.e1);
    }
    public void onUG(View v)
    {
        if(ct3.isChecked()) {

            ct1.setChecked(true);
            ct2.setChecked(true);
            String str = "SSLC" + "12th" + "PG";
            et1.setText(str);
        }
        else
            {
            ct1.setChecked(false);
            ct2.setChecked(false);
            }

    }
    public void onHSE(View v)
    {
        if(ct2.isChecked()) {

            ct1.setChecked(true);
            ct3.setChecked(false);
        }
        else
        {
            ct1.setChecked(true);
            ct3.setChecked(false);
        }

    }
    public void onS(View v)
    {
        if(ct1.isChecked()) {

            ct2.setChecked(false);
            ct3.setChecked(false);
        }
        else
        {
            ct2.setChecked(false);
            ct3.setChecked(false);
        }

    }

}