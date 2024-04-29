package com.olive.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.olive.firebase.ui.theme.screens.home.HomeScreen
import com.olive.firebase.ui.theme.screens.products.AddProductsScreen
import com.olive.firebase.ui.theme.screens.products.UpdateProductsScreen
import com.olive.firebase.ui.theme.screens.products.ViewProductsScreen
import com.olive.firebase.ui.theme.screens.products.ViewUploadsScreen
import com.olive.firebase.ui.theme.screens.register.RegisterScreen
import com.olive.firebase.ui.theme.screens.login.LoginScreen

@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ADDPRODUCTS) {
            AddProductsScreen(navController)
        }

    composable(ROUTE_UPDATEPRODUCTS) {
        UpdateProductsScreen(rememberNavController(), id = "")
    }
composable(ROUTE_VIEWPRODUCTS) {
    ViewProductsScreen(navController)
}
composable(ROUTE_UPLOADPRODUCTS) {
    ViewUploadsScreen(navController)
}
    }

}