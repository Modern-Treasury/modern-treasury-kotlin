// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

/** Can be `checking`, `savings` or `other`. */
class ExternalAccountType @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val BASE_WALLET = of("base_wallet")

        val CASH = of("cash")

        val CHECKING = of("checking")

        val CRYPTO_WALLET = of("crypto_wallet")

        val ETHEREUM_WALLET = of("ethereum_wallet")

        val GENERAL_LEDGER = of("general_ledger")

        val LOAN = of("loan")

        val NON_RESIDENT = of("non_resident")

        val OTHER = of("other")

        val OVERDRAFT = of("overdraft")

        val POLYGON_WALLET = of("polygon_wallet")

        val SAVINGS = of("savings")

        val SOLANA_WALLET = of("solana_wallet")

        fun of(value: String) = ExternalAccountType(JsonField.of(value))
    }

    /** An enum containing [ExternalAccountType]'s known values. */
    enum class Known {
        BASE_WALLET,
        CASH,
        CHECKING,
        CRYPTO_WALLET,
        ETHEREUM_WALLET,
        GENERAL_LEDGER,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        POLYGON_WALLET,
        SAVINGS,
        SOLANA_WALLET,
    }

    /**
     * An enum containing [ExternalAccountType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ExternalAccountType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        BASE_WALLET,
        CASH,
        CHECKING,
        CRYPTO_WALLET,
        ETHEREUM_WALLET,
        GENERAL_LEDGER,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        POLYGON_WALLET,
        SAVINGS,
        SOLANA_WALLET,
        /**
         * An enum member indicating that [ExternalAccountType] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            BASE_WALLET -> Value.BASE_WALLET
            CASH -> Value.CASH
            CHECKING -> Value.CHECKING
            CRYPTO_WALLET -> Value.CRYPTO_WALLET
            ETHEREUM_WALLET -> Value.ETHEREUM_WALLET
            GENERAL_LEDGER -> Value.GENERAL_LEDGER
            LOAN -> Value.LOAN
            NON_RESIDENT -> Value.NON_RESIDENT
            OTHER -> Value.OTHER
            OVERDRAFT -> Value.OVERDRAFT
            POLYGON_WALLET -> Value.POLYGON_WALLET
            SAVINGS -> Value.SAVINGS
            SOLANA_WALLET -> Value.SOLANA_WALLET
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            BASE_WALLET -> Known.BASE_WALLET
            CASH -> Known.CASH
            CHECKING -> Known.CHECKING
            CRYPTO_WALLET -> Known.CRYPTO_WALLET
            ETHEREUM_WALLET -> Known.ETHEREUM_WALLET
            GENERAL_LEDGER -> Known.GENERAL_LEDGER
            LOAN -> Known.LOAN
            NON_RESIDENT -> Known.NON_RESIDENT
            OTHER -> Known.OTHER
            OVERDRAFT -> Known.OVERDRAFT
            POLYGON_WALLET -> Known.POLYGON_WALLET
            SAVINGS -> Known.SAVINGS
            SOLANA_WALLET -> Known.SOLANA_WALLET
            else -> throw ModernTreasuryInvalidDataException("Unknown ExternalAccountType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws ModernTreasuryInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    fun validate(): ExternalAccountType = apply {
        if (validated) {
            return@apply
        }

        known()
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
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
