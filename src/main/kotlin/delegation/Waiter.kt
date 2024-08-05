package org.gary.delegation

class Waiter(private val chef: Chef,
             private val bartender: Bartender)
    : KitchStaff by chef,
    BarStaff by bartender {
    fun acceptPayment(amount: Double) = println("Thank you for paying for your meal:$$amount")
}

fun main() {
    val waiter = Waiter(Chef(), Bartender())
    val beverage = waiter.prepareBeverage("Soda")
    val entree = waiter.prepareEntree("Chicken")
}