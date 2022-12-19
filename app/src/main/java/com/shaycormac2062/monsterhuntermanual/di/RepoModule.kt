package com.shaycormac2062.monsterhuntermanual.di

import com.shaycormac2062.monsterhuntermanual.data.repository.*
import com.shaycormac2062.monsterhuntermanual.domain.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    @Singleton
    abstract fun bindAilmentsRepository(
        ailmentsRepository: AilmentsRepositoryImpl
    ): AilmentsRepository

    @Binds
    @Singleton
    abstract fun bindArmorRepository(
        armorRepositoryImpl: ArmorRepositoryImpl
    ): ArmorRepository

    @Binds
    @Singleton
    abstract fun bindCharmsRepository(
        charmsRepositoryImpl: CharmsRepositoryImpl
    ): CharmsRepository

    @Binds
    @Singleton
    abstract fun bindDecorationsRepository(
        decorationsRepositoryImpl: DecorationsRepositoryImpl
    ): DecorationsRepository

    @Binds
    @Singleton
    abstract fun bindEventsRepository(
        eventsRepositoryImpl: EventsRepositoryImpl
    ): EventsRepository

    @Binds
    @Singleton
    abstract fun bindMonstersRepository(
        monstersRepositoryImpl: MonstersRepositoryImpl
    ): MonstersRepository

    @Binds
    @Singleton
    abstract fun bindSkillsRepository(
        skillsRepository: SkillsRepositoryImpl
    ): SkillsRepository

    @Binds
    @Singleton
    abstract fun bindWeaponsRepository(
        weaponsRepository: WeaponsRepositoryImpl
    ): WeaponsRepository

}
