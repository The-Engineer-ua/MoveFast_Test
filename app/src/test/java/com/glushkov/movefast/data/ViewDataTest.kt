package com.glushkov.movefast.data

import com.glushkov.movefast.data.converters.toViewData
import com.glushkov.movefast.photoDto
import org.junit.Assert
import org.junit.Test

class ViewDataTest {
    @Test
    fun convertDtoToViewData_correct() {
        val result = photoDto.toViewData()

        Assert.assertNotNull(result)
        Assert.assertEquals(result.altDescription, photoDto.altDescription)
        Assert.assertEquals(result.thumbnailUrl, photoDto.urls?.thumb)
        Assert.assertEquals(result.downloadUrl, photoDto.links?.download)
    }
}