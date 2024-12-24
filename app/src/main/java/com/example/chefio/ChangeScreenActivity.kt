package com.example.chefio

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ChangeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.polyakov_screen)

        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://dog-api.kinduff.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val service: WhatDaDogDoin = retrofit.create(WhatDaDogDoin::class.java)

        service.DogDoin().enqueue(object : Callback<DogsFactsResponse>{
            override fun onResponse(p0: Call<DogsFactsResponse>, p1: Response<DogsFactsResponse>) {
                val response = p1.body()
                if (response != null){
                    Log.d("KMEPT", response.facts[0])

                } else {
                    Log.d("KMEPT", "response null")
                }
            }

            override fun onFailure(p0: Call<DogsFactsResponse>, p1: Throwable) {
            }

        })



    }


}