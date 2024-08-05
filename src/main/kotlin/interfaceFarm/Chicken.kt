package org.gary.interfaceFarm

class Chicken(override val name: String) : FarmAnimal {
    var numberOfEggs = 0
    override fun speak() {
        println("Cluck! Cluck!")
    }
}