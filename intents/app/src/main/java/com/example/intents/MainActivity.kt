package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
const val FULL_NAME_KEY = "full_name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.btnSaludo)
        boton.setOnClickListener {
            val editNombre: TextInputEditText = findViewById(R.id._txtnombre)
            val saludoIntent = Intent(this,SaludoActivity::class.java)
            saludoIntent.putExtra(FULL_NAME_KEY, editNombre.text.toString())
            startActivity(saludoIntent)
        }

        val boton2:Button = findViewById(R.id.btnEnviar)
        boton2.setOnClickListener {
            val sendIntent =  Intent().apply {
                Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hola mundo")
                type = "text/plain"
            }
            if(sendIntent.resolveActivity(packageManager) != null){
                startActivity(sendIntent)
            }
        }
    }

}