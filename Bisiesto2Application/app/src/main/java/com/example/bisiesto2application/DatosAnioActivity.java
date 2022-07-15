package com.example.bisiesto2application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.bisiesto2application.databinding.ActivityDatosAnioBinding;

public class DatosAnioActivity extends AppCompatActivity {

    private ActivityDatosAnioBinding binding;
    String anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatosAnioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        anio = extras.getString("anio");

        varificar();
        salir();
    }

    private void salir() {
        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void varificar() {
        int valor = Integer.parseInt(anio);
        binding.tvMeses.setText("Meses: 12");
        binding.tvSemanas.setText("Semanas: 52");
        if((valor%4 == 0) &&(valor%100 != 0 || valor%400 == 0)){
            binding.tvBisiestoONo.setText("El año es bisiesto");
            binding.tvDia.setText("Dias: 367");
        }else{
            binding.tvBisiestoONo.setText("El año no es bisiesto");
            binding.tvDia.setText("Dias: 365");
        }
    }
}