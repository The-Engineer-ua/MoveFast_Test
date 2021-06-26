package com.glushkov.movefast.repository

import com.glushkov.movefast.data.converters.toViewData
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.network.UnsplashApi


/**
 * Repository for photo processing
 * @constructor receives remote API [UnsplashApi]
 * @param unsplashApi - Api that implements web methods for photo gathering
 */
class PhotoRepository(private val unsplashApi: UnsplashApi) : IPhotoRepository {

    override suspend fun getPhotoList(page: Int): List<PhotoViewData> {
        return unsplashApi.getPhotoList(page)
            .map { it.toViewData() }
    }

    override suspend fun getPhotoInfo(id: String): PhotoViewData {
        return unsplashApi.getPhotoInfo(id).toViewData()
    }

}