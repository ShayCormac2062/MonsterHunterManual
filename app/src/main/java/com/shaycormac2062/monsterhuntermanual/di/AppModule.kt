package com.shaycormac2062.monsterhuntermanual.di

import android.content.Context
import com.shaycormac2062.monsterhuntermanual.data.preferences.DataStoreRepositoryImpl
import com.shaycormac2062.monsterhuntermanual.domain.repository.DataStoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideDataStoreRepository(
        @ApplicationContext context: Context
    ): DataStoreRepository = DataStoreRepositoryImpl(context)

}