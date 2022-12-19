package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.repository.CharmsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class CharmsInteractor @Inject constructor(
    private val repository: CharmsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Charm> {

    override suspend fun getElements(): RequestResult<List<Charm>?> =
        withContext(dispatcher) {
            repository.getCharms()
        }

    override suspend fun getElementById(id: Int): RequestResult<Charm?> =
        withContext(dispatcher) {
            repository.getCharmById(id)
        }

    suspend fun getCharmBySlug(slug: String): RequestResult<Charm?> =
        withContext(dispatcher) {
            repository.getCharmBySlug(slug)
        }

}
