package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.repository.ArmorRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class ArmorInteractor @Inject constructor(
    private val repository: ArmorRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Armor> {

    override suspend fun getElements(): RequestResult<List<Armor>?> =
        withContext(dispatcher) {
            repository.getAllArmor()
        }

    override suspend fun getElementById(id: Int): RequestResult<Armor?> =
        withContext(dispatcher) {
            repository.getArmorById(id)
        }

    suspend fun getArmorBySlug(slug: String): RequestResult<Armor?> =
        withContext(dispatcher) {
            repository.getArmorBySlug(slug)
        }

}
