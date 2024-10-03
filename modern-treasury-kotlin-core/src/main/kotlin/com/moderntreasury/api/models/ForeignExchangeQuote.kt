// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ForeignExchangeQuote.Builder::class)
@NoAutoDetect
class ForeignExchangeQuote
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val foreignExchangeIndicator: JsonField<String>,
    private val foreignExchangeRate: JsonField<ForeignExchangeRate>,
    private val internalAccountId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val vendorId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The timestamp until when the quoted rate is valid. */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /** The timestamp until which the quote must be booked by. */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if the
     * `target_amount` was specified when requesting the quote.
     */
    fun foreignExchangeIndicator(): String =
        foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

    /** The serialized rate information represented by this quote. */
    fun foreignExchangeRate(): ForeignExchangeRate =
        foreignExchangeRate.getRequired("foreign_exchange_rate")

    /** The ID for the `InternalAccount` this quote is associated with. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** This vendor assigned ID for this quote. */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The timestamp until when the quoted rate is valid. */
    @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

    /** The timestamp until which the quote must be booked by. */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /**
     * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if the
     * `target_amount` was specified when requesting the quote.
     */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator() = foreignExchangeIndicator

    /** The serialized rate information represented by this quote. */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate() = foreignExchangeRate

    /** The ID for the `InternalAccount` this quote is associated with. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** This vendor assigned ID for this quote. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId() = vendorId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ForeignExchangeQuote = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            effectiveAt()
            expiresAt()
            foreignExchangeIndicator()
            foreignExchangeRate().validate()
            internalAccountId()
            metadata().validate()
            vendorId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var foreignExchangeIndicator: JsonField<String> = JsonMissing.of()
        private var foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(foreignExchangeQuote: ForeignExchangeQuote) = apply {
            this.id = foreignExchangeQuote.id
            this.object_ = foreignExchangeQuote.object_
            this.liveMode = foreignExchangeQuote.liveMode
            this.createdAt = foreignExchangeQuote.createdAt
            this.updatedAt = foreignExchangeQuote.updatedAt
            this.effectiveAt = foreignExchangeQuote.effectiveAt
            this.expiresAt = foreignExchangeQuote.expiresAt
            this.foreignExchangeIndicator = foreignExchangeQuote.foreignExchangeIndicator
            this.foreignExchangeRate = foreignExchangeQuote.foreignExchangeRate
            this.internalAccountId = foreignExchangeQuote.internalAccountId
            this.metadata = foreignExchangeQuote.metadata
            this.vendorId = foreignExchangeQuote.vendorId
            additionalProperties(foreignExchangeQuote.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /** The timestamp until when the quoted rate is valid. */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** The timestamp until which the quote must be booked by. */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if
         * the `target_amount` was specified when requesting the quote.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
            foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

        /**
         * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if
         * the `target_amount` was specified when requesting the quote.
         */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
            this.foreignExchangeIndicator = foreignExchangeIndicator
        }

        /** The serialized rate information represented by this quote. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate) =
            foreignExchangeRate(JsonField.of(foreignExchangeRate))

        /** The serialized rate information represented by this quote. */
        @JsonProperty("foreign_exchange_rate")
        @ExcludeMissing
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID for the `InternalAccount` this quote is associated with. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** This vendor assigned ID for this quote. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** This vendor assigned ID for this quote. */
        @JsonProperty("vendor_id")
        @ExcludeMissing
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ForeignExchangeQuote =
            ForeignExchangeQuote(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                effectiveAt,
                expiresAt,
                foreignExchangeIndicator,
                foreignExchangeRate,
                internalAccountId,
                metadata,
                vendorId,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The serialized rate information represented by this quote. */
    @JsonDeserialize(builder = ForeignExchangeRate.Builder::class)
    @NoAutoDetect
    class ForeignExchangeRate
    private constructor(
        private val baseAmount: JsonField<Long>,
        private val baseCurrency: JsonField<Currency>,
        private val exponent: JsonField<Long>,
        private val rateString: JsonField<String>,
        private val targetAmount: JsonField<Long>,
        private val targetCurrency: JsonField<Currency>,
        private val value: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(): Long = baseAmount.getRequired("base_amount")

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun exponent(): Long = exponent.getRequired("exponent")

        /** A string representation of the rate. */
        fun rateString(): String = rateString.getRequired("rate_string")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(): Long = targetAmount.getRequired("target_amount")

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount() = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency") @ExcludeMissing fun _baseCurrency() = baseCurrency

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent() = exponent

        /** A string representation of the rate. */
        @JsonProperty("rate_string") @ExcludeMissing fun _rateString() = rateString

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount") @ExcludeMissing fun _targetAmount() = targetAmount

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency") @ExcludeMissing fun _targetCurrency() = targetCurrency

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ForeignExchangeRate = apply {
            if (!validated) {
                baseAmount()
                baseCurrency()
                exponent()
                rateString()
                targetAmount()
                targetCurrency()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var baseAmount: JsonField<Long> = JsonMissing.of()
            private var baseCurrency: JsonField<Currency> = JsonMissing.of()
            private var exponent: JsonField<Long> = JsonMissing.of()
            private var rateString: JsonField<String> = JsonMissing.of()
            private var targetAmount: JsonField<Long> = JsonMissing.of()
            private var targetCurrency: JsonField<Currency> = JsonMissing.of()
            private var value: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(foreignExchangeRate: ForeignExchangeRate) = apply {
                this.baseAmount = foreignExchangeRate.baseAmount
                this.baseCurrency = foreignExchangeRate.baseCurrency
                this.exponent = foreignExchangeRate.exponent
                this.rateString = foreignExchangeRate.rateString
                this.targetAmount = foreignExchangeRate.targetAmount
                this.targetCurrency = foreignExchangeRate.targetCurrency
                this.value = foreignExchangeRate.value
                additionalProperties(foreignExchangeRate.additionalProperties)
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
            @JsonProperty("base_amount")
            @ExcludeMissing
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /** Currency to convert, often called the "sell" currency. */
            @JsonProperty("base_currency")
            @ExcludeMissing
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            @JsonProperty("exponent")
            @ExcludeMissing
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /** A string representation of the rate. */
            @JsonProperty("rate_string")
            @ExcludeMissing
            fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            @JsonProperty("target_amount")
            @ExcludeMissing
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            @JsonProperty("target_currency")
            @ExcludeMissing
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Long>) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    baseAmount,
                    baseCurrency,
                    exponent,
                    rateString,
                    targetAmount,
                    targetCurrency,
                    value,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeRate && this.baseAmount == other.baseAmount && this.baseCurrency == other.baseCurrency && this.exponent == other.exponent && this.rateString == other.rateString && this.targetAmount == other.targetAmount && this.targetCurrency == other.targetCurrency && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(baseAmount, baseCurrency, exponent, rateString, targetAmount, targetCurrency, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuote && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.effectiveAt == other.effectiveAt && this.expiresAt == other.expiresAt && this.foreignExchangeIndicator == other.foreignExchangeIndicator && this.foreignExchangeRate == other.foreignExchangeRate && this.internalAccountId == other.internalAccountId && this.metadata == other.metadata && this.vendorId == other.vendorId && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, effectiveAt, expiresAt, foreignExchangeIndicator, foreignExchangeRate, internalAccountId, metadata, vendorId, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ForeignExchangeQuote{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, effectiveAt=$effectiveAt, expiresAt=$expiresAt, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeRate=$foreignExchangeRate, internalAccountId=$internalAccountId, metadata=$metadata, vendorId=$vendorId, additionalProperties=$additionalProperties}"
}
