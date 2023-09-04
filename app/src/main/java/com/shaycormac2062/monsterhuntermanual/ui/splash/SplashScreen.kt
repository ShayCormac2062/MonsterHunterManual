package com.shaycormac2062.monsterhuntermanual.ui.splash

import AppBackground
import AppText
import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.shaycormac2062.monsterhuntermanual.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun SplashScreen() {
    AppBackground()
    var stage by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(key1 = true) {
        stage = true
        delay(1500)
        stage = false
        delay(200)
    }
    AnimatedVisibility(
        visible = stage,
        enter = scaleIn() + expandVertically(expandFrom = Alignment.CenterVertically),
        exit = scaleOut() + shrinkVertically(shrinkTowards = Alignment.CenterVertically),
        modifier = Modifier.fillMaxSize()
    ) {
        Splash()
    }
}

@Composable
fun Splash() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_night),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )
        AppText(
            text = stringResource(id = R.string.app_name),
            size = 22.sp
        )
    }
}
