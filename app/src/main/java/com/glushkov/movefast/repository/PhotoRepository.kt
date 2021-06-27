package com.glushkov.movefast.repository

import android.util.Log
import com.glushkov.movefast.data.converters.toViewData
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.data.view.SearchViewData
import com.glushkov.movefast.network.UnsplashApi


/**
 * Repository for photo processing
 * @constructor receives remote API [UnsplashApi]
 * @param unsplashApi - Api that implements web methods for photo gathering
 */
class PhotoRepository(private val unsplashApi: UnsplashApi) : IPhotoRepository {

    override suspend fun getPhotoList(page: Int): List<PhotoViewData> {
        return try {
            unsplashApi.getPhotoList(page)
                .map { it.toViewData() }
        } catch (e: Exception) {
            Log.e(PhotoRepository::class.java.name, "Photo list request failed", e)
            emptyList()
        }
    }

    override suspend fun getSearchResults(page: Int, query: String): SearchViewData? {
        return try {
            unsplashApi.searchPhotoInfo(page, query).toViewData()
        } catch (e: Exception) {
            Log.e(PhotoRepository::class.java.name, "Search request failed", e)
            null
        }
    }

    override suspend fun getPhotoInfo(id: String): PhotoViewData? {
        return try {
            unsplashApi.getPhotoInfo(id).toViewData()
        } catch (e: Exception) {
            Log.e(PhotoRepository::class.java.name, "Photo info request failed", e)
            null
        }
    }

}