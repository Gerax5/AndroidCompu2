package com.example.navigationbreakingapplication.Adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationbreakingapplication.data.Character
import com.example.navigationbreakingapplication.databinding.ItemCharacterBinding
import com.squareup.picasso.Picasso

class ViewHolderCharacter(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun render(characterModel: Character){
        binding.characterId.text = characterModel.char_id
        Picasso.get().load(characterModel.img).into(binding.imgCharacter)
    }

}