package com.example.beneficiaryapp.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.beneficiaryapp.presentation.auth.AuthViewModel
import com.example.beneficiaryapp.presentation.auth.LoginScreen
import com.example.beneficiaryapp.presentation.auth.SignupScreen
import com.example.beneficiaryapp.presentation.splash.SplashScreen
import com.example.beneficiaryapp.ui.theme.Home
import com.example.beneficiaryapp.ui.theme.Login
import com.example.beneficiaryapp.ui.theme.Signup
import com.example.beneficiaryapp.ui.theme.Splash

// ui/AppNavHost.kt
@Composable
fun NavGraph(
    navController: NavHostController,
    authViewModel: AuthViewModel
) {
    NavHost(navController = navController, startDestination = Splash) {

        composable<Splash> {
            SplashScreen(onNavigate = {
                navController.navigate(Login) {
                    popUpTo(Splash) { inclusive = true }
                }
            })
        }

        composable<Login> {
            LoginScreen(
                viewModel = authViewModel,
                onNavigate = {
                    navController.navigate(Home)
                },
                onSignupClick = {
                    navController.navigate(Signup)
                }
            )
        }

        composable<Signup> {
            SignupScreen(
                viewModel = authViewModel,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        composable<Home> {
            Text("Welcome Home!") // Replace with actual HomeScreen later
        }
    }
}


