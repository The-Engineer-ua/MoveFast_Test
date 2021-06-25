package com.glushkov.movefast.data.dto

import com.google.gson.annotations.SerializedName

data class PhotoDto(
    val id: String,
    val width: Int?,
    val height: Int?,
    val description: String?,
    @SerializedName("alt_description")
    val altDescription: String?,
    val urls: UrlsDto?,
    val links: LinksDto?,
    val likes: Int?,
    @SerializedName("liked_by_user")
    val isLiked: Boolean?,

)
