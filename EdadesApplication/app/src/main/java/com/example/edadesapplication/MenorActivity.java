package com.example.edadesapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.edadesapplication.databinding.ActivityMenorBinding;

import java.util.Random;

public class MenorActivity extends AppCompatActivity {

    private ActivityMenorBinding binding;
    int n1;
    int n2;
    int suma;
    int respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        numberRandom();

        binding.btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateEmpty()){
                    if(suma == respuesta){
                        binding.tvMensaje.setText("Ya no eres tan bebe");
                    }else{
                        binding.tvMensaje.setText("Sigues siendo todo un bebe");
                    }
                    binding.etResultado.setText("");
                    numberRandom();
                }else{
                    Toast.makeText(MenorActivity.this, "Error al ingresar los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void numberRandom(){
        Random rand = new Random();
        n1 = rand.nextInt(((10-1)+1)+1);
        n2 = rand.nextInt(((10-1)+1)+1);
        suma = n1+n2;
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