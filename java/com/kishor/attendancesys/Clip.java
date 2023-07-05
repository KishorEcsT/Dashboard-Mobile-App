package com.kishor.attendancesys;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Clip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        VideoView vdioView = (VideoView) findViewById(R.id.videoView);
        vdioView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vdiobgmiii));

        MediaController mediaController = new MediaController(this);
        vdioView.setMediaController(mediaController);
        vdioView.start();
    }
}