package com.example.retrofit

import retrofit2.http.GET
import retrofit2.http.Path

interface WebService {
    @GET("/todos/{id}")
    suspend fun getTodo(@Path(value = "id") todoId: Int): Todo

    @GET("/consumidor/bebidas")
    suspend fun getJuices(): Juice
}