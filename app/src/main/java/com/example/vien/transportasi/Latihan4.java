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


public class Latihan4  extends Activity {

    ImageView benar, salah, soal;
    ImageView piliha, pilihb, pilihc, pilihd;
    TextView nilai1;
    int nilai;
    MediaPlayer tombol, tombol1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal);
        tombol = MediaPlayer.create(this, R.raw.tombol);
        tombol1 = MediaPlayer.create(this, R.raw.wrong);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        nilai = getIntent().getIntExtra("nilaiS", 0);
        soal = (ImageView) findViewById(R.id.soala);
        soal.setImageResource(R.drawable.soal44);
        piliha = (ImageView) findViewById(R.id.piliha);
        piliha.setImageResource(R.drawable.pesawat);
        pilihb = (ImageView) findViewById(R.id.pilihb);
        pilihb.setImageResource(R.drawable.becak);
        pilihc = (ImageView) findViewById(R.id.pilihc);
        pilihc.setImageResource(R.drawable.bajaj);
        pilihd = (ImageView) findViewById(R.id.pilihd);
        pilihd.setImageResource(R.drawable.dayung);
        benar = (ImageView) findViewById(R.id.benar);
        salah = (ImageView) findViewById(R.id.salah);
        nilai1 = (TextView) findViewById(R.id.nil);
        nilai1.setText(String.valueOf(nilai));
    }

    public void piliha(View v){
        tombol.start();
        nilai=nilai+1;
        benar.setVisibility(View.VISIBLE);
        Latihan4.this.finish();
        Intent latih = new Intent(Latihan4.this, Latihan5.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihb(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan4.this.finish();
        Intent latih = new Intent(Latihan4.this, Latihan5.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihc(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan4.this.finish();
        Intent latih = new Intent(Latihan4.this, Latihan5.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
    public void pilihd(View v){
        tombol1.start();
        salah.setVisibility(View.VISIBLE);
        Latihan4.this.finish();
        Intent latih = new Intent(Latihan4.this, Latihan5.class);
        latih.putExtra("nilaiS", nilai);
        startActivity(latih);
    }
}
