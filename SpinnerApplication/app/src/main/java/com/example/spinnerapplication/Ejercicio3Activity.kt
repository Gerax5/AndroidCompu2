package com.example.spinnerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.ArrayAdapter
import com.example.spinnerapplication.clases.Listas
import com.example.spinnerapplication.databinding.ActivityEjercicio3Binding

class Ejercicio3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio3Binding
    var op3 = Listas()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSalir.setOnClickListener {
            finish()
        }

        binding.btnListaNumeros.setOnClickListener {


            setVariables()
            op3.ciencoEncienco()

            val adapterCinco = ArrayAdapter(this, android.R.layout.simple_spinner_item, op3.list)
            binding.snListaNumros.adapter = adapterCinco

        }

    }

    fun setVariables():Boolean{
        var flag = false
        if((!(TextUtils.isEmpty(binding.etPrimerValor.text.toString())))&&(!(TextUtils.isEmpty(binding.etSegundoValor.text.toString())))){
            if(((binding.etPrimerValor.text.toString().toInt()+5) >= binding.etSegundoValor.text.toString().toInt()) || ((binding.etSegundoValor.text.toString().toInt()+5) >= binding.etPrimerValor.text.toString().toInt())) {
                flag = true
                op3.n1 = binding.etPrimerValor.text.toString().toInt()
                op3.n2 = binding.etSegundoValor.text.toString().toInt()
            }
        }
        return flag
    }
}