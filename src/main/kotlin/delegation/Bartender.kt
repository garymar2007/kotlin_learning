package org.gary.delegation

class Bartender: BarStaff {
    override fun prepareBeverage(name: String): Beverage? {
        return when (name) {
            "Water" -> Beverage.Water
            "Soda" -> Beverage.Soda
            "Tea" -> Beverage.Tea
            "Coffee" -> Beverage.Coffee
            else -> null
        }
    }
}