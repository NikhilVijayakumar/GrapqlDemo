package com.nikhil.grapqldemo.ui.main


import android.os.Bundle
import android.view.View
import com.nikhil.grapqldemo.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customizeDataBinding()
        hideToolbar()
        hideBottomNavigation()
    }

    fun hideBottomNavigation() {
        binding?.bottomNavigation?.visibility = View.GONE
    }

    fun showBottomNavigation() {
        binding?.bottomNavigation?.visibility = View.VISIBLE
    }
}