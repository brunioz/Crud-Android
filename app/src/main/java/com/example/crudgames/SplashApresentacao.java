package com.example.crudgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashApresentacao extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_apresentacao);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                    Intent i = new Intent(SplashApresentacao.this, Apresentacao.class);
                    startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

