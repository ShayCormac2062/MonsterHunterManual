package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.MonstersApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.MonstersMapper.toMonster
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.repository.MonstersRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class MonstersRepositoryImpl @Inject constructor(
    @Named("monstersApi") private val api: MonstersApi
) : MonstersRepository {

    override suspend fun getMonsters(): RequestResult<List<Monster>?> = try {
        with(api.getMonsters()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toMonster() }
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

    override suspend fun getMonsterById(id: Int): RequestResult<Monster?> = try {
        with(api.getMonsterById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toMonster()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Monster()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

}