package com.glushkov.movefast.data.dto

import com.google.gson.annotations.SerializedName

data class UserDto(
    val username: String,
    @SerializedName("profile_image")
    val profileImage: ProfileImageDto
)
