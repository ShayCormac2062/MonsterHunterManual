package com.shaycormac2062.monsterhuntermanual.domain.model.charms

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Material

data class Crafting(
    val craftable: Boolean?,
    val materials: List<Material?>?
)