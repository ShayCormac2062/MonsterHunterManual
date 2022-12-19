package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.CharmDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.Skill as SkillData
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomain
import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.Rank as RankData
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Crafting
import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.Crafting as CraftingData
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Rank
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Skill

object CharmsMapper {

    fun CharmDtoItem.toCharm() = Charm(
        id = id,
        name = name,
        ranks = ranks?.map { it?.toDomain() }
    )

    private fun RankData.toDomain() = Rank(
        crafting = crafting?.toDomain(),
        level = level,
        name = name,
        rarity = rarity,
        skills = skills?.map { it?.toDomain() }
    )

    private fun SkillData.toDomain() = Skill(
        description = description,
        id = id,
        level = level,
        modifiers = modifiers?.toDomain(),
        skill = skill,
        skillName = skillName
    )

    private fun CraftingData.toDomain() = Crafting(
        craftable = craftable,
        materials = materials?.map { it?.toDomain() }
    )
}
