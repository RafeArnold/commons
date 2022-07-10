package uk.co.rafearnold.commons.shareddata

interface SharedAtomicLong {

    fun get(): Long

    fun compareAndSet(expectValue: Long, newValue: Long): Boolean

    fun getAndIncrement(): Long
}
