package com.kishor.attendancesys;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;




public class MainActivity extends AppCompatActivity{
    private ImageView analysisImage, vdioclipImage,playerCard,merchCard,contactCard,aboutCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analysisImage = findViewById(R.id.analyticsImage);
        vdioclipImage = findViewById(R.id.videoclipImage);
        playerCard = findViewById(R.id.playersImage);
        merchCard = findViewById(R.id.merchImage);
        contactCard = findViewById(R.id.contactImage);
        aboutCard = findViewById(R.id.aboutusImage);

        analysisImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnalyticsActivity.class);
                startActivity(intent);
            }
        });
        vdioclipImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(MainActivity.this, VideoSplash.class);
                startActivity(intentt);

            }
        });
        playerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttt = new Intent(MainActivity.this, PlayerCard.class);
                startActivity(intenttt);
            }
        });
        merchCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentttt = new Intent(MainActivity.this, Merchandise.class);
                startActivity(intentttt);
            }
        });

        contactCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ConCard.class);
                startActivity(i);
            }
        });

        aboutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(MainActivity.this, aboutUs.class);
                startActivity(ii);
            }
        });
    }

}
