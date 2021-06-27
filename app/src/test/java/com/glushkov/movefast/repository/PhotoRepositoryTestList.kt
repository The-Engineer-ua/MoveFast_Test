package com.glushkov.movefast.repository

import com.glushkov.movefast.network.UnsplashApi
import com.glushkov.movefast.repository.constants.listPhotoMultiple
import com.glushkov.movefast.repository.constants.listPhotoSingle
import com.glushkov.movefast.repository.constants.photo
import com.glushkov.movefast.repository.constants.photo2
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
import kotlin.test.assertTrue


class PhotoRepositoryTestList : KoinTest {
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
            every { runBlocking { getPhotoList(1) } } returns emptyList()
            every { runBlocking { getPhotoList(2) } } returns listPhotoSingle
            every { runBlocking { getPhotoList(3) } } returns listPhotoMultiple
            every { runBlocking { getPhotoList(4) } } throws Exception("Test")
        }

        declare {
            PhotoRepository(get())
        }
    }

    @Test
    fun test_ApiResponse_Empty() {
        runBlocking {
            val result = repository.getPhotoList(1)
            assertNotNull(result)
            assertEquals(result.size, 0)
        }
    }

    @Test
    fun test_ApiResponse_SingleItem() {
        runBlocking {
            val result = repository.getPhotoList(2)
            assertNotNull(result)
            assertEquals(result[0].downloadUrl, photo.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result[0].thumbnailUrl, photo.urls?.small)
        }
    }

    @Test
    fun test_ApiResponse_MultipleItems() {
        runBlocking {
            val result = repository.getPhotoList(3)
            assertNotNull(result)
            assertEquals(result[0].downloadUrl, photo.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result[0].thumbnailUrl, photo.urls?.small)

            assertEquals(result[1].downloadUrl, photo2.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result[1].thumbnailUrl, photo2.urls?.small)
        }
    }

    /**
     * Negative case to test that nothing fails
     */
    @Test
    fun test_ApiResponse_Negative_Exception() {
        runBlocking {
            val result = repository.getPhotoList(4)
            assertNotNull(result)
            assertTrue { result.isEmpty() }
        }
    }
}