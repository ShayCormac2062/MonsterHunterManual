package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Defense(
    @SerialName("augmented")
    val augmented: Int?,
    @SerialName("base")
    val base: Int?,
    @SerialName("max")
    val max: Int?
)