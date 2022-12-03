package com.tw.ideafoundation.ui.projectUI

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.rr.testproject.base.BaseActivity
import com.tw.ideafoundation.R
import com.tw.ideafoundation.databinding.ActivityLoginBinding
import com.tw.ideafoundation.ui.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_login.*

class ProjectUIActivity : BaseActivity<ActivityLoginBinding, MainViewModel>() {

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

    private fun init() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerViewProject.layoutManager = layoutManager
        recyclerViewProject.itemAnimator = DefaultItemAnimator()
        recyclerViewProject.adapter = viewModel.adapterProject
        viewModel.getProjectList()

    }
}