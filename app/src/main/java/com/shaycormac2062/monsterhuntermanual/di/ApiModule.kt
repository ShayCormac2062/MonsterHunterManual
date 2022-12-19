package com.shaycormac2062.monsterhuntermanual.di

import com.shaycormac2062.monsterhuntermanual.data.network.api.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    @Named("ailmentsApi")
    fun provideAilmentsApi(
        @Named("retrofit") retrofit: Retrofit
    ): AilmentsApi = retrofit.create(AilmentsApi::class.java)

    @Provides
    @Named("armorApi")
    fun provideArmorApi(
        @Named("retrofit") retrofit: Retrofit
    ): ArmorApi = retrofit.create(ArmorApi::class.java)

    @Provides
    @Named("charmsApi")
    fun provideCharmsApi(
        @Named("retrofit") retrofit: Retrofit
    ): CharmsApi = retrofit.create(CharmsApi::class.java)

    @Provides
    @Named("decorationsApi")
    fun provideDecorationsApi(
        @Named("retrofit") retrofit: Retrofit
    ): DecorationsApi = retrofit.create(DecorationsApi::class.java)

    @Provides
    @Named("eventsApi")
    fun provideEventsApi(
        @Named("retrofit") retrofit: Retrofit
    ): EventsApi = retrofit.create(EventsApi::class.java)

    @Provides
    @Named("monstersApi")
    fun provideMonstersApi(
        @Named("retrofit") retrofit: Retrofit
    ): MonstersApi = retrofit.create(MonstersApi::class.java)

    @Provides
    @Named("skillsApi")
    fun provideSkillsApi(
        @Named("retrofit") retrofit: Retrofit
    ): SkillsApi = retrofit.create(SkillsApi::class.java)

    @Provides
    @Named("weaponsApi")
    fun provideWeaponsApi(
        @Named("retrofit") retrofit: Retrofit
    ): WeaponsApi = retrofit.create(WeaponsApi::class.java)

}