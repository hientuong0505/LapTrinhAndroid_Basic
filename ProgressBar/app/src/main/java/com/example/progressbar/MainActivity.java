package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDownload;
    ProgressBar pbXuly;
    SeekBar skSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload = (Button) findViewById(R.id.btnDownload);
        pbXuly = (ProgressBar) findViewById(R.id.progressBar2);
        skSound = (SeekBar) findViewById(R.id.seekBar);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //5000: Tong thgian thuc hien dem nguoc, 1000: thgian lap lai 1 hanh dong nao d0
                CountDownTimer count = new CountDownTimer(10000, 500) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        int current = pbXuly.getProgress();
                        if (current >= pbXuly.getMax()) {
                            current = 0;
                        }
                        pbXuly.setProgress(current + 10);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Het gio", Toast.LENGTH_SHORT).show();
                    }
                };
                count.start();
            }
        });
        skSound.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("AAA","Gia tri: "+ progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","START");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("AAA","END");
            }
        });
    }
}