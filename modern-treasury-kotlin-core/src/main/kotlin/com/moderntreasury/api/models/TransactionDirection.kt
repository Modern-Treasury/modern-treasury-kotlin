// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class TransactionDirection
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionDirection && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val CREDIT = TransactionDirection(JsonField.of("credit"))

        val DEBIT = TransactionDirection(JsonField.of("debit"))

        fun of(value: String) = TransactionDirection(JsonField.of(value))
    }

    enum class Known {
        CREDIT,
        DEBIT,
    }

    enum class Value {
        CREDIT,
        DEBIT,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            CREDIT -> Value.CREDIT
            DEBIT -> Value.DEBIT
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            CREDIT -> Known.CREDIT
            DEBIT -> Known.DEBIT
            else -> throw ModernTreasuryInvalidDataException("Unknown TransactionDirection: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
