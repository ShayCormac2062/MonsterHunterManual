package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations.DecorationDto
import com.shaycormac2062.monsterhuntermanual.data.network.dto.decorations.DecorationDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DecorationsApi {

    @GET("decorations")
    suspend fun getDecorations(): Response<DecorationDto>

    @GET("decorations/{id}")
    suspend fun getDecorationById(
        @Path("id") id: Int
    ): Response<DecorationDtoItem>

    @GET("decorations/{slug}")
    suspend fun getDecorationBySlug(
        @Path("slug") slug: String
    ): Response<DecorationDtoItem>

}