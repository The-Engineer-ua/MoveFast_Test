package com.glushkov.movefast.network

import com.glushkov.movefast.data.dto.PhotoDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Interface for access to Unsplash
 */
interface UnsplashApi {
    @GET("/photos")
    suspend fun getPhotoList(
        @Query("page")
        page: Int
    ) : List<PhotoDto>


    @GET("/photos/{id}")
    suspend fun getPhotoInfo(
        @Path("id")
        id: String
    ) : PhotoDto
}