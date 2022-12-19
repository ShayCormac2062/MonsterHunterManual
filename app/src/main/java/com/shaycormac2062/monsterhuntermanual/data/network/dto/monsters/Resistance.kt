package com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Resistance(
    @SerialName("condition")
    val condition: String?,
    @SerialName("element")
    val element: String?
)