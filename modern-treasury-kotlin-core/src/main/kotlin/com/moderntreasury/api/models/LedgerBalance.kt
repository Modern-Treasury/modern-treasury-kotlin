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

class LedgerBalance @JsonCreator(mode = JsonCreator.Mode.DISABLED) private constructor(
    private val amount: JsonField<Long>,
    private val amountString: JsonField<String>,
    private val credits: JsonField<Long>,
    private val creditsString: JsonField<String>,
    private val currency: JsonField<String>,
    private val currencyExponent: JsonField<Long>,
    private val debits: JsonField<Long>,
    private val debitsString: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_string") @ExcludeMissing amountString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credits") @ExcludeMissing credits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("credits_string") @ExcludeMissing creditsString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency_exponent") @ExcludeMissing currencyExponent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("debits") @ExcludeMissing debits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("debits_string") @ExcludeMissing debitsString: JsonField<String> = JsonMissing.of()
    ) : this(
      amount,
      amountString,
      credits,
      creditsString,
      currency,
      currencyExponent,
      debits,
      debitsString,
      mutableMapOf(),
    )

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun amount(): Long = amount.getRequired("amount")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun amountString(): String = amountString.getRequired("amount_string")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun credits(): Long = credits.getRequired("credits")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun creditsString(): String = creditsString.getRequired("credits_string")

    /**
     * The currency of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The currency exponent of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun debits(): Long = debits.getRequired("debits")

    /** @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value). */
    fun debitsString(): String = debitsString.getRequired("debits_string")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [amountString].
     *
     * Unlike [amountString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_string")
    @ExcludeMissing
    fun _amountString(): JsonField<String> = amountString

    /**
     * Returns the raw JSON value of [credits].
     *
     * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits")
    @ExcludeMissing
    fun _credits(): JsonField<Long> = credits

    /**
     * Returns the raw JSON value of [creditsString].
     *
     * Unlike [creditsString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits_string")
    @ExcludeMissing
    fun _creditsString(): JsonField<String> = creditsString

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency")
    @ExcludeMissing
    fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [currencyExponent].
     *
     * Unlike [currencyExponent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency_exponent")
    @ExcludeMissing
    fun _currencyExponent(): JsonField<Long> = currencyExponent

    /**
     * Returns the raw JSON value of [debits].
     *
     * Unlike [debits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debits")
    @ExcludeMissing
    fun _debits(): JsonField<Long> = debits

    /**
     * Returns the raw JSON value of [debitsString].
     *
     * Unlike [debitsString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debits_string")
    @ExcludeMissing
    fun _debitsString(): JsonField<String> = debitsString

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerBalance].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .amount()
         * .amountString()
         * .credits()
         * .creditsString()
         * .currency()
         * .currencyExponent()
         * .debits()
         * .debitsString()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerBalance]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var amountString: JsonField<String>? = null
        private var credits: JsonField<Long>? = null
        private var creditsString: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var currencyExponent: JsonField<Long>? = null
        private var debits: JsonField<Long>? = null
        private var debitsString: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerBalance: LedgerBalance) =
            apply {
                amount = ledgerBalance.amount
                amountString = ledgerBalance.amountString
                credits = ledgerBalance.credits
                creditsString = ledgerBalance.creditsString
                currency = ledgerBalance.currency
                currencyExponent = ledgerBalance.currencyExponent
                debits = ledgerBalance.debits
                debitsString = ledgerBalance.debitsString
                additionalProperties = ledgerBalance.additionalProperties.toMutableMap()
            }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amount(amount: JsonField<Long>) =
            apply {
                this.amount = amount
            }

        fun amountString(amountString: String) = amountString(JsonField.of(amountString))

        /**
         * Sets [Builder.amountString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountString] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountString(amountString: JsonField<String>) =
            apply {
                this.amountString = amountString
            }

        fun credits(credits: Long) = credits(JsonField.of(credits))

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credits(credits: JsonField<Long>) =
            apply {
                this.credits = credits
            }

        fun creditsString(creditsString: String) = creditsString(JsonField.of(creditsString))

        /**
         * Sets [Builder.creditsString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditsString] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditsString(creditsString: JsonField<String>) =
            apply {
                this.creditsString = creditsString
            }

        /** The currency of the ledger account. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currency(currency: JsonField<String>) =
            apply {
                this.currency = currency
            }

        /** The currency exponent of the ledger account. */
        fun currencyExponent(currencyExponent: Long) = currencyExponent(JsonField.of(currencyExponent))

        /**
         * Sets [Builder.currencyExponent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyExponent] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyExponent(currencyExponent: JsonField<Long>) =
            apply {
                this.currencyExponent = currencyExponent
            }

        fun debits(debits: Long) = debits(JsonField.of(debits))

        /**
         * Sets [Builder.debits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debits] with a well-typed [Long] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debits(debits: JsonField<Long>) =
            apply {
                this.debits = debits
            }

        fun debitsString(debitsString: String) = debitsString(JsonField.of(debitsString))

        /**
         * Sets [Builder.debitsString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitsString] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debitsString(debitsString: JsonField<String>) =
            apply {
                this.debitsString = debitsString
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [LedgerBalance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```kotlin
         * .amount()
         * .amountString()
         * .credits()
         * .creditsString()
         * .currency()
         * .currencyExponent()
         * .debits()
         * .debitsString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerBalance =
            LedgerBalance(
              checkRequired(
                "amount", amount
              ),
              checkRequired(
                "amountString", amountString
              ),
              checkRequired(
                "credits", credits
              ),
              checkRequired(
                "creditsString", creditsString
              ),
              checkRequired(
                "currency", currency
              ),
              checkRequired(
                "currencyExponent", currencyExponent
              ),
              checkRequired(
                "debits", debits
              ),
              checkRequired(
                "debitsString", debitsString
              ),
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): LedgerBalance =
        apply {
            if (validated) {
              return@apply
            }

            amount()
            amountString()
            credits()
            creditsString()
            currency()
            currencyExponent()
            debits()
            debitsString()
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
    internal fun validity(): Int = (if (amount.asKnown() == null) 0 else 1) + (if (amountString.asKnown() == null) 0 else 1) + (if (credits.asKnown() == null) 0 else 1) + (if (creditsString.asKnown() == null) 0 else 1) + (if (currency.asKnown() == null) 0 else 1) + (if (currencyExponent.asKnown() == null) 0 else 1) + (if (debits.asKnown() == null) 0 else 1) + (if (debitsString.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is LedgerBalance && amount == other.amount && amountString == other.amountString && credits == other.credits && creditsString == other.creditsString && currency == other.currency && currencyExponent == other.currencyExponent && debits == other.debits && debitsString == other.debitsString && additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(amount, amountString, credits, creditsString, currency, currencyExponent, debits, debitsString, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "LedgerBalance{amount=$amount, amountString=$amountString, credits=$credits, creditsString=$creditsString, currency=$currency, currencyExponent=$currencyExponent, debits=$debits, debitsString=$debitsString, additionalProperties=$additionalProperties}"
}
