package com.example.recyclerjavaapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.recyclerjavaapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);


        binding.rvPrincipal.setLayoutManager(new LinearLayoutManager(this));
        //binding.rvPrincipal.setLayoutManager(new GridLayoutManager(this, 3));
        AdapterRecycler adapterRecycler = new AdapterRecycler(imagenes(), nombres());
        binding.rvPrincipal.setAdapter(adapterRecycler);

    }

    public ArrayList<Integer> imagenes(){
        ArrayList<Integer> img = new ArrayList<>();
        img.add(R.drawable.ic_futbol);
        img.add(R.drawable.ic_pelota_playa);
        img.add(R.drawable.ic_volley);
        img.add(R.drawable.ic_basketball);
        img.add(R.drawable.ic_tenis);
        img.add(R.drawable.ic_pelota_boliche);
        img.add(R.drawable.ic_bola_disco);
        img.add(R.drawable.ic_futbol_americano);
        img.add(R.drawable.ic_pelota_cristal);
        img.add(R.drawable.ic_pelota_navidad);
        return img;
    }

    public ArrayList<String> nombres(){
        ArrayList<String> n = new ArrayList<>();
        n.add("Pelota de Football");
        n.add("Pelota de Playa");
        n.add("Pelota de Volleyball");
        n.add("Pelota de Basketball");
        n.add("Pelota de Tenis");
        n.add("Pelota de Boliche");
        n.add("Pelota de disco");
        n.add("Pelota de Futbol Americano");
        n.add("Pelota de cristal");
        n.add("PElota de navidad");
        return n;
    }


    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_grid:
                binding.rvPrincipal.setLayoutManager(new GridLayoutManager(this, 3));
                break;
            case R.id.item_lines:
                binding.rvPrincipal.setLayoutManager(new LinearLayoutManager(this));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}