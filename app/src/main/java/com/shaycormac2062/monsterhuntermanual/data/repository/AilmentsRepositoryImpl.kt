package com.shaycormac2062.monsterhuntermanual.data.repository

import com.shaycormac2062.monsterhuntermanual.data.network.api.AilmentsApi
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.AilmentMapper.toAilment
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.repository.AilmentsRepository
import com.shaycormac2062.monsterhuntermanual.utils.ApplicationException
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult
import javax.inject.Inject
import javax.inject.Named

class AilmentsRepositoryImpl @Inject constructor(
    @Named("ailmentsApi") private val api: AilmentsApi
) : AilmentsRepository {

    override suspend fun getAilments(): RequestResult<List<Ailment>?> = try {
        with(api.getAilments()) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.map { it.toAilment() }
                )
            } else RequestResult.Error(
                message = ApplicationException.ApiException().message
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ApplicationException.InternetException().message
        )
    }

    override suspend fun getAilmentById(id: Int): RequestResult<Ailment?> = try {
        with(api.getAilmentById(id)) {
            if (isSuccessful && body() != null) {
                RequestResult.Success(
                    data = body()?.toAilment()
                )
            } else RequestResult.Error(
                message = ApplicationException.ApiException(
                    errorBody()?.string() ?: ApplicationException.API_EXCEPTION
                ).message
            )
        }
    } catch (ex: Throwable) {
        RequestResult.Error(
            message = ApplicationException.InternetException().message
        )
    }
}
