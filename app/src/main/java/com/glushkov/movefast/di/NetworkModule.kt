package com.glushkov.movefast.di

import com.glushkov.movefast.BuildConfig
import com.glushkov.movefast.network.UnsplashApi
import com.glushkov.movefast.network.interceptors.AuthInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Network objects creation module
 */
val networkModule = module {
    single<Gson>(createdAtStart = true) {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setLenient()
        gsonBuilder.create()
    }

    /**
     * Cache requests
     */
    single(createdAtStart = true) {
        val cacheSize = 10 * 1024 * 1024
        Cache(androidContext().cacheDir, cacheSize.toLong())
    }

    single(named("authInterceptor")) {
        AuthInterceptor()
    }

    //OkHttp
    single {
        val builder = OkHttpClient.Builder()
            .cache(get())
            .addInterceptor(get<AuthInterceptor>(named("authInterceptor")))
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
        builder.build()
    }

    //Retrofit
    single {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(get()))
            .baseUrl(BuildConfig.BASE_URL)
            .client(get())
            .build()
    }

    //Api endpoint
    single {
        get<Retrofit>().create(UnsplashApi::class.java)
    }
}