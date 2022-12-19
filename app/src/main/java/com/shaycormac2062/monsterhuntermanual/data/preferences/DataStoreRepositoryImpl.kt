package com.shaycormac2062.monsterhuntermanual.data.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import com.shaycormac2062.monsterhuntermanual.domain.repository.DataStoreRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import kotlinx.coroutines.flow.Flow

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "on_boarding_pref")

class DataStoreRepositoryImpl(context: Context) : DataStoreRepository {

    private object PreferenceKey {
        val onBoardingKey = booleanPreferencesKey(name = "on_boarding_pref")
    }

    override val dataStore = context.dataStore

    override suspend fun saveOnBoardingState(onComplete: Boolean) {
        dataStore.edit {
            it[PreferenceKey.onBoardingKey] = onComplete
        }
    }

    override fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.data
            .catch { exception ->
                if (exception is IOException) {
                    emit(emptyPreferences())
                } else throw  exception
            }
            .map { preferences ->
                preferences[PreferenceKey.onBoardingKey] ?: false
            }
    }
}