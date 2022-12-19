package com.shaycormac2062.monsterhuntermanual.domain.interactor

import com.shaycormac2062.monsterhuntermanual.domain.model.BaseElement
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface BaseInteractor<T : BaseElement> {

    suspend fun getElements(): RequestResult<List<T>?>
    suspend fun getElementById(id: Int): RequestResult<T?>

}