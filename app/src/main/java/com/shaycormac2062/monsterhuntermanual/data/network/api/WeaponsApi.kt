package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.WeaponDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface WeaponsApi {

    @GET("weapons")
    suspend fun getWeapons(): Response<List<WeaponDtoItem>>

    @GET("weapons/{id}")
    suspend fun getWeaponById(
        @Path("id") id: Int
    ): Response<WeaponDtoItem>

    @GET("weapons/{slug}")
    suspend fun getWeaponBySlug(
        @Path("slug") slug: String
    ): Response<WeaponDtoItem>

}
