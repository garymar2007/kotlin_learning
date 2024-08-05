package org.gary.abstractexample

class RacingCar : OpenCar(2.0) {
    override fun makeEngineSound() = when{
        speed < 10.0 -> println("Vroom!")
        speed < 20.0 -> println("Vroom! Vroom!")
        else -> println("Vroom! Vroom! Vroom!")

        speed = 100.0
    }
}