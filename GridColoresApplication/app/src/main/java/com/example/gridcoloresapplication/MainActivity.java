package com.example.gridcoloresapplication;

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
import android.widget.Toast;

import com.example.gridcoloresapplication.databinding.ActivityMainBinding;
import com.example.gridcoloresapplication.databinding.ToolbarBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar = findViewById(R.id.id_toolbar);
        setSupportActionBar(toolbar);

        AdapterColoresGrid adapterColoresGrid = new AdapterColoresGrid(this, R.layout.item_cuadro_color, colores(), hexa());
        binding.gvColores.setAdapter(adapterColoresGrid);

        binding.gvColores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), ColorActivity.class);
                intent.putExtra("hexa", hexa().get(i));
                intent.putExtra("color", colores().get(i));
                startActivity(intent);
            }
        });

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
            case R.id.item1:
                Toast.makeText(this, "HOLAAA", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public ArrayList<String> hexa(){
        ArrayList<String> h = new ArrayList<>();
        h.add("#533FA2");
        h.add("#9162D4");
        h.add("#823297");
        h.add("#FC2BF9");
        h.add("#DF178D");
        h.add("#2AE59B");
        h.add("#1ACF46");
        h.add("#C8E3B7");
        h.add("#5F6A57");
        h.add("#F2D742");
        h.add("#BBA31B");
        h.add("#F0AC54");
        h.add("#CB7E1B");
        h.add("#F36625");
        h.add("#EE2B14");
        return h;
    }

    public ArrayList<Integer> colores(){
        ArrayList<Integer> c = new ArrayList<>();
        c.add(R.color.color1);
        c.add(R.color.color2);
        c.add(R.color.color3);
        c.add(R.color.color4);
        c.add(R.color.color5);
        c.add(R.color.color6);
        c.add(R.color.color7);
        c.add(R.color.color8);
        c.add(R.color.color9);
        c.add(R.color.color10);
        c.add(R.color.color11);
        c.add(R.color.color12);
        c.add(R.color.color13);
        c.add(R.color.color14);
        c.add(R.color.color15);
        return c;
    }
}