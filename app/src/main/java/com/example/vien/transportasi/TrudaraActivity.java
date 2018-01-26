package com.example.vien.transportasi;

import android.content.Intent;
import android.media.ImageWriter;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TrudaraActivity extends AppCompatActivity {
    ImageButton pindah;
    ImageButton show;
    ImageButton hide;
    ImageView Tampilgambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trudara);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        final MediaPlayer suaraButton2 = MediaPlayer.create(this, R.raw.balon3);
        final MediaPlayer suaraButton3 = MediaPlayer.create(this, R.raw.capung3);
        final MediaPlayer suaraButton4 = MediaPlayer.create(this, R.raw.helikopter3);
        final MediaPlayer suaraButton5 = MediaPlayer.create(this, R.raw.jet3);
        final MediaPlayer suaraButton6 = MediaPlayer.create(this, R.raw.pesawat3);
        final MediaPlayer suaraButton7 = MediaPlayer.create(this, R.raw.roket3);
        final MediaPlayer suaraButton8 = MediaPlayer.create(this, R.raw.zeplin3);




        Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
        show = (ImageButton) findViewById(R.id.imageambalon);
        show = (ImageButton) findViewById(R.id.imagecapung);
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


        ImageButton Buttonsuara14 = (ImageButton) this.findViewById(R.id.imageambalon);
        Buttonsuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.balon1);
                Tampilgambar.startAnimation(animScale);
                suaraButton2.start();
        Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
        Tampilgambar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                suaraButton.start();
                Intent intent = new Intent(TrudaraActivity.this,PbalonActivity.class);
                startActivity(intent);
                finish();
            }
        } );

            }

        });

        ImageButton Buttonsuara15 = (ImageButton) this.findViewById(R.id.imagecapung);
        Buttonsuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.capung1);
                Tampilgambar.startAnimation(animScale);
                suaraButton3.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,PcapungActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );


            }

        });

        ImageButton Buttonsuara16 = (ImageButton) this.findViewById(R.id.imagehelicopter);
        Buttonsuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.helikopter1);
                Tampilgambar.startAnimation(animScale);
                suaraButton4.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,PhelikopterActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });
        ImageButton Buttonsuara17 = (ImageButton) this.findViewById(R.id.imagejet);
        Buttonsuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.jet1);
                Tampilgambar.startAnimation(animScale);
                suaraButton5.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,PjetActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara18 = (ImageButton) this.findViewById(R.id.imagepesawat);
        Buttonsuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.pesawat1);
                Tampilgambar.startAnimation(animScale);
                suaraButton6.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,PpesawatActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara19 = (ImageButton) this.findViewById(R.id.imageroket);
        Buttonsuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.roket1);
                Tampilgambar.startAnimation(animScale);
                suaraButton7.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,ProketActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );

            }

        });
        ImageButton Buttonsuara20 = (ImageButton) this.findViewById(R.id.imagezep);
        Buttonsuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Tampilgambar.setImageResource(R.drawable.zep1);
                Tampilgambar.startAnimation(animScale);
                suaraButton8.start();
                Tampilgambar = (ImageView) findViewById(R.id.imagebalon1);
                Tampilgambar.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        suaraButton.start();
                        Intent intent = new Intent(TrudaraActivity.this,PzepActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } );
            }

        });

        pindah = (ImageButton) findViewById(R.id.imagebackud);
        pindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                suaraButton.start();
                Intent intent = new Intent(TrudaraActivity.this,PilihActivity.class);
                startActivity(intent);
                finish();
            }
        } );



    }
}

