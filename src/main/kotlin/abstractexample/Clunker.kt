package org.gary.abstractexample

class Clunker(val acceleration : Double) : Car(acceleration) {
    override fun makeEngineSound() = println("Clunk! Clunk!")
}