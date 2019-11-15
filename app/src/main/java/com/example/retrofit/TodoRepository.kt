package com.example.retrofit

class TodoRepository {
    var client: WebService = RetrofitClient.webservice

    suspend fun getTodo(id: Int) = client.getTodo(id)
}