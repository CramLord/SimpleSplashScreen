package com.example.danes.logininterface;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            Handler handler = new Handler();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this,DashboardActivity.class);
                    startActivity(intent);
                    finish();
                }
            };
                int delayInMillis = 2000;
                handler.postDelayed(runnable,delayInMillis);
    }

}
