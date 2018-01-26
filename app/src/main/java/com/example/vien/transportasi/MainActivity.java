package com.example.vien.transportasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {
    private ImageButton pindah;
    private ImageButton pindahKuis;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
        mp.start();


        pindah = (ImageButton) findViewById(R.id.imagemulai);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, PilihActivity.class);
                startActivity(intent);
                finish();
                mp.stop();


            }
        });
        pindahKuis = (ImageButton) findViewById(R.id.imagekuis);
        pindahKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, Latihan.class);
                startActivity(intent);
                finish();
                mp.stop();


            }
        });

        pindahKuis = (ImageButton) findViewById(R.id.imageinformasi);
        pindahKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this, InformasiActivity.class);
                startActivity(intent);
                finish();
                mp.stop();

            }
        });




               pindah = (ImageButton) findViewById(R.id.imagekeluar);
                pindah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        suaraButton.start();
                        switch(v.getId()){

                            case R.id.imagekeluar:
                    exit();

		break;
                }
    }

                    public void onBackPressed() {
                        exit();

                    }
                    public void exit(){
                        AlertDialog.Builder alt_bld = new AlertDialog.Builder(MainActivity.this);
                        alt_bld.setMessage("Anda Yakin Ingin Keluar")
                                .setCancelable(false)
                                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // Action for 'Yes' Button
                                        System.exit(0);
                                    }
                                })
                                .setNegativeButton("Tidak", null);
                        AlertDialog alert = alt_bld.create();
                        alert.show();

    }
})


    ;}
};