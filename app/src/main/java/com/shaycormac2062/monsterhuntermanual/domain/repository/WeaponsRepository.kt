package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.weapons.Weapon
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface WeaponsRepository {

    suspend fun getWeapons(): RequestResult<List<Weapon>?>
    suspend fun getWeaponById(id: Int): RequestResult<Weapon?>
    suspend fun getWeaponBySlug(slug: String): RequestResult<Weapon?>

}