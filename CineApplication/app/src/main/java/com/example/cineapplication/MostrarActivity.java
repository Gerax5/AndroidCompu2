package com.example.cineapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.cineapplication.databinding.ActivityMostrarBinding;

public class MostrarActivity extends AppCompatActivity {

    private ActivityMostrarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMostrarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getImage();
        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void getImage() {
        Bundle bundle = getIntent().getExtras();
        binding.imvFoto.setImageResource(bundle.getInt("img"));
    }
}