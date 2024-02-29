package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textDisp = findViewById<TextView>(R.id.TextDisp)
        val spainBtn: ImageButton = findViewById(R.id.SpainBtn)
        val chinaBtn: ImageButton = findViewById(R.id.ChinaBtn)
        val koreaBtn: ImageButton = findViewById(R.id.KoreaBtn)
        val franceBtn: ImageButton = findViewById(R.id.FranceBtn)
        val saBtn: ImageButton = findViewById(R.id.sa)

        // Set click listeners directly
        spainBtn.setOnClickListener {
            textDisp.text = "     ¡Hola, Mundo!"
        }

        chinaBtn.setOnClickListener {
            textDisp.text = "       你好，世界！"
        }

        koreaBtn.setOnClickListener {
            textDisp.text = "   안녕하세요, 세계! "
        }

        franceBtn.setOnClickListener {
            textDisp.text = "  Bonjour,leMonde"
        }

        saBtn.setOnClickListener {
            textDisp.text = "        Sawubona"
        }

    }



}