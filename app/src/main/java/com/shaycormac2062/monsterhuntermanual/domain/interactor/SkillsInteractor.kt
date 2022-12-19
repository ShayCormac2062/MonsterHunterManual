package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.repository.SkillsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class SkillsInteractor @Inject constructor(
    private val repository: SkillsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Skill> {

    override suspend fun getElements(): RequestResult<List<Skill>?> =
        withContext(dispatcher) {
            repository.getSkills()
        }

    override suspend fun getElementById(id: Int): RequestResult<Skill?> =
        withContext(dispatcher) {
            repository.getSkillById(id)
        }

    suspend fun getSkillBySlug(slug: String): RequestResult<Skill?> =
        withContext(dispatcher) {
            repository.getSkillBySlug(slug)
        }
}
