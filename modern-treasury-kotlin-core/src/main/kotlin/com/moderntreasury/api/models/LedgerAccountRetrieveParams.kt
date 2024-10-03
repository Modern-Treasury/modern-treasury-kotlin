// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class LedgerAccountRetrieveParams
constructor(
    private val id: String,
    private val balances: Balances?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun id(): String = id

    fun balances(): Balances? = balances

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.balances?.forEachQueryParam { key, values -> params.put("balances[$key]", values) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountRetrieveParams && this.id == other.id && this.balances == other.balances && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(id, balances, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountRetrieveParams{id=$id, balances=$balances, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var balances: Balances? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(ledgerAccountRetrieveParams: LedgerAccountRetrieveParams) = apply {
            this.id = ledgerAccountRetrieveParams.id
            this.balances = ledgerAccountRetrieveParams.balances
            additionalQueryParams(ledgerAccountRetrieveParams.additionalQueryParams)
            additionalHeaders(ledgerAccountRetrieveParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): LedgerAccountRetrieveParams =
            LedgerAccountRetrieveParams(
                checkNotNull(id) { "`id` is required but was not set" },
                balances,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
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
            this.effectiveAt?.let { putParam("effective_at", listOf(it.toString())) }
            this.effectiveAtLowerBound?.let {
                putParam("effective_at_lower_bound", listOf(it.toString()))
            }
            this.effectiveAtUpperBound?.let {
                putParam("effective_at_upper_bound", listOf(it.toString()))
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
                    additionalProperties.toUnmodifiable(),
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
