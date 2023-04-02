package com.oreki.openhacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import com.oreki.openhacks.databinding.ActivityMainBinding
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var id = 0
        binding.searchArtist.setOnClickListener {
            if (binding.artistId.text.isDigitsOnly()) {
                id = Integer.parseInt(binding.artistId.text.toString())

            } else {
                Toast.makeText(applicationContext,"Enter a valid ID",Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun getArtists(id: String) : Artist {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://deezerdevs-deezer.p.rapidapi.com/artist/$id")
            .get()
            .addHeader("X-RapidAPI-Key", "bd453a82e5mshde7bb32202b32bcp1c7adejsn8e4ff4325b27")
            .addHeader("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com")
            .build()

        val response = client.newCall(request).execute()
        if(response.isSuccessful) {
            val objectMapper = ObjectMapper()
            return objectMapper
        }
    }
}