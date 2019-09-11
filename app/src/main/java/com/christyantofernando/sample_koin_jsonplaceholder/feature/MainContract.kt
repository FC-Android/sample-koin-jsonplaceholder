package com.christyantofernando.sample_koin_jsonplaceholder.feature

import com.christyantofernando.sample_koin_jsonplaceholder.model.Todo

class MainContract{
    interface View{
        fun showTodos(todos: List<Todo>)
        fun showError(errMsg: String)
    }

    interface Presenter{
        fun loadTodos()
    }
}