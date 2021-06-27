package com.glushkov.movefast.repository.constants

import com.glushkov.movefast.data.dto.*
import com.glushkov.movefast.data.dto.misc.LinksDto
import com.glushkov.movefast.data.dto.misc.ProfileImageDto
import com.glushkov.movefast.data.dto.misc.UrlsDto
import com.glushkov.movefast.data.dto.misc.UserDto
import com.glushkov.movefast.data.dto.search.SearchDto

val photo: PhotoDto = PhotoDto(
    "123",
    123,
    321,
    "desc",
    "alt desc",
    UrlsDto(
        "https://raw.com",
        "https://full.com",
        "https://regular.com",
        "https://small.com",
        "https://thumb.com"
    ),
    LinksDto(
        "https://self.com",
        "https://html.com",
        "https://download.com",
        "https://download.location.com",
    ),
    132,
    false,
    UserDto(
        "test",
        ProfileImageDto(
            "small",
            "medium",
            "large"
        )
    )
)


val photo2: PhotoDto = PhotoDto(
    "321",
    321,
    222,
    "desc2",
    "alt desc2",
    UrlsDto(
        "https://raw2.com",
        "https://full2.com",
        "https://regular2.com",
        "https://small2.com",
        "https://thumb2.com"
    ),
    LinksDto(
        "https://self2.com",
        "https://html2.com",
        "https://download2.com",
        "https://download.location2.com",
    ),
    444,
    false,
    UserDto(
        "test2",
        ProfileImageDto(
            "small",
            "medium",
            "large"
        )
    )
)

val listPhotoSingle = listOf(photo)
val listPhotoMultiple = listOf(photo, photo2)
val searchSingle = SearchDto(1, 7, listOf(photo))
val searchMultiple = SearchDto(1, 3, listOf(photo, photo2))