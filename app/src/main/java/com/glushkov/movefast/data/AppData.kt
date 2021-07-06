package com.glushkov.movefast.data

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class AppData(private val context: Context) {

    companion object {
        const val FAV_PREFS = "FAV_PREFS"
        const val FAVORITE_KEY = "FAVORITE_KEY"
    }

    private val prefs: SharedPreferences = context.getSharedPreferences(FAV_PREFS, MODE_PRIVATE)


    fun saveOrRemoveFavorite(id: String) {
        val elements = getFavorites()?.toMutableList()
        if (elements?.contains(id) == true) {
            elements.removeAt(elements.indexOf(id))
        }
        else {
            elements?.add(id)
        }
        prefs.edit().putString(FAVORITE_KEY, elements?.joinToString(",")).apply()
    }

    fun getFavorites() : List<String>? {
        return prefs.getString(FAVORITE_KEY, "")?.split(",")
    }
}