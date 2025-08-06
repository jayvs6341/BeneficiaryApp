package com.example.beneficiaryapp.domain.repository

import android.content.SharedPreferences
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : UserRepository  {
    override fun isUserLoggedIn(): Boolean {
        return sharedPreferences.getBoolean("is_logged_in", false)
    }

    override fun login(email: String, password: String): Boolean {
        val savedEmail = sharedPreferences.getString("email", "")
        val savedPassword = sharedPreferences.getString("password", "")
        return email == savedEmail && password == savedPassword
    }

    override fun signup(email: String, password: String): Boolean {
        sharedPreferences.edit()
            .putString("email", email)
            .putString("password", password)
            .apply()
        return true
    }
}