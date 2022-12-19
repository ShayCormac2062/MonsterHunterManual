package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Resistances(
    @SerialName("dragon")
    val dragon: Int?,
    @SerialName("fire")
    val fire: Int?,
    @SerialName("ice")
    val ice: Int?,
    @SerialName("thunder")
    val thunder: Int?,
    @SerialName("water")
    val water: Int?
)