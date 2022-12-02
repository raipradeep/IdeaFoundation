package com.tw.ideafoundation.ui.loginUI

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.app.ActivityCompat
import com.rr.testproject.base.BaseActivity
import com.tw.ideafoundation.R
import com.tw.ideafoundation.databinding.ActivityLoginBinding
import com.tw.ideafoundation.ui.main.MainActivity
import com.tw.ideafoundation.ui.viewModel.MainViewModel
import com.tw.ideafoundation.utils.GpsTracker
import kotlinx.android.synthetic.main.activity_login.*
import java.io.IOException
import java.util.*

class LoginActivity : BaseActivity<ActivityLoginBinding, MainViewModel>() {

    private var latitude = 0.0
    private var longitude = 0.0
    private var isPermissionGranted = false
    private var gpsTracker: GpsTracker? = null

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
        getLocation()

        viewModel.loadLatLng.observe(this) {
            it?.let {
                getLocation()
                viewModel.loadLatLng.value = null
            }
        }

        btnSubmit.setOnClickListener {
            if (validation()) {
                viewModel.login(edt_phoneNumber.text.toString(), edt_password.text.toString())
            }
        }
    }


    fun init() {
        viewModel.token.observe(this) {
            let {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("latitude", latitude)
                intent.putExtra("longitude", longitude)
                startActivity(intent)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 101) {
            if (ActivityCompat.checkSelfPermission(
                    mContext!!,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(
                    mContext!!,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) ==
                PackageManager.PERMISSION_GRANTED
            ) {
                getLocation()
            }
        }
    }

    private fun getLocation() {
        gpsTracker = GpsTracker(this)
        if (gpsTracker!!.canGetLocation()) {
            latitude = gpsTracker!!.latitude
            longitude = gpsTracker!!.longitude
        } else {
            gpsTracker!!.showSettingsAlert()
        }
    }

    fun validation(): Boolean {
        var valid = true
        val phone = edt_phoneNumber.text.toString()
        val password = edt_password.text.toString()
        if (phone.isEmpty()) {
            edt_phoneNumber.error = "Please Enter Phone Number"
            valid = false
        }
        if (password.isEmpty()) {
            edt_password.error = "Please Enter Password"
            valid = false
        }
        return valid
    }
}