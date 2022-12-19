package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.events.Camp as CampData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.events.EventDtoItem
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Camp
import com.shaycormac2062.monsterhuntermanual.data.network.dto.events.Location as LocationData
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Location
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event

object EventsMapper {

    fun EventDtoItem.toDomainEvent() = Event(
        description = description,
        endTimestamp = endTimestamp,
        exclusive = exclusive,
        expansion = expansion,
        id = id,
        location = location?.toDomain(),
        masterRank = masterRank,
        name = name,
        platform = platform,
        questRank = questRank,
        requirements = requirements,
        startTimestamp = startTimestamp,
        successConditions = successConditions,
        type = type
    )

    private fun LocationData.toDomain() = Location(
        camps = camps?.map { it?.toDomain() },
        id = id,
        name = name,
        zoneCount = zoneCount
    )

    private fun CampData.toDomain() = Camp(
        id = id,
        name = name,
        zone = zone
    )
}
