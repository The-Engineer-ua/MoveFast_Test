package com.glushkov.movefast.data.view

data class SearchViewData(
    val total: Int,
    val totalPages: Int,
    val results: List<PhotoViewData>
)
