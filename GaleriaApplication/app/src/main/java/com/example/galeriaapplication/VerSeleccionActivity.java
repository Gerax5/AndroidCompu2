package com.example.galeriaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.galeriaapplication.databinding.ActivityVerSeleccionBinding;

import org.w3c.dom.Text;

public class VerSeleccionActivity extends AppCompatActivity {

    private ActivityVerSeleccionBinding binding;
    String nombrePintura;
    String precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerSeleccionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        obtenerDatos();

        binding.btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarDatos();
            }
        });

        binding.btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void validarDatos() {
        if(!TextUtils.isEmpty(String.valueOf(binding.etNombre.getText()))&&!TextUtils.isEmpty(String.valueOf(binding.etApellido.getText()))&&!TextUtils.isEmpty(String.valueOf(binding.etNit.getText()))){
            trasladar(String.valueOf(binding.etNombre.getText()), String.valueOf(binding.etApellido.getText()), String.valueOf(binding.etNit.getText()));
        }else{
            Toast.makeText(this, "Tiene que llenar todos los datos", Toast.LENGTH_SHORT).show();
        }
    }

    private void trasladar(String nombreUsuario, String apellido, String nit) {
        Intent intent = new Intent(this, PantallaFinalActivity.class);
        intent.putExtra("pin",this.nombrePintura);
        intent.putExtra("precio",this.precio);
        intent.putExtra("nit", nit);
        intent.putExtra("user", nombreUsuario);
        intent.putExtra("ape", apellido);
        startActivity(intent);
    }

    private void obtenerDatos() {
        Bundle bundle = getIntent().getExtras();
        binding.imvVerSeleccion.setImageResource(bundle.getInt("img"));
        this.nombrePintura = bundle.getString("nom");
        binding.tvNombreVerSaleccion.setText(this.nombrePintura);
        this.precio = bundle.getString("pre");
        binding.tvPrecioVerSeleccion.setText("$"+this.precio);
    }
}