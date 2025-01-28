package com.ingeacev.meliprueba2025.di.search

import com.ingeacev.meliprueba2025.data.commons.constants.RemoteConstants.API
import com.ingeacev.meliprueba2025.data.commons.constants.RemoteConstants.API_ROOT_URL
import com.ingeacev.meliprueba2025.data.commons.constants.RemoteConstants.API_VERSION
import com.ingeacev.meliprueba2025.data.remote.api.SearchApi
import com.ingeacev.meliprueba2025.di.CoreNetworkModule
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton

private const val API_MLA_URL =
    API_ROOT_URL
        .plus(API)
        .plus(API_VERSION)

const val MLA = "MLA"

const val BASIC_AUTH = "BASIC_AUTH"
const val BEARER_AUTH = "BEARER_AUTH"
const val CLIENT_DATA = "CLIENT_DATA"

private const val HTTP_CLIENT_TIMEOUT = 15L

@Module(includes = [CoreNetworkModule::class])
@InstallIn(SingletonComponent::class)
object SearchNetworkModule {

    @Provides
    @Named(MLA)
    @Singleton
    internal fun providesRetrofit(
        moshi: Moshi,
        @Named(BEARER_AUTH) okHttpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(API_MLA_URL)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()

    @Provides
    internal fun providesApi(@Named(MLA) retrofit: Retrofit): SearchApi =
        retrofit.create(SearchApi::class.java)
}
