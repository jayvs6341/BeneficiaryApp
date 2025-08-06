package com.example.beneficiaryapp.di

import android.content.Context
import androidx.room.Room
import com.example.beneficiaryapp.data.local.ConsentDatabase
import com.example.beneficiaryapp.data.local.dao.ConsentDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): ConsentDatabase {
        return Room.databaseBuilder(
            context,
            ConsentDatabase::class.java,
            "consent_db"
        ).build()
    }

    @Provides
    fun provideConsentDao(db: ConsentDatabase): ConsentDao = db.consentDao()
}
