package com.example.fragmentcolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navegation : BottomNavigationView

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when(item.itemId) {

            R.id.item_Fragment1 -> {

                supportFragmentManager.commit {
                    replace<PrimerFragment>(R.id.frameContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener  true
            }
            R.id.item_Fragment2 -> {
                supportFragmentManager.commit {
                    replace<SegundoFragment>(R.id.frameContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener  true
            }
            R.id.item_Fragment3 -> {
                supportFragmentManager.commit {
                    replace<TercerFragment>(R.id.frameContainer)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener  true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navegation = findViewById(R.id.navMenu)
        navegation.setOnNavigationItemReselectedListener(mOnNavMenu) //PENDIENTE DE ARREGLAR SI ME ENTERO

    supportFragmentManager.commit {
        replace<PrimerFragment>(R.id.frameContainer)
        setReorderingAllowed(true)
        addToBackStack("replacement")
    }

    }
}
