package com.example.chefio

import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonKozhinaKaty = findViewById<Button>(R.id.buttonKozhinaKaty)


        buttonKozhinaKaty.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("greetingName", "Катя")
            startActivity(intent)
        }
    }
}
