package com.example.beneficiaryapp.data.repository

import com.example.beneficiaryapp.data.local.entities.ConsentEntity

interface ConsentRepository {
    suspend fun saveConsent(consent: ConsentEntity)
    suspend fun getAllConsents(): List<ConsentEntity>
}
