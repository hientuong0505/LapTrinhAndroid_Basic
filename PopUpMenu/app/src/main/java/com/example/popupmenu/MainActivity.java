package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = findViewById(R.id.btn_menu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu();
            }
        });
    }

    private void showMenu(){
        PopupMenu popupmenu = new PopupMenu(this,btnMenu);
        popupmenu.getMenuInflater().inflate(R.menu.menu_popup,popupmenu.getMenu());
        popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuPHP: btnMenu.setText("Menu PHP");
                        break;
                    case R.id.menuJS: btnMenu.setText("Menu JS");
                        break;
                    case R.id.menuC: btnMenu.setText("Menu C");
                        break;
                }
                return false;
            }
        });
        popupmenu.show();
    }


}