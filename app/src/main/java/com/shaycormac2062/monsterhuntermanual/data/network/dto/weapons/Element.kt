package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Element(
    @SerialName("damage")
    val damage: Int?,
    @SerialName("hidden")
    val hidden: Boolean?,
    @SerialName("type")
    val type: String?
)