package com.example.beneficiaryapp.domain.usecase

import com.example.beneficiaryapp.domain.repository.UserRepository
import javax.inject.Inject

class CheckLoginStatusUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Boolean {
        return userRepository.isUserLoggedIn()
    }
}