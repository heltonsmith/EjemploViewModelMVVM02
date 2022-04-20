package com.heltonbustos.ejemploviewmodelmvvm02.repository

class FrutasInteractor() {


    fun obtenerFrutasROOM(): List<Frutas>{
        val frutas = listOf<Frutas>(
            Frutas("Piña", "Amarilla", 1500f, 1f),
            Frutas("Manzana", "Roja", 1100f, 1f),
            Frutas("Frutilla", "Roja", 1200f, 1f)
        )
        return frutas
    }

    fun obtenerFrutasAPIRETROFIT(): List<Frutas>{
        val frutas = listOf<Frutas>(
            Frutas("Pera", "Amarilla", 1500f, 1f),
            Frutas("Sandia", "Roja", 1100f, 1f),
            Frutas("Melon", "Verde", 1200f, 1f)
        )
        return frutas
    }


}