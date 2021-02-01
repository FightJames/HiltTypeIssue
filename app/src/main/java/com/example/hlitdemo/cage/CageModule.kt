package com.example.hlitdemo.cage

import com.example.hlitdemo.interfacemodule.Cat
import com.example.hlitdemo.interfacemodule.Dog
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
object CageModule {

    @Provides
    @CageWithDog
    fun provoideCageDog(dog: Dog): Cage = Cage(dog)

    @Provides
    @CageWithCat
    fun provoideCageCat(cat: Cat): Cage = Cage(cat)
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class CageWithDog

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class CageWithCat