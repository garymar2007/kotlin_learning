package org.gary.interfaceFarm

class Cow(override val name: String) : FarmAnimal {
    override fun speak() {
        println("Moo! Moo!")
    }
}