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
import com.moderntreasury.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerEventHandlerListResponse.Builder::class)
@NoAutoDetect
class LedgerEventHandlerListResponse
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>,
    private val conditions: JsonField<LedgerEventHandlerConditions>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    @JsonProperty("ledger_transaction_template")
    @ExcludeMissing
    fun _ledgerTransactionTemplate() = ledgerTransactionTemplate

    @JsonProperty("conditions") @ExcludeMissing fun _conditions() = conditions

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerEventHandlerListResponse = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            name()
            description()
            ledgerTransactionTemplate().validate()
            conditions()?.validate()
            metadata()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerEventHandlerListResponse &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.name == other.name &&
            this.description == other.description &&
            this.ledgerTransactionTemplate == other.ledgerTransactionTemplate &&
            this.conditions == other.conditions &&
            this.metadata == other.metadata &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    name,
                    description,
                    ledgerTransactionTemplate,
                    conditions,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LedgerEventHandlerListResponse{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, description=$description, ledgerTransactionTemplate=$ledgerTransactionTemplate, conditions=$conditions, metadata=$metadata, additionalProperties=$additionalProperties}"

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
        private var ledgerTransactionTemplate:
            JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            JsonMissing.of()
        private var conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandlerListResponse: LedgerEventHandlerListResponse) = apply {
            this.id = ledgerEventHandlerListResponse.id
            this.object_ = ledgerEventHandlerListResponse.object_
            this.liveMode = ledgerEventHandlerListResponse.liveMode
            this.createdAt = ledgerEventHandlerListResponse.createdAt
            this.updatedAt = ledgerEventHandlerListResponse.updatedAt
            this.discardedAt = ledgerEventHandlerListResponse.discardedAt
            this.name = ledgerEventHandlerListResponse.name
            this.description = ledgerEventHandlerListResponse.description
            this.ledgerTransactionTemplate =
                ledgerEventHandlerListResponse.ledgerTransactionTemplate
            this.conditions = ledgerEventHandlerListResponse.conditions
            this.metadata = ledgerEventHandlerListResponse.metadata
            additionalProperties(ledgerEventHandlerListResponse.additionalProperties)
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

        fun build(): LedgerEventHandlerListResponse =
            LedgerEventHandlerListResponse(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                name,
                description,
                ledgerTransactionTemplate,
                conditions,
                metadata,
                additionalProperties.toUnmodifiable(),
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

        private var hashCode: Int = 0

        /** The field you're fetching from the `ledgerable_event`. */
        fun field(): String = field.getRequired("field")

        /**
         * What the operator between the `field` and `value` is. Currently only supports `equals`.
         */
        fun operator(): String = operator.getRequired("operator")

        /** What raw string you are comparing the `field` against. */
        fun value(): String = value.getRequired("value")

        /** The field you're fetching from the `ledgerable_event`. */
        @JsonProperty("field") @ExcludeMissing fun _field() = field

        /**
         * What the operator between the `field` and `value` is. Currently only supports `equals`.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

        /** What raw string you are comparing the `field` against. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerEventHandlerConditions &&
                this.field == other.field &&
                this.operator == other.operator &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        field,
                        operator,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerConditions{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"

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

            /** The field you're fetching from the `ledgerable_event`. */
            fun field(field: String) = field(JsonField.of(field))

            /** The field you're fetching from the `ledgerable_event`. */
            @JsonProperty("field")
            @ExcludeMissing
            fun field(field: JsonField<String>) = apply { this.field = field }

            /**
             * What the operator between the `field` and `value` is. Currently only supports
             * `equals`.
             */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /**
             * What the operator between the `field` and `value` is. Currently only supports
             * `equals`.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /** What raw string you are comparing the `field` against. */
            fun value(value: String) = value(JsonField.of(value))

            /** What raw string you are comparing the `field` against. */
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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = LedgerEventHandlerLedgerTransactionTemplate.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerLedgerTransactionTemplate
    private constructor(
        private val description: JsonField<String>,
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** An optional description for internal use. */
        fun description(): String? = description.getNullable("description")

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

        /** An array of ledger entry objects. */
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries> =
            ledgerEntries.getRequired("ledger_entries")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** An optional description for internal use. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LedgerEventHandlerLedgerTransactionTemplate = apply {
            if (!validated) {
                description()
                effectiveAt()
                ledgerEntries().forEach { it.validate() }
                metadata()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerEventHandlerLedgerTransactionTemplate &&
                this.description == other.description &&
                this.effectiveAt == other.effectiveAt &&
                this.ledgerEntries == other.ledgerEntries &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        effectiveAt,
                        ledgerEntries,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerLedgerTransactionTemplate{description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ledgerEntries: JsonField<List<LedgerEventHandlerLedgerEntries>> =
                JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerEventHandlerLedgerTransactionTemplate:
                    LedgerEventHandlerLedgerTransactionTemplate
            ) = apply {
                this.description = ledgerEventHandlerLedgerTransactionTemplate.description
                this.effectiveAt = ledgerEventHandlerLedgerTransactionTemplate.effectiveAt
                this.ledgerEntries = ledgerEventHandlerLedgerTransactionTemplate.ledgerEntries
                this.metadata = ledgerEventHandlerLedgerTransactionTemplate.metadata
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
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

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

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
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

            fun build(): LedgerEventHandlerLedgerTransactionTemplate =
                LedgerEventHandlerLedgerTransactionTemplate(
                    description,
                    effectiveAt,
                    ledgerEntries.map { it.toUnmodifiable() },
                    metadata,
                    additionalProperties.toUnmodifiable(),
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

            private var hashCode: Int = 0

            /** The field you're fetching from the `ledgerable_event`. */
            fun amount(): String = amount.getRequired("amount")

            /**
             * What the operator between the `field` and `value` is. Currently only supports
             * `equals`.
             */
            fun direction(): String = direction.getRequired("direction")

            /** What raw string you are comparing the `field` against. */
            fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

            /** The field you're fetching from the `ledgerable_event`. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * What the operator between the `field` and `value` is. Currently only supports
             * `equals`.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /** What raw string you are comparing the `field` against. */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerEventHandlerLedgerEntries &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.ledgerAccountId == other.ledgerAccountId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            direction,
                            ledgerAccountId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerEventHandlerLedgerEntries{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, additionalProperties=$additionalProperties}"

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

                /** The field you're fetching from the `ledgerable_event`. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The field you're fetching from the `ledgerable_event`. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                /**
                 * What the operator between the `field` and `value` is. Currently only supports
                 * `equals`.
                 */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /**
                 * What the operator between the `field` and `value` is. Currently only supports
                 * `equals`.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** What raw string you are comparing the `field` against. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(JsonField.of(ledgerAccountId))

                /** What raw string you are comparing the `field` against. */
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
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
