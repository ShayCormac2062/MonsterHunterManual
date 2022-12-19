package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArmorSet(
    @SerialName("bonus")
    val bonus: Int?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("pieces")
    val pieces: List<Int?>?,
    @SerialName("rank")
    val rank: String?
)