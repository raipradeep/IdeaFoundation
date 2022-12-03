package com.tw.ideafoundation.ui.viewModel

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tw.ideafoundation.R
import com.tw.ideafoundation.data.ProjectData
import com.tw.ideafoundation.service.APIInterface
import com.tw.ideafoundation.service.RetrofitBase
import com.tw.ideafoundation.ui.main.AdapterMain
import com.tw.ideafoundation.ui.projectUI.AdapterProject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(val activity: Activity) : ViewModel() {

    val adapterMain: AdapterMain = AdapterMain()
    val adapterProject: AdapterProject = AdapterProject()
    val activityd: Activity

    init {
        activityd = Activity()
    }

    fun getItemList() = viewModelScope.launch {

        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["USER_ID"] = "userId"
        val result = userList.getList("param", "", "")
        if (result.body() != null) {
            //adapterMain.setData(token)
        }
    }

    fun getProjectList() = viewModelScope.launch {
        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["authtoken"] =
            "eyJ0eXBlIjoiQlMiLCJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzaXRlaWQiOiJkbFZQV0V0aEwzcG1SMkpFUVc1NFpsYzJaREpSWnowOSIsImRldmljZW5vIjoiWm1OQmVtOTZVVEJNT0RWc1NqSmhSRFl4V0c4dlppc3hTSEJNVjI5NE1FZEtjblpzYlZaTGVrNWFPRDA9IiwiY2xpZW50bmFtZSI6ImF6RXZOU3Q0VG1aSk1rTTBSR1V5ZUVKMk1GUkJUakZTWnpsMVNubGhNRUphTlZWdk9HczVlVko2T0QwPSIsInVzZXJpZCI6IlJuUnhhbVI0U1hkUVdrdElja1ZMVWt0eVMyRjBRVDA5In0.Fg5JbggGjDSqu4L3xlD7XofiKCnOon_MlCeRzU1UWQI"
        val result = userList.getUserAssignmentProject(param)
        if (result.body() != null) {
            val projectData = result.body()!!.data

            adapterProject.setData(projectData.userProjects!!)

        }
    }
}