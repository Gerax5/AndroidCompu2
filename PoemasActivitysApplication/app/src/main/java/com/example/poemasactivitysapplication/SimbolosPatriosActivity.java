package com.example.poemasactivitysapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.poemasactivitysapplication.databinding.ActivitySimbolosPatriosBinding;
import com.squareup.picasso.Picasso;

public class SimbolosPatriosActivity extends AppCompatActivity {

    private ActivitySimbolosPatriosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySimbolosPatriosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("Poema Simbolos Patrios");

        cargarImagenes();
    }

    private void cargarImagenes() {
        Picasso.get().load("https://i.pinimg.com/originals/8d/8f/66/8d8f66db9e276721a327144253505f77.jpg").into(binding.imgSbpatrios1);
        Picasso.get().load("https://www.prensalibre.com/wp-content/uploads/2015/09/monja_blanca-1.jpg").into(binding.imgSbpatrios2);
        Picasso.get().load("http://4.bp.blogspot.com/-Q4Q3qFPBO5E/Ufvye4RlMZI/AAAAAAAAAXM/mAR3pNSbDSQ/s1600/La+Ceiba.jpg").into(binding.imgSbpatrios3);
    }
}