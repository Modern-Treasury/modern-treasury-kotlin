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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class ForeignExchangeQuote
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    private val foreignExchangeIndicator: JsonField<String> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    private val foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("vendor_id")
    @ExcludeMissing
    private val vendorId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** This vendor assigned ID for this quote. */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The timestamp until when the quoted rate is valid. */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /** The timestamp until which the quote must be booked by. */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Either `fixed_to_variable` if the `base_amount` was specified, or `variable_to_fixed` if the
     * `target_amount` was specified when requesting the quote.
     */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator(): JsonField<String> = foreignExchangeIndicator

    /** The serialized rate information represented by this quote. */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate(): JsonField<ForeignExchangeRate> = foreignExchangeRate

    /** The ID for the `InternalAccount` this quote is associated with. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** This vendor assigned ID for this quote. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ForeignExchangeQuote = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        effectiveAt()
        expiresAt()
        foreignExchangeIndicator()
        foreignExchangeRate().validate()
        internalAccountId()
        liveMode()
        metadata().validate()
        object_()
        updatedAt()
        vendorId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ForeignExchangeQuote].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .effectiveAt()
         * .expiresAt()
         * .foreignExchangeIndicator()
         * .foreignExchangeRate()
         * .internalAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ForeignExchangeQuote]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var foreignExchangeIndicator: JsonField<String>? = null
        private var foreignExchangeRate: JsonField<ForeignExchangeRate>? = null
        private var internalAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(foreignExchangeQuote: ForeignExchangeQuote) = apply {
            id = foreignExchangeQuote.id
            createdAt = foreignExchangeQuote.createdAt
            effectiveAt = foreignExchangeQuote.effectiveAt
            expiresAt = foreignExchangeQuote.expiresAt
            foreignExchangeIndicator = foreignExchangeQuote.foreignExchangeIndicator
            foreignExchangeRate = foreignExchangeQuote.foreignExchangeRate
            internalAccountId = foreignExchangeQuote.internalAccountId
            liveMode = foreignExchangeQuote.liveMode
            metadata = foreignExchangeQuote.metadata
            object_ = foreignExchangeQuote.object_
            updatedAt = foreignExchangeQuote.updatedAt
            vendorId = foreignExchangeQuote.vendorId
            additionalProperties = foreignExchangeQuote.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** The timestamp until which the quote must be booked by. */
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
        fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
            this.foreignExchangeIndicator = foreignExchangeIndicator
        }

        /** The serialized rate information represented by this quote. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate) =
            foreignExchangeRate(JsonField.of(foreignExchangeRate))

        /** The serialized rate information represented by this quote. */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** This vendor assigned ID for this quote. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** This vendor assigned ID for this quote. */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

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

        fun build(): ForeignExchangeQuote =
            ForeignExchangeQuote(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("foreignExchangeIndicator", foreignExchangeIndicator),
                checkRequired("foreignExchangeRate", foreignExchangeRate),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                vendorId,
                additionalProperties.toImmutable(),
            )
    }

    /** The serialized rate information represented by this quote. */
    @NoAutoDetect
    class ForeignExchangeRate
    @JsonCreator
    private constructor(
        @JsonProperty("base_amount")
        @ExcludeMissing
        private val baseAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("base_currency")
        @ExcludeMissing
        private val baseCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("exponent")
        @ExcludeMissing
        private val exponent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rate_string")
        @ExcludeMissing
        private val rateString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_amount")
        @ExcludeMissing
        private val targetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("target_currency")
        @ExcludeMissing
        private val targetCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

        /** A string representation of the rate. */
        @JsonProperty("rate_string")
        @ExcludeMissing
        fun _rateString(): JsonField<String> = rateString

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ForeignExchangeRate = apply {
            if (validated) {
                return@apply
            }

            baseAmount()
            baseCurrency()
            exponent()
            rateString()
            targetAmount()
            targetCurrency()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ForeignExchangeRate].
             *
             * The following fields are required:
             * ```kotlin
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ForeignExchangeRate]. */
        class Builder internal constructor() {

            private var baseAmount: JsonField<Long>? = null
            private var baseCurrency: JsonField<Currency>? = null
            private var exponent: JsonField<Long>? = null
            private var rateString: JsonField<String>? = null
            private var targetAmount: JsonField<Long>? = null
            private var targetCurrency: JsonField<Currency>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(foreignExchangeRate: ForeignExchangeRate) = apply {
                baseAmount = foreignExchangeRate.baseAmount
                baseCurrency = foreignExchangeRate.baseCurrency
                exponent = foreignExchangeRate.exponent
                rateString = foreignExchangeRate.rateString
                targetAmount = foreignExchangeRate.targetAmount
                targetCurrency = foreignExchangeRate.targetCurrency
                value = foreignExchangeRate.value
                additionalProperties = foreignExchangeRate.additionalProperties.toMutableMap()
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

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /** A string representation of the rate. */
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
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
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
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    checkRequired("baseAmount", baseAmount),
                    checkRequired("baseCurrency", baseCurrency),
                    checkRequired("exponent", exponent),
                    checkRequired("rateString", rateString),
                    checkRequired("targetAmount", targetAmount),
                    checkRequired("targetCurrency", targetCurrency),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeRate && baseAmount == other.baseAmount && baseCurrency == other.baseCurrency && exponent == other.exponent && rateString == other.rateString && targetAmount == other.targetAmount && targetCurrency == other.targetCurrency && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(baseAmount, baseCurrency, exponent, rateString, targetAmount, targetCurrency, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

        return /* spotless:off */ other is ForeignExchangeQuote && id == other.id && createdAt == other.createdAt && effectiveAt == other.effectiveAt && expiresAt == other.expiresAt && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeRate == other.foreignExchangeRate && internalAccountId == other.internalAccountId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && updatedAt == other.updatedAt && vendorId == other.vendorId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, effectiveAt, expiresAt, foreignExchangeIndicator, foreignExchangeRate, internalAccountId, liveMode, metadata, object_, updatedAt, vendorId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ForeignExchangeQuote{id=$id, createdAt=$createdAt, effectiveAt=$effectiveAt, expiresAt=$expiresAt, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeRate=$foreignExchangeRate, internalAccountId=$internalAccountId, liveMode=$liveMode, metadata=$metadata, object_=$object_, updatedAt=$updatedAt, vendorId=$vendorId, additionalProperties=$additionalProperties}"
}
