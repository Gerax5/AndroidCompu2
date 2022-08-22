package com.example.myapprecyclerviewvo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.myapprecyclerviewvo.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvMenu.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<DatosVO> datosVo(){
        ArrayList<DatosVO> listDatos = new ArrayList<>();
        listDatos.add(new DatosVO("La hamburguesa","excelente",R.drawable.ic_baseline_free_breakfast_24));
        listDatos.add(new DatosVO("Pizza X2","buena calidad",R.drawable.ic_baseline_local_pizza_24));
        listDatos.add(new DatosVO("Super Tacos","Al estilo Mexicano",R.drawable.ic_baseline_trip_origin_24));
        return listDatos;
    }
}