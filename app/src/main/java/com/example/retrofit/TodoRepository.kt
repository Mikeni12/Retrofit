package com.example.retrofit

class TodoRepository {
    var client: WebService = RetrofitClient.webservice
    var clientJuice: WebService = RetrofitClient.wcjService

    suspend fun getTodo(id: Int) = client.getTodo(id)

    suspend fun getJuices() = clientJuice.getJuices()
}