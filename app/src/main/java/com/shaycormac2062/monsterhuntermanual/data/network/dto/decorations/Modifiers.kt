package com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Modifiers(
    @SerialName("affinity")
    val affinity: Int = 0,
    @SerialName("attack")
    val attack: Int = 0,
    @SerialName("damageDragon")
    val damageDragon: Int = 0,
    @SerialName("damageFire")
    val damageFire: Int = 0,
    @SerialName("damageIce")
    val damageIce: Int = 0,
    @SerialName("damageThunder")
    val damageThunder: Int = 0,
    @SerialName("damageWater")
    val damageWater: Int = 0,
    @SerialName("defense")
    val defense: Int = 0,
    @SerialName("health")
    val health: Int = 0,
    @SerialName("resistDragon")
    val resistDragon: Int = 0,
    @SerialName("resistFire")
    val resistFire: Int = 0,
    @SerialName("resistIce")
    val resistIce: Int = 0,
    @SerialName("resistThunder")
    val resistThunder: Int = 0,
    @SerialName("resistWater")
    val resistWater: Int = 0,
    @SerialName("sharpnessBonus")
    val sharpnessBonus: Int = 0
)
