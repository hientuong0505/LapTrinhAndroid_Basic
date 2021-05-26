package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    Button btnDownload;
    ProgressBar pbXuly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload = (Button) findViewById(R.id.btnDownload);
        pbXuly = (ProgressBar) findViewById(R.id.progressBar2);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = pbXuly.getProgress();
                if(current >= pbXuly.getMax()){
                    current = 0;
                }
                pbXuly.setProgress(current + 10);
            }
        });
    }
}