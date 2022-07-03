package com.example.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import com.example.spinnerapplication.clases.Listas
import com.example.spinnerapplication.databinding.ActivityEjercicio4Binding

class Ejercicio4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio4Binding
    var eje4 = Listas()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalir.setOnClickListener {
            finish()
        }

        binding.btnListaNumeros.setOnClickListener {

            setVariable()
            eje4.letraPorLetra()

            val adapterPalabra = ArrayAdapter(this, android.R.layout.simple_spinner_item, eje4.list)
            binding.snListaNumros.adapter = adapterPalabra

        }
    }

    fun setVariable():Boolean{
        var flag = true
        eje4.palabra = binding.etPalabra.text.toString()
        return flag
    }
}