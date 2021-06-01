package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvHinhAnh;
    ArrayList<HinhAnh> arrayImg;
    HinhAnhAdapter adap;

    private void AnhXa(){
        gvHinhAnh = (GridView) findViewById(R.id.gvHinhAnh);
        arrayImg = new ArrayList<>();
        arrayImg.add(new HinhAnh("Hinh so 1",R.drawable.foot));
        arrayImg.add(new HinhAnh("Hinh so 2",R.drawable.h1));
        arrayImg.add(new HinhAnh("Hinh so 3",R.drawable.h2));
        arrayImg.add(new HinhAnh("Hinh so 4",R.drawable.h271965));
        arrayImg.add(new HinhAnh("Hinh so 5",R.drawable.h3));
        arrayImg.add(new HinhAnh("Hinh so 6",R.drawable.h5));
        arrayImg.add(new HinhAnh("Hinh so 7",R.drawable.favicon));
        arrayImg.add(new HinhAnh("Hinh so 8",R.drawable.chris));
        arrayImg.add(new HinhAnh("Hinh so 9",R.drawable.silva));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adap = new HinhAnhAdapter(this,R.layout.dong_hinh_anh,arrayImg);
        gvHinhAnh.setAdapter(adap);
        gvHinhAnh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayImg.get(position).getTenHinh(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}