package com.shaycormac2062.monsterhuntermanual.domain.model.weapons

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Weapon(
    val ammo: List<Ammo>? = null,
    val assets: Assets? = null,
    val attack: Attack? = null,
    val attributes: Attributes? = null,
    val boostType: String? = null,
    val coatings: List<String>? = null,
    val crafting: Crafting? = null,
    val damageType: String? = null,
    val deviation: String? = null,
    val durability: List<Durability>? = null,
    val elderseal: String? = null,
    val elements: List<Element>? = null,
    val id: Int? = null,
    val name: String? = null,
    val phial: Phial? = null,
    val rarity: Int? = null,
    val shelling: Shelling? = null,
    val slots: List<Slot>? = null,
    val specialAmmo: String? = null,
    val type: String? = null
) : BaseElement()