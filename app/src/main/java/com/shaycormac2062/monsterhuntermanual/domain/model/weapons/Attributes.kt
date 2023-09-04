package com.shaycormac2062.monsterhuntermanual.domain.model.weapons

data class Attributes(
    val affinity: String,
    val boostType: String?,
    val coatings: List<String?>?,
    val damageType: String?,
    val defense: String,
    val elderseal: String?
)
