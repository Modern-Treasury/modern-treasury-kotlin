// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class AccountsType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountsType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val EXTERNAL_ACCOUNTS = AccountsType(JsonField.of("external_accounts"))

        val INTERNAL_ACCOUNTS = AccountsType(JsonField.of("internal_accounts"))

        fun of(value: String) = AccountsType(JsonField.of(value))
    }

    enum class Known {
        EXTERNAL_ACCOUNTS,
        INTERNAL_ACCOUNTS,
    }

    enum class Value {
        EXTERNAL_ACCOUNTS,
        INTERNAL_ACCOUNTS,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
            INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
            INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
            else -> throw ModernTreasuryInvalidDataException("Unknown AccountsType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
