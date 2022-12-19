package com.shaycormac2062.monsterhuntermanual.di

import com.shaycormac2062.monsterhuntermanual.domain.interactor.*
import com.shaycormac2062.monsterhuntermanual.domain.model.ailments.Ailment
import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.domain.model.charms.Charm
import com.shaycormac2062.monsterhuntermanual.domain.model.decorations.Decoration
import com.shaycormac2062.monsterhuntermanual.domain.model.events.Event
import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.domain.model.skills.Skill
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
abstract class InteractorModule {

    @Binds
    @Named("ailments")
    abstract fun bindAilmentsInteractor(
        ailmentsInteractor: AilmentsInteractor
    ): BaseInteractor<Ailment>

    @Binds
    @Named("armor")
    abstract fun bindArmorInteractor(
        armorInteractor: ArmorInteractor
    ): BaseInteractor<Armor>

    @Binds
    @Named("charms")
    abstract fun bindCharmsInteractor(
        charmsInteractor: CharmsInteractor
    ): BaseInteractor<Charm>

    @Binds
    @Named("decorations")
    abstract fun bindDecorationsInteractor(
        decorationsInteractor: DecorationsInteractor
    ): BaseInteractor<Decoration>

    @Binds
    @Named("events")
    abstract fun bindEventaInteractor(
        eventInteractor: EventInteractor
    ): BaseInteractor<Event>

    @Binds
    @Named("monsters")
    abstract fun bindMonsterInteractor(
        monsterInteractor: MonsterInteractor
    ): BaseInteractor<Monster>

    @Binds
    @Named("skills")
    abstract fun bindSkillInteractor(
        skillsInteractor: SkillsInteractor
    ): BaseInteractor<Skill>

    @Binds
    @Named("weapons")
    abstract fun bindWeaponInteractor(
        weaponsInteractor: WeaponsInteractor
    ): BaseInteractor<Weapon>

}
