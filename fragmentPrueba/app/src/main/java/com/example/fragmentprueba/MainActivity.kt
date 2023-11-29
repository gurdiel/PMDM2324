package com.example.fragmentprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {
    override fun onClickFragmentButton() {
        Toast.makeText(this,"El botón ha sido pulsado", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}