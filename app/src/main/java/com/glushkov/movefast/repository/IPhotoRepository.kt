package com.glushkov.movefast.repository

import com.glushkov.movefast.data.view.PhotoViewData

/**
 * Repository for photo processing
 */
interface IPhotoRepository {

    /**
     * Receives paged data of photos
     * @param page - number of page received
     * @return List of [PhotoViewData]
     */
    suspend fun getPhotoList(page: Int): List<PhotoViewData>

    /**
     * Receives data of Photo and additional information
     * @param id [String] Id of the image
     * @return [PhotoViewData]
     */
    suspend fun getPhotoInfo(id: String): PhotoViewData?
}