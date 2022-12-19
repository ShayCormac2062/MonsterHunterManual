package com.shaycormac2062.monsterhuntermanual.domain.model.decorations

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Decoration(
    val id: Int? = null,
    val name: String? = null,
    val rarity: Int? = null,
    val skills: List<Skill?>? = null,
    val slot: Int? = null
) : BaseElement()