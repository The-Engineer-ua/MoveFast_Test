package com.glushkov.movefast.data.converters

import com.glushkov.movefast.data.dto.PhotoDto
import com.glushkov.movefast.data.ui.PhotoViewData

fun PhotoDto.toViewData() : PhotoViewData {
    return PhotoViewData(this.id,
        this.description,
        this.altDescription,
        this.urls?.thumb,
        this.links?.download,
        this.likes,
        this.isLiked
    )
}