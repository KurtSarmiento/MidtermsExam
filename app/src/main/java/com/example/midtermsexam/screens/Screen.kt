package com.example.midtermsexam.screens

sealed class Screen(val route:String) {
    data object Login: Screen("Login")
    data object Deliveries: Screen("Deliveries")
}