package com.example.actividadrecycleapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.actividadrecycleapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        salir()
        personas()
        vehiculo()
        producto()
    }

    fun salir(){
        binding.btnSalir.setOnClickListener {
            finishAndRemoveTask()
        }
    }

    fun personas(){
        binding.btnPersonas.setOnClickListener {
            var persons : Intent = Intent(this, PersonasActivity::class.java)
            startActivity(persons)
        }
    }

    fun vehiculo(){
        binding.btnVehiculos.setOnClickListener {
            val vehiculo : Intent = Intent(this, VehiculoActivity::class.java)
            startActivity(vehiculo)
        }
    }

    fun producto(){
        binding.btnProcutos.setOnClickListener {
            val producto : Intent = Intent(this, ProductoActivity::class.java)
            startActivity(producto)
        }
    }

}