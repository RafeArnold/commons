package uk.co.rafearnold.commons.shareddata

fun interface SharedMapEventHandler<K, V> {
    fun handle(event: SharedMapEvent<K, V>)
}
