package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExampleEnum
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleEnum && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val CLOSED = ExampleEnum(JsonField.of("CLOSED"))

        val OPEN = ExampleEnum(JsonField.of("OPEN"))

        val PAUSED = ExampleEnum(JsonField.of("paused"))

        fun of(value: String) = ExampleEnum(JsonField.of(value))
    }

    enum class Known {
        CLOSED,
        OPEN,
        PAUSED,
    }

    enum class Value {
        CLOSED,
        OPEN,
        PAUSED,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            CLOSED -> Value.CLOSED
            OPEN -> Value.OPEN
            PAUSED -> Value.PAUSED
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            CLOSED -> Known.CLOSED
            OPEN -> Known.OPEN
            PAUSED -> Known.PAUSED
            else -> throw ModernTreasuryInvalidDataException("Unknown ExampleEnum: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
