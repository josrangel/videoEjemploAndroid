package com.josrangel.videoejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView video,video2,video3;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = findViewById(R.id.videoView2);
        video.setMediaController(new MediaController(this));
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.daftpunk);
        video.start();

        /*video2 = findViewById(R.id.videoView3);
        video2.setMediaController(new MediaController(this));
        video2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.dualipa);
        video2.start();

        video3 = findViewById(R.id.videoView4);
        video3.setMediaController(new MediaController(this));
        video3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.eminem);
        video3.start();*/

    }
}