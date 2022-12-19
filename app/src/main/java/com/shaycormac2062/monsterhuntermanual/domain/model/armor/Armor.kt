package com.shaycormac2062.monsterhuntermanual.domain.model.armor

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement
import com.shaycormac2062.monsterhuntermanual.domain.model.common.Material

data class Armor(
    val armorSet: ArmorSet? = null,
    val assets: Assets? = null,
    val requiredGender: String? = null,
    val materials: List<Material?>? = null,
    val defense: Defense? = null,
    val id: Int? = null,
    val name: String? = null,
    val rank: String? = null,
    val rarity: Int? = null,
    val resistances: Resistances? = null,
    val skills: List<Skill?>? = null,
    val slots: List<Slot?>? = null
) : BaseElement()