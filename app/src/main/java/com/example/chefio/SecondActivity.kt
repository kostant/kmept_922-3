package com.example.chefio


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val greetingTextView = findViewById<TextView>(R.id.greetingTextView)
        val greetingName = intent.getStringExtra("greetingName")
        greetingTextView.text = "Привет, $greetingName"
    }
}
