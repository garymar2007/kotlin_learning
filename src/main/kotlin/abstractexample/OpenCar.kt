package org.gary.abstractexample

open class OpenCar (private val acceleration: Double = 1.0) {
    protected var speed = 0.0
    protected open fun makeEngineSound() = println("Vroom! Vroom!")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}