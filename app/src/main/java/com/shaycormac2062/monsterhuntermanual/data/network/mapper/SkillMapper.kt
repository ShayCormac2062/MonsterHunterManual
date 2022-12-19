package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.skills.Rank as RankData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.skills.SkillDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomain
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Rank
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill

object SkillMapper {

    fun SkillDtoItem.toSkill() = Skill(
        description = description,
        id = id,
        name = name,
        ranks = ranks?.map { it?.toDomain() },
    )

    private fun RankData.toDomain() = Rank(
        description = description,
        id = id,
        level = level,
        modifiers = modifiers?.toDomain(),
        skill = skill,
        skillName = skillName
    )
}
