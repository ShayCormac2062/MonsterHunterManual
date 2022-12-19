package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface BaseRepository {

    suspend fun getAilments(): RequestResult<List<Ailment>?>
    suspend fun getAilmentById(id: Int): RequestResult<Ailment?>

}