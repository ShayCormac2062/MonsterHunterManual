package com.shaycormac2062.monsterhuntermanual.data.network.api

import com.shaycormac2062.monsterhuntermanual.data.network.dto.skills.SkillDtoItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SkillsApi {

    @GET("skills")
    suspend fun getSkills(): Response<List<SkillDtoItem>>

    @GET("armor/{id}")
    suspend fun getSkillById(
        @Path("id") id: Int
    ): Response<SkillDtoItem>

    @GET("armor/{slug}")
    suspend fun getSkillBySlug(
        @Path("slug") slug: String
    ): Response<SkillDtoItem>

}
