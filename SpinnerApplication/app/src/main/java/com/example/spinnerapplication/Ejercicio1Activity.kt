package com.example.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinnerapplication.clases.Listas
import com.example.spinnerapplication.databinding.ActivityEjercicio1Binding

class Ejercicio1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio1Binding
    var eje1 = Listas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_ejercicio1)
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnListaNumeros.setOnClickListener {
            if(setVaribales()){
                eje1.generarLista()

                val adapterNumeros =ArrayAdapter(this, android.R.layout.simple_spinner_item, eje1.list)
                binding.snListaNumros.adapter = adapterNumeros

            }else{
                Toast.makeText(this, "Ingrese todos los valores",Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSalir.setOnClickListener {
            finish()
        }

    }

    fun setVaribales():Boolean{
        var flag = false
        if((!(TextUtils.isEmpty(binding.etPrimerValor.text.toString())))&&(!(TextUtils.isEmpty(binding.etSegundoValor.text.toString())))){
            flag = true
            eje1.n1 = binding.etPrimerValor.text.toString().toInt()
            eje1.n2 = binding.etSegundoValor.text.toString().toInt()
        }
        return flag
    }
}