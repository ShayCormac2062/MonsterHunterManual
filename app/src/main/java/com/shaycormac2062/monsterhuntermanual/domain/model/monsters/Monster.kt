package com.shaycormac2062.monsterhuntermanual.domain.model.monsters

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment

data class Monster(
    val ailments: List<Ailment>? = null,
    val description: String? = null,
    val elements: List<String>? = null,
    val id: Int? = null,
    val locations: List<Location>? = null,
    val name: String? = null,
    val resistances: List<Resistance>? = null,
    val rewards: List<Reward>? = null,
    val species: String? = null,
    val type: String? = null,
    val weaknesses: List<Weaknesse>? = null
) : BaseElement()