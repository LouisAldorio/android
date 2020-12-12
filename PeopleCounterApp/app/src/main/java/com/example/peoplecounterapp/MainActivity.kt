package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var timeClicked : Int = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            timeClicked++
            myTextView.text = timeClicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
    }
}