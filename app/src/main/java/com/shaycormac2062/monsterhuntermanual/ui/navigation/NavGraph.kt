package com.shaycormac2062.monsterhuntermanual.ui.navigation

import AppBackground
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.shaycormac2062.monsterhuntermanual.ui.main.MainScreen
import com.shaycormac2062.monsterhuntermanual.ui.onboarding.screen.WelcomeScreen
import com.shaycormac2062.monsterhuntermanual.ui.splash.SplashScreen

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    AppBackground()
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen()
        }
        composable(route = Screen.Main.route) {
            MainScreen()
        }
        composable(route = Screen.OnBoarding.route) {
            WelcomeScreen(navController)
        }
    }
}