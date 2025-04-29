package com.pauline.propertyplus2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pauline.propertyplus2.ui.theme.screens.about.AboutScreen
import com.pauline.propertyplus2.ui.theme.screens.contact.ContactScreen
import com.pauline.propertyplus2.ui.theme.screens.home.HomeScreen
import com.pauline.propertyplus2.ui.theme.screens.service.ServiceScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }

    }
}