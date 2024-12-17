package com.example.chefio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ChangeButton: Button = findViewById(R.id.polyakov_button)
        ChangeButton.setOnClickListener{
            val intent = Intent(this, ChangeScreenActivity::class.java)
            startActivity(intent)
        }

    }



}