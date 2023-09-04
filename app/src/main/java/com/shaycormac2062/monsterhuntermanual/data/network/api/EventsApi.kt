package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.events.EventDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EventsApi {

    @GET("events")
    suspend fun getEvents(): Response<List<EventDtoItem>>

    @GET("events/{id}")
    suspend fun getEventById(
        @Path("id") id: Int
    ): Response<EventDtoItem>

}
