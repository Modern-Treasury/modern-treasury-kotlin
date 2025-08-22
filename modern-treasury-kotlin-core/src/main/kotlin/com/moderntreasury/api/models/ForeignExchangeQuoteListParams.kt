// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/** list foreign_exchange_quotes */
class ForeignExchangeQuoteListParams
private constructor(
    private val afterCursor: String?,
    private val baseCurrency: String?,
    private val effectiveAtEnd: LocalDate?,
    private val effectiveAtStart: LocalDate?,
    private val expiresAt: OffsetDateTime?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val targetCurrency: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): String? = afterCursor

    /** Currency to convert, often called the "sell" currency. */
    fun baseCurrency(): String? = baseCurrency

    /** An inclusive upper bound for searching effective_at */
    fun effectiveAtEnd(): LocalDate? = effectiveAtEnd

    /** An inclusive lower bound for searching effective_at */
    fun effectiveAtStart(): LocalDate? = effectiveAtStart

    /** The timestamp until which the quote must be booked by. */
    fun expiresAt(): OffsetDateTime? = expiresAt

    /** The ID for the `InternalAccount` this quote is associated with. */
    fun internalAccountId(): String? = internalAccountId

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Metadata? = metadata

    fun perPage(): Long? = perPage

    /** Currency to convert the `base_currency` to, often called the "buy" currency. */
    fun targetCurrency(): String? = targetCurrency

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ForeignExchangeQuoteListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ForeignExchangeQuoteListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [ForeignExchangeQuoteListParams]. */
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var baseCurrency: String? = null
        private var effectiveAtEnd: LocalDate? = null
        private var effectiveAtStart: LocalDate? = null
        private var expiresAt: OffsetDateTime? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var targetCurrency: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(foreignExchangeQuoteListParams: ForeignExchangeQuoteListParams) = apply {
            afterCursor = foreignExchangeQuoteListParams.afterCursor
            baseCurrency = foreignExchangeQuoteListParams.baseCurrency
            effectiveAtEnd = foreignExchangeQuoteListParams.effectiveAtEnd
            effectiveAtStart = foreignExchangeQuoteListParams.effectiveAtStart
            expiresAt = foreignExchangeQuoteListParams.expiresAt
            internalAccountId = foreignExchangeQuoteListParams.internalAccountId
            metadata = foreignExchangeQuoteListParams.metadata
            perPage = foreignExchangeQuoteListParams.perPage
            targetCurrency = foreignExchangeQuoteListParams.targetCurrency
            additionalHeaders = foreignExchangeQuoteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = foreignExchangeQuoteListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: String?) = apply { this.baseCurrency = baseCurrency }

        /** An inclusive upper bound for searching effective_at */
        fun effectiveAtEnd(effectiveAtEnd: LocalDate?) = apply {
            this.effectiveAtEnd = effectiveAtEnd
        }

        /** An inclusive lower bound for searching effective_at */
        fun effectiveAtStart(effectiveAtStart: LocalDate?) = apply {
            this.effectiveAtStart = effectiveAtStart
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { this.expiresAt = expiresAt }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String?) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: String?) = apply { this.targetCurrency = targetCurrency }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ForeignExchangeQuoteListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterCursor?.let { put("after_cursor", it) }
                baseCurrency?.let { put("base_currency", it) }
                effectiveAtEnd?.let { put("effective_at_end", it.toString()) }
                effectiveAtStart?.let { put("effective_at_start", it.toString()) }
                expiresAt?.let {
                    put("expires_at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                internalAccountId?.let { put("internal_account_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                perPage?.let { put("per_page", it.toString()) }
                targetCurrency?.let { put("target_currency", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ForeignExchangeQuoteListParams &&
            afterCursor == other.afterCursor &&
            baseCurrency == other.baseCurrency &&
            effectiveAtEnd == other.effectiveAtEnd &&
            effectiveAtStart == other.effectiveAtStart &&
            expiresAt == other.expiresAt &&
            internalAccountId == other.internalAccountId &&
            metadata == other.metadata &&
            perPage == other.perPage &&
            targetCurrency == other.targetCurrency &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            afterCursor,
            baseCurrency,
            effectiveAtEnd,
            effectiveAtStart,
            expiresAt,
            internalAccountId,
            metadata,
            perPage,
            targetCurrency,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ForeignExchangeQuoteListParams{afterCursor=$afterCursor, baseCurrency=$baseCurrency, effectiveAtEnd=$effectiveAtEnd, effectiveAtStart=$effectiveAtStart, expiresAt=$expiresAt, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, targetCurrency=$targetCurrency, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
