package com.olive.firebase.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.firebase.navigation.ROUTE_ADDPRODUCTS
import com.olive.firebase.navigation.ROUTE_UPDATEPRODUCTS
import com.olive.firebase.navigation.ROUTE_VIEWPRODUCTS


@Composable
fun HomeScreen(navController: NavHostController) {


Column(modifier = Modifier
.fillMaxSize()
.background(Color.Red),
horizontalAlignment = Alignment.CenterHorizontally) {
    var context= LocalContext.current
//        var productdata=productviewmodel(navController,context)

    Text(text = "Welcome to Home page",
        color = Color.Cyan,
        fontFamily = FontFamily.Cursive,
        fontSize = 30.sp)
    Spacer(modifier = Modifier.height(100.dp))

    Button(onClick = {
        navController.navigate(ROUTE_ADDPRODUCTS)
    },modifier = Modifier.fillMaxWidth()) {
        Text(text = "Add Product")
    }
    Spacer(modifier = Modifier.height(100.dp))

    Button(onClick = {
        navController.navigate(ROUTE_VIEWPRODUCTS)
    },modifier = Modifier.fillMaxWidth()) {
        Text(text = "View Product")
    }
    Spacer(modifier = Modifier.height(100.dp))

    Button(onClick = {
        navController.navigate(ROUTE_UPDATEPRODUCTS)
    },modifier = Modifier.fillMaxWidth()) {
        Text(text = "Update Products")
    }


}



}
@Preview
@Composable
private fun HomeScreenprev() {
    HomeScreen(rememberNavController())
}