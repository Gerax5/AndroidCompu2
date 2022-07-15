package com.example.breakingbadapplication.ViewHoldarAdapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.breakingbadapplication.Data.Episodes
import com.example.breakingbadapplication.R

class AdapterEpisode(private val episodeList: List<Episodes>) : RecyclerView.Adapter<ViewHolderEpisode>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderEpisode {
        val layoutinflater = LayoutInflater.from(parent.context)
        return ViewHolderEpisode(layoutinflater.inflate(R.layout.item_episode, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderEpisode, position: Int) {
        return holder.render(episodeList[position])
    }

    override fun getItemCount(): Int = episodeList.size
}