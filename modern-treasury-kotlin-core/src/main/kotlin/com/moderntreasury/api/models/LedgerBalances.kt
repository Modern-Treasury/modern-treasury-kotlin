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

class LedgerBalances
private constructor(
    private val availableBalance: JsonField<LedgerBalance>,
    private val pendingBalance: JsonField<LedgerBalance>,
    private val postedBalance: JsonField<LedgerBalance>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available_balance")
        @ExcludeMissing
        availableBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonProperty("pending_balance")
        @ExcludeMissing
        pendingBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonProperty("posted_balance")
        @ExcludeMissing
        postedBalance: JsonField<LedgerBalance> = JsonMissing.of(),
    ) : this(availableBalance, pendingBalance, postedBalance, mutableMapOf())

    /**
     * The available_balance is the sum of all posted inbound entries and pending outbound entries.
     * For credit normal, available_amount = posted_credits - pending_debits; for debit normal,
     * available_amount = posted_debits - pending_credits.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableBalance(): LedgerBalance = availableBalance.getRequired("available_balance")

    /**
     * The pending_balance is the sum of all pending and posted entries.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

    /**
     * The posted_balance is the sum of all posted entries.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

    /**
     * Returns the raw JSON value of [availableBalance].
     *
     * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_balance")
    @ExcludeMissing
    fun _availableBalance(): JsonField<LedgerBalance> = availableBalance

    /**
     * Returns the raw JSON value of [pendingBalance].
     *
     * Unlike [pendingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_balance")
    @ExcludeMissing
    fun _pendingBalance(): JsonField<LedgerBalance> = pendingBalance

    /**
     * Returns the raw JSON value of [postedBalance].
     *
     * Unlike [postedBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posted_balance")
    @ExcludeMissing
    fun _postedBalance(): JsonField<LedgerBalance> = postedBalance

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
         * Returns a mutable builder for constructing an instance of [LedgerBalances].
         *
         * The following fields are required:
         * ```kotlin
         * .availableBalance()
         * .pendingBalance()
         * .postedBalance()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerBalances]. */
    class Builder internal constructor() {

        private var availableBalance: JsonField<LedgerBalance>? = null
        private var pendingBalance: JsonField<LedgerBalance>? = null
        private var postedBalance: JsonField<LedgerBalance>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerBalances: LedgerBalances) = apply {
            availableBalance = ledgerBalances.availableBalance
            pendingBalance = ledgerBalances.pendingBalance
            postedBalance = ledgerBalances.postedBalance
            additionalProperties = ledgerBalances.additionalProperties.toMutableMap()
        }

        /**
         * The available_balance is the sum of all posted inbound entries and pending outbound
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
         */
        fun availableBalance(availableBalance: LedgerBalance) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * Sets [Builder.availableBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBalance] with a well-typed [LedgerBalance]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
            this.availableBalance = availableBalance
        }

        /** The pending_balance is the sum of all pending and posted entries. */
        fun pendingBalance(pendingBalance: LedgerBalance) =
            pendingBalance(JsonField.of(pendingBalance))

        /**
         * Sets [Builder.pendingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingBalance] with a well-typed [LedgerBalance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingBalance(pendingBalance: JsonField<LedgerBalance>) = apply {
            this.pendingBalance = pendingBalance
        }

        /** The posted_balance is the sum of all posted entries. */
        fun postedBalance(postedBalance: LedgerBalance) = postedBalance(JsonField.of(postedBalance))

        /**
         * Sets [Builder.postedBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postedBalance] with a well-typed [LedgerBalance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postedBalance(postedBalance: JsonField<LedgerBalance>) = apply {
            this.postedBalance = postedBalance
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

        /**
         * Returns an immutable instance of [LedgerBalances].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .availableBalance()
         * .pendingBalance()
         * .postedBalance()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerBalances =
            LedgerBalances(
                checkRequired("availableBalance", availableBalance),
                checkRequired("pendingBalance", pendingBalance),
                checkRequired("postedBalance", postedBalance),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerBalances = apply {
        if (validated) {
            return@apply
        }

        availableBalance().validate()
        pendingBalance().validate()
        postedBalance().validate()
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
        (availableBalance.asKnown()?.validity() ?: 0) +
            (pendingBalance.asKnown()?.validity() ?: 0) +
            (postedBalance.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerBalances && availableBalance == other.availableBalance && pendingBalance == other.pendingBalance && postedBalance == other.postedBalance && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(availableBalance, pendingBalance, postedBalance, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerBalances{availableBalance=$availableBalance, pendingBalance=$pendingBalance, postedBalance=$postedBalance, additionalProperties=$additionalProperties}"
}
