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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ExpectedPayment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amountLowerBound: JsonField<Long>,
    private val amountReconciled: JsonField<Long>,
    private val amountReconciledDirection: JsonField<AmountReconciledDirection>,
    private val amountUnreconciled: JsonField<Long>,
    private val amountUnreconciledDirection: JsonField<AmountUnreconciledDirection>,
    private val amountUpperBound: JsonField<Long>,
    private val counterpartyId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val dateLowerBound: JsonField<LocalDate>,
    private val dateUpperBound: JsonField<LocalDate>,
    private val description: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val externalId: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val ledgerTransactionId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val reconciliationFilters: JsonValue,
    private val reconciliationGroups: JsonValue,
    private val reconciliationMethod: JsonField<ReconciliationMethod>,
    private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>>,
    private val remittanceInformation: JsonField<String>,
    private val statementDescriptor: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val transactionLineItemId: JsonField<String>,
    private val type: JsonField<ExpectedPaymentType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        ledgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reconciliation_filters")
        @ExcludeMissing
        reconciliationFilters: JsonValue = JsonMissing.of(),
        @JsonProperty("reconciliation_groups")
        @ExcludeMissing
        reconciliationGroups: JsonValue = JsonMissing.of(),
        @JsonProperty("reconciliation_method")
        @ExcludeMissing
        reconciliationMethod: JsonField<ReconciliationMethod> = JsonMissing.of(),
        @JsonProperty("reconciliation_rule_variables")
        @ExcludeMissing
        reconciliationRuleVariables: JsonField<List<ReconciliationRule>> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        statementDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        transactionLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        amountLowerBound,
        amountReconciled,
        amountReconciledDirection,
        amountUnreconciled,
        amountUnreconciledDirection,
        amountUpperBound,
        counterpartyId,
        createdAt,
        currency,
        dateLowerBound,
        dateUpperBound,
        description,
        direction,
        externalId,
        internalAccountId,
        ledgerTransactionId,
        liveMode,
        metadata,
        object_,
        reconciliationFilters,
        reconciliationGroups,
        reconciliationMethod,
        reconciliationRuleVariables,
        remittanceInformation,
        statementDescriptor,
        status,
        transactionId,
        transactionLineItemId,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

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
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * The ID of the ledger transaction linked to the expected payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
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
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationMethod(): ReconciliationMethod? =
        reconciliationMethod.getNullable("reconciliation_method")

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
     * One of unreconciled, partially_reconciled, reconciled, or archived.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID of the Transaction this expected payment object has been matched to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * The ID of the Transaction Line Item this expected payment has been matched to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /**
     * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa, signet,
     * wire.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): ExpectedPaymentType? = type.getNullable("type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [reconciliationMethod].
     *
     * Unlike [reconciliationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reconciliation_method")
    @ExcludeMissing
    fun _reconciliationMethod(): JsonField<ReconciliationMethod> = reconciliationMethod

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [transactionLineItemId].
     *
     * Unlike [transactionLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /**
         * Returns a mutable builder for constructing an instance of [ExpectedPayment].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountLowerBound()
         * .amountReconciled()
         * .amountReconciledDirection()
         * .amountUnreconciled()
         * .amountUnreconciledDirection()
         * .amountUpperBound()
         * .counterpartyId()
         * .createdAt()
         * .currency()
         * .dateLowerBound()
         * .dateUpperBound()
         * .description()
         * .direction()
         * .externalId()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .reconciliationFilters()
         * .reconciliationGroups()
         * .reconciliationMethod()
         * .reconciliationRuleVariables()
         * .remittanceInformation()
         * .statementDescriptor()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExpectedPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountLowerBound: JsonField<Long>? = null
        private var amountReconciled: JsonField<Long>? = null
        private var amountReconciledDirection: JsonField<AmountReconciledDirection>? = null
        private var amountUnreconciled: JsonField<Long>? = null
        private var amountUnreconciledDirection: JsonField<AmountUnreconciledDirection>? = null
        private var amountUpperBound: JsonField<Long>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var dateLowerBound: JsonField<LocalDate>? = null
        private var dateUpperBound: JsonField<LocalDate>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var externalId: JsonField<String>? = null
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
            amountReconciled = expectedPayment.amountReconciled
            amountReconciledDirection = expectedPayment.amountReconciledDirection
            amountUnreconciled = expectedPayment.amountUnreconciled
            amountUnreconciledDirection = expectedPayment.amountUnreconciledDirection
            amountUpperBound = expectedPayment.amountUpperBound
            counterpartyId = expectedPayment.counterpartyId
            createdAt = expectedPayment.createdAt
            currency = expectedPayment.currency
            dateLowerBound = expectedPayment.dateLowerBound
            dateUpperBound = expectedPayment.dateUpperBound
            description = expectedPayment.description
            direction = expectedPayment.direction
            externalId = expectedPayment.externalId
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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /** The ID of the ledger transaction linked to the expected payment. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

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

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

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

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
         * Sets [Builder.reconciliationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciliationMethod] with a well-typed
         * [ReconciliationMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun reconciliationMethod(reconciliationMethod: JsonField<ReconciliationMethod>) = apply {
            this.reconciliationMethod = reconciliationMethod
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

        /** One of unreconciled, partially_reconciled, reconciled, or archived. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the Transaction this expected payment object has been matched to. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the Transaction Line Item this expected payment has been matched to. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /**
         * Sets [Builder.transactionLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [ExpectedPayment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountLowerBound()
         * .amountReconciled()
         * .amountReconciledDirection()
         * .amountUnreconciled()
         * .amountUnreconciledDirection()
         * .amountUpperBound()
         * .counterpartyId()
         * .createdAt()
         * .currency()
         * .dateLowerBound()
         * .dateUpperBound()
         * .description()
         * .direction()
         * .externalId()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .reconciliationFilters()
         * .reconciliationGroups()
         * .reconciliationMethod()
         * .reconciliationRuleVariables()
         * .remittanceInformation()
         * .statementDescriptor()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExpectedPayment =
            ExpectedPayment(
                checkRequired("id", id),
                checkRequired("amountLowerBound", amountLowerBound),
                checkRequired("amountReconciled", amountReconciled),
                checkRequired("amountReconciledDirection", amountReconciledDirection),
                checkRequired("amountUnreconciled", amountUnreconciled),
                checkRequired("amountUnreconciledDirection", amountUnreconciledDirection),
                checkRequired("amountUpperBound", amountUpperBound),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("dateLowerBound", dateLowerBound),
                checkRequired("dateUpperBound", dateUpperBound),
                checkRequired("description", description),
                checkRequired("direction", direction),
                checkRequired("externalId", externalId),
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExpectedPayment = apply {
        if (validated) {
            return@apply
        }

        id()
        amountLowerBound()
        amountReconciled()
        amountReconciledDirection()?.validate()
        amountUnreconciled()
        amountUnreconciledDirection()?.validate()
        amountUpperBound()
        counterpartyId()
        createdAt()
        currency()?.validate()
        dateLowerBound()
        dateUpperBound()
        description()
        direction()?.validate()
        externalId()
        internalAccountId()
        ledgerTransactionId()
        liveMode()
        metadata().validate()
        object_()
        reconciliationMethod()?.validate()
        reconciliationRuleVariables()?.forEach { it.validate() }
        remittanceInformation()
        statementDescriptor()
        status().validate()
        transactionId()
        transactionLineItemId()
        type()?.validate()
        updatedAt()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (amountLowerBound.asKnown() == null) 0 else 1) +
            (if (amountReconciled.asKnown() == null) 0 else 1) +
            (amountReconciledDirection.asKnown()?.validity() ?: 0) +
            (if (amountUnreconciled.asKnown() == null) 0 else 1) +
            (amountUnreconciledDirection.asKnown()?.validity() ?: 0) +
            (if (amountUpperBound.asKnown() == null) 0 else 1) +
            (if (counterpartyId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (if (dateLowerBound.asKnown() == null) 0 else 1) +
            (if (dateUpperBound.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (direction.asKnown()?.validity() ?: 0) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (if (internalAccountId.asKnown() == null) 0 else 1) +
            (if (ledgerTransactionId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (object_.asKnown() == null) 0 else 1) +
            (reconciliationMethod.asKnown()?.validity() ?: 0) +
            (reconciliationRuleVariables.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (remittanceInformation.asKnown() == null) 0 else 1) +
            (if (statementDescriptor.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (transactionId.asKnown() == null) 0 else 1) +
            (if (transactionLineItemId.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

        private var validated: Boolean = false

        fun validate(): ReconciliationMethod = apply {
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

            return other is ReconciliationMethod && value == other.value
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpectedPayment &&
            id == other.id &&
            amountLowerBound == other.amountLowerBound &&
            amountReconciled == other.amountReconciled &&
            amountReconciledDirection == other.amountReconciledDirection &&
            amountUnreconciled == other.amountUnreconciled &&
            amountUnreconciledDirection == other.amountUnreconciledDirection &&
            amountUpperBound == other.amountUpperBound &&
            counterpartyId == other.counterpartyId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            dateLowerBound == other.dateLowerBound &&
            dateUpperBound == other.dateUpperBound &&
            description == other.description &&
            direction == other.direction &&
            externalId == other.externalId &&
            internalAccountId == other.internalAccountId &&
            ledgerTransactionId == other.ledgerTransactionId &&
            liveMode == other.liveMode &&
            metadata == other.metadata &&
            object_ == other.object_ &&
            reconciliationFilters == other.reconciliationFilters &&
            reconciliationGroups == other.reconciliationGroups &&
            reconciliationMethod == other.reconciliationMethod &&
            reconciliationRuleVariables == other.reconciliationRuleVariables &&
            remittanceInformation == other.remittanceInformation &&
            statementDescriptor == other.statementDescriptor &&
            status == other.status &&
            transactionId == other.transactionId &&
            transactionLineItemId == other.transactionLineItemId &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amountLowerBound,
            amountReconciled,
            amountReconciledDirection,
            amountUnreconciled,
            amountUnreconciledDirection,
            amountUpperBound,
            counterpartyId,
            createdAt,
            currency,
            dateLowerBound,
            dateUpperBound,
            description,
            direction,
            externalId,
            internalAccountId,
            ledgerTransactionId,
            liveMode,
            metadata,
            object_,
            reconciliationFilters,
            reconciliationGroups,
            reconciliationMethod,
            reconciliationRuleVariables,
            remittanceInformation,
            statementDescriptor,
            status,
            transactionId,
            transactionLineItemId,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExpectedPayment{id=$id, amountLowerBound=$amountLowerBound, amountReconciled=$amountReconciled, amountReconciledDirection=$amountReconciledDirection, amountUnreconciled=$amountUnreconciled, amountUnreconciledDirection=$amountUnreconciledDirection, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, externalId=$externalId, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationMethod=$reconciliationMethod, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
