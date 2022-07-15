package com.example.breakingbadapplication.ViewHoldarAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbadapplication.Data.Character
import com.example.breakingbadapplication.R

class AdapterCharacter(private val charachterList: List<Character>) : RecyclerView.Adapter<ViewHolderCharacters>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCharacters {
        val layoutinflater = LayoutInflater.from(parent.context)
        return ViewHolderCharacters(layoutinflater.inflate(R.layout.item_character, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderCharacters, position: Int) {
        return holder.render(charachterList[position])
    }

    override fun getItemCount(): Int = charachterList.size
}