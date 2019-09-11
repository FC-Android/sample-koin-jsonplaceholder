package com.christyantofernando.sample_koin_jsonplaceholder.module

import com.christyantofernando.sample_koin_jsonplaceholder.service.TodoService
import com.christyantofernando.sample_koin_jsonplaceholder.util.NetworkUtil
import org.koin.dsl.module
import retrofit2.Retrofit

val appModule = module {
    /**
     * SINGLETON MODULES
     */
    // Network modules
    single<Retrofit>{ NetworkUtil.getRetrofit() }
    single<TodoService> { get<Retrofit>().create(TodoService::class.java) }
}