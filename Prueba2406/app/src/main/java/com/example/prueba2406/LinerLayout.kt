package com.example.prueba2406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.prueba2406.databinding.ActivityLinerLayoutBinding

class LinerLayout : AppCompatActivity() {
    private lateinit var binding: ActivityLinerLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_liner_layout)
        binding = ActivityLinerLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = ArrayAdapter.createFromResource(this,R.array.combo_genero,android.R.layout.simple_spinner_item)
        binding.spGenero.adapter = adapter

        fun gustos():String{
            var r = ""
            if(binding.cbComida.isChecked){
                r += " Comida "
            }
            if(binding.cbDormir.isChecked){
                r += " Domir "
            }
            if (binding.cbFutbol.isChecked){
                r += " Futbol "
            }
            if(binding.cbOtros.isChecked){
                r += " Otros "
            }
            if(binding.cbVideoJuegos.isChecked){
                r += " Video Juegos "
            }
            return r
        }

        binding.btnIngresaDatos.setOnClickListener {
            var datos = ""
            datos += "Nombre: "+binding.etNombre.text.toString()+" Apellido: "+binding.etApellido.text.toString()+" Edad: "+binding.etEdad.text.toString()+
                    " Genero: "+binding.spGenero.selectedItem.toString()

            datos += gustos()

            binding.tvResultado.text = datos
        }


    }

}