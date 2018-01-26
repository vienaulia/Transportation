package com.example.vien.transportasi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TlautActivity extends AppCompatActivity {
    ImageButton pindah;
    ImageButton show;
    ImageButton hide;
    ImageView Tampilgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tlaut);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        final MediaPlayer suaraButton1 = MediaPlayer.create(this, R.raw.dayung3);
        final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.kapaluap3);
        final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.layar3);
        final MediaPlayer suaraButton4 = MediaPlayer.create(this, R.raw.perahum3);
        final MediaPlayer suaraButton5 = MediaPlayer.create(this, R.raw.pesiar3);
        final MediaPlayer suaraButton6 = MediaPlayer.create(this, R.raw.selam3);


        Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
        show = (ImageButton) findViewById(R.id.imagedayung);
        show = (ImageButton) findViewById(R.id.imagekapaluap);
        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.amin_scale);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tampilgambar.setVisibility(View.VISIBLE);
            }
        });


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tampilgambar.setVisibility(View.INVISIBLE);
            }
        });



        pindah = (ImageButton) findViewById(R.id.imagebackud);
        pindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                suaraButton.start();
                Intent intent = new Intent(TlautActivity.this,PilihActivity.class);
                startActivity(intent);
                finish();
            }
        } );


        ImageButton Buttonsuara21 = (ImageButton) this.findViewById(R.id.imagedayung);
        Buttonsuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Tampilgambar.setImageResource(R.drawable.dayung1);
                Tampilgambar.startAnimation(animScale);

                suaraButton1.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PdayungActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });

        ImageButton Buttonsuara22 = (ImageButton) this.findViewById(R.id.imagekapaluap);
        Buttonsuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.kapaluap1);
                Tampilgambar.startAnimation(animScale);
                suaraButton2.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PkapaluapActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara23 = (ImageButton) this.findViewById(R.id.imagelayar);
        Buttonsuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.layar1);
                Tampilgambar.startAnimation(animScale);
                suaraButton3.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PlayarActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });

        ImageButton Buttonsuara24 = (ImageButton) this.findViewById(R.id.imageperahum);
        Buttonsuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.perahum1);
                Tampilgambar.startAnimation(animScale);
                suaraButton4.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PperahumActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara25= (ImageButton) this.findViewById(R.id.imagepesiar);
        Buttonsuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.pesiar1);
                Tampilgambar.startAnimation(animScale);
                suaraButton5.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PpesiarActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara26= (ImageButton) this.findViewById(R.id.imageselam);
        Buttonsuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.selam1);
                Tampilgambar.startAnimation(animScale);
                suaraButton6.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagedayung1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TlautActivity.this,PselamActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
    }
}
