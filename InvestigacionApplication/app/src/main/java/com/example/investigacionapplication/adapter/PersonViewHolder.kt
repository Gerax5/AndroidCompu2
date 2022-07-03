package com.example.investigacionapplication.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.investigacionapplication.Personas
import com.example.investigacionapplication.databinding.ItemPersonBinding


class PersonViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemPersonBinding.bind(view)


    fun render(personasModel: Personas){
        binding.tvPersonName.text = personasModel.nombre
        binding.tvPersonLastName.text = personasModel.apellido
        binding.tvPersonGender.text = personasModel.genero
        binding.tvPersonEdad.text = personasModel.edad.toString()
        Glide.with(binding.imgPerson.context).load(personasModel.photo).into(binding.imgPerson)
    }

}