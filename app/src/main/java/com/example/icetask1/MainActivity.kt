package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.view.SupportActionModeWrapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide();

        Handler().postDelayed({
            startActivity(Intent(this, Home::class.java))
            finish()
        }, 1300)

    }
}