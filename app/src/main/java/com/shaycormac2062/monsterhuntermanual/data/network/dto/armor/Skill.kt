package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Skill(
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("level")
    val level: Int?,
    @SerialName("modifiers")
    val modifiers: Modifiers?,
    @SerialName("skill")
    val skill: Int?,
    @SerialName("skillName")
    val skillName: String?
)