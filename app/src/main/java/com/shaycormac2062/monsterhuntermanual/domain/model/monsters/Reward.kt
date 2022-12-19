package com.shaycormac2062.monsterhuntermanual.domain.model.monsters

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Item

data class Reward(
    val conditions: List<Condition>?,
    val id: Int?,
    val item: Item?
)