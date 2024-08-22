// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ForeignExchangeQuoteListParams &&
            this.afterCursor == other.afterCursor &&
            this.baseCurrency == other.baseCurrency &&
            this.effectiveAtEnd == other.effectiveAtEnd &&
            this.effectiveAtStart == other.effectiveAtStart &&
            this.expiresAt == other.expiresAt &&
            this.internalAccountId == other.internalAccountId &&
            this.metadata == other.metadata &&
            this.perPage == other.perPage &&
            this.targetCurrency == other.targetCurrency &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            baseCurrency,
            effectiveAtEnd,
            effectiveAtStart,
            expiresAt,
            internalAccountId,
            metadata,
            perPage,
            targetCurrency,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ForeignExchangeQuoteListParams{afterCursor=$afterCursor, baseCurrency=$baseCurrency, effectiveAtEnd=$effectiveAtEnd, effectiveAtStart=$effectiveAtStart, expiresAt=$expiresAt, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, targetCurrency=$targetCurrency, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

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
            additionalQueryParams(foreignExchangeQuoteListParams.additionalQueryParams)
            additionalHeaders(foreignExchangeQuoteListParams.additionalHeaders)
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
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

        private var hashCode: Int = 0

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
