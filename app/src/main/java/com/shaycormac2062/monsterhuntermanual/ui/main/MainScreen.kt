package com.shaycormac2062.monsterhuntermanual.ui.main

import AppBackground
import AppGradient
import AppText
import ErrorMessage
import LoadingProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.shaycormac2062.monsterhuntermanual.ui.theme.Green40
import com.shaycormac2062.monsterhuntermanual.ui.theme.White
import com.shaycormac2062.monsterhuntermanual.utils.ApplicationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun MainScreen() {
    AppBackground()
    val list = listOf(
        "Ailments",
        "Armor",
        "Charms",
        "Decorations",
        "Events",
        "Monsters",
        "Skills",
        "Weapons",
    )
    val pagerState = rememberPagerState()
    var tabIndex = pagerState.currentPage
    val coroutineScope = rememberCoroutineScope()
    Column {
        Header(
            tabIndex = tabIndex,
            list = list,
            coroutineScope = coroutineScope,
            pagerState = pagerState
        )
        ViewPager(
            pagerState = pagerState,
            list = list
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ViewPager(
    pagerState: PagerState,
    list: List<String>
) {
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        count = list.size
    ) { index ->
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (index % 2 == 0) {
                LoadingProgressBar()
            } else ErrorMessage(
                exception = ApplicationException.ApiException()
            ) {}
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Header(
    tabIndex: Int,
    list: List<String>,
    coroutineScope: CoroutineScope,
    pagerState: PagerState
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScrollableTabRow(
            selectedTabIndex = tabIndex,
            backgroundColor = Color.Transparent,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(50)),
            indicator = {}
        ) {
            list.forEachIndexed { index, section ->
                val selected = tabIndex == index
                Tab(
                    modifier = if (selected) Modifier
                        .clip(RoundedCornerShape(50))
                        .background(
                            if (!isSystemInDarkTheme()) Color.White
                            else Color.Gray
                        )
                    else Modifier
                        .clip(RoundedCornerShape(50))
                        .background(AppGradient()),
                    selected = selected,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    text = {
                        AppText(
                            text = section,
                            color = if (selected) Green40 else Color.Gray
                        )
                    }
                )
            }
        }
        Title(list[tabIndex])
    }
}

@Composable
fun Title(section: String) {
    AppText(
        modifier = Modifier
            .padding(top = 8.dp),
        text = "Results of \"$section\":",
        size = 35.sp,
        color = if (isSystemInDarkTheme()) Green40 else White
    )
}
