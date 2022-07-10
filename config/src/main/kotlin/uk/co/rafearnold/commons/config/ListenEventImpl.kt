package uk.co.rafearnold.commons.config

data class ListenEventImpl<K, V>(
    override val key: K,
    override val oldValue: V?,
    override val newValue: V?
) : ObservableMap.ListenEvent<K, V>
