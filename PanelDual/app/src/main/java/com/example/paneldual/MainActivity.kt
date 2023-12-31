package com.example.paneldual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentContainerView
import com.example.paneldual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BotonesListener {

    private lateinit var binding: ActivityMainBinding
    var isDualPanel: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isDualPanel = binding.fragmentColores != null

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

    override fun onClickButton(color: Int) {
        //Recupero la posible isntancia de ColorFragment, si existe (en tableta) y lo casteo
        // a ColorFragment para poder llamar a sus funciones específicas
        //ya que findFragmentById me devuelve un Fragment genérico
        //Como puedo estar lanzando esta función desde un móvil, la referencia podría ser nulla,
        // así que el casting es a un ColorFragment nullable
        val loadedColorFragment = supportFragmentManager.findFragmentById(R.id.fragmentColores) as ColorFragment?
        loadedColorFragment?.cambiarColor(color)
        //Si estamos en un móvil, no tableta, y no está cargado el fragmento. Lo cargamos ahora
        //Podríamos haber usado el atributo isDualPanel. Pero esta es otra forma
        if(loadedColorFragment == null){
            val newColorFragment = ColorFragment.newInstance(color)
            val fragmentContainer = binding.fragment
            supportFragmentManager
                .beginTransaction()
                .replace(fragmentContainer!!.id, newColorFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}