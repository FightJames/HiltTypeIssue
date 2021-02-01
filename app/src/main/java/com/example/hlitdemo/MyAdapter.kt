package com.example.hlitdemo

import android.content.Context
import com.example.hlitdemo.interfacemodule.Animal
import com.example.hlitdemo.interfacemodule.Cat
import com.example.hlitdemo.interfacemodule.Dog
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityRetainedScoped
class MyAdapter @Inject constructor(val animal: Cat):
    Adapter {
}

interface Adapter