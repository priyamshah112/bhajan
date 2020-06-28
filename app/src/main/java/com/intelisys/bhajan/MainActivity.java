package com.intelisys.bhajan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
            },SPLASH_TIME_OUT);
        //hideNavigator();
    }
//    private void hideNavigator(){
//        this.getWindow().getDecorView()
//            .setSystemUiVisibility(
//                    View.SYSTEM_UI_FLAG_FULLSCREEN |
//                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
//                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
//                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
//                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
//                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//            );
//    }
}
