package com.glushkov.movefast.data

import com.glushkov.movefast.data.converters.toViewData
import com.glushkov.movefast.data.constants.photoDto
import com.glushkov.movefast.data.constants.searchDto
import org.junit.Assert
import org.junit.Test

class ViewDataTest {
    @Test
    fun convertPhotoDtoToViewData_correct() {
        val result = photoDto.toViewData()

        Assert.assertNotNull(result)
        Assert.assertEquals(result.altDescription, photoDto.altDescription)
        Assert.assertEquals(result.thumbnailUrl, photoDto.urls?.small)
        Assert.assertEquals(result.downloadUrl, photoDto.links?.download)
        Assert.assertEquals(result.user.username, photoDto.user.username)
        Assert.assertEquals(result.user.image, photoDto.user.profileImage.medium)
    }


    @Test
    fun convertSearchDtoToViewData_correct() {
        val result = searchDto.toViewData()

        Assert.assertNotNull(result)
        Assert.assertEquals(result.total, searchDto.total)
        Assert.assertEquals(result.totalPages, searchDto.totalPages)
        Assert.assertEquals(result.results.first().downloadUrl, photoDto.links?.download)
        Assert.assertEquals(result.results.first().user.username, photoDto.user.username)
        Assert.assertEquals(result.results.first().user.image, photoDto.user.profileImage.medium)
    }
}