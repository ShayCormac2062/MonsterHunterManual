package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.ArmorDto
import com.shaycormac2062.monsterhuntermanual.data.network.dto.armor.ArmorDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ArmorApi {

    @GET("armor")
    suspend fun getArmor(): Response<ArmorDto>

    @GET("armor/{id}")
    suspend fun getArmorById(
        @Path("id") id: Int
    ): Response<ArmorDtoItem>

    @GET("armor/{slug}")
    suspend fun getArmorBySlug(
        @Path("slug") slug: String
    ): Response<ArmorDtoItem>

}