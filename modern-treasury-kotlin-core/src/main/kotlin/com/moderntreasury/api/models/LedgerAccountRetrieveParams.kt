// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** Get details on a single ledger account. */
class LedgerAccountRetrieveParams
private constructor(
    private val id: String,
    private val balances: Balances?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): String = id

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound. Use `balances[as_of_lock_version]` to retrieve a balance
     * as of a specific Ledger Account `lock_version`.
     */
    fun balances(): Balances? = balances

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.balances?.forEachQueryParam { key, values ->
            queryParams.put("balances[$key]", values)
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var id: String? = null
        private var balances: Balances? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerAccountRetrieveParams: LedgerAccountRetrieveParams) = apply {
            id = ledgerAccountRetrieveParams.id
            balances = ledgerAccountRetrieveParams.balances
            additionalHeaders = ledgerAccountRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerAccountRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound. Use `balances[as_of_lock_version]` to
         * retrieve a balance as of a specific Ledger Account `lock_version`.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): LedgerAccountRetrieveParams =
            LedgerAccountRetrieveParams(
                checkRequired("id", id),
                balances,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound. Use `balances[as_of_lock_version]` to retrieve a balance
     * as of a specific Ledger Account `lock_version`.
     */
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val asOfLockVersion: Long?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun asOfDate(): LocalDate? = asOfDate

        fun asOfLockVersion(): Long? = asOfLockVersion

        fun effectiveAt(): OffsetDateTime? = effectiveAt

        fun effectiveAtLowerBound(): OffsetDateTime? = effectiveAtLowerBound

        fun effectiveAtUpperBound(): OffsetDateTime? = effectiveAtUpperBound

        fun _additionalProperties(): QueryParams = additionalProperties

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
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var asOfDate: LocalDate? = null
            private var asOfLockVersion: Long? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(balances: Balances) = apply {
                asOfDate = balances.asOfDate
                asOfLockVersion = balances.asOfLockVersion
                effectiveAt = balances.effectiveAt
                effectiveAtLowerBound = balances.effectiveAtLowerBound
                effectiveAtUpperBound = balances.effectiveAtUpperBound
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            fun asOfLockVersion(asOfLockVersion: Long?) = apply {
                this.asOfLockVersion = asOfLockVersion
            }

            fun asOfLockVersion(asOfLockVersion: Long) = asOfLockVersion(asOfLockVersion as Long?)

            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime?) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Balances =
                Balances(
                    asOfDate,
                    asOfLockVersion,
                    effectiveAt,
                    effectiveAtLowerBound,
                    effectiveAtUpperBound,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && asOfDate == other.asOfDate && asOfLockVersion == other.asOfLockVersion && effectiveAt == other.effectiveAt && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(asOfDate, asOfLockVersion, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{asOfDate=$asOfDate, asOfLockVersion=$asOfLockVersion, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountRetrieveParams && id == other.id && balances == other.balances && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, balances, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountRetrieveParams{id=$id, balances=$balances, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
