package com.glushkov.movefast.repository.constants

import com.glushkov.movefast.data.dto.LinksDto
import com.glushkov.movefast.data.dto.PhotoDto
import com.glushkov.movefast.data.dto.UrlsDto

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
    false
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
    false
)

val listPhotoSingle = listOf(photo)
val listPhotoMultiple = listOf(photo, photo2)