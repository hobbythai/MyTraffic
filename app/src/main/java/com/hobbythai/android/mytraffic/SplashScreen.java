package com.hobbythai.android.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //sound effect
        MediaPlayer introMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_start_horse);
        introMediaPlayer.start();

        //auto run to main activity
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent objIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(objIntent);
                finish();
            }
        },6000); //delay 6s call back

    }//on create

}//main
