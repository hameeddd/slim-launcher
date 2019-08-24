package com.sduduzog.slimlauncher.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.sduduzog.slimlauncher.data.model.HomeApp

class CustomiseAppsViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repository(application)
    private var _apps: LiveData<List<HomeApp>>

    init {
        _apps = repository.apps
    }

    val apps: LiveData<List<HomeApp>>
        get() = _apps

    fun update(vararg args: HomeApp) {
        repository.update(*args)
    }

    fun reset(homeApp: HomeApp) {}
    fun remove(vararg app: HomeApp) {
        repository.remove(*app)
    }
}