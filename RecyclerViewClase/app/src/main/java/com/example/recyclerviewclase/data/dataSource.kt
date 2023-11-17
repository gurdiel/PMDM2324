package com.example.recyclerviewclase.data

import com.example.recyclerviewclase.R
import com.example.recyclerviewclase.model.PlanAsturias

class dataSource {
    companion object{
        val listaPlanes = listOf<PlanAsturias>(
            PlanAsturias(R.drawable.cultura,"Los mejores espacios culturales"),
            PlanAsturias(R.drawable.deportes,"Todos los desportes a tu alcance"),
            PlanAsturias(R.drawable.gastronomia,"Los manjares más deliciosos"),
            PlanAsturias(R.drawable.infantil,"Planes para los peques de la familia"),
            PlanAsturias(R.drawable.mascotas,"Espacios reservados para tus peludos"),
            PlanAsturias(R.drawable.montanya,"Sumérgete en el verde más intenso"),
            PlanAsturias(R.drawable.playa,"Paseos infinitos con el mar de fondo"),
            PlanAsturias(R.drawable.pueblos,"Villas encantadores para perderse"),
            PlanAsturias(R.drawable.restauracion,"Los mejores productos de la tierra"),
        )
    }
}