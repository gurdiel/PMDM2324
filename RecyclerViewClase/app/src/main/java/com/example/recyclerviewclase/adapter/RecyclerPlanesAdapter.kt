package com.example.recyclerviewclase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewclase.R
import com.example.recyclerviewclase.model.PlanAsturias

/**
 * Clase que recibe la lista con nuestras muestras.
 */
class RecyclerPlanesAdapter(private val dataset:List<PlanAsturias>) :

    RecyclerView.Adapter<RecyclerPlanesAdapter.PlanesViewHolder>(){

    class PlanesViewHolder(view:View): RecyclerView.ViewHolder(view){
        //Aquí asocia los layouts
        val imgPlan:ImageView = view.findViewById(R.id.imgPlan)
        val txtDescripcion:TextView = view.findViewById(R.id.txtDescripcion)

        /**
         * Método que asocia los layouts con el objeto plan que contiene imagen y descripción
         */
        fun bind(plan: PlanAsturias){
            imgPlan.setImageResource(plan.imgSourceId)
            txtDescripcion.setText(plan.descripcion)
        }

    }

    /**
     * Este método lo llama el RecyclerView cuando crea los viewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plan_asturias,parent,false)

        return PlanesViewHolder(view)
    }

    /**
     * Devuelve el tamaño de la lista.
     */
    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: PlanesViewHolder, position: Int) {
        holder.bind(dataset[position])
    }


}