package com.shaycormac2062.monsterhuntermanual.data.network.dto.common


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @SerialName("carryLimit")
    val carryLimit: Int? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("id")
    val id: Int? = null,
    @SerialName("name")
    val name: String? = null,
    @SerialName("rarity")
    val rarity: Int? = null,
    @SerialName("value")
    val value: Int? = null
)