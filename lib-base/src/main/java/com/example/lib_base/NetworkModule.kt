package com.example.lib_base

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object NetworkModule {

    @Provides
    fun networkState(): NetworkState {
        return NetworkState()
    }
}