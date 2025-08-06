package com.example.beneficiaryapp.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

// presentation/auth/SignupScreen.kt
@Composable
fun SignupScreen(viewModel: AuthViewModel, onNavigateBack: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Signup", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = { Text("Email") }
        )

        OutlinedTextField(
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation()
        )

        Button(onClick = {
            viewModel.signup()
            onNavigateBack()
        }) {
            Text("Signup")
        }

        Text(viewModel.message, color = Color.Green)
    }
}
