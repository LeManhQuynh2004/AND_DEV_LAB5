package com.quynhlm.dev.and_dev_lab5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activity_Bai2 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2, new Home_Fragment()).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int index = item.getItemId();
                Fragment fragment = null;
                if (index == R.id.menu_trangchu) {
                    fragment = new Home_Fragment();
                } else if (index == R.id.menu_dautrang) {
                    fragment = new BookMark_Fragment();
                } else {
                    fragment = new Settings_Fragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container2, fragment).commit();
                return true;
            }
        });
    }
}