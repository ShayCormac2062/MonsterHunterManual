package com.shaycormac2062.monsterhuntermanual.data.network.dto.charms


import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Material
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crafting(
    @SerialName("craftable")
    val craftable: Boolean?,
    @SerialName("materials")
    val materials: List<Material?>?
)