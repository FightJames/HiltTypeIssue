package com.james.module_tool

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object ToolModule {

    @Provides
    fun tool(): Tool {
        return Tool()
    }
}