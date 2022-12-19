package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface SkillsRepository {

    suspend fun getSkills(): RequestResult<List<Skill>?>
    suspend fun getSkillById(id: Int): RequestResult<Skill?>
    suspend fun getSkillBySlug(slug: String): RequestResult<Skill?>

}