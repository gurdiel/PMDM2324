package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        val nombre = intent.getStringExtra(FULL_NAME_KEY)
        val saludo:TextView = findViewById(R.id._saludo)

        saludo.text = getString(R.string.Saludo,nombre)
    }
}