package com.christyantofernando.sample_koin_jsonplaceholder.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtil {
    companion object{
        var _retrofit: Retrofit? = null

        fun getRetrofit(): Retrofit{
            if(_retrofit == null) _retrofit = Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            return _retrofit!!;
        }
    }
}