package com.example.retrofit

data class Juice(
    val code: Int,
    val data: Data,
    val message: Any,
    val success: Boolean
) {
    data class Data(
        val count: Int,
        val items: List<Item>,
        val next: Int,
        val numPages: Int,
        val page: Int,
        val pageElements: Int,
        val previous: Any
    ) {
        data class Item(
            val descripcion: String,
            val id: String,
            val imagen: String,
            val ingredientes: List<String>,
            val nombre: String
        )
    }
}