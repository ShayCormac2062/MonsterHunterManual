package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface CharmsRepository {

    suspend fun getCharms(): RequestResult<List<Charm>?>
    suspend fun getCharmById(id: Int): RequestResult<Charm?>
    suspend fun getCharmBySlug(slug: String): RequestResult<Charm?>

}