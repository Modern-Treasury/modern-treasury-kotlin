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
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ExpectedPayment.Builder::class)
@NoAutoDetect
class ExpectedPayment
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val amountUpperBound: JsonField<Long>,
    private val amountLowerBound: JsonField<Long>,
    private val direction: JsonField<Direction>,
    private val internalAccountId: JsonField<String>,
    private val type: JsonField<ExpectedPaymentType>,
    private val currency: JsonField<Currency>,
    private val dateUpperBound: JsonField<LocalDate>,
    private val dateLowerBound: JsonField<LocalDate>,
    private val description: JsonField<String>,
    private val statementDescriptor: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val counterpartyId: JsonField<String>,
    private val remittanceInformation: JsonField<String>,
    private val reconciliationGroups: JsonValue,
    private val reconciliationFilters: JsonValue,
    private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
    private val transactionId: JsonField<String>,
    private val transactionLineItemId: JsonField<String>,
    private val status: JsonField<Status>,
    private val reconciliationMethod: JsonField<ReconciliationMethod>,
    private val ledgerTransactionId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    fun direction(): Direction? = direction.getNullable("direction")

    /** The ID of the Internal Account for the expected payment. */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    fun type(): ExpectedPaymentType? = type.getNullable("type")

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    fun currency(): Currency? = currency.getNullable("currency")

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

    /** An optional description for internal use. */
    fun description(): String? = description.getNullable("description")

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The ID of the counterparty you expect for this payment. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittance_information")

    /** An array of reconciliation rule variables for this payment. */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

    /** The ID of the Transaction this expected payment object has been matched to. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the Transaction Line Item this expected payment has been matched to. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /** One of unreconciled, partially_reconciled, reconciled, or archived. */
    fun status(): Status = status.getRequired("status")

    /**
     * One of manual if this expected payment was manually reconciled in the dashboard, automatic if
     * it was automatically reconciled by Modern Treasury, or null if it is unreconciled.
     */
    fun reconciliationMethod(): ReconciliationMethod? =
        reconciliationMethod.getNullable("reconciliation_method")

    /** The ID of the ledger transaction linked to the expected payment. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_upper_bound") @ExcludeMissing fun _amountUpperBound() = amountUpperBound

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     */
    @JsonProperty("amount_lower_bound") @ExcludeMissing fun _amountLowerBound() = amountLowerBound

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /** The ID of the Internal Account for the expected payment. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The latest date the payment may come in. Format: yyyy-mm-dd */
    @JsonProperty("date_upper_bound") @ExcludeMissing fun _dateUpperBound() = dateUpperBound

    /** The earliest date the payment may come in. Format: yyyy-mm-dd */
    @JsonProperty("date_lower_bound") @ExcludeMissing fun _dateLowerBound() = dateLowerBound

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor() = statementDescriptor

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The ID of the counterparty you expect for this payment. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The reconciliation groups you have for this payment. */
    @JsonProperty("reconciliation_groups")
    @ExcludeMissing
    fun _reconciliationGroups() = reconciliationGroups

    /** The reconciliation filters you have for this payment. */
    @JsonProperty("reconciliation_filters")
    @ExcludeMissing
    fun _reconciliationFilters() = reconciliationFilters

    /** An array of reconciliation rule variables for this payment. */
    @JsonProperty("reconciliation_rule_variables")
    @ExcludeMissing
    fun _reconciliationRuleVariables() = reconciliationRuleVariables

    /** The ID of the Transaction this expected payment object has been matched to. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The ID of the Transaction Line Item this expected payment has been matched to. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId() = transactionLineItemId

    /** One of unreconciled, partially_reconciled, reconciled, or archived. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * One of manual if this expected payment was manually reconciled in the dashboard, automatic if
     * it was automatically reconciled by Modern Treasury, or null if it is unreconciled.
     */
    @JsonProperty("reconciliation_method")
    @ExcludeMissing
    fun _reconciliationMethod() = reconciliationMethod

    /** The ID of the ledger transaction linked to the expected payment. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExpectedPayment = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            amountUpperBound()
            amountLowerBound()
            direction()
            internalAccountId()
            type()
            currency()
            dateUpperBound()
            dateLowerBound()
            description()
            statementDescriptor()
            metadata().validate()
            counterpartyId()
            remittanceInformation()
            reconciliationRuleVariables()?.forEach { it.validate() }
            transactionId()
            transactionLineItemId()
            status()
            reconciliationMethod()
            ledgerTransactionId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var amountUpperBound: JsonField<Long> = JsonMissing.of()
        private var amountLowerBound: JsonField<Long> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
        private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var statementDescriptor: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var reconciliationGroups: JsonValue = JsonMissing.of()
        private var reconciliationFilters: JsonValue = JsonMissing.of()
        private var reconciliationRuleVariables: JsonField<List<ReconciliationRule>> =
            JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var transactionLineItemId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var reconciliationMethod: JsonField<ReconciliationMethod> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPayment: ExpectedPayment) = apply {
            this.id = expectedPayment.id
            this.object_ = expectedPayment.object_
            this.liveMode = expectedPayment.liveMode
            this.createdAt = expectedPayment.createdAt
            this.updatedAt = expectedPayment.updatedAt
            this.amountUpperBound = expectedPayment.amountUpperBound
            this.amountLowerBound = expectedPayment.amountLowerBound
            this.direction = expectedPayment.direction
            this.internalAccountId = expectedPayment.internalAccountId
            this.type = expectedPayment.type
            this.currency = expectedPayment.currency
            this.dateUpperBound = expectedPayment.dateUpperBound
            this.dateLowerBound = expectedPayment.dateLowerBound
            this.description = expectedPayment.description
            this.statementDescriptor = expectedPayment.statementDescriptor
            this.metadata = expectedPayment.metadata
            this.counterpartyId = expectedPayment.counterpartyId
            this.remittanceInformation = expectedPayment.remittanceInformation
            this.reconciliationGroups = expectedPayment.reconciliationGroups
            this.reconciliationFilters = expectedPayment.reconciliationFilters
            this.reconciliationRuleVariables = expectedPayment.reconciliationRuleVariables
            this.transactionId = expectedPayment.transactionId
            this.transactionLineItemId = expectedPayment.transactionLineItemId
            this.status = expectedPayment.status
            this.reconciliationMethod = expectedPayment.reconciliationMethod
            this.ledgerTransactionId = expectedPayment.ledgerTransactionId
            additionalProperties(expectedPayment.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long) =
            amountUpperBound(JsonField.of(amountUpperBound))

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_upper_bound")
        @ExcludeMissing
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long) =
            amountLowerBound(JsonField.of(amountLowerBound))

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        @JsonProperty("amount_lower_bound")
        @ExcludeMissing
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the Internal Account for the expected payment. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType) = type(JsonField.of(type))

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate) = dateUpperBound(JsonField.of(dateUpperBound))

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_upper_bound")
        @ExcludeMissing
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate) = dateLowerBound(JsonField.of(dateLowerBound))

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        @JsonProperty("date_lower_bound")
        @ExcludeMissing
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** An optional description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        fun statementDescriptor(statementDescriptor: String) =
            statementDescriptor(JsonField.of(statementDescriptor))

        /**
         * The statement description you expect to see on the transaction. For ACH payments, this
         * will be the full line item passed from the bank. For wire payments, this will be the OBI
         * field on the wire. For check payments, this will be the memo field.
         */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of the counterparty you expect for this payment. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The reconciliation groups you have for this payment. */
        @JsonProperty("reconciliation_groups")
        @ExcludeMissing
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /** The reconciliation filters you have for this payment. */
        @JsonProperty("reconciliation_filters")
        @ExcludeMissing
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>) =
            reconciliationRuleVariables(JsonField.of(reconciliationRuleVariables))

        /** An array of reconciliation rule variables for this payment. */
        @JsonProperty("reconciliation_rule_variables")
        @ExcludeMissing
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
        ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

        /** The ID of the Transaction this expected payment object has been matched to. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the Transaction this expected payment object has been matched to. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the Transaction Line Item this expected payment has been matched to. */
        fun transactionLineItemId(transactionLineItemId: String) =
            transactionLineItemId(JsonField.of(transactionLineItemId))

        /** The ID of the Transaction Line Item this expected payment has been matched to. */
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /** One of unreconciled, partially_reconciled, reconciled, or archived. */
        fun status(status: Status) = status(JsonField.of(status))

        /** One of unreconciled, partially_reconciled, reconciled, or archived. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * One of manual if this expected payment was manually reconciled in the dashboard,
         * automatic if it was automatically reconciled by Modern Treasury, or null if it is
         * unreconciled.
         */
        fun reconciliationMethod(reconciliationMethod: ReconciliationMethod) =
            reconciliationMethod(JsonField.of(reconciliationMethod))

        /**
         * One of manual if this expected payment was manually reconciled in the dashboard,
         * automatic if it was automatically reconciled by Modern Treasury, or null if it is
         * unreconciled.
         */
        @JsonProperty("reconciliation_method")
        @ExcludeMissing
        fun reconciliationMethod(reconciliationMethod: JsonField<ReconciliationMethod>) = apply {
            this.reconciliationMethod = reconciliationMethod
        }

        /** The ID of the ledger transaction linked to the expected payment. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the expected payment. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
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

        fun build(): ExpectedPayment =
            ExpectedPayment(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                amountUpperBound,
                amountLowerBound,
                direction,
                internalAccountId,
                type,
                currency,
                dateUpperBound,
                dateLowerBound,
                description,
                statementDescriptor,
                metadata,
                counterpartyId,
                remittanceInformation,
                reconciliationGroups,
                reconciliationFilters,
                reconciliationRuleVariables.map { it.toUnmodifiable() },
                transactionId,
                transactionLineItemId,
                status,
                reconciliationMethod,
                ledgerTransactionId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

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
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

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

    class ReconciliationMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReconciliationMethod && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val AUTOMATIC = ReconciliationMethod(JsonField.of("automatic"))

            val MANUAL = ReconciliationMethod(JsonField.of("manual"))

            fun of(value: String) = ReconciliationMethod(JsonField.of(value))
        }

        enum class Known {
            AUTOMATIC,
            MANUAL,
        }

        enum class Value {
            AUTOMATIC,
            MANUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTOMATIC -> Value.AUTOMATIC
                MANUAL -> Value.MANUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTOMATIC -> Known.AUTOMATIC
                MANUAL -> Known.MANUAL
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReconciliationMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val PARTIALLY_RECONCILED = Status(JsonField.of("partially_reconciled"))

            val RECONCILED = Status(JsonField.of("reconciled"))

            val UNRECONCILED = Status(JsonField.of("unreconciled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
        }

        enum class Value {
            ARCHIVED,
            PARTIALLY_RECONCILED,
            RECONCILED,
            UNRECONCILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PARTIALLY_RECONCILED -> Value.PARTIALLY_RECONCILED
                RECONCILED -> Value.RECONCILED
                UNRECONCILED -> Value.UNRECONCILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PARTIALLY_RECONCILED -> Known.PARTIALLY_RECONCILED
                RECONCILED -> Known.RECONCILED
                UNRECONCILED -> Known.UNRECONCILED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExpectedPayment && this.id == other.id && this.object_ == other.object_ && this.liveMode == other.liveMode && this.createdAt == other.createdAt && this.updatedAt == other.updatedAt && this.amountUpperBound == other.amountUpperBound && this.amountLowerBound == other.amountLowerBound && this.direction == other.direction && this.internalAccountId == other.internalAccountId && this.type == other.type && this.currency == other.currency && this.dateUpperBound == other.dateUpperBound && this.dateLowerBound == other.dateLowerBound && this.description == other.description && this.statementDescriptor == other.statementDescriptor && this.metadata == other.metadata && this.counterpartyId == other.counterpartyId && this.remittanceInformation == other.remittanceInformation && this.reconciliationGroups == other.reconciliationGroups && this.reconciliationFilters == other.reconciliationFilters && this.reconciliationRuleVariables == other.reconciliationRuleVariables && this.transactionId == other.transactionId && this.transactionLineItemId == other.transactionLineItemId && this.status == other.status && this.reconciliationMethod == other.reconciliationMethod && this.ledgerTransactionId == other.ledgerTransactionId && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, object_, liveMode, createdAt, updatedAt, amountUpperBound, amountLowerBound, direction, internalAccountId, type, currency, dateUpperBound, dateLowerBound, description, statementDescriptor, metadata, counterpartyId, remittanceInformation, reconciliationGroups, reconciliationFilters, reconciliationRuleVariables, transactionId, transactionLineItemId, status, reconciliationMethod, ledgerTransactionId, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ExpectedPayment{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, reconciliationRuleVariables=$reconciliationRuleVariables, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, status=$status, reconciliationMethod=$reconciliationMethod, ledgerTransactionId=$ledgerTransactionId, additionalProperties=$additionalProperties}"
}
