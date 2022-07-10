package uk.co.rafearnold.commons.shareddata

import java.util.concurrent.TimeUnit

interface SharedLock {

    fun lock()

    fun lock(ttl: Long, ttlUnit: TimeUnit): Boolean

    fun unlock()
}
