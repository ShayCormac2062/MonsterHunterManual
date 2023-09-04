package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.ailments.AilmentDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface AilmentsApi {

    @GET("ailments")
    suspend fun getAilments(): Response<List<AilmentDtoItem>>

    @GET("ailments/{id}")
    suspend fun getAilmentById(
        @Path("id") id: Int
    ): Response<AilmentDtoItem>

}
