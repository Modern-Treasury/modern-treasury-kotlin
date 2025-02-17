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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/** Create a reversal for a payment order. */
class PaymentOrderReversalCreateParams
private constructor(
    private val paymentOrderId: String,
    private val body: PaymentOrderReversalCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The id of the payment order being reversed. */
    fun paymentOrderId(): String = paymentOrderId

    /**
     * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
     * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
     */
    fun reason(): Reason = body.reason()

    /**
     * Specifies a ledger transaction object that will be created with the reversal. If the ledger
     * transaction cannot be created, then the reversal creation will fail. The resulting ledger
     * transaction will mirror the status of the reversal.
     */
    fun ledgerTransaction(): LedgerTransactionCreateRequest? = body.ledgerTransaction()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /**
     * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
     * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
     */
    fun _reason(): JsonField<Reason> = body._reason()

    /**
     * Specifies a ledger transaction object that will be created with the reversal. If the ledger
     * transaction cannot be created, then the reversal creation will fail. The resulting ledger
     * transaction will mirror the status of the reversal.
     */
    fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = body._ledgerTransaction()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): PaymentOrderReversalCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> paymentOrderId
            else -> ""
        }
    }

    @NoAutoDetect
    class PaymentOrderReversalCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("ledger_transaction")
        @ExcludeMissing
        private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        fun ledgerTransaction(): LedgerTransactionCreateRequest? =
            ledgerTransaction.getNullable("ledger_transaction")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        @JsonProperty("ledger_transaction")
        @ExcludeMissing
        fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentOrderReversalCreateBody = apply {
            if (validated) {
                return@apply
            }

            reason()
            ledgerTransaction()?.validate()
            metadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PaymentOrderReversalCreateBody]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentOrderReversalCreateBody: PaymentOrderReversalCreateBody) =
                apply {
                    reason = paymentOrderReversalCreateBody.reason
                    ledgerTransaction = paymentOrderReversalCreateBody.ledgerTransaction
                    metadata = paymentOrderReversalCreateBody.metadata
                    additionalProperties =
                        paymentOrderReversalCreateBody.additionalProperties.toMutableMap()
                }

            /**
             * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
             * `incorrect_receiving_account`, `date_earlier_than_intended`,
             * `date_later_than_intended`.
             */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
             * `incorrect_receiving_account`, `date_earlier_than_intended`,
             * `date_later_than_intended`.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * Specifies a ledger transaction object that will be created with the reversal. If the
             * ledger transaction cannot be created, then the reversal creation will fail. The
             * resulting ledger transaction will mirror the status of the reversal.
             */
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                ledgerTransaction(JsonField.of(ledgerTransaction))

            /**
             * Specifies a ledger transaction object that will be created with the reversal. If the
             * ledger transaction cannot be created, then the reversal creation will fail. The
             * resulting ledger transaction will mirror the status of the reversal.
             */
            fun ledgerTransaction(ledgerTransaction: JsonField<LedgerTransactionCreateRequest>) =
                apply {
                    this.ledgerTransaction = ledgerTransaction
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

            fun build(): PaymentOrderReversalCreateBody =
                PaymentOrderReversalCreateBody(
                    checkRequired("reason", reason),
                    ledgerTransaction,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentOrderReversalCreateBody && reason == other.reason && ledgerTransaction == other.ledgerTransaction && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, ledgerTransaction, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentOrderReversalCreateBody{reason=$reason, ledgerTransaction=$ledgerTransaction, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [PaymentOrderReversalCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var paymentOrderId: String? = null
        private var body: PaymentOrderReversalCreateBody.Builder =
            PaymentOrderReversalCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentOrderReversalCreateParams: PaymentOrderReversalCreateParams) =
            apply {
                paymentOrderId = paymentOrderReversalCreateParams.paymentOrderId
                body = paymentOrderReversalCreateParams.body.toBuilder()
                additionalHeaders = paymentOrderReversalCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    paymentOrderReversalCreateParams.additionalQueryParams.toBuilder()
            }

        /** The id of the payment order being reversed. */
        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
            body.ledgerTransaction(ledgerTransaction)
        }

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        fun ledgerTransaction(ledgerTransaction: JsonField<LedgerTransactionCreateRequest>) =
            apply {
                body.ledgerTransaction(ledgerTransaction)
            }

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

        fun build(): PaymentOrderReversalCreateParams =
            PaymentOrderReversalCreateParams(
                checkRequired("paymentOrderId", paymentOrderId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
     * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
     */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DUPLICATE = of("duplicate")

            val INCORRECT_AMOUNT = of("incorrect_amount")

            val INCORRECT_RECEIVING_ACCOUNT = of("incorrect_receiving_account")

            val DATE_EARLIER_THAN_INTENDED = of("date_earlier_than_intended")

            val DATE_LATER_THAN_INTENDED = of("date_later_than_intended")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                INCORRECT_RECEIVING_ACCOUNT -> Value.INCORRECT_RECEIVING_ACCOUNT
                DATE_EARLIER_THAN_INTENDED -> Value.DATE_EARLIER_THAN_INTENDED
                DATE_LATER_THAN_INTENDED -> Value.DATE_LATER_THAN_INTENDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                DUPLICATE -> Known.DUPLICATE
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                INCORRECT_RECEIVING_ACCOUNT -> Known.INCORRECT_RECEIVING_ACCOUNT
                DATE_EARLIER_THAN_INTENDED -> Known.DATE_EARLIER_THAN_INTENDED
                DATE_LATER_THAN_INTENDED -> Known.DATE_LATER_THAN_INTENDED
                else -> throw ModernTreasuryInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies a ledger transaction object that will be created with the reversal. If the ledger
     * transaction cannot be created, then the reversal creation will fail. The resulting ledger
     * transaction will mirror the status of the reversal.
     */
    @NoAutoDetect
    class LedgerTransactionCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        private val externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        private val ledgerableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An array of ledger entry objects. */
        fun ledgerEntries(): List<LedgerEntryCreateRequest> =
            ledgerEntries.getRequired("ledger_entries")

        /** An optional description for internal use. */
        fun description(): String? = description.getNullable("description")

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(): OffsetDateTime? = effectiveAt.getNullable("effective_at")

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(): Status? = status.getNullable("status")

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

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
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        fun _ledgerableId(): JsonField<String> = ledgerableId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerTransactionCreateRequest = apply {
            if (validated) {
                return@apply
            }

            ledgerEntries().forEach { it.validate() }
            description()
            effectiveAt()
            effectiveDate()
            externalId()
            ledgerableId()
            ledgerableType()
            metadata()?.validate()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LedgerTransactionCreateRequest]. */
        class Builder internal constructor() {

            private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var ledgerableId: JsonField<String> = JsonMissing.of()
            private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                apply {
                    ledgerEntries =
                        ledgerTransactionCreateRequest.ledgerEntries.map { it.toMutableList() }
                    description = ledgerTransactionCreateRequest.description
                    effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                    effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                    externalId = ledgerTransactionCreateRequest.externalId
                    ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                    ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                    metadata = ledgerTransactionCreateRequest.metadata
                    status = ledgerTransactionCreateRequest.status
                    additionalProperties =
                        ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                }

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                ledgerEntries(JsonField.of(ledgerEntries))

            /** An array of ledger entry objects. */
            fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) = apply {
                this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
            }

            /** An array of ledger entry objects. */
            fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                ledgerEntries =
                    (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(ledgerEntry)
                    }
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
            fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                this.ledgerableId = ledgerableId
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(ledgerableType: LedgerableType) =
                ledgerableType(JsonField.of(ledgerableType))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                this.ledgerableType = ledgerableType
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

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: Status) = status(JsonField.of(status))

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): LedgerTransactionCreateRequest =
                LedgerTransactionCreateRequest(
                    checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                    description,
                    effectiveAt,
                    effectiveDate,
                    externalId,
                    ledgerableId,
                    ledgerableType,
                    metadata,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class LedgerEntryCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("available_balance_amount")
            @ExcludeMissing
            private val availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                JsonMissing.of(),
            @JsonProperty("lock_version")
            @ExcludeMissing
            private val lockVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("pending_balance_amount")
            @ExcludeMissing
            private val pendingBalanceAmount: JsonField<PendingBalanceAmount> = JsonMissing.of(),
            @JsonProperty("posted_balance_amount")
            @ExcludeMissing
            private val postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of(),
            @JsonProperty("show_resulting_ledger_account_balances")
            @ExcludeMissing
            private val showResultingLedgerAccountBalances: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(): TransactionDirection = direction.getRequired("direction")

            /** The ledger account that this ledger entry is associated with. */
            fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            fun availableBalanceAmount(): AvailableBalanceAmount? =
                availableBalanceAmount.getNullable("available_balance_amount")

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            fun pendingBalanceAmount(): PendingBalanceAmount? =
                pendingBalanceAmount.getNullable("pending_balance_amount")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            fun postedBalanceAmount(): PostedBalanceAmount? =
                postedBalanceAmount.getNullable("posted_balance_amount")

            /**
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             */
            fun showResultingLedgerAccountBalances(): Boolean? =
                showResultingLedgerAccountBalances.getNullable(
                    "show_resulting_ledger_account_balances"
                )

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<TransactionDirection> = direction

            /** The ledger account that this ledger entry is associated with. */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("available_balance_amount")
            @ExcludeMissing
            fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> =
                availableBalanceAmount

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            @JsonProperty("lock_version")
            @ExcludeMissing
            fun _lockVersion(): JsonField<Long> = lockVersion

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("pending_balance_amount")
            @ExcludeMissing
            fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> = pendingBalanceAmount

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("posted_balance_amount")
            @ExcludeMissing
            fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

            /**
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             */
            @JsonProperty("show_resulting_ledger_account_balances")
            @ExcludeMissing
            fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
                showResultingLedgerAccountBalances

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerEntryCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                direction()
                ledgerAccountId()
                availableBalanceAmount()?.validate()
                lockVersion()
                metadata()?.validate()
                pendingBalanceAmount()?.validate()
                postedBalanceAmount()?.validate()
                showResultingLedgerAccountBalances()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [LedgerEntryCreateRequest]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var direction: JsonField<TransactionDirection>? = null
                private var ledgerAccountId: JsonField<String>? = null
                private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                    JsonMissing.of()
                private var lockVersion: JsonField<Long> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var pendingBalanceAmount: JsonField<PendingBalanceAmount> = JsonMissing.of()
                private var postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of()
                private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                    amount = ledgerEntryCreateRequest.amount
                    direction = ledgerEntryCreateRequest.direction
                    ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                    availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                    lockVersion = ledgerEntryCreateRequest.lockVersion
                    metadata = ledgerEntryCreateRequest.metadata
                    pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                    postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                    showResultingLedgerAccountBalances =
                        ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                    additionalProperties =
                        ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: JsonField<TransactionDirection>) = apply {
                    this.direction = direction
                }

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(JsonField.of(ledgerAccountId))

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                    availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(
                    availableBalanceAmount: JsonField<AvailableBalanceAmount>
                ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: Long?) = lockVersion(JsonField.ofNullable(lockVersion))

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: JsonField<Long>) = apply {
                    this.lockVersion = lockVersion
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

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                    pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(pendingBalanceAmount: JsonField<PendingBalanceAmount>) =
                    apply {
                        this.pendingBalanceAmount = pendingBalanceAmount
                    }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                    postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) =
                    apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean?
                ) =
                    showResultingLedgerAccountBalances(
                        JsonField.ofNullable(showResultingLedgerAccountBalances)
                    )

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean
                ) =
                    showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances as Boolean?
                    )

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: JsonField<Boolean>
                ) = apply {
                    this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
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

                fun build(): LedgerEntryCreateRequest =
                    LedgerEntryCreateRequest(
                        checkRequired("amount", amount),
                        checkRequired("direction", direction),
                        checkRequired("ledgerAccountId", ledgerAccountId),
                        availableBalanceAmount,
                        lockVersion,
                        metadata,
                        pendingBalanceAmount,
                        postedBalanceAmount,
                        showResultingLedgerAccountBalances,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @NoAutoDetect
            class AvailableBalanceAmount
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AvailableBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [AvailableBalanceAmount]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                        additionalProperties =
                            availableBalanceAmount.additionalProperties.toMutableMap()
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

                    fun build(): AvailableBalanceAmount =
                        AvailableBalanceAmount(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @NoAutoDetect
            class PendingBalanceAmount
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PendingBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [PendingBalanceAmount]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                        additionalProperties =
                            pendingBalanceAmount.additionalProperties.toMutableMap()
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

                    fun build(): PendingBalanceAmount =
                        PendingBalanceAmount(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PendingBalanceAmount{additionalProperties=$additionalProperties}"
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @NoAutoDetect
            class PostedBalanceAmount
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PostedBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [PostedBalanceAmount]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                        additionalProperties =
                            postedBalanceAmount.additionalProperties.toMutableMap()
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

                    fun build(): PostedBalanceAmount =
                        PostedBalanceAmount(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PostedBalanceAmount{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
        }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        class LedgerableType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EXPECTED_PAYMENT = of("expected_payment")

                val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

                val PAPER_ITEM = of("paper_item")

                val PAYMENT_ORDER = of("payment_order")

                val RETURN = of("return")

                val REVERSAL = of("reversal")

                fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            /** An enum containing [LedgerableType]'s known values. */
            enum class Known {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
            }

            /**
             * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
                /**
                 * An enum member indicating that [LedgerableType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                    PAPER_ITEM -> Value.PAPER_ITEM
                    PAYMENT_ORDER -> Value.PAYMENT_ORDER
                    RETURN -> Value.RETURN
                    REVERSAL -> Value.REVERSAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                    PAPER_ITEM -> Known.PAPER_ITEM
                    PAYMENT_ORDER -> Known.PAYMENT_ORDER
                    RETURN -> Known.RETURN
                    REVERSAL -> Known.REVERSAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

        /** To post a ledger transaction at creation, use `posted`. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARCHIVED = of("archived")

                val PENDING = of("pending")

                val POSTED = of("posted")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ARCHIVED,
                PENDING,
                POSTED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARCHIVED,
                PENDING,
                POSTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ARCHIVED -> Value.ARCHIVED
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ARCHIVED -> Known.ARCHIVED
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is PaymentOrderReversalCreateParams && paymentOrderId == other.paymentOrderId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrderId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentOrderReversalCreateParams{paymentOrderId=$paymentOrderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
