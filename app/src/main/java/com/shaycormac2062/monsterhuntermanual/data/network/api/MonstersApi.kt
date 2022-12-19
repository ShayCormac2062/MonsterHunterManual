package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.MonsterDto
import com.shaycormac2062.monsterhuntermanual.data.network.dto.monsters.MonsterDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MonstersApi {

    @GET("monsters")
    suspend fun getMonsters(): Response<MonsterDto>

    @GET("monsters/{id}")
    suspend fun getMonsterById(
        @Path("id") id: Int
    ): Response<MonsterDtoItem>

}