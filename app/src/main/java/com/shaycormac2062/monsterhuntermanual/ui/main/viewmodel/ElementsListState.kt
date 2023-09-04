package com.shaycormac2062.monsterhuntermanual.ui.main.viewmodel

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class ElementsListState<T: BaseElement>(
    val isLoading: Boolean,
    val elements: List<T>? = emptyList(),
    val exception: String? = null
)
