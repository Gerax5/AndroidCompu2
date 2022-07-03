package com.example.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.spinnerapplication.clases.Listas
import com.example.spinnerapplication.databinding.ActivityEjercicio5Binding

class Ejercicio5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio5Binding
    var eje5 = Listas()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalir.setOnClickListener {
            finish()
        }

        binding.btnListaNumeros.setOnClickListener {

            setVariable()
            eje5.contarVocales()

            val adapterVocales = ArrayAdapter(this, android.R.layout.simple_spinner_item, eje5.list)
            binding.snListaNumros.adapter = adapterVocales

        }
    }

    fun setVariable(){
        eje5.palabra = binding.etPalabra.text.toString()
    }
}