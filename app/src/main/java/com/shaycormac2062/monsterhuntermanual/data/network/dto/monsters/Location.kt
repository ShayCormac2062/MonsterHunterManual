package com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Location(
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("zoneCount")
    val zoneCount: Int?
)