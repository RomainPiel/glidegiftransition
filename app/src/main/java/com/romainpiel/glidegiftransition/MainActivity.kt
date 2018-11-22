package com.romainpiel.glidegiftransition

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val image = findViewById<ImageView>(R.id.image)
        button.setOnClickListener {
            val card = findViewById<View>(R.id.card)
            val intent = Intent(this, OtherActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, card, card.transitionName)
            startActivity(intent, options.toBundle())
        }

        Glide.with(image).load("https://cdn.dribbble.com/users/19781/screenshots/2284638/elcapitan-beachball.gif").into(image)
    }
}
