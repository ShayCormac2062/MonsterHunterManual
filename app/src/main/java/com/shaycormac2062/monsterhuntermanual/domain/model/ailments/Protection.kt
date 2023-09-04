package com.shaycormac2062.monsterhuntermanual.domain.model.ailments

import com.shaycormac2062.monsterhuntermanual.domain.model.common.Item

data class Protection(
    val items: List<Item?>?,
    val skills: List<Skill?>?
)
