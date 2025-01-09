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
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

/** create ledger_event_handler */
class LedgerEventHandlerCreateParams
constructor(
    private val body: LedgerEventHandlerCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
        body.ledgerTransactionTemplate()

    /** Name of the ledger event handler. */
    fun name(): String = body.name()

    fun conditions(): LedgerEventHandlerConditions? = body.conditions()

    /** An optional description. */
    fun description(): String? = body.description()

    /** The id of the ledger that this account belongs to. */
    fun ledgerId(): String? = body.ledgerId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    fun variables(): LedgerEventHandlerVariables? = body.variables()

    fun _ledgerTransactionTemplate(): JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
        body._ledgerTransactionTemplate()

    /** Name of the ledger event handler. */
    fun _name(): JsonField<String> = body._name()

    fun _conditions(): JsonField<LedgerEventHandlerConditions> = body._conditions()

    /** An optional description. */
    fun _description(): JsonField<String> = body._description()

    /** The id of the ledger that this account belongs to. */
    fun _ledgerId(): JsonField<String> = body._ledgerId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _variables(): JsonField<LedgerEventHandlerVariables> = body._variables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): LedgerEventHandlerCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerEventHandlerCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("ledger_transaction_template")
        @ExcludeMissing
        private val ledgerTransactionTemplate:
            JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        private val conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_id")
        @ExcludeMissing
        private val ledgerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        private val variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
            ledgerTransactionTemplate.getRequired("ledger_transaction_template")

        /** Name of the ledger event handler. */
        fun name(): String = name.getRequired("name")

        fun conditions(): LedgerEventHandlerConditions? = conditions.getNullable("conditions")

        /** An optional description. */
        fun description(): String? = description.getNullable("description")

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(): String? = ledgerId.getNullable("ledger_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        fun variables(): LedgerEventHandlerVariables? = variables.getNullable("variables")

        @JsonProperty("ledger_transaction_template")
        @ExcludeMissing
        fun _ledgerTransactionTemplate(): JsonField<LedgerEventHandlerLedgerTransactionTemplate> =
            ledgerTransactionTemplate

        /** Name of the ledger event handler. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("conditions")
        @ExcludeMissing
        fun _conditions(): JsonField<LedgerEventHandlerConditions> = conditions

        /** An optional description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The id of the ledger that this account belongs to. */
        @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<LedgerEventHandlerVariables> = variables

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEventHandlerCreateBody = apply {
            if (validated) {
                return@apply
            }

            ledgerTransactionTemplate().validate()
            name()
            conditions()?.validate()
            description()
            ledgerId()
            metadata()?.validate()
            variables()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var ledgerTransactionTemplate:
                JsonField<LedgerEventHandlerLedgerTransactionTemplate>? =
                null
            private var name: JsonField<String>? = null
            private var conditions: JsonField<LedgerEventHandlerConditions> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var variables: JsonField<LedgerEventHandlerVariables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerCreateBody: LedgerEventHandlerCreateBody) = apply {
                ledgerTransactionTemplate = ledgerEventHandlerCreateBody.ledgerTransactionTemplate
                name = ledgerEventHandlerCreateBody.name
                conditions = ledgerEventHandlerCreateBody.conditions
                description = ledgerEventHandlerCreateBody.description
                ledgerId = ledgerEventHandlerCreateBody.ledgerId
                metadata = ledgerEventHandlerCreateBody.metadata
                variables = ledgerEventHandlerCreateBody.variables
                additionalProperties =
                    ledgerEventHandlerCreateBody.additionalProperties.toMutableMap()
            }

            fun ledgerTransactionTemplate(
                ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
            ) = ledgerTransactionTemplate(JsonField.of(ledgerTransactionTemplate))

            fun ledgerTransactionTemplate(
                ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
            ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

            /** Name of the ledger event handler. */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the ledger event handler. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun conditions(conditions: LedgerEventHandlerConditions?) =
                conditions(JsonField.ofNullable(conditions))

            fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
                this.conditions = conditions
            }

            /** An optional description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** An optional description. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The id of the ledger that this account belongs to. */
            fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

            /** The id of the ledger that this account belongs to. */
            fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun build(): LedgerEventHandlerCreateBody =
                LedgerEventHandlerCreateBody(
                    checkNotNull(ledgerTransactionTemplate) {
                        "`ledgerTransactionTemplate` is required but was not set"
                    },
                    checkNotNull(name) { "`name` is required but was not set" },
                    conditions,
                    description,
                    ledgerId,
                    metadata,
                    variables,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerEventHandlerCreateBody && ledgerTransactionTemplate == other.ledgerTransactionTemplate && name == other.name && conditions == other.conditions && description == other.description && ledgerId == other.ledgerId && metadata == other.metadata && variables == other.variables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ledgerTransactionTemplate, name, conditions, description, ledgerId, metadata, variables, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEventHandlerCreateBody{ledgerTransactionTemplate=$ledgerTransactionTemplate, name=$name, conditions=$conditions, description=$description, ledgerId=$ledgerId, metadata=$metadata, variables=$variables, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: LedgerEventHandlerCreateBody.Builder =
            LedgerEventHandlerCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(ledgerEventHandlerCreateParams: LedgerEventHandlerCreateParams) = apply {
            body = ledgerEventHandlerCreateParams.body.toBuilder()
            additionalHeaders = ledgerEventHandlerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerEventHandlerCreateParams.additionalQueryParams.toBuilder()
        }

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
        ) = apply { body.ledgerTransactionTemplate(ledgerTransactionTemplate) }

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: JsonField<LedgerEventHandlerLedgerTransactionTemplate>
        ) = apply { body.ledgerTransactionTemplate(ledgerTransactionTemplate) }

        /** Name of the ledger event handler. */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the ledger event handler. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun conditions(conditions: LedgerEventHandlerConditions?) = apply {
            body.conditions(conditions)
        }

        fun conditions(conditions: JsonField<LedgerEventHandlerConditions>) = apply {
            body.conditions(conditions)
        }

        /** An optional description. */
        fun description(description: String?) = apply { body.description(description) }

        /** An optional description. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = apply { body.ledgerId(ledgerId) }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { body.ledgerId(ledgerId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun variables(variables: LedgerEventHandlerVariables?) = apply { body.variables(variables) }

        fun variables(variables: JsonField<LedgerEventHandlerVariables>) = apply {
            body.variables(variables)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): LedgerEventHandlerCreateParams =
            LedgerEventHandlerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
            if (validated) {
                return@apply
            }

            description()
            effectiveAt()
            ledgerEntries().forEach { it.validate() }
            status()
            validated = true
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
                if (validated) {
                    return@apply
                }

                amount()
                direction()
                ledgerAccountId()
                validated = true
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
            if (validated) {
                return@apply
            }

            field()
            operator()
            value()
            validated = true
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
            if (validated) {
                return@apply
            }

            validated = true
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
            if (validated) {
                return@apply
            }

            validated = true
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

        return /* spotless:off */ other is LedgerEventHandlerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
