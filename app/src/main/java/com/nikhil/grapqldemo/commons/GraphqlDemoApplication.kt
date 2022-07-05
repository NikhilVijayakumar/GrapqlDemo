package com.nikhil.grapqldemo.commons

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GraphqlDemoApplication : Application() {

    init {
        instance = this
    }

    companion object {
        var instance: GraphqlDemoApplication? = null
        const val TAG = "Application"
    }

}