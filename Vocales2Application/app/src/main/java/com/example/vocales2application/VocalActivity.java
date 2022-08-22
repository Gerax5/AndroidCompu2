package com.example.vocales2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.vocales2application.databinding.ActivityVocalBinding;

public class VocalActivity extends AppCompatActivity {

    private ActivityVocalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVocalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        obtener();
    }

    public void obtener(){
        Bundle bundle = getIntent().getExtras();
        int imagen = bundle.getInt("imagenes");
        int info = bundle.getInt("vocales");
        binding.tvVocales.setText(info);
        binding.imgVocales.setImageResource(imagen);

    }
}