package com.example.tic_tac;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mybeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybeat=MediaPlayer.create(MainActivity.this,R.raw.beat1);
    }
    public void play1(View v){
        mybeat.start();


}
@Override
    protected  void onPause(){
        super.onPause();
        mybeat.release();
}
}