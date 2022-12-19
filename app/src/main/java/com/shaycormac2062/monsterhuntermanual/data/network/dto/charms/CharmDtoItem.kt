package com.shaycormac2062.monsterhuntermanual.data.network.dto.charms


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharmDtoItem(
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("ranks")
    val ranks: List<Rank?>?
)