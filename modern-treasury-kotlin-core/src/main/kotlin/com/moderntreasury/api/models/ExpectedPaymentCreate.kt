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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class ExpectedPaymentCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amountLowerBound: JsonField<Long>,
    private val amountReconciled: JsonField<Long>,
    private val amountReconciledDirection: JsonField<AmountReconciledDirection>,
    private val amountUnreconciled: JsonField<Long>,
    private val amountUnreconciledDirection: JsonField<AmountUnreconciledDirection>,
    private val amountUpperBound: JsonField<Long>,
    private val counterpartyId: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val dateLowerBound: JsonField<LocalDate>,
    private val dateUpperBound: JsonField<LocalDate>,
    private val description: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val externalId: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest>,
    private val ledgerTransactionId: JsonField<String>,
    private val lineItems: JsonField<List<LineItem>>,
    private val metadata: JsonField<Metadata>,
    private val reconciliationFilters: JsonValue,
    private val reconciliationGroups: JsonValue,
    private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
    private val remittanceInformation: JsonField<String>,
    private val statementDescriptor: JsonField<String>,
    private val type: JsonField<ExpectedPaymentType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount_lower_bound")
        @ExcludeMissing
        amountLowerBound: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_reconciled")
        @ExcludeMissing
        amountReconciled: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_reconciled_direction")
        @ExcludeMissing
        amountReconciledDirection: JsonField<AmountReconciledDirection> = JsonMissing.of(),
        @JsonProperty("amount_unreconciled")
        @ExcludeMissing
        amountUnreconciled: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_unreconciled_direction")
        @ExcludeMissing
        amountUnreconciledDirection: JsonField<AmountUnreconciledDirection> = JsonMissing.of(),
        @JsonProperty("amount_upper_bound")
        @ExcludeMissing
        amountUpperBound: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("date_lower_bound")
        @ExcludeMissing
        dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("date_upper_bound")
        @ExcludeMissing
        dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_transaction")
        @ExcludeMissing
        ledgerTransaction: JsonField<LedgerTransactionCreateRequest> = JsonMissing.of(),
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        ledgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line_items")
        @ExcludeMissing
        lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("reconciliation_filters")
        @ExcludeMissing
        reconciliationFilters: JsonValue = JsonMissing.of(),
        @JsonProperty("reconciliation_groups")
        @ExcludeMissing
        reconciliationGroups: JsonValue = JsonMissing.of(),
        @JsonProperty("reconciliation_rule_variables")
        @ExcludeMissing
        reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        statementDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
    ) : this(
        amountLowerBound,
        amountReconciled,
        amountReconciledDirection,
        amountUnreconciled,
        amountUnreconciledDirection,
        amountUpperBound,
        counterpartyId,
        currency,
        dateLowerBound,
        dateUpperBound,
        description,
        direction,
        externalId,
        internalAccountId,
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
        mutableMapOf(),
    )

    /**
     * The lowest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountLowerBound(): Long? = amountLowerBound.getNullable("amount_lower_bound")

    /**
     * The amount reconciled for this expected payment. Value in specified currency's smallest unit.
     * e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountReconciled(): Long? = amountReconciled.getNullable("amount_reconciled")

    /**
     * One of credit or debit. Indicates whether amount_reconciled is a credit or debit amount.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountReconciledDirection(): AmountReconciledDirection? =
        amountReconciledDirection.getNullable("amount_reconciled_direction")

    /**
     * The amount that remains unreconciled for this expected payment. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountUnreconciled(): Long? = amountUnreconciled.getNullable("amount_unreconciled")

    /**
     * One of credit or debit. Indicates whether amount_unreconciled is a credit or debit amount.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountUnreconciledDirection(): AmountUnreconciledDirection? =
        amountUnreconciledDirection.getNullable("amount_unreconciled_direction")

    /**
     * The highest amount this expected payment may be equal to. Value in specified currency's
     * smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountUpperBound(): Long? = amountUpperBound.getNullable("amount_upper_bound")

    /**
     * The ID of the counterparty you expect for this payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /**
     * Must conform to ISO 4217. Defaults to the currency of the internal account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = currency.getNullable("currency")

    /**
     * The earliest date the payment may come in. Format: yyyy-mm-dd
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateLowerBound(): LocalDate? = dateLowerBound.getNullable("date_lower_bound")

    /**
     * The latest date the payment may come in. Format: yyyy-mm-dd
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dateUpperBound(): LocalDate? = dateUpperBound.getNullable("date_upper_bound")

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * One of credit or debit. When you are receiving money, use credit. When you are being charged,
     * use debit.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): Direction? = direction.getNullable("direction")

    /**
     * An optional user-defined 180 character unique identifier.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * The ID of the Internal Account for the expected payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun internalAccountId(): String? = internalAccountId.getNullable("internal_account_id")

    /**
     * Specifies a ledger transaction object that will be created with the expected payment. If the
     * ledger transaction cannot be created, then the expected payment creation will fail. The
     * resulting ledger transaction will mirror the status of the expected payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransaction(): LedgerTransactionCreateRequest? =
        ledgerTransaction.getNullable("ledger_transaction")

    /**
     * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
     * transaction can be attached upon expected payment creation. Once the expected payment is
     * created, the status of the ledger transaction tracks the expected payment automatically.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem>? = lineItems.getNullable("line_items")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /** The reconciliation filters you have for this payment. */
    @JsonProperty("reconciliation_filters")
    @ExcludeMissing
    fun _reconciliationFilters(): JsonValue = reconciliationFilters

    /** The reconciliation groups you have for this payment. */
    @JsonProperty("reconciliation_groups")
    @ExcludeMissing
    fun _reconciliationGroups(): JsonValue = reconciliationGroups

    /**
     * An array of reconciliation rule variables for this payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationRuleVariables(): List<ReconciliationRule>? =
        reconciliationRuleVariables.getNullable("reconciliation_rule_variables")

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittance_information")

    /**
     * The statement description you expect to see on the transaction. For ACH payments, this will
     * be the full line item passed from the bank. For wire payments, this will be the OBI field on
     * the wire. For check payments, this will be the memo field.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): ExpectedPaymentType? = type.getNullable("type")

    /**
     * Returns the raw JSON value of [amountLowerBound].
     *
     * Unlike [amountLowerBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("amount_lower_bound")
    @ExcludeMissing
    fun _amountLowerBound(): JsonField<Long> = amountLowerBound

    /**
     * Returns the raw JSON value of [amountReconciled].
     *
     * Unlike [amountReconciled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("amount_reconciled")
    @ExcludeMissing
    fun _amountReconciled(): JsonField<Long> = amountReconciled

    /**
     * Returns the raw JSON value of [amountReconciledDirection].
     *
     * Unlike [amountReconciledDirection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("amount_reconciled_direction")
    @ExcludeMissing
    fun _amountReconciledDirection(): JsonField<AmountReconciledDirection> =
        amountReconciledDirection

    /**
     * Returns the raw JSON value of [amountUnreconciled].
     *
     * Unlike [amountUnreconciled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("amount_unreconciled")
    @ExcludeMissing
    fun _amountUnreconciled(): JsonField<Long> = amountUnreconciled

    /**
     * Returns the raw JSON value of [amountUnreconciledDirection].
     *
     * Unlike [amountUnreconciledDirection], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("amount_unreconciled_direction")
    @ExcludeMissing
    fun _amountUnreconciledDirection(): JsonField<AmountUnreconciledDirection> =
        amountUnreconciledDirection

    /**
     * Returns the raw JSON value of [amountUpperBound].
     *
     * Unlike [amountUpperBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("amount_upper_bound")
    @ExcludeMissing
    fun _amountUpperBound(): JsonField<Long> = amountUpperBound

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [dateLowerBound].
     *
     * Unlike [dateLowerBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_lower_bound")
    @ExcludeMissing
    fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

    /**
     * Returns the raw JSON value of [dateUpperBound].
     *
     * Unlike [dateUpperBound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_upper_bound")
    @ExcludeMissing
    fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * Returns the raw JSON value of [ledgerTransaction].
     *
     * Unlike [ledgerTransaction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction")
    @ExcludeMissing
    fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

    /**
     * Returns the raw JSON value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [reconciliationRuleVariables].
     *
     * Unlike [reconciliationRuleVariables], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reconciliation_rule_variables")
    @ExcludeMissing
    fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
        reconciliationRuleVariables

    /**
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /**
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor(): JsonField<String> = statementDescriptor

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ExpectedPaymentCreate]. */
        fun builder() = Builder()
    }

    /** A builder for [ExpectedPaymentCreate]. */
    class Builder internal constructor() {

        private var amountLowerBound: JsonField<Long> = JsonMissing.of()
        private var amountReconciled: JsonField<Long> = JsonMissing.of()
        private var amountReconciledDirection: JsonField<AmountReconciledDirection> =
            JsonMissing.of()
        private var amountUnreconciled: JsonField<Long> = JsonMissing.of()
        private var amountUnreconciledDirection: JsonField<AmountUnreconciledDirection> =
            JsonMissing.of()
        private var amountUpperBound: JsonField<Long> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
        private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var reconciliationFilters: JsonValue = JsonMissing.of()
        private var reconciliationGroups: JsonValue = JsonMissing.of()
        private var reconciliationRuleVariables: JsonField<MutableList<ReconciliationRule>>? = null
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var statementDescriptor: JsonField<String> = JsonMissing.of()
        private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(expectedPaymentCreate: ExpectedPaymentCreate) = apply {
            amountLowerBound = expectedPaymentCreate.amountLowerBound
            amountReconciled = expectedPaymentCreate.amountReconciled
            amountReconciledDirection = expectedPaymentCreate.amountReconciledDirection
            amountUnreconciled = expectedPaymentCreate.amountUnreconciled
            amountUnreconciledDirection = expectedPaymentCreate.amountUnreconciledDirection
            amountUpperBound = expectedPaymentCreate.amountUpperBound
            counterpartyId = expectedPaymentCreate.counterpartyId
            currency = expectedPaymentCreate.currency
            dateLowerBound = expectedPaymentCreate.dateLowerBound
            dateUpperBound = expectedPaymentCreate.dateUpperBound
            description = expectedPaymentCreate.description
            direction = expectedPaymentCreate.direction
            externalId = expectedPaymentCreate.externalId
            internalAccountId = expectedPaymentCreate.internalAccountId
            ledgerTransaction = expectedPaymentCreate.ledgerTransaction
            ledgerTransactionId = expectedPaymentCreate.ledgerTransactionId
            lineItems = expectedPaymentCreate.lineItems.map { it.toMutableList() }
            metadata = expectedPaymentCreate.metadata
            reconciliationFilters = expectedPaymentCreate.reconciliationFilters
            reconciliationGroups = expectedPaymentCreate.reconciliationGroups
            reconciliationRuleVariables =
                expectedPaymentCreate.reconciliationRuleVariables.map { it.toMutableList() }
            remittanceInformation = expectedPaymentCreate.remittanceInformation
            statementDescriptor = expectedPaymentCreate.statementDescriptor
            type = expectedPaymentCreate.type
            additionalProperties = expectedPaymentCreate.additionalProperties.toMutableMap()
        }

        /**
         * The lowest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountLowerBound(amountLowerBound: Long?) =
            amountLowerBound(JsonField.ofNullable(amountLowerBound))

        /**
         * Alias for [Builder.amountLowerBound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountLowerBound(amountLowerBound: Long) = amountLowerBound(amountLowerBound as Long?)

        /**
         * Sets [Builder.amountLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountLowerBound] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
            this.amountLowerBound = amountLowerBound
        }

        /**
         * The amount reconciled for this expected payment. Value in specified currency's smallest
         * unit. e.g. $10 would be represented as 1000.
         */
        fun amountReconciled(amountReconciled: Long?) =
            amountReconciled(JsonField.ofNullable(amountReconciled))

        /**
         * Alias for [Builder.amountReconciled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountReconciled(amountReconciled: Long) = amountReconciled(amountReconciled as Long?)

        /**
         * Sets [Builder.amountReconciled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountReconciled] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountReconciled(amountReconciled: JsonField<Long>) = apply {
            this.amountReconciled = amountReconciled
        }

        /**
         * One of credit or debit. Indicates whether amount_reconciled is a credit or debit amount.
         */
        fun amountReconciledDirection(amountReconciledDirection: AmountReconciledDirection?) =
            amountReconciledDirection(JsonField.ofNullable(amountReconciledDirection))

        /**
         * Sets [Builder.amountReconciledDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountReconciledDirection] with a well-typed
         * [AmountReconciledDirection] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun amountReconciledDirection(
            amountReconciledDirection: JsonField<AmountReconciledDirection>
        ) = apply { this.amountReconciledDirection = amountReconciledDirection }

        /**
         * The amount that remains unreconciled for this expected payment. Value in specified
         * currency's smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUnreconciled(amountUnreconciled: Long?) =
            amountUnreconciled(JsonField.ofNullable(amountUnreconciled))

        /**
         * Alias for [Builder.amountUnreconciled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountUnreconciled(amountUnreconciled: Long) =
            amountUnreconciled(amountUnreconciled as Long?)

        /**
         * Sets [Builder.amountUnreconciled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountUnreconciled] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountUnreconciled(amountUnreconciled: JsonField<Long>) = apply {
            this.amountUnreconciled = amountUnreconciled
        }

        /**
         * One of credit or debit. Indicates whether amount_unreconciled is a credit or debit
         * amount.
         */
        fun amountUnreconciledDirection(amountUnreconciledDirection: AmountUnreconciledDirection?) =
            amountUnreconciledDirection(JsonField.ofNullable(amountUnreconciledDirection))

        /**
         * Sets [Builder.amountUnreconciledDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountUnreconciledDirection] with a well-typed
         * [AmountUnreconciledDirection] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun amountUnreconciledDirection(
            amountUnreconciledDirection: JsonField<AmountUnreconciledDirection>
        ) = apply { this.amountUnreconciledDirection = amountUnreconciledDirection }

        /**
         * The highest amount this expected payment may be equal to. Value in specified currency's
         * smallest unit. e.g. $10 would be represented as 1000.
         */
        fun amountUpperBound(amountUpperBound: Long?) =
            amountUpperBound(JsonField.ofNullable(amountUpperBound))

        /**
         * Alias for [Builder.amountUpperBound].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun amountUpperBound(amountUpperBound: Long) = amountUpperBound(amountUpperBound as Long?)

        /**
         * Sets [Builder.amountUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountUpperBound] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
            this.amountUpperBound = amountUpperBound
        }

        /** The ID of the counterparty you expect for this payment. */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The earliest date the payment may come in. Format: yyyy-mm-dd */
        fun dateLowerBound(dateLowerBound: LocalDate?) =
            dateLowerBound(JsonField.ofNullable(dateLowerBound))

        /**
         * Sets [Builder.dateLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLowerBound] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
            this.dateLowerBound = dateLowerBound
        }

        /** The latest date the payment may come in. Format: yyyy-mm-dd */
        fun dateUpperBound(dateUpperBound: LocalDate?) =
            dateUpperBound(JsonField.ofNullable(dateUpperBound))

        /**
         * Sets [Builder.dateUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpperBound] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
            this.dateUpperBound = dateUpperBound
        }

        /** An optional description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * One of credit or debit. When you are receiving money, use credit. When you are being
         * charged, use debit.
         */
        fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** An optional user-defined 180 character unique identifier. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The ID of the Internal Account for the expected payment. */
        fun internalAccountId(internalAccountId: String?) =
            internalAccountId(JsonField.ofNullable(internalAccountId))

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * Specifies a ledger transaction object that will be created with the expected payment. If
         * the ledger transaction cannot be created, then the expected payment creation will fail.
         * The resulting ledger transaction will mirror the status of the expected payment.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
            ledgerTransaction(JsonField.of(ledgerTransaction))

        /**
         * Sets [Builder.ledgerTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransaction] with a well-typed
         * [LedgerTransactionCreateRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ledgerTransaction(ledgerTransaction: JsonField<LedgerTransactionCreateRequest>) =
            apply {
                this.ledgerTransaction = ledgerTransaction
            }

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon expected payment creation. Once the expected payment is
         * created, the status of the ledger transaction tracks the expected payment automatically.
         */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /**
         * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The reconciliation filters you have for this payment. */
        fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
            this.reconciliationFilters = reconciliationFilters
        }

        /** The reconciliation groups you have for this payment. */
        fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
            this.reconciliationGroups = reconciliationGroups
        }

        /** An array of reconciliation rule variables for this payment. */
        fun reconciliationRuleVariables(reconciliationRuleVariables: List<ReconciliationRule>?) =
            reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

        /**
         * Sets [Builder.reconciliationRuleVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciliationRuleVariables] with a well-typed
         * `List<ReconciliationRule>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun reconciliationRuleVariables(
            reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
        ) = apply {
            this.reconciliationRuleVariables =
                reconciliationRuleVariables.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReconciliationRule] to [reconciliationRuleVariables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
         * signet, wire.
         */
        fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [ExpectedPaymentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

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

        /**
         * Returns an immutable instance of [ExpectedPaymentCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExpectedPaymentCreate =
            ExpectedPaymentCreate(
                amountLowerBound,
                amountReconciled,
                amountReconciledDirection,
                amountUnreconciled,
                amountUnreconciledDirection,
                amountUpperBound,
                counterpartyId,
                currency,
                dateLowerBound,
                dateUpperBound,
                description,
                direction,
                externalId,
                internalAccountId,
                ledgerTransaction,
                ledgerTransactionId,
                (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                metadata,
                reconciliationFilters,
                reconciliationGroups,
                (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                remittanceInformation,
                statementDescriptor,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExpectedPaymentCreate = apply {
        if (validated) {
            return@apply
        }

        amountLowerBound()
        amountReconciled()
        amountReconciledDirection()?.validate()
        amountUnreconciled()
        amountUnreconciledDirection()?.validate()
        amountUpperBound()
        counterpartyId()
        currency()?.validate()
        dateLowerBound()
        dateUpperBound()
        description()
        direction()?.validate()
        externalId()
        internalAccountId()
        ledgerTransaction()?.validate()
        ledgerTransactionId()
        lineItems()?.forEach { it.validate() }
        metadata()?.validate()
        reconciliationRuleVariables()?.forEach { it.validate() }
        remittanceInformation()
        statementDescriptor()
        type()?.validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: ModernTreasuryInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (amountLowerBound.asKnown() == null) 0 else 1) +
            (if (amountReconciled.asKnown() == null) 0 else 1) +
            (amountReconciledDirection.asKnown()?.validity() ?: 0) +
            (if (amountUnreconciled.asKnown() == null) 0 else 1) +
            (amountUnreconciledDirection.asKnown()?.validity() ?: 0) +
            (if (amountUpperBound.asKnown() == null) 0 else 1) +
            (if (counterpartyId.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (dateLowerBound.asKnown() == null) 0 else 1) +
            (if (dateUpperBound.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (direction.asKnown()?.validity() ?: 0) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (internalAccountId.asKnown() == null) 0 else 1) +
            (ledgerTransaction.asKnown()?.validity() ?: 0) +
            (if (ledgerTransactionId.asKnown() == null) 0 else 1) +
            (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown()?.validity() ?: 0) +
            (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (remittanceInformation.asKnown() == null) 0 else 1) +
            (if (statementDescriptor.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    /** One of credit or debit. Indicates whether amount_reconciled is a credit or debit amount. */
    class AmountReconciledDirection
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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = AmountReconciledDirection(JsonField.of(value))
        }

        /** An enum containing [AmountReconciledDirection]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [AmountReconciledDirection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AmountReconciledDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [AmountReconciledDirection] was instantiated with an
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
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown AmountReconciledDirection: $value"
                    )
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

        private var validated: Boolean = false

        fun validate(): AmountReconciledDirection = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmountReconciledDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * One of credit or debit. Indicates whether amount_unreconciled is a credit or debit amount.
     */
    class AmountUnreconciledDirection
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

            val CREDIT = of("credit")

            val DEBIT = of("debit")

            fun of(value: String) = AmountUnreconciledDirection(JsonField.of(value))
        }

        /** An enum containing [AmountUnreconciledDirection]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [AmountUnreconciledDirection]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AmountUnreconciledDirection] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [AmountUnreconciledDirection] was instantiated with an
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
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown AmountUnreconciledDirection: $value"
                    )
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

        private var validated: Boolean = false

        fun validate(): AmountUnreconciledDirection = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AmountUnreconciledDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        private var validated: Boolean = false

        fun validate(): Direction = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpectedPaymentCreate &&
            amountLowerBound == other.amountLowerBound &&
            amountReconciled == other.amountReconciled &&
            amountReconciledDirection == other.amountReconciledDirection &&
            amountUnreconciled == other.amountUnreconciled &&
            amountUnreconciledDirection == other.amountUnreconciledDirection &&
            amountUpperBound == other.amountUpperBound &&
            counterpartyId == other.counterpartyId &&
            currency == other.currency &&
            dateLowerBound == other.dateLowerBound &&
            dateUpperBound == other.dateUpperBound &&
            description == other.description &&
            direction == other.direction &&
            externalId == other.externalId &&
            internalAccountId == other.internalAccountId &&
            ledgerTransaction == other.ledgerTransaction &&
            ledgerTransactionId == other.ledgerTransactionId &&
            lineItems == other.lineItems &&
            metadata == other.metadata &&
            reconciliationFilters == other.reconciliationFilters &&
            reconciliationGroups == other.reconciliationGroups &&
            reconciliationRuleVariables == other.reconciliationRuleVariables &&
            remittanceInformation == other.remittanceInformation &&
            statementDescriptor == other.statementDescriptor &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amountLowerBound,
            amountReconciled,
            amountReconciledDirection,
            amountUnreconciled,
            amountUnreconciledDirection,
            amountUpperBound,
            counterpartyId,
            currency,
            dateLowerBound,
            dateUpperBound,
            description,
            direction,
            externalId,
            internalAccountId,
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExpectedPaymentCreate{amountLowerBound=$amountLowerBound, amountReconciled=$amountReconciled, amountReconciledDirection=$amountReconciledDirection, amountUnreconciled=$amountUnreconciled, amountUnreconciledDirection=$amountUnreconciledDirection, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, externalId=$externalId, internalAccountId=$internalAccountId, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalProperties=$additionalProperties}"
}
