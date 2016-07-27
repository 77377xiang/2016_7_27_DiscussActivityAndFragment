package com.xiang.discussactivityandfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("sss","Activity-onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("sss","Activity-onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("sss","Activity-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("sss","Activity-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("sss","Activity-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("sss","Activity-onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("sss","Activity-onRestart");
    }

}
