package com.shaycormac2062.monsterhuntermanual.domain.model.charms

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Modifiers

data class Skill(
    val description: String?,
    val id: Int?,
    val level: Int?,
    val modifiers: Modifiers?,
    val skill: Int?,
    val skillName: String?
)