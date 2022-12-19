package com.shaycormac2062.monsterhuntermanual.ui.onboarding.screen

import AppBackground
import AppButton
import AppText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import AppGradient
import androidx.compose.animation.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.shaycormac2062.monsterhuntermanual.R
import com.shaycormac2062.monsterhuntermanual.ui.navigation.Screen
import com.shaycormac2062.monsterhuntermanual.ui.onboarding.WelcomeViewModel
import com.shaycormac2062.monsterhuntermanual.ui.theme.*
import kotlinx.coroutines.delay

@OptIn(ExperimentalAnimationApi::class)
@ExperimentalPagerApi
@Composable
fun WelcomeScreen(
    navController: NavHostController,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    AppBackground()
    var stage by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(key1 = true) {
        delay(300)
        stage = true
    }
    AnimatedVisibility(
        visible = stage,
        enter = scaleIn() + expandVertically(expandFrom = Alignment.CenterVertically),
        exit = scaleOut() + shrinkVertically(shrinkTowards = Alignment.CenterVertically),
        modifier = Modifier.fillMaxSize()
    ) {
        Welcome(
            navController,
            viewModel
        )
    }
}

@OptIn(ExperimentalAnimationApi::class)
@ExperimentalPagerApi
@Composable
fun Welcome(
    navController: NavHostController,
    viewModel: WelcomeViewModel
) {
    val pages = listOf(
        OnBoardingPage.WelcomePage,
        OnBoardingPage.InteractionPage,
        OnBoardingPage.WellDonePage,
    )
    val pagerState = rememberPagerState()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            count = pages.size,
            state = pagerState,
            verticalAlignment = Alignment.Top
        ) { position ->
            PagerScreen(pages[position])
        }
        AppButton(
            modifier = Modifier
                .width(300.dp)
                .height(55.dp)
                .background(AppGradient()),
            pagerState = pagerState,
            text = stringResource(id = R.string.start_button),
            onClick = {
                viewModel.saveOnBoardingState(true)
                with(navController) {
                    popBackStack()
                    navigate(Screen.Main.route)
                }
            }
        )
        HorizontalPagerIndicator(
            modifier = Modifier
                .padding(top = 80.dp),
            pagerState = pagerState,
            pageCount = pagerState.pageCount,
            activeColor = if (isSystemInDarkTheme()) Green80 else White,
            inactiveColor = Color.DarkGray,
            indicatorShape = RoundedCornerShape(24.dp)
        )
    }
}

@Composable
fun PagerScreen(page: OnBoardingPage) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(
                id = page.image
            ),
            contentDescription = null,
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
        AppText(
            modifier = Modifier
                .padding(vertical = 36.dp),
            text = page.title,
            size = 32.sp
        )
        AppText(
            modifier = Modifier
                .height(150.dp)
                .padding(horizontal = 28.dp),
            text = page.description,
            size = 16.sp
        )
    }
}
