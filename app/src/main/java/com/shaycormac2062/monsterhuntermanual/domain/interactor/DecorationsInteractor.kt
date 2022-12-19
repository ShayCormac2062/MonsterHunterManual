package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.repository.DecorationsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class DecorationsInteractor @Inject constructor(
    private val repository: DecorationsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Decoration> {

    override suspend fun getElements(): RequestResult<List<Decoration>?> =
        withContext(dispatcher) {
            repository.getDecorations()
        }

    override suspend fun getElementById(id: Int): RequestResult<Decoration?> =
        withContext(dispatcher) {
            repository.getDecorationById(id)
        }

    suspend fun getDecorationsBySlug(slug: String): RequestResult<Decoration?> =
        withContext(dispatcher) {
            repository.getDecorationBySlug(slug)
        }

}
