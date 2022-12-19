package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Item
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpgradeMaterial(
    @SerialName("item")
    val item: Item?,
    @SerialName("quantity")
    val quantity: Int?
)