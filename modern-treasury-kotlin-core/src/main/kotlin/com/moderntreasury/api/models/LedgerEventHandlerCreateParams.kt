// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

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

        private var ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate? = null
        private var name: String? = null
        private var conditions: LedgerEventHandlerConditions? = null
        private var description: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var variables: LedgerEventHandlerVariables? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEventHandlerCreateParams: LedgerEventHandlerCreateParams) = apply {
            ledgerTransactionTemplate = ledgerEventHandlerCreateParams.ledgerTransactionTemplate
            name = ledgerEventHandlerCreateParams.name
            conditions = ledgerEventHandlerCreateParams.conditions
            description = ledgerEventHandlerCreateParams.description
            ledgerId = ledgerEventHandlerCreateParams.ledgerId
            metadata = ledgerEventHandlerCreateParams.metadata
            variables = ledgerEventHandlerCreateParams.variables
            additionalHeaders = ledgerEventHandlerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerEventHandlerCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                ledgerEventHandlerCreateParams.additionalBodyProperties.toMutableMap()
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

            return /* spotless:off */ other is LedgerEventHandlerLedgerTransactionTemplate && description == other.description && effectiveAt == other.effectiveAt && status == other.status && ledgerEntries == other.ledgerEntries && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, effectiveAt, status, ledgerEntries, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

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

        return /* spotless:off */ other is LedgerEventHandlerCreateParams && ledgerTransactionTemplate == other.ledgerTransactionTemplate && name == other.name && conditions == other.conditions && description == other.description && ledgerId == other.ledgerId && metadata == other.metadata && variables == other.variables && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerTransactionTemplate, name, conditions, description, ledgerId, metadata, variables, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "LedgerEventHandlerCreateParams{ledgerTransactionTemplate=$ledgerTransactionTemplate, name=$name, conditions=$conditions, description=$description, ledgerId=$ledgerId, metadata=$metadata, variables=$variables, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
