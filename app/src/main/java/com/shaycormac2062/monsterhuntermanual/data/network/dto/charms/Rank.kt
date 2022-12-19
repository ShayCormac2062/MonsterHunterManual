package com.shaycormac2062.monsterhuntermanual.data.network.dto.charms


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Rank(
    @SerialName("crafting")
    val crafting: Crafting?,
    @SerialName("level")
    val level: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("rarity")
    val rarity: Int?,
    @SerialName("skills")
    val skills: List<Skill?>?
)