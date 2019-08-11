package com.secdev.onetouchlearning.components

import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences
import android.widget.Toast
import com.google.gson.Gson
import com.secdev.onetouchlearning.database.Database

open class AppCompatActivity : AppCompatActivity() {
    private val TAG = "AppCompatActivity"
    val db = Database()
    val gson = Gson()
    protected lateinit var SP: SharedPreferences

    protected fun toast(message: String?){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}