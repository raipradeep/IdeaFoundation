package com.tw.ideafoundation.ui.loginUI

import android.os.Bundle
import com.rr.testproject.base.BaseActivity
import com.tw.ideafoundation.R
import com.tw.ideafoundation.databinding.ActivityLoginBinding
import com.tw.ideafoundation.ui.viewModel.MainViewModel

class LoginActivity : BaseActivity<ActivityLoginBinding, MainViewModel>() {

    override fun getLayout(): Int {
        return R.layout.activity_login
    }

    override fun getVmClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.data = viewModel
        binding.lifecycleOwner = this

        init()
    }


    fun init() {
        viewModel.token.observe(this) {
            let {

            }
        }
    }
}