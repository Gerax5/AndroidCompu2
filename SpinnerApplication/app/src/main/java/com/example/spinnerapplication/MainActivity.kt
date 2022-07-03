package com.example.spinnerapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spinnerapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEjercicio1.setOnClickListener {
            val ejecicio1 : Intent = Intent(this, Ejercicio1Activity::class.java)
            startActivity(ejecicio1)
        }

        binding.btnEjercicio2.setOnClickListener {
            val ejercicio2 : Intent = Intent(this, Ejercicio2Activity::class.java)
            startActivity(ejercicio2)
        }

        binding.btnEjercicio3.setOnClickListener {
            val ejercicio3 : Intent = Intent(this, Ejercicio3Activity::class.java)
            startActivity(ejercicio3)
        }

        binding.btnEjercicio4.setOnClickListener {
            val ejercicio4 : Intent = Intent(this, Ejercicio4Activity::class.java)
            startActivity(ejercicio4)
        }

        binding.btnEjercicio5.setOnClickListener {
            val ejercicio5 : Intent = Intent(this, Ejercicio5Activity::class.java)
            startActivity(ejercicio5)
        }

    }
}