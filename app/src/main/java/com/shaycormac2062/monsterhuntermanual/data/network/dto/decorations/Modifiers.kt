package com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Modifiers(
    @SerialName("affinity")
    val affinity: Int?,
    @SerialName("attack")
    val attack: Int?,
    @SerialName("damageDragon")
    val damageDragon: Int?,
    @SerialName("damageFire")
    val damageFire: Int?,
    @SerialName("damageIce")
    val damageIce: Int?,
    @SerialName("damageThunder")
    val damageThunder: Int?,
    @SerialName("damageWater")
    val damageWater: Int?,
    @SerialName("defense")
    val defense: Int?,
    @SerialName("health")
    val health: Int?,
    @SerialName("resistDragon")
    val resistDragon: Int?,
    @SerialName("resistFire")
    val resistFire: Int?,
    @SerialName("resistIce")
    val resistIce: Int?,
    @SerialName("resistThunder")
    val resistThunder: Int?,
    @SerialName("resistWater")
    val resistWater: Int?,
    @SerialName("sharpnessBonus")
    val sharpnessBonus: Int?
)