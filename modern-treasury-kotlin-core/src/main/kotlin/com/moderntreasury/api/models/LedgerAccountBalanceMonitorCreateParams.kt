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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects

/** Create a ledger account balance monitor. */
class LedgerAccountBalanceMonitorCreateParams
private constructor(
    private val body: LedgerAccountBalanceMonitorCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    fun alertCondition(): AlertConditionCreateRequest = body.alertCondition()

    /** The ledger account associated with this balance monitor. */
    fun ledgerAccountId(): String = body.ledgerAccountId()

    /** An optional, free-form description for internal use. */
    fun description(): String? = body.description()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    fun _alertCondition(): JsonField<AlertConditionCreateRequest> = body._alertCondition()

    /** The ledger account associated with this balance monitor. */
    fun _ledgerAccountId(): JsonField<String> = body._ledgerAccountId()

    /** An optional, free-form description for internal use. */
    fun _description(): JsonField<String> = body._description()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): LedgerAccountBalanceMonitorCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class LedgerAccountBalanceMonitorCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("alert_condition")
        @ExcludeMissing
        private val alertCondition: JsonField<AlertConditionCreateRequest> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(): AlertConditionCreateRequest =
            alertCondition.getRequired("alert_condition")

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

        /** An optional, free-form description for internal use. */
        fun description(): String? = description.getNullable("description")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        @JsonProperty("alert_condition")
        @ExcludeMissing
        fun _alertCondition(): JsonField<AlertConditionCreateRequest> = alertCondition

        /** The ledger account associated with this balance monitor. */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

        /** An optional, free-form description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerAccountBalanceMonitorCreateRequest = apply {
            if (validated) {
                return@apply
            }

            alertCondition().validate()
            ledgerAccountId()
            description()
            metadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LedgerAccountBalanceMonitorCreateRequest]. */
        class Builder internal constructor() {

            private var alertCondition: JsonField<AlertConditionCreateRequest>? = null
            private var ledgerAccountId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                ledgerAccountBalanceMonitorCreateRequest: LedgerAccountBalanceMonitorCreateRequest
            ) = apply {
                alertCondition = ledgerAccountBalanceMonitorCreateRequest.alertCondition
                ledgerAccountId = ledgerAccountBalanceMonitorCreateRequest.ledgerAccountId
                description = ledgerAccountBalanceMonitorCreateRequest.description
                metadata = ledgerAccountBalanceMonitorCreateRequest.metadata
                additionalProperties =
                    ledgerAccountBalanceMonitorCreateRequest.additionalProperties.toMutableMap()
            }

            /** Describes the condition that must be satisfied for the monitor to be triggered. */
            fun alertCondition(alertCondition: AlertConditionCreateRequest) =
                alertCondition(JsonField.of(alertCondition))

            /** Describes the condition that must be satisfied for the monitor to be triggered. */
            fun alertCondition(alertCondition: JsonField<AlertConditionCreateRequest>) = apply {
                this.alertCondition = alertCondition
            }

            /** The ledger account associated with this balance monitor. */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /** The ledger account associated with this balance monitor. */
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /** An optional, free-form description for internal use. */
            fun description(description: String) = description(JsonField.of(description))

            /** An optional, free-form description for internal use. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun build(): LedgerAccountBalanceMonitorCreateRequest =
                LedgerAccountBalanceMonitorCreateRequest(
                    checkRequired("alertCondition", alertCondition),
                    checkRequired("ledgerAccountId", ledgerAccountId),
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountBalanceMonitorCreateRequest && alertCondition == other.alertCondition && ledgerAccountId == other.ledgerAccountId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alertCondition, ledgerAccountId, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountBalanceMonitorCreateRequest{alertCondition=$alertCondition, ledgerAccountId=$ledgerAccountId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountBalanceMonitorCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: LedgerAccountBalanceMonitorCreateRequest.Builder =
            LedgerAccountBalanceMonitorCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            ledgerAccountBalanceMonitorCreateParams: LedgerAccountBalanceMonitorCreateParams
        ) = apply {
            body = ledgerAccountBalanceMonitorCreateParams.body.toBuilder()
            additionalHeaders =
                ledgerAccountBalanceMonitorCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                ledgerAccountBalanceMonitorCreateParams.additionalQueryParams.toBuilder()
        }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: AlertConditionCreateRequest) = apply {
            body.alertCondition(alertCondition)
        }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: JsonField<AlertConditionCreateRequest>) = apply {
            body.alertCondition(alertCondition)
        }

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: String) = apply {
            body.ledgerAccountId(ledgerAccountId)
        }

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            body.ledgerAccountId(ledgerAccountId)
        }

        /** An optional, free-form description for internal use. */
        fun description(description: String) = apply { body.description(description) }

        /** An optional, free-form description for internal use. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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

        fun build(): LedgerAccountBalanceMonitorCreateParams =
            LedgerAccountBalanceMonitorCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @NoAutoDetect
    class AlertConditionCreateRequest
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
        private val value: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         */
        fun field(): String = field.getRequired("field")

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        fun operator(): String = operator.getRequired("operator")

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        fun value(): Long = value.getRequired("value")

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AlertConditionCreateRequest = apply {
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

        /** A builder for [AlertConditionCreateRequest]. */
        class Builder internal constructor() {

            private var field: JsonField<String>? = null
            private var operator: JsonField<String>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertConditionCreateRequest: AlertConditionCreateRequest) = apply {
                field = alertConditionCreateRequest.field
                operator = alertConditionCreateRequest.operator
                value = alertConditionCreateRequest.value
                additionalProperties =
                    alertConditionCreateRequest.additionalProperties.toMutableMap()
            }

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            fun build(): AlertConditionCreateRequest =
                AlertConditionCreateRequest(
                    checkRequired("field", field),
                    checkRequired("operator", operator),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertConditionCreateRequest && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertConditionCreateRequest{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitorCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
