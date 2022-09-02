package com.example.cuentosapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.cuentosapplication.databinding.ActivityCuentosBinding;
import com.google.android.material.tabs.TabLayout;

public class CuentosActivity extends AppCompatActivity {

    ActivityCuentosBinding binding;
    private Fragment fragmentCuento1, fragmentCuento2, fragmentCuento3, fragmentCuento4, fragmentCuento5;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCuentosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentCuento1 = new Cuento1Fragment();
        fragmentCuento2 = new Cuento2Fragment();
        fragmentCuento3 = new Cuento3Fragment();
        fragmentCuento4 = new Cuento4Fragment();
        fragmentCuento5 = new Cuento5Fragment();

        binding.tblCuentos.addTab(binding.tblCuentos.newTab().setText("Cuento 1"));
        binding.tblCuentos.addTab(binding.tblCuentos.newTab().setText("Cuento 2"));
        binding.tblCuentos.addTab(binding.tblCuentos.newTab().setText("Cuento 3"));
        binding.tblCuentos.addTab(binding.tblCuentos.newTab().setText("Cuento 4"));
        binding.tblCuentos.addTab(binding.tblCuentos.newTab().setText("Cuento 5"));

        getSupportFragmentManager().beginTransaction().add(R.id.frl_contenedor_cuentos, fragmentCuento1).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frl_contenedor_cuentos, fragmentCuento2).hide(fragmentCuento2).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frl_contenedor_cuentos, fragmentCuento3).hide(fragmentCuento3).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frl_contenedor_cuentos, fragmentCuento4).hide(fragmentCuento4).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frl_contenedor_cuentos, fragmentCuento5).hide(fragmentCuento5).commit();
        accionTabLayout();

    }

    private void accionTabLayout(){
        binding.tblCuentos.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                transaction = getSupportFragmentManager().beginTransaction();
                switch (tab.getPosition()){
                    case 0:
                        if(fragmentCuento1.isAdded()){
                            transaction.hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento4).hide(fragmentCuento5).show(fragmentCuento1).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento4).hide(fragmentCuento5).add(R.id.frl_contenedor_cuentos, fragmentCuento1).addToBackStack(null);
                        }
                        break;
                    case 1:
                        if(fragmentCuento2.isAdded()){
                            transaction.hide(fragmentCuento1).hide(fragmentCuento3).hide(fragmentCuento4).hide(fragmentCuento5).show(fragmentCuento2).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentCuento1).hide(fragmentCuento3).hide(fragmentCuento4).hide(fragmentCuento5).add(R.id.frl_contenedor_cuentos, fragmentCuento2).addToBackStack(null);
                        }
                        break;
                    case 2:
                        if(fragmentCuento3.isAdded()){
                            transaction.hide(fragmentCuento1).hide(fragmentCuento2).hide(fragmentCuento4).hide(fragmentCuento5).show(fragmentCuento3).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentCuento2).hide(fragmentCuento1).hide(fragmentCuento4).hide(fragmentCuento5).add(R.id.frl_contenedor_cuentos, fragmentCuento3).addToBackStack(null);
                        }
                        break;
                    case 3:
                        if(fragmentCuento4.isAdded()){
                            transaction.hide(fragmentCuento1).hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento5).show(fragmentCuento4).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento1).hide(fragmentCuento5).add(R.id.frl_contenedor_cuentos, fragmentCuento4).addToBackStack(null);
                        }
                        break;
                    case 4:
                        if(fragmentCuento5.isAdded()){
                            transaction.hide(fragmentCuento1).hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento4).show(fragmentCuento5).addToBackStack(null);
                        }else{
                            transaction.hide(fragmentCuento2).hide(fragmentCuento3).hide(fragmentCuento4).hide(fragmentCuento1).add(R.id.frl_contenedor_cuentos, fragmentCuento5).addToBackStack(null);
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
}