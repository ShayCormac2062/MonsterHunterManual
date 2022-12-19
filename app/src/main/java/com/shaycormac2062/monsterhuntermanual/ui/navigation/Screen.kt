package com.shaycormac2062.monsterhuntermanual.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen(route = "welcome_screen")
    object OnBoarding : Screen(route = "on_boarding_screen")
    object Main : Screen(route = "home_screen")
}