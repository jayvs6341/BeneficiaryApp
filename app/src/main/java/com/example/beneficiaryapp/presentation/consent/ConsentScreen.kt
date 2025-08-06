package com.example.beneficiaryapp.presentation.consent

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ConsentScreen(viewModel: ConsentViewModel = hiltViewModel()) {
    ConsentScreenUI(
        name = viewModel.name,
        consentGiven = viewModel.consentGiven,
        photoUri = viewModel.photoUri,
        onNameChange = { viewModel.name = it },
        onConsentChange = { viewModel.consentGiven = it },
        onTakePhotoClick = { /* TODO: Trigger image picker */ },
        onSubmit = { viewModel.saveConsent() }
    )
}


@Preview(showBackground = true)
@Composable
fun ConsentScreenPreview() {
    ConsentScreenUI(
        name = "Jay Vyas",
        consentGiven = true,
        photoUri = null, // try "https://via.placeholder.com/150" to test image loading
        onNameChange = {},
        onConsentChange = {},
        onTakePhotoClick = {},
        onSubmit = {}
    )
}




