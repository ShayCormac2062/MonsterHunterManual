package com.shaycormac2062.monsterhuntermanual.domain.model.skills

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Skill(
    val description: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val ranks: List<Rank?>? = null
) : BaseElement()