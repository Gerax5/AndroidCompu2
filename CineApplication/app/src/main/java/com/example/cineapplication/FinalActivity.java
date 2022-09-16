package com.example.cineapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.cineapplication.databinding.ActivityFinalBinding;

public class FinalActivity extends AppCompatActivity {

    private ActivityFinalBinding binding;
    private double precioInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getData();

        binding.tvPrecioBoleto.setText("Q."+(precioInicial));

        binding.etCantidadBoletos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if((!TextUtils.isEmpty(binding.etCantidadBoletos.getText().toString()))){
                    double precioFinal = precioInicial * Double.parseDouble(binding.etCantidadBoletos.getText().toString());
                    binding.tvMontoTotal.setText("Q."+precioFinal);
                }else{
                    binding.tvMontoTotal.setText("Q.0.00");
                }
            }
        });

        binding.tvComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(binding.etNombre.getText().toString())&&!TextUtils.isEmpty(binding.etApellido.getText().toString())&&!TextUtils.isEmpty(binding.etNit.getText().toString())&&!TextUtils.isEmpty(binding.etCantidadBoletos.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Se realizo su compra", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(FinalActivity.this, "Debe de llenar todos los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void getData() {
        Bundle bundle = getIntent().getExtras();
        precioInicial = bundle.getDouble("precio");
    }
}