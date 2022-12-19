package com.shaycormac2062.monsterhuntermanual.data.network.dto.ailments

import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Protection
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Recovery
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AilmentDtoItem(
    @SerialName("description")
    val description: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("name")
    val name: String?,
    @SerialName("protection")
    val protection: Protection?,
    @SerialName("recovery")
    val recovery: Recovery?
)