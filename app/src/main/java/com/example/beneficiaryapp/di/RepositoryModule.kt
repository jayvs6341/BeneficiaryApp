package com.example.beneficiaryapp.di

import com.example.beneficiaryapp.data.repository.ConsentRepository
import com.example.beneficiaryapp.data.repository.ConsentRepositoryImpl
import com.example.beneficiaryapp.domain.repository.UserRepository
import com.example.beneficiaryapp.domain.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(
        impl: UserRepositoryImpl
    ): UserRepository

    @Binds
    abstract fun bindConsentRepository(impl: ConsentRepositoryImpl): ConsentRepository
}
