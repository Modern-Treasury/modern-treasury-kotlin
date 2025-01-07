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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerEventHandler
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("conditions")
    @ExcludeMissing
    private val conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_template")
    @ExcludeMissing
    private val ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
        JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("variables")
    @ExcludeMissing
    private val variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun conditions(): LedgerEventHandlerConditions? = conditions.getNullable("conditions")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An optional description. */
    fun description(): String? = description.getNullable("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The id of the ledger that this event handler belongs to. */
    fun ledgerId(): String? = ledgerId.getNullable("ledger_id")

    fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
        ledgerTransactionTemplate.getRequired("ledger_transaction_template")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /** Name of the ledger event handler. */
    fun name(): String = name.getRequired("name")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun variables(): LedgerEventHandlerVariables? = variables.getNullable("variables")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<LedgerEventHandlerConditions> = conditions

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** An optional description. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The id of the ledger that this event handler belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    @JsonProperty("ledger_transaction_template")
    @ExcludeMissing
    fun _ledgerTransactionTemplate(): JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
        ledgerTransactionTemplate

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** Name of the ledger event handler. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonProperty("variables")
    @ExcludeMissing
    fun _variables(): JsonField<LedgerEventHandlerVariables> = variables

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerEventHandler = apply {
        if (!validated) {
            id()
            conditions()?.validate()
            createdAt()
            description()
            discardedAt()
            ledgerId()
            ledgerTransactionTemplate().validate()
            liveMode()
            metadata()?.validate()
            name()
            object_()
            updatedAt()
            variables()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var conditions: JsonField<LedgerEventHandlerConditions>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var ledgerId: JsonField<String>? = null
        private var ledgerTransactionTemplate:
            JsonField<LedgerEventHandlerLedgerTransactionTemplate>? =
            null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var variables: JsonField<LedgerEventHandlerVariables>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandler: LedgerEventHandler) = apply {
            id = ledgerEventHandler.id
            conditions = ledgerEventHandler.conditions
            createdAt = ledgerEventHandler.createdAt
            description = ledgerEventHandler.description
            discardedAt = ledgerEventHandler.discardedAt
            ledgerId = ledgerEventHandler.ledgerId
            ledgerTransactionTemplate = ledgerEventHandler.ledgerTransactionTemplate
            liveMode = ledgerEventHandler.liveMode
            metadata = ledgerEventHandler.metadata
            name = ledgerEventHandler.name
            object_ = ledgerEventHandler.object_
            updatedAt = ledgerEventHandler.updatedAt
            variables = ledgerEventHandler.variables
            additionalProperties = ledgerEventHandler.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun conditions(conditions: LedgerEventHandlerConditions?) =
            conditions(JsonField.ofNullable(conditions))

        fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
            this.conditions = conditions
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An optional description. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** An optional description. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The id of the ledger that this event handler belongs to. */
        fun ledgerId(ledgerId: String?) = ledgerId(JsonField.ofNullable(ledgerId))

        /** The id of the ledger that this event handler belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
        ) = ledgerTransactionTemplate(JsonField.of(ledgerTransactionTemplate))

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
        ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Name of the ledger event handler. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of the ledger event handler. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun variables(variables: LedgerEventHandlerVariables?) =
            variables(JsonField.ofNullable(variables))

        fun variables(variables: JsonField<LedgerEventHandlerVariables>) = apply {
            this.variables = variables
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

        fun build(): LedgerEventHandler =
            LedgerEventHandler(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(conditions) { "`conditions` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                checkNotNull(ledgerTransactionTemplate) {
                    "`ledgerTransactionTemplate` is required but was not set"
                },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                checkNotNull(variables) { "`variables` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class LedgerEventHandlerConditions
    @JsonCreator
    private constructor(
        @JsonProperty("field")
        @ExcludeMissing
        private val field: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator")
        @ExcludeMissing
        private val operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The LHS of the conditional. */
        fun field(): String = field.getRequired("field")

        /** What the operator between the `field` and `value` is. */
        fun operator(): String = operator.getRequired("operator")

        /** The RHS of the conditional. */
        fun value(): String = value.getRequired("value")

        /** The LHS of the conditional. */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /** What the operator between the `field` and `value` is. */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

        /** The RHS of the conditional. */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

            private var field: JsonField<String>? = null
            private var operator: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerConditions: LedgerEventHandlerConditions) = apply {
                field = ledgerEventHandlerConditions.field
                operator = ledgerEventHandlerConditions.operator
                value = ledgerEventHandlerConditions.value
                additionalProperties =
                    ledgerEventHandlerConditions.additionalProperties.toMutableMap()
            }

            /** The LHS of the conditional. */
            fun field(field: String) = field(JsonField.of(field))

            /** The LHS of the conditional. */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /** What the operator between the `field` and `value` is. */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /** What the operator between the `field` and `value` is. */
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /** The RHS of the conditional. */
            fun value(value: String) = value(JsonField.of(value))

            /** The RHS of the conditional. */
            fun value(value: JsonField<String>) = apply { this.value = value }

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

            fun build(): LedgerEventHandlerConditions =
                LedgerEventHandlerConditions(
                    checkNotNull(field) { "`field` is required but was not set" },
                    checkNotNull(operator) { "`operator` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
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

    @NoAutoDetect
    class LedgerEventHandlerLedgerTransactionTemplate
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        private val ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>> =
            JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An optional description for internal use. */
        fun description(): String? = description.getNullable("description")

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(): String? = effectiveAt.getNullable("effective_at")

        /** An array of ledger entry objects. */
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries> =
            ledgerEntries.getRequired("ledger_entries")

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(): String? = status.getNullable("status")

        /** An optional description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<String> = effectiveAt

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun _ledgerEntries(): JsonField<List<LedgerEventHandlerLedgerEntries>> = ledgerEntries

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerLedgerTransactionTemplate = apply {
            if (!validated) {
                description()
                effectiveAt()
                ledgerEntries().forEach { it.validate() }
                status()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: JsonField<String>? = null
            private var effectiveAt: JsonField<String>? = null
            private var ledgerEntries: JsonField<MutableList<LedgerEventHandlerLedgerEntries>>? =
                null
            private var status: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerEventHandlerLedgerTransactionTemplate:
                    LedgerEventHandlerLedgerTransactionTemplate
            ) = apply {
                description = ledgerEventHandlerLedgerTransactionTemplate.description
                effectiveAt = ledgerEventHandlerLedgerTransactionTemplate.effectiveAt
                ledgerEntries =
                    ledgerEventHandlerLedgerTransactionTemplate.ledgerEntries.map {
                        it.toMutableList()
                    }
                status = ledgerEventHandlerLedgerTransactionTemplate.status
                additionalProperties =
                    ledgerEventHandlerLedgerTransactionTemplate.additionalProperties.toMutableMap()
            }

            /** An optional description for internal use. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** An optional description for internal use. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: String?) = effectiveAt(JsonField.ofNullable(effectiveAt))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: JsonField<String>) = apply {
                this.effectiveAt = effectiveAt
            }

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: List<LedgerEventHandlerLedgerEntries>) =
                ledgerEntries(JsonField.of(ledgerEntries))

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>>) =
                apply {
                    this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                }

            /** An array of ledger entry objects. */
            fun addLedgerEntry(ledgerEntry: LedgerEventHandlerLedgerEntries) = apply {
                ledgerEntries =
                    (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(ledgerEntry)
                    }
            }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: String?) = status(JsonField.ofNullable(status))

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: JsonField<String>) = apply { this.status = status }

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

            fun build(): LedgerEventHandlerLedgerTransactionTemplate =
                LedgerEventHandlerLedgerTransactionTemplate(
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(effectiveAt) { "`effectiveAt` is required but was not set" },
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(status) { "`status` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class LedgerEventHandlerLedgerEntries
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The LHS of the conditional. */
            fun amount(): String = amount.getRequired("amount")

            /** What the operator between the `field` and `value` is. */
            fun direction(): String = direction.getRequired("direction")

            /** The RHS of the conditional. */
            fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

            /** The LHS of the conditional. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<String> = direction

            /** The RHS of the conditional. */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

                private var amount: JsonField<String>? = null
                private var direction: JsonField<String>? = null
                private var ledgerAccountId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    ledgerEventHandlerLedgerEntries: LedgerEventHandlerLedgerEntries
                ) = apply {
                    amount = ledgerEventHandlerLedgerEntries.amount
                    direction = ledgerEventHandlerLedgerEntries.direction
                    ledgerAccountId = ledgerEventHandlerLedgerEntries.ledgerAccountId
                    additionalProperties =
                        ledgerEventHandlerLedgerEntries.additionalProperties.toMutableMap()
                }

                /** The LHS of the conditional. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The LHS of the conditional. */
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /** What the operator between the `field` and `value` is. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /** What the operator between the `field` and `value` is. */
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** The RHS of the conditional. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(JsonField.of(ledgerAccountId))

                /** The RHS of the conditional. */
                fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LedgerEventHandlerLedgerEntries =
                    LedgerEventHandlerLedgerEntries(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(ledgerAccountId) {
                            "`ledgerAccountId` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerEventHandlerLedgerEntries && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerEventHandlerLedgerEntries{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerLedgerTransactionTemplate && description == other.description && effectiveAt == other.effectiveAt && ledgerEntries == other.ledgerEntries && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, effectiveAt, ledgerEntries, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerLedgerTransactionTemplate{description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LedgerEventHandlerVariables
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                additionalProperties =
                    ledgerEventHandlerVariables.additionalProperties.toMutableMap()
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

            fun build(): LedgerEventHandlerVariables =
                LedgerEventHandlerVariables(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerVariables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerVariables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandler && id == other.id && conditions == other.conditions && createdAt == other.createdAt && description == other.description && discardedAt == other.discardedAt && ledgerId == other.ledgerId && ledgerTransactionTemplate == other.ledgerTransactionTemplate && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && updatedAt == other.updatedAt && variables == other.variables && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, conditions, createdAt, description, discardedAt, ledgerId, ledgerTransactionTemplate, liveMode, metadata, name, object_, updatedAt, variables, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerEventHandler{id=$id, conditions=$conditions, createdAt=$createdAt, description=$description, discardedAt=$discardedAt, ledgerId=$ledgerId, ledgerTransactionTemplate=$ledgerTransactionTemplate, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, updatedAt=$updatedAt, variables=$variables, additionalProperties=$additionalProperties}"
}
