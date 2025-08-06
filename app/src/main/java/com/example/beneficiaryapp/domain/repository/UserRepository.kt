package com.example.beneficiaryapp.domain.repository

interface UserRepository {
    fun isUserLoggedIn(): Boolean
    fun login(email: String, password: String): Boolean
    fun signup(email: String, password: String): Boolean
}