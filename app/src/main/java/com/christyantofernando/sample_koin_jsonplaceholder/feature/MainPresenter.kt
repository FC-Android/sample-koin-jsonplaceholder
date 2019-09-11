package com.christyantofernando.sample_koin_jsonplaceholder.feature

import com.christyantofernando.sample_koin_jsonplaceholder.model.Todo
import com.christyantofernando.sample_koin_jsonplaceholder.service.TodoService
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(private val view: MainContract.View?): MainContract.Presenter, KoinComponent{
    val todoService: TodoService by inject()

    override fun loadTodos() {
        todoService.todos().enqueue(object: Callback<List<Todo>> {
            override fun onFailure(call: Call<List<Todo>>, t: Throwable) {
                view?.showError(t.message.toString());
            }

            override fun onResponse(call: Call<List<Todo>>, response: Response<List<Todo>>) {
                view?.showTodos(response.body() ?: emptyList())
            }
        })
    }
}