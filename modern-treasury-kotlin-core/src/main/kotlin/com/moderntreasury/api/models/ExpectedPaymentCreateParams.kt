// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
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

class ExpectedPaymentCreateParams
constructor(
    private val amountLowerBound: Long,
    private val amountUpperBound: Long,
    private val direction: TransactionDirection,
    private val internalAccountId: String,
    private val counterpartyId: String?,
    private val currency: Currency?,
    private val dateLowerBound: LocalDate?,
    private val dateUpperBound: LocalDate?,
    private val description: String?,
    private val ledgerTransaction: LedgerTransactionCreateRequest?,
    private val ledgerTransactionId: String?,
    private val lineItems: List<LineItemRequest>?,
    private val metadata: Metadata?,
    private val reconciliationFilters: JsonValue?,
    private val reconciliationGroups: JsonValue?,
    private val reconciliationRuleVariables: List<ReconciliationRuleVariable>?,
    private val remittanceInformation: String?,
    private val statementDescriptor: String?,
    private val type: ExpectedPaymentType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amountLowerBound(): Long = amountLowerBound

    fun amountUpperBound(): Long = amountUpperBound

    fun direction(): TransactionDirection = direction

    fun internalAccountId(): String = internalAccountId

    fun counterpartyId(): String? = counterpartyId

    fun currency(): Currency? = currency

    fun dateLowerBound(): LocalDate? = dateLowerBound

    fun dateUpperBound(): LocalDate? = dateUpperBound

    fun description(): String? = description

    fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

    fun ledgerTransactionId(): String? = ledgerTransactionId

    fun lineItems(): List<LineItemRequest>? = lineItems

    fun metadata(): Metadata? = metadata

    fun reconciliationFilters(): JsonValue? = reconciliationFilters

    fun reconciliationGroups(): JsonValue? = reconciliationGroups

    fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
        reconciliationRuleVariables

    fun remittanceInformation(): String? = remittanceInformation

    fun statementDescriptor(): String? = statementDescriptor

    fun type(): ExpectedPaymentType? = type

    internal fun getBody(): ExpectedPaymentCreateBody {
        return ExpectedPaymentCreateBody(
            amountLowerBound,
            amountUpperBound,
            direction,
            internalAccountId,
            counterpartyId,
            currency,
            dateLowerBound,
            dateUpperBound,
            description,
            ledgerTransaction,
            ledgerTransactionId,
            lineItems,
            metadata,
            reconciliationFilters,
            reconciliationGroups,
            reconciliationRuleVariables,
            remittanceInformation,
            statementDescriptor,
            type,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExpectedPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class ExpectedPaymentCreateBody
    internal constructor(
        private val amountLowerBound: Long?,
        private val amountUpperBound: Long?,
        private val direction: TransactionDirection?,
        private val internalAccountId: String?,
        private val counterpartyId: String?,
        private val currency: Currency?,
        private val dateLowerBound: LocalDate?,
        private val dateUpperBound: LocalDate?,
        private val description: String?,
        private val ledgerTransaction: LedgerTransactionCreateRequest?,
        private val ledgerTransactionId: String?,
        private val lineItems: List<LineItemRequest>?,
        private val metadata: Metadata?,
        private val reconciliationFilters: JsonValue?,
        private val reconciliationGroups: JsonValue?,
        private val reconciliationRuleVariables: List<ReconciliationRuleVariable>?,
        private val remittanceInformation: String?,
        private val statementDescriptor: String?,
        private val type: ExpectedPaymentType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_lower_bound") fun amountLowerBound(): Long? = amountLowerBound

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_upper_bound") fun amountUpperBound(): Long? = amountUpperBound

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        @JsonProperty("direction") fun direction(): TransactionDirection? = direction

        /** The ID of the Internal Account for the expected payment. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** The ID of the counterparty you expect for this payment. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_lower_bound") fun dateLowerBound(): LocalDate? = dateLowerBound

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_upper_bound") fun dateUpperBound(): LocalDate? = dateUpperBound

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Specifies a ledger transaction object that will be created with the expected payment. If
         * the ledger transaction cannot be created, then the expected payment creation will fail.
         * The resulting ledger transaction will mirror the status of the expected payment.
         */
        @JsonProperty("ledger_transaction")
        fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon expected payment creation. Once the expected payment is
         * created, the status of the ledger transaction tracks the expected payment automatically.
         */
        @JsonProperty("ledger_transaction_id")
        fun ledgerTransactionId(): String? = ledgerTransactionId

        @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** The reconciliation filters you have for this payment. */
        @JsonProperty("reconciliation_filters")
        fun reconciliationFilters(): JsonValue? = reconciliationFilters

        /** The reconciliation groups you have for this payment. */
        @JsonProperty("reconciliation_groups")
        fun reconciliationGroups(): JsonValue? = reconciliationGroups

        /** An array of reconciliation rule variables for this payment. */
        @JsonProperty("reconciliation_rule_variables")
        fun reconciliationRuleVariables(): List<ReconciliationRuleVariable>? =
            reconciliationRuleVariables

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        @JsonProperty("type") fun type(): ExpectedPaymentType? = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amountLowerBound: Long? = null
            private var amountUpperBound: Long? = null
            private var direction: TransactionDirection? = null
            private var internalAccountId: String? = null
            private var counterpartyId: String? = null
            private var currency: Currency? = null
            private var dateLowerBound: LocalDate? = null
            private var dateUpperBound: LocalDate? = null
            private var description: String? = null
            private var ledgerTransaction: LedgerTransactionCreateRequest? = null
            private var ledgerTransactionId: String? = null
            private var lineItems: List<LineItemRequest>? = null
            private var metadata: Metadata? = null
            private var reconciliationFilters: JsonValue? = null
            private var reconciliationGroups: JsonValue? = null
            private var reconciliationRuleVariables: List<ReconciliationRuleVariable>? = null
            private var remittanceInformation: String? = null
            private var statementDescriptor: String? = null
            private var type: ExpectedPaymentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentCreateBody: ExpectedPaymentCreateBody) = apply {
                this.amountLowerBound = expectedPaymentCreateBody.amountLowerBound
                this.amountUpperBound = expectedPaymentCreateBody.amountUpperBound
                this.direction = expectedPaymentCreateBody.direction
                this.internalAccountId = expectedPaymentCreateBody.internalAccountId
                this.counterpartyId = expectedPaymentCreateBody.counterpartyId
                this.currency = expectedPaymentCreateBody.currency
                this.dateLowerBound = expectedPaymentCreateBody.dateLowerBound
                this.dateUpperBound = expectedPaymentCreateBody.dateUpperBound
                this.description = expectedPaymentCreateBody.description
                this.ledgerTransaction = expectedPaymentCreateBody.ledgerTransaction
                this.ledgerTransactionId = expectedPaymentCreateBody.ledgerTransactionId
                this.lineItems = expectedPaymentCreateBody.lineItems
                this.metadata = expectedPaymentCreateBody.metadata
                this.reconciliationFilters = expectedPaymentCreateBody.reconciliationFilters
                this.reconciliationGroups = expectedPaymentCreateBody.reconciliationGroups
                this.reconciliationRuleVariables =
                    expectedPaymentCreateBody.reconciliationRuleVariables
                this.remittanceInformation = expectedPaymentCreateBody.remittanceInformation
                this.statementDescriptor = expectedPaymentCreateBody.statementDescriptor
                this.type = expectedPaymentCreateBody.type
                additionalProperties(expectedPaymentCreateBody.additionalProperties)
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            fun amountLowerBound(amountLowerBound: Long) = apply {
                this.amountLowerBound = amountLowerBound
            }

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            fun amountUpperBound(amountUpperBound: Long) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            fun direction(direction: TransactionDirection) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            fun dateLowerBound(dateLowerBound: LocalDate) = apply {
                this.dateLowerBound = dateLowerBound
            }

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            fun dateUpperBound(dateUpperBound: LocalDate) = apply {
                this.dateUpperBound = dateUpperBound
            }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
                this.ledgerTransaction = ledgerTransaction
            }

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(ledgerTransactionId: String) = apply {
                this.ledgerTransactionId = ledgerTransactionId
            }

            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItemRequest>) = apply { this.lineItems = lineItems }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                this.reconciliationFilters = reconciliationFilters
            }

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                this.reconciliationGroups = reconciliationGroups
            }

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(
                reconciliationRuleVariables: List<ReconciliationRuleVariable>
            ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") fun type(type: ExpectedPaymentType) = apply { this.type = type }

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

            fun build(): ExpectedPaymentCreateBody =
                ExpectedPaymentCreateBody(
                    checkNotNull(amountLowerBound) {
                        "`amountLowerBound` is required but was not set"
                    },
                    checkNotNull(amountUpperBound) {
                        "`amountUpperBound` is required but was not set"
                    },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    counterpartyId,
                    currency,
                    dateLowerBound,
                    dateUpperBound,
                    description,
                    ledgerTransaction,
                    ledgerTransactionId,
                    lineItems?.toUnmodifiable(),
                    metadata,
                    reconciliationFilters,
                    reconciliationGroups,
                    reconciliationRuleVariables?.toUnmodifiable(),
                    remittanceInformation,
                    statementDescriptor,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpectedPaymentCreateBody && this.amountLowerBound == other.amountLowerBound && this.amountUpperBound == other.amountUpperBound && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.dateLowerBound == other.dateLowerBound && this.dateUpperBound == other.dateUpperBound && this.description == other.description && this.ledgerTransaction == other.ledgerTransaction && this.ledgerTransactionId == other.ledgerTransactionId && this.lineItems == other.lineItems && this.metadata == other.metadata && this.reconciliationFilters == other.reconciliationFilters && this.reconciliationGroups == other.reconciliationGroups && this.reconciliationRuleVariables == other.reconciliationRuleVariables && this.remittanceInformation == other.remittanceInformation && this.statementDescriptor == other.statementDescriptor && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amountLowerBound, amountUpperBound, direction, internalAccountId, counterpartyId, currency, dateLowerBound, dateUpperBound, description, ledgerTransaction, ledgerTransactionId, lineItems, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExpectedPaymentCreateBody{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, direction=$direction, internalAccountId=$internalAccountId, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentCreateParams && this.amountLowerBound == other.amountLowerBound && this.amountUpperBound == other.amountUpperBound && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.counterpartyId == other.counterpartyId && this.currency == other.currency && this.dateLowerBound == other.dateLowerBound && this.dateUpperBound == other.dateUpperBound && this.description == other.description && this.ledgerTransaction == other.ledgerTransaction && this.ledgerTransactionId == other.ledgerTransactionId && this.lineItems == other.lineItems && this.metadata == other.metadata && this.reconciliationFilters == other.reconciliationFilters && this.reconciliationGroups == other.reconciliationGroups && this.reconciliationRuleVariables == other.reconciliationRuleVariables && this.remittanceInformation == other.remittanceInformation && this.statementDescriptor == other.statementDescriptor && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amountLowerBound, amountUpperBound, direction, internalAccountId, counterpartyId, currency, dateLowerBound, dateUpperBound, description, ledgerTransaction, ledgerTransactionId, lineItems, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, type, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExpectedPaymentCreateParams{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, direction=$direction, internalAccountId=$internalAccountId, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amountLowerBound: Long? = null
        private var amountUpperBound: Long? = null
        private var direction: TransactionDirection? = null
        private var internalAccountId: String? = null
        private var counterpartyId: String? = null
        private var currency: Currency? = null
        private var dateLowerBound: LocalDate? = null
        private var dateUpperBound: LocalDate? = null
        private var description: String? = null
        private var ledgerTransaction: LedgerTransactionCreateRequest? = null
        private var ledgerTransactionId: String? = null
        private var lineItems: MutableList<LineItemRequest> = mutableListOf()
        private var metadata: Metadata? = null
        private var reconciliationFilters: JsonValue? = null
        private var reconciliationGroups: JsonValue? = null
        private var reconciliationRuleVariables: MutableList<ReconciliationRuleVariable> =
            mutableListOf()
        private var remittanceInformation: String? = null
        private var statementDescriptor: String? = null
        private var type: ExpectedPaymentType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPaymentCreateParams: ExpectedPaymentCreateParams) = apply {
            this.amountLowerBound = expectedPaymentCreateParams.amountLowerBound
            this.amountUpperBound = expectedPaymentCreateParams.amountUpperBound
            this.direction = expectedPaymentCreateParams.direction
            this.internalAccountId = expectedPaymentCreateParams.internalAccountId
            this.counterpartyId = expectedPaymentCreateParams.counterpartyId
            this.currency = expectedPaymentCreateParams.currency
            this.dateLowerBound = expectedPaymentCreateParams.dateLowerBound
            this.dateUpperBound = expectedPaymentCreateParams.dateUpperBound
            this.description = expectedPaymentCreateParams.description
            this.ledgerTransaction = expectedPaymentCreateParams.ledgerTransaction
            this.ledgerTransactionId = expectedPaymentCreateParams.ledgerTransactionId
            this.lineItems(expectedPaymentCreateParams.lineItems ?: listOf())
            this.metadata = expectedPaymentCreateParams.metadata
            this.reconciliationFilters = expectedPaymentCreateParams.reconciliationFilters
            this.reconciliationGroups = expectedPaymentCreateParams.reconciliationGroups
            this.reconciliationRuleVariables(
                expectedPaymentCreateParams.reconciliationRuleVariables ?: listOf()
            )
            this.remittanceInformation = expectedPaymentCreateParams.remittanceInformation
            this.statementDescriptor = expectedPaymentCreateParams.statementDescriptor
            this.type = expectedPaymentCreateParams.type
            additionalQueryParams(expectedPaymentCreateParams.additionalQueryParams)
            additionalHeaders(expectedPaymentCreateParams.additionalHeaders)
            additionalBodyProperties(expectedPaymentCreateParams.additionalBodyProperties)
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Specifies a ledger transaction object that will be created with the expected payment. If
         * the ledger transaction cannot be created, then the expected payment creation will fail.
         * The resulting ledger transaction will mirror the status of the expected payment.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
            this.ledgerTransaction = ledgerTransaction
        }

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon expected payment creation. Once the expected payment is
         * created, the status of the ledger transaction tracks the expected payment automatically.
         */
        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        fun lineItems(lineItems: List<LineItemRequest>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        fun addLineItem(lineItem: LineItemRequest) = apply { this.lineItems.add(lineItem) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: List<ReconciliationRuleVariable>
        ) = apply {
            this.reconciliationRuleVariables.clear()
            this.reconciliationRuleVariables.addAll(reconciliationRuleVariables)
        }

        /** An array of reconciliation rule variables for this payment. */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRuleVariable) =
            apply {
                this.reconciliationRuleVariables.add(reconciliationRuleVariable)
            }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType) = apply { this.type = type }

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

        fun build(): ExpectedPaymentCreateParams =
            ExpectedPaymentCreateParams(
                checkNotNull(amountLowerBound) { "`amountLowerBound` is required but was not set" },
                checkNotNull(amountUpperBound) { "`amountUpperBound` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                ledgerTransaction,
                ledgerTransactionId,
                if (lineItems.size == 0) null else lineItems.toUnmodifiable(),
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                if (reconciliationRuleVariables.size == 0) null
                else reconciliationRuleVariables.toUnmodifiable(),
                remittanceInformation,
                statementDescriptor,
                type,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Specifies a ledger transaction object that will be created with the expected payment. If the
     * ledger transaction cannot be created, then the expected payment creation will fail. The
     * resulting ledger transaction will mirror the status of the expected payment.
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
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
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
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
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
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AvailableBalanceAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PendingBalanceAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PendingBalanceAmount{additionalProperties=$additionalProperties}"
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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PostedBalanceAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PostedBalanceAmount{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerEntryCreateRequest && this.amount == other.amount && this.direction == other.direction && this.ledgerAccountId == other.ledgerAccountId && this.lockVersion == other.lockVersion && this.pendingBalanceAmount == other.pendingBalanceAmount && this.postedBalanceAmount == other.postedBalanceAmount && this.availableBalanceAmount == other.availableBalanceAmount && this.showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, direction, ledgerAccountId, lockVersion, pendingBalanceAmount, postedBalanceAmount, availableBalanceAmount, showResultingLedgerAccountBalances, metadata, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        class LedgerableType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerableType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                val INCOMING_PAYMENT_DETAIL =
                    LedgerableType(JsonField.of("incoming_payment_detail"))

                val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                val RETURN = LedgerableType(JsonField.of("return"))

                val REVERSAL = LedgerableType(JsonField.of("reversal"))

                fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            enum class Known {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
            }

            enum class Value {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
                _UNKNOWN,
            }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerTransactionCreateRequest && this.description == other.description && this.status == other.status && this.metadata == other.metadata && this.effectiveAt == other.effectiveAt && this.effectiveDate == other.effectiveDate && this.ledgerEntries == other.ledgerEntries && this.externalId == other.externalId && this.ledgerableType == other.ledgerableType && this.ledgerableId == other.ledgerableId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, status, metadata, effectiveAt, effectiveDate, ledgerEntries, externalId, ledgerableType, ledgerableId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = LineItemRequest.Builder::class)
    @NoAutoDetect
    class LineItemRequest
    private constructor(
        private val amount: Long?,
        private val metadata: Metadata?,
        private val description: String?,
        private val accountingCategoryId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var metadata: Metadata? = null
            private var description: String? = null
            private var accountingCategoryId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItemRequest: LineItemRequest) = apply {
                this.amount = lineItemRequest.amount
                this.metadata = lineItemRequest.metadata
                this.description = lineItemRequest.description
                this.accountingCategoryId = lineItemRequest.accountingCategoryId
                additionalProperties(lineItemRequest.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A free-form description of the line item. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(accountingCategoryId: String) = apply {
                this.accountingCategoryId = accountingCategoryId
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

            fun build(): LineItemRequest =
                LineItemRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    metadata,
                    description,
                    accountingCategoryId,
                    additionalProperties.toUnmodifiable(),
                )
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItemRequest && this.amount == other.amount && this.metadata == other.metadata && this.description == other.description && this.accountingCategoryId == other.accountingCategoryId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, metadata, description, accountingCategoryId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
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

    @JsonDeserialize(builder = ReconciliationRuleVariable.Builder::class)
    @NoAutoDetect
    class ReconciliationRuleVariable
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

            internal fun from(reconciliationRuleVariable: ReconciliationRuleVariable) = apply {
                additionalProperties(reconciliationRuleVariable.additionalProperties)
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

            fun build(): ReconciliationRuleVariable =
                ReconciliationRuleVariable(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReconciliationRuleVariable && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ReconciliationRuleVariable{additionalProperties=$additionalProperties}"
    }
}
