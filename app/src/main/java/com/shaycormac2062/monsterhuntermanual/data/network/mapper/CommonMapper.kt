package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Modifiers as ModifiersData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Material as MaterialData
import com.shaycormac2062.monsterhuntermanual.domain.model.common.Item
import com.shaycormac2062.monsterhuntermanual.data.network.dto.common.Item as ItemData
import com.shaycormac2062.monsterhuntermanual.domain.model.common.Material
import com.shaycormac2062.monsterhuntermanual.domain.model.common.Modifiers

object CommonMapper {

    fun ItemData.toDomainItem() = Item(
        carryLimit = carryLimit,
        description = description,
        id = id,
        name = name,
        rarity = rarity,
        value = value
    )

    fun MaterialData.toDomain() = Material(
        item = item?.toDomainItem(),
        quantity = quantity
    )

    fun ModifiersData.toDomain() = Modifiers(
        affinity,
        attack,
        damageDragon,
        damageFire,
        damageIce,
        damageThunder,
        damageWater,
        defense,
        health,
        resistAll,
        resistDragon,
        resistFire,
        resistIce,
        resistThunder,
        resistWater,
        sharpnessBonus
    )
}