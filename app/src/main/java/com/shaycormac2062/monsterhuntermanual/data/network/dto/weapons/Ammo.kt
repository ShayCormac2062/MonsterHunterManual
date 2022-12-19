package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ammo(
    @SerialName("capacities")
    val capacities: List<Int?>?,
    @SerialName("type")
    val type: String?
)