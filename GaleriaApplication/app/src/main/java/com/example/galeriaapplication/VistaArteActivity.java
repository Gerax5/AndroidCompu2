package com.example.galeriaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.galeriaapplication.databinding.ActivityVistaArteBinding;

import java.util.ArrayList;

public class VistaArteActivity extends AppCompatActivity {

    private ActivityVistaArteBinding binding;
    ArrayList<Integer> img = new ArrayList<>();
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<String> precio = new ArrayList<>();
    ArrayList<String> desc = new ArrayList<>();
    String categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVistaArteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        obtenerDatos();

        AdapterVistaArte adapterVistaArte = new AdapterVistaArte(this, R.layout.activity_vista_arte, this.nombre, this.img, this.precio, this.desc);
        binding.lvVistaArte.setAdapter(adapterVistaArte);

    }

    private void obtenerDatos() {
        Bundle bundle = getIntent().getExtras();
        this.img = bundle.getIntegerArrayList("img");
        this.nombre = bundle.getStringArrayList("nombreArte");
        this.categoria = bundle.getString("nombreCat");
        this.desc = bundle.getStringArrayList("descArte");
        this.precio = bundle.getStringArrayList("precioArte");

        binding.tvCategoria.setText(String.valueOf(categoria));
    }
}