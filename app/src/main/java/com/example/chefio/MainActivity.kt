package com.example.chefio
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.chefio.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val buttonNekitKarina = findViewById<Button>(R.id.buttonNekitKarina)

        buttonNekitKarina.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("greetingName", "Карина")
            startActivity(intent)
        }
    }
}
