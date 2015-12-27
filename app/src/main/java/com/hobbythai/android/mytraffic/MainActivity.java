package com.hobbythai.android.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        bindWidget();

        //set widget
        setWidget();

        //list view
        listViewControl();

    }//on create


    private void listViewControl() {

    }//list view control

    private void setWidget() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"OK", Toast.LENGTH_SHORT).show();

                //sound effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog); //get base internal mem
                buttonMediaPlayer.start();

                //intent web
                Intent objIntent = new Intent(Intent.ACTION_VIEW); //action view chang to Call or Sms
                objIntent.setData(Uri.parse("https://youtu.be/2sdaSv3HBUU"));
                startActivity(objIntent);

            }
        });

    }//set widget

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }//bind widget

}//main
