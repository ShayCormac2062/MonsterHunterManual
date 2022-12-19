package com.shaycormac2062.monsterhuntermanual.domain.model.weapons

data class Crafting(
    val branches: List<Int>?,
    val craftable: Boolean?,
    val craftingMaterials: List<CraftingMaterial>?,
    val previous: Int?,
    val upgradeMaterials: List<UpgradeMaterial>?
)