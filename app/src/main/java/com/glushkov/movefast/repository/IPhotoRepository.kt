package com.glushkov.movefast.repository

import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.data.view.SearchViewData

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
     * Receives paged search data of photos
     * @param page - number of page received
     * @param query - search request string
     * @return [SearchViewData]
     */
    suspend fun getSearchResults(page: Int, query: String): SearchViewData?

    /**
     * Receives data of Photo and additional information
     * @param id [String] Id of the image
     * @return [PhotoViewData]
     */
    suspend fun getPhotoInfo(id: String): PhotoViewData?
}