package com.example.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinnerapplication.clases.Listas
import com.example.spinnerapplication.databinding.ActivityEjercicio2Binding

class Ejercicio2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio2Binding
    var op2 = Listas()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_ejercicio2)
        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSalir.setOnClickListener {
            finish()
        }

        binding.btnGenerarLista.setOnClickListener {
            if(setVarible()){
                op2.listaNumerosMultiplos3()

                val adapterMultiplos = ArrayAdapter(this, android.R.layout.simple_spinner_item, op2.list)
                binding.spNumeros.adapter = adapterMultiplos

            }else{
                Toast.makeText(this, "Algo salio mal",Toast.LENGTH_LONG).show()
            }
        }
    }

    fun setVarible():Boolean{
        var flag = false
        if(!(TextUtils.isEmpty(binding.etNumero.text.toString()))){
            if (binding.etNumero.text.toString().toInt() > 6){
                flag = true
                op2.n1 = binding.etNumero.text.toString().toInt()
            }
        }
        return flag
    }
}