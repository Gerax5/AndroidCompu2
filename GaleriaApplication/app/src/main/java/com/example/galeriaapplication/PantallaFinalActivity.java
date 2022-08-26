package com.example.galeriaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.galeriaapplication.databinding.ActivityPantallaFinalBinding;

public class PantallaFinalActivity extends AppCompatActivity {

    private ActivityPantallaFinalBinding binding;
    String precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPantallaFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        obtenerDatos();

        binding.btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void obtenerDatos() {
        Bundle bundle = getIntent().getExtras();
        binding.tvNombreFac.setText(String.valueOf(bundle.getString("user")));
        binding.tvFacturaNombrep.setText(String.valueOf(bundle.getString("pin")));
        binding.tvFacApe.setText(String.valueOf(bundle.getString("ape")));
        binding.tvFacNit.setText(String.valueOf(bundle.getString("nit")));
        this.precio = bundle.getString("precio");
        double precioTotal = (Double.parseDouble(precio) * 0.12)+Double.parseDouble(precio);
        binding.tvFacTotal.setText("$"+String.valueOf(precioTotal));
    }
}