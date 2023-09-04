package com.shaycormac2062.monsterhuntermanual.ui.main

import AppBackground
import AppGradient
import AppText
import ErrorMessage
import LoadingProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.ui.main.lists.*
import com.shaycormac2062.monsterhuntermanual.ui.main.viewmodel.ApiViewModel
import com.shaycormac2062.monsterhuntermanual.ui.theme.Green40
import com.shaycormac2062.monsterhuntermanual.ui.theme.White
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun MainScreen() {
    AppBackground()
    val ailmentsViewModel: ApiViewModel.AilmentsViewModel = hiltViewModel()
    val armorViewModel: ApiViewModel.ArmorViewModel = hiltViewModel()
    val charmsViewModel: ApiViewModel.CharmsViewModel = hiltViewModel()
    val decorationsViewModel: ApiViewModel.DecorationsViewModel = hiltViewModel()
    val eventsViewModel: ApiViewModel.EventsViewModel = hiltViewModel()
    val monstersViewModel: ApiViewModel.MonstersViewModel = hiltViewModel()
    val skillsViewModel: ApiViewModel.SkillsViewModel = hiltViewModel()
    val weaponsViewModel: ApiViewModel.WeaponsViewModel = hiltViewModel()
    val list = listOf(
        "Ailments" to ailmentsViewModel,
        "Armor" to armorViewModel,
        "Charms" to charmsViewModel,
        "Decorations" to decorationsViewModel,
        "Events" to eventsViewModel,
        "Monsters" to monstersViewModel,
        "Skills" to skillsViewModel,
        "Weapons" to weaponsViewModel,
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
fun Header(
    tabIndex: Int,
    list: List<Pair<String, ApiViewModel<out BaseElement>>>,
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
                            text = section.first,
                            color = if (selected) Green40 else Color.Gray
                        )
                    }
                )
            }
        }
        Title(list[tabIndex].first)
    }
}

@Composable
fun Title(section: String) {
    AppText(
        modifier = Modifier
            .padding(top = 8.dp),
        text = "Results of \"$section\":",
        size = 32.sp,
        color = if (isSystemInDarkTheme()) Green40 else White
    )
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ViewPager(
    pagerState: PagerState,
    list: List<Pair<String, ApiViewModel<out BaseElement>>>
) {
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        count = list.size
    ) { index ->
        ManualScreen(list[index].second)
    }
}

@Composable
fun ManualScreen(viewModel: ApiViewModel<out BaseElement>) {
    val state = viewModel.listState.collectAsState().value
    if (state.isLoading) {
        LoadingProgressBar()
    } else if (state.exception != null) {
        ErrorMessage(
            exception = state.exception,
            scope = rememberCoroutineScope()
        ) {
            viewModel.onPageOpen()
        }
    } else ElementsList(state.elements)
}

@Composable
fun ElementsList(elements: List<BaseElement>?) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(elements?.size ?: 0) { index ->
            when (val element = elements?.get(index)) {
                is Ailment -> AilmentCard(element)
                is Armor -> ArmorCard(element)
                is Charm -> CharmCard(element)
                is Decoration -> DecorationCard(element)
                is Event -> EventCard(element)
                is Monster -> MonsterCard(element)
                is Skill -> SkillCard(element)
                is Weapon -> WeaponCard(element)
            }
        }
    }
}
