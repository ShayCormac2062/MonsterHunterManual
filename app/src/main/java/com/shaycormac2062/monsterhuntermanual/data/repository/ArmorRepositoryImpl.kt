package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.ArmorApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.ArmorMapper.toArmor
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.repository.ArmorRepository
import com.shaycormac2062.monsterhuntermanual.utils.ApplicationException
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class ArmorRepositoryImpl @Inject constructor(
    @Named("armorApi") private val api: ArmorApi
) : ArmorRepository {

    override suspend fun getAllArmor(): RequestResult<List<Armor>?> = try {
        with(api.getArmor()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toArmor() }
                )
            } else RequestResult.Error(
                message = ApplicationException.ApiException().message,
                data = emptyList()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ApplicationException.InternetException().message
        )
    }

    override suspend fun getArmorById(id: Int): RequestResult<Armor?> = try {
        with(api.getArmorById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toArmor()
                )
            } else RequestResult.Error(
                message = ApplicationException.ApiException().message,
                data = Armor()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ApplicationException.InternetException().message
        )
    }

    override suspend fun getArmorBySlug(slug: String): RequestResult<Armor?> = try {
        with(api.getArmorBySlug(slug)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toArmor()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Armor()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

}