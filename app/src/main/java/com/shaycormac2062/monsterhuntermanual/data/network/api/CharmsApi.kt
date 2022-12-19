package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.CharmDto
import com.shaycormac2062.monsterhuntermanual.data.network.dto.charms.CharmDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharmsApi {

    @GET("charms")
    suspend fun getCharms(): Response<CharmDto>

    @GET("charms/{id}")
    suspend fun getCharmById(
        @Path("id") id: Int
    ): Response<CharmDtoItem>

    @GET("charms/{slug}")
    suspend fun getCharmBySlug(
        @Path("slug") slug: String
    ): Response<CharmDtoItem>

}