package com.shaycormac2062.monsterhuntermanual.data.network.dto.common


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Protection(
    @SerialName("items")
    val items: List<Item?>?,
    @SerialName("skills")
    val skills: List<Skill?>?
)