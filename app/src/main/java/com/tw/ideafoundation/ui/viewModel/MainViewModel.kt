package com.tw.ideafoundation.ui.viewModel

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tw.ideafoundation.service.APIInterface
import com.tw.ideafoundation.service.RetrofitBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel constructor(private val activity: Activity) : ViewModel() {


    val String = MutableLiveData<String>()
    val token = MutableLiveData<String>()

    //val adapterMain: AdapterMain

    init {
        //adapterMain = AdapterMain()
    }

    fun getItemList() = viewModelScope.launch {

        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["USER_ID"] = "userId"
        val result = userList.getLogin(param)
        if (result.body() != null) {
//            addNotes(result.body()!!)
//            adapterMain.setData(note)
        }
    }

    fun login() = viewModelScope.launch {

        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["USER_ID"] = "userId"
        val result = userList.getList("param")
        if (result.body() != null) {
            token.value = result.body()
        }
    }
}