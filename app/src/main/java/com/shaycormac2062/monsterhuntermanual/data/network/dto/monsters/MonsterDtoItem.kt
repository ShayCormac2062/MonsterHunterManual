package com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters


import com.shaycormac2062.monsterhuntermanual.data.network.dto.ailments.AilmentDtoItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MonsterDtoItem(
    @SerialName("ailments")
    val ailments: List<AilmentDtoItem>?,
    @SerialName("description")
    val description: String?,
    @SerialName("elements")
    val elements: List<String>?,
    @SerialName("id")
    val id: Int?,
    @SerialName("locations")
    val locations: List<Location>?,
    @SerialName("name")
    val name: String?,
    @SerialName("resistances")
    val resistances: List<Resistance>?,
    @SerialName("rewards")
    val rewards: List<Reward>?,
    @SerialName("species")
    val species: String?,
    @SerialName("type")
    val type: String?,
    @SerialName("weaknesses")
    val weaknesses: List<Weaknesse>?
)