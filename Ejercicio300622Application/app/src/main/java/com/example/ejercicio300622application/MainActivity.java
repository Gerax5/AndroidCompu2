package com.example.ejercicio300622application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ejercicio300622application.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String nombre;
    int edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        binding.btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextisEmpty()){
                    nombre = binding.etUserName.getText().toString();
                    edad = Integer.parseInt(binding.etUserOld.getText().toString());
                    if(edad >= 18){
                        Intent mayores = new Intent(view.getContext(), MayorActivity.class);
                        startActivity(mayores);
                    }
                }else{
                    Toast.makeText(view.getContext(), "Error en los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean editTextisEmpty(){
        Boolean flag = false;
        if((binding.etUserName.getText().toString() != "")&&(binding.etUserOld.getText().toString() != "")){
            flag = true;
        }
        return flag;
    }

}