package com.glushkov.movefast.data.converters

import com.glushkov.movefast.data.dto.PhotoDto
import com.glushkov.movefast.data.view.PhotoViewData

/**
 * Extension function to convert response to view data model
 * @return [PhotoViewData]
 */
fun PhotoDto.toViewData() : PhotoViewData {
    return PhotoViewData(this.id,
        this.description,
        this.altDescription,
        this.urls?.small,
        this.links?.download,
        this.likes,
        this.isLiked
    )
}