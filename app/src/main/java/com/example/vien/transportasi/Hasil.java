package com.example.vien.transportasi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
    TextView nilai1;
    ImageButton pindah;
    int nilai;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button1);
        mp = MediaPlayer.create(getBaseContext(), R.raw.kids1);
        mp.start();
        pindah = (ImageButton) findViewById(R.id.imagebackud);
        pindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                suaraButton.start();
                Intent intent = new Intent(Hasil.this,MainActivity.class);
                startActivity(intent);
                finish();
                mp.stop();
            }
        } );
        nilai = getIntent().getIntExtra("nilaiS", 0);
        nilai1 = (TextView) findViewById(R.id.nil);
        nilai1.setText(String.valueOf(nilai));
    }

    public void onBackPressed() {
        Hasil.this.finish();
        return;
    }
}
