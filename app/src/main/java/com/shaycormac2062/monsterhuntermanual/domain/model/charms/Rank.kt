package com.shaycormac2062.monsterhuntermanual.domain.model.charms

data class Rank(
    val crafting: Crafting?,
    val level: Int?,
    val name: String?,
    val rarity: Int?,
    val skills: List<Skill?>?
)