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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class ExpectedPayment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount_lower_bound")
    @ExcludeMissing
    private val amountLowerBound: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount_upper_bound")
    @ExcludeMissing
    private val amountUpperBound: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("date_lower_bound")
    @ExcludeMissing
    private val dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("date_upper_bound")
    @ExcludeMissing
    private val dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reconciliation_filters")
    @ExcludeMissing
    private val reconciliationFilters: JsonValue = JsonMissing.of(),
    @JsonProperty("reconciliation_groups")
    @ExcludeMissing
    private val reconciliationGroups: JsonValue = JsonMissing.of(),
    @JsonProperty("reconciliation_method")
    @ExcludeMissing
    private val reconciliationMethod: JsonField<ReconciliationMethod> = JsonMissing.of(),
    @JsonProperty("reconciliation_rule_variables")
    @ExcludeMissing
    private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    private val statementDescriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    private val transactionLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

    /** The ID of the counterparty you expect for this payment. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    fun currency(): Currency? = currency.getNullable("currency")

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

    /** An optional description for internal use. */
    fun description(): String? = description.getNullable("description")

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction? = direction.getNullable("direction")

    /** The ID of the Internal Account for the expected payment. */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /** The ID of the ledger transaction linked to the expected payment. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /** The reconciliation filters you have for this payment. */
    @JsonProperty("reconciliation_filters")
    @ExcludeMissing
    fun _reconciliationFilters(): JsonValue = reconciliationFilters

    /** The reconciliation groups you have for this payment. */
    @JsonProperty("reconciliation_groups")
    @ExcludeMissing
    fun _reconciliationGroups(): JsonValue = reconciliationGroups

    /**
     * One of manual if this expected payment was manually reconciled in the dashboard, automatic if
     * it was automatically reconciled by Modern Treasury, or null if it is unreconciled.
     */
    fun reconciliationMethod(): ReconciliationMethod? =
        reconciliationMethod.getNullable("reconciliation_method")

    /** An array of reconciliation rule variables for this payment. */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittance_information")

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

    /** One of unreconciled, partially_reconciled, reconciled, or archived. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the Transaction this expected payment object has been matched to. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the Transaction Line Item this expected payment has been matched to. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    fun type(): ExpectedPaymentType? = type.getNullable("type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_lower_bound")
    @ExcludeMissing
    fun _amountLowerBound(): JsonField<Long> = amountLowerBound

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_upper_bound")
    @ExcludeMissing
    fun _amountUpperBound(): JsonField<Long> = amountUpperBound

    /** The ID of the counterparty you expect for this payment. */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    @JsonProperty("date_lower_bound")
    @ExcludeMissing
    fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    @JsonProperty("date_upper_bound")
    @ExcludeMissing
    fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /** The ID of the Internal Account for the expected payment. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /** The ID of the ledger transaction linked to the expected payment. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * One of manual if this expected payment was manually reconciled in the dashboard, automatic if
     * it was automatically reconciled by Modern Treasury, or null if it is unreconciled.
     */
    @JsonProperty("reconciliation_method")
    @ExcludeMissing
    fun _reconciliationMethod(): JsonField<ReconciliationMethod> = reconciliationMethod

    /** An array of reconciliation rule variables for this payment. */
    @JsonProperty("reconciliation_rule_variables")
    @ExcludeMissing
    fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
        reconciliationRuleVariables

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor(): JsonField<String> = statementDescriptor

    /** One of unreconciled, partially_reconciled, reconciled, or archived. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The ID of the Transaction this expected payment object has been matched to. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /** The ID of the Transaction Line Item this expected payment has been matched to. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExpectedPayment = apply {
        if (validated) {
            return@apply
        }

        id()
        amountLowerBound()
        amountUpperBound()
        counterpartyId()
        createdAt()
        currency()
        dateLowerBound()
        dateUpperBound()
        description()
        direction()
        internalAccountId()
        ledgerTransactionId()
        liveMode()
        metadata().validate()
        object_()
        reconciliationMethod()
        reconciliationRuleVariables()?.forEach { it.validate() }
        remittanceInformation()
        statementDescriptor()
        status()
        transactionId()
        transactionLineItemId()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ExpectedPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountLowerBound: JsonField<Long>? = null
        private var amountUpperBound: JsonField<Long>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var dateLowerBound: JsonField<LocalDate>? = null
        private var dateUpperBound: JsonField<LocalDate>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var reconciliationFilters: JsonValue? = null
        private var reconciliationGroups: JsonValue? = null
        private var reconciliationMethod: JsonField<ReconciliationMethod>? = null
        private var reconciliationRuleVariables: JsonField<MutableList<ReconciliationRule>>? = null
        private var remittanceInformation: JsonField<String>? = null
        private var statementDescriptor: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var type: JsonField<ExpectedPaymentType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPayment: ExpectedPayment) = apply {
            id = expectedPayment.id
            amountLowerBound = expectedPayment.amountLowerBound
            amountUpperBound = expectedPayment.amountUpperBound
            counterpartyId = expectedPayment.counterpartyId
            createdAt = expectedPayment.createdAt
            currency = expectedPayment.currency
            dateLowerBound = expectedPayment.dateLowerBound
            dateUpperBound = expectedPayment.dateUpperBound
            description = expectedPayment.description
            direction = expectedPayment.direction
            internalAccountId = expectedPayment.internalAccountId
            ledgerTransactionId = expectedPayment.ledgerTransactionId
            liveMode = expectedPayment.liveMode
            metadata = expectedPayment.metadata
            object_ = expectedPayment.object_
            reconciliationFilters = expectedPayment.reconciliationFilters
            reconciliationGroups = expectedPayment.reconciliationGroups
            reconciliationMethod = expectedPayment.reconciliationMethod
            reconciliationRuleVariables =
                expectedPayment.reconciliationRuleVariables.map { it.toMutableList() }
            remittanceInformation = expectedPayment.remittanceInformation
            statementDescriptor = expectedPayment.statementDescriptor
            status = expectedPayment.status
            transactionId = expectedPayment.transactionId
            transactionLineItemId = expectedPayment.transactionLineItemId
            type = expectedPayment.type
            updatedAt = expectedPayment.updatedAt
            additionalProperties = expectedPayment.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long?) =
            amountLowerBound(JsonField.ofNullable(amountLowerBound))

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) = amountLowerBound(amountLowerBound as Long?)

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long?) =
            amountUpperBound(JsonField.ofNullable(amountUpperBound))

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) = amountUpperBound(amountUpperBound as Long?)

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate?) =
            dateLowerBound(JsonField.ofNullable(dateLowerBound))

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate?) =
            dateUpperBound(JsonField.ofNullable(dateUpperBound))

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** An optional description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** An optional description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String?) =
            internalAccountId(JsonField.ofNullable(internalAccountId))

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the ledger transaction linked to the expected payment. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the expected payment. */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /**
         * One of manual if this expected payment was manually reconciled in the dashboard,
         * automatic if it was automatically reconciled by Modern Treasury, or null if it is
         * unreconciled.
         */
        fun reconciliationMethod(reconciliationMethod: ReconciliationMethod?) =
            reconciliationMethod(JsonField.ofNullable(reconciliationMethod))

        /**
         * One of manual if this expected payment was manually reconciled in the dashboard,
         * automatic if it was automatically reconciled by Modern Treasury, or null if it is
         * unreconciled.
         */
        fun reconciliationMethod(reconciliationMethod: JsonField<ReconciliationMethod>) = apply {
            this.reconciliationMethod = reconciliationMethod
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>?) =
            reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
        ) = apply {
            this.reconciliationRuleVariables =
                reconciliationRuleVariables.map { it.toMutableList() }
        }

        /** An array of reconciliation rule variables for this payment. */
        fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) = apply {
            reconciliationRuleVariables =
                (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reconciliationRuleVariables", it).add(reconciliationRuleVariable)
                }
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String?) =
            remittanceInformation(JsonField.ofNullable(remittanceInformation))

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String?) =
            statementDescriptor(JsonField.ofNullable(statementDescriptor))

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** One of unreconciled, partially_reconciled, reconciled, or archived. */
        fun status(status: Status) = status(JsonField.of(status))

        /** One of unreconciled, partially_reconciled, reconciled, or archived. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the Transaction this expected payment object has been matched to. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID of the Transaction this expected payment object has been matched to. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the Transaction Line Item this expected payment has been matched to. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /** The ID of the Transaction Line Item this expected payment has been matched to. */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): ExpectedPayment =
            ExpectedPayment(
                checkRequired("id", id),
                checkRequired("amountLowerBound", amountLowerBound),
                checkRequired("amountUpperBound", amountUpperBound),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("dateLowerBound", dateLowerBound),
                checkRequired("dateUpperBound", dateUpperBound),
                checkRequired("description", description),
                checkRequired("direction", direction),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("reconciliationFilters", reconciliationFilters),
                checkRequired("reconciliationGroups", reconciliationGroups),
                checkRequired("reconciliationMethod", reconciliationMethod),
                checkRequired("reconciliationRuleVariables", reconciliationRuleVariables).map {
                    it.toImmutable()
                },
                checkRequired("remittanceInformation", remittanceInformation),
                checkRequired("statementDescriptor", statementDescriptor),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("transactionLineItemId", transactionLineItemId),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /**
     * One of manual if this expected payment was manually reconciled in the dashboard, automatic if
     * it was automatically reconciled by Modern Treasury, or null if it is unreconciled.
     */
    class ReconciliationMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val AUTOMATIC = of("automatic")

            val MANUAL = of("manual")

            fun of(value: String) = ReconciliationMethod(JsonField.of(value))
        }

        /** An enum containing [ReconciliationMethod]'s known values. */
        enum class Known {
            AUTOMATIC,
            MANUAL,
        }

        /**
         * An enum containing [ReconciliationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ReconciliationMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTOMATIC,
            MANUAL,
            /**
             * An enum member indicating that [ReconciliationMethod] was instantiated with an
             * unknown value.
             */
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
                AUTOMATIC -> Value.AUTOMATIC
                MANUAL -> Value.MANUAL
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
                AUTOMATIC -> Known.AUTOMATIC
                MANUAL -> Known.MANUAL
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReconciliationMethod: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReconciliationMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One of unreconciled, partially_reconciled, reconciled, or archived. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ARCHIVED = of("archived")

            val PARTIALLY_RECONCILED = of("partially_reconciled")

            val RECONCILED = of("reconciled")

            val UNRECONCILED = of("unreconciled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ARCHIVED -> Value.ARCHIVED
                PARTIALLY_RECONCILED -> Value.PARTIALLY_RECONCILED
                RECONCILED -> Value.RECONCILED
                UNRECONCILED -> Value.UNRECONCILED
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
                ARCHIVED -> Known.ARCHIVED
                PARTIALLY_RECONCILED -> Known.PARTIALLY_RECONCILED
                RECONCILED -> Known.RECONCILED
                UNRECONCILED -> Known.UNRECONCILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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

        return /* spotless:off */ other is ExpectedPayment && id == other.id && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && createdAt == other.createdAt && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationMethod == other.reconciliationMethod && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amountLowerBound, amountUpperBound, counterpartyId, createdAt, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, ledgerTransactionId, liveMode, metadata, object_, reconciliationFilters, reconciliationGroups, reconciliationMethod, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, transactionId, transactionLineItemId, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExpectedPayment{id=$id, amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationMethod=$reconciliationMethod, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
