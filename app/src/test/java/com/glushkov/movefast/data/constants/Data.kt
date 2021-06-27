package com.glushkov.movefast.data.constants

import com.glushkov.movefast.data.dto.*
import com.glushkov.movefast.data.dto.misc.LinksDto
import com.glushkov.movefast.data.dto.misc.ProfileImageDto
import com.glushkov.movefast.data.dto.misc.UrlsDto
import com.glushkov.movefast.data.dto.misc.UserDto
import com.glushkov.movefast.data.dto.search.SearchDto
import com.glushkov.movefast.repository.constants.photo2

const val rawCheckValue = "https://images.unsplash.com/photo-1624385831418-0b481546a059?ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1"
const val downloadCheckValue = "https://unsplash.com/photos/nmGk6KoRZ80/download"
const val idCheckValue = "1UI_jN_e9kw"
const val secondIdCheckValue = "gdCBNvEliRs"
const val totalPagesCheckValue = 7
const val searchItemIdCheckValue = "eOLpJytrbsQ"

val photoDto = PhotoDto(
    "1UI_jN_e9kw",
            4608,
    3456,
    null,
    "man in white crew neck shirt holding yellow plastic bottle beside woman in blue blazer",
    UrlsDto(
         "https://images.unsplash.com/photo-1622495805440-0075dfea3318?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1",
         "https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85",
         "https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080",
         "https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400",
         "https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200"
            ),
    LinksDto(
            "https://api.unsplash.com/photos/1UI_jN_e9kw",
            "https://unsplash.com/photos/1UI_jN_e9kw",
            "https://unsplash.com/photos/1UI_jN_e9kw/download",
            "https://api.unsplash.com/photos/1UI_jN_e9kw/download?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ",
    ),
            16,
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

val searchDto = SearchDto(
    1, 7, listOf(photoDto)
)


const val urlsObject = "{\n" +
        "      \"raw\": \"https://images.unsplash.com/photo-1624385831418-0b481546a059?ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1\",\n" +
        "      \"full\": \"https://images.unsplash.com/photo-1624385831418-0b481546a059?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85\",\n" +
        "      \"regular\": \"https://images.unsplash.com/photo-1624385831418-0b481546a059?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080\",\n" +
        "      \"small\": \"https://images.unsplash.com/photo-1624385831418-0b481546a059?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400\",\n" +
        "      \"thumb\": \"https://images.unsplash.com/photo-1624385831418-0b481546a059?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200\"\n" +
        "    }"

const val linksObject = "{\n" +
        "      \"self\": \"https://api.unsplash.com/photos/nmGk6KoRZ80\",\n" +
        "      \"html\": \"https://unsplash.com/photos/nmGk6KoRZ80\",\n" +
        "      \"download\": \"https://unsplash.com/photos/nmGk6KoRZ80/download\",\n" +
        "      \"download_location\": \"https://api.unsplash.com/photos/nmGk6KoRZ80/download?ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ\"\n" +
        "    }"

const val photoObject = "{\n" +
        "    \"id\": \"1UI_jN_e9kw\",\n" +
        "    \"created_at\": \"2021-05-31T17:17:51-04:00\",\n" +
        "    \"updated_at\": \"2021-06-24T00:59:11-04:00\",\n" +
        "    \"promoted_at\": null,\n" +
        "    \"width\": 4608,\n" +
        "    \"height\": 3456,\n" +
        "    \"color\": \"#d9d9d9\",\n" +
        "    \"blur_hash\": \"LSJ8Y9%NozD%~qRjRjt6E2RjoJ%M\",\n" +
        "    \"description\": null,\n" +
        "    \"alt_description\": \"man in white crew neck shirt holding yellow plastic bottle beside woman in blue blazer\",\n" +
        "    \"urls\": {\n" +
        "      \"raw\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1\",\n" +
        "      \"full\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85\",\n" +
        "      \"regular\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080\",\n" +
        "      \"small\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400\",\n" +
        "      \"thumb\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200\"\n" +
        "    },\n" +
        "    \"links\": {\n" +
        "      \"self\": \"https://api.unsplash.com/photos/1UI_jN_e9kw\",\n" +
        "      \"html\": \"https://unsplash.com/photos/1UI_jN_e9kw\",\n" +
        "      \"download\": \"https://unsplash.com/photos/1UI_jN_e9kw/download\",\n" +
        "      \"download_location\": \"https://api.unsplash.com/photos/1UI_jN_e9kw/download?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ\"\n" +
        "    },\n" +
        "    \"categories\": [],\n" +
        "    \"likes\": 16,\n" +
        "    \"liked_by_user\": false,\n" +
        "    \"current_user_collections\": [],\n" +
        "    \"sponsorship\": {\n" +
        "      \"impression_urls\": [],\n" +
        "      \"tagline\": \"Flavored by Culture\",\n" +
        "      \"tagline_url\": \"https://jarritos.com/\",\n" +
        "      \"sponsor\": {\n" +
        "        \"id\": \"GV2cL0IFBvQ\",\n" +
        "        \"updated_at\": \"2021-06-24T17:39:58-04:00\",\n" +
        "        \"username\": \"jarritos\",\n" +
        "        \"name\": \"Jarritos Mexican Soda\",\n" +
        "        \"first_name\": \"Jarritos\",\n" +
        "        \"last_name\": \"Mexican Soda\",\n" +
        "        \"twitter_username\": \"jarritos\",\n" +
        "        \"portfolio_url\": \"https://www.jarritos.com\",\n" +
        "        \"bio\": \"Natural Flavored Sodas made with real sugar that are available in 13 Super Good flavors!\",\n" +
        "        \"location\": null,\n" +
        "        \"links\": {\n" +
        "          \"self\": \"https://api.unsplash.com/users/jarritos\",\n" +
        "          \"html\": \"https://unsplash.com/@jarritos\",\n" +
        "          \"photos\": \"https://api.unsplash.com/users/jarritos/photos\",\n" +
        "          \"likes\": \"https://api.unsplash.com/users/jarritos/likes\",\n" +
        "          \"portfolio\": \"https://api.unsplash.com/users/jarritos/portfolio\",\n" +
        "          \"following\": \"https://api.unsplash.com/users/jarritos/following\",\n" +
        "          \"followers\": \"https://api.unsplash.com/users/jarritos/followers\"\n" +
        "        },\n" +
        "        \"profile_image\": {\n" +
        "          \"small\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "          \"medium\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "          \"large\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "        },\n" +
        "        \"instagram_username\": \"jarritos\",\n" +
        "        \"total_collections\": 0,\n" +
        "        \"total_likes\": 7,\n" +
        "        \"total_photos\": 361,\n" +
        "        \"accepted_tos\": true,\n" +
        "        \"for_hire\": false\n" +
        "      }\n" +
        "    },\n" +
        "    \"user\": {\n" +
        "      \"id\": \"GV2cL0IFBvQ\",\n" +
        "      \"updated_at\": \"2021-06-24T17:39:58-04:00\",\n" +
        "      \"username\": \"jarritos\",\n" +
        "      \"name\": \"Jarritos Mexican Soda\",\n" +
        "      \"first_name\": \"Jarritos\",\n" +
        "      \"last_name\": \"Mexican Soda\",\n" +
        "      \"twitter_username\": \"jarritos\",\n" +
        "      \"portfolio_url\": \"https://www.jarritos.com\",\n" +
        "      \"bio\": \"Natural Flavored Sodas made with real sugar that are available in 13 Super Good flavors!\",\n" +
        "      \"location\": null,\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/users/jarritos\",\n" +
        "        \"html\": \"https://unsplash.com/@jarritos\",\n" +
        "        \"photos\": \"https://api.unsplash.com/users/jarritos/photos\",\n" +
        "        \"likes\": \"https://api.unsplash.com/users/jarritos/likes\",\n" +
        "        \"portfolio\": \"https://api.unsplash.com/users/jarritos/portfolio\",\n" +
        "        \"following\": \"https://api.unsplash.com/users/jarritos/following\",\n" +
        "        \"followers\": \"https://api.unsplash.com/users/jarritos/followers\"\n" +
        "      },\n" +
        "      \"profile_image\": {\n" +
        "        \"small\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "        \"medium\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "        \"large\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "      },\n" +
        "      \"instagram_username\": \"jarritos\",\n" +
        "      \"total_collections\": 0,\n" +
        "      \"total_likes\": 7,\n" +
        "      \"total_photos\": 361,\n" +
        "      \"accepted_tos\": true,\n" +
        "      \"for_hire\": false\n" +
        "    }\n" +
        "  }"

const val fullResponse = "[\n" +
        "  {\n" +
        "    \"id\": \"1UI_jN_e9kw\",\n" +
        "    \"created_at\": \"2021-05-31T17:17:51-04:00\",\n" +
        "    \"updated_at\": \"2021-06-24T00:59:11-04:00\",\n" +
        "    \"promoted_at\": null,\n" +
        "    \"width\": 4608,\n" +
        "    \"height\": 3456,\n" +
        "    \"color\": \"#d9d9d9\",\n" +
        "    \"blur_hash\": \"LSJ8Y9%NozD%~qRjRjt6E2RjoJ%M\",\n" +
        "    \"description\": null,\n" +
        "    \"alt_description\": \"man in white crew neck shirt holding yellow plastic bottle beside woman in blue blazer\",\n" +
        "    \"urls\": {\n" +
        "      \"raw\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1\",\n" +
        "      \"full\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85\",\n" +
        "      \"regular\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080\",\n" +
        "      \"small\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400\",\n" +
        "      \"thumb\": \"https://images.unsplash.com/photo-1622495805440-0075dfea3318?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200\"\n" +
        "    },\n" +
        "    \"links\": {\n" +
        "      \"self\": \"https://api.unsplash.com/photos/1UI_jN_e9kw\",\n" +
        "      \"html\": \"https://unsplash.com/photos/1UI_jN_e9kw\",\n" +
        "      \"download\": \"https://unsplash.com/photos/1UI_jN_e9kw/download\",\n" +
        "      \"download_location\": \"https://api.unsplash.com/photos/1UI_jN_e9kw/download?ixid=MnwyNDIwMjN8MXwxfGFsbHwxfHx8fHx8Mnx8MTYyNDU3MjI2NQ\"\n" +
        "    },\n" +
        "    \"categories\": [],\n" +
        "    \"likes\": 16,\n" +
        "    \"liked_by_user\": false,\n" +
        "    \"current_user_collections\": [],\n" +
        "    \"sponsorship\": {\n" +
        "      \"impression_urls\": [],\n" +
        "      \"tagline\": \"Flavored by Culture\",\n" +
        "      \"tagline_url\": \"https://jarritos.com/\",\n" +
        "      \"sponsor\": {\n" +
        "        \"id\": \"GV2cL0IFBvQ\",\n" +
        "        \"updated_at\": \"2021-06-24T17:39:58-04:00\",\n" +
        "        \"username\": \"jarritos\",\n" +
        "        \"name\": \"Jarritos Mexican Soda\",\n" +
        "        \"first_name\": \"Jarritos\",\n" +
        "        \"last_name\": \"Mexican Soda\",\n" +
        "        \"twitter_username\": \"jarritos\",\n" +
        "        \"portfolio_url\": \"https://www.jarritos.com\",\n" +
        "        \"bio\": \"Natural Flavored Sodas made with real sugar that are available in 13 Super Good flavors!\",\n" +
        "        \"location\": null,\n" +
        "        \"links\": {\n" +
        "          \"self\": \"https://api.unsplash.com/users/jarritos\",\n" +
        "          \"html\": \"https://unsplash.com/@jarritos\",\n" +
        "          \"photos\": \"https://api.unsplash.com/users/jarritos/photos\",\n" +
        "          \"likes\": \"https://api.unsplash.com/users/jarritos/likes\",\n" +
        "          \"portfolio\": \"https://api.unsplash.com/users/jarritos/portfolio\",\n" +
        "          \"following\": \"https://api.unsplash.com/users/jarritos/following\",\n" +
        "          \"followers\": \"https://api.unsplash.com/users/jarritos/followers\"\n" +
        "        },\n" +
        "        \"profile_image\": {\n" +
        "          \"small\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "          \"medium\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "          \"large\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "        },\n" +
        "        \"instagram_username\": \"jarritos\",\n" +
        "        \"total_collections\": 0,\n" +
        "        \"total_likes\": 7,\n" +
        "        \"total_photos\": 361,\n" +
        "        \"accepted_tos\": true,\n" +
        "        \"for_hire\": false\n" +
        "      }\n" +
        "    },\n" +
        "    \"user\": {\n" +
        "      \"id\": \"GV2cL0IFBvQ\",\n" +
        "      \"updated_at\": \"2021-06-24T17:39:58-04:00\",\n" +
        "      \"username\": \"jarritos\",\n" +
        "      \"name\": \"Jarritos Mexican Soda\",\n" +
        "      \"first_name\": \"Jarritos\",\n" +
        "      \"last_name\": \"Mexican Soda\",\n" +
        "      \"twitter_username\": \"jarritos\",\n" +
        "      \"portfolio_url\": \"https://www.jarritos.com\",\n" +
        "      \"bio\": \"Natural Flavored Sodas made with real sugar that are available in 13 Super Good flavors!\",\n" +
        "      \"location\": null,\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/users/jarritos\",\n" +
        "        \"html\": \"https://unsplash.com/@jarritos\",\n" +
        "        \"photos\": \"https://api.unsplash.com/users/jarritos/photos\",\n" +
        "        \"likes\": \"https://api.unsplash.com/users/jarritos/likes\",\n" +
        "        \"portfolio\": \"https://api.unsplash.com/users/jarritos/portfolio\",\n" +
        "        \"following\": \"https://api.unsplash.com/users/jarritos/following\",\n" +
        "        \"followers\": \"https://api.unsplash.com/users/jarritos/followers\"\n" +
        "      },\n" +
        "      \"profile_image\": {\n" +
        "        \"small\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "        \"medium\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "        \"large\": \"https://images.unsplash.com/profile-1622240285757-b65539d1fbe2image?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "      },\n" +
        "      \"instagram_username\": \"jarritos\",\n" +
        "      \"total_collections\": 0,\n" +
        "      \"total_likes\": 7,\n" +
        "      \"total_photos\": 361,\n" +
        "      \"accepted_tos\": true,\n" +
        "      \"for_hire\": false\n" +
        "    }\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"gdCBNvEliRs\",\n" +
        "    \"created_at\": \"2021-06-22T23:20:00-04:00\",\n" +
        "    \"updated_at\": \"2021-06-24T17:36:02-04:00\",\n" +
        "    \"promoted_at\": \"2021-06-24T17:36:02-04:00\",\n" +
        "    \"width\": 5976,\n" +
        "    \"height\": 3984,\n" +
        "    \"color\": \"#262626\",\n" +
        "    \"blur_hash\": \"LGB:BAt70f0fXRxaR*RkE2Na%1xa\",\n" +
        "    \"description\": null,\n" +
        "    \"alt_description\": \"brown concrete statue near green trees during daytime\",\n" +
        "    \"urls\": {\n" +
        "      \"raw\": \"https://images.unsplash.com/photo-1624418304676-e1b6ff23e780?ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1\",\n" +
        "      \"full\": \"https://images.unsplash.com/photo-1624418304676-e1b6ff23e780?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85\",\n" +
        "      \"regular\": \"https://images.unsplash.com/photo-1624418304676-e1b6ff23e780?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080\",\n" +
        "      \"small\": \"https://images.unsplash.com/photo-1624418304676-e1b6ff23e780?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400\",\n" +
        "      \"thumb\": \"https://images.unsplash.com/photo-1624418304676-e1b6ff23e780?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200\"\n" +
        "    },\n" +
        "    \"links\": {\n" +
        "      \"self\": \"https://api.unsplash.com/photos/gdCBNvEliRs\",\n" +
        "      \"html\": \"https://unsplash.com/photos/gdCBNvEliRs\",\n" +
        "      \"download\": \"https://unsplash.com/photos/gdCBNvEliRs/download\",\n" +
        "      \"download_location\": \"https://api.unsplash.com/photos/gdCBNvEliRs/download?ixid=MnwyNDIwMjN8MHwxfGFsbHwyfHx8fHx8Mnx8MTYyNDU3MjI2NQ\"\n" +
        "    },\n" +
        "    \"categories\": [],\n" +
        "    \"likes\": 3,\n" +
        "    \"liked_by_user\": false,\n" +
        "    \"current_user_collections\": [],\n" +
        "    \"sponsorship\": null,\n" +
        "    \"user\": {\n" +
        "      \"id\": \"BqHVC6Ost6Y\",\n" +
        "      \"updated_at\": \"2021-06-24T17:45:10-04:00\",\n" +
        "      \"username\": \"star7a\",\n" +
        "      \"name\": \"Edwin Chen\",\n" +
        "      \"first_name\": \"Edwin\",\n" +
        "      \"last_name\": \"Chen\",\n" +
        "      \"twitter_username\": null,\n" +
        "      \"portfolio_url\": null,\n" +
        "      \"bio\": null,\n" +
        "      \"location\": \"SHENZHEN,CHINA\",\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/users/star7a\",\n" +
        "        \"html\": \"https://unsplash.com/@star7a\",\n" +
        "        \"photos\": \"https://api.unsplash.com/users/star7a/photos\",\n" +
        "        \"likes\": \"https://api.unsplash.com/users/star7a/likes\",\n" +
        "        \"portfolio\": \"https://api.unsplash.com/users/star7a/portfolio\",\n" +
        "        \"following\": \"https://api.unsplash.com/users/star7a/following\",\n" +
        "        \"followers\": \"https://api.unsplash.com/users/star7a/followers\"\n" +
        "      },\n" +
        "      \"profile_image\": {\n" +
        "        \"small\": \"https://images.unsplash.com/profile-1624003427409-40ebc97d400cimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "        \"medium\": \"https://images.unsplash.com/profile-1624003427409-40ebc97d400cimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "        \"large\": \"https://images.unsplash.com/profile-1624003427409-40ebc97d400cimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "      },\n" +
        "      \"instagram_username\": null,\n" +
        "      \"total_collections\": 0,\n" +
        "      \"total_likes\": 1,\n" +
        "      \"total_photos\": 66,\n" +
        "      \"accepted_tos\": true,\n" +
        "      \"for_hire\": false\n" +
        "    }\n" +
        "  },\n" +
        "  {\n" +
        "    \"id\": \"M6QKieQnyr8\",\n" +
        "    \"created_at\": \"2021-06-23T23:37:14-04:00\",\n" +
        "    \"updated_at\": \"2021-06-24T17:03:01-04:00\",\n" +
        "    \"promoted_at\": \"2021-06-24T17:03:01-04:00\",\n" +
        "    \"width\": 3838,\n" +
        "    \"height\": 5117,\n" +
        "    \"color\": \"#d9d9d9\",\n" +
        "    \"blur_hash\": \"LvJbBUWVWBof_NWBj[j[s:WBofj[\",\n" +
        "    \"description\": null,\n" +
        "    \"alt_description\": \"lake near mountain under cloudy sky during daytime\",\n" +
        "    \"urls\": {\n" +
        "      \"raw\": \"https://images.unsplash.com/photo-1624505659425-123455e48da8?ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1\",\n" +
        "      \"full\": \"https://images.unsplash.com/photo-1624505659425-123455e48da8?crop=entropy&cs=srgb&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=85\",\n" +
        "      \"regular\": \"https://images.unsplash.com/photo-1624505659425-123455e48da8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=1080\",\n" +
        "      \"small\": \"https://images.unsplash.com/photo-1624505659425-123455e48da8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=400\",\n" +
        "      \"thumb\": \"https://images.unsplash.com/photo-1624505659425-123455e48da8?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1&q=80&w=200\"\n" +
        "    },\n" +
        "    \"links\": {\n" +
        "      \"self\": \"https://api.unsplash.com/photos/M6QKieQnyr8\",\n" +
        "      \"html\": \"https://unsplash.com/photos/M6QKieQnyr8\",\n" +
        "      \"download\": \"https://unsplash.com/photos/M6QKieQnyr8/download\",\n" +
        "      \"download_location\": \"https://api.unsplash.com/photos/M6QKieQnyr8/download?ixid=MnwyNDIwMjN8MHwxfGFsbHwzfHx8fHx8Mnx8MTYyNDU3MjI2NQ\"\n" +
        "    },\n" +
        "    \"categories\": [],\n" +
        "    \"likes\": 9,\n" +
        "    \"liked_by_user\": false,\n" +
        "    \"current_user_collections\": [],\n" +
        "    \"sponsorship\": null,\n" +
        "    \"user\": {\n" +
        "      \"id\": \"Q9Ig7Srx2OI\",\n" +
        "      \"updated_at\": \"2021-06-24T17:50:11-04:00\",\n" +
        "      \"username\": \"bantersnaps\",\n" +
        "      \"name\": \"bantersnaps\",\n" +
        "      \"first_name\": \"bantersnaps\",\n" +
        "      \"last_name\": null,\n" +
        "      \"twitter_username\": \"ReddAngelo\",\n" +
        "      \"portfolio_url\": null,\n" +
        "      \"bio\": \"Edmonton Photographer. Instagram @BanterSnaps\\r\\n For canvas prints visit https://www.bantersnaps.com/\",\n" +
        "      \"location\": \"Edmonton, Alberta\",\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/users/bantersnaps\",\n" +
        "        \"html\": \"https://unsplash.com/@bantersnaps\",\n" +
        "        \"photos\": \"https://api.unsplash.com/users/bantersnaps/photos\",\n" +
        "        \"likes\": \"https://api.unsplash.com/users/bantersnaps/likes\",\n" +
        "        \"portfolio\": \"https://api.unsplash.com/users/bantersnaps/portfolio\",\n" +
        "        \"following\": \"https://api.unsplash.com/users/bantersnaps/following\",\n" +
        "        \"followers\": \"https://api.unsplash.com/users/bantersnaps/followers\"\n" +
        "      },\n" +
        "      \"profile_image\": {\n" +
        "        \"small\": \"https://images.unsplash.com/profile-1607313615203-a9fee0715fccimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32\",\n" +
        "        \"medium\": \"https://images.unsplash.com/profile-1607313615203-a9fee0715fccimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64\",\n" +
        "        \"large\": \"https://images.unsplash.com/profile-1607313615203-a9fee0715fccimage?ixlib=rb-1.2.1&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128\"\n" +
        "      },\n" +
        "      \"instagram_username\": \"bantersnaps\",\n" +
        "      \"total_collections\": 0,\n" +
        "      \"total_likes\": 247,\n" +
        "      \"total_photos\": 492,\n" +
        "      \"accepted_tos\": true,\n" +
        "      \"for_hire\": true\n" +
        "    }\n" +
        "  }\n" +
        "]"

const val searchResponse = "{\n" +
        "  \"total\": 133,\n" +
        "  \"total_pages\": 7,\n" +
        "  \"results\": [\n" +
        "    {\n" +
        "      \"id\": \"eOLpJytrbsQ\",\n" +
        "      \"created_at\": \"2014-11-18T14:35:36-05:00\",\n" +
        "      \"width\": 4000,\n" +
        "      \"height\": 3000,\n" +
        "      \"color\": \"#A7A2A1\",\n" +
        "      \"blur_hash\": \"LaLXMa9Fx[D%~q%MtQM|kDRjtRIU\",\n" +
        "      \"likes\": 286,\n" +
        "      \"liked_by_user\": false,\n" +
        "      \"description\": \"A man drinking a coffee.\",\n" +
        "      \"user\": {\n" +
        "        \"id\": \"Ul0QVz12Goo\",\n" +
        "        \"username\": \"ugmonk\",\n" +
        "        \"name\": \"Jeff Sheldon\",\n" +
        "        \"first_name\": \"Jeff\",\n" +
        "        \"last_name\": \"Sheldon\",\n" +
        "        \"instagram_username\": \"instantgrammer\",\n" +
        "        \"twitter_username\": \"ugmonk\",\n" +
        "        \"portfolio_url\": \"http://ugmonk.com/\",\n" +
        "        \"profile_image\": {\n" +
        "          \"small\": \"https://images.unsplash.com/profile-1441298803695-accd94000cac?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=7cfe3b93750cb0c93e2f7caec08b5a41\",\n" +
        "          \"medium\": \"https://images.unsplash.com/profile-1441298803695-accd94000cac?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=5a9dc749c43ce5bd60870b129a40902f\",\n" +
        "          \"large\": \"https://images.unsplash.com/profile-1441298803695-accd94000cac?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=32085a077889586df88bfbe406692202\"\n" +
        "        },\n" +
        "        \"links\": {\n" +
        "          \"self\": \"https://api.unsplash.com/users/ugmonk\",\n" +
        "          \"html\": \"http://unsplash.com/@ugmonk\",\n" +
        "          \"photos\": \"https://api.unsplash.com/users/ugmonk/photos\",\n" +
        "          \"likes\": \"https://api.unsplash.com/users/ugmonk/likes\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"current_user_collections\": [],\n" +
        "      \"urls\": {\n" +
        "        \"raw\": \"https://images.unsplash.com/photo-1416339306562-f3d12fefd36f\",\n" +
        "        \"full\": \"https://hd.unsplash.com/photo-1416339306562-f3d12fefd36f\",\n" +
        "        \"regular\": \"https://images.unsplash.com/photo-1416339306562-f3d12fefd36f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&s=92f3e02f63678acc8416d044e189f515\",\n" +
        "        \"small\": \"https://images.unsplash.com/photo-1416339306562-f3d12fefd36f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&s=263af33585f9d32af39d165b000845eb\",\n" +
        "        \"thumb\": \"https://images.unsplash.com/photo-1416339306562-f3d12fefd36f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&s=8aae34cf35df31a592f0bef16e6342ef\"\n" +
        "      },\n" +
        "      \"links\": {\n" +
        "        \"self\": \"https://api.unsplash.com/photos/eOLpJytrbsQ\",\n" +
        "        \"html\": \"http://unsplash.com/photos/eOLpJytrbsQ\",\n" +
        "        \"download\": \"http://unsplash.com/photos/eOLpJytrbsQ/download\"\n" +
        "      }\n" +
        "    }\n" +
        "  ]\n" +
        "}\n" +
        "\n"