package com.glushkov.movefast.data.converters

import com.glushkov.movefast.data.dto.search.SearchDto
import com.glushkov.movefast.data.view.SearchViewData

fun SearchDto.toViewData() : SearchViewData {
    return SearchViewData(
        total,
        totalPages,
        results.map { it.toViewData() }
    )
}