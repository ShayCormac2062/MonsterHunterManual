package com.shaycormac2062.monsterhuntermanual.domain.model.charms

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Charm(
    val id: Int? = null,
    val name: String? = null,
    val ranks: List<Rank?>? = null
) : BaseElement()