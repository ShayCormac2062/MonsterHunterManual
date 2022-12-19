package com.shaycormac2062.monsterhuntermanual.domain.model.events

data class Location(
    val camps: List<Camp?>?,
    val id: Int?,
    val name: String?,
    val zoneCount: Int?
)