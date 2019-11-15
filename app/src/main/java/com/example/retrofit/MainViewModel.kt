package com.example.retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {

    val repository: TodoRepository = TodoRepository()

    val firstTodo = liveData(Dispatchers.IO) {
        val retrivedTodo = repository.getTodo(1)

        emit(retrivedTodo)
    }

    val juices = liveData(Dispatchers.IO) {
        val retrieveJuices = repository.getJuices()
        emit(retrieveJuices)
    }
}