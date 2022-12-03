package com.tw.ideafoundation.data

import com.google.gson.annotations.SerializedName

data class Data(@SerializedName("user_projects")
                val userProjects: List<UserProjectsItem>?)