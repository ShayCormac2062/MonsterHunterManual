package com.shaycormac2062.monsterhuntermanual.data.network.dto.skills


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SkillDtoItem(
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("ranks")
    val ranks: List<Rank?>?
)