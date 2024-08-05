package org.gary.interfaceFarm

class Farmer {
    fun greeting(farmAnimal: FarmAnimal) {
        println("Hello, ${farmAnimal.name}!")
        if(farmAnimal is Chicken) {
            farmAnimal.numberOfEggs = 5
            println("You lay ${farmAnimal.numberOfEggs} eggs.")
        }

        val eggCount = (farmAnimal as? Chicken)?.let { println("I see you have ${it.numberOfEggs} eggs today!")}
        farmAnimal.speak()
    }
}

fun main(){
    val farmer = Farmer()
    val dog = Dog("Rover")
    val chicken = Chicken("Cluckers")
    val cow = Cow("Bessie")
    farmer.greeting(dog)
    farmer.greeting(chicken)
    farmer.greeting(cow)

    val hen: FarmAnimal = Chicken("Henrietta")
    farmer.greeting(hen)
}