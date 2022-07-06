package com.example.actividadrecycleapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadrecycleapplication.Productos
import com.example.actividadrecycleapplication.R

class ProductoAdapter(private val productList: List<Productos>) : RecyclerView.Adapter<ProductoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return ProductoViewHolder(layoutinflater.inflate(R.layout.item_producto, parent, false))
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        var item = productList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = productList.size
}