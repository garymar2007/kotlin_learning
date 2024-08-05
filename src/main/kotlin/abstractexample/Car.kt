package org.gary.abstractexample

abstract class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0
    private set
    protected abstract fun makeEngineSound()

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}