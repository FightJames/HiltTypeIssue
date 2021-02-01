package com.example.hlitdemo

import com.example.hlitdemo.interfacemodule.Animal
import com.example.hlitdemo.interfacemodule.Cat
import com.example.hlitdemo.interfacemodule.Dog
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


//@Module
//@InstallIn(ActivityComponent::class)
//abstract class MainModule {
//
//    @Binds
//    abstract fun bindMainActivity(cat: Cat): Animal
//
//    @Binds
//    abstract fun bindAdapter(adt: MyAdapter): Adapter
//
//}