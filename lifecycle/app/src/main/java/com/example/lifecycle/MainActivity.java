package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","OnCreate()");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("lifecycle","OnStart()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("lifecycle","OnStop()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("lifecycle","OnPause()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("lifecycle","OnResume()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","OnDestroy()");
    }
}