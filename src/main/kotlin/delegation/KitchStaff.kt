package org.gary.delegation

interface KitchStaff {
    fun prepareEntree(name: String): Entree?
    fun prepareAppetizer(name: String)
    fun prepareDessert(name: String)
    fun receiveCompliment(message: String)
}