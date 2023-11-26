package com.example.paneldual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentContainerView
import com.example.paneldual.databinding.ActivityMainBinding

/**
 * Declaramos nuestro propio Listener. Una interface para recibir las notificaciones
 * al seleccionar cualquier boton
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var isDualPanel: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Si la actividad contiene el id del segundo contenedor de fragment,
        //Es la tablet

        isDualPanel = findViewById<FragmentContainerView>(R.id.fragmentColores) != null


        if (savedInstanceState == null) {
            val fragmentContainer = binding.fragmentBotones
            val botonesFragment = BotonesFragment()
            supportFragmentManager
                .beginTransaction() //empezar una transacción
                .add(fragmentContainer!!.id, botonesFragment)
                .commit()

            //Si es una tablet (panel dual)
            if(isDualPanel) {
                val fragmentContainer = binding.fragmentColores
                val colorFragment = ColorFragment()
                supportFragmentManager
                    .beginTransaction() //empezar una transacción
                    .add(fragmentContainer!!.id, colorFragment)
                    .commit()
            }
        }
    }
}