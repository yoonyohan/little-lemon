package com.example.littlelemon.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.ui.theme.screens.ContactScreen
import com.example.littlelemon.ui.theme.screens.LogInSheet
import com.example.littlelemon.ui.theme.screens.SignUpSheet
import com.example.littlelemon.ui.theme.screens.StarterScreen

@Composable
fun Paths(
    modifier: Modifier = Modifier
) {
    val navigation: NavHostController = rememberNavController()

    NavHost(navController = navigation, startDestination = Locations.StarterScreen.name) {
        this.composable(route = Locations.StarterScreen.name ) {
            StarterScreen(modifier = modifier, navController = navigation)
        }

        this.composable(route = Locations.LogInScreen.name) {
            LogInSheet(modifier = modifier, navController = navigation)
        }

        this.composable(route = Locations.SignUpScreen.name) {
            SignUpSheet(modifier = modifier, navController = navigation)
        }

        this.composable(route = Locations.ContactScreen.name) {
            ContactScreen(modifier = Modifier)
        }
    }
}