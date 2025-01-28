package com.ingeacev.meliprueba2025.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServiceFactory {



    fun makeRetrofitService(): SearchApi {
        return Retrofit.Builder()
            .baseUrl("https://api.mercadolibre.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(SearchApi::class.java)
    }
}