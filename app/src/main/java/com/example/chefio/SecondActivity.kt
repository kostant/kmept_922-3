package com.example.chefio
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chefio.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://dog-api.kinduff.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service: DogsApiService = retrofit.create(DogsApiService::class.java)

        service.dogsFacts().enqueue(object : Callback<DogsFactsResponce>{
            override fun onResponse(p0: Call<DogsFactsResponce>, p1: Response<DogsFactsResponce>) {
                val responce = p1.body()
                val response: DogsFactsResponce? = service.dogsFacts().execute().body()
                if(response != null) {
                    Log.d("Kmept", response.facts[0])
                }else{
                    Log.d("KMEPT", "received null")
                }
            }

            override fun onFailure(p0: Call<DogsFactsResponce>, p1: Throwable) {

            }

        })

    }
}




