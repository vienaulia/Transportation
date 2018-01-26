package com.example.vien.transportasi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class PilihActivity extends AppCompatActivity {
    ImageButton pindah;
MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        final MediaPlayer suaraButton1 = MediaPlayer.create(this, R.raw.transdarat);
        final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.translaut);
        final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.transudara);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

            pindah = (ImageButton) findViewById(R.id.imagedarat);
            pindah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton1.start();
                    Intent intent = new Intent(PilihActivity.this, TdaratActivity.class);
                    startActivity(intent);
                    finish();
                    mp.stop();
                }
            });

        pindah = (ImageButton) findViewById(R.id.imageudara);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton3.start();
                Intent intent = new Intent(PilihActivity.this, TrudaraActivity.class);
                startActivity(intent);
                finish();
                mp.stop();
            }
        });


        pindah = (ImageButton) findViewById(R.id.imagelaut);
            pindah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton2.start();
                    Intent intent = new Intent(PilihActivity.this, TlautActivity.class);
                    startActivity(intent);
                    finish();
                    mp.stop();
                }
            });


            pindah = (ImageButton) findViewById(R.id.imagebackud);
            pindah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    suaraButton.start();
                    Intent intent = new Intent(PilihActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    mp.stop();
                }
            });
        }
    }

