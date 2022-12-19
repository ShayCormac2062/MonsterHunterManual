package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.armor.Armor
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface ArmorRepository {

    suspend fun getAllArmor(): RequestResult<List<Armor>?>
    suspend fun getArmorById(id: Int): RequestResult<Armor?>
    suspend fun getArmorBySlug(slug: String): RequestResult<Armor?>

}