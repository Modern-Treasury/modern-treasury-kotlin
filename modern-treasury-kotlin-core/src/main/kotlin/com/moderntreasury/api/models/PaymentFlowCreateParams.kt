// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** create payment_flow */
class PaymentFlowCreateParams
constructor(
    private val body: PaymentFlowCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * Required. Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     * Can be any integer up to 36 digits.
     */
    fun amount(): Long = body.amount()

    /**
     * Required. The ID of a counterparty associated with the payment. As part of the payment
     * workflow an external account will be associated with this model.
     */
    fun counterpartyId(): String = body.counterpartyId()

    /** Required. The currency of the payment. */
    fun currency(): String = body.currency()

    /**
     * Required. Describes the direction money is flowing in the transaction. Can only be `debit`. A
     * `debit` pulls money from someone else's account to your own.
     */
    fun direction(): Direction = body.direction()

    /** Required. The ID of one of your organization's internal accounts. */
    fun originatingAccountId(): String = body.originatingAccountId()

    /**
     * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When set,
     * the due date is shown to your end-user in the pre-built UI as they are selecting a payment
     * `effective_date`.
     */
    fun dueDate(): LocalDate? = body.dueDate()

    /**
     * Required. Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     * Can be any integer up to 36 digits.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Required. The ID of a counterparty associated with the payment. As part of the payment
     * workflow an external account will be associated with this model.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /** Required. The currency of the payment. */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Required. Describes the direction money is flowing in the transaction. Can only be `debit`. A
     * `debit` pulls money from someone else's account to your own.
     */
    fun _direction(): JsonField<Direction> = body._direction()

    /** Required. The ID of one of your organization's internal accounts. */
    fun _originatingAccountId(): JsonField<String> = body._originatingAccountId()

    /**
     * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When set,
     * the due date is shown to your end-user in the pre-built UI as they are selecting a payment
     * `effective_date`.
     */
    fun _dueDate(): JsonField<LocalDate> = body._dueDate()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): PaymentFlowCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PaymentFlowCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        private val counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        private val originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("due_date")
        @ExcludeMissing
        private val dueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

        /** Required. The currency of the payment. */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        fun direction(): Direction = direction.getRequired("direction")

        /** Required. The ID of one of your organization's internal accounts. */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /** Required. The currency of the payment. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /** Required. The ID of one of your organization's internal accounts. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentFlowCreateBody = apply {
            if (!validated) {
                amount()
                counterpartyId()
                currency()
                direction()
                originatingAccountId()
                dueDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long>? = null
            private var counterpartyId: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var direction: JsonField<Direction>? = null
            private var originatingAccountId: JsonField<String>? = null
            private var dueDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentFlowCreateBody: PaymentFlowCreateBody) = apply {
                amount = paymentFlowCreateBody.amount
                counterpartyId = paymentFlowCreateBody.counterpartyId
                currency = paymentFlowCreateBody.currency
                direction = paymentFlowCreateBody.direction
                originatingAccountId = paymentFlowCreateBody.originatingAccountId
                dueDate = paymentFlowCreateBody.dueDate
                additionalProperties = paymentFlowCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
             * as 1000. Can be any integer up to 36 digits.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
             * as 1000. Can be any integer up to 36 digits.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Required. The ID of a counterparty associated with the payment. As part of the
             * payment workflow an external account will be associated with this model.
             */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

            /**
             * Required. The ID of a counterparty associated with the payment. As part of the
             * payment workflow an external account will be associated with this model.
             */
            fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Required. The currency of the payment. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** Required. The currency of the payment. */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Required. Describes the direction money is flowing in the transaction. Can only be
             * `debit`. A `debit` pulls money from someone else's account to your own.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Required. Describes the direction money is flowing in the transaction. Can only be
             * `debit`. A `debit` pulls money from someone else's account to your own.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /** Required. The ID of one of your organization's internal accounts. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /** Required. The ID of one of your organization's internal accounts. */
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`.
             * When set, the due date is shown to your end-user in the pre-built UI as they are
             * selecting a payment `effective_date`.
             */
            fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

            /**
             * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`.
             * When set, the due date is shown to your end-user in the pre-built UI as they are
             * selecting a payment `effective_date`.
             */
            fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

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

            fun build(): PaymentFlowCreateBody =
                PaymentFlowCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(counterpartyId) { "`counterpartyId` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    dueDate,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentFlowCreateBody && amount == other.amount && counterpartyId == other.counterpartyId && currency == other.currency && direction == other.direction && originatingAccountId == other.originatingAccountId && dueDate == other.dueDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, counterpartyId, currency, direction, originatingAccountId, dueDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentFlowCreateBody{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: PaymentFlowCreateBody.Builder = PaymentFlowCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentFlowCreateParams: PaymentFlowCreateParams) = apply {
            body = paymentFlowCreateParams.body.toBuilder()
            additionalHeaders = paymentFlowCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentFlowCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** Required. The currency of the payment. */
        fun currency(currency: String) = apply { body.currency(currency) }

        /** Required. The currency of the payment. */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /** Required. The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /** Required. The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        fun dueDate(dueDate: LocalDate) = apply { body.dueDate(dueDate) }

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { body.dueDate(dueDate) }

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

        fun build(): PaymentFlowCreateParams =
            PaymentFlowCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentFlowCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
