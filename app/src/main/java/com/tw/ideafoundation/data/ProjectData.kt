package com.tw.ideafoundation.data

import com.google.gson.annotations.SerializedName

data class ProjectData(
    @SerializedName("data")
    val data: Data,
    @SerializedName("success")
    val success: Boolean = false,
    @SerializedName("authToken")
    val authToken: String = "",
    @SerializedName("message")
    val message: String = ""
)