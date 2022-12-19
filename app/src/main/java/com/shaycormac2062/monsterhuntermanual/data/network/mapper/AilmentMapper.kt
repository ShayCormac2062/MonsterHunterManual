package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.ailments.AilmentDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomainItem
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.*
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Protection as ProtectionData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Recovery as RecoveryData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Skill as SkillData

object AilmentMapper {

    fun AilmentDtoItem.toAilment() = Ailment(
        description = description,
        id = id,
        name = name,
        protection = protection?.toDomainProtection(),
        recovery = recovery?.toDomainRecovery()
    )


    private fun ProtectionData.toDomainProtection() = Protection(
        items = items?.map { it?.toDomainItem() },
        skills = skills?.map { it?.toDomainSkill() }
    )

    private fun SkillData.toDomainSkill() = Skill(
        description = description,
        id = id,
        name = name
    )


    private fun RecoveryData.toDomainRecovery() = Recovery(
        actions = actions,
        items = items?.map { it.toDomainItem() }
    )

}

