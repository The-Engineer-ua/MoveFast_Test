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
import kotlin.test.assertNull
import kotlin.test.assertTrue


class PhotoRepositoryTestInfo : KoinTest {
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
            every { runBlocking { getPhotoInfo("123") } } returns photo
            every { runBlocking { getPhotoInfo("666") } } throws Exception()
        }

        declare {
            PhotoRepository(get())
        }
    }

    @Test
    fun test_ApiResponse_Single() {
        runBlocking {
            val result = repository.getPhotoInfo("123")
            assertNotNull(result)
            assertEquals(result.downloadUrl, photo.links?.download)
            //Test that proper link is passed to viewData
            assertEquals(result.thumbnailUrl, photo.urls?.small)
        }
    }

    /**
     * Negative case to test that nothing fails
     */
    @Test
    fun test_ApiResponse_Negative_Exception() {
        runBlocking {
            val result = repository.getPhotoInfo("666")
            assertNull(result)
        }
    }
}