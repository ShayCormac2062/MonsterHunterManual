package com.shaycormac2062.monsterhuntermanual.data.network.dto.common


import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Item
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recovery(
    @SerialName("actions")
    val actions: List<String>?,
    @SerialName("items")
    val items: List<Item>?
)