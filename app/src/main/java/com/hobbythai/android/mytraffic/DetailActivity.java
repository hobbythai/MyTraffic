package com.hobbythai.android.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bind widget
        bindWidget();

        //set widget
        showView();


    }//on create

    public void clickBack(View view) {

        finish();

    }//click back

    private void showView() {

        //receive data from intent
        String strTitle = getIntent().getStringExtra("title");
        int intImage = getIntent().getIntExtra("image", R.drawable.traffic_01); //if can't get default after ,
        int intIndex = getIntent().getIntExtra("index", 0);

        //title, image
        titleTextView.setText(strTitle);
        trafficImageView.setImageResource(intImage);

        //show detail from detail.xml
        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailStrings[intIndex]);

    }//show view

    private void bindWidget() {

        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

    }//bind widget

}//main
