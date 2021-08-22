package com.example.additionallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            MediaPlayer player =
                    MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
            player.setLooping(true);
            player.start();


            btn1=(Button)findViewById(R.id.btn1);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startService(new Intent(MainActivity.this, MyServices.class));
                }
            });

            btn2=(Button)findViewById(R.id.btn2);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stopService(new Intent(MainActivity.this, MyServices.class));

                }
            });
        }




}
