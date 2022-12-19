package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    @SerialName("affinity")
    val affinity: Int?,
    @SerialName("boostType")
    val boostType: String?,
    @SerialName("coatings")
    val coatings: List<String?>?,
    @SerialName("damageType")
    val damageType: String?,
    @SerialName("defense")
    val defense: Int?,
    @SerialName("elderseal")
    val elderseal: String?
)