package com.christyantofernando.sample_koin_jsonplaceholder.module.activity

import com.christyantofernando.sample_koin_jsonplaceholder.feature.MainActivity
import com.christyantofernando.sample_koin_jsonplaceholder.feature.MainContract
import com.christyantofernando.sample_koin_jsonplaceholder.feature.MainPresenter
import org.koin.core.qualifier.named
import org.koin.dsl.module

val mainActivityModule = module {
    scope(named<MainActivity>()) {
        scoped<MainContract.Presenter> { (view: MainContract.View) -> MainPresenter(view) }
    }
}