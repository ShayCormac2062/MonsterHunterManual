package com.shaycormac2062.monsterhuntermanual.domain.model.ailments

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Item

data class Recovery(
    val actions: List<String>?,
    val items: List<Item>?
)
