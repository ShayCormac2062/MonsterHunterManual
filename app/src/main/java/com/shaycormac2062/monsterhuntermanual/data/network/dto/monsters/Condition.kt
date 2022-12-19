package com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Condition(
    @SerialName("chance")
    val chance: Int?,
    @SerialName("quantity")
    val quantity: Int?,
    @SerialName("rank")
    val rank: String?,
    @SerialName("subtype")
    val subtype: String?,
    @SerialName("type")
    val type: String?
)