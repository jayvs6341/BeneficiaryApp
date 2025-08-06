package com.example.beneficiaryapp.presentation.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigate: () -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000) // simulate loading
        onNavigate()
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Beneficiary App", style = MaterialTheme.typography.headlineMedium)
    }
}

