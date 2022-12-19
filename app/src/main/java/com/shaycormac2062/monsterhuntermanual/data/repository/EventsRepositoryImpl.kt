package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.EventsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.EventsMapper.toDomainEvent
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.repository.EventsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class EventsRepositoryImpl @Inject constructor(
    @Named("eventsApi") private val api: EventsApi
) : EventsRepository {

    override suspend fun getEvents(): RequestResult<List<Event>?> = try {
        with(api.getEvents()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toDomainEvent() }
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

    override suspend fun getEventById(id: Int): RequestResult<Event?> = try {
        with(api.getEventById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toDomainEvent()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Event()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

}