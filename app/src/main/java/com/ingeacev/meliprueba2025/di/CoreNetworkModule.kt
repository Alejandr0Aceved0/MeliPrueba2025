package com.ingeacev.meliprueba2025.di

import android.app.Application
import com.skgtecnologia.helios.comparendera.data.commons.model.converters.NetworkAdapters
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton
import kotlin.also
import kotlin.apply


const val BASIC_AUTH = "BASIC_AUTH"
const val BEARER_AUTH = "BEARER_AUTH"
const val CLIENT_DATA = "CLIENT_DATA"
private const val HTTP_CLIENT_TIMEOUT = 15L

@Module
@InstallIn(SingletonComponent::class)
object CoreNetworkModule {

    @Provides
    @Singleton
    fun providesMoshi(): Moshi = Moshi.Builder()
        .add(NetworkAdapters())
        .build()

    @Provides
    @Named(CLIENT_DATA)
    @Singleton
    fun providesClientDataInterceptor(application: Application): Interceptor =
        Interceptor { chain ->
            val request = chain.request()
                .newBuilder()
                .build()
            chain.proceed(request)
        }

    @Provides
    @Singleton
    internal fun providesLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }


    @Provides
    @Named(BASIC_AUTH)
    @Singleton
    internal fun providesBasicAuthorizationInterceptor(): Interceptor =
        Interceptor { chain ->
            val authenticatedRequest = chain.request()
                .newBuilder()
                .build()
            chain.proceed(authenticatedRequest)
        }

    @Provides
    @Singleton
    internal fun providesOkHttpClientBuilder(
        loggingInterceptor: HttpLoggingInterceptor?
    ): OkHttpClient.Builder = OkHttpClient.Builder().apply {
        connectTimeout(HTTP_CLIENT_TIMEOUT, TimeUnit.SECONDS)
        readTimeout(HTTP_CLIENT_TIMEOUT, TimeUnit.SECONDS)
        writeTimeout(HTTP_CLIENT_TIMEOUT, TimeUnit.SECONDS)
        loggingInterceptor?.also { addInterceptor(it) }
    }

    @Provides
    @Named(BASIC_AUTH)
    @Singleton
    internal fun providesBasicAuthorizationOkHttpClient(
        builder: OkHttpClient.Builder,
        @Named(BASIC_AUTH) authorizationInterceptor: Interceptor?,
        @Named(CLIENT_DATA) clientDataInterceptor: Interceptor
    ): OkHttpClient = with(builder) {
        authorizationInterceptor?.also {
            addInterceptor(it)
        }
        addInterceptor(clientDataInterceptor)
        build()
    }

    @Provides
    @Named(BEARER_AUTH)
    @Singleton
    internal fun providesBearerAuthorizationOkHttpClient(
        builder: OkHttpClient.Builder,
        @Named(CLIENT_DATA) clientDataInterceptor: Interceptor
    ): OkHttpClient = with(builder) {
        addInterceptor(clientDataInterceptor)
        build()
    }
}
