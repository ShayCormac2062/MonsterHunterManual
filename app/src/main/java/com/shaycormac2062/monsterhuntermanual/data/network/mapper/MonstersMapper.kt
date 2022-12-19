package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.Condition as ConditionData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.Location as LocationData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.MonsterDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.Weaknesse as WeaknesseData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.Reward as RewardData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.Resistance as ResistanceData
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.AilmentMapper.toAilment
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomainItem
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.*

object MonstersMapper {

    fun MonsterDtoItem.toMonster() = Monster(
        ailments = ailments?.map { it.toAilment() },
        description = description,
        elements = elements,
        id = id,
        locations = locations?.map { it?.toDomain() },
        name = name,
        resistances = resistances?.map { it.toDomain() },
        rewards = rewards?.map { it.toDomain() },
        species = species,
        type = type,
        weaknesses = weaknesses?.map { it.toDomain() }
    )

    private fun LocationData.toDomain() =
        Location(
            id = id,
            name = name,
            zoneCount = zoneCount
        )

    private fun RewardData.toDomain() = Reward(
        conditions = conditions?.map { it.toDomain() },
        id = id,
        item = item?.toDomainItem()
    )

    private fun ConditionData.toDomain() = Condition(
        chance = chance,
        quantity = quantity,
        rank = rank,
        subtype = subtype,
        type = type
    )

    private fun ResistanceData.toDomain() = Resistance(
        condition = condition,
        element = element
    )

    private fun WeaknesseData.toDomain() = Weaknesse(
        condition = condition,
        element = element,
        stars = stars
    )
}
