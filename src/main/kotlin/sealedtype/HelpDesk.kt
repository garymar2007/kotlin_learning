package org.gary.sealedtype

object HelpDesk {
    fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
}