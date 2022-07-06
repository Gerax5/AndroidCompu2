package com.example.actividadrecycleapplication.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.actividadrecycleapplication.Personas
import com.example.actividadrecycleapplication.databinding.ItemPersonaBinding
import com.squareup.picasso.Picasso

class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPersonaBinding.bind(view)

    fun render(personModel: Personas){
        binding.tvPersonaCodigo.text = personModel.codigo
        binding.tvPersonaNombre.text = personModel.nombre
        binding.tvPersonaApellido.text = personModel.apellido
        binding.tvPersonaTelefono.text = personModel.telefono.toString()
        Picasso.get().load(personModel.photo).into(binding.ivFoto)
    }

}