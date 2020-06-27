package com.intelisys.bhajan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlaySong extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    //https://android-coffee.com/how-to-make-simple-music-player-in-android-studio/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        mediaPlayer= MediaPlayer.create(this, R.raw.justatry);
        ImageButton playButton = (ImageButton) findViewById(R.id.start);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(PlaySong.this, "The Song is Over", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        ImageButton pauseButton = (ImageButton) findViewById(R.id.stop);

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}
