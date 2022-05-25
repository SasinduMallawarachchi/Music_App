package com.example.it20200206;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button clk1,clk2,clk3;
    MediaPlayer mdx;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clk1 = (Button) findViewById(R.id.btnStart);
        clk2 = (Button) findViewById(R.id.btnPush);
        clk3 = (Button) findViewById(R.id.btnStop);

        mdx = MediaPlayer.create(MainActivity.this,R.raw.sample);
    }
    
    public void clkPlay(View v){
        mdx.start();
    }
    
    public void clkPush(View v){
        mdx.pause();
    }
    
    public void clkStop(View v){
        mdx.stop();
    }
    
}
