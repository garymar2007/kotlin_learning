package org.gary.sealedtype

object FrontDesk {
    fun receive(request: Request) {
        println("handling request #${request.id}")
        when (request) {
            is OrderRequest
            -> {
                IceCubeFactory.fulfillOrder(request)
                println("Order request received: ${request.size}")
            }

            is RefundRequest
            -> {
                IceCubeFactory.fulfillRefund(request)
                println("Refund request received: ${request.size}")
            }
            is SupportRequest -> HelpDesk.handle(request)
        }
    }
}

fun main() {
    val order = OrderRequest(123, Size.CUP)
    val refund = RefundRequest(234, Size.BAG)

    FrontDesk.receive(order)
    FrontDesk.receive(refund)

    val request = SupportRequest(789, "I can't open teh bag of ice!")
    FrontDesk.receive(request)
}