package uk.co.rafearnold.commons.shareddata.hazelcast

import com.hazelcast.core.HazelcastInstance
import uk.co.rafearnold.commons.shareddata.SharedAtomicLong
import uk.co.rafearnold.commons.shareddata.SharedLock
import uk.co.rafearnold.commons.shareddata.SharedMap
import uk.co.rafearnold.commons.shareddata.simple.AbstractSharedDataService
import javax.inject.Inject

class HazelcastSharedDataService @Inject constructor(
    private val hazelcastInstance: HazelcastInstance
) : AbstractSharedDataService() {

    override fun getDistributedLong(name: String): SharedAtomicLong =
        HazelcastSharedAtomicLong(hazelcastLong = hazelcastInstance.cpSubsystem.getAtomicLong(name))

    override fun getDistributedLock(name: String): SharedLock =
        HazelcastSharedLock(hazelcastLock = hazelcastInstance.cpSubsystem.getLock(name))

    override fun <K : Any, V : Any> getDistributedMap(name: String): SharedMap<K, V> =
        HazelcastSharedMap(hazelcastMap = hazelcastInstance.getMap(name))
}
