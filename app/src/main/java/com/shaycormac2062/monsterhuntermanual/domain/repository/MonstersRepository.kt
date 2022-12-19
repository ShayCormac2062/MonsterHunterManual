package com.shaycormac2062.monsterhuntermanual.domain.repository

import com.shaycormac2062.monsterhuntermanual.domain.model.monsters.Monster
import com.shaycormac2062.monsterhuntermanual.utils.RequestResult

interface MonstersRepository {

    suspend fun getMonsters(): RequestResult<List<Monster>?>
    suspend fun getMonsterById(id: Int): RequestResult<Monster?>

}