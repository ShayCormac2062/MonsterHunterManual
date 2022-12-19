package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArmorDtoItem(
    @SerialName("armorSet")
    val armorSet: ArmorSet?,
    @SerialName("assets")
    val assets: Assets?,
    @SerialName("attributes")
    val attributes: Attributes?,
    @SerialName("crafting")
    val crafting: Crafting?,
    @SerialName("defense")
    val defense: Defense?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("rank")
    val rank: String?,
    @SerialName("rarity")
    val rarity: Int?,
    @SerialName("resistances")
    val resistances: Resistances?,
    @SerialName("skills")
    val skills: List<Skill?>?,
    @SerialName("slots")
    val slots: List<Slot?>?,
    @SerialName("type")
    val type: String?
)