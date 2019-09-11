package com.christyantofernando.sample_koin_jsonplaceholder.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.christyantofernando.sample_koin_jsonplaceholder.R
import com.christyantofernando.sample_koin_jsonplaceholder.model.Todo
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.currentScope
import org.koin.core.KoinComponent
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named

class MainActivity : BaseActivity(), MainContract.View {
    override fun layoutRes(): Int = R.layout.activity_main

    private val mainPresenter: MainContract.Presenter by currentScope.inject { parametersOf(this) }

    override fun showTodos(todos: List<Todo>) = Toast.makeText(this, "Loaded ${todos.size} todos", Toast.LENGTH_LONG).show()
    override fun showError(errMsg: String) = Toast.makeText(this, errMsg, Toast.LENGTH_LONG).show()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.loadTodos()
    }
}
