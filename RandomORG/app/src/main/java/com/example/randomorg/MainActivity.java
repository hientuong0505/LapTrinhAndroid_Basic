package com.example.randomorg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtRandom;
    Button btnRandom;
    EditText edt1,edt2;

    private void AnhXa(){
        txtRandom = (TextView) findViewById(R.id.txtNumber);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt1.getText().toString().trim();
                String chuoi2 = edt2.getText().toString().trim();

                if(chuoi1.length() == 0 || chuoi2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Vui lòng không để trống",Toast.LENGTH_SHORT).show();
                } else {
                    //Ép kiểu dữ liệu
                    int min = Integer.parseInt(chuoi1); //"12"->12
                    int max = Integer.parseInt(chuoi2); //"30"->30

                    Random rd = new Random();
                    int number = rd.nextInt(max - min + 1) + min;
                    //Ép số -> chuỗi
                    txtRandom.setText(String.valueOf(number));
                }

            }
        });
    }

}