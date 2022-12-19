package com.shaycormac2062.monsterhuntermanual.domain.model.skills

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Modifiers

data class Rank(
    val description: String?,
    val id: Int?,
    val level: Int?,
    val modifiers: Modifiers?,
    val skill: Int?,
    val skillName: String?
)