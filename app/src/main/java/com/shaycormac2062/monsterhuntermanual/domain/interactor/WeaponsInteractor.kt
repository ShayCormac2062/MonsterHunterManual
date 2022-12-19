package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.domain.repository.WeaponsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class WeaponsInteractor @Inject constructor(
    private val repository: WeaponsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Weapon> {

    override suspend fun getElements(): RequestResult<List<Weapon>?> =
        withContext(dispatcher) {
            repository.getWeapons()
        }

    override suspend fun getElementById(id: Int): RequestResult<Weapon?> =
        withContext(dispatcher) {
            repository.getWeaponById(id)
        }

    suspend fun getWeaponBySlug(slug: String): RequestResult<Weapon?> =
        withContext(dispatcher) {
            repository.getWeaponBySlug(slug)
        }

}
