package com.glushkov.movefast.repository

import com.glushkov.movefast.data.constants.searchDto
import com.glushkov.movefast.network.UnsplashApi
import com.glushkov.movefast.repository.constants.*
import io.mockk.every
import io.mockk.mockkClass
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.get
import org.koin.test.inject
import org.koin.test.mock.MockProviderRule
import org.koin.test.mock.declare
import org.koin.test.mock.declareMock
import java.lang.Exception
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class PhotoRepositoryTestSearch : KoinTest {
    @get:Rule
    val mockProvider = MockProviderRule.create { clazz ->
        mockkClass(clazz)
    }

    @get:Rule
    val koinTestRule = KoinTestRule.create { }

    private val repository: PhotoRepository by inject()

    @Before
    fun init() {
        declareMock<UnsplashApi> {
            every { runBlocking { searchPhotoInfo(1, "1") } } returns searchSingle
            every { runBlocking { searchPhotoInfo(2, "2") } } returns searchMultiple
            every { runBlocking { searchPhotoInfo(3, "3") } } throws Exception("Test")
        }

        declare {
            PhotoRepository(get())
        }
    }

    @Test
    fun test_Search_ApiResponse_SingleItem() {
        runBlocking {
            val result = repository.getSearchResults(1, "1")
            assertNotNull(result)
            assertEquals(result.results.size, 1)
            assertEquals(result.results[0].downloadUrl, photo.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result.results[0].thumbnailUrl, photo.urls?.small)
        }
    }

    @Test
    fun test_Search_ApiResponse_MultipleItems() {
        runBlocking {
            val result = repository.getSearchResults(2, "2")
            assertNotNull(result)
            assertEquals(result.results[0].downloadUrl, photo.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result.results[0].thumbnailUrl, photo.urls?.small)

            assertEquals(result.results[1].downloadUrl, photo2.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result.results[1].thumbnailUrl, photo2.urls?.small)
        }
    }

    /**
     * Negative case to test that nothing fails
     */
    @Test
    fun test_Search_ApiResponse_Negative_Exception() {
        runBlocking {
            val result = repository.getSearchResults(3, "3")
            assertNull(result)
        }
    }
}