package edu.iastate.shubham8.and102_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.shashank.sony.fancytoastlib.FancyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayHiButton = findViewById<Button>(R.id.button2)
        sayHiButton.setOnClickListener {
           FancyToast.makeText(this, "Hi there! I am the cute doogo nice to meet you 🐶", FancyToast.LENGTH_LONG, FancyToast.INFO, false).show()
        }
    }
}