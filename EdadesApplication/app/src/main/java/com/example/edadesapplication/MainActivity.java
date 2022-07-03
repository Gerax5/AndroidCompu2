package com.example.edadesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.edadesapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    String nombre;
    int edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
                    }else{
                        Intent menores = new Intent(view.getContext(), MenorActivity.class);
                        startActivity(menores);
                    }
                }else{
                    Toast.makeText(view.getContext(), "Error en los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean editTextisEmpty(){
        Boolean flag = false;
        if(!(TextUtils.isEmpty(binding.etUserName.getText().toString()))&&(!(TextUtils.isEmpty(binding.etUserOld.getText().toString())))){
            flag = true;
        }
        return flag;
    }

}