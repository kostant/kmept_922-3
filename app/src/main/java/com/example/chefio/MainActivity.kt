package com.example.chefio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pyshkinButton: Button = findViewById(R.id.randome_doge)

        pyshkinButton.setOnClickListener() {
            val intent = Intent(this, PyshkinActivity::class.java)
            startActivity(intent)
        }
        
        var gorchakovButton: Button = findViewById(R.id.randome_doge)

        gorchakovButton.setOnClickListener(){
            val intent = Intent(this, GorchakovActivity::class.java)
            startActivity(intent)
        }

        val ChangeButton: Button = findViewById(R.id.polyakov_button)
        ChangeButton.setOnClickListener{
            val intent = Intent(this, ChangeScreenActivity::class.java)
            startActivity(intent)
        }
        
        var fedichButton: Button = findViewById(R.id.fedich)

        fedichButton.setOnClickListener(){
            val intent = Intent(this, FedichActivity::class.java)
            startActivity(intent)
        }
        
        val buttonNekitKarina = findViewById<Button>(R.id.buttonNekitKarina)

        buttonNekitKarina.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("greetingName", "Карина")
            startActivity(intent)
        }
    }
}
