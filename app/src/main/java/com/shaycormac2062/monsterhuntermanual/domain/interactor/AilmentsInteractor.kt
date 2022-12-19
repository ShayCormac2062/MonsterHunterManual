package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.repository.AilmentsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class AilmentsInteractor @Inject constructor(
    private val repository: AilmentsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Ailment> {

    override suspend fun getElements(): RequestResult<List<Ailment>?> =
        withContext(dispatcher) {
            repository.getAilments()
        }

    override suspend fun getElementById(id: Int): RequestResult<Ailment?> =
        withContext(dispatcher) {
            repository.getAilmentById(id)
        }

}
