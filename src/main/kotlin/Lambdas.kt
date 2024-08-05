package org.gary

val taxMultiplier = 1.15

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    return priceAfterDiscount * taxMultiplier
}

fun calculateTotalWithTenPercentDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice * 0.9
    return priceAfterDiscount * taxMultiplier
}

//using a way to pass function as an argument
fun calculateTotalWithDiscount(initialPrice: Double, applyDiscount: (Double) -> Double): Double {
    val priceAfterDiscount = applyDiscount(initialPrice)
    return priceAfterDiscount * taxMultiplier
}

fun noDiscount(initialPrice: Double): Double = initialPrice * taxMultiplier

fun discountForCouponCode(couponCode: String): (Double) -> Double = when(couponCode) {
    "FIVE_BUCKS" -> ::calculateTotalWithFiveDollarDiscount
    "TAKE_10" -> ::calculateTotalWithTenPercentDiscount
    else -> ::noDiscount
}

fun main() {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))

    val anotherTotal = calculateTotalWithDiscount(20.0, ::calculateTotalWithFiveDollarDiscount);
    println("$%.2f".format(anotherTotal))

    val withFiveDollarOff = calculateTotalWithDiscount(20.0, discountForCouponCode("FIVE_BUCKS"))
    println("$%.2f".format(withFiveDollarOff))

    val withTenpercentOff = calculateTotalWithDiscount(20.0, discountForCouponCode("TAKE_10"))
    println("$%.2f".format(withTenpercentOff))

    val noDiscount = calculateTotalWithDiscount(20.0, discountForCouponCode("NO_DISCOUNT"))
    println("$%.2f".format(noDiscount))

    //pass lambdas as arguments
    val withFiveDollarOffInLambdas = calculateTotalWithDiscount(20.0, {price -> price - 5.0 } )
    println("$%.2f".format(withFiveDollarOffInLambdas))

    val withTenpercentOffInLambdas = calculateTotalWithDiscount(20.0, {price -> price * 0.9})
    println("$%.2f".format(withTenpercentOffInLambdas))

    val noDiscountInLambdas = calculateTotalWithDiscount(20.0, {price -> price})
    println("$%.2f".format(noDiscountInLambdas))
}
