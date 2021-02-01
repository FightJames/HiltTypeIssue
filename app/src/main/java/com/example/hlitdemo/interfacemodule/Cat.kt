package com.example.hlitdemo.interfacemodule

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Cat @Inject constructor() : Animal {
    override fun run(): String = "jumpjump"
    override fun makeNoice(): String = "meow"
}