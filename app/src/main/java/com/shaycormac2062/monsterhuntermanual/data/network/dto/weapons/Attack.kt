package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attack(
    @SerialName("display")
    val display: Int?,
    @SerialName("raw")
    val raw: Int?
)