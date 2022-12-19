package com.shaycormac2062.monsterhuntermanual.ui.onboarding.screen

import androidx.annotation.DrawableRes
import com.shaycormac2062.monsterhuntermanual.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {

    object WelcomePage : OnBoardingPage(
        image = R.drawable.logo_night,
        title = "Welcome!",
        description = "This guide is an excellent way to learn about the RPG elements of the game."
    )

    object InteractionPage : OnBoardingPage(
        image = R.drawable.logo_night,
        title = "Interaction",
        description = "Learn new things about the game, view your favorite items, compare their characteristics."
    )

    object WellDonePage : OnBoardingPage(
        image = R.drawable.done,
        title = "Well done!",
        description = "So, you have familiarized yourself with the functionality of this application. Have a good use!"
    )

}