package com.example.poemasactivitysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.poemasactivitysapplication.databinding.ActivityPrimaveraBinding;
import com.squareup.picasso.Picasso;

public class PrimaveraActivity extends AppCompatActivity {

    private ActivityPrimaveraBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrimaveraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("Poema Primavera");
        cargarImagenes();

    }

    private void cargarImagenes() {
        Picasso.get().load("https://aprende.guatemala.com/wp-content/uploads/2017/03/Por-qu%C3%A9-a-Guatemala-se-le-llama-el-pa%C3%ADs-de-la-eterna-primavera.jpg").into(binding.imgPrimevera1);
        Picasso.get().load("https://www.xn--viajesconespaoles-rxb.com/wp-content/uploads/Antigua-Guatemala-1.jpg").into(binding.imgPrimevera2);
        Picasso.get().load("https://www.soy502.com/sites/default/files/styles/mobile_full_node/public/2020/Sep/09/guatemala_eternaprimavera_paisajesguatemala_soy502.jpg").into(binding.imgPrimevera3);
    }
}