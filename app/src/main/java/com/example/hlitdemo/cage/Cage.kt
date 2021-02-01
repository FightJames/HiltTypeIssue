package com.example.hlitdemo.cage

import com.example.hlitdemo.interfacemodule.Animal

class Cage(val animal: Animal) {
    fun keepAnimal(): String = animal.makeNoice()

}