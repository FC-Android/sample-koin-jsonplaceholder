package com.christyantofernando.sample_koin_jsonplaceholder.feature

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.christyantofernando.sample_koin_jsonplaceholder.R
import org.koin.core.KoinComponent
import org.koin.core.module.Module
import org.koin.core.scope.Scope
import org.koin.core.Koin
import org.koin.core.qualifier.named

abstract class BaseActivity : AppCompatActivity(), KoinComponent {
    @LayoutRes
    abstract fun layoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes())
    }
}