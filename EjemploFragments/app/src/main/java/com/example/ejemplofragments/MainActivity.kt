package com.example.ejemplofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.ejemplofragments.FirstFragment.Companion.DIRECCION_BUNDLE
import com.example.ejemplofragments.FirstFragment.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //llamamos al suport para que haga un cambio.
        val bundle = bundleOf(NAME_BUNDLE to "GURDIEL", DIRECCION_BUNDLE to "ORDENADOR")
        supportFragmentManager.commit {
            //lo añadimos y punto esto. Tema performance
            setReorderingAllowed(true)
            //para añadir el fragment, por código.
            add<FirstFragment>(R.id.fragment_container, args = bundle)
        }

    }
}