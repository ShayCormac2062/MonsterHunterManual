package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.DecorationsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CharmsMapper.toCharm
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.DecorationMapper.toDomainDecoration
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.repository.DecorationsRepository
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class DecorationsRepositoryImpl @Inject constructor(
    @Named("decorationsApi") private val api: DecorationsApi
) : DecorationsRepository {

    override suspend fun getDecorations(): RequestResult<List<Decoration>?> = try {
        with(api.getDecorations()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toDomainDecoration() }
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

    override suspend fun getDecorationById(id: Int): RequestResult<Decoration?> = try {
        with(api.getDecorationById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toDomainDecoration()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Decoration()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

    override suspend fun getDecorationBySlug(slug: String): RequestResult<Decoration?> = try {
        with(api.getDecorationBySlug(slug)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toDomainDecoration()
                )
            } else RequestResult.Error(
                message = errorBody()?.string().toString(),
                data = Decoration()
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ex.message.toString()
        )
    }

}