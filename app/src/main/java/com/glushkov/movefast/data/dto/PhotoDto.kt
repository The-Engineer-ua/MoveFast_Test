package com.glushkov.movefast.data.dto

import com.glushkov.movefast.data.dto.misc.LinksDto
import com.glushkov.movefast.data.dto.misc.UrlsDto
import com.glushkov.movefast.data.dto.misc.UserDto
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
    val user: UserDto
)
