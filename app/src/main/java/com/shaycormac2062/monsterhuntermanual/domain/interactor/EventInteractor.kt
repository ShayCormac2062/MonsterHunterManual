package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.repository.EventsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Named

class EventInteractor @Inject constructor(
    private val repository: EventsRepository,
    @Named("io") private val dispatcher: CoroutineDispatcher
) : BaseInteractor<Event> {

    override suspend fun getElements(): RequestResult<List<Event>?> =
        withContext(dispatcher) {
            repository.getEvents()
        }

    override suspend fun getElementById(id: Int): RequestResult<Event?> =
        withContext(dispatcher) {
            repository.getEventById(id)
        }

}
