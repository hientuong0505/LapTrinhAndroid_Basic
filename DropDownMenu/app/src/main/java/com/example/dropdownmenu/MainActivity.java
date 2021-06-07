package com.example.dropdownmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Spinner dropdownGender = findViewById(R.id.spinner1);
        String[] itemsGender = new String[]{"Male", "Female", "Other"};
        ArrayAdapter<String> adapterGender = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, itemsGender);
        dropdownGender.setAdapter(adapterGender);

        dropdownGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelected = (String) parent.getItemAtPosition(position);
                dropdownGender.setTag(itemSelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
}


//        spinnerCate = findViewById(R.id.idSpinner);
//
//        cateAdapter = new CategoryAdapter(this,R.layout.item_selected,getListCategory());
//        spinnerCate.setAdapter(cateAdapter);
//
//        spinnerCate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,cateAdapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//    }
//
//    private List<Category> getListCategory() {
//        List<Category> list = new ArrayList<>();
//        list.add(new Category("Android"));
//        list.add(new Category("PHP"));
//        list.add(new Category("C++"));
//        list.add(new Category("ReactJS"));
//        return list;
//    }
}