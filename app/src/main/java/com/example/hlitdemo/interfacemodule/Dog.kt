package com.example.hlitdemo.interfacemodule

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


class Dog @Inject constructor() : Animal {
    override fun run(): String = "gogogo"
    override fun makeNoice(): String = "wong wong"
}