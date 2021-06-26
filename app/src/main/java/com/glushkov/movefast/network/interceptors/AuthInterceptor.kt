package com.glushkov.movefast.network.interceptors

import com.glushkov.movefast.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

/**
 * Interceptor for adding Auth data to Unsplash requests
 */
class AuthInterceptor internal constructor() : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest = chain.request().newBuilder()
            .header("Authorization", BuildConfig.AUTH_TOKEN)
            .build()
        return chain.proceed(newRequest)
    }
}