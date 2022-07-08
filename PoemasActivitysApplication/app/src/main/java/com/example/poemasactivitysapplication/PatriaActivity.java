package com.example.poemasactivitysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.poemasactivitysapplication.databinding.ActivityPatriaBinding;
import com.squareup.picasso.Picasso;

public class PatriaActivity extends AppCompatActivity {

    private ActivityPatriaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPatriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("Poema Patria");

        cargarImagenes();
    }

    private void cargarImagenes() {
        Picasso.get().load("https://www.telesurtv.net/__export/1607267485856/sites/telesur/img/2020/12/06/efe_guatemala_protestas.jpg_1733209419.jpg").into(binding.imgPatria1);
        Picasso.get().load("https://agn.gt/wp-content/uploads/2021/09/Antigua-Guatemala-corona-listado-The-Worlds-Best-de-Travel-Leisure-AGN-Minex-09-09-2021-scaled.jpg").into(binding.imgPatria2);
        Picasso.get().load("https://gdb.voanews.com/a7ca99b6-0790-4957-b6c0-ded274d3ae1c_w408_r1_s.jpg").into(binding.imgPatria3);
    }
}