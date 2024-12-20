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
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = LedgerEventHandlerVariable.Builder::class)
@NoAutoDetect
class LedgerEventHandlerVariable
private constructor(
    private val type: JsonField<String>,
    private val query: JsonField<LedgerEventHandlerConditions>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The type of object this variable is. Currently, only "ledger_account" is supported. */
    fun type(): String = type.getRequired("type")

    fun query(): LedgerEventHandlerConditions = query.getRequired("query")

    /** The type of object this variable is. Currently, only "ledger_account" is supported. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("query") @ExcludeMissing fun _query() = query

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerEventHandlerVariable = apply {
        if (!validated) {
            type()
            query().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var type: JsonField<String> = JsonMissing.of()
        private var query: JsonField<LedgerEventHandlerConditions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandlerVariable: LedgerEventHandlerVariable) = apply {
            this.type = ledgerEventHandlerVariable.type
            this.query = ledgerEventHandlerVariable.query
            additionalProperties(ledgerEventHandlerVariable.additionalProperties)
        }

        /** The type of object this variable is. Currently, only "ledger_account" is supported. */
        fun type(type: String) = type(JsonField.of(type))

        /** The type of object this variable is. Currently, only "ledger_account" is supported. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun query(query: LedgerEventHandlerConditions) = query(JsonField.of(query))

        @JsonProperty("query")
        @ExcludeMissing
        fun query(query: JsonField<LedgerEventHandlerConditions>) = apply { this.query = query }

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

        fun build(): LedgerEventHandlerVariable =
            LedgerEventHandlerVariable(
                type,
                query,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = LedgerEventHandlerConditions.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerConditions
    private constructor(
        private val field: JsonField<String>,
        private val operator: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The LHS of the conditional. */
        fun field(): String = field.getRequired("field")

        /** What the operator between the `field` and `value` is. */
        fun operator(): String = operator.getRequired("operator")

        /** The RHS of the conditional. */
        fun value(): String = value.getRequired("value")

        /** The LHS of the conditional. */
        @JsonProperty("field") @ExcludeMissing fun _field() = field

        /** What the operator between the `field` and `value` is. */
        @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

        /** The RHS of the conditional. */
        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LedgerEventHandlerConditions = apply {
            if (!validated) {
                field()
                operator()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var field: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<String> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerConditions: LedgerEventHandlerConditions) = apply {
                this.field = ledgerEventHandlerConditions.field
                this.operator = ledgerEventHandlerConditions.operator
                this.value = ledgerEventHandlerConditions.value
                additionalProperties(ledgerEventHandlerConditions.additionalProperties)
            }

            /** The LHS of the conditional. */
            fun field(field: String) = field(JsonField.of(field))

            /** The LHS of the conditional. */
            @JsonProperty("field")
            @ExcludeMissing
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** What the operator between the `field` and `value` is. */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("operator")
            @ExcludeMissing
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /** The RHS of the conditional. */
            fun value(value: String) = value(JsonField.of(value))

            /** The RHS of the conditional. */
            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<String>) = apply { this.value = value }

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

            fun build(): LedgerEventHandlerConditions =
                LedgerEventHandlerConditions(
                    field,
                    operator,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerConditions && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerConditions{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandlerVariable && type == other.type && query == other.query && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(type, query, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerEventHandlerVariable{type=$type, query=$query, additionalProperties=$additionalProperties}"
}
