package com.example.beneficiaryapp.presentation.auth

import androidx.lifecycle.ViewModel
import com.example.beneficiaryapp.domain.usecase.CheckLoginStatusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.beneficiaryapp.domain.usecase.LoginUseCase
import com.example.beneficiaryapp.domain.usecase.SignupUseCase
import javax.inject.Inject
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val checkLoginStatusClass: CheckLoginStatusUseCase,
    private val loginUseCase: LoginUseCase,
    private val signupUseCase: SignupUseCase
) : ViewModel() {

    private val _isLoggedIn = MutableStateFlow<Boolean?>(null)
    val isLoggedIn: StateFlow<Boolean?> = _isLoggedIn

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var message by mutableStateOf("")

    fun checkLoginStatus() {
        _isLoggedIn.value = checkLoginStatusClass()
    }

    fun login() {
        message = if (loginUseCase(email, password)) {
            "Login Successful"
        } else {
            "Invalid Credentials"
        }
    }

    fun signup() {
        message = if (signupUseCase(email, password)) {
            "Signup Successful"
        } else {
            "Signup Failed"
        }
    }
}