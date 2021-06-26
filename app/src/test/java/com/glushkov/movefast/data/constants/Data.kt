package com.glushkov.movefast.data.constants

import com.glushkov.movefast.data.dto.*

const val rawCheckValue = "https://images.unsplash.com/photo-1624385831418-0b481546a059?ixid=MnwyNDIwMjN8MHwxfGFsbHw0fHx8fHx8Mnx8MTYyNDU3MjI2NQ&ixlib=rb-1.2.1"
const val downloadCheckValue = "https://unsplash.com/photos/nmGk6KoRZ80/download"
const val idCheckValue = "1UI_jN_e9kw"
const val secondIdCheckValue = "gdCBNvEliRs"

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