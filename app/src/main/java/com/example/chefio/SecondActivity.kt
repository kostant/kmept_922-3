package com.example.chefio


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Retrofit

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://dog-api.kinduff.com/")
            .build()
        val service: DogsAppInterface = retrofit.create(DogsAppInterface::class.java)
        val response: DogsFactsResponse? = service.dogFacts()
            .execute()
            .body
        if(response != null) {
            Log.d("KMEPT", response.facts[0])
        } else {
            Log.d("KMEPT", "received null")
        }

        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        val greetingName = intent.getStringExtra("greetingName")
        greetingTextView.text = "Здравствуй, $greetingName"
    }
}

