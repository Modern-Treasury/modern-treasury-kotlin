// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

class PaymentOrderReversalCreateParams
constructor(
    private val paymentOrderId: String,
    private val reason: Reason,
    private val ledgerTransaction: LedgerTransactionCreateRequest?,
    private val metadata: Metadata?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun paymentOrderId(): String = paymentOrderId

    fun reason(): Reason = reason

    fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

    fun metadata(): Metadata? = metadata

    internal fun getBody(): PaymentOrderReversalCreateBody {
        return PaymentOrderReversalCreateBody(
            reason,
            ledgerTransaction,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> paymentOrderId
            else -> ""
        }
    }

    @JsonDeserialize(builder = PaymentOrderReversalCreateBody.Builder::class)
    @NoAutoDetect
    class PaymentOrderReversalCreateBody
    internal constructor(
        private val reason: Reason?,
        private val ledgerTransaction: LedgerTransactionCreateRequest?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        @JsonProperty("reason") fun reason(): Reason? = reason

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        @JsonProperty("ledger_transaction")
        fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentOrderReversalCreateBody &&
                this.reason == other.reason &&
                this.ledgerTransaction == other.ledgerTransaction &&
                this.metadata == other.metadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        reason,
                        ledgerTransaction,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentOrderReversalCreateBody{reason=$reason, ledgerTransaction=$ledgerTransaction, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var ledgerTransaction: LedgerTransactionCreateRequest? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentOrderReversalCreateBody: PaymentOrderReversalCreateBody) =
                apply {
                    this.reason = paymentOrderReversalCreateBody.reason
                    this.ledgerTransaction = paymentOrderReversalCreateBody.ledgerTransaction
                    this.metadata = paymentOrderReversalCreateBody.metadata
                    additionalProperties(paymentOrderReversalCreateBody.additionalProperties)
                }

            /**
             * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
             * `incorrect_receiving_account`, `date_earlier_than_intended`,
             * `date_later_than_intended`.
             */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

            /**
             * Specifies a ledger transaction object that will be created with the reversal. If the
             * ledger transaction cannot be created, then the reversal creation will fail. The
             * resulting ledger transaction will mirror the status of the reversal.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
                this.ledgerTransaction = ledgerTransaction
            }

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

            fun build(): PaymentOrderReversalCreateBody =
                PaymentOrderReversalCreateBody(
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    ledgerTransaction,
                    metadata,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderReversalCreateParams &&
            this.paymentOrderId == other.paymentOrderId &&
            this.reason == other.reason &&
            this.ledgerTransaction == other.ledgerTransaction &&
            this.metadata == other.metadata &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            paymentOrderId,
            reason,
            ledgerTransaction,
            metadata,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentOrderReversalCreateParams{paymentOrderId=$paymentOrderId, reason=$reason, ledgerTransaction=$ledgerTransaction, metadata=$metadata, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var paymentOrderId: String? = null
        private var reason: Reason? = null
        private var ledgerTransaction: LedgerTransactionCreateRequest? = null
        private var metadata: Metadata? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentOrderReversalCreateParams: PaymentOrderReversalCreateParams) =
            apply {
                this.paymentOrderId = paymentOrderReversalCreateParams.paymentOrderId
                this.reason = paymentOrderReversalCreateParams.reason
                this.ledgerTransaction = paymentOrderReversalCreateParams.ledgerTransaction
                this.metadata = paymentOrderReversalCreateParams.metadata
                additionalQueryParams(paymentOrderReversalCreateParams.additionalQueryParams)
                additionalHeaders(paymentOrderReversalCreateParams.additionalHeaders)
                additionalBodyProperties(paymentOrderReversalCreateParams.additionalBodyProperties)
            }

        /** The id of the payment order being reversed. */
        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

        /**
         * The reason for the reversal. Must be one of `duplicate`, `incorrect_amount`,
         * `incorrect_receiving_account`, `date_earlier_than_intended`, `date_later_than_intended`.
         */
        fun reason(reason: Reason) = apply { this.reason = reason }

        /**
         * Specifies a ledger transaction object that will be created with the reversal. If the
         * ledger transaction cannot be created, then the reversal creation will fail. The resulting
         * ledger transaction will mirror the status of the reversal.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
            this.ledgerTransaction = ledgerTransaction
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

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

        fun build(): PaymentOrderReversalCreateParams =
            PaymentOrderReversalCreateParams(
                checkNotNull(paymentOrderId) { "`paymentOrderId` is required but was not set" },
                checkNotNull(reason) { "`reason` is required but was not set" },
                ledgerTransaction,
                metadata,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DUPLICATE = Reason(JsonField.of("duplicate"))

            val INCORRECT_AMOUNT = Reason(JsonField.of("incorrect_amount"))

            val INCORRECT_RECEIVING_ACCOUNT = Reason(JsonField.of("incorrect_receiving_account"))

            val DATE_EARLIER_THAN_INTENDED = Reason(JsonField.of("date_earlier_than_intended"))

            val DATE_LATER_THAN_INTENDED = Reason(JsonField.of("date_later_than_intended"))

            fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
        }

        enum class Value {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                INCORRECT_RECEIVING_ACCOUNT -> Value.INCORRECT_RECEIVING_ACCOUNT
                DATE_EARLIER_THAN_INTENDED -> Value.DATE_EARLIER_THAN_INTENDED
                DATE_LATER_THAN_INTENDED -> Value.DATE_LATER_THAN_INTENDED
                else -> Value._UNKNOWN
            }

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
    }

    /**
     * Specifies a ledger transaction object that will be created with the reversal. If the ledger
     * transaction cannot be created, then the reversal creation will fail. The resulting ledger
     * transaction will mirror the status of the reversal.
     */
    @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
    @NoAutoDetect
    class LedgerTransactionCreateRequest
    private constructor(
        private val description: String?,
        private val status: Status?,
        private val metadata: Metadata?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveDate: LocalDate?,
        private val ledgerEntries: List<LedgerEntryCreateRequest>?,
        private val externalId: String?,
        private val ledgerableType: LedgerableType?,
        private val ledgerableId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        fun ledgerEntries(): List<LedgerEntryCreateRequest>? = ledgerEntries

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, or reversal.
         */
        @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerTransactionCreateRequest &&
                this.description == other.description &&
                this.status == other.status &&
                this.metadata == other.metadata &&
                this.effectiveAt == other.effectiveAt &&
                this.effectiveDate == other.effectiveDate &&
                this.ledgerEntries == other.ledgerEntries &&
                this.externalId == other.externalId &&
                this.ledgerableType == other.ledgerableType &&
                this.ledgerableId == other.ledgerableId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        effectiveDate,
                        ledgerEntries,
                        externalId,
                        ledgerableType,
                        ledgerableId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var status: Status? = null
            private var metadata: Metadata? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveDate: LocalDate? = null
            private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
            private var externalId: String? = null
            private var ledgerableType: LedgerableType? = null
            private var ledgerableId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                apply {
                    this.description = ledgerTransactionCreateRequest.description
                    this.status = ledgerTransactionCreateRequest.status
                    this.metadata = ledgerTransactionCreateRequest.metadata
                    this.effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                    this.effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                    this.ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries
                    this.externalId = ledgerTransactionCreateRequest.externalId
                    this.ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                    this.ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                    additionalProperties(ledgerTransactionCreateRequest.additionalProperties)
                }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                this.ledgerEntries = ledgerEntries
            }

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id")
            fun externalId(externalId: String) = apply { this.externalId = externalId }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, or reversal.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(ledgerableType: LedgerableType) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

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

            fun build(): LedgerTransactionCreateRequest =
                LedgerTransactionCreateRequest(
                    description,
                    status,
                    metadata,
                    effectiveAt,
                    effectiveDate,
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .toUnmodifiable(),
                    externalId,
                    ledgerableType,
                    ledgerableId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerEntryCreateRequest
        private constructor(
            private val amount: Long?,
            private val direction: TransactionDirection?,
            private val ledgerAccountId: String?,
            private val lockVersion: Long?,
            private val pendingBalanceAmount: PendingBalanceAmount?,
            private val postedBalanceAmount: PostedBalanceAmount?,
            private val availableBalanceAmount: AvailableBalanceAmount?,
            private val showResultingLedgerAccountBalances: Boolean?,
            private val metadata: Metadata?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            @JsonProperty("amount") fun amount(): Long? = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): TransactionDirection? = direction

            /** The ledger account that this ledger entry is associated with. */
            @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("pending_balance_amount")
            fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("posted_balance_amount")
            fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("available_balance_amount")
            fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

            /**
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             */
            @JsonProperty("show_resulting_ledger_account_balances")
            fun showResultingLedgerAccountBalances(): Boolean? = showResultingLedgerAccountBalances

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerEntryCreateRequest &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.ledgerAccountId == other.ledgerAccountId &&
                    this.lockVersion == other.lockVersion &&
                    this.pendingBalanceAmount == other.pendingBalanceAmount &&
                    this.postedBalanceAmount == other.postedBalanceAmount &&
                    this.availableBalanceAmount == other.availableBalanceAmount &&
                    this.showResultingLedgerAccountBalances ==
                        other.showResultingLedgerAccountBalances &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            direction,
                            ledgerAccountId,
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var direction: TransactionDirection? = null
                private var ledgerAccountId: String? = null
                private var lockVersion: Long? = null
                private var pendingBalanceAmount: PendingBalanceAmount? = null
                private var postedBalanceAmount: PostedBalanceAmount? = null
                private var availableBalanceAmount: AvailableBalanceAmount? = null
                private var showResultingLedgerAccountBalances: Boolean? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                    this.amount = ledgerEntryCreateRequest.amount
                    this.direction = ledgerEntryCreateRequest.direction
                    this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                    this.lockVersion = ledgerEntryCreateRequest.lockVersion
                    this.pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                    this.postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                    this.availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                    this.showResultingLedgerAccountBalances =
                        ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                    this.metadata = ledgerEntryCreateRequest.metadata
                    additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                fun direction(direction: TransactionDirection) = apply {
                    this.direction = direction
                }

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                fun ledgerAccountId(ledgerAccountId: String) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                fun lockVersion(lockVersion: Long) = apply { this.lockVersion = lockVersion }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) = apply {
                    this.pendingBalanceAmount = pendingBalanceAmount
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                    this.postedBalanceAmount = postedBalanceAmount
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) = apply {
                    this.availableBalanceAmount = availableBalanceAmount
                }

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean
                ) = apply {
                    this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerEntryCreateRequest =
                    LedgerEntryCreateRequest(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(ledgerAccountId) {
                            "`ledgerAccountId` is required but was not set"
                        },
                        lockVersion,
                        pendingBalanceAmount,
                        postedBalanceAmount,
                        availableBalanceAmount,
                        showResultingLedgerAccountBalances,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
            @NoAutoDetect
            class AvailableBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AvailableBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                        additionalProperties(availableBalanceAmount.additionalProperties)
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

                    fun build(): AvailableBalanceAmount =
                        AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
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

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
            @NoAutoDetect
            class PendingBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PendingBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                        additionalProperties(pendingBalanceAmount.additionalProperties)
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

                    fun build(): PendingBalanceAmount =
                        PendingBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
            @NoAutoDetect
            class PostedBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PostedBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                        additionalProperties(postedBalanceAmount.additionalProperties)
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

                    fun build(): PostedBalanceAmount =
                        PostedBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }
        }

        class LedgerableType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerableType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                val INCOMING_PAYMENT_DETAIL =
                    LedgerableType(JsonField.of("incoming_payment_detail"))

                val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

                val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                val PAYMENT_ORDER_ATTEMPT = LedgerableType(JsonField.of("payment_order_attempt"))

                val RETURN = LedgerableType(JsonField.of("return"))

                val REVERSAL = LedgerableType(JsonField.of("reversal"))

                fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            enum class Known {
                COUNTERPARTY,
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                INTERNAL_ACCOUNT,
                LINE_ITEM,
                PAPER_ITEM,
                PAYMENT_ORDER,
                PAYMENT_ORDER_ATTEMPT,
                RETURN,
                REVERSAL,
            }

            enum class Value {
                COUNTERPARTY,
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                INTERNAL_ACCOUNT,
                LINE_ITEM,
                PAPER_ITEM,
                PAYMENT_ORDER,
                PAYMENT_ORDER_ATTEMPT,
                RETURN,
                REVERSAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COUNTERPARTY -> Value.COUNTERPARTY
                    EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                    INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                    LINE_ITEM -> Value.LINE_ITEM
                    PAPER_ITEM -> Value.PAPER_ITEM
                    PAYMENT_ORDER -> Value.PAYMENT_ORDER
                    PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                    RETURN -> Value.RETURN
                    REVERSAL -> Value.REVERSAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COUNTERPARTY -> Known.COUNTERPARTY
                    EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                    INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                    LINE_ITEM -> Known.LINE_ITEM
                    PAPER_ITEM -> Known.PAPER_ITEM
                    PAYMENT_ORDER -> Known.PAYMENT_ORDER
                    PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                    RETURN -> Known.RETURN
                    REVERSAL -> Known.REVERSAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ARCHIVED = Status(JsonField.of("archived"))

                val PENDING = Status(JsonField.of("pending"))

                val POSTED = Status(JsonField.of("posted"))

                fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ARCHIVED,
                PENDING,
                POSTED,
            }

            enum class Value {
                ARCHIVED,
                PENDING,
                POSTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ARCHIVED -> Value.ARCHIVED
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ARCHIVED -> Known.ARCHIVED
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
