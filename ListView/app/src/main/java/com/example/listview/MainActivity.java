package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMH;
    ArrayList<String> arrayCourse;
    EditText edtMH;
    Button btnAdd, btnUpdate, btnDelete;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        edtMH = (EditText) findViewById(R.id.edtMH);
        lvMH = (ListView) findViewById(R.id.listviewMH);

        arrayCourse = new ArrayList<>();
        arrayCourse.add("PHP");
        arrayCourse.add("Android");
        arrayCourse.add("IOS");
        arrayCourse.add("React");
        arrayCourse.add("Vuejs");

        ArrayAdapter ad = new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                arrayCourse
        );
        lvMH.setAdapter(ad);

        //Them mon hoc
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monhoc = edtMH.getText().toString();
                arrayCourse.add(monhoc);
                //Cap nhap lai adapter
                ad.notifyDataSetChanged();

            }
        });

        //Lay gia tri tu ListView dua len EditText
        lvMH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtMH.setText(arrayCourse.get(position));
                vitri = position;
            }
        });

        //Cap nhap
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCourse.set(vitri,edtMH.getText().toString());
                ad.notifyDataSetChanged();
            }
        });

        lvMH.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayCourse.remove(position);
                ad.notifyDataSetChanged();
                return false;
            }
        });
    }
}