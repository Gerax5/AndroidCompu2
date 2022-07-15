package com.example.breakingbadapplication.ViewHoldarAdapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbadapplication.Data.Episodes
import com.example.breakingbadapplication.databinding.ItemEpisodeBinding

class ViewHolderEpisode(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemEpisodeBinding.bind(view)

    fun render(episodesModel : Episodes){
        binding.tvIdEpisode.text = episodesModel.id
        binding.tvTitle.text = episodesModel.title
    }
}