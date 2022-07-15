package com.example.breakingbadapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.breakingbadapplication.Data.Episodes
import com.example.breakingbadapplication.ViewHoldarAdapters.AdapterEpisode
import com.example.breakingbadapplication.databinding.ActivityEpisodeBinding
import org.json.JSONArray
import org.json.JSONObject

class EpisodeActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityEpisodeBinding
    var episodeList = mutableListOf<Episodes>()
    var url = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEpisodeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadEpisodes()
    }

    private fun loadEpisodes() {
        var requestQueue = Volley.newRequestQueue(this)
        episodeList.clear()
        url = "https://www.breakingbadapi.com/api/episodes"
        val stringRequest = StringRequest(Request.Method.GET, url, Response.Listener<String>{ response ->
            var jsonArray = JSONArray(response)
            for(i in 0 until jsonArray.length()){
                var jsonObject = JSONObject(jsonArray.getString(i))
                var episodeRow = Episodes(
                    jsonObject.get("episode_id").toString(),
                    jsonObject.get("title").toString()
                )
                episodeList.add(episodeRow)
            }
            binding.rvEpisodes.layoutManager = LinearLayoutManager(this)
            binding.rvEpisodes.adapter = AdapterEpisode(episodeList)
        }, Response.ErrorListener {
            Toast.makeText(this, "Hola",Toast.LENGTH_SHORT).show()
        })

        requestQueue.add(stringRequest)
    }
}