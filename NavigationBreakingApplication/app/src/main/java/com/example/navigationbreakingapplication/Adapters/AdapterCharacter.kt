package com.example.navigationbreakingapplication.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationbreakingapplication.R
import com.example.navigationbreakingapplication.data.Character

class AdapterCharacter(private val characterList: List<Character>) : RecyclerView.Adapter<ViewHolderCharacter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCharacter {
        val layoutinflater = LayoutInflater.from(parent.context)
        return ViewHolderCharacter(layoutinflater.inflate(R.layout.item_character, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderCharacter, position: Int) {
        return holder.render(characterList[position])
    }

    override fun getItemCount(): Int = characterList.size
}