// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/** create expected payment */
class ExpectedPaymentCreateParams
constructor(
    private val body: ExpectedPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long? = body.amountLowerBound()

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long? = body.amountUpperBound()

    /** The ID of the counterparty you expect for this payment. */
    fun counterpartyId(): String? = body.counterpartyId()

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    fun currency(): Currency? = body.currency()

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = body.dateLowerBound()

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = body.dateUpperBound()

    /** An optional description for internal use. */
    fun description(): String? = body.description()

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction? = body.direction()

    /** The ID of the Internal Account for the expected payment. */
    fun internalAccountId(): String? = body.internalAccountId()

    /**
     * Specifies a ledger transaction object that will be created with the expected payment. If the
     * ledger transaction cannot be created, then the expected payment creation will fail. The
     * resulting ledger transaction will mirror the status of the expected payment.
     */
    fun ledgerTransaction(): LedgerTransactionCreateRequest? = body.ledgerTransaction()

    /**
     * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
     * transaction can be attached upon expected payment creation. Once the expected payment is
     * created, the status of the ledger transaction tracks the expected payment automatically.
     */
    fun ledgerTransactionId(): String? = body.ledgerTransactionId()

    fun lineItems(): List<LineItemRequest>? = body.lineItems()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata? = body.metadata()

    /** The reconciliation filters you have for this payment. */
    fun reconciliationFilters(): JsonValue? = body.reconciliationFilters()

    /** The reconciliation groups you have for this payment. */
    fun reconciliationGroups(): JsonValue? = body.reconciliationGroups()

    /** An array of reconciliation rule variables for this payment. */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        body.reconciliationRuleVariables()

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    fun statementDescriptor(): String? = body.statementDescriptor()

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    fun type(): ExpectedPaymentType? = body.type()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): ExpectedPaymentCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ExpectedPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount_lower_bound") private val amountLowerBound: Long?,
        @JsonProperty("amount_upper_bound") private val amountUpperBound: Long?,
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("currency") private val currency: Currency?,
        @JsonProperty("date_lower_bound") private val dateLowerBound: LocalDate?,
        @JsonProperty("date_upper_bound") private val dateUpperBound: LocalDate?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: Direction?,
        @JsonProperty("internal_account_id") private val internalAccountId: String?,
        @JsonProperty("ledger_transaction")
        private val ledgerTransaction: LedgerTransactionCreateRequest?,
        @JsonProperty("ledger_transaction_id") private val ledgerTransactionId: String?,
        @JsonProperty("line_items") private val lineItems: List<LineItemRequest>?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("reconciliation_filters") private val reconciliationFilters: JsonValue?,
        @JsonProperty("reconciliation_groups") private val reconciliationGroups: JsonValue?,
        @JsonProperty("reconciliation_rule_variables")
        private val reconciliationRuleVariables: List<ReconciliationRule>?,
        @JsonProperty("remittance_information") private val remittanceInformation: String?,
        @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
        @JsonProperty("type") private val type: ExpectedPaymentType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** The ID of the Internal Account for the expected payment. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

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
        fun reconciliationRuleVariables(): List<ReconciliationRule>? = reconciliationRuleVariables

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
            private var counterpartyId: String? = null
            private var currency: Currency? = null
            private var dateLowerBound: LocalDate? = null
            private var dateUpperBound: LocalDate? = null
            private var description: String? = null
            private var direction: Direction? = null
            private var internalAccountId: String? = null
            private var ledgerTransaction: LedgerTransactionCreateRequest? = null
            private var ledgerTransactionId: String? = null
            private var lineItems: MutableList<LineItemRequest>? = null
            private var metadata: Metadata? = null
            private var reconciliationFilters: JsonValue? = null
            private var reconciliationGroups: JsonValue? = null
            private var reconciliationRuleVariables: MutableList<ReconciliationRule>? = null
            private var remittanceInformation: String? = null
            private var statementDescriptor: String? = null
            private var type: ExpectedPaymentType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedPaymentCreateBody: ExpectedPaymentCreateBody) = apply {
                amountLowerBound = expectedPaymentCreateBody.amountLowerBound
                amountUpperBound = expectedPaymentCreateBody.amountUpperBound
                counterpartyId = expectedPaymentCreateBody.counterpartyId
                currency = expectedPaymentCreateBody.currency
                dateLowerBound = expectedPaymentCreateBody.dateLowerBound
                dateUpperBound = expectedPaymentCreateBody.dateUpperBound
                description = expectedPaymentCreateBody.description
                direction = expectedPaymentCreateBody.direction
                internalAccountId = expectedPaymentCreateBody.internalAccountId
                ledgerTransaction = expectedPaymentCreateBody.ledgerTransaction
                ledgerTransactionId = expectedPaymentCreateBody.ledgerTransactionId
                lineItems = expectedPaymentCreateBody.lineItems?.toMutableList()
                metadata = expectedPaymentCreateBody.metadata
                reconciliationFilters = expectedPaymentCreateBody.reconciliationFilters
                reconciliationGroups = expectedPaymentCreateBody.reconciliationGroups
                reconciliationRuleVariables =
                    expectedPaymentCreateBody.reconciliationRuleVariables?.toMutableList()
                remittanceInformation = expectedPaymentCreateBody.remittanceInformation
                statementDescriptor = expectedPaymentCreateBody.statementDescriptor
                type = expectedPaymentCreateBody.type
                additionalProperties = expectedPaymentCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(amountLowerBound: Long?) = apply {
                this.amountLowerBound = amountLowerBound
            }

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(amountLowerBound: Long) =
                amountLowerBound(amountLowerBound as Long?)

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(amountUpperBound: Long?) = apply {
                this.amountUpperBound = amountUpperBound
            }

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(amountUpperBound: Long) =
                amountUpperBound(amountUpperBound as Long?)

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(counterpartyId: String?) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(currency: Currency?) = apply { this.currency = currency }

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(dateLowerBound: LocalDate?) = apply {
                this.dateLowerBound = dateLowerBound
            }

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(dateUpperBound: LocalDate?) = apply {
                this.dateUpperBound = dateUpperBound
            }

            /** An optional description for internal use. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(direction: Direction?) = apply { this.direction = direction }

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(internalAccountId: String?) = apply {
                this.internalAccountId = internalAccountId
            }

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest?) = apply {
                this.ledgerTransaction = ledgerTransaction
            }

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            fun ledgerTransactionId(ledgerTransactionId: String?) = apply {
                this.ledgerTransactionId = ledgerTransactionId
            }

            fun lineItems(lineItems: List<LineItemRequest>?) = apply {
                this.lineItems = lineItems?.toMutableList()
            }

            fun addLineItem(lineItem: LineItemRequest) = apply {
                lineItems = (lineItems ?: mutableListOf()).apply { add(lineItem) }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /** The reconciliation filters you have for this payment. */
            fun reconciliationFilters(reconciliationFilters: JsonValue?) = apply {
                this.reconciliationFilters = reconciliationFilters
            }

            /** The reconciliation groups you have for this payment. */
            fun reconciliationGroups(reconciliationGroups: JsonValue?) = apply {
                this.reconciliationGroups = reconciliationGroups
            }

            /** An array of reconciliation rule variables for this payment. */
            fun reconciliationRuleVariables(
                reconciliationRuleVariables: List<ReconciliationRule>?
            ) = apply {
                this.reconciliationRuleVariables = reconciliationRuleVariables?.toMutableList()
            }

            /** An array of reconciliation rule variables for this payment. */
            fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                apply {
                    reconciliationRuleVariables =
                        (reconciliationRuleVariables ?: mutableListOf()).apply {
                            add(reconciliationRuleVariable)
                        }
                }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(remittanceInformation: String?) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(statementDescriptor: String?) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(type: ExpectedPaymentType?) = apply { this.type = type }

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

            fun build(): ExpectedPaymentCreateBody =
                ExpectedPaymentCreateBody(
                    amountLowerBound,
                    amountUpperBound,
                    counterpartyId,
                    currency,
                    dateLowerBound,
                    dateUpperBound,
                    description,
                    direction,
                    internalAccountId,
                    ledgerTransaction,
                    ledgerTransactionId,
                    lineItems?.toImmutable(),
                    metadata,
                    reconciliationFilters,
                    reconciliationGroups,
                    reconciliationRuleVariables?.toImmutable(),
                    remittanceInformation,
                    statementDescriptor,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExpectedPaymentCreateBody && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, ledgerTransaction, ledgerTransactionId, lineItems, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpectedPaymentCreateBody{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ExpectedPaymentCreateBody.Builder = ExpectedPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(expectedPaymentCreateParams: ExpectedPaymentCreateParams) = apply {
            body = expectedPaymentCreateParams.body.toBuilder()
            additionalHeaders = expectedPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = expectedPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long?) = apply {
            body.amountLowerBound(amountLowerBound)
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = amountLowerBound(amountLowerBound as Long?)

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long?) = apply {
            body.amountUpperBound(amountUpperBound)
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = amountUpperBound(amountUpperBound as Long?)

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency?) = apply { body.currency(currency) }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate?) = apply {
            body.dateLowerBound(dateLowerBound)
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate?) = apply {
            body.dateUpperBound(dateUpperBound)
        }

        /** An optional description for internal use. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction?) = apply { body.direction(direction) }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String?) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Specifies a ledger transaction object that will be created with the expected payment. If
         * the ledger transaction cannot be created, then the expected payment creation will fail.
         * The resulting ledger transaction will mirror the status of the expected payment.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest?) = apply {
            body.ledgerTransaction(ledgerTransaction)
        }

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon expected payment creation. Once the expected payment is
         * created, the status of the ledger transaction tracks the expected payment automatically.
         */
        fun ledgerTransactionId(ledgerTransactionId: String?) = apply {
            body.ledgerTransactionId(ledgerTransactionId)
        }

        fun lineItems(lineItems: List<LineItemRequest>?) = apply { body.lineItems(lineItems) }

        fun addLineItem(lineItem: LineItemRequest) = apply { body.addLineItem(lineItem) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue?) = apply {
            body.reconciliationFilters(reconciliationFilters)
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue?) = apply {
            body.reconciliationGroups(reconciliationGroups)
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>?) =
            apply {
                body.reconciliationRuleVariables(reconciliationRuleVariables)
            }

        /** An array of reconciliation rule variables for this payment. */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) = apply {
            body.addReconciliationRuleVariable(reconciliationRuleVariable)
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String?) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String?) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType?) = apply { body.type(type) }

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

        fun build(): ExpectedPaymentCreateParams =
            ExpectedPaymentCreateParams(
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

    /**
     * Specifies a ledger transaction object that will be created with the expected payment. If the
     * ledger transaction cannot be created, then the expected payment creation will fail. The
     * resulting ledger transaction will mirror the status of the expected payment.
     */
    @NoAutoDetect
    class LedgerTransactionCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("ledger_entries") private val ledgerEntries: List<LedgerEntryCreateRequest>,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("effective_at") private val effectiveAt: OffsetDateTime?,
        @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
        @JsonProperty("external_id") private val externalId: String?,
        @JsonProperty("ledgerable_id") private val ledgerableId: String?,
        @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("status") private val status: Status?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var ledgerEntries: MutableList<LedgerEntryCreateRequest>? = null
            private var description: String? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveDate: LocalDate? = null
            private var externalId: String? = null
            private var ledgerableId: String? = null
            private var ledgerableType: LedgerableType? = null
            private var metadata: Metadata? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                apply {
                    ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
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
            fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                this.ledgerEntries = ledgerEntries.toMutableList()
            }

            /** An array of ledger entry objects. */
            fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                ledgerEntries = (ledgerEntries ?: mutableListOf()).apply { add(ledgerEntry) }
            }

            /** An optional description for internal use. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(effectiveDate: LocalDate?) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(externalId: String?) = apply { this.externalId = externalId }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: Status?) = apply { this.status = status }

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
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .toImmutable(),
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
            @JsonProperty("amount") private val amount: Long,
            @JsonProperty("direction") private val direction: TransactionDirection,
            @JsonProperty("ledger_account_id") private val ledgerAccountId: String,
            @JsonProperty("available_balance_amount")
            private val availableBalanceAmount: AvailableBalanceAmount?,
            @JsonProperty("lock_version") private val lockVersion: Long?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonProperty("pending_balance_amount")
            private val pendingBalanceAmount: PendingBalanceAmount?,
            @JsonProperty("posted_balance_amount")
            private val postedBalanceAmount: PostedBalanceAmount?,
            @JsonProperty("show_resulting_ledger_account_balances")
            private val showResultingLedgerAccountBalances: Boolean?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            @JsonProperty("amount") fun amount(): Long = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): TransactionDirection = direction

            /** The ledger account that this ledger entry is associated with. */
            @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("available_balance_amount")
            fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

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
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             */
            @JsonProperty("show_resulting_ledger_account_balances")
            fun showResultingLedgerAccountBalances(): Boolean? = showResultingLedgerAccountBalances

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
                private var availableBalanceAmount: AvailableBalanceAmount? = null
                private var lockVersion: Long? = null
                private var metadata: Metadata? = null
                private var pendingBalanceAmount: PendingBalanceAmount? = null
                private var postedBalanceAmount: PostedBalanceAmount? = null
                private var showResultingLedgerAccountBalances: Boolean? = null
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
                fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: TransactionDirection) = apply {
                    this.direction = direction
                }

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(ledgerAccountId: String) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                    apply {
                        this.availableBalanceAmount = availableBalanceAmount
                    }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: Long?) = apply { this.lockVersion = lockVersion }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) = apply {
                    this.pendingBalanceAmount = pendingBalanceAmount
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
                    this.postedBalanceAmount = postedBalanceAmount
                }

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean?
                ) = apply {
                    this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                }

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
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(ledgerAccountId) {
                            "`ledgerAccountId` is required but was not set"
                        },
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

        class LedgerableType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARCHIVED = of("archived")

                val PENDING = of("pending")

                val POSTED = of("posted")

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

    @NoAutoDetect
    class LineItemRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        /** A free-form description of the line item. */
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

            private var amount: Long? = null
            private var accountingCategoryId: String? = null
            private var description: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItemRequest: LineItemRequest) = apply {
                amount = lineItemRequest.amount
                accountingCategoryId = lineItemRequest.accountingCategoryId
                description = lineItemRequest.description
                metadata = lineItemRequest.metadata
                additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(accountingCategoryId: String?) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /** A free-form description of the line item. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

            fun build(): LineItemRequest =
                LineItemRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    accountingCategoryId,
                    description,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExpectedPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
