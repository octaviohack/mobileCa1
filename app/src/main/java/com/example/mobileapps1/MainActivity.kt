package com.example.mobileapps1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photo: ImageView = findViewById(R.id.profilephoto)
        photo.setImageResource(R.drawable.ic_android_black_24dp)

val name = findViewById<TextView>(R.id.Detailes)
        name.text ="octavio Islas "

        val namecourse = findViewById<TextView>(R.id.course)
        namecourse.text = "Mobile Apps 1"


        val foot1 = findViewById<TextView>(R.id.foot)

        foot1.text = "(c) 2023 Your name. All rights reserved."






    }
}