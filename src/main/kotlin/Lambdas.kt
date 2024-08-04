package org.gary

val taxMultiplier = 1.15

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    return priceAfterDiscount * taxMultiplier
}

//using a way to pass function as an argument
fun calculateTotalWithDiscount(initialPrice: Double, applyDiscount: (Double) -> Double): Double {
    val priceAfterDiscount = applyDiscount(initialPrice)
    return priceAfterDiscount * taxMultiplier
}

fun main() {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))

    val anotherTotal = calculateTotalWithDiscount(20.0, ::calculateTotalWithFiveDollarDiscount);
    println("$%.2f".format(total))
}
