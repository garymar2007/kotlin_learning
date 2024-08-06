package org.gary.generic

class GenericExample {
//    class Mug(val beverage: Beverage){}
//
//    fun drink(beverage: Beverage) {
//        when (beverage) {
//            is Tea -> println("Drinking tea")
//            is Coffee -> println("Drinking coffee")
//        }
//    }
//    val mug = Mug(Tea.GREEN_TEA)
//    drink(mug.beverage as Tea)

    class Mug<T: Beverage>(val beverage: T){
        val temperatur = beverage.idealTemperature
    }

    fun <T : Beverage> drink(beverage: T): String {
        when (beverage) {
            is Tea -> return "Drinking tea"
            is Coffee -> return "Drinking coffee"
            else -> return "Unknown beverage"
        }
    }
    val mug: Mug<Tea> = Mug(Tea.GREEN_TEA)
    val printout = drink<Tea>(mug.beverage)

}