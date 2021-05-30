package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SinhVien sv = new SinhVien("Tuong","DN",2000);
//        sv.HoTen = "DHT";
//        sv.DiaChi = "DN";
//        sv.NamSinh = 2000;
//        sv.setNamSinh(2000);

        Toast.makeText(this, sv.getHoTen(), Toast.LENGTH_SHORT).show();
    }
}