package com.example.backgroundrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout LNlayout;
    ArrayList<Integer> arrayImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LNlayout = (LinearLayout) findViewById(R.id.myLinearLayout);
//        Khởi tạo mảng
        arrayImg = new ArrayList<>();
        arrayImg.add(R.drawable.hamburg);
        arrayImg.add(R.drawable.mancitylogo);
        arrayImg.add(R.drawable.marko);
        arrayImg.add(R.drawable.unsplash);

        Random rd = new Random();
        //Gắn vị trí ngẫu nhiên cho ảnh
        int vitri = rd.nextInt(arrayImg.size());
        LNlayout.setBackgroundResource(arrayImg.get(vitri));
    }
}