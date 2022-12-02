package com.tw.ideafoundation.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tw.ideafoundation.service.APIInterface
import com.tw.ideafoundation.service.RetrofitBase
import com.tw.ideafoundation.ui.main.AdapterMain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val token = MutableLiveData<String>()
    var loadLatLng = MutableLiveData<String>()

    private val adapterMain: AdapterMain = AdapterMain()

    fun getItemList() = viewModelScope.launch {

        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["USER_ID"] = "userId"
        val result = userList.getList("param","","")
        if (result.body() != null) {
            //adapterMain.setData(token)
        }
    }

    fun login(phoneNumber: String, password: String) = viewModelScope.launch {
        Dispatchers.IO
        val userList = RetrofitBase.getInstance().create(APIInterface::class.java)
        val param = HashMap<String, String>()
        param["phone_number"] = "phoneNumber"
        param["password"] = "password"
        param["device_type"] = "device_type"
        param["device_token"] = "fo-duKT9S_ODEfNV6_azbs%3AAPA91bHm1y0CIKo-uWhHrNp74svxLvLmBRzSEQ3JzCQXljV30WN4DiDV43oPoUvgzHBF9BcducrcasGUJOqo9ry1SzNSn3x9b0w1kk2tPPpfNlt5odPTwIATzEeEDrvk065104NS6xJ"
        val result = userList.getLogin(param)
        if (result.body() != null) {
            token.value = result.body()
        }
    }
}