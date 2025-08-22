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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Collections
import java.util.Objects

class ForeignExchangeRate
private constructor(
    private val baseAmount: JsonField<Long>,
    private val baseCurrency: JsonField<Currency>,
    private val exponent: JsonField<Long>,
    private val rateString: JsonField<String>,
    private val targetAmount: JsonField<Long>,
    private val targetCurrency: JsonField<Currency>,
    private val value: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("base_amount") @ExcludeMissing baseAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("base_currency")
        @ExcludeMissing
        baseCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("exponent") @ExcludeMissing exponent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rate_string")
        @ExcludeMissing
        rateString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_amount")
        @ExcludeMissing
        targetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("target_currency")
        @ExcludeMissing
        targetCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
    ) : this(
        baseAmount,
        baseCurrency,
        exponent,
        rateString,
        targetAmount,
        targetCurrency,
        value,
        mutableMapOf(),
    )

    /**
     * Amount in the lowest denomination of the `base_currency` to convert, often called the "sell"
     * amount.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun baseAmount(): Long = baseAmount.getRequired("base_amount")

    /**
     * Currency to convert, often called the "sell" currency.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

    /**
     * The exponent component of the rate. The decimal is calculated as `value` / (10 ^ `exponent`).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exponent(): Long = exponent.getRequired("exponent")

    /**
     * A string representation of the rate.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rateString(): String = rateString.getRequired("rate_string")

    /**
     * Amount in the lowest denomination of the `target_currency`, often called the "buy" amount.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetAmount(): Long = targetAmount.getRequired("target_amount")

    /**
     * Currency to convert the `base_currency` to, often called the "buy" currency.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

    /**
     * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
     * `exponent`).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Long = value.getRequired("value")

    /**
     * Returns the raw JSON value of [baseAmount].
     *
     * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

    /**
     * Returns the raw JSON value of [baseCurrency].
     *
     * Unlike [baseCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("base_currency")
    @ExcludeMissing
    fun _baseCurrency(): JsonField<Currency> = baseCurrency

    /**
     * Returns the raw JSON value of [exponent].
     *
     * Unlike [exponent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

    /**
     * Returns the raw JSON value of [rateString].
     *
     * Unlike [rateString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate_string") @ExcludeMissing fun _rateString(): JsonField<String> = rateString

    /**
     * Returns the raw JSON value of [targetAmount].
     *
     * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_amount")
    @ExcludeMissing
    fun _targetAmount(): JsonField<Long> = targetAmount

    /**
     * Returns the raw JSON value of [targetCurrency].
     *
     * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_currency")
    @ExcludeMissing
    fun _targetCurrency(): JsonField<Currency> = targetCurrency

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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
         * Sets [Builder.baseAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

        /**
         * Sets [Builder.baseCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
            this.baseCurrency = baseCurrency
        }

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

        /**
         * Sets [Builder.exponent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exponent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

        /** A string representation of the rate. */
        fun rateString(rateString: String) = rateString(JsonField.of(rateString))

        /**
         * Sets [Builder.rateString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rateString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

        /**
         * Sets [Builder.targetAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetAmount(targetAmount: JsonField<Long>) = apply { this.targetAmount = targetAmount }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: Currency) = targetCurrency(JsonField.of(targetCurrency))

        /**
         * Sets [Builder.targetCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
            this.targetCurrency = targetCurrency
        }

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun value(value: Long) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Long>) = apply { this.value = value }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ForeignExchangeRate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ForeignExchangeRate =
            ForeignExchangeRate(
                checkRequired("baseAmount", baseAmount),
                checkRequired("baseCurrency", baseCurrency),
                checkRequired("exponent", exponent),
                checkRequired("rateString", rateString),
                checkRequired("targetAmount", targetAmount),
                checkRequired("targetCurrency", targetCurrency),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ForeignExchangeRate = apply {
        if (validated) {
            return@apply
        }

        baseAmount()
        baseCurrency().validate()
        exponent()
        rateString()
        targetAmount()
        targetCurrency().validate()
        value()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ModernTreasuryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (baseAmount.asKnown() == null) 0 else 1) +
            (baseCurrency.asKnown()?.validity() ?: 0) +
            (if (exponent.asKnown() == null) 0 else 1) +
            (if (rateString.asKnown() == null) 0 else 1) +
            (if (targetAmount.asKnown() == null) 0 else 1) +
            (targetCurrency.asKnown()?.validity() ?: 0) +
            (if (value.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ForeignExchangeRate &&
            baseAmount == other.baseAmount &&
            baseCurrency == other.baseCurrency &&
            exponent == other.exponent &&
            rateString == other.rateString &&
            targetAmount == other.targetAmount &&
            targetCurrency == other.targetCurrency &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            baseAmount,
            baseCurrency,
            exponent,
            rateString,
            targetAmount,
            targetCurrency,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
}
