package com.shaycormac2062.monsterhuntermanual.data.network.dto.events


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EventDtoItem(
    @SerialName("description")
    val description: String?,
    @SerialName("endTimestamp")
    val endTimestamp: String?,
    @SerialName("exclusive")
    val exclusive: Byte?,
    @SerialName("expansion")
    val expansion: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("location")
    val location: Location?,
    @SerialName("masterRank")
    val masterRank: Boolean?,
    @SerialName("name")
    val name: String?,
    @SerialName("platform")
    val platform: String?,
    @SerialName("questRank")
    val questRank: Int?,
    @SerialName("requirements")
    val requirements: String?,
    @SerialName("startTimestamp")
    val startTimestamp: String?,
    @SerialName("successConditions")
    val successConditions: String?,
    @SerialName("type")
    val type: String?
)