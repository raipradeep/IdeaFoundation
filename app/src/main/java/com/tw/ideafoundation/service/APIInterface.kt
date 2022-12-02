package com.tw.ideafoundation.service

import retrofit2.Response
import retrofit2.http.*

interface APIInterface {

    @POST("loginWithPassword")
    suspend fun getLogin(@HeaderMap headers: Map<String, String>): Response<String>

    @GET("user")
    suspend fun getList(
        @Header("Authorization") authorization: String,
        @Query("lat") late: String, @Query("long") long: String
    ): Response<String>
}