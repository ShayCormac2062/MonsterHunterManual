package com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Durability(
    @SerialName("blue")
    val blue: Int?,
    @SerialName("green")
    val green: Int?,
    @SerialName("orange")
    val orange: Int?,
    @SerialName("purple")
    val purple: Int?,
    @SerialName("red")
    val red: Int?,
    @SerialName("white")
    val white: Int?,
    @SerialName("yellow")
    val yellow: Int?
)