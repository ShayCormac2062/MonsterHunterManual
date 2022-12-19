package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.WeaponsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.WeaponMapper.toWeapon
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.domain.repository.WeaponsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class WeaponsRepositoryImpl @Inject constructor(
    @Named("weaponsApi") private val api: WeaponsApi
) : WeaponsRepository {

    override suspend fun getWeapons(): RequestResult<List<Weapon>?>  = try {
        with(api.getWeapons()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toWeapon() }
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

    override suspend fun getWeaponById(id: Int): RequestResult<Weapon?> = try {
        with(api.getWeaponById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toWeapon()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Weapon()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

    override suspend fun getWeaponBySlug(slug: String): RequestResult<Weapon?> = try {
        with(api.getWeaponBySlug(slug)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toWeapon()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Weapon()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }
}
