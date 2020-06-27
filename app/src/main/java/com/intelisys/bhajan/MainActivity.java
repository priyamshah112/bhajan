package com.intelisys.bhajan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
            },SPLASH_TIME_OUT);
    }
}
