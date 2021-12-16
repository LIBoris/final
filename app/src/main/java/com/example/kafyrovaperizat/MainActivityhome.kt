package com.example.kafyrovaperizat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityhome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityhome)
        val ImageView = findViewById<ImageView>(R.id.imageView26)

        ImageView.setOnClickListener{
            startActivity(Intent(this,MainActivitysave::class.java))
        }
    }
}