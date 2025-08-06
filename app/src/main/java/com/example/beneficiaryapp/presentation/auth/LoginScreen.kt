package com.example.beneficiaryapp.presentation.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

// presentation/auth/LoginScreen.kt
@Composable
fun LoginScreen(
    viewModel: AuthViewModel,
    onNavigate: () -> Unit,
    onSignupClick: () -> Unit
) {
    Column(Modifier.padding(16.dp)) {
        Text("Login")

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
            viewModel.login()
            if (viewModel.message == "Login Successful") onNavigate()
        }) {
            Text("Login")
        }

        TextButton(onClick = onSignupClick) {
            Text("Don't have an account? Sign up")
        }

        Text(viewModel.message, color = Color.Red)
    }
}

