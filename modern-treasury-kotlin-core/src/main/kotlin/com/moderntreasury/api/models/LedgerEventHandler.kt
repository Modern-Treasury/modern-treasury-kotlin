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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerEventHandler.Builder::class)
@NoAutoDetect
class LedgerEventHandler
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val ledgerId: JsonField<String>,
    private val variables: JsonField<LedgerEventHandlerVariables>,
    private val ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>,
    private val conditions: JsonField<LedgerEventHandlerConditions>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** Name of the ledger event handler. */
    fun name(): String = name.getRequired("name")

    /** An optional description. */
    fun description(): String? = description.getNullable("description")

    /** The id of the ledger that this event handler belongs to. */
    fun ledgerId(): String? = ledgerId.getNullable("ledger_id")

    fun variables(): LedgerEventHandlerVariables? = variables.getNullable("variables")

    fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
        ledgerTransactionTemplate.getRequired("ledger_transaction_template")

    fun conditions(): LedgerEventHandlerConditions? = conditions.getNullable("conditions")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** Name of the ledger event handler. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** An optional description. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The id of the ledger that this event handler belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    @JsonProperty("variables") @ExcludeMissing fun _variables() = variables

    @JsonProperty("ledger_transaction_template")
    @ExcludeMissing
    fun _ledgerTransactionTemplate() = ledgerTransactionTemplate

    @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerEventHandler = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            name()
            description()
            ledgerId()
            variables()?.validate()
            ledgerTransactionTemplate().validate()
            conditions()?.validate()
            metadata()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of()
        private var ledgerTransactionTemplate:
            JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            JsonMissing.of()
        private var conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandler: LedgerEventHandler) = apply {
            this.id = ledgerEventHandler.id
            this.object_ = ledgerEventHandler.object_
            this.liveMode = ledgerEventHandler.liveMode
            this.createdAt = ledgerEventHandler.createdAt
            this.updatedAt = ledgerEventHandler.updatedAt
            this.discardedAt = ledgerEventHandler.discardedAt
            this.name = ledgerEventHandler.name
            this.description = ledgerEventHandler.description
            this.ledgerId = ledgerEventHandler.ledgerId
            this.variables = ledgerEventHandler.variables
            this.ledgerTransactionTemplate = ledgerEventHandler.ledgerTransactionTemplate
            this.conditions = ledgerEventHandler.conditions
            this.metadata = ledgerEventHandler.metadata
            additionalProperties(ledgerEventHandler.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** Name of the ledger event handler. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the ledger event handler. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** An optional description. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The id of the ledger that this event handler belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this event handler belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        fun variables(variables: LedgerEventHandlerVariables) = variables(JsonField.of(variables))

        @JsonProperty("variables")
        @ExcludeMissing
        fun variables(variables: JsonField<LedgerEventHandlerVariables>) = apply {
            this.variables = variables
        }

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
        ) = ledgerTransactionTemplate(JsonField.of(ledgerTransactionTemplate))

        @JsonProperty("ledger_transaction_template")
        @ExcludeMissing
        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
        ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

        fun conditions(conditions: LedgerEventHandlerConditions) =
            conditions(JsonField.of(conditions))

        @JsonProperty("conditions")
        @ExcludeMissing
        fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
            this.conditions = conditions
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): LedgerEventHandler =
            LedgerEventHandler(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                name,
                description,
                ledgerId,
                variables,
                ledgerTransactionTemplate,
                conditions,
                metadata,
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

            return /* spotless:off */ other is LedgerEventHandlerConditions && this.field == other.field && this.operator == other.operator && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(field, operator, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerConditions{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = LedgerEventHandlerLedgerTransactionTemplate.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerLedgerTransactionTemplate
    private constructor(
        private val description: JsonField<String>,
        private val effectiveAt: JsonField<String>,
        private val status: JsonField<String>,
        private val ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** An optional description for internal use. */
        fun description(): String? = description.getNullable("description")

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(): String? = effectiveAt.getNullable("effective_at")

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(): String? = status.getNullable("status")

        /** An array of ledger entry objects. */
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries> =
            ledgerEntries.getRequired("ledger_entries")

        /** An optional description for internal use. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LedgerEventHandlerLedgerTransactionTemplate = apply {
            if (!validated) {
                description()
                effectiveAt()
                status()
                ledgerEntries().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAt: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerEventHandlerLedgerTransactionTemplate:
                    LedgerEventHandlerLedgerTransactionTemplate
            ) = apply {
                this.description = ledgerEventHandlerLedgerTransactionTemplate.description
                this.effectiveAt = ledgerEventHandlerLedgerTransactionTemplate.effectiveAt
                this.status = ledgerEventHandlerLedgerTransactionTemplate.status
                this.ledgerEntries = ledgerEventHandlerLedgerTransactionTemplate.ledgerEntries
                additionalProperties(
                    ledgerEventHandlerLedgerTransactionTemplate.additionalProperties
                )
            }

            /** An optional description for internal use. */
            fun description(description: String) = description(JsonField.of(description))

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: String) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun effectiveAt(effectiveAt: JsonField<String>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: String) = status(JsonField.of(status))

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: List<LedgerEventHandlerLedgerEntries>) =
                ledgerEntries(JsonField.of(ledgerEntries))

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>>) =
                apply {
                    this.ledgerEntries = ledgerEntries
                }

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

            fun build(): LedgerEventHandlerLedgerTransactionTemplate =
                LedgerEventHandlerLedgerTransactionTemplate(
                    description,
                    effectiveAt,
                    status,
                    ledgerEntries.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = LedgerEventHandlerLedgerEntries.Builder::class)
        @NoAutoDetect
        class LedgerEventHandlerLedgerEntries
        private constructor(
            private val amount: JsonField<String>,
            private val direction: JsonField<String>,
            private val ledgerAccountId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The LHS of the conditional. */
            fun amount(): String = amount.getRequired("amount")

            /** What the operator between the `field` and `value` is. */
            fun direction(): String = direction.getRequired("direction")

            /** The RHS of the conditional. */
            fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

            /** The LHS of the conditional. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /** The RHS of the conditional. */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun _ledgerAccountId() = ledgerAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LedgerEventHandlerLedgerEntries = apply {
                if (!validated) {
                    amount()
                    direction()
                    ledgerAccountId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<String> = JsonMissing.of()
                private var ledgerAccountId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerEventHandlerLedgerEntries: LedgerEventHandlerLedgerEntries
                ) = apply {
                    this.amount = ledgerEventHandlerLedgerEntries.amount
                    this.direction = ledgerEventHandlerLedgerEntries.direction
                    this.ledgerAccountId = ledgerEventHandlerLedgerEntries.ledgerAccountId
                    additionalProperties(ledgerEventHandlerLedgerEntries.additionalProperties)
                }

                /** The LHS of the conditional. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The LHS of the conditional. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** What the operator between the `field` and `value` is. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /** What the operator between the `field` and `value` is. */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** The RHS of the conditional. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(JsonField.of(ledgerAccountId))

                /** The RHS of the conditional. */
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerEventHandlerLedgerEntries =
                    LedgerEventHandlerLedgerEntries(
                        amount,
                        direction,
                        ledgerAccountId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerEventHandlerLedgerEntries && this.amount == other.amount && this.direction == other.direction && this.ledgerAccountId == other.ledgerAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, direction, ledgerAccountId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "LedgerEventHandlerLedgerEntries{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerLedgerTransactionTemplate && this.description == other.description && this.effectiveAt == other.effectiveAt && this.status == other.status && this.ledgerEntries == other.ledgerEntries && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, effectiveAt, status, ledgerEntries, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerLedgerTransactionTemplate{description=$description, effectiveAt=$effectiveAt, status=$status, ledgerEntries=$ledgerEntries, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = LedgerEventHandlerVariables.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerVariables
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LedgerEventHandlerVariables = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerVariables: LedgerEventHandlerVariables) = apply {
                additionalProperties(ledgerEventHandlerVariables.additionalProperties)
            }

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

            fun build(): LedgerEventHandlerVariables =
                LedgerEventHandlerVariables(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerVariables && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandler && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.discardedAt == other.discardedAt && this.name == other.name && this.description == other.description && this.ledgerId == other.ledgerId && this.variables == other.variables && this.ledgerTransactionTemplate == other.ledgerTransactionTemplate && this.conditions == other.conditions && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, name, description, ledgerId, variables, ledgerTransactionTemplate, conditions, metadata, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "LedgerEventHandler{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, description=$description, ledgerId=$ledgerId, variables=$variables, ledgerTransactionTemplate=$ledgerTransactionTemplate, conditions=$conditions, metadata=$metadata, additionalProperties=$additionalProperties}"
}
