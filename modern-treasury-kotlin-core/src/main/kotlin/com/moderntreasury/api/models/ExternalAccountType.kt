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

        val CASH = of("cash")

        val CHECKING = of("checking")

        val GENERAL_LEDGER = of("general_ledger")

        val HOSTED_WALLET = of("hosted_wallet")

        val LOAN = of("loan")

        val NON_RESIDENT = of("non_resident")

        val OTHER = of("other")

        val OVERDRAFT = of("overdraft")

        val SAVINGS = of("savings")

        val SELF_HOSTED_WALLET = of("self_hosted_wallet")

        fun of(value: String) = ExternalAccountType(JsonField.of(value))
    }

    /** An enum containing [ExternalAccountType]'s known values. */
    enum class Known {
        CASH,
        CHECKING,
        GENERAL_LEDGER,
        HOSTED_WALLET,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        SAVINGS,
        SELF_HOSTED_WALLET,
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
        CASH,
        CHECKING,
        GENERAL_LEDGER,
        HOSTED_WALLET,
        LOAN,
        NON_RESIDENT,
        OTHER,
        OVERDRAFT,
        SAVINGS,
        SELF_HOSTED_WALLET,
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
            CASH -> Value.CASH
            CHECKING -> Value.CHECKING
            GENERAL_LEDGER -> Value.GENERAL_LEDGER
            HOSTED_WALLET -> Value.HOSTED_WALLET
            LOAN -> Value.LOAN
            NON_RESIDENT -> Value.NON_RESIDENT
            OTHER -> Value.OTHER
            OVERDRAFT -> Value.OVERDRAFT
            SAVINGS -> Value.SAVINGS
            SELF_HOSTED_WALLET -> Value.SELF_HOSTED_WALLET
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
            CASH -> Known.CASH
            CHECKING -> Known.CHECKING
            GENERAL_LEDGER -> Known.GENERAL_LEDGER
            HOSTED_WALLET -> Known.HOSTED_WALLET
            LOAN -> Known.LOAN
            NON_RESIDENT -> Known.NON_RESIDENT
            OTHER -> Known.OTHER
            OVERDRAFT -> Known.OVERDRAFT
            SAVINGS -> Known.SAVINGS
            SELF_HOSTED_WALLET -> Known.SELF_HOSTED_WALLET
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
