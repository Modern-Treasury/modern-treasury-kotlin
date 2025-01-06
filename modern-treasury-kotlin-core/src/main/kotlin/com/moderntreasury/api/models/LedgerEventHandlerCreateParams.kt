// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): LedgerEventHandlerCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerEventHandlerCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("ledger_transaction_template")
        private val ledgerTransactionTemplate: LedgerEventHandlerLedgerTransactionTemplate,
        @JsonProperty("name") private val name: String,
        @JsonProperty("conditions") private val conditions: LedgerEventHandlerConditions?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("ledger_id") private val ledgerId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("variables") private val variables: LedgerEventHandlerVariables?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("ledger_transaction_template")
        fun ledgerTransactionTemplate(): LedgerEventHandlerLedgerTransactionTemplate =
            ledgerTransactionTemplate

        /** Name of the ledger event handler. */
        @JsonProperty("name") fun name(): String = name

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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            fun variables(variables: LedgerEventHandlerVariables) = apply {
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

        /** Name of the ledger event handler. */
        fun name(name: String) = apply { body.name(name) }

        fun conditions(conditions: LedgerEventHandlerConditions) = apply {
            body.conditions(conditions)
        }

        /** An optional description. */
        fun description(description: String) = apply { body.description(description) }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = apply { body.ledgerId(ledgerId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        fun variables(variables: LedgerEventHandlerVariables) = apply { body.variables(variables) }

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
        @JsonProperty("description") private val description: String?,
        @JsonProperty("effective_at") private val effectiveAt: String?,
        @JsonProperty("ledger_entries")
        private val ledgerEntries: List<LedgerEventHandlerLedgerEntries>,
        @JsonProperty("status") private val status: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") fun effectiveAt(): String? = effectiveAt

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        fun ledgerEntries(): List<LedgerEventHandlerLedgerEntries> = ledgerEntries

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") fun status(): String? = status

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
            private var ledgerEntries: MutableList<LedgerEventHandlerLedgerEntries>? = null
            private var status: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerEventHandlerLedgerTransactionTemplate:
                    LedgerEventHandlerLedgerTransactionTemplate
            ) = apply {
                description = ledgerEventHandlerLedgerTransactionTemplate.description
                effectiveAt = ledgerEventHandlerLedgerTransactionTemplate.effectiveAt
                ledgerEntries =
                    ledgerEventHandlerLedgerTransactionTemplate.ledgerEntries.toMutableList()
                status = ledgerEventHandlerLedgerTransactionTemplate.status
                additionalProperties =
                    ledgerEventHandlerLedgerTransactionTemplate.additionalProperties.toMutableMap()
            }

            /** An optional description for internal use. */
            fun description(description: String) = apply { this.description = description }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: String) = apply { this.effectiveAt = effectiveAt }

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: List<LedgerEventHandlerLedgerEntries>) = apply {
                this.ledgerEntries = ledgerEntries.toMutableList()
            }

            /** An array of ledger entry objects. */
            fun addLedgerEntry(ledgerEntry: LedgerEventHandlerLedgerEntries) = apply {
                ledgerEntries = (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
            }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: String) = apply { this.status = status }

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
                    description,
                    effectiveAt,
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .toImmutable(),
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class LedgerEventHandlerLedgerEntries
        @JsonCreator
        private constructor(
            @JsonProperty("amount") private val amount: String,
            @JsonProperty("direction") private val direction: String,
            @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The LHS of the conditional. */
            @JsonProperty("amount") fun amount(): String = amount

            /** What the operator between the `field` and `value` is. */
            @JsonProperty("direction") fun direction(): String = direction

            /** The RHS of the conditional. */
            @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

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
                    amount = ledgerEventHandlerLedgerEntries.amount
                    direction = ledgerEventHandlerLedgerEntries.direction
                    ledgerAccountId = ledgerEventHandlerLedgerEntries.ledgerAccountId
                    additionalProperties =
                        ledgerEventHandlerLedgerEntries.additionalProperties.toMutableMap()
                }

                /** The LHS of the conditional. */
                fun amount(amount: String) = apply { this.amount = amount }

                /** What the operator between the `field` and `value` is. */
                fun direction(direction: String) = apply { this.direction = direction }

                /** The RHS of the conditional. */
                fun ledgerAccountId(ledgerAccountId: String) = apply {
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
        @JsonProperty("field") private val field: String,
        @JsonProperty("operator") private val operator: String,
        @JsonProperty("value") private val value: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The LHS of the conditional. */
        @JsonProperty("field") fun field(): String = field

        /** What the operator between the `field` and `value` is. */
        @JsonProperty("operator") fun operator(): String = operator

        /** The RHS of the conditional. */
        @JsonProperty("value") fun value(): String = value

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
                field = ledgerEventHandlerConditions.field
                operator = ledgerEventHandlerConditions.operator
                value = ledgerEventHandlerConditions.value
                additionalProperties =
                    ledgerEventHandlerConditions.additionalProperties.toMutableMap()
            }

            /** The LHS of the conditional. */
            fun field(field: String) = apply { this.field = field }

            /** What the operator between the `field` and `value` is. */
            fun operator(operator: String) = apply { this.operator = operator }

            /** The RHS of the conditional. */
            fun value(value: String) = apply { this.value = value }

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
