package com.example.bisiesto2application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.bisiesto2application.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        verificar();
    }

    private void verificar() {

        binding.btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(binding.etIngresarAnio.getText().toString())){
                    Intent anio = new Intent(view.getContext(), DatosAnioActivity.class);
                    anio.putExtra("anio",binding.etIngresarAnio.getText().toString());
                    startActivity(anio);
                }else{
                    Toast.makeText(view.getContext(), "Ingrese un año", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

    }
}