package com.glushkov.movefast.data.view

/**
 * View data representation model
 */
data class PhotoViewData(
    val id: String,
    val description: String?,
    val altDescription: String?,
    val thumbnailUrl: String?,
    val downloadUrl: String?,
    val likes: Int?,
    val isLiked: Boolean?,
    val user: UserViewData,
    var isLocalFavorite: Boolean = false
)
