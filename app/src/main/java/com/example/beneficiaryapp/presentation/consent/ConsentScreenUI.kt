package com.example.beneficiaryapp.presentation.consent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ConsentScreenUI(
    name: String,
    consentGiven: Boolean,
    photoUri: String?,
    onNameChange: (String) -> Unit,
    onConsentChange: (Boolean) -> Unit,
    onTakePhotoClick: () -> Unit,
    onSubmit: () -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text("Your Name") }
        )
        Spacer(Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = consentGiven, onCheckedChange = onConsentChange)
            Text("I give my consent")
        }

        Spacer(Modifier.height(8.dp))

        Button(onClick = onTakePhotoClick) {
            Text("Take/Choose Photo")
        }

        photoUri?.let {
            AsyncImage(model = it, contentDescription = "Consent Photo", modifier = Modifier.height(200.dp))
        }

        Spacer(Modifier.height(16.dp))

        Button(onClick = onSubmit) {
            Text("Submit Consent")
        }
    }
}
