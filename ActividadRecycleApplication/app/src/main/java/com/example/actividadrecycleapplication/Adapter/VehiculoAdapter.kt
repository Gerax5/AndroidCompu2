package com.example.actividadrecycleapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadrecycleapplication.R
import com.example.actividadrecycleapplication.Vehiculo

class VehiculoAdapter(private val vehiculoList: List<Vehiculo>) : RecyclerView.Adapter<VehiculoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiculoViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return VehiculoViewHolder(layoutinflater.inflate(R.layout.item_vehiculo, parent, false))
    }

    override fun onBindViewHolder(holder: VehiculoViewHolder, position: Int) {
        val item = vehiculoList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = vehiculoList.size
}