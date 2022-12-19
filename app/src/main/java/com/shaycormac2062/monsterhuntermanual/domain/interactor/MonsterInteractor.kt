package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.repository.MonstersRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class MonsterInteractor @Inject constructor(
    private val repository: MonstersRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Monster> {

    override suspend fun getElements(): RequestResult<List<Monster>?> =
        withContext(dispatcher) {
            repository.getMonsters()
        }

    override suspend fun getElementById(id: Int): RequestResult<Monster?> =
        withContext(dispatcher) {
            repository.getMonsterById(id)
        }

}
