package com.shaycormac2062.monsterhuntermanual.data.network.dto.armor


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Assets(
    @SerialName("imageFemale")
    val imageFemale: String?,
    @SerialName("imageMale")
    val imageMale: String?
)