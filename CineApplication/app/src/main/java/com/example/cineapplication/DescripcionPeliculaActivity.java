package com.example.cineapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cineapplication.databinding.ActivityDescripcionPeliculaBinding;
import com.google.android.material.tabs.TabLayout;

public class DescripcionPeliculaActivity extends AppCompatActivity {

    private ActivityDescripcionPeliculaBinding binding;
    private Fragment fragmentSinopsis, fragmentDirec, fragmentPuntuaci;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescripcionPeliculaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentSinopsis = new SinopsisFragment();
        fragmentDirec = new DirectorFragment();
        fragmentPuntuaci = new PuntuacionFragment();

        this.getData();

        binding.tblDescripcionPelicula.addTab(binding.tblDescripcionPelicula.newTab().setText("Sinopsis"));
        binding.tblDescripcionPelicula.addTab(binding.tblDescripcionPelicula.newTab().setText("Drector\ny Actores"));
        binding.tblDescripcionPelicula.addTab(binding.tblDescripcionPelicula.newTab().setText("Puntuacion\nRecaudacion"));

        getSupportFragmentManager().beginTransaction().add(R.id.frml_descripcion_pelicula, fragmentSinopsis).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frml_descripcion_pelicula, fragmentDirec).hide(fragmentDirec).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frml_descripcion_pelicula, fragmentPuntuaci).hide(fragmentPuntuaci).commit();
        actionTabLayout();
        binding.imvDescripcionCine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pulsarFoto();
            }
        });

        binding.btnComprarEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                Intent intent = new Intent(getApplicationContext(), FinalActivity.class);
                intent.putExtra("precio",bundle.getDouble("precio"));
                startActivity(intent);
            }
        });
    }

    private void pulsarFoto() {
        Bundle bundle = getIntent().getExtras();
        Intent intent = new Intent(getApplicationContext(), MostrarActivity.class);
        intent.putExtra("img",bundle.getInt("img"));
        startActivity(intent);
    }

    private void actionTabLayout() {
        binding.tblDescripcionPelicula.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                transaction = getSupportFragmentManager().beginTransaction();
                switch (tab.getPosition()){
                    case 0:
                        if(fragmentSinopsis.isAdded()){
                            transaction.hide(fragmentDirec).hide(fragmentPuntuaci).show(fragmentSinopsis).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentDirec).hide(fragmentPuntuaci).add(R.id.frml_descripcion_pelicula, fragmentSinopsis).addToBackStack(null);
                        }
                        break;
                    case 1:
                        if(fragmentDirec.isAdded()){
                            transaction.hide(fragmentSinopsis).hide(fragmentPuntuaci).show(fragmentDirec).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentSinopsis).hide(fragmentPuntuaci).add(R.id.frml_descripcion_pelicula, fragmentDirec).addToBackStack(null);
                        }
                        break;
                    case 2:
                        if(fragmentPuntuaci.isAdded()){
                            transaction.hide(fragmentSinopsis).hide(fragmentDirec).show(fragmentPuntuaci).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentSinopsis).hide(fragmentDirec).add(R.id.frml_descripcion_pelicula, fragmentPuntuaci).addToBackStack(null);
                        }
                        break;
                }
                transaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        binding.imvDescripcionCine.setImageResource(bundle.getInt("img"));
        binding.tvNombrePelicula.setText(bundle.getString("nombre"));
        Bundle sin = new Bundle();
        sin.putInt("sinopsis",bundle.getInt("sinopsis"));
        fragmentSinopsis.setArguments(sin);
        Bundle dir = new Bundle();
        dir.putInt("dya",bundle.getInt("dya"));
        fragmentDirec.setArguments(dir);
        Bundle pun = new Bundle();
        pun.putInt("puntuacion",bundle.getInt("puntuacion"));
        fragmentPuntuaci.setArguments(pun);
    }

    private void setData(){

    }
}