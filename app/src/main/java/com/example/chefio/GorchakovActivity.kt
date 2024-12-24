package com.example.chefio

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class GorchakovActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_doge)
        val textDogs: TextView = findViewById(R.id.dog)
        Log.d("KMEPT", "onCreate")
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://dog-api.kinduff.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: DogsApiService = retrofit.create(DogsApiService::class.java)
        service.dogsFacts().enqueue(object : Callback<DogsFactsResponse>{
            override fun onResponse(p0: Call<DogsFactsResponse>, p1: Response<DogsFactsResponse>) {
                val response = p1.body()
                if (response != null) {
                    textDogs.text = response.facts[0]
                } else {
                    textDogs.text = "received null"
                }
            }

            override fun onFailure(p0: Call<DogsFactsResponse>, p1: Throwable) {
                textDogs.text = "received null"
            }

        })
    }
}