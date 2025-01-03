// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

class ForeignExchangeQuoteCreateParams
constructor(
    private val body: ForeignExchangeQuoteCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The ID for the `InternalAccount` this quote is associated with. */
    fun internalAccountId(): String = body.internalAccountId()

    /** Currency to convert the `base_currency` to, often called the "buy" currency. */
    fun targetCurrency(): Currency = body.targetCurrency()

    /**
     * Amount in the lowest denomination of the `base_currency` to convert, often called the "sell"
     * amount.
     */
    fun baseAmount(): Long? = body.baseAmount()

    /** Currency to convert, often called the "sell" currency. */
    fun baseCurrency(): Currency? = body.baseCurrency()

    /** The timestamp until when the quoted rate is valid. */
    fun effectiveAt(): OffsetDateTime? = body.effectiveAt()

    /**
     * Amount in the lowest denomination of the `target_currency`, often called the "buy" amount.
     */
    fun targetAmount(): Long? = body.targetAmount()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): ForeignExchangeQuoteCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ForeignExchangeQuoteCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("internal_account_id") private val internalAccountId: String,
        @JsonProperty("target_currency") private val targetCurrency: Currency,
        @JsonProperty("base_amount") private val baseAmount: Long?,
        @JsonProperty("base_currency") private val baseCurrency: Currency?,
        @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
        @JsonProperty("target_amount") private val targetAmount: Long?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID for the `InternalAccount` this quote is associated with. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String = internalAccountId

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency") fun targetCurrency(): Currency = targetCurrency

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        @JsonProperty("base_amount") fun baseAmount(): Long? = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency") fun baseCurrency(): Currency? = baseCurrency

        /** The timestamp until when the quoted rate is valid. */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount") fun targetAmount(): Long? = targetAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var internalAccountId: String? = null
            private var targetCurrency: Currency? = null
            private var baseAmount: Long? = null
            private var baseCurrency: Currency? = null
            private var effectiveAt: OffsetDateTime? = null
            private var targetAmount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(foreignExchangeQuoteCreateBody: ForeignExchangeQuoteCreateBody) =
                apply {
                    internalAccountId = foreignExchangeQuoteCreateBody.internalAccountId
                    targetCurrency = foreignExchangeQuoteCreateBody.targetCurrency
                    baseAmount = foreignExchangeQuoteCreateBody.baseAmount
                    baseCurrency = foreignExchangeQuoteCreateBody.baseCurrency
                    effectiveAt = foreignExchangeQuoteCreateBody.effectiveAt
                    targetAmount = foreignExchangeQuoteCreateBody.targetAmount
                    additionalProperties =
                        foreignExchangeQuoteCreateBody.additionalProperties.toMutableMap()
                }

            /** The ID for the `InternalAccount` this quote is associated with. */
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: Long) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = apply { this.baseCurrency = baseCurrency }

            /** The timestamp until when the quoted rate is valid. */
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = apply { this.targetAmount = targetAmount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ForeignExchangeQuoteCreateBody =
                ForeignExchangeQuoteCreateBody(
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    checkNotNull(targetCurrency) { "`targetCurrency` is required but was not set" },
                    baseAmount,
                    baseCurrency,
                    effectiveAt,
                    targetAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeQuoteCreateBody && internalAccountId == other.internalAccountId && targetCurrency == other.targetCurrency && baseAmount == other.baseAmount && baseCurrency == other.baseCurrency && effectiveAt == other.effectiveAt && targetAmount == other.targetAmount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(internalAccountId, targetCurrency, baseAmount, baseCurrency, effectiveAt, targetAmount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForeignExchangeQuoteCreateBody{internalAccountId=$internalAccountId, targetCurrency=$targetCurrency, baseAmount=$baseAmount, baseCurrency=$baseCurrency, effectiveAt=$effectiveAt, targetAmount=$targetAmount, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ForeignExchangeQuoteCreateBody.Builder =
            ForeignExchangeQuoteCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(foreignExchangeQuoteCreateParams: ForeignExchangeQuoteCreateParams) =
            apply {
                body = foreignExchangeQuoteCreateParams.body.toBuilder()
                additionalHeaders = foreignExchangeQuoteCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    foreignExchangeQuoteCreateParams.additionalQueryParams.toBuilder()
            }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: Currency) = apply { body.targetCurrency(targetCurrency) }

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(baseAmount: Long) = apply { body.baseAmount(baseAmount) }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: Currency) = apply { body.baseCurrency(baseCurrency) }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(targetAmount: Long) = apply { body.targetAmount(targetAmount) }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): ForeignExchangeQuoteCreateParams =
            ForeignExchangeQuoteCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
