package com.glushkov.movefast.data.ui

data class PhotoViewData(
    val id: String,
    val description: String?,
    val altDescription: String?,
    val thumbnailUrl: String?,
    val downloadUrl: String?,
    val likes: Int?,
    val isLiked: Boolean?,
)
