package com.shaycormac2062.monsterhuntermanual.data.network.dto.common


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Material(
    @SerialName("item")
    val item: Item?,
    @SerialName("quantity")
    val quantity: Int?
)