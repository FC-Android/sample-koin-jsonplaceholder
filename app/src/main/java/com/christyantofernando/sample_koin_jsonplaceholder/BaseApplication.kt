package com.christyantofernando.sample_koin_jsonplaceholder

import android.app.Application
import com.christyantofernando.sample_koin_jsonplaceholder.module.activity.mainActivityModule
import com.christyantofernando.sample_koin_jsonplaceholder.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@BaseApplication)
            modules(listOf(
                appModule,
                mainActivityModule))
        }
    }
}