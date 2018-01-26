package com.example.vien.transportasi;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;

public class Latihan extends Activity {
    MediaPlayer tombol,tombol1;
    ImageView benar, salah;
    TextView nilai1;
    int nilai=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal);
        tombol = MediaPlayer.create(this, R.raw.tombol);
        tombol1 = MediaPlayer.create(this, R.raw.wrong);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        benar = (ImageView) findViewById(R.id.benar);
        salah = (ImageView) findViewById(R.id.salah);
        nilai1 = (TextView) findViewById(R.id.nil);
        nilai1.setText(String.valueOf(nilai));
    }

    public void piliha(View v){

        salah.setVisibility(View.VISIBLE);
        tombol1.start();
        Latihan.this.finish();
        Intent latih = new Intent(Latihan.this, Latihan2.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihb(View v){
        tombol.start();
        nilai=nilai+1;
        benar.setVisibility(View.VISIBLE);
        Latihan.this.finish();
        Intent latih = new Intent(Latihan.this, Latihan2.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihc(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan.this.finish();
        Intent latih = new Intent(Latihan.this, Latihan2.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihd(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan.this.finish();
        Intent latih = new Intent(Latihan.this, Latihan2.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
}
