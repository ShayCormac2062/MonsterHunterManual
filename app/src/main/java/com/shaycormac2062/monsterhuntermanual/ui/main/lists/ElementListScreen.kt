package com.shaycormac2062.monsterhuntermanual.ui.main.lists

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

@Composable
fun ElementListScreen(elements: List<BaseElement>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 8.dp,
                bottom = 16.dp
            ),
        content = {
            elements.forEach { element ->
                item {

                }
            }
        }
    )
}

