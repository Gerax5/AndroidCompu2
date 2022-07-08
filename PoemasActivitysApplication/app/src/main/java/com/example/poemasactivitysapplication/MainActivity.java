package com.example.poemasactivitysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.poemasactivitysapplication.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Picasso.get().load("https://www.banderasdelmundo.net/wp-content/uploads/2019/08/bandera-de-guatemala.jpg").into(binding.imgBandera);

        poemasPrimavera();
        poemasPatria();
        salir();
        poemasSbPatrios();
    }

    private void poemasSbPatrios() {
        binding.btnTipoPoema3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sbPatrios = new Intent(view.getContext(), SimbolosPatriosActivity.class);
                startActivity(sbPatrios);
            }
        });
    }

    private void salir() {
        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }

    private void poemasPatria() {
        binding.btnTipoPoema2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent patria = new Intent(view.getContext(), PatriaActivity.class);
                startActivity(patria);
            }
        });
    }

    private void poemasPrimavera() {
        binding.btnTipoPoema1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent primavera = new Intent(view.getContext(), PrimaveraActivity.class);
                startActivity(primavera);
            }
        });
    }
}