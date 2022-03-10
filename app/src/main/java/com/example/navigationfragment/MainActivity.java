package com.example.navigationfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PertamaFragment pertamaFragment = new PertamaFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.Container,pertamaFragment).commit();
    }
}