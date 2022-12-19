package com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters


import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Item
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Reward(
    @SerialName("conditions")
    val conditions: List<Condition>?,
    @SerialName("id")
    val id: Int?,
    @SerialName("item")
    val item: Item?
)