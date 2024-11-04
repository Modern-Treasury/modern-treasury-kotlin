// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects

class LedgerEventHandlerCreateParams
constructor(
    private val ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate,
    private val name: String,
    private val conditions: LedgerEventHandlerConditions?,
    private val description: String?,
    private val ledgerId: String?,
    private val metadata: Metadata?,
    private val variables: LedgerEventHandlerVariables?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
        ledgerTransactionTemplate

    fun name(): String = name

    fun conditions(): LedgerEventHandlerConditions? = conditions

    fun description(): String? = description

    fun ledgerId(): String? = ledgerId

    fun metadata(): Metadata? = metadata

    fun variables(): LedgerEventHandlerVariables? = variables

    internal fun getBody(): LedgerEventHandlerCreateBody {
        return LedgerEventHandlerCreateBody(
            ledgerTransactionTemplate,
            name,
            conditions,
            description,
            ledgerId,
            metadata,
            variables,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = LedgerEventHandlerCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerCreateBody
    internal constructor(
        private val ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate?,
        private val name: String?,
        private val conditions: LedgerEventHandlerConditions?,
        private val description: String?,
        private val ledgerId: String?,
        private val metadata: Metadata?,
        private val variables: LedgerEventHandlerVariables?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("ledger_transaction_template")
        fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate? =
            ledgerTransactionTemplate

        /** Name of the ledger event handler. */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("conditions") fun conditions(): LedgerEventHandlerConditions? = conditions

        /** An optional description. */
        @JsonProperty("description") fun description(): String? = description

        /** The id of the ledger that this account belongs to. */
        @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("variables") fun variables(): LedgerEventHandlerVariables? = variables

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate? =
                null
            private var name: String? = null
            private var conditions: LedgerEventHandlerConditions? = null
            private var description: String? = null
            private var ledgerId: String? = null
            private var metadata: Metadata? = null
            private var variables: LedgerEventHandlerVariables? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerCreateBody: LedgerEventHandlerCreateBody) = apply {
                this.ledgerTransactionTemplate =
                    ledgerEventHandlerCreateBody.ledgerTransactionTemplate
                this.name = ledgerEventHandlerCreateBody.name
                this.conditions = ledgerEventHandlerCreateBody.conditions
                this.description = ledgerEventHandlerCreateBody.description
                this.ledgerId = ledgerEventHandlerCreateBody.ledgerId
                this.metadata = ledgerEventHandlerCreateBody.metadata
                this.variables = ledgerEventHandlerCreateBody.variables
                additionalProperties(ledgerEventHandlerCreateBody.additionalProperties)
            }

            @JsonProperty("ledger_transaction_template")
            fun ledgerTransactionTemplate(
                ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
            ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

            /** Name of the ledger event handler. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("conditions")
            fun conditions(conditions: LedgerEventHandlerConditions) = apply {
                this.conditions = conditions
            }

            /** An optional description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id")
            fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            @JsonProperty("variables")
            fun variables(variables: LedgerEventHandlerVariables) = apply {
                this.variables = variables
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

            return /* spotless:off */ other is LedgerEventHandlerCreateBody && this.ledgerTransactionTemplate == other.ledgerTransactionTemplate && this.name == other.name && this.conditions == other.conditions && this.description == other.description && this.ledgerId == other.ledgerId && this.metadata == other.metadata && this.variables == other.variables && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(ledgerTransactionTemplate, name, conditions, description, ledgerId, metadata, variables, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEventHandlerCreateBody{ledgerTransactionTemplate=$ledgerTransactionTemplate, name=$name, conditions=$conditions, description=$description, ledgerId=$ledgerId, metadata=$metadata, variables=$variables, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEventHandlerCreateParams && this.ledgerTransactionTemplate == other.ledgerTransactionTemplate && this.name == other.name && this.conditions == other.conditions && this.description == other.description && this.ledgerId == other.ledgerId && this.metadata == other.metadata && this.variables == other.variables && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(ledgerTransactionTemplate, name, conditions, description, ledgerId, metadata, variables, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "LedgerEventHandlerCreateParams{ledgerTransactionTemplate=$ledgerTransactionTemplate, name=$name, conditions=$conditions, description=$description, ledgerId=$ledgerId, metadata=$metadata, variables=$variables, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate? = null
        private var name: String? = null
        private var conditions: LedgerEventHandlerConditions? = null
        private var description: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var variables: LedgerEventHandlerVariables? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandlerCreateParams: LedgerEventHandlerCreateParams) = apply {
            this.ledgerTransactionTemplate =
                ledgerEventHandlerCreateParams.ledgerTransactionTemplate
            this.name = ledgerEventHandlerCreateParams.name
            this.conditions = ledgerEventHandlerCreateParams.conditions
            this.description = ledgerEventHandlerCreateParams.description
            this.ledgerId = ledgerEventHandlerCreateParams.ledgerId
            this.metadata = ledgerEventHandlerCreateParams.metadata
            this.variables = ledgerEventHandlerCreateParams.variables
            additionalHeaders(ledgerEventHandlerCreateParams.additionalHeaders)
            additionalQueryParams(ledgerEventHandlerCreateParams.additionalQueryParams)
            additionalBodyProperties(ledgerEventHandlerCreateParams.additionalBodyProperties)
        }

        fun ledgerTransactionTemplate(
            ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate
        ) = apply { this.ledgerTransactionTemplate = ledgerTransactionTemplate }

        /** Name of the ledger event handler. */
        fun name(name: String) = apply { this.name = name }

        fun conditions(conditions: LedgerEventHandlerConditions) = apply {
            this.conditions = conditions
        }

        /** An optional description. */
        fun description(description: String) = apply { this.description = description }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun variables(variables: LedgerEventHandlerVariables) = apply { this.variables = variables }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): LedgerEventHandlerCreateParams =
            LedgerEventHandlerCreateParams(
                checkNotNull(ledgerTransactionTemplate) {
                    "`ledgerTransactionTemplate` is required but was not set"
                },
                checkNotNull(name) { "`name` is required but was not set" },
                conditions,
                description,
                ledgerId,
                metadata,
                variables,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = LedgerEventHandlerLedgerTransactionTemplate.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerLedgerTransactionTemplate
    private constructor(
        private val description: String?,
        private val effectiveAt: String?,
        private val status: String?,
        private val ledgerEntries: List<LedgerEventHandlerLedgerEntries>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") fun effectiveAt(): String? = effectiveAt

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") fun status(): String? = status

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries>? = ledgerEntries

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var effectiveAt: String? = null
            private var status: String? = null
            private var ledgerEntries: List<LedgerEventHandlerLedgerEntries>? = null
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
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: String) = apply { this.effectiveAt = effectiveAt }

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(status: String) = apply { this.status = status }

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(ledgerEntries: List<LedgerEventHandlerLedgerEntries>) = apply {
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
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = LedgerEventHandlerLedgerEntries.Builder::class)
        @NoAutoDetect
        class LedgerEventHandlerLedgerEntries
        private constructor(
            private val amount: String?,
            private val direction: String?,
            private val ledgerAccountId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The LHS of the conditional. */
            @JsonProperty("amount") fun amount(): String? = amount

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("direction") fun direction(): String? = direction

            /** The RHS of the conditional. */
            @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: String? = null
                private var direction: String? = null
                private var ledgerAccountId: String? = null
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
                @JsonProperty("amount") fun amount(amount: String) = apply { this.amount = amount }

                /** What the operator between the `field` and `value` is. */
                @JsonProperty("direction")
                fun direction(direction: String) = apply { this.direction = direction }

                /** The RHS of the conditional. */
                @JsonProperty("ledger_account_id")
                fun ledgerAccountId(ledgerAccountId: String) = apply {
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

    @JsonDeserialize(builder = LedgerEventHandlerConditions.Builder::class)
    @NoAutoDetect
    class LedgerEventHandlerConditions
    private constructor(
        private val field: String?,
        private val operator: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The LHS of the conditional. */
        @JsonProperty("field") fun field(): String? = field

        /** What the operator between the `field` and `value` is. */
        @JsonProperty("operator") fun operator(): String? = operator

        /** The RHS of the conditional. */
        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var field: String? = null
            private var operator: String? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEventHandlerConditions: LedgerEventHandlerConditions) = apply {
                this.field = ledgerEventHandlerConditions.field
                this.operator = ledgerEventHandlerConditions.operator
                this.value = ledgerEventHandlerConditions.value
                additionalProperties(ledgerEventHandlerConditions.additionalProperties)
            }

            /** The LHS of the conditional. */
            @JsonProperty("field") fun field(field: String) = apply { this.field = field }

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("operator")
            fun operator(operator: String) = apply { this.operator = operator }

            /** The RHS of the conditional. */
            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
}
