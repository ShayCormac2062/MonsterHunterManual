package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeaponDtoItem(
    @SerialName("ammo")
    val ammo: List<Ammo>?,
    @SerialName("assets")
    val assets: Assets?,
    @SerialName("attack")
    val attack: Attack?,
    @SerialName("attributes")
    val attributes: Attributes?,
    @SerialName("boostType")
    val boostType: String?,
    @SerialName("coatings")
    val coatings: List<String>?,
    @SerialName("crafting")
    val crafting: Crafting?,
    @SerialName("damageType")
    val damageType: String?,
    @SerialName("deviation")
    val deviation: String?,
    @SerialName("durability")
    val durability: List<Durability>?,
    @SerialName("elderseal")
    val elderseal: String?,
    @SerialName("elements")
    val elements: List<Element>?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("phial")
    val phial: Phial?,
    @SerialName("rarity")
    val rarity: Int?,
    @SerialName("shelling")
    val shelling: Shelling?,
    @SerialName("slots")
    val slots: List<Slot>?,
    @SerialName("specialAmmo")
    val specialAmmo: String?,
    @SerialName("type")
    val type: String?
)