package com.example.beneficiaryapp.presentation.consent

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.beneficiaryapp.data.local.entities.ConsentEntity
import com.example.beneficiaryapp.data.repository.ConsentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConsentViewModel @Inject constructor(
    private val repository: ConsentRepository
) : ViewModel() {

    var name by mutableStateOf("")
    var photoUri by mutableStateOf<String?>(null)
    var consentGiven by mutableStateOf(false)

    fun saveConsent() {
        viewModelScope.launch {
            repository.saveConsent(
                ConsentEntity(
                    userName = name,
                    consentGiven = consentGiven,
                    photoUri = photoUri ?: ""
                )
            )
        }
    }
}
