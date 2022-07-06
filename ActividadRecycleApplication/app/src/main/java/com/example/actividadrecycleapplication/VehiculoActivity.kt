package com.example.actividadrecycleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividadrecycleapplication.Adapter.VehiculoAdapter
import com.example.actividadrecycleapplication.databinding.ActivityVehiculoBinding

class VehiculoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVehiculoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVehiculoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecycleView()
        salir()

    }

    fun initRecycleView(){
        binding.rvVehiculo.layoutManager = LinearLayoutManager(this)
        binding.rvVehiculo.adapter = VehiculoAdapter(VehiculoProvider.vehiculoList)
    }

    fun salir(){
        binding.btnSalir.setOnClickListener {
            finish()
        }
    }

}