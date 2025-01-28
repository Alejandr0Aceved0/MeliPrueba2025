package com.ingeacev.meliprueba2025.data.remote.api

import retrofit2.Retrofit

object NetworkModule {

    fun makeRetrofitService () : Retrofit.Builder {

        return Retrofit.Builder()

    }
}