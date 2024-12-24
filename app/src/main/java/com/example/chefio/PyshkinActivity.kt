package com.example.chefio
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PyshkinActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.randome_doge1)

        val retrofit: Retrofit = Retrofit.Builder().baseUrl("https://dog-api.kinduff.com/").addConverterFactory(GsonConverterFactory.create()).build()

        val service: DogsApiService = retrofit.create(DogsApiService::class.java)
        service.DogsFacts().enqueue(object : Callback<DogsFactsResponse>{
            override fun onResponse(p0: Call<DogsFactsResponse>, p1: Response<DogsFactsResponse>) {
                val response = p1.body()
                if(response != null){
                    Log.d("KMEPT", response.facts[0])
                } else {
                    Log.d("KMEPT", "response null")
                }
            }

            override fun onFailure(p0: Call<DogsFactsResponse>, p1: Throwable) {
                Log.d("KMEPT", p1.localizedMessage)
            }

        })
//        val response = service.DogsFacts().execute().body()
//        if(response != null){
//            Log.d("KMEPT", response.facts[0])
//        } else {
//            Log.d("KMEPT", "response null")
//        }
    }
}
