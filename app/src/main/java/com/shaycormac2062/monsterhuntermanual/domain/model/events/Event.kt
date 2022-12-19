package com.shaycormac2062.monsterhuntermanual.domain.model.events

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Event(
    val description: String? = null,
    val endTimestamp: String? = null,
    val exclusive: Byte? = null,
    val expansion: String? = null,
    val id: Int? = null,
    val location: Location? = null,
    val masterRank: Boolean? = null,
    val name: String? = null,
    val platform: String? = null,
    val questRank: Int? = null,
    val requirements: String? = null,
    val startTimestamp: String? = null,
    val successConditions: String? = null,
    val type: String? = null
) : BaseElement()