package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.practica3.adapter.RecyclerMessageAdapter
import com.mpd.pmdm.mensajesrecyclerview.data.MessagesSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.messageRecyclerView).adapter = RecyclerMessageAdapter(MessagesSource.data)
    }
}