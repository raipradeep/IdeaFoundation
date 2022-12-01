package com.tw.ideafoundation.ui.main

import android.os.Bundle
import com.rr.testproject.base.BaseActivity
import com.tw.ideafoundation.R
import com.tw.ideafoundation.databinding.ActivityMainBinding
import com.tw.ideafoundation.ui.viewModel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.mainData = viewModel
        binding.lifecycleOwner = this
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun getVmClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
}