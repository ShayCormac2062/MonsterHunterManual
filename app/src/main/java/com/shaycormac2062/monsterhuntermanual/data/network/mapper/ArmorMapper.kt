package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.ArmorDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomain
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomainItem
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.*
import com.shaycormac2062.monsterhuntermanual.domain.model.common.Material
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.ArmorSet as ArmorSetData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.Assets as AssetsData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.Defense as DefenseData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Material as MaterialData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.Resistances as ResistancesData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.Skill as SkillData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.Slot as SlotData

object ArmorMapper {

    fun ArmorDtoItem.toArmor() = Armor(
        armorSet = armorSet?.toDomain(),
        assets = assets?.toDomain(),
        requiredGender = attributes?.requiredGender,
        materials = crafting?.materials?.map { it?.toDomain() },
        defense = defense?.toDomain(),
        id = id,
        name = name,
        rank = rank,
        rarity,
        resistances = resistances?.toDomain(),
        skills = skills?.map { it?.toDomain() },
        slots = slots?.map { it?.toDomain() }
    )

    private fun ArmorSetData.toDomain() = ArmorSet(
        bonus = bonus,
        id = id,
        name = name,
        rank = rank
    )

    private fun SkillData.toDomain() = Skill(
        description = description,
        id = id,
        level = level,
        modifiers = null,
        skill = skill,
        skillName = skillName
    )

    private fun ResistancesData.toDomain() = Resistances(
        dragon = dragon,
        fire = fire,
        ice = ice,
        thunder = thunder,
        water = water
    )

    private fun DefenseData.toDomain() = Defense(
        augmented = augmented,
        base = base,
        max = max
    )

    private fun AssetsData.toDomain() = Assets(
        imageFemale = imageFemale,
        imageMale = imageMale
    )

    private fun SlotData.toDomain() = Slot(
        rank = rank
    )

}
