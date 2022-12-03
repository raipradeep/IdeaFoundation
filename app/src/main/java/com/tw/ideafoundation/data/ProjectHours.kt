package com.tw.ideafoundation.data

import com.google.gson.annotations.SerializedName

data class ProjectHours(@SerializedName("start_time")
                        val startTime: String = "",
                        @SerializedName("visible")
                        val visible: String = "",
                        @SerializedName("date_updated")
                        val dateUpdated: String = "",
                        @SerializedName("project_id")
                        val projectId: Int = 0,
                        @SerializedName("end_time")
                        val endTime: String = "",
                        @SerializedName("project_day")
                        val projectDay: String = "",
                        @SerializedName("id")
                        val id: Int = 0)