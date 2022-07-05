package com.nikhil.grapqldemo.ui.base


import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.ActivityBaseBinding


open class BaseActivity : AppCompatActivity() {

    protected var binding: ActivityBaseBinding? = null

    protected fun customizeDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)
        binding?.let { bind ->
            bind.lifecycleOwner = this
            val navHostFragment = supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment) as NavHostFragment?
            navHostFragment?.let { host ->
                val navController = host.navController
                bind.bottomNavigation.setupWithNavController(navController)
                val appBarConfiguration = AppBarConfiguration(navController.graph)
                setupActionBarWithNavController(navController, appBarConfiguration)
            }
        }
    }

    fun hideToolbar() {
        supportActionBar?.hide()

    }

    fun showToolbar() {
        supportActionBar?.show()
    }

    fun hideBackButton() {
        supportActionBar?.let { toolbar ->
            toolbar.setDisplayHomeAsUpEnabled(false)
            toolbar.setHomeButtonEnabled(false)
        }

    }

    fun showBackButton() {
        supportActionBar?.let { toolbar ->
            toolbar.setDisplayHomeAsUpEnabled(true)
            toolbar.setHomeButtonEnabled(true)
        }
    }
}