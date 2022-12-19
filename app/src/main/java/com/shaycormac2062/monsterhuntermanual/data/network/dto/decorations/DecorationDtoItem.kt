package com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DecorationDtoItem(
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("rarity")
    val rarity: Int?,
    @SerialName("skills")
    val skills: List<Skill?>?,
    @SerialName("slot")
    val slot: Int?
)