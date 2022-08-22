package com.example.vocales2application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.vocales2application.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<String> vocales = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vocales());
        binding.listVocales.setAdapter(arrayAdapter);
        clickItem();
    }

    public void clickItem(){
        binding.listVocales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                traslado(i);
            }
        });
    }

    private ArrayList<Integer> imaganes(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_a);
        img.add(R.drawable.ic_b);
        img.add(R.drawable.ic_c);
        img.add(R.drawable.ic_d);
        img.add(R.drawable.ic_e);
        return img;
    }

    private ArrayList<Integer> informacion(){
        ArrayList<Integer> info = new ArrayList<>();
        info.add(R.string.vocal_a);
        info.add(R.string.vocal_e);
        info.add(R.string.vocal_i);
        info.add(R.string.vocal_o);
        info.add(R.string.vocal_u);
        return info;
    }

    private ArrayList<String> vocales(){
        this.vocales.add("A");
        this.vocales.add("E");
        this.vocales.add("I");
        this.vocales.add("O");
        this.vocales.add("U");
        return this.vocales;
    }

    private void traslado(int position){
        Intent intent = new Intent(this, VocalActivity.class);
        intent.putExtra("imagenes",imaganes().get(position));
        intent.putExtra("vocales", informacion().get(position));
        startActivity(intent);
    }
}