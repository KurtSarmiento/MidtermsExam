package com.example.midtermsexam

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.midtermsexam.screens.Screen
import com.example.midtermsexam.screens.login.LoginScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route,
        modifier = modifier
    ){
        composable(Screen.Login.route) {
            LoginScreen(
                onNavigate = {navController.navigate(Screen.Deliveries)
                }
            )
        }
    }
}