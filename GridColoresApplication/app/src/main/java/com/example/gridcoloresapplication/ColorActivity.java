package com.example.gridcoloresapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.gridcoloresapplication.databinding.ActivityColorBinding;

public class ColorActivity extends AppCompatActivity {

    private ActivityColorBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityColorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = getIntent().getExtras();
        //binding.getRoot().setBackgroundColor(bundle.getInt("color"));
        binding.actividadFinal.setBackgroundColor(Color.parseColor(bundle.getString("hexa")));
        binding.tvColor.setText(bundle.getString("hexa"));

    }
}