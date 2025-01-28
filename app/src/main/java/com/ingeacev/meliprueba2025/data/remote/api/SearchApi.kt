package com.ingeacev.meliprueba2025.data.remote.api

import com.ingeacev.meliprueba2025.data.remote.model.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface SearchApi {

    @GET("sites/MLA/search?q={search}")
    suspend fun getMLAResultBySearch(
        @Path("search") searchValue: String,
    ) : SearchResponse
}