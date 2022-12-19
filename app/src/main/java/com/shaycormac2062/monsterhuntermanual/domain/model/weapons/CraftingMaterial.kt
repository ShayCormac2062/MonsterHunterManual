package com.shaycormac2062.monsterhuntermanual.domain.model.weapons

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Item

data class CraftingMaterial(
    val item: Item?,
    val quantity: Int?
)