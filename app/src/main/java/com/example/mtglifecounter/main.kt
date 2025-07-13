package com.example.mtglifecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //permitir pantalla completa
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
        setContent {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Home") {
                        composable("Home") { HomeScreen(navController) }
                        composable("2P_RNG") { RngScreen2P(navController)}
                        composable("3P_RNG") { RngScreen3P(navController)}
                        composable("4P_RNG") { RngScreen4P(navController)}
                        composable("2P") { TwoButtons() }
                        composable("3P") { ThreeButtons() }
                        composable("4P") { FourButtons() }
                    }

                }

        }


}
