package com.example.edadesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.edadesapplication.databinding.ActivityMayorBinding;

import java.util.Random;

public class MayorActivity extends AppCompatActivity {

    private ActivityMayorBinding binding;
    int n1;
    int n2;
    int multi;
    int respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMayorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.numberRandom();

        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateEmpty()) {
                    if (multi == respuesta) {
                        binding.tvMensaje.setText("Eres todo un adulto");
                    } else {
                        binding.tvMensaje.setText("No eres tan adulto como crees");
                    }
                    binding.etResultado.setText("");
                    numberRandom();
                }else{
                    Toast.makeText(MayorActivity.this, "Error al ingresar los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void numberRandom(){
        Random rand = new Random();
        n1 = rand.nextInt(((10-1)+1)+1);
        n2 = rand.nextInt(((10-1)+1)+1);
        multi = n1*n2;
        binding.tvNumberOne.setText(String.valueOf(n1));
        binding.tvNumberTwo.setText(String.valueOf(n2));
    }

    private Boolean validateEmpty(){
        Boolean flag = false;
        if(binding.etResultado.getText().toString() != ""){
            flag = true;
            respuesta = Integer.parseInt(binding.etResultado.getText().toString());
        }
        return flag;
    }

}