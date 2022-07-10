package uk.co.rafearnold.commons.misc

import java.util.concurrent.CompletableFuture

interface Register {
    fun register(): CompletableFuture<Void>
}
