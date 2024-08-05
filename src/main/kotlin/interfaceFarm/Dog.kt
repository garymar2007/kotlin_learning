package org.gary.interfaceFarm

class Dog(override val name: String) : FarmAnimal {
    override fun speak() {
        println("Woof! Woof!")
    }
}