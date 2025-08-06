package com.example.beneficiaryapp.domain.usecase

import com.example.beneficiaryapp.domain.repository.UserRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(email: String, password: String): Boolean {
        return userRepository.login(email, password)
    }
}