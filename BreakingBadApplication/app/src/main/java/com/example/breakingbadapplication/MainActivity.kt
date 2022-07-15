package com.example.breakingbadapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.breakingbadapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        botones()
    }

    private fun botones() {
        binding.btnCharacter.setOnClickListener {
            var person : Intent = Intent(this, CharactersActivity::class.java)
            startActivity(person)
        }
        binding.btnEpisodes.setOnClickListener {
            var episo : Intent = Intent(this, EpisodeActivity::class.java)
            startActivity(episo)
        }
    }
}