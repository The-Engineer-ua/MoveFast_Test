package com.glushkov.movefast.data

import com.glushkov.movefast.data.constants.*
import com.glushkov.movefast.data.dto.misc.LinksDto
import com.glushkov.movefast.data.dto.PhotoDto
import com.glushkov.movefast.data.dto.misc.UrlsDto
import com.glushkov.movefast.data.dto.search.SearchDto
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.junit.Assert
import org.junit.Test

class PhotosDtoTest {

    @Test
    fun testUrls_parsedCorrectly() {
        val urlsType = object : TypeToken<UrlsDto>(){}.type
        val result: UrlsDto = GsonBuilder().create().fromJson(urlsObject, urlsType)
        Assert.assertNotNull(result)
        Assert.assertEquals(result.raw, rawCheckValue)
    }

    @Test
    fun testSearch_parsedCorrectly() {
        val searchType = object : TypeToken<SearchDto>(){}.type
        val result: SearchDto = GsonBuilder().create().fromJson(searchResponse, searchType)
        Assert.assertNotNull(result)
        Assert.assertEquals(result.totalPages, totalPagesCheckValue)
        Assert.assertEquals(result.results.first().id, searchItemIdCheckValue)
    }

    @Test
    fun testLinks_parsedCorrectly() {
        val linksType = object : TypeToken<LinksDto>(){}.type
        val result: LinksDto = GsonBuilder().create().fromJson(linksObject, linksType)
        Assert.assertNotNull(result)
        Assert.assertEquals(result.download, downloadCheckValue)
    }

    @Test
    fun testPhotoDto_parsedCorrectly() {
        val photoType = object : TypeToken<PhotoDto>(){}.type
        val result: PhotoDto = GsonBuilder().create().fromJson(photoObject, photoType)
        Assert.assertNotNull(result)
        Assert.assertEquals(result.id, idCheckValue)
    }



    @Test
    fun testPhotosDto_parsedCorrectly() {
        val photoType = object : TypeToken<List<PhotoDto>>(){}.type
        val result: List<PhotoDto> = GsonBuilder().create().fromJson(fullResponse, photoType)
        Assert.assertNotNull(result)
        Assert.assertEquals(result[1].id, secondIdCheckValue)
    }
}