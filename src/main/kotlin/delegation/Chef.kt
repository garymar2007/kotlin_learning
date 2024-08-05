package org.gary.delegation

class Chef : KitchStaff {
    override fun prepareEntree(name: String): Entree? = when(name) {
        "Chicken" -> Entree.Chicken
        "Beef" -> Entree.Beef
        "Fish" -> Entree.Fish
        "Tofu" -> Entree.Tofu
        else -> null
    }

    override fun prepareAppetizer(name: String) {
        TODO("Not yet implemented")
    }

    override fun prepareDessert(name: String) {
        TODO("Not yet implemented")
    }

    override fun receiveCompliment(message: String) {
        TODO("Not yet implemented")
    }
}