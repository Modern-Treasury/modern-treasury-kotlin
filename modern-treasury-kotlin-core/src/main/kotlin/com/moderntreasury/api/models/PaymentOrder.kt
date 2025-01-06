// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.BaseDeserializer
import com.moderntreasury.api.core.BaseSerializer
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PaymentOrder
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounting")
    @ExcludeMissing
    private val accounting: JsonField<Accounting> = JsonMissing.of(),
    @JsonProperty("accounting_category_id")
    @ExcludeMissing
    private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounting_ledger_class_id")
    @ExcludeMissing
    private val accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("charge_bearer")
    @ExcludeMissing
    private val chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
    @JsonProperty("compliance_rule_metadata")
    @ExcludeMissing
    private val complianceRuleMetadata: JsonField<ComplianceRuleMetadata> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("current_return")
    @ExcludeMissing
    private val currentReturn: JsonField<ReturnObject> = JsonMissing.of(),
    @JsonProperty("decision_id")
    @ExcludeMissing
    private val decisionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_contract")
    @ExcludeMissing
    private val foreignExchangeContract: JsonField<String> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    private val foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("nsf_protected")
    @ExcludeMissing
    private val nsfProtected: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    private val originatingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_party_name")
    @ExcludeMissing
    private val originatingPartyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("priority")
    @ExcludeMissing
    private val priority: JsonField<Priority> = JsonMissing.of(),
    @JsonProperty("process_after")
    @ExcludeMissing
    private val processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("purpose")
    @ExcludeMissing
    private val purpose: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    private val receivingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiving_account_type")
    @ExcludeMissing
    private val receivingAccountType: JsonField<ReceivingAccountType> = JsonMissing.of(),
    @JsonProperty("reference_numbers")
    @ExcludeMissing
    private val referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of(),
    @JsonProperty("remittance_information")
    @ExcludeMissing
    private val remittanceInformation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    private val statementDescriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("subtype")
    @ExcludeMissing
    private val subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
    @JsonProperty("transaction_ids")
    @ExcludeMissing
    private val transactionIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("transaction_monitoring_enabled")
    @ExcludeMissing
    private val transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("type")
    @ExcludeMissing
    private val type: JsonField<PaymentOrderType> = JsonMissing.of(),
    @JsonProperty("ultimate_originating_account")
    @ExcludeMissing
    private val ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount> =
        JsonMissing.of(),
    @JsonProperty("ultimate_originating_account_id")
    @ExcludeMissing
    private val ultimateOriginatingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ultimate_originating_account_type")
    @ExcludeMissing
    private val ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType> =
        JsonMissing.of(),
    @JsonProperty("ultimate_originating_party_identifier")
    @ExcludeMissing
    private val ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ultimate_originating_party_name")
    @ExcludeMissing
    private val ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ultimate_receiving_party_identifier")
    @ExcludeMissing
    private val ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ultimate_receiving_party_name")
    @ExcludeMissing
    private val ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("vendor_attributes")
    @ExcludeMissing
    private val vendorAttributes: JsonValue = JsonMissing.of(),
    @JsonProperty("vendor_failure_reason")
    @ExcludeMissing
    private val vendorFailureReason: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun accounting(): Accounting = accounting.getRequired("accounting")

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     */
    fun accountingCategoryId(): String? = accountingCategoryId.getNullable("accounting_category_id")

    /**
     * The ID of one of your accounting ledger classes. Note that these will only be accessible if
     * your accounting system has been connected.
     */
    fun accountingLedgerClassId(): String? =
        accountingLedgerClassId.getNullable("accounting_ledger_class_id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000 (cents).
     * For RTP, the maximum amount allowed by the network is $100,000.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
     */
    fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

    /**
     * Custom key-value pair for usage in compliance rules. Please contact support before making
     * changes to this field.
     */
    fun complianceRuleMetadata(): ComplianceRuleMetadata? =
        complianceRuleMetadata.getNullable("compliance_rule_metadata")

    /**
     * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
     * `null`.
     */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Defaults to the currency of the originating account. */
    fun currency(): Currency = currency.getRequired("currency")

    /** If the payment order's status is `returned`, this will include the return object's data. */
    fun currentReturn(): ReturnObject? = currentReturn.getNullable("current_return")

    /**
     * The ID of the compliance decision for the payment order, if transaction monitoring is
     * enabled.
     */
    fun decisionId(): String? = decisionId.getNullable("decision_id")

    /** An optional description for internal use. */
    fun description(): String? = description.getNullable("description")

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /** RFP payments require an expires_at. This value must be past the effective_date. */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

    /**
     * If present, indicates a specific foreign exchange contract number that has been generated by
     * your financial institution.
     */
    fun foreignExchangeContract(): String? =
        foreignExchangeContract.getNullable("foreign_exchange_contract")

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     */
    fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
        foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

    /** Associated serialized foreign exchange rate information. */
    fun foreignExchangeRate(): ForeignExchangeRate? =
        foreignExchangeRate.getNullable("foreign_exchange_rate")

    /** The ID of the ledger transaction linked to the payment order. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * A boolean to determine if NSF Protection is enabled for this payment order. Note that this
     * setting must also be turned on in your organization settings page.
     */
    fun nsfProtected(): Boolean = nsfProtected.getRequired("nsf_protected")

    fun object_(): String = object_.getRequired("object")

    /** The ID of one of your organization's internal accounts. */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /**
     * If present, this will replace your default company name on receiver's bank statement. This
     * field can only be used for ACH payments currently. For ACH, only the first 16 characters of
     * this string will be used. Any additional characters will be truncated.
     */
    fun originatingPartyName(): String? = originatingPartyName.getNullable("originating_party_name")

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    fun priority(): Priority = priority.getRequired("priority")

    /**
     * If present, Modern Treasury will not process the payment until after this time. If
     * `process_after` is past the cutoff for `effective_date`, `process_after` will take precedence
     * and `effective_date` will automatically update to reflect the earliest possible sending date
     * after `process_after`. Format is ISO8601 timestamp.
     */
    fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

    /**
     * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt" field
     * in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be attached to
     * the payment.
     */
    fun purpose(): String? = purpose.getNullable("purpose")

    /** The receiving account ID. Can be an `external_account` or `internal_account`. */
    fun receivingAccountId(): String = receivingAccountId.getRequired("receiving_account_id")

    fun receivingAccountType(): ReceivingAccountType =
        receivingAccountType.getRequired("receiving_account_type")

    fun referenceNumbers(): List<PaymentReference> =
        referenceNumbers.getRequired("reference_numbers")

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittance_information")

    /**
     * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
     * `send_remittance_advice` on the Counterparty is used.
     */
    fun sendRemittanceAdvice(): Boolean? =
        sendRemittanceAdvice.getNullable("send_remittance_advice")

    /**
     * An optional descriptor which will appear in the receiver's statement. For `check` payments
     * this field will be used as the memo line. For `ach` the maximum length is 10 characters. Note
     * that for ACH payments, the name on your bank account will be included automatically by the
     * bank, so you can use the characters for other useful information. For `eft` the maximum
     * length is 15 characters.
     */
    fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

    /** The current status of the payment order. */
    fun status(): Status = status.getRequired("status")

    /**
     * An additional layer of classification for the type of payment order you are doing. This field
     * is only used for `ach` payment orders currently. For `ach` payment orders, the `subtype`
     * represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and
     * `TEL`.
     */
    fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

    /**
     * The IDs of all the transactions associated to this payment order. Usually, you will only have
     * a single transaction ID. However, if a payment order initially results in a Return, but gets
     * redrafted and is later successfully completed, it can have many transactions.
     */
    fun transactionIds(): List<String> = transactionIds.getRequired("transaction_ids")

    /** A flag that determines whether a payment order should go through transaction monitoring. */
    fun transactionMonitoringEnabled(): Boolean =
        transactionMonitoringEnabled.getRequired("transaction_monitoring_enabled")

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     */
    fun type(): PaymentOrderType = type.getRequired("type")

    /**
     * The account to which the originating of this payment should be attributed to. Can be a
     * `virtual_account` or `internal_account`.
     */
    fun ultimateOriginatingAccount(): UltimateOriginatingAccount? =
        ultimateOriginatingAccount.getNullable("ultimate_originating_account")

    /** The ultimate originating account ID. Can be a `virtual_account` or `internal_account`. */
    fun ultimateOriginatingAccountId(): String? =
        ultimateOriginatingAccountId.getNullable("ultimate_originating_account_id")

    fun ultimateOriginatingAccountType(): UltimateOriginatingAccountType? =
        ultimateOriginatingAccountType.getNullable("ultimate_originating_account_type")

    /** Identifier of the ultimate originator of the payment order. */
    fun ultimateOriginatingPartyIdentifier(): String? =
        ultimateOriginatingPartyIdentifier.getNullable("ultimate_originating_party_identifier")

    /** Name of the ultimate originator of the payment order. */
    fun ultimateOriginatingPartyName(): String? =
        ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

    fun ultimateReceivingPartyIdentifier(): String? =
        ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

    fun ultimateReceivingPartyName(): String? =
        ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
     * value as it is free-form.
     */
    fun vendorFailureReason(): String? = vendorFailureReason.getNullable("vendor_failure_reason")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("accounting") @ExcludeMissing fun _accounting() = accounting

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     */
    @JsonProperty("accounting_category_id")
    @ExcludeMissing
    fun _accountingCategoryId() = accountingCategoryId

    /**
     * The ID of one of your accounting ledger classes. Note that these will only be accessible if
     * your accounting system has been connected.
     */
    @JsonProperty("accounting_ledger_class_id")
    @ExcludeMissing
    fun _accountingLedgerClassId() = accountingLedgerClassId

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000 (cents).
     * For RTP, the maximum amount allowed by the network is $100,000.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
     */
    @JsonProperty("charge_bearer") @ExcludeMissing fun _chargeBearer() = chargeBearer

    /**
     * Custom key-value pair for usage in compliance rules. Please contact support before making
     * changes to this field.
     */
    @JsonProperty("compliance_rule_metadata")
    @ExcludeMissing
    fun _complianceRuleMetadata() = complianceRuleMetadata

    /**
     * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
     * `null`.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Defaults to the currency of the originating account. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** If the payment order's status is `returned`, this will include the return object's data. */
    @JsonProperty("current_return") @ExcludeMissing fun _currentReturn() = currentReturn

    /**
     * The ID of the compliance decision for the payment order, if transaction monitoring is
     * enabled.
     */
    @JsonProperty("decision_id") @ExcludeMissing fun _decisionId() = decisionId

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    /** RFP payments require an expires_at. This value must be past the effective_date. */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /**
     * If present, indicates a specific foreign exchange contract number that has been generated by
     * your financial institution.
     */
    @JsonProperty("foreign_exchange_contract")
    @ExcludeMissing
    fun _foreignExchangeContract() = foreignExchangeContract

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator() = foreignExchangeIndicator

    /** Associated serialized foreign exchange rate information. */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate() = foreignExchangeRate

    /** The ID of the ledger transaction linked to the payment order. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * A boolean to determine if NSF Protection is enabled for this payment order. Note that this
     * setting must also be turned on in your organization settings page.
     */
    @JsonProperty("nsf_protected") @ExcludeMissing fun _nsfProtected() = nsfProtected

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The ID of one of your organization's internal accounts. */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId() = originatingAccountId

    /**
     * If present, this will replace your default company name on receiver's bank statement. This
     * field can only be used for ACH payments currently. For ACH, only the first 16 characters of
     * this string will be used. Any additional characters will be truncated.
     */
    @JsonProperty("originating_party_name")
    @ExcludeMissing
    fun _originatingPartyName() = originatingPartyName

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

    /**
     * If present, Modern Treasury will not process the payment until after this time. If
     * `process_after` is past the cutoff for `effective_date`, `process_after` will take precedence
     * and `effective_date` will automatically update to reflect the earliest possible sending date
     * after `process_after`. Format is ISO8601 timestamp.
     */
    @JsonProperty("process_after") @ExcludeMissing fun _processAfter() = processAfter

    /**
     * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt" field
     * in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be attached to
     * the payment.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose() = purpose

    /** The receiving account ID. Can be an `external_account` or `internal_account`. */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId() = receivingAccountId

    @JsonProperty("receiving_account_type")
    @ExcludeMissing
    fun _receivingAccountType() = receivingAccountType

    @JsonProperty("reference_numbers") @ExcludeMissing fun _referenceNumbers() = referenceNumbers

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /**
     * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
     * `send_remittance_advice` on the Counterparty is used.
     */
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    fun _sendRemittanceAdvice() = sendRemittanceAdvice

    /**
     * An optional descriptor which will appear in the receiver's statement. For `check` payments
     * this field will be used as the memo line. For `ach` the maximum length is 10 characters. Note
     * that for ACH payments, the name on your bank account will be included automatically by the
     * bank, so you can use the characters for other useful information. For `eft` the maximum
     * length is 15 characters.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor() = statementDescriptor

    /** The current status of the payment order. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * An additional layer of classification for the type of payment order you are doing. This field
     * is only used for `ach` payment orders currently. For `ach` payment orders, the `subtype`
     * represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and
     * `TEL`.
     */
    @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

    /**
     * The IDs of all the transactions associated to this payment order. Usually, you will only have
     * a single transaction ID. However, if a payment order initially results in a Return, but gets
     * redrafted and is later successfully completed, it can have many transactions.
     */
    @JsonProperty("transaction_ids") @ExcludeMissing fun _transactionIds() = transactionIds

    /** A flag that determines whether a payment order should go through transaction monitoring. */
    @JsonProperty("transaction_monitoring_enabled")
    @ExcludeMissing
    fun _transactionMonitoringEnabled() = transactionMonitoringEnabled

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * The account to which the originating of this payment should be attributed to. Can be a
     * `virtual_account` or `internal_account`.
     */
    @JsonProperty("ultimate_originating_account")
    @ExcludeMissing
    fun _ultimateOriginatingAccount() = ultimateOriginatingAccount

    /** The ultimate originating account ID. Can be a `virtual_account` or `internal_account`. */
    @JsonProperty("ultimate_originating_account_id")
    @ExcludeMissing
    fun _ultimateOriginatingAccountId() = ultimateOriginatingAccountId

    @JsonProperty("ultimate_originating_account_type")
    @ExcludeMissing
    fun _ultimateOriginatingAccountType() = ultimateOriginatingAccountType

    /** Identifier of the ultimate originator of the payment order. */
    @JsonProperty("ultimate_originating_party_identifier")
    @ExcludeMissing
    fun _ultimateOriginatingPartyIdentifier() = ultimateOriginatingPartyIdentifier

    /** Name of the ultimate originator of the payment order. */
    @JsonProperty("ultimate_originating_party_name")
    @ExcludeMissing
    fun _ultimateOriginatingPartyName() = ultimateOriginatingPartyName

    @JsonProperty("ultimate_receiving_party_identifier")
    @ExcludeMissing
    fun _ultimateReceivingPartyIdentifier() = ultimateReceivingPartyIdentifier

    @JsonProperty("ultimate_receiving_party_name")
    @ExcludeMissing
    fun _ultimateReceivingPartyName() = ultimateReceivingPartyName

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * Additional vendor specific fields for this payment. Data must be represented as key-value
     * pairs.
     */
    @JsonProperty("vendor_attributes") @ExcludeMissing fun _vendorAttributes() = vendorAttributes

    /**
     * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
     * value as it is free-form.
     */
    @JsonProperty("vendor_failure_reason")
    @ExcludeMissing
    fun _vendorFailureReason() = vendorFailureReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentOrder = apply {
        if (!validated) {
            id()
            accounting().validate()
            accountingCategoryId()
            accountingLedgerClassId()
            amount()
            chargeBearer()
            complianceRuleMetadata()?.validate()
            counterpartyId()
            createdAt()
            currency()
            currentReturn()?.validate()
            decisionId()
            description()
            direction()
            effectiveDate()
            expiresAt()
            foreignExchangeContract()
            foreignExchangeIndicator()
            foreignExchangeRate()?.validate()
            ledgerTransactionId()
            liveMode()
            metadata().validate()
            nsfProtected()
            object_()
            originatingAccountId()
            originatingPartyName()
            priority()
            processAfter()
            purpose()
            receivingAccountId()
            receivingAccountType()
            referenceNumbers().forEach { it.validate() }
            remittanceInformation()
            sendRemittanceAdvice()
            statementDescriptor()
            status()
            subtype()
            transactionIds()
            transactionMonitoringEnabled()
            type()
            ultimateOriginatingAccount()
            ultimateOriginatingAccountId()
            ultimateOriginatingAccountType()
            ultimateOriginatingPartyIdentifier()
            ultimateOriginatingPartyName()
            ultimateReceivingPartyIdentifier()
            ultimateReceivingPartyName()
            updatedAt()
            vendorFailureReason()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accounting: JsonField<Accounting> = JsonMissing.of()
        private var accountingCategoryId: JsonField<String> = JsonMissing.of()
        private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
        private var complianceRuleMetadata: JsonField<ComplianceRuleMetadata> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var currentReturn: JsonField<ReturnObject> = JsonMissing.of()
        private var decisionId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
        private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of()
        private var foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var originatingAccountId: JsonField<String> = JsonMissing.of()
        private var originatingPartyName: JsonField<String> = JsonMissing.of()
        private var priority: JsonField<Priority> = JsonMissing.of()
        private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
        private var purpose: JsonField<String> = JsonMissing.of()
        private var receivingAccountId: JsonField<String> = JsonMissing.of()
        private var receivingAccountType: JsonField<ReceivingAccountType> = JsonMissing.of()
        private var referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
        private var statementDescriptor: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
        private var transactionIds: JsonField<List<String>> = JsonMissing.of()
        private var transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<PaymentOrderType> = JsonMissing.of()
        private var ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount> =
            JsonMissing.of()
        private var ultimateOriginatingAccountId: JsonField<String> = JsonMissing.of()
        private var ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType> =
            JsonMissing.of()
        private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
        private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
        private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
        private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var vendorAttributes: JsonValue = JsonMissing.of()
        private var vendorFailureReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentOrder: PaymentOrder) = apply {
            id = paymentOrder.id
            accounting = paymentOrder.accounting
            accountingCategoryId = paymentOrder.accountingCategoryId
            accountingLedgerClassId = paymentOrder.accountingLedgerClassId
            amount = paymentOrder.amount
            chargeBearer = paymentOrder.chargeBearer
            complianceRuleMetadata = paymentOrder.complianceRuleMetadata
            counterpartyId = paymentOrder.counterpartyId
            createdAt = paymentOrder.createdAt
            currency = paymentOrder.currency
            currentReturn = paymentOrder.currentReturn
            decisionId = paymentOrder.decisionId
            description = paymentOrder.description
            direction = paymentOrder.direction
            effectiveDate = paymentOrder.effectiveDate
            expiresAt = paymentOrder.expiresAt
            foreignExchangeContract = paymentOrder.foreignExchangeContract
            foreignExchangeIndicator = paymentOrder.foreignExchangeIndicator
            foreignExchangeRate = paymentOrder.foreignExchangeRate
            ledgerTransactionId = paymentOrder.ledgerTransactionId
            liveMode = paymentOrder.liveMode
            metadata = paymentOrder.metadata
            nsfProtected = paymentOrder.nsfProtected
            object_ = paymentOrder.object_
            originatingAccountId = paymentOrder.originatingAccountId
            originatingPartyName = paymentOrder.originatingPartyName
            priority = paymentOrder.priority
            processAfter = paymentOrder.processAfter
            purpose = paymentOrder.purpose
            receivingAccountId = paymentOrder.receivingAccountId
            receivingAccountType = paymentOrder.receivingAccountType
            referenceNumbers = paymentOrder.referenceNumbers
            remittanceInformation = paymentOrder.remittanceInformation
            sendRemittanceAdvice = paymentOrder.sendRemittanceAdvice
            statementDescriptor = paymentOrder.statementDescriptor
            status = paymentOrder.status
            subtype = paymentOrder.subtype
            transactionIds = paymentOrder.transactionIds
            transactionMonitoringEnabled = paymentOrder.transactionMonitoringEnabled
            type = paymentOrder.type
            ultimateOriginatingAccount = paymentOrder.ultimateOriginatingAccount
            ultimateOriginatingAccountId = paymentOrder.ultimateOriginatingAccountId
            ultimateOriginatingAccountType = paymentOrder.ultimateOriginatingAccountType
            ultimateOriginatingPartyIdentifier = paymentOrder.ultimateOriginatingPartyIdentifier
            ultimateOriginatingPartyName = paymentOrder.ultimateOriginatingPartyName
            ultimateReceivingPartyIdentifier = paymentOrder.ultimateReceivingPartyIdentifier
            ultimateReceivingPartyName = paymentOrder.ultimateReceivingPartyName
            updatedAt = paymentOrder.updatedAt
            vendorAttributes = paymentOrder.vendorAttributes
            vendorFailureReason = paymentOrder.vendorFailureReason
            additionalProperties = paymentOrder.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

        fun accounting(accounting: JsonField<Accounting>) = apply { this.accounting = accounting }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountingCategoryId(accountingCategoryId: String) =
            accountingCategoryId(JsonField.of(accountingCategoryId))

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
            this.accountingCategoryId = accountingCategoryId
        }

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        fun accountingLedgerClassId(accountingLedgerClassId: String) =
            accountingLedgerClassId(JsonField.of(accountingLedgerClassId))

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
            this.accountingLedgerClassId = accountingLedgerClassId
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: ChargeBearer) = chargeBearer(JsonField.of(chargeBearer))

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
            this.chargeBearer = chargeBearer
        }

        /**
         * Custom key-value pair for usage in compliance rules. Please contact support before making
         * changes to this field.
         */
        fun complianceRuleMetadata(complianceRuleMetadata: ComplianceRuleMetadata) =
            complianceRuleMetadata(JsonField.of(complianceRuleMetadata))

        /**
         * Custom key-value pair for usage in compliance rules. Please contact support before making
         * changes to this field.
         */
        fun complianceRuleMetadata(complianceRuleMetadata: JsonField<ComplianceRuleMetadata>) =
            apply {
                this.complianceRuleMetadata = complianceRuleMetadata
            }

        /**
         * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
         * `null`.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
         * `null`.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Defaults to the currency of the originating account. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the payment order's status is `returned`, this will include the return object's data.
         */
        fun currentReturn(currentReturn: ReturnObject) = currentReturn(JsonField.of(currentReturn))

        /**
         * If the payment order's status is `returned`, this will include the return object's data.
         */
        fun currentReturn(currentReturn: JsonField<ReturnObject>) = apply {
            this.currentReturn = currentReturn
        }

        /**
         * The ID of the compliance decision for the payment order, if transaction monitoring is
         * enabled.
         */
        fun decisionId(decisionId: String) = decisionId(JsonField.of(decisionId))

        /**
         * The ID of the compliance decision for the payment order, if transaction monitoring is
         * enabled.
         */
        fun decisionId(decisionId: JsonField<String>) = apply { this.decisionId = decisionId }

        /** An optional description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: String) =
            foreignExchangeContract(JsonField.of(foreignExchangeContract))

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
            this.foreignExchangeContract = foreignExchangeContract
        }

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
            foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
        ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate) =
            foreignExchangeRate(JsonField.of(foreignExchangeRate))

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID of the ledger transaction linked to the payment order. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the payment order. */
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

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
            this.nsfProtected = nsfProtected
        }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: String) =
            originatingPartyName(JsonField.of(originatingPartyName))

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
            this.originatingPartyName = originatingPartyName
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = priority(JsonField.of(priority))

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: OffsetDateTime) = processAfter(JsonField.of(processAfter))

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
            this.processAfter = processAfter
        }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String) = purpose(JsonField.of(purpose))

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

        /** The receiving account ID. Can be an `external_account` or `internal_account`. */
        fun receivingAccountId(receivingAccountId: String) =
            receivingAccountId(JsonField.of(receivingAccountId))

        /** The receiving account ID. Can be an `external_account` or `internal_account`. */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun receivingAccountType(receivingAccountType: ReceivingAccountType) =
            receivingAccountType(JsonField.of(receivingAccountType))

        fun receivingAccountType(receivingAccountType: JsonField<ReceivingAccountType>) = apply {
            this.receivingAccountType = receivingAccountType
        }

        fun referenceNumbers(referenceNumbers: List<PaymentReference>) =
            referenceNumbers(JsonField.of(referenceNumbers))

        fun referenceNumbers(referenceNumbers: JsonField<List<PaymentReference>>) = apply {
            this.referenceNumbers = referenceNumbers
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
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
            sendRemittanceAdvice(JsonField.of(sendRemittanceAdvice))

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: String) =
            statementDescriptor(JsonField.of(statementDescriptor))

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The current status of the payment order. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the payment order. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype) = subtype(JsonField.of(subtype))

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply { this.subtype = subtype }

        /**
         * The IDs of all the transactions associated to this payment order. Usually, you will only
         * have a single transaction ID. However, if a payment order initially results in a Return,
         * but gets redrafted and is later successfully completed, it can have many transactions.
         */
        fun transactionIds(transactionIds: List<String>) =
            transactionIds(JsonField.of(transactionIds))

        /**
         * The IDs of all the transactions associated to this payment order. Usually, you will only
         * have a single transaction ID. However, if a payment order initially results in a Return,
         * but gets redrafted and is later successfully completed, it can have many transactions.
         */
        fun transactionIds(transactionIds: JsonField<List<String>>) = apply {
            this.transactionIds = transactionIds
        }

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         */
        fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
            transactionMonitoringEnabled(JsonField.of(transactionMonitoringEnabled))

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         */
        fun transactionMonitoringEnabled(transactionMonitoringEnabled: JsonField<Boolean>) = apply {
            this.transactionMonitoringEnabled = transactionMonitoringEnabled
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = type(JsonField.of(type))

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

        /**
         * The account to which the originating of this payment should be attributed to. Can be a
         * `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccount(ultimateOriginatingAccount: UltimateOriginatingAccount) =
            ultimateOriginatingAccount(JsonField.of(ultimateOriginatingAccount))

        /**
         * The account to which the originating of this payment should be attributed to. Can be a
         * `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccount(
            ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount>
        ) = apply { this.ultimateOriginatingAccount = ultimateOriginatingAccount }

        /**
         * The ultimate originating account ID. Can be a `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccountId(ultimateOriginatingAccountId: String) =
            ultimateOriginatingAccountId(JsonField.of(ultimateOriginatingAccountId))

        /**
         * The ultimate originating account ID. Can be a `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccountId(ultimateOriginatingAccountId: JsonField<String>) = apply {
            this.ultimateOriginatingAccountId = ultimateOriginatingAccountId
        }

        fun ultimateOriginatingAccountType(
            ultimateOriginatingAccountType: UltimateOriginatingAccountType
        ) = ultimateOriginatingAccountType(JsonField.of(ultimateOriginatingAccountType))

        fun ultimateOriginatingAccountType(
            ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType>
        ) = apply { this.ultimateOriginatingAccountType = ultimateOriginatingAccountType }

        /** Identifier of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
            ultimateOriginatingPartyIdentifier(JsonField.of(ultimateOriginatingPartyIdentifier))

        /** Identifier of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyIdentifier(
            ultimateOriginatingPartyIdentifier: JsonField<String>
        ) = apply { this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier }

        /** Name of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) =
            ultimateOriginatingPartyName(JsonField.of(ultimateOriginatingPartyName))

        /** Name of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) = apply {
            this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
        }

        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) =
            ultimateReceivingPartyIdentifier(JsonField.of(ultimateReceivingPartyIdentifier))

        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: JsonField<String>) =
            apply {
                this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
            }

        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) =
            ultimateReceivingPartyName(JsonField.of(ultimateReceivingPartyName))

        fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) = apply {
            this.ultimateReceivingPartyName = ultimateReceivingPartyName
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Additional vendor specific fields for this payment. Data must be represented as key-value
         * pairs.
         */
        fun vendorAttributes(vendorAttributes: JsonValue) = apply {
            this.vendorAttributes = vendorAttributes
        }

        /**
         * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
         * value as it is free-form.
         */
        fun vendorFailureReason(vendorFailureReason: String) =
            vendorFailureReason(JsonField.of(vendorFailureReason))

        /**
         * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
         * value as it is free-form.
         */
        fun vendorFailureReason(vendorFailureReason: JsonField<String>) = apply {
            this.vendorFailureReason = vendorFailureReason
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

        fun build(): PaymentOrder =
            PaymentOrder(
                id,
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                amount,
                chargeBearer,
                complianceRuleMetadata,
                counterpartyId,
                createdAt,
                currency,
                currentReturn,
                decisionId,
                description,
                direction,
                effectiveDate,
                expiresAt,
                foreignExchangeContract,
                foreignExchangeIndicator,
                foreignExchangeRate,
                ledgerTransactionId,
                liveMode,
                metadata,
                nsfProtected,
                object_,
                originatingAccountId,
                originatingPartyName,
                priority,
                processAfter,
                purpose,
                receivingAccountId,
                receivingAccountType,
                referenceNumbers.map { it.toImmutable() },
                remittanceInformation,
                sendRemittanceAdvice,
                statementDescriptor,
                status,
                subtype,
                transactionIds.map { it.toImmutable() },
                transactionMonitoringEnabled,
                type,
                ultimateOriginatingAccount,
                ultimateOriginatingAccountId,
                ultimateOriginatingAccountType,
                ultimateOriginatingPartyIdentifier,
                ultimateOriginatingPartyName,
                ultimateReceivingPartyIdentifier,
                ultimateReceivingPartyName,
                updatedAt,
                vendorAttributes,
                vendorFailureReason,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Accounting
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("class_id")
        @ExcludeMissing
        private val classId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountId(): String? = accountId.getNullable("account_id")

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        fun classId(): String? = classId.getNullable("class_id")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        @JsonProperty("class_id") @ExcludeMissing fun _classId() = classId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Accounting = apply {
            if (!validated) {
                accountId()
                classId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var classId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                accountId = accounting.accountId
                classId = accounting.classId
                additionalProperties = accounting.additionalProperties.toMutableMap()
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: String) = classId(JsonField.of(classId))

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: JsonField<String>) = apply { this.classId = classId }

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

            fun build(): Accounting =
                Accounting(
                    accountId,
                    classId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
    }

    class ChargeBearer
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SHARED = of("shared")

            val SENDER = of("sender")

            val RECEIVER = of("receiver")

            fun of(value: String) = ChargeBearer(JsonField.of(value))
        }

        enum class Known {
            SHARED,
            SENDER,
            RECEIVER,
        }

        enum class Value {
            SHARED,
            SENDER,
            RECEIVER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SHARED -> Value.SHARED
                SENDER -> Value.SENDER
                RECEIVER -> Value.RECEIVER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SHARED -> Known.SHARED
                SENDER -> Known.SENDER
                RECEIVER -> Known.RECEIVER
                else -> throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Custom key-value pair for usage in compliance rules. Please contact support before making
     * changes to this field.
     */
    @NoAutoDetect
    class ComplianceRuleMetadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ComplianceRuleMetadata = apply {
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

            internal fun from(complianceRuleMetadata: ComplianceRuleMetadata) = apply {
                additionalProperties = complianceRuleMetadata.additionalProperties.toMutableMap()
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

            fun build(): ComplianceRuleMetadata =
                ComplianceRuleMetadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ComplianceRuleMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ComplianceRuleMetadata{additionalProperties=$additionalProperties}"
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

    class ForeignExchangeIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val FIXED_TO_VARIABLE = of("fixed_to_variable")

            val VARIABLE_TO_FIXED = of("variable_to_fixed")

            fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
        }

        enum class Known {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
        }

        enum class Value {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ForeignExchangeIndicator: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Associated serialized foreign exchange rate information. */
    @NoAutoDetect
    class ForeignExchangeRate
    @JsonCreator
    private constructor(
        @JsonProperty("base_amount")
        @ExcludeMissing
        private val baseAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("base_currency")
        @ExcludeMissing
        private val baseCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("exponent")
        @ExcludeMissing
        private val exponent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("rate_string")
        @ExcludeMissing
        private val rateString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_amount")
        @ExcludeMissing
        private val targetAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("target_currency")
        @ExcludeMissing
        private val targetCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(): Long = baseAmount.getRequired("base_amount")

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun exponent(): Long = exponent.getRequired("exponent")

        /** A string representation of the rate. */
        fun rateString(): String = rateString.getRequired("rate_string")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(): Long = targetAmount.getRequired("target_amount")

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount() = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency") @ExcludeMissing fun _baseCurrency() = baseCurrency

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent() = exponent

        /** A string representation of the rate. */
        @JsonProperty("rate_string") @ExcludeMissing fun _rateString() = rateString

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount") @ExcludeMissing fun _targetAmount() = targetAmount

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency") @ExcludeMissing fun _targetCurrency() = targetCurrency

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ForeignExchangeRate = apply {
            if (!validated) {
                baseAmount()
                baseCurrency()
                exponent()
                rateString()
                targetAmount()
                targetCurrency()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var baseAmount: JsonField<Long> = JsonMissing.of()
            private var baseCurrency: JsonField<Currency> = JsonMissing.of()
            private var exponent: JsonField<Long> = JsonMissing.of()
            private var rateString: JsonField<String> = JsonMissing.of()
            private var targetAmount: JsonField<Long> = JsonMissing.of()
            private var targetCurrency: JsonField<Currency> = JsonMissing.of()
            private var value: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(foreignExchangeRate: ForeignExchangeRate) = apply {
                baseAmount = foreignExchangeRate.baseAmount
                baseCurrency = foreignExchangeRate.baseCurrency
                exponent = foreignExchangeRate.exponent
                rateString = foreignExchangeRate.rateString
                targetAmount = foreignExchangeRate.targetAmount
                targetCurrency = foreignExchangeRate.targetCurrency
                value = foreignExchangeRate.value
                additionalProperties = foreignExchangeRate.additionalProperties.toMutableMap()
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: Long) = baseAmount(JsonField.of(baseAmount))

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /** A string representation of the rate. */
            fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
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

            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    baseAmount,
                    baseCurrency,
                    exponent,
                    rateString,
                    targetAmount,
                    targetCurrency,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeRate && baseAmount == other.baseAmount && baseCurrency == other.baseCurrency && exponent == other.exponent && rateString == other.rateString && targetAmount == other.targetAmount && targetCurrency == other.targetCurrency && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(baseAmount, baseCurrency, exponent, rateString, targetAmount, targetCurrency, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

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

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val HIGH = of("high")

            val NORMAL = of("normal")

            fun of(value: String) = Priority(JsonField.of(value))
        }

        enum class Known {
            HIGH,
            NORMAL,
        }

        enum class Value {
            HIGH,
            NORMAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ReceivingAccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INTERNAL_ACCOUNT = of("internal_account")

            val EXTERNAL_ACCOUNT = of("external_account")

            fun of(value: String) = ReceivingAccountType(JsonField.of(value))
        }

        enum class Known {
            INTERNAL_ACCOUNT,
            EXTERNAL_ACCOUNT,
        }

        enum class Value {
            INTERNAL_ACCOUNT,
            EXTERNAL_ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReceivingAccountType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentReference
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_number")
        @ExcludeMissing
        private val referenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        private val referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        /** The vendor reference number. */
        fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

        /** The type of the reference number. Referring to the vendor payment id. */
        fun referenceNumberType(): ReferenceNumberType =
            referenceNumberType.getRequired("reference_number_type")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /** The vendor reference number. */
        @JsonProperty("reference_number") @ExcludeMissing fun _referenceNumber() = referenceNumber

        /** The type of the reference number. Referring to the vendor payment id. */
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        fun _referenceNumberType() = referenceNumberType

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentReference = apply {
            if (!validated) {
                id()
                createdAt()
                liveMode()
                object_()
                referenceNumber()
                referenceNumberType()
                updatedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var referenceNumber: JsonField<String> = JsonMissing.of()
            private var referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentReference: PaymentReference) = apply {
                id = paymentReference.id
                createdAt = paymentReference.createdAt
                liveMode = paymentReference.liveMode
                object_ = paymentReference.object_
                referenceNumber = paymentReference.referenceNumber
                referenceNumberType = paymentReference.referenceNumberType
                updatedAt = paymentReference.updatedAt
                additionalProperties = paymentReference.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: String) =
                referenceNumber(JsonField.of(referenceNumber))

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: JsonField<String>) = apply {
                this.referenceNumber = referenceNumber
            }

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
                referenceNumberType(JsonField.of(referenceNumberType))

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
                this.referenceNumberType = referenceNumberType
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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

            fun build(): PaymentReference =
                PaymentReference(
                    id,
                    createdAt,
                    liveMode,
                    object_,
                    referenceNumber,
                    referenceNumberType,
                    updatedAt,
                    additionalProperties.toImmutable(),
                )
        }

        class ReferenceNumberType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACH_ORIGINAL_TRACE_NUMBER = of("ach_original_trace_number")

                val ACH_TRACE_NUMBER = of("ach_trace_number")

                val BANKPROV_PAYMENT_ACTIVITY_DATE = of("bankprov_payment_activity_date")

                val BANKPROV_PAYMENT_ID = of("bankprov_payment_id")

                val BNK_DEV_PRENOTIFICATION_ID = of("bnk_dev_prenotification_id")

                val BNK_DEV_TRANSFER_ID = of("bnk_dev_transfer_id")

                val BOFA_END_TO_END_ID = of("bofa_end_to_end_id")

                val BOFA_TRANSACTION_ID = of("bofa_transaction_id")

                val CHECK_NUMBER = of("check_number")

                val CITIBANK_REFERENCE_NUMBER = of("citibank_reference_number")

                val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                    of("citibank_worldlink_clearing_system_reference_number")

                val COLUMN_FX_QUOTE_ID = of("column_fx_quote_id")

                val COLUMN_REVERSAL_PAIR_TRANSFER_ID = of("column_reversal_pair_transfer_id")

                val COLUMN_TRANSFER_ID = of("column_transfer_id")

                val CROSS_RIVER_PAYMENT_ID = of("cross_river_payment_id")

                val CROSS_RIVER_SERVICE_MESSAGE = of("cross_river_service_message")

                val CROSS_RIVER_TRANSACTION_ID = of("cross_river_transaction_id")

                val CURRENCYCLOUD_CONVERSION_ID = of("currencycloud_conversion_id")

                val CURRENCYCLOUD_PAYMENT_ID = of("currencycloud_payment_id")

                val DC_BANK_TRANSACTION_ID = of("dc_bank_transaction_id")

                val DWOLLA_TRANSACTION_ID = of("dwolla_transaction_id")

                val EFT_TRACE_NUMBER = of("eft_trace_number")

                val EVOLVE_TRANSACTION_ID = of("evolve_transaction_id")

                val FEDWIRE_IMAD = of("fedwire_imad")

                val FEDWIRE_OMAD = of("fedwire_omad")

                val FIRST_REPUBLIC_INTERNAL_ID = of("first_republic_internal_id")

                val GOLDMAN_SACHS_COLLECTION_REQUEST_ID = of("goldman_sachs_collection_request_id")

                val GOLDMAN_SACHS_END_TO_END_ID = of("goldman_sachs_end_to_end_id")

                val GOLDMAN_SACHS_PAYMENT_REQUEST_ID = of("goldman_sachs_payment_request_id")

                val GOLDMAN_SACHS_REQUEST_ID = of("goldman_sachs_request_id")

                val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID = of("goldman_sachs_unique_payment_id")

                val INTERAC_MESSAGE_ID = of("interac_message_id")

                val JPMC_CCN = of("jpmc_ccn")

                val JPMC_CLEARING_SYSTEM_REFERENCE = of("jpmc_clearing_system_reference")

                val JPMC_CUSTOMER_REFERENCE_ID = of("jpmc_customer_reference_id")

                val JPMC_END_TO_END_ID = of("jpmc_end_to_end_id")

                val JPMC_FIRM_ROOT_ID = of("jpmc_firm_root_id")

                val JPMC_FX_TRN_ID = of("jpmc_fx_trn_id")

                val JPMC_P3_ID = of("jpmc_p3_id")

                val JPMC_PAYMENT_BATCH_ID = of("jpmc_payment_batch_id")

                val JPMC_PAYMENT_INFORMATION_ID = of("jpmc_payment_information_id")

                val JPMC_PAYMENT_RETURNED_DATETIME = of("jpmc_payment_returned_datetime")

                val LOB_CHECK_ID = of("lob_check_id")

                val OTHER = of("other")

                val PARTIAL_SWIFT_MIR = of("partial_swift_mir")

                val PNC_CLEARING_REFERENCE = of("pnc_clearing_reference")

                val PNC_INSTRUCTION_ID = of("pnc_instruction_id")

                val PNC_MULTIPAYMENT_ID = of("pnc_multipayment_id")

                val PNC_PAYMENT_TRACE_ID = of("pnc_payment_trace_id")

                val PNC_TRANSACTION_REFERENCE_NUMBER = of("pnc_transaction_reference_number")

                val RSPEC_VENDOR_PAYMENT_ID = of("rspec_vendor_payment_id")

                val RTP_INSTRUCTION_ID = of("rtp_instruction_id")

                val SIGNET_API_REFERENCE_ID = of("signet_api_reference_id")

                val SIGNET_CONFIRMATION_ID = of("signet_confirmation_id")

                val SIGNET_REQUEST_ID = of("signet_request_id")

                val SILVERGATE_PAYMENT_ID = of("silvergate_payment_id")

                val SVB_END_TO_END_ID = of("svb_end_to_end_id")

                val SVB_PAYMENT_ID = of("svb_payment_id")

                val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_cleared_for_sanctions_review")

                val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_held_for_sanctions_review")

                val SWIFT_MIR = of("swift_mir")

                val SWIFT_UETR = of("swift_uetr")

                val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER = of("umb_product_partner_account_number")

                val USBANK_PAYMENT_APPLICATION_REFERENCE_ID =
                    of("usbank_payment_application_reference_id")

                val USBANK_PAYMENT_ID = of("usbank_payment_id")

                val USBANK_PENDING_RTP_PAYMENT_ID = of("usbank_pending_rtp_payment_id")

                val USBANK_POSTED_RTP_PAYMENT_ID = of("usbank_posted_rtp_payment_id")

                val WELLS_FARGO_END_TO_END_ID = of("wells_fargo_end_to_end_id")

                val WELLS_FARGO_PAYMENT_ID = of("wells_fargo_payment_id")

                val WELLS_FARGO_TRACE_NUMBER = of("wells_fargo_trace_number")

                val WELLS_FARGO_UETR = of("wells_fargo_uetr")

                fun of(value: String) = ReferenceNumberType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                DWOLLA_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RSPEC_VENDOR_PAYMENT_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
            }

            enum class Value {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                DWOLLA_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RSPEC_VENDOR_PAYMENT_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Value.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Value.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Value.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Value.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Value.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Value.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Value.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Value.BOFA_TRANSACTION_ID
                    CHECK_NUMBER -> Value.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Value.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Value.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Value.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Value.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Value.COLUMN_TRANSFER_ID
                    CROSS_RIVER_PAYMENT_ID -> Value.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Value.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Value.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Value.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Value.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Value.DC_BANK_TRANSACTION_ID
                    DWOLLA_TRANSACTION_ID -> Value.DWOLLA_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Value.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Value.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Value.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Value.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Value.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Value.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Value.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Value.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Value.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Value.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    INTERAC_MESSAGE_ID -> Value.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Value.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Value.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Value.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Value.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Value.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Value.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Value.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Value.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Value.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Value.JPMC_PAYMENT_RETURNED_DATETIME
                    LOB_CHECK_ID -> Value.LOB_CHECK_ID
                    OTHER -> Value.OTHER
                    PARTIAL_SWIFT_MIR -> Value.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Value.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Value.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Value.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Value.PNC_PAYMENT_TRACE_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Value.PNC_TRANSACTION_REFERENCE_NUMBER
                    RSPEC_VENDOR_PAYMENT_ID -> Value.RSPEC_VENDOR_PAYMENT_ID
                    RTP_INSTRUCTION_ID -> Value.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Value.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Value.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Value.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Value.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Value.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Value.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Value.SWIFT_MIR
                    SWIFT_UETR -> Value.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Value.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Value.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Value.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Value.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Value.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Value.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Value.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Value.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Value.WELLS_FARGO_UETR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINAL_TRACE_NUMBER -> Known.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Known.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Known.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Known.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Known.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Known.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Known.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Known.BOFA_TRANSACTION_ID
                    CHECK_NUMBER -> Known.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Known.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Known.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Known.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Known.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Known.COLUMN_TRANSFER_ID
                    CROSS_RIVER_PAYMENT_ID -> Known.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Known.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Known.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Known.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Known.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Known.DC_BANK_TRANSACTION_ID
                    DWOLLA_TRANSACTION_ID -> Known.DWOLLA_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Known.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Known.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Known.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Known.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Known.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Known.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Known.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Known.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Known.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Known.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    INTERAC_MESSAGE_ID -> Known.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Known.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Known.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Known.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Known.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Known.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Known.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Known.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Known.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Known.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Known.JPMC_PAYMENT_RETURNED_DATETIME
                    LOB_CHECK_ID -> Known.LOB_CHECK_ID
                    OTHER -> Known.OTHER
                    PARTIAL_SWIFT_MIR -> Known.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Known.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Known.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Known.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Known.PNC_PAYMENT_TRACE_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Known.PNC_TRANSACTION_REFERENCE_NUMBER
                    RSPEC_VENDOR_PAYMENT_ID -> Known.RSPEC_VENDOR_PAYMENT_ID
                    RTP_INSTRUCTION_ID -> Known.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Known.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Known.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Known.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Known.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Known.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Known.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Known.SWIFT_MIR
                    SWIFT_UETR -> Known.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Known.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Known.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Known.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Known.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Known.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Known.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Known.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Known.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Known.WELLS_FARGO_UETR
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ReferenceNumberType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReferenceNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentReference && id == other.id && createdAt == other.createdAt && liveMode == other.liveMode && object_ == other.object_ && referenceNumber == other.referenceNumber && referenceNumberType == other.referenceNumberType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, liveMode, object_, referenceNumber, referenceNumberType, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentReference{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val APPROVED = of("approved")

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val DENIED = of("denied")

            val FAILED = of("failed")

            val NEEDS_APPROVAL = of("needs_approval")

            val PENDING = of("pending")

            val PROCESSING = of("processing")

            val RETURNED = of("returned")

            val REVERSED = of("reversed")

            val SENT = of("sent")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
        }

        enum class Value {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                REVERSED -> Value.REVERSED
                SENT -> Value.SENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                REVERSED -> Known.REVERSED
                SENT -> Known.SENT
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

    /**
     * The account to which the originating of this payment should be attributed to. Can be a
     * `virtual_account` or `internal_account`.
     */
    @JsonDeserialize(using = UltimateOriginatingAccount.Deserializer::class)
    @JsonSerialize(using = UltimateOriginatingAccount.Serializer::class)
    class UltimateOriginatingAccount
    private constructor(
        private val virtualAccount: VirtualAccount? = null,
        private val internalAccount: InternalAccount? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun virtualAccount(): VirtualAccount? = virtualAccount

        fun internalAccount(): InternalAccount? = internalAccount

        fun isVirtualAccount(): Boolean = virtualAccount != null

        fun isInternalAccount(): Boolean = internalAccount != null

        fun asVirtualAccount(): VirtualAccount = virtualAccount.getOrThrow("virtualAccount")

        fun asInternalAccount(): InternalAccount = internalAccount.getOrThrow("internalAccount")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                virtualAccount != null -> visitor.visitVirtualAccount(virtualAccount)
                internalAccount != null -> visitor.visitInternalAccount(internalAccount)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): UltimateOriginatingAccount = apply {
            if (!validated) {
                if (virtualAccount == null && internalAccount == null) {
                    throw ModernTreasuryInvalidDataException(
                        "Unknown UltimateOriginatingAccount: $_json"
                    )
                }
                virtualAccount?.validate()
                internalAccount?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UltimateOriginatingAccount && virtualAccount == other.virtualAccount && internalAccount == other.internalAccount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtualAccount, internalAccount) /* spotless:on */

        override fun toString(): String =
            when {
                virtualAccount != null ->
                    "UltimateOriginatingAccount{virtualAccount=$virtualAccount}"
                internalAccount != null ->
                    "UltimateOriginatingAccount{internalAccount=$internalAccount}"
                _json != null -> "UltimateOriginatingAccount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid UltimateOriginatingAccount")
            }

        companion object {

            fun ofVirtualAccount(virtualAccount: VirtualAccount) =
                UltimateOriginatingAccount(virtualAccount = virtualAccount)

            fun ofInternalAccount(internalAccount: InternalAccount) =
                UltimateOriginatingAccount(internalAccount = internalAccount)
        }

        interface Visitor<out T> {

            fun visitVirtualAccount(virtualAccount: VirtualAccount): T

            fun visitInternalAccount(internalAccount: InternalAccount): T

            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException(
                    "Unknown UltimateOriginatingAccount: $json"
                )
            }
        }

        class Deserializer :
            BaseDeserializer<UltimateOriginatingAccount>(UltimateOriginatingAccount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): UltimateOriginatingAccount {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<VirtualAccount>()) { it.validate() }
                    ?.let {
                        return UltimateOriginatingAccount(virtualAccount = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InternalAccount>()) { it.validate() }
                    ?.let {
                        return UltimateOriginatingAccount(internalAccount = it, _json = json)
                    }

                return UltimateOriginatingAccount(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<UltimateOriginatingAccount>(UltimateOriginatingAccount::class) {

            override fun serialize(
                value: UltimateOriginatingAccount,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.virtualAccount != null -> generator.writeObject(value.virtualAccount)
                    value.internalAccount != null -> generator.writeObject(value.internalAccount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid UltimateOriginatingAccount")
                }
            }
        }
    }

    class UltimateOriginatingAccountType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INTERNAL_ACCOUNT = of("internal_account")

            val VIRTUAL_ACCOUNT = of("virtual_account")

            fun of(value: String) = UltimateOriginatingAccountType(JsonField.of(value))
        }

        enum class Known {
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
        }

        enum class Value {
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown UltimateOriginatingAccountType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UltimateOriginatingAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrder && id == other.id && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && complianceRuleMetadata == other.complianceRuleMetadata && counterpartyId == other.counterpartyId && createdAt == other.createdAt && currency == other.currency && currentReturn == other.currentReturn && decisionId == other.decisionId && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeRate == other.foreignExchangeRate && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && nsfProtected == other.nsfProtected && object_ == other.object_ && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccountId == other.receivingAccountId && receivingAccountType == other.receivingAccountType && referenceNumbers == other.referenceNumbers && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && transactionIds == other.transactionIds && transactionMonitoringEnabled == other.transactionMonitoringEnabled && type == other.type && ultimateOriginatingAccount == other.ultimateOriginatingAccount && ultimateOriginatingAccountId == other.ultimateOriginatingAccountId && ultimateOriginatingAccountType == other.ultimateOriginatingAccountType && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && updatedAt == other.updatedAt && vendorAttributes == other.vendorAttributes && vendorFailureReason == other.vendorFailureReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, complianceRuleMetadata, counterpartyId, createdAt, currency, currentReturn, decisionId, description, direction, effectiveDate, expiresAt, foreignExchangeContract, foreignExchangeIndicator, foreignExchangeRate, ledgerTransactionId, liveMode, metadata, nsfProtected, object_, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccountId, receivingAccountType, referenceNumbers, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, transactionIds, transactionMonitoringEnabled, type, ultimateOriginatingAccount, ultimateOriginatingAccountId, ultimateOriginatingAccountType, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, updatedAt, vendorAttributes, vendorFailureReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentOrder{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, complianceRuleMetadata=$complianceRuleMetadata, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, currentReturn=$currentReturn, decisionId=$decisionId, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeRate=$foreignExchangeRate, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, nsfProtected=$nsfProtected, object_=$object_, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccountId=$receivingAccountId, receivingAccountType=$receivingAccountType, referenceNumbers=$referenceNumbers, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, transactionIds=$transactionIds, transactionMonitoringEnabled=$transactionMonitoringEnabled, type=$type, ultimateOriginatingAccount=$ultimateOriginatingAccount, ultimateOriginatingAccountId=$ultimateOriginatingAccountId, ultimateOriginatingAccountType=$ultimateOriginatingAccountType, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, updatedAt=$updatedAt, vendorAttributes=$vendorAttributes, vendorFailureReason=$vendorFailureReason, additionalProperties=$additionalProperties}"
}
