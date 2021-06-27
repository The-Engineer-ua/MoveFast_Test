package com.glushkov.movefast.data.dto.search

import com.glushkov.movefast.data.dto.PhotoDto
import com.google.gson.annotations.SerializedName

data class SearchDto(
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    val results: List<PhotoDto>
)
