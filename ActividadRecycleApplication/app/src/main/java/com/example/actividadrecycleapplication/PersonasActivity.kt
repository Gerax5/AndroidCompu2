package com.example.actividadrecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividadrecycleapplication.Adapter.PersonAdapter
import com.example.actividadrecycleapplication.databinding.ActivityPersonasBinding

class PersonasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycleView()

    }

    fun initRecycleView(){
        binding.rvPersonas.layoutManager = LinearLayoutManager(this)
        binding.rvPersonas.adapter = PersonAdapter(PersonaProvider.personasList)
    }



}