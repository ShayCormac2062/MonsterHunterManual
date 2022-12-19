package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations.DecorationDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations.Modifiers as ModifiersData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations.Skill as SkillData
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Modifiers
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Skill

object DecorationMapper {

    fun DecorationDtoItem.toDomainDecoration() = Decoration(
        id = id,
        name = name,
        rarity = rarity,
        skills = skills?.map { it?.toDomain() },
        slot = slot
    )

    private fun SkillData.toDomain() = Skill(
        description = description,
        id = id,
        level = level,
        modifiers = modifiers?.toDomain(),
        skill = skill,
        skillName = skillName
    )

    private fun ModifiersData.toDomain() = Modifiers(
        affinity,
        attack,
        damageDragon,
        damageFire,
        damageIce,
        damageThunder,
        damageWater,
        defense,
        health,
        resistDragon,
        resistFire,
        resistIce,
        resistThunder,
        resistWater,
        sharpnessBonus
    )
}
