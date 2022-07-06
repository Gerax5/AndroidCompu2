package com.example.actividadrecycleapplication.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadrecycleapplication.Vehiculo
import com.example.actividadrecycleapplication.databinding.ActivityVehiculoBinding
import com.example.actividadrecycleapplication.databinding.ItemVehiculoBinding
import com.squareup.picasso.Picasso

class VehiculoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemVehiculoBinding.bind(view)

    fun render(vehiculoModel: Vehiculo){
        Picasso.get().load(vehiculoModel.image).into(binding.imgVehiculo)
        binding.tvVehiculoColor.text = vehiculoModel.color
        binding.tvVehiculoMarca.text = vehiculoModel.marca
        binding.tvVehiculoPlaca.text = vehiculoModel.placa
        binding.tvVehiculoModelo.text = vehiculoModel.modelo
        binding.tvVehiculoNombrePropetario.text = vehiculoModel.nombrePropietario
    }

}