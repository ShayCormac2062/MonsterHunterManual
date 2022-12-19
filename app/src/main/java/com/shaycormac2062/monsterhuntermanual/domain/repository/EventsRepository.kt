package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface EventsRepository {

    suspend fun getEvents(): RequestResult<List<Event>?>
    suspend fun getEventById(id: Int): RequestResult<Event?>

}