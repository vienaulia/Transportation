package com.example.vien.transportasi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class PbalonActivity extends AppCompatActivity {
ImageButton pindah;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pbalon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        mp = MediaPlayer.create(getBaseContext(), R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.imagebackud);
        pindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                suaraButton.start();
                Intent intent = new Intent(PbalonActivity.this,TrudaraActivity.class);
                startActivity(intent);
                finish();
                mp.stop();
            }
        } );
    }
}
