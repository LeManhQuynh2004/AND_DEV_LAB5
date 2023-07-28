package com.quynhlm.dev.and_dev_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnbai1).setOnClickListener(view -> {
            startActivity(new Intent(this, Activity_Bai1.class));
        });
        findViewById(R.id.btnbai2).setOnClickListener(view -> {
            startActivity(new Intent(this, Activity_Bai2.class));
        });
    }
}