package com.example.paisesapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.paisesapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<String> paises = new ArrayList<>();
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, llenarDatos());
        binding.lvPaises.setAdapter(arrayAdapter);

        binding.lvPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                trasladar(i);
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.icono_luna:
                Toast.makeText(this, "Esto es un toast", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void trasladar(int position){
        Intent intent = new Intent(this, MPaisActivity.class);
        intent.putExtra("Bandera",countryFlag().get(position));
        intent.putExtra("Poblacion",poblacion().get(position));
        intent.putExtra("Nombre",this.paises.get(position));
        startActivity(intent);
    }

    private ArrayList<String> llenarDatos(){
        this.paises.add("Guatemala");
        this.paises.add("Mexico");
        this.paises.add("España");
        this.paises.add("Argentina");
        this.paises.add("Canada");
        this.paises.add("Chile");
        this.paises.add("Suiza");
        this.paises.add("Italia");
        this.paises.add("Brasil");
        this.paises.add("Francia");
        return  this.paises;
    }

    private ArrayList<Integer> countryFlag(){
        ArrayList<Integer> flags = new ArrayList<>();
        flags.add(R.drawable.ic_guatemala);
        flags.add(R.drawable.ic_mexico);
        flags.add(R.drawable.ic_espania);
        flags.add(R.drawable.ic_argentina);
        flags.add(R.drawable.ic_canada);
        flags.add(R.drawable.ic_chile);
        flags.add(R.drawable.ic_suiza);
        flags.add(R.drawable.ic_italia);
        flags.add(R.drawable.ic_brasil);
        flags.add(R.drawable.ic_francia);
        return flags;
    }

    private ArrayList<Integer> poblacion(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.string.guatemala_habitantes);
        list.add(R.string.mexico_habitantes);
        list.add(R.string.espania_habitantes);
        list.add(R.string.argentina_habitantes);
        list.add(R.string.canada_habitantes);
        list.add(R.string.chile_habitantes);
        list.add(R.string.suiza_habitantes);
        list.add(R.string.italia_habitantes);
        list.add(R.string.brasil_habitantes);
        list.add(R.string.francia_habitantes);
        return list;
    }

}