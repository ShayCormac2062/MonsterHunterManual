package com.shaycormac2062.monsterhuntermanual.data.network.dto.common


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Modifiers(
    @SerialName("affinity")
    val affinity: String = "0",
    @SerialName("attack")
    val attack: String = "0",
    @SerialName("damageDragon")
    val damageDragon: String = "0",
    @SerialName("damageFire")
    val damageFire: String = "0",
    @SerialName("damageIce")
    val damageIce: String = "0",
    @SerialName("damageThunder")
    val damageThunder: String = "0",
    @SerialName("damageWater")
    val damageWater: String = "0",
    @SerialName("defense")
    val defense: String = "0",
    @SerialName("health")
    val health: String = "0",
    @SerialName("resistAll")
    val resistAll: String = "0",
    @SerialName("resistDragon")
    val resistDragon: String = "0",
    @SerialName("resistFire")
    val resistFire: String = "0",
    @SerialName("resistIce")
    val resistIce: String = "0",
    @SerialName("resistThunder")
    val resistThunder: String = "0",
    @SerialName("resistWater")
    val resistWater: String = "0",
    @SerialName("sharpnessBonus")
    val sharpnessBonus: String = "0"
)
