package com.shaycormac2062.monsterhuntermanual.domain.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow

interface DataStoreRepository {

    val dataStore: DataStore<Preferences>
    suspend fun saveOnBoardingState(onComplete: Boolean)
    fun readOnBoardingState(): Flow<Boolean>

}
