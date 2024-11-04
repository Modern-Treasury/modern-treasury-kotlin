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

class LedgerAccountBalanceMonitorCreateParams
constructor(
    private val alertCondition: AlertConditionCreateRequest,
    private val ledgerAccountId: String,
    private val description: String?,
    private val metadata: Metadata?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun alertCondition(): AlertConditionCreateRequest = alertCondition

    fun ledgerAccountId(): String = ledgerAccountId

    fun description(): String? = description

    fun metadata(): Metadata? = metadata

    internal fun getBody(): LedgerAccountBalanceMonitorCreateBody {
        return LedgerAccountBalanceMonitorCreateBody(
            alertCondition,
            ledgerAccountId,
            description,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = LedgerAccountBalanceMonitorCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountBalanceMonitorCreateBody
    internal constructor(
        private val alertCondition: AlertConditionCreateRequest?,
        private val ledgerAccountId: String?,
        private val description: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        @JsonProperty("alert_condition")
        fun alertCondition(): AlertConditionCreateRequest? = alertCondition

        /** The ledger account associated with this balance monitor. */
        @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

        /** An optional, free-form description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var alertCondition: AlertConditionCreateRequest? = null
            private var ledgerAccountId: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountBalanceMonitorCreateBody: LedgerAccountBalanceMonitorCreateBody
            ) = apply {
                this.alertCondition = ledgerAccountBalanceMonitorCreateBody.alertCondition
                this.ledgerAccountId = ledgerAccountBalanceMonitorCreateBody.ledgerAccountId
                this.description = ledgerAccountBalanceMonitorCreateBody.description
                this.metadata = ledgerAccountBalanceMonitorCreateBody.metadata
                additionalProperties(ledgerAccountBalanceMonitorCreateBody.additionalProperties)
            }

            /** Describes the condition that must be satisfied for the monitor to be triggered. */
            @JsonProperty("alert_condition")
            fun alertCondition(alertCondition: AlertConditionCreateRequest) = apply {
                this.alertCondition = alertCondition
            }

            /** The ledger account associated with this balance monitor. */
            @JsonProperty("ledger_account_id")
            fun ledgerAccountId(ledgerAccountId: String) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /** An optional, free-form description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): LedgerAccountBalanceMonitorCreateBody =
                LedgerAccountBalanceMonitorCreateBody(
                    checkNotNull(alertCondition) { "`alertCondition` is required but was not set" },
                    checkNotNull(ledgerAccountId) {
                        "`ledgerAccountId` is required but was not set"
                    },
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountBalanceMonitorCreateBody && this.alertCondition == other.alertCondition && this.ledgerAccountId == other.ledgerAccountId && this.description == other.description && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(alertCondition, ledgerAccountId, description, metadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountBalanceMonitorCreateBody{alertCondition=$alertCondition, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitorCreateParams && this.alertCondition == other.alertCondition && this.ledgerAccountId == other.ledgerAccountId && this.description == other.description && this.metadata == other.metadata && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(alertCondition, ledgerAccountId, description, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountBalanceMonitorCreateParams{alertCondition=$alertCondition, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var alertCondition: AlertConditionCreateRequest? = null
        private var ledgerAccountId: String? = null
        private var description: String? = null
        private var metadata: Metadata? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerAccountBalanceMonitorCreateParams: LedgerAccountBalanceMonitorCreateParams
        ) = apply {
            this.alertCondition = ledgerAccountBalanceMonitorCreateParams.alertCondition
            this.ledgerAccountId = ledgerAccountBalanceMonitorCreateParams.ledgerAccountId
            this.description = ledgerAccountBalanceMonitorCreateParams.description
            this.metadata = ledgerAccountBalanceMonitorCreateParams.metadata
            additionalHeaders(ledgerAccountBalanceMonitorCreateParams.additionalHeaders)
            additionalQueryParams(ledgerAccountBalanceMonitorCreateParams.additionalQueryParams)
            additionalBodyProperties(
                ledgerAccountBalanceMonitorCreateParams.additionalBodyProperties
            )
        }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: AlertConditionCreateRequest) = apply {
            this.alertCondition = alertCondition
        }

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** An optional, free-form description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

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

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): LedgerAccountBalanceMonitorCreateParams =
            LedgerAccountBalanceMonitorCreateParams(
                checkNotNull(alertCondition) { "`alertCondition` is required but was not set" },
                checkNotNull(ledgerAccountId) { "`ledgerAccountId` is required but was not set" },
                description,
                metadata,
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

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @JsonDeserialize(builder = AlertConditionCreateRequest.Builder::class)
    @NoAutoDetect
    class AlertConditionCreateRequest
    private constructor(
        private val field: String?,
        private val operator: String?,
        private val value: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         */
        @JsonProperty("field") fun field(): String? = field

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        @JsonProperty("operator") fun operator(): String? = operator

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        @JsonProperty("value") fun value(): Long? = value

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
            private var value: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertConditionCreateRequest: AlertConditionCreateRequest) = apply {
                this.field = alertConditionCreateRequest.field
                this.operator = alertConditionCreateRequest.operator
                this.value = alertConditionCreateRequest.value
                additionalProperties(alertConditionCreateRequest.additionalProperties)
            }

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            @JsonProperty("field") fun field(field: String) = apply { this.field = field }

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            @JsonProperty("operator")
            fun operator(operator: String) = apply { this.operator = operator }

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            @JsonProperty("value") fun value(value: Long) = apply { this.value = value }

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

            fun build(): AlertConditionCreateRequest =
                AlertConditionCreateRequest(
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

            return /* spotless:off */ other is AlertConditionCreateRequest && this.field == other.field && this.operator == other.operator && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(field, operator, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AlertConditionCreateRequest{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
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
}
