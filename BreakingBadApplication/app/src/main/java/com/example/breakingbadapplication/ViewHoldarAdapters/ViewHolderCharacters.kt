package com.example.breakingbadapplication.ViewHoldarAdapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbadapplication.Data.Character
import com.example.breakingbadapplication.databinding.ItemCharacterBinding
import com.squareup.picasso.Picasso

class ViewHolderCharacters(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun render(charachterModel: Character){
        Picasso.get().load(charachterModel.img).into(binding.imagCharacter)
        binding.tvName.text = charachterModel.name
        binding.tvCharId.text = charachterModel.char_id
    }

}