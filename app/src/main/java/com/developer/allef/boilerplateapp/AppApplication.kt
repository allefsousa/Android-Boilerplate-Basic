package com.developer.allef.boilerplateapp

import android.app.Application
import timber.log.Timber

class AppApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

    }
}