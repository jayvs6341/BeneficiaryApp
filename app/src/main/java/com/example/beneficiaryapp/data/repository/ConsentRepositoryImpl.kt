package com.example.beneficiaryapp.data.repository

import com.example.beneficiaryapp.data.local.dao.ConsentDao
import com.example.beneficiaryapp.data.local.entities.ConsentEntity
import javax.inject.Inject

class ConsentRepositoryImpl @Inject constructor(
    private val dao: ConsentDao
) : ConsentRepository {
    override suspend fun saveConsent(consent: ConsentEntity) = dao.insertConsent(consent)
    override suspend fun getAllConsents() = dao.getAllConsents()
}
