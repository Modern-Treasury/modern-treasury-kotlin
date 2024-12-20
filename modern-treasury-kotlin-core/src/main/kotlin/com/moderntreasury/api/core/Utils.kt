@file:JvmName("Utils")

package com.moderntreasury.api.core

import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.SortedMap

internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw ModernTreasuryInvalidDataException("`${name}` is not present")

internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) immutableEmptyMap() else Collections.unmodifiableMap(toMap())

internal fun <K, V> immutableEmptyMap(): Map<K, V> = Collections.emptyMap()

internal fun <K : Comparable<K>, V> SortedMap<K, V>.toImmutable(): SortedMap<K, V> =
    if (isEmpty()) Collections.emptySortedMap()
    else Collections.unmodifiableSortedMap(toSortedMap(comparator()))

internal fun Headers.getRequiredHeader(name: String): String =
    values(name).firstOrNull()
        ?: throw ModernTreasuryInvalidDataException("Could not find $name header")

internal interface Enum
