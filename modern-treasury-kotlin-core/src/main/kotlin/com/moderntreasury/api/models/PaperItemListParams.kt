// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class PaperItemListParams
constructor(
    private val afterCursor: String?,
    private val depositDateEnd: LocalDate?,
    private val depositDateStart: LocalDate?,
    private val lockboxNumber: String?,
    private val perPage: Long?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun depositDateEnd(): LocalDate? = depositDateEnd

    fun depositDateStart(): LocalDate? = depositDateStart

    fun lockboxNumber(): String? = lockboxNumber

    fun perPage(): Long? = perPage

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.depositDateEnd?.let { params.put("deposit_date_end", listOf(it.toString())) }
        this.depositDateStart?.let { params.put("deposit_date_start", listOf(it.toString())) }
        this.lockboxNumber?.let { params.put("lockbox_number", listOf(it.toString())) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItemListParams && this.afterCursor == other.afterCursor && this.depositDateEnd == other.depositDateEnd && this.depositDateStart == other.depositDateStart && this.lockboxNumber == other.lockboxNumber && this.perPage == other.perPage && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, depositDateEnd, depositDateStart, lockboxNumber, perPage, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "PaperItemListParams{afterCursor=$afterCursor, depositDateEnd=$depositDateEnd, depositDateStart=$depositDateStart, lockboxNumber=$lockboxNumber, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var depositDateEnd: LocalDate? = null
        private var depositDateStart: LocalDate? = null
        private var lockboxNumber: String? = null
        private var perPage: Long? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(paperItemListParams: PaperItemListParams) = apply {
            this.afterCursor = paperItemListParams.afterCursor
            this.depositDateEnd = paperItemListParams.depositDateEnd
            this.depositDateStart = paperItemListParams.depositDateStart
            this.lockboxNumber = paperItemListParams.lockboxNumber
            this.perPage = paperItemListParams.perPage
            additionalHeaders(paperItemListParams.additionalHeaders)
            additionalQueryParams(paperItemListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Specify an inclusive end date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateEnd(depositDateEnd: LocalDate) = apply {
            this.depositDateEnd = depositDateEnd
        }

        /** Specify an inclusive start date (YYYY-MM-DD) when filtering by deposit_date */
        fun depositDateStart(depositDateStart: LocalDate) = apply {
            this.depositDateStart = depositDateStart
        }

        /**
         * Specify `lockbox_number` if you wish to see paper items that are associated with a
         * specific lockbox number.
         */
        fun lockboxNumber(lockboxNumber: String) = apply { this.lockboxNumber = lockboxNumber }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun build(): PaperItemListParams =
            PaperItemListParams(
                afterCursor,
                depositDateEnd,
                depositDateStart,
                lockboxNumber,
                perPage,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
