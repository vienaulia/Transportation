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

public class TdaratActivity extends AppCompatActivity {

    ImageButton pindah,show,hide;
    ImageView Tampilgambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdarat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        final MediaPlayer suaraButton1 = MediaPlayer.create(this, R.raw.ambulan3);
        final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.angkot3);
        final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.bajaj3);
        final MediaPlayer suaraButton4 = MediaPlayer.create(this, R.raw.becak3);
        final MediaPlayer suaraButton5 = MediaPlayer.create(this, R.raw.bus3);
        final MediaPlayer suaraButton6 = MediaPlayer.create(this, R.raw.delman3);
        final MediaPlayer suaraButton7 = MediaPlayer.create(this, R.raw.kereta3);
        final MediaPlayer suaraButton8 = MediaPlayer.create(this, R.raw.mobil3);
        final MediaPlayer suaraButton9 = MediaPlayer.create(this, R.raw.motorr);
        final MediaPlayer suaraButton10 = MediaPlayer.create(this, R.raw.sepeda3);
        final MediaPlayer suaraButton11 = MediaPlayer.create(this, R.raw.skut3);
        final MediaPlayer suaraButton12 = MediaPlayer.create(this, R.raw.taxi3);
        final MediaPlayer suaraButton13 = MediaPlayer.create(this, R.raw.truk3);


        Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
        show = (ImageButton) findViewById(R.id.imageambulance);
        show = (ImageButton) findViewById(R.id.imageangkot);
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
                Intent intent = new Intent(TdaratActivity.this,PilihActivity.class);
                startActivity(intent);
                finish();
            }
        } );

        ImageButton Buttonsuara = (ImageButton) this.findViewById(R.id.imageambulance);
        Buttonsuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.ambulan1);
                Tampilgambar.startAnimation(animScale);
                suaraButton1.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PambulansActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });

        ImageButton Buttonsuara2 = (ImageButton) this.findViewById(R.id.imageangkot);
        Buttonsuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.angkot1);
                Tampilgambar.startAnimation(animScale);
                suaraButton2.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PangkotActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara3 = (ImageButton) this.findViewById(R.id.imagebajaj);
        Buttonsuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.bajaj1);
                Tampilgambar.startAnimation(animScale);
                suaraButton3.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PbajajActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });

        ImageButton Buttonsuara4 = (ImageButton) this.findViewById(R.id.imagebecak);
        Buttonsuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.becak1);
                Tampilgambar.startAnimation(animScale);
                suaraButton4.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PbecakActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara5= (ImageButton) this.findViewById(R.id.imagebis);
        Buttonsuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.bis1);
                Tampilgambar.startAnimation(animScale);
                suaraButton5.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PbisActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara6= (ImageButton) this.findViewById(R.id.imagedelman);
        Buttonsuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.delman1);
                Tampilgambar.startAnimation(animScale);
                suaraButton6.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PdelmanActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara7= (ImageButton) this.findViewById(R.id.imagekereta);
        Buttonsuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.kereta1);
                Tampilgambar.startAnimation(animScale);
                suaraButton7.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PkeretaActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara8= (ImageButton) this.findViewById(R.id.imagemobil);
        Buttonsuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.mobil1);
                Tampilgambar.startAnimation(animScale);
                suaraButton8.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PmobilActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara9= (ImageButton) this.findViewById(R.id.imagemotor);
        Buttonsuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.motor1);
                Tampilgambar.startAnimation(animScale);
                suaraButton9.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PmotorActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara10= (ImageButton) this.findViewById(R.id.imagesepeda);
        Buttonsuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.sepeda1);
                Tampilgambar.startAnimation(animScale);
                suaraButton10.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PsepedaActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );


            }

        });
        ImageButton Buttonsuara11= (ImageButton) this.findViewById(R.id.imageskuter);
        Buttonsuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.skuter2);
                Tampilgambar.startAnimation(animScale);
                suaraButton11.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PsktActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara12= (ImageButton) this.findViewById(R.id.imagetaxi);
        Buttonsuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.taxi2);
                Tampilgambar.startAnimation(animScale);
                suaraButton12.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,TaxiActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara13= (ImageButton) this.findViewById(R.id.imagetruk);
        Buttonsuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.truk2);
                Tampilgambar.startAnimation(animScale);
                suaraButton13.start();
                Tampilgambar = (ImageView) findViewById(R.id.imageambulan1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TdaratActivity.this,PtrukActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
    }
}
