package uk.co.rafearnold.commons.misc

import java.util.concurrent.CompletableFuture

interface Registrable : Register {
    override fun register(): CompletableFuture<Void>
    fun unregister(): CompletableFuture<Void>
}
