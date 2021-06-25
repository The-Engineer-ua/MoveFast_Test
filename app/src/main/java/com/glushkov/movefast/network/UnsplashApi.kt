package com.glushkov.movefast.network

import com.glushkov.movefast.data.dto.PhotoDto
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Interface for access to Unsplash
 */
interface UnsplashApi {
    @GET("https://api.unsplash.com/photos/{page}")
    fun getPhotoList(
        @Path("page")
        page: Int
    ) : Single<List<PhotoDto>>
}