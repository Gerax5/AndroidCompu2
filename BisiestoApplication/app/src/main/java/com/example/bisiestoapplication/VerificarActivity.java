package com.example.bisiestoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bisiestoapplication.databinding.ActivityVerificarBinding;

public class VerificarActivity extends AppCompatActivity {

    private ActivityVerificarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerificarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}