package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.CharmsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.AilmentMapper.toAilment
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.ArmorMapper.toArmor
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CharmsMapper.toCharm
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.repository.CharmsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class CharmsRepositoryImpl @Inject constructor(
    @Named("charmsApi") private val api: CharmsApi
): CharmsRepository {

    override suspend fun getCharms(): RequestResult<List<Charm>?> = try {
        with(api.getCharms()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toCharm() }
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

    override suspend fun getCharmById(id: Int): RequestResult<Charm?> = try {
        with(api.getCharmById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toCharm()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Charm()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

    override suspend fun getCharmBySlug(slug: String): RequestResult<Charm?> = try {
        with(api.getCharmBySlug(slug)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toCharm()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Charm()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }
}