package com.example.actividadrecycleapplication.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadrecycleapplication.Productos
import com.example.actividadrecycleapplication.databinding.ItemProductoBinding
import com.squareup.picasso.Picasso

class ProductoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemProductoBinding.bind(view)

    fun render(productModel: Productos){
        Picasso.get().load(productModel.image).into(binding.imgProducto)
        binding.tvProductoCodigo.text = productModel.codigo
        binding.tvProductoNombre.text = productModel.nombre
        binding.tvProductoPrecio.text = productModel.precio
    }

}