package com.example.beneficiaryapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "consents")
data class ConsentEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userName: String,
    val consentGiven: Boolean,
    val photoUri: String,
    val timestamp: Long = System.currentTimeMillis()
)
