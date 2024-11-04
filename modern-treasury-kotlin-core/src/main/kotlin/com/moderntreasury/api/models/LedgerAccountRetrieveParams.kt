// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class LedgerAccountRetrieveParams
constructor(
    private val id: String,
    private val balances: Balances?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun id(): String = id

    fun balances(): Balances? = balances

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.balances?.forEachQueryParam { key, values -> params.put("balances[$key]", values) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountRetrieveParams && this.id == other.id && this.balances == other.balances && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, balances, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountRetrieveParams{id=$id, balances=$balances, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var balances: Balances? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(ledgerAccountRetrieveParams: LedgerAccountRetrieveParams) = apply {
            this.id = ledgerAccountRetrieveParams.id
            this.balances = ledgerAccountRetrieveParams.balances
            additionalHeaders(ledgerAccountRetrieveParams.additionalHeaders)
            additionalQueryParams(ledgerAccountRetrieveParams.additionalQueryParams)
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound. Use `balances[as_of_lock_version]` to
         * retrieve a balance as of a specific Ledger Account `lock_version`.
         */
        fun balances(balances: Balances) = apply { this.balances = balances }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): LedgerAccountRetrieveParams =
            LedgerAccountRetrieveParams(
                checkNotNull(id) { "`id` is required but was not set" },
                balances,
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

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound. Use `balances[as_of_lock_version]` to retrieve a balance
     * as of a specific Ledger Account `lock_version`.
     */
    @JsonDeserialize(builder = Balances.Builder::class)
    @NoAutoDetect
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val asOfLockVersion: Long?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun asOfDate(): LocalDate? = asOfDate

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        fun effectiveAtLowerBound(): OffsetDateTime? = effectiveAtLowerBound

        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        fun asOfLockVersion(): Long? = asOfLockVersion

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.asOfDate?.let { putParam("as_of_date", listOf(it.toString())) }
            this.asOfLockVersion?.let { putParam("as_of_lock_version", listOf(it.toString())) }
            this.effectiveAt?.let {
                putParam("effective_at", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.effectiveAtLowerBound?.let {
                putParam(
                    "effective_at_lower_bound",
                    listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                )
            }
            this.effectiveAtUpperBound?.let {
                putParam(
                    "effective_at_upper_bound",
                    listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                )
            }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var asOfDate: LocalDate? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var asOfLockVersion: Long? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(balances: Balances) = apply {
                this.asOfDate = balances.asOfDate
                this.effectiveAt = balances.effectiveAt
                this.effectiveAtLowerBound = balances.effectiveAtLowerBound
                this.effectiveAtUpperBound = balances.effectiveAtUpperBound
                this.asOfLockVersion = balances.asOfLockVersion
                additionalProperties(balances.additionalProperties)
            }

            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            fun asOfLockVersion(asOfLockVersion: Long) = apply {
                this.asOfLockVersion = asOfLockVersion
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Balances =
                Balances(
                    asOfDate,
                    effectiveAt,
                    effectiveAtLowerBound,
                    effectiveAtUpperBound,
                    asOfLockVersion,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && this.asOfDate == other.asOfDate && this.effectiveAt == other.effectiveAt && this.effectiveAtLowerBound == other.effectiveAtLowerBound && this.effectiveAtUpperBound == other.effectiveAtUpperBound && this.asOfLockVersion == other.asOfLockVersion && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(asOfDate, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, asOfLockVersion, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Balances{asOfDate=$asOfDate, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, asOfLockVersion=$asOfLockVersion, additionalProperties=$additionalProperties}"
    }
}
