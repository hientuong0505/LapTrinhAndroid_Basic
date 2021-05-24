package com.example.relativelayoutkpt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtNoiDung;
    Button btn;
    EditText edtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNoiDung = (TextView) findViewById(R.id.txt1);
        btn = (Button) findViewById(R.id.button);
        edtUser = (EditText) findViewById(R.id.edtName);

//        lắng nghe sự kiện kích vào nút Btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noiDung = edtUser.getText().toString();

                //Lấy giá trị vừa gắn vào noiDung và in ra màn hình
                Toast.makeText(MainActivity.this, noiDung, Toast.LENGTH_SHORT).show();

            }
        });

    }
}