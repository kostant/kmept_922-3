package com.example.chefio

import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.chefio.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
