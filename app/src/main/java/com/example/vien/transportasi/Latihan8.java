package com.example.vien.transportasi;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Latihan8 extends Activity {
    MediaPlayer tombol, tombol1;
    ImageView benar, salah, soal;
    ImageView piliha, pilihb, pilihc, pilihd;
    TextView nilai1;
    int nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tombol = MediaPlayer.create(this, R.raw.tombol);
        tombol1 = MediaPlayer.create(this, R.raw.wrong);
        nilai = getIntent().getIntExtra("nilaiS", 0);
        soal = (ImageView) findViewById(R.id.soala);
        soal.setImageResource(R.drawable.soal88);
        piliha = (ImageView) findViewById(R.id.piliha);
        piliha.setImageResource(R.drawable.becak);
        pilihb = (ImageView) findViewById(R.id.pilihb);
        pilihb.setImageResource(R.drawable.zep);
        pilihc = (ImageView) findViewById(R.id.pilihc);
        pilihc.setImageResource(R.drawable.skut);
        pilihd = (ImageView) findViewById(R.id.pilihd);
        pilihd.setImageResource(R.drawable.balon);
        benar = (ImageView) findViewById(R.id.benar);
        salah = (ImageView) findViewById(R.id.salah);
        nilai1 = (TextView) findViewById(R.id.nil);
        nilai1.setText(String.valueOf(nilai));
    }

    public void piliha(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan8.this.finish();
        Intent latih = new Intent(Latihan8.this, Latihan9.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihb(View v){
        tombol.start();
        nilai=nilai+1;
        benar.setVisibility(View.VISIBLE);
        Latihan8.this.finish();
        Intent latih = new Intent(Latihan8.this, Latihan9.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihc(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan8.this.finish();
        Intent latih = new Intent(Latihan8.this, Latihan9.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihd(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan8.this.finish();
        Intent latih = new Intent(Latihan8.this, Latihan9.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
}
