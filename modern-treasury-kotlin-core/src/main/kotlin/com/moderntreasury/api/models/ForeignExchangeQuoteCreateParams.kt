// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

/** create foreign_exchange_quote */
class ForeignExchangeQuoteCreateParams
private constructor(
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

    /** The ID for the `InternalAccount` this quote is associated with. */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    /** Currency to convert the `base_currency` to, often called the "buy" currency. */
    fun _targetCurrency(): JsonField<Currency> = body._targetCurrency()

    /**
     * Amount in the lowest denomination of the `base_currency` to convert, often called the "sell"
     * amount.
     */
    fun _baseAmount(): JsonField<Long> = body._baseAmount()

    /** Currency to convert, often called the "sell" currency. */
    fun _baseCurrency(): JsonField<Currency> = body._baseCurrency()

    /** The timestamp until when the quoted rate is valid. */
    fun _effectiveAt(): JsonField<OffsetDateTime> = body._effectiveAt()

    /**
     * Amount in the lowest denomination of the `target_currency`, often called the "buy" amount.
     */
    fun _targetAmount(): JsonField<Long> = body._targetAmount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): ForeignExchangeQuoteCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ForeignExchangeQuoteCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        private val internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_currency")
        @ExcludeMissing
        private val targetCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("base_amount")
        @ExcludeMissing
        private val baseAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("base_currency")
        @ExcludeMissing
        private val baseCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("target_amount")
        @ExcludeMissing
        private val targetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(): Long? = baseAmount.getNullable("base_amount")

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(): Currency? = baseCurrency.getNullable("base_currency")

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(): Long? = targetAmount.getNullable("target_amount")

        /** The ID for the `InternalAccount` this quote is associated with. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun _internalAccountId(): JsonField<String> = internalAccountId

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /** The timestamp until when the quoted rate is valid. */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ForeignExchangeQuoteCreateBody = apply {
            if (validated) {
                return@apply
            }

            internalAccountId()
            targetCurrency()
            baseAmount()
            baseCurrency()
            effectiveAt()
            targetAmount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var internalAccountId: JsonField<String>? = null
            private var targetCurrency: JsonField<Currency>? = null
            private var baseAmount: JsonField<Long> = JsonMissing.of()
            private var baseCurrency: JsonField<Currency> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var targetAmount: JsonField<Long> = JsonMissing.of()
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
            fun internalAccountId(internalAccountId: String) =
                internalAccountId(JsonField.of(internalAccountId))

            /** The ID for the `InternalAccount` this quote is associated with. */
            fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                this.internalAccountId = internalAccountId
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: Long) = baseAmount(JsonField.of(baseAmount))

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /** The timestamp until when the quoted rate is valid. */
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /** The timestamp until when the quoted rate is valid. */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

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
                    checkRequired("internalAccountId", internalAccountId),
                    checkRequired("targetCurrency", targetCurrency),
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
    class Builder internal constructor() {

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

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: Currency) = apply { body.targetCurrency(targetCurrency) }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
            body.targetCurrency(targetCurrency)
        }

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(baseAmount: Long) = apply { body.baseAmount(baseAmount) }

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(baseAmount: JsonField<Long>) = apply { body.baseAmount(baseAmount) }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: Currency) = apply { body.baseCurrency(baseCurrency) }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
            body.baseCurrency(baseCurrency)
        }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { body.effectiveAt(effectiveAt) }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            body.effectiveAt(effectiveAt)
        }

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(targetAmount: Long) = apply { body.targetAmount(targetAmount) }

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(targetAmount: JsonField<Long>) = apply { body.targetAmount(targetAmount) }

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
