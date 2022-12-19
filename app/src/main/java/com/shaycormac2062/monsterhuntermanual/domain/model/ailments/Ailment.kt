package com.shaycormac2062.monsterhuntermanual.domain.model.ailments

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement

data class Ailment(
    val description: String?,
    val id: Int?,
    val name: String?,
    val protection: Protection?,
    val recovery: Recovery?
) : BaseElement()
