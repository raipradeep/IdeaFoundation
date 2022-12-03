package com.tw.ideafoundation.service

import com.tw.ideafoundation.data.ProjectData
import retrofit2.Response
import retrofit2.http.*

interface APIInterface {

    @GET("getUserAssignedProjects")
    suspend fun getUserAssignmentProject(@HeaderMap headers: Map<String, String>): Response<ProjectData>

    @GET("getUserAssignedProjects")
    suspend fun getList(
        @Header("Authorization") authorization: String,
        @Query("lat") late: String, @Query("long") long: String
    ): Response<String>
}