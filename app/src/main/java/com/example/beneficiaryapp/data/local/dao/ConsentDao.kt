package com.example.beneficiaryapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.beneficiaryapp.data.local.entities.ConsentEntity

@Dao
interface ConsentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertConsent(consent: ConsentEntity)

    @Query("SELECT * FROM consents ORDER BY timestamp DESC")
    suspend fun getAllConsents(): List<ConsentEntity>
}
