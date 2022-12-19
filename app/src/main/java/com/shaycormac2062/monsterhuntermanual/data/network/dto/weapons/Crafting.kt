package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crafting(
    @SerialName("branches")
    val branches: List<Int>?,
    @SerialName("craftable")
    val craftable: Boolean?,
    @SerialName("craftingMaterials")
    val craftingMaterials: List<CraftingMaterial>?,
    @SerialName("previous")
    val previous: Int?,
    @SerialName("upgradeMaterials")
    val upgradeMaterials: List<UpgradeMaterial>?
)