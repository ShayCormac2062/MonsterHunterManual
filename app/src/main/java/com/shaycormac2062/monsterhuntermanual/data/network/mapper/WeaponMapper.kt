package com.shaycormac2062.monsterhuntermanual.data.network.mapper

import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Slot as SlotData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Element as ElementData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Durability as DurabilityData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.UpgradeMaterial as UpgradeMaterialData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.CraftingMaterial as CraftingMaterialData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Attributes as AttributesData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Attack as AttackData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Assets as AssetsData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Shelling as ShellingData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Ammo as AmmoData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Phial as PhialData
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.WeaponDtoItem
import com.shaycormac2062.monsterhuntermanual.data.network.dto.weapons.Crafting as CraftingData
import com.shaycormac2062.monsterhuntermanual.data.network.mapper.CommonMapper.toDomainItem
import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.*

object WeaponMapper {

    fun WeaponDtoItem.toWeapon() = Weapon(
        ammo = ammo?.map { it.toDomain() },
        assets = assets?.toDomain(),
        attack = attack?.toDomain(),
        attributes = attributes?.toDomain(),
        boostType = boostType,
        coatings = coatings,
        crafting = crafting?.toDomain(),
        damageType = damageType,
        deviation = deviation,
        durability = durability?.map { it.toDomain() },
        elderseal = elderseal,
        elements = elements?.map { it.toDomain() },
        id = id,
        name = name,
        phial = phial?.toDomain(),
        rarity = rarity,
        shelling = shelling?.toDomain(),
        slots = slots?.map { it.toDomain() },
        specialAmmo = specialAmmo,
        type = type
    )

    private fun SlotData.toDomain() = Slot(
        rank = rank
    )

    private fun ShellingData.toDomain() = Shelling(
        level = level,
        type = type
    )

    private fun PhialData.toDomain() = Phial(
        damage = damage,
        type = type
    )

    private fun ElementData.toDomain() = Element(
        damage,
        hidden = hidden,
        type = type
    )

    private fun DurabilityData.toDomain() = Durability(
        blue = blue,
        green = green,
        orange = orange,
        purple = purple,
        red = red,
        white = white,
        yellow = yellow
    )

    private fun CraftingData.toDomain() = Crafting(
        branches = branches,
        craftable = craftable,
        craftingMaterials = craftingMaterials?.map { it.toDomain() },
        previous = previous,
        upgradeMaterials = upgradeMaterials?.map { it.toDomain() },
    )

    private fun CraftingMaterialData.toDomain() = CraftingMaterial(
        item = item?.toDomainItem(),
        quantity = quantity
    )

    private fun UpgradeMaterialData.toDomain() = UpgradeMaterial(
        item = item?.toDomainItem(),
        quantity = quantity
    )

    private fun AttributesData.toDomain() = Attributes(
        affinity = affinity,
        boostType = boostType,
        coatings = coatings,
        damageType = damageType,
        defense = defense,
        elderseal = elderseal
    )

    private fun AttackData.toDomain() = Attack(
        display = display,
        raw = raw
    )

    private fun AssetsData.toDomain() = Assets(
        icon = icon,
        image = image
    )

    private fun AmmoData.toDomain() = Ammo(
        capacities = capacities,
        type = type
    )

}
