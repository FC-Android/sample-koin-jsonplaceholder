package com.christyantofernando.sample_koin_jsonplaceholder.service

import com.christyantofernando.sample_koin_jsonplaceholder.model.Todo
import retrofit2.Call
import retrofit2.http.GET

interface TodoService{
    @GET("todos")
    fun todos(): Call<List<Todo>>
}