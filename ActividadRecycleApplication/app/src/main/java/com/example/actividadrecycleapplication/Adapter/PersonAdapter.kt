package com.example.actividadrecycleapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadrecycleapplication.Personas
import com.example.actividadrecycleapplication.R

class PersonAdapter(private val personList: List<Personas>) : RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        return PersonViewHolder(layoutinflater.inflate(R.layout.item_persona, parent, false))
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val item = personList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = personList.size
}