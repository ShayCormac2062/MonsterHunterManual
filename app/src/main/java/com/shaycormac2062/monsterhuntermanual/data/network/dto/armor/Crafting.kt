package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Material
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crafting(
    @SerialName("materials")
    val materials: List<Material?>?
)