package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    @SerialName("affinity")
    val affinity: String = "0",
    @SerialName("boostType")
    val boostType: String = "Unknown",
    @SerialName("coatings")
    val coatings: List<String?> = emptyList(),
    @SerialName("damageType")
    val damageType: String = "Unknown",
    @SerialName("defense")
    val defense: String = "0",
    @SerialName("elderseal")
    val elderseal: String = "Unknown"
)
