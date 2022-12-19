package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.SkillsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.SkillMapper.toSkill
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.repository.SkillsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class SkillsRepositoryImpl @Inject constructor(
    @Named("skillsApi") private val api: SkillsApi
) : SkillsRepository {

    override suspend fun getSkills(): RequestResult<List<Skill>?> = try {
        with(api.getSkills()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toSkill() }
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = emptyList()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

    override suspend fun getSkillById(id: Int): RequestResult<Skill?> = try {
        with(api.getSkillById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toSkill()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Skill()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

    override suspend fun getSkillBySlug(slug: String): RequestResult<Skill?>  = try {
        with(api.getSkillBySlug(slug)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toSkill()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Skill()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }
}