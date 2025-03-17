// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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
    @NoAutoDetect
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

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListParams && afterCursor == other.afterCursor && baseCurrency == other.baseCurrency && effectiveAtEnd == other.effectiveAtEnd && effectiveAtStart == other.effectiveAtStart && expiresAt == other.expiresAt && internalAccountId == other.internalAccountId && metadata == other.metadata && perPage == other.perPage && targetCurrency == other.targetCurrency && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, baseCurrency, effectiveAtEnd, effectiveAtStart, expiresAt, internalAccountId, metadata, perPage, targetCurrency, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListParams{afterCursor=$afterCursor, baseCurrency=$baseCurrency, effectiveAtEnd=$effectiveAtEnd, effectiveAtStart=$effectiveAtStart, expiresAt=$expiresAt, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, targetCurrency=$targetCurrency, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
