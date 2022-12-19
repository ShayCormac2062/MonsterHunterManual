package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Phial(
    @SerialName("damage")
    val damage: Int?,
    @SerialName("type")
    val type: String?
)