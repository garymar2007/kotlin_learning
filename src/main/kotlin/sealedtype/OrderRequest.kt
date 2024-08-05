package org.gary.sealedtype

class OrderRequest(override val id: Int, val size: Size) : Request {
}