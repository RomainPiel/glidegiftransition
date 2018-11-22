package com.romainpiel.glidegiftransition

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val image = findViewById<ImageView>(R.id.image)
        Glide.with(image)
                .load("https://cdn.dribbble.com/users/19781/screenshots/2284638/elcapitan-beachball.gif")
                .into(image)
    }
}