package com.example.recyclerviewclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewclase.adapter.RecyclerPlanesAdapter
import com.example.recyclerviewclase.data.dataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<RecyclerView>(R.id.planesRecyclerView).adapter = RecyclerPlanesAdapter(dataSource.listaPlanes)
    }

}