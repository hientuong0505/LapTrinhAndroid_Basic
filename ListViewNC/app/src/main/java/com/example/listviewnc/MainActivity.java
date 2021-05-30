package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewTraiCay;
    ArrayList<TraiCay> arrayTraicay;
    TraiCayAdapter adap;

    private void AnhXa(){
        listViewTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
        arrayTraicay = new ArrayList<>();
        arrayTraicay.add(new TraiCay("Bo","Bo ngon",R.drawable.bo));
        arrayTraicay.add(new TraiCay("Cam","Cam ngot",R.drawable.cam));
        arrayTraicay.add(new TraiCay("Dau Tay","Dau Tay ngon",R.drawable.dautay));
        arrayTraicay.add(new TraiCay("Tao","Tao ngot",R.drawable.tao));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adap = new TraiCayAdapter(this,R.layout.dong_trai_cai,arrayTraicay);
        listViewTraiCay.setAdapter(adap);
    }
}