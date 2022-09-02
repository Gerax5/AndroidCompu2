package com.example.recyclerconvoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recyclerconvoapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvPrincipal.setLayoutManager(new LinearLayoutManager(this));
        AdapterContacts adapterContacts = new AdapterContacts(contactos());
        binding.rvPrincipal.setAdapter(adapterContacts);

    }

    public ArrayList<ContactosVo> contactos(){
        ArrayList<ContactosVo> c = new ArrayList<>();
        c.add(new ContactosVo(R.drawable.ic_hombre, "Pedro","Pascal","25479622"));
        c.add(new ContactosVo(R.drawable.ic_mujer,"Maria","Valencia","57845236"));
        c.add(new ContactosVo(R.drawable.ic_mujer, "Nathalie","Fajardo","56967629"));
        c.add(new ContactosVo(R.drawable.ic_hombre, "Gerardo","Pineda","46668105"));
        c.add(new ContactosVo(R.drawable.ic_mujer,"Mirna","Riveiro","37067222"));
        c.add(new ContactosVo(R.drawable.ic_hombre,"Ludving","Pineda","22533224"));
        c.add(new ContactosVo(R.drawable.ic_hombre,"Luis","Mendez","21469435"));
        c.add(new ContactosVo(R.drawable.ic_hombre, "McDonalds","Me encanta","1770"));
        c.add(new ContactosVo(R.drawable.ic_mujer,"Maria","Pedron","45759192"));
        c.add(new ContactosVo(R.drawable.ic_mujer, "lucia","Jimenez","52055322"));
        return c;
    }

}