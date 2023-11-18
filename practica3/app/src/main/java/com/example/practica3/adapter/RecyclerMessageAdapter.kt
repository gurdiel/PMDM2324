package com.example.practica3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practica3.R
import com.example.practica3.model.Message

class RecyclerMessageAdapter(private val dataset:List<Message>):
    RecyclerView.Adapter<RecyclerMessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(view: View):RecyclerView.ViewHolder(view){
        val img:ImageView = view.findViewById(R.id._ShapeableIV)
        val name:TextView = view.findViewById(R.id._autor)
        val texto:TextView = view.findViewById(R.id._texto)

        fun render(message: Message){

            img.setImageResource(message.imgAuthor)
            name.text = message.authorName
            texto.text = message.text
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mensaje_layout,parent,false)
        return MessageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        holder.render(dataset[position])

    }
}