package uk.co.rafearnold.commons.shareddata.hazelcast

import com.hazelcast.cp.IAtomicLong
import uk.co.rafearnold.commons.shareddata.SharedAtomicLong

class HazelcastSharedAtomicLong(private val hazelcastLong: IAtomicLong) : SharedAtomicLong {

    override fun get(): Long = hazelcastLong.get()

    override fun compareAndSet(expectValue: Long, newValue: Long): Boolean =
        hazelcastLong.compareAndSet(expectValue, newValue)

    override fun getAndIncrement(): Long = hazelcastLong.andIncrement
}
