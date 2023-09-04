package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attributes(
    @SerialName("requiredGender")
    val requiredGender: String? = null
)
