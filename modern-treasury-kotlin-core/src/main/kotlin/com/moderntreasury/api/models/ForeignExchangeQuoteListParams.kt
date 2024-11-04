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

class ForeignExchangeQuoteListParams
constructor(
    private val afterCursor: String?,
    private val baseCurrency: String?,
    private val effectiveAtEnd: LocalDate?,
    private val effectiveAtStart: LocalDate?,
    private val expiresAt: OffsetDateTime?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val targetCurrency: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun afterCursor(): String? = afterCursor

    fun baseCurrency(): String? = baseCurrency

    fun effectiveAtEnd(): LocalDate? = effectiveAtEnd

    fun effectiveAtStart(): LocalDate? = effectiveAtStart

    fun expiresAt(): OffsetDateTime? = expiresAt

    fun internalAccountId(): String? = internalAccountId

    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    fun targetCurrency(): String? = targetCurrency

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.baseCurrency?.let { params.put("base_currency", listOf(it.toString())) }
        this.effectiveAtEnd?.let { params.put("effective_at_end", listOf(it.toString())) }
        this.effectiveAtStart?.let { params.put("effective_at_start", listOf(it.toString())) }
        this.expiresAt?.let {
            params.put("expires_at", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.internalAccountId?.let { params.put("internal_account_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.targetCurrency?.let { params.put("target_currency", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListParams && this.afterCursor == other.afterCursor && this.baseCurrency == other.baseCurrency && this.effectiveAtEnd == other.effectiveAtEnd && this.effectiveAtStart == other.effectiveAtStart && this.expiresAt == other.expiresAt && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.perPage == other.perPage && this.targetCurrency == other.targetCurrency && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(afterCursor, baseCurrency, effectiveAtEnd, effectiveAtStart, expiresAt, internalAccountId, metadata, perPage, targetCurrency, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ForeignExchangeQuoteListParams{afterCursor=$afterCursor, baseCurrency=$baseCurrency, effectiveAtEnd=$effectiveAtEnd, effectiveAtStart=$effectiveAtStart, expiresAt=$expiresAt, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, targetCurrency=$targetCurrency, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var baseCurrency: String? = null
        private var effectiveAtEnd: LocalDate? = null
        private var effectiveAtStart: LocalDate? = null
        private var expiresAt: OffsetDateTime? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var targetCurrency: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        internal fun from(foreignExchangeQuoteListParams: ForeignExchangeQuoteListParams) = apply {
            this.afterCursor = foreignExchangeQuoteListParams.afterCursor
            this.baseCurrency = foreignExchangeQuoteListParams.baseCurrency
            this.effectiveAtEnd = foreignExchangeQuoteListParams.effectiveAtEnd
            this.effectiveAtStart = foreignExchangeQuoteListParams.effectiveAtStart
            this.expiresAt = foreignExchangeQuoteListParams.expiresAt
            this.internalAccountId = foreignExchangeQuoteListParams.internalAccountId
            this.metadata = foreignExchangeQuoteListParams.metadata
            this.perPage = foreignExchangeQuoteListParams.perPage
            this.targetCurrency = foreignExchangeQuoteListParams.targetCurrency
            additionalHeaders(foreignExchangeQuoteListParams.additionalHeaders)
            additionalQueryParams(foreignExchangeQuoteListParams.additionalQueryParams)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: String) = apply { this.baseCurrency = baseCurrency }

        /** An inclusive upper bound for searching effective_at */
        fun effectiveAtEnd(effectiveAtEnd: LocalDate) = apply {
            this.effectiveAtEnd = effectiveAtEnd
        }

        /** An inclusive lower bound for searching effective_at */
        fun effectiveAtStart(effectiveAtStart: LocalDate) = apply {
            this.effectiveAtStart = effectiveAtStart
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: String) = apply { this.targetCurrency = targetCurrency }

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

        fun build(): ForeignExchangeQuoteListParams =
            ForeignExchangeQuoteListParams(
                afterCursor,
                baseCurrency,
                effectiveAtEnd,
                effectiveAtStart,
                expiresAt,
                internalAccountId,
                metadata,
                perPage,
                targetCurrency,
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
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
