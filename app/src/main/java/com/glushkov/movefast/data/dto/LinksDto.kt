package com.glushkov.movefast.data.dto

import com.google.gson.annotations.SerializedName

data class LinksDto(
    val self: String,
    val html: String,
    val download: String,
    @SerializedName("download_location")
    val downloadLocation: String
)
