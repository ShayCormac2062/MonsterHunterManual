package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface DecorationsRepository {

    suspend fun getDecorations(): RequestResult<List<Decoration>?>
    suspend fun getDecorationById(id: Int): RequestResult<Decoration?>
    suspend fun getDecorationBySlug(slug: String): RequestResult<Decoration?>

}