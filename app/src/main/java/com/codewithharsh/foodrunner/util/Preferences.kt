package com.codewithharsh.foodrunner.util

import android.content.Context

class Preferences(val context: Context) {

    var PRIVATE_MODE = 0
    val PREF_NAME = "FoodRunner"
    val KEY_IS_LOGGEDIN = "isLoggedIn"

    var pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
    var editor = pref.edit()

    fun setLogIn(isLoggedIn: Boolean) {
        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn)
        editor.apply()
    }

    fun isLoggedIn() : Boolean{
        return pref.getBoolean(KEY_IS_LOGGEDIN, false)
    }


}