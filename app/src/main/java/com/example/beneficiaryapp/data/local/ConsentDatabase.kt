package com.example.beneficiaryapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.beneficiaryapp.data.local.dao.ConsentDao
import com.example.beneficiaryapp.data.local.entities.ConsentEntity

@Database(entities = [ConsentEntity::class], version = 1)
abstract class ConsentDatabase : RoomDatabase() {
    abstract fun consentDao(): ConsentDao
}
