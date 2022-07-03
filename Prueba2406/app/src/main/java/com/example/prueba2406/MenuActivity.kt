package com.example.prueba2406

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba2406.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEjemplo1.setOnClickListener {
            val ejemplo1 : Intent = Intent(this, MainActivity::class.java)
            startActivity(ejemplo1)
        }

        binding.btnEjemplo2.setOnClickListener {
            val ejemplo2 : Intent = Intent(this, LinerLayout::class.java)
            startActivity(ejemplo2)
        }
    }
}