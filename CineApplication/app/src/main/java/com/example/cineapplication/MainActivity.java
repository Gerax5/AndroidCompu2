package com.example.cineapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.cineapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        AdapterCine adapterCine = new AdapterCine(peliculas());
        ClickRecycler(adapterCine);
        binding.rvPeliclas.setAdapter(adapterCine);
        binding.rvPeliclas.setLayoutManager(new LinearLayoutManager(this));

    }

    private void ClickRecycler(AdapterCine adapterCine){
        adapterCine.setItemClickListener(new ClickListener() {
            @Override
            public void itemClick(Integer position, View v) {
                Intent intent = new Intent(getApplicationContext(), DescripcionPeliculaActivity.class);
                intent.putExtra("nombre",peliculas().get(position).getNombre());
                intent.putExtra("duracion",peliculas().get(position).getDuracion());
                intent.putExtra("sinopsis",peliculas().get(position).getSinopsis());
                intent.putExtra("dya",peliculas().get(position).getDirectorYActores());
                intent.putExtra("puntuacion",peliculas().get(position).getPuntuacionyRecaudacion());
                intent.putExtra("img",peliculas().get(position).getImagen());
                intent.putExtra("precio",peliculas().get(position).getPrecio());
                startActivity(intent);
            }
        });
    }

    public ArrayList<PeliculasVo> peliculas(){
        ArrayList<PeliculasVo> p = new ArrayList<>();
        p.add(new PeliculasVo("¡Nop!","2h 15m",40.0,R.string.sinopss_nope,R.string.direcotyactores_nope,R.string.puntuacionrecauda_nope,R.drawable.ic_pelicula_nope));
        p.add(new PeliculasVo("Todo En Todas Partes Al Mismo Tiempo","2h 20m",31.0,R.string.sinopsis_todoentodas, R.string.directoryactores_todoentodas, R.string.puntuacionrecuda_todoentodas, R.drawable.ic_pelicula_todoentodas));
        p.add(new PeliculasVo("Elvis","2h 39m", 40.0,R.string.sinopsis_elvis, R.string.directoryactores_elvis,R.string.puntuacionrecauda_elvis,R.drawable.ic_pelicula_elvis));
        p.add(new PeliculasVo("spider man no way home","2h 28m",50.0,R.string.sinopsis_spidey,R.string.directoryactores_spidey,R.string.puntuacionrecauda_spidey,R.drawable.ic_pelicula_spider));
        p.add(new PeliculasVo("thor love and thunder","1h 59m",40.0,R.string.sinopsis_thor, R.string.directoryactores_thor, R.string.puntuacionrecauda_thor,R.drawable.ic_pelicula_thor));
        p.add(new PeliculasVo("Pinocho","1h 45m",15.0,R.string.sinopsis_pinocho,R.string.directoryactor_pinocho,R.string.puntuacionrecauda_pinocho,R.drawable.ic_pelicula_pinocho));
        return p;
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.icono_grid:
                binding.rvPeliclas.setLayoutManager(new GridLayoutManager(this, 2));
                break;
            case R.id.icono_lines:
                binding.rvPeliclas.setLayoutManager(new LinearLayoutManager(this));
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}