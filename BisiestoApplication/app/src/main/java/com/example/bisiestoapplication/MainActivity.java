package com.example.bisiestoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bisiestoapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);


    }
}