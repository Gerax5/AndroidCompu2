package com.example.paisesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.paisesapplication.databinding.ActivityMpaisBinding;

public class MPaisActivity extends AppCompatActivity {

    ActivityMpaisBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMpaisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        obtenerDatos();

        binding.btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void obtenerDatos(){
        Bundle bundle = getIntent().getExtras();
        binding.imgBandera.setImageResource(bundle.getInt("Bandera"));
        binding.tvNombrePais.setText(bundle.getString("Nombre"));
        binding.tvPoblacion.setText(bundle.getInt("Poblacion"));
    }


}