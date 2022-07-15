package com.example.breakingbadapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.breakingbadapplication.Data.Character
import com.example.breakingbadapplication.ViewHoldarAdapters.AdapterCharacter
import com.example.breakingbadapplication.databinding.ActivityCharactersBinding
import org.json.JSONArray
import org.json.JSONObject

class CharactersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCharactersBinding
    var url = ""
    var characterList = mutableListOf<Character>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharactersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadCharacters()
    }

    private fun loadCharacters() {
        val requestQueue = Volley.newRequestQueue(this)
        url = "https://www.breakingbadapi.com/api/characters"


        val stringRequest =
            StringRequest(Request.Method.GET, url, Response.Listener<String> { response ->
                val jsonArray = JSONArray(response)
                characterList.clear()
                for (i in 0 until jsonArray.length()) {
                    val jsonObject = JSONObject(jsonArray.getString(i))
                    val characterrow = Character(
                        jsonObject.get("char_id").toString(),
                        jsonObject.get("name").toString(),
                        jsonObject.get("img").toString()
                    )
                    characterList.add(characterrow)
                }
                binding.rvCharacter.layoutManager = LinearLayoutManager(this)
                binding.rvCharacter.adapter = AdapterCharacter(characterList)
            }, Response.ErrorListener { error ->
                Toast.makeText(this, "error en sw " + error, Toast.LENGTH_SHORT).show()
            })

        requestQueue.add(stringRequest)
    }
}