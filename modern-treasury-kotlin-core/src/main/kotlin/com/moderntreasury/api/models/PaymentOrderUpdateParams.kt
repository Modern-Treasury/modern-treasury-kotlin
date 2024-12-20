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

class PaymentOrderUpdateParams
constructor(
    private val id: String,
    private val accounting: Accounting?,
    private val accountingCategoryId: String?,
    private val accountingLedgerClassId: String?,
    private val amount: Long?,
    private val chargeBearer: ChargeBearer?,
    private val counterpartyId: String?,
    private val currency: Currency?,
    private val description: String?,
    private val direction: Direction?,
    private val effectiveDate: LocalDate?,
    private val expiresAt: OffsetDateTime?,
    private val fallbackType: FallbackType?,
    private val foreignExchangeContract: String?,
    private val foreignExchangeIndicator: ForeignExchangeIndicator?,
    private val lineItems: List<LineItemRequest>?,
    private val metadata: Metadata?,
    private val nsfProtected: Boolean?,
    private val originatingAccountId: String?,
    private val originatingPartyName: String?,
    private val priority: Priority?,
    private val processAfter: OffsetDateTime?,
    private val purpose: String?,
    private val receivingAccount: ReceivingAccount?,
    private val receivingAccountId: String?,
    private val remittanceInformation: String?,
    private val sendRemittanceAdvice: Boolean?,
    private val statementDescriptor: String?,
    private val status: Status?,
    private val subtype: PaymentOrderSubtype?,
    private val type: PaymentOrderType?,
    private val ultimateOriginatingPartyIdentifier: String?,
    private val ultimateOriginatingPartyName: String?,
    private val ultimateReceivingPartyIdentifier: String?,
    private val ultimateReceivingPartyName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun accounting(): Accounting? = accounting

    fun accountingCategoryId(): String? = accountingCategoryId

    fun accountingLedgerClassId(): String? = accountingLedgerClassId

    fun amount(): Long? = amount

    fun chargeBearer(): ChargeBearer? = chargeBearer

    fun counterpartyId(): String? = counterpartyId

    fun currency(): Currency? = currency

    fun description(): String? = description

    fun direction(): Direction? = direction

    fun effectiveDate(): LocalDate? = effectiveDate

    fun expiresAt(): OffsetDateTime? = expiresAt

    fun fallbackType(): FallbackType? = fallbackType

    fun foreignExchangeContract(): String? = foreignExchangeContract

    fun foreignExchangeIndicator(): ForeignExchangeIndicator? = foreignExchangeIndicator

    fun lineItems(): List<LineItemRequest>? = lineItems

    fun metadata(): Metadata? = metadata

    fun nsfProtected(): Boolean? = nsfProtected

    fun originatingAccountId(): String? = originatingAccountId

    fun originatingPartyName(): String? = originatingPartyName

    fun priority(): Priority? = priority

    fun processAfter(): OffsetDateTime? = processAfter

    fun purpose(): String? = purpose

    fun receivingAccount(): ReceivingAccount? = receivingAccount

    fun receivingAccountId(): String? = receivingAccountId

    fun remittanceInformation(): String? = remittanceInformation

    fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

    fun statementDescriptor(): String? = statementDescriptor

    fun status(): Status? = status

    fun subtype(): PaymentOrderSubtype? = subtype

    fun type(): PaymentOrderType? = type

    fun ultimateOriginatingPartyIdentifier(): String? = ultimateOriginatingPartyIdentifier

    fun ultimateOriginatingPartyName(): String? = ultimateOriginatingPartyName

    fun ultimateReceivingPartyIdentifier(): String? = ultimateReceivingPartyIdentifier

    fun ultimateReceivingPartyName(): String? = ultimateReceivingPartyName

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): PaymentOrderUpdateBody {
        return PaymentOrderUpdateBody(
            accounting,
            accountingCategoryId,
            accountingLedgerClassId,
            amount,
            chargeBearer,
            counterpartyId,
            currency,
            description,
            direction,
            effectiveDate,
            expiresAt,
            fallbackType,
            foreignExchangeContract,
            foreignExchangeIndicator,
            lineItems,
            metadata,
            nsfProtected,
            originatingAccountId,
            originatingPartyName,
            priority,
            processAfter,
            purpose,
            receivingAccount,
            receivingAccountId,
            remittanceInformation,
            sendRemittanceAdvice,
            statementDescriptor,
            status,
            subtype,
            type,
            ultimateOriginatingPartyIdentifier,
            ultimateOriginatingPartyName,
            ultimateReceivingPartyIdentifier,
            ultimateReceivingPartyName,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class PaymentOrderUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("accounting") private val accounting: Accounting?,
        @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
        @JsonProperty("accounting_ledger_class_id") private val accountingLedgerClassId: String?,
        @JsonProperty("amount") private val amount: Long?,
        @JsonProperty("charge_bearer") private val chargeBearer: ChargeBearer?,
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("currency") private val currency: Currency?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("direction") private val direction: Direction?,
        @JsonProperty("effective_date") private val effectiveDate: LocalDate?,
        @JsonProperty("expires_at") private val expiresAt: OffsetDateTime?,
        @JsonProperty("fallback_type") private val fallbackType: FallbackType?,
        @JsonProperty("foreign_exchange_contract") private val foreignExchangeContract: String?,
        @JsonProperty("foreign_exchange_indicator")
        private val foreignExchangeIndicator: ForeignExchangeIndicator?,
        @JsonProperty("line_items") private val lineItems: List<LineItemRequest>?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("nsf_protected") private val nsfProtected: Boolean?,
        @JsonProperty("originating_account_id") private val originatingAccountId: String?,
        @JsonProperty("originating_party_name") private val originatingPartyName: String?,
        @JsonProperty("priority") private val priority: Priority?,
        @JsonProperty("process_after") private val processAfter: OffsetDateTime?,
        @JsonProperty("purpose") private val purpose: String?,
        @JsonProperty("receiving_account") private val receivingAccount: ReceivingAccount?,
        @JsonProperty("receiving_account_id") private val receivingAccountId: String?,
        @JsonProperty("remittance_information") private val remittanceInformation: String?,
        @JsonProperty("send_remittance_advice") private val sendRemittanceAdvice: Boolean?,
        @JsonProperty("statement_descriptor") private val statementDescriptor: String?,
        @JsonProperty("status") private val status: Status?,
        @JsonProperty("subtype") private val subtype: PaymentOrderSubtype?,
        @JsonProperty("type") private val type: PaymentOrderType?,
        @JsonProperty("ultimate_originating_party_identifier")
        private val ultimateOriginatingPartyIdentifier: String?,
        @JsonProperty("ultimate_originating_party_name")
        private val ultimateOriginatingPartyName: String?,
        @JsonProperty("ultimate_receiving_party_identifier")
        private val ultimateReceivingPartyIdentifier: String?,
        @JsonProperty("ultimate_receiving_party_name")
        private val ultimateReceivingPartyName: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("accounting") fun accounting(): Accounting? = accounting

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        @JsonProperty("accounting_ledger_class_id")
        fun accountingLedgerClassId(): String? = accountingLedgerClassId

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        @JsonProperty("charge_bearer") fun chargeBearer(): ChargeBearer? = chargeBearer

        /** Required when receiving_account_id is passed the ID of an external account. */
        @JsonProperty("counterparty_id") fun counterpartyId(): String? = counterpartyId

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        @JsonProperty("foreign_exchange_contract")
        fun foreignExchangeContract(): String? = foreignExchangeContract

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        @JsonProperty("foreign_exchange_indicator")
        fun foreignExchangeIndicator(): ForeignExchangeIndicator? = foreignExchangeIndicator

        /** An array of line items that must sum up to the amount of the payment order. */
        @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        @JsonProperty("nsf_protected") fun nsfProtected(): Boolean? = nsfProtected

        /** The ID of one of your organization's internal accounts. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        @JsonProperty("originating_party_name")
        fun originatingPartyName(): String? = originatingPartyName

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        @JsonProperty("priority") fun priority(): Priority? = priority

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        @JsonProperty("process_after") fun processAfter(): OffsetDateTime? = processAfter

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        @JsonProperty("purpose") fun purpose(): String? = purpose

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        @JsonProperty("receiving_account")
        fun receivingAccount(): ReceivingAccount? = receivingAccount

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        @JsonProperty("receiving_account_id") fun receivingAccountId(): String? = receivingAccountId

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /**
         * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
         * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
         */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        @JsonProperty("subtype") fun subtype(): PaymentOrderSubtype? = subtype

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        @JsonProperty("type") fun type(): PaymentOrderType? = type

        /**
         * This represents the identifier by which the person is known to the receiver when using
         * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
         * used. Any additional characters will be truncated.
         */
        @JsonProperty("ultimate_originating_party_identifier")
        fun ultimateOriginatingPartyIdentifier(): String? = ultimateOriginatingPartyIdentifier

        /**
         * This represents the name of the person that the payment is on behalf of when using the
         * CIE subtype for ACH payments. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        @JsonProperty("ultimate_originating_party_name")
        fun ultimateOriginatingPartyName(): String? = ultimateOriginatingPartyName

        /**
         * This represents the name of the merchant that the payment is being sent to when using the
         * CIE subtype for ACH payments. Only the first 22 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        @JsonProperty("ultimate_receiving_party_identifier")
        fun ultimateReceivingPartyIdentifier(): String? = ultimateReceivingPartyIdentifier

        /**
         * This represents the identifier by which the merchant is known to the person initiating an
         * ACH payment with CIE subtype. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        @JsonProperty("ultimate_receiving_party_name")
        fun ultimateReceivingPartyName(): String? = ultimateReceivingPartyName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accounting: Accounting? = null
            private var accountingCategoryId: String? = null
            private var accountingLedgerClassId: String? = null
            private var amount: Long? = null
            private var chargeBearer: ChargeBearer? = null
            private var counterpartyId: String? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var direction: Direction? = null
            private var effectiveDate: LocalDate? = null
            private var expiresAt: OffsetDateTime? = null
            private var fallbackType: FallbackType? = null
            private var foreignExchangeContract: String? = null
            private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
            private var lineItems: List<LineItemRequest>? = null
            private var metadata: Metadata? = null
            private var nsfProtected: Boolean? = null
            private var originatingAccountId: String? = null
            private var originatingPartyName: String? = null
            private var priority: Priority? = null
            private var processAfter: OffsetDateTime? = null
            private var purpose: String? = null
            private var receivingAccount: ReceivingAccount? = null
            private var receivingAccountId: String? = null
            private var remittanceInformation: String? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var statementDescriptor: String? = null
            private var status: Status? = null
            private var subtype: PaymentOrderSubtype? = null
            private var type: PaymentOrderType? = null
            private var ultimateOriginatingPartyIdentifier: String? = null
            private var ultimateOriginatingPartyName: String? = null
            private var ultimateReceivingPartyIdentifier: String? = null
            private var ultimateReceivingPartyName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentOrderUpdateBody: PaymentOrderUpdateBody) = apply {
                accounting = paymentOrderUpdateBody.accounting
                accountingCategoryId = paymentOrderUpdateBody.accountingCategoryId
                accountingLedgerClassId = paymentOrderUpdateBody.accountingLedgerClassId
                amount = paymentOrderUpdateBody.amount
                chargeBearer = paymentOrderUpdateBody.chargeBearer
                counterpartyId = paymentOrderUpdateBody.counterpartyId
                currency = paymentOrderUpdateBody.currency
                description = paymentOrderUpdateBody.description
                direction = paymentOrderUpdateBody.direction
                effectiveDate = paymentOrderUpdateBody.effectiveDate
                expiresAt = paymentOrderUpdateBody.expiresAt
                fallbackType = paymentOrderUpdateBody.fallbackType
                foreignExchangeContract = paymentOrderUpdateBody.foreignExchangeContract
                foreignExchangeIndicator = paymentOrderUpdateBody.foreignExchangeIndicator
                lineItems = paymentOrderUpdateBody.lineItems?.toMutableList()
                metadata = paymentOrderUpdateBody.metadata
                nsfProtected = paymentOrderUpdateBody.nsfProtected
                originatingAccountId = paymentOrderUpdateBody.originatingAccountId
                originatingPartyName = paymentOrderUpdateBody.originatingPartyName
                priority = paymentOrderUpdateBody.priority
                processAfter = paymentOrderUpdateBody.processAfter
                purpose = paymentOrderUpdateBody.purpose
                receivingAccount = paymentOrderUpdateBody.receivingAccount
                receivingAccountId = paymentOrderUpdateBody.receivingAccountId
                remittanceInformation = paymentOrderUpdateBody.remittanceInformation
                sendRemittanceAdvice = paymentOrderUpdateBody.sendRemittanceAdvice
                statementDescriptor = paymentOrderUpdateBody.statementDescriptor
                status = paymentOrderUpdateBody.status
                subtype = paymentOrderUpdateBody.subtype
                type = paymentOrderUpdateBody.type
                ultimateOriginatingPartyIdentifier =
                    paymentOrderUpdateBody.ultimateOriginatingPartyIdentifier
                ultimateOriginatingPartyName = paymentOrderUpdateBody.ultimateOriginatingPartyName
                ultimateReceivingPartyIdentifier =
                    paymentOrderUpdateBody.ultimateReceivingPartyIdentifier
                ultimateReceivingPartyName = paymentOrderUpdateBody.ultimateReceivingPartyName
                additionalProperties = paymentOrderUpdateBody.additionalProperties.toMutableMap()
            }

            fun accounting(accounting: Accounting?) = apply { this.accounting = accounting }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(accountingCategoryId: String?) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            fun accountingLedgerClassId(accountingLedgerClassId: String?) = apply {
                this.accountingLedgerClassId = accountingLedgerClassId
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(amount: Long?) = apply { this.amount = amount }

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(chargeBearer: ChargeBearer?) = apply {
                this.chargeBearer = chargeBearer
            }

            /** Required when receiving_account_id is passed the ID of an external account. */
            fun counterpartyId(counterpartyId: String?) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Currency?) = apply { this.currency = currency }

            /** An optional description for internal use. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: Direction?) = apply { this.direction = direction }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(effectiveDate: LocalDate?) = apply {
                this.effectiveDate = effectiveDate
            }

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(expiresAt: OffsetDateTime?) = apply { this.expiresAt = expiresAt }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(fallbackType: FallbackType?) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(foreignExchangeContract: String?) = apply {
                this.foreignExchangeContract = foreignExchangeContract
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(lineItems: List<LineItemRequest>?) = apply { this.lineItems = lineItems }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(nsfProtected: Boolean?) = apply { this.nsfProtected = nsfProtected }

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(originatingAccountId: String?) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(originatingPartyName: String?) = apply {
                this.originatingPartyName = originatingPartyName
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(priority: Priority?) = apply { this.priority = priority }

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(processAfter: OffsetDateTime?) = apply {
                this.processAfter = processAfter
            }

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            fun purpose(purpose: String?) = apply { this.purpose = purpose }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(receivingAccount: ReceivingAccount?) = apply {
                this.receivingAccount = receivingAccount
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(receivingAccountId: String?) = apply {
                this.receivingAccountId = receivingAccountId
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
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(statementDescriptor: String?) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            fun status(status: Status?) = apply { this.status = status }

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(subtype: PaymentOrderSubtype?) = apply { this.subtype = subtype }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(type: PaymentOrderType?) = apply { this.type = type }

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
                apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) = apply {
                this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
            }

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) = apply {
                this.ultimateReceivingPartyName = ultimateReceivingPartyName
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

            fun build(): PaymentOrderUpdateBody =
                PaymentOrderUpdateBody(
                    accounting,
                    accountingCategoryId,
                    accountingLedgerClassId,
                    amount,
                    chargeBearer,
                    counterpartyId,
                    currency,
                    description,
                    direction,
                    effectiveDate,
                    expiresAt,
                    fallbackType,
                    foreignExchangeContract,
                    foreignExchangeIndicator,
                    lineItems?.toImmutable(),
                    metadata,
                    nsfProtected,
                    originatingAccountId,
                    originatingPartyName,
                    priority,
                    processAfter,
                    purpose,
                    receivingAccount,
                    receivingAccountId,
                    remittanceInformation,
                    sendRemittanceAdvice,
                    statementDescriptor,
                    status,
                    subtype,
                    type,
                    ultimateOriginatingPartyIdentifier,
                    ultimateOriginatingPartyName,
                    ultimateReceivingPartyIdentifier,
                    ultimateReceivingPartyName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentOrderUpdateBody && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && counterpartyId == other.counterpartyId && currency == other.currency && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && type == other.type && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, counterpartyId, currency, description, direction, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, lineItems, metadata, nsfProtected, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, type, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentOrderUpdateBody{accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var accounting: Accounting? = null
        private var accountingCategoryId: String? = null
        private var accountingLedgerClassId: String? = null
        private var amount: Long? = null
        private var chargeBearer: ChargeBearer? = null
        private var counterpartyId: String? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var direction: Direction? = null
        private var effectiveDate: LocalDate? = null
        private var expiresAt: OffsetDateTime? = null
        private var fallbackType: FallbackType? = null
        private var foreignExchangeContract: String? = null
        private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
        private var lineItems: MutableList<LineItemRequest> = mutableListOf()
        private var metadata: Metadata? = null
        private var nsfProtected: Boolean? = null
        private var originatingAccountId: String? = null
        private var originatingPartyName: String? = null
        private var priority: Priority? = null
        private var processAfter: OffsetDateTime? = null
        private var purpose: String? = null
        private var receivingAccount: ReceivingAccount? = null
        private var receivingAccountId: String? = null
        private var remittanceInformation: String? = null
        private var sendRemittanceAdvice: Boolean? = null
        private var statementDescriptor: String? = null
        private var status: Status? = null
        private var subtype: PaymentOrderSubtype? = null
        private var type: PaymentOrderType? = null
        private var ultimateOriginatingPartyIdentifier: String? = null
        private var ultimateOriginatingPartyName: String? = null
        private var ultimateReceivingPartyIdentifier: String? = null
        private var ultimateReceivingPartyName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentOrderUpdateParams: PaymentOrderUpdateParams) = apply {
            id = paymentOrderUpdateParams.id
            accounting = paymentOrderUpdateParams.accounting
            accountingCategoryId = paymentOrderUpdateParams.accountingCategoryId
            accountingLedgerClassId = paymentOrderUpdateParams.accountingLedgerClassId
            amount = paymentOrderUpdateParams.amount
            chargeBearer = paymentOrderUpdateParams.chargeBearer
            counterpartyId = paymentOrderUpdateParams.counterpartyId
            currency = paymentOrderUpdateParams.currency
            description = paymentOrderUpdateParams.description
            direction = paymentOrderUpdateParams.direction
            effectiveDate = paymentOrderUpdateParams.effectiveDate
            expiresAt = paymentOrderUpdateParams.expiresAt
            fallbackType = paymentOrderUpdateParams.fallbackType
            foreignExchangeContract = paymentOrderUpdateParams.foreignExchangeContract
            foreignExchangeIndicator = paymentOrderUpdateParams.foreignExchangeIndicator
            lineItems = paymentOrderUpdateParams.lineItems?.toMutableList() ?: mutableListOf()
            metadata = paymentOrderUpdateParams.metadata
            nsfProtected = paymentOrderUpdateParams.nsfProtected
            originatingAccountId = paymentOrderUpdateParams.originatingAccountId
            originatingPartyName = paymentOrderUpdateParams.originatingPartyName
            priority = paymentOrderUpdateParams.priority
            processAfter = paymentOrderUpdateParams.processAfter
            purpose = paymentOrderUpdateParams.purpose
            receivingAccount = paymentOrderUpdateParams.receivingAccount
            receivingAccountId = paymentOrderUpdateParams.receivingAccountId
            remittanceInformation = paymentOrderUpdateParams.remittanceInformation
            sendRemittanceAdvice = paymentOrderUpdateParams.sendRemittanceAdvice
            statementDescriptor = paymentOrderUpdateParams.statementDescriptor
            status = paymentOrderUpdateParams.status
            subtype = paymentOrderUpdateParams.subtype
            type = paymentOrderUpdateParams.type
            ultimateOriginatingPartyIdentifier =
                paymentOrderUpdateParams.ultimateOriginatingPartyIdentifier
            ultimateOriginatingPartyName = paymentOrderUpdateParams.ultimateOriginatingPartyName
            ultimateReceivingPartyIdentifier =
                paymentOrderUpdateParams.ultimateReceivingPartyIdentifier
            ultimateReceivingPartyName = paymentOrderUpdateParams.ultimateReceivingPartyName
            additionalHeaders = paymentOrderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                paymentOrderUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun id(id: String) = apply { this.id = id }

        fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountingCategoryId(accountingCategoryId: String) = apply {
            this.accountingCategoryId = accountingCategoryId
        }

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
            this.accountingLedgerClassId = accountingLedgerClassId
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: ChargeBearer) = apply { this.chargeBearer = chargeBearer }

        /** Required when receiving_account_id is passed the ID of an external account. */
        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { this.fallbackType = fallbackType }

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: String) = apply {
            this.foreignExchangeContract = foreignExchangeContract
        }

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) = apply {
            this.foreignExchangeIndicator = foreignExchangeIndicator
        }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun lineItems(lineItems: List<LineItemRequest>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun addLineItem(lineItem: LineItemRequest) = apply { this.lineItems.add(lineItem) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: String) = apply {
            this.originatingPartyName = originatingPartyName
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: OffsetDateTime) = apply { this.processAfter = processAfter }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String) = apply { this.purpose = purpose }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
            this.receivingAccount = receivingAccount
        }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
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
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
         * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
         */
        fun status(status: Status) = apply { this.status = status }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = apply { this.type = type }

        /**
         * This represents the identifier by which the person is known to the receiver when using
         * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
         * used. Any additional characters will be truncated.
         */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) = apply {
            this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
        }

        /**
         * This represents the name of the person that the payment is on behalf of when using the
         * CIE subtype for ACH payments. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
            this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
        }

        /**
         * This represents the name of the merchant that the payment is being sent to when using the
         * CIE subtype for ACH payments. Only the first 22 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) = apply {
            this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
        }

        /**
         * This represents the identifier by which the merchant is known to the person initiating an
         * ACH payment with CIE subtype. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
            this.ultimateReceivingPartyName = ultimateReceivingPartyName
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): PaymentOrderUpdateParams =
            PaymentOrderUpdateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                amount,
                chargeBearer,
                counterpartyId,
                currency,
                description,
                direction,
                effectiveDate,
                expiresAt,
                fallbackType,
                foreignExchangeContract,
                foreignExchangeIndicator,
                lineItems.toImmutable().ifEmpty { null },
                metadata,
                nsfProtected,
                originatingAccountId,
                originatingPartyName,
                priority,
                processAfter,
                purpose,
                receivingAccount,
                receivingAccountId,
                remittanceInformation,
                sendRemittanceAdvice,
                statementDescriptor,
                status,
                subtype,
                type,
                ultimateOriginatingPartyIdentifier,
                ultimateOriginatingPartyName,
                ultimateReceivingPartyIdentifier,
                ultimateReceivingPartyName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Accounting
    @JsonCreator
    private constructor(
        @JsonProperty("account_id") private val accountId: String?,
        @JsonProperty("class_id") private val classId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        @JsonProperty("class_id") fun classId(): String? = classId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var classId: String? = null
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
            fun accountId(accountId: String?) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: String?) = apply { this.classId = classId }

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

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            fun of(value: String) = FallbackType(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
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

    @NoAutoDetect
    class LineItemRequest
    @JsonCreator
    private constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("accounting_category_id") private val accountingCategoryId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long = amount

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
                amount = lineItemRequest.amount
                metadata = lineItemRequest.metadata
                description = lineItemRequest.description
                accountingCategoryId = lineItemRequest.accountingCategoryId
                additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /** A free-form description of the line item. */
            fun description(description: String?) = apply { this.description = description }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(accountingCategoryId: String?) = apply {
                this.accountingCategoryId = accountingCategoryId
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

            fun build(): LineItemRequest =
                LineItemRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    metadata,
                    description,
                    accountingCategoryId,
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

            return /* spotless:off */ other is LineItemRequest && amount == other.amount && metadata == other.metadata && description == other.description && accountingCategoryId == other.accountingCategoryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, metadata, description, accountingCategoryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"
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

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     */
    @NoAutoDetect
    class ReceivingAccount
    @JsonCreator
    private constructor(
        @JsonProperty("account_type") private val accountType: ExternalAccountType?,
        @JsonProperty("party_type") private val partyType: PartyType?,
        @JsonProperty("party_address") private val partyAddress: AddressRequest?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("account_details") private val accountDetails: List<AccountDetail>?,
        @JsonProperty("routing_details") private val routingDetails: List<RoutingDetail>?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("party_name") private val partyName: String?,
        @JsonProperty("party_identifier") private val partyIdentifier: String?,
        @JsonProperty("ledger_account") private val ledgerAccount: LedgerAccountCreateRequest?,
        @JsonProperty("plaid_processor_token") private val plaidProcessorToken: String?,
        @JsonProperty("contact_details")
        private val contactDetails: List<ContactDetailCreateRequest>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") fun partyType(): PartyType? = partyType

        /** Required if receiving wire payments. */
        @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("account_details") fun accountDetails(): List<AccountDetail>? = accountDetails

        @JsonProperty("routing_details") fun routingDetails(): List<RoutingDetail>? = routingDetails

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        fun plaidProcessorToken(): String? = plaidProcessorToken

        @JsonProperty("contact_details")
        fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountType: ExternalAccountType? = null
            private var partyType: PartyType? = null
            private var partyAddress: AddressRequest? = null
            private var name: String? = null
            private var accountDetails: List<AccountDetail>? = null
            private var routingDetails: List<RoutingDetail>? = null
            private var metadata: Metadata? = null
            private var partyName: String? = null
            private var partyIdentifier: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var plaidProcessorToken: String? = null
            private var contactDetails: List<ContactDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(receivingAccount: ReceivingAccount) = apply {
                accountType = receivingAccount.accountType
                partyType = receivingAccount.partyType
                partyAddress = receivingAccount.partyAddress
                name = receivingAccount.name
                accountDetails = receivingAccount.accountDetails?.toMutableList()
                routingDetails = receivingAccount.routingDetails?.toMutableList()
                metadata = receivingAccount.metadata
                partyName = receivingAccount.partyName
                partyIdentifier = receivingAccount.partyIdentifier
                ledgerAccount = receivingAccount.ledgerAccount
                plaidProcessorToken = receivingAccount.plaidProcessorToken
                contactDetails = receivingAccount.contactDetails?.toMutableList()
                additionalProperties = receivingAccount.additionalProperties.toMutableMap()
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType?) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = apply { this.partyType = partyType }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest?) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = apply { this.name = name }

            fun accountDetails(accountDetails: List<AccountDetail>?) = apply {
                this.accountDetails = accountDetails
            }

            fun routingDetails(routingDetails: List<RoutingDetail>?) = apply {
                this.routingDetails = routingDetails
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String?) = apply { this.partyName = partyName }

            fun partyIdentifier(partyIdentifier: String?) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String?) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>?) = apply {
                this.contactDetails = contactDetails
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

            fun build(): ReceivingAccount =
                ReceivingAccount(
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails?.toImmutable(),
                    routingDetails?.toImmutable(),
                    metadata,
                    partyName,
                    partyIdentifier,
                    ledgerAccount,
                    plaidProcessorToken,
                    contactDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AccountDetail
        @JsonCreator
        private constructor(
            @JsonProperty("account_number") private val accountNumber: String,
            @JsonProperty("account_number_type") private val accountNumberType: AccountNumberType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("account_number") fun accountNumber(): String = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): AccountNumberType? = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType?) = apply {
                    this.accountNumberType = accountNumberType
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

                fun build(): AccountDetail =
                    AccountDetail(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toImmutable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AU_NUMBER = of("au_number")

                    val CLABE = of("clabe")

                    val HK_NUMBER = of("hk_number")

                    val IBAN = of("iban")

                    val ID_NUMBER = of("id_number")

                    val NZ_NUMBER = of("nz_number")

                    val OTHER = of("other")

                    val PAN = of("pan")

                    val SG_NUMBER = of("sg_number")

                    val WALLET_ADDRESS = of("wallet_address")

                    fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                enum class Known {
                    AU_NUMBER,
                    CLABE,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    SG_NUMBER,
                    WALLET_ADDRESS,
                }

                enum class Value {
                    AU_NUMBER,
                    CLABE,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    SG_NUMBER,
                    WALLET_ADDRESS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AU_NUMBER -> Value.AU_NUMBER
                        CLABE -> Value.CLABE
                        HK_NUMBER -> Value.HK_NUMBER
                        IBAN -> Value.IBAN
                        ID_NUMBER -> Value.ID_NUMBER
                        NZ_NUMBER -> Value.NZ_NUMBER
                        OTHER -> Value.OTHER
                        PAN -> Value.PAN
                        SG_NUMBER -> Value.SG_NUMBER
                        WALLET_ADDRESS -> Value.WALLET_ADDRESS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AU_NUMBER -> Known.AU_NUMBER
                        CLABE -> Known.CLABE
                        HK_NUMBER -> Known.HK_NUMBER
                        IBAN -> Known.IBAN
                        ID_NUMBER -> Known.ID_NUMBER
                        NZ_NUMBER -> Known.NZ_NUMBER
                        OTHER -> Known.OTHER
                        PAN -> Known.PAN
                        SG_NUMBER -> Known.SG_NUMBER
                        WALLET_ADDRESS -> Known.WALLET_ADDRESS
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown AccountNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ContactDetailCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("contact_identifier") private val contactIdentifier: String?,
            @JsonProperty("contact_identifier_type")
            private val contactIdentifierType: ContactIdentifierType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties =
                        contactDetailCreateRequest.additionalProperties.toMutableMap()
                }

                fun contactIdentifier(contactIdentifier: String?) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType?) = apply {
                    this.contactIdentifierType = contactIdentifierType
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

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toImmutable(),
                    )
            }

            class ContactIdentifierType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EMAIL = of("email")

                    val PHONE_NUMBER = of("phone_number")

                    val WEBSITE = of("website")

                    fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                }

                enum class Known {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                }

                enum class Value {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EMAIL -> Value.EMAIL
                        PHONE_NUMBER -> Value.PHONE_NUMBER
                        WEBSITE -> Value.WEBSITE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EMAIL -> Known.EMAIL
                        PHONE_NUMBER -> Known.PHONE_NUMBER
                        WEBSITE -> Known.WEBSITE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ContactIdentifierType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @NoAutoDetect
        class LedgerAccountCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("name") private val name: String,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
            @JsonProperty("ledger_id") private val ledgerId: String,
            @JsonProperty("currency") private val currency: String,
            @JsonProperty("currency_exponent") private val currencyExponent: Long?,
            @JsonProperty("ledger_account_category_ids")
            private val ledgerAccountCategoryIds: List<String>?,
            @JsonProperty("ledgerable_id") private val ledgerableId: String?,
            @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String = name

            /** The description of the ledger account. */
            @JsonProperty("description") fun description(): String? = description

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection = normalBalance

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            @JsonProperty("ledger_account_category_ids")
            fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

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

                private var name: String? = null
                private var description: String? = null
                private var normalBalance: TransactionDirection? = null
                private var ledgerId: String? = null
                private var currency: String? = null
                private var currencyExponent: Long? = null
                private var ledgerAccountCategoryIds: List<String>? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    name = ledgerAccountCreateRequest.name
                    description = ledgerAccountCreateRequest.description
                    normalBalance = ledgerAccountCreateRequest.normalBalance
                    ledgerId = ledgerAccountCreateRequest.ledgerId
                    currency = ledgerAccountCreateRequest.currency
                    currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    ledgerAccountCategoryIds =
                        ledgerAccountCreateRequest.ledgerAccountCategoryIds?.toMutableList()
                    ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties =
                        ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                }

                /** The name of the ledger account. */
                fun name(name: String) = apply { this.name = name }

                /** The description of the ledger account. */
                fun description(description: String?) = apply { this.description = description }

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The currency of the ledger account. */
                fun currency(currency: String) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long?) = apply {
                    this.currencyExponent = currencyExponent
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) = apply {
                    this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                    this.ledgerableType = ledgerableType
                }

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

                fun build(): LedgerAccountCreateRequest =
                    LedgerAccountCreateRequest(
                        checkNotNull(name) { "`name` is required but was not set" },
                        description,
                        checkNotNull(normalBalance) {
                            "`normalBalance` is required but was not set"
                        },
                        checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        currencyExponent,
                        ledgerAccountCategoryIds?.toImmutable(),
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val COUNTERPARTY = of("counterparty")

                    val EXTERNAL_ACCOUNT = of("external_account")

                    val INTERNAL_ACCOUNT = of("internal_account")

                    val VIRTUAL_ACCOUNT = of("virtual_account")

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                }

                enum class Value {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        COUNTERPARTY -> Known.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerAccountCreateRequest && name == other.name && description == other.description && normalBalance == other.normalBalance && ledgerId == other.ledgerId && currency == other.currency && currencyExponent == other.currencyExponent && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, description, normalBalance, ledgerId, currency, currencyExponent, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
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

        /** Required if receiving wire payments. */
        @NoAutoDetect
        class AddressRequest
        @JsonCreator
        private constructor(
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("region") private val region: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("country") private val country: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("line1") fun line1(): String? = line1

            @JsonProperty("line2") fun line2(): String? = line2

            /** Locality or City. */
            @JsonProperty("locality") fun locality(): String? = locality

            /** Region or State. */
            @JsonProperty("region") fun region(): String? = region

            /** The postal code of the address. */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(): String? = country

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var line1: String? = null
                private var line2: String? = null
                private var locality: String? = null
                private var region: String? = null
                private var postalCode: String? = null
                private var country: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(addressRequest: AddressRequest) = apply {
                    line1 = addressRequest.line1
                    line2 = addressRequest.line2
                    locality = addressRequest.locality
                    region = addressRequest.region
                    postalCode = addressRequest.postalCode
                    country = addressRequest.country
                    additionalProperties = addressRequest.additionalProperties.toMutableMap()
                }

                fun line1(line1: String?) = apply { this.line1 = line1 }

                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** Locality or City. */
                fun locality(locality: String?) = apply { this.locality = locality }

                /** Region or State. */
                fun region(region: String?) = apply { this.region = region }

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String?) = apply { this.country = country }

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

                fun build(): AddressRequest =
                    AddressRequest(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
        }

        class PartyType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = PartyType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class RoutingDetail
        @JsonCreator
        private constructor(
            @JsonProperty("routing_number") private val routingNumber: String,
            @JsonProperty("routing_number_type") private val routingNumberType: RoutingNumberType,
            @JsonProperty("payment_type") private val paymentType: PaymentType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType = routingNumberType

            @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var routingNumber: String? = null
                private var routingNumberType: RoutingNumberType? = null
                private var paymentType: PaymentType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType?) = apply {
                    this.paymentType = paymentType
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

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toImmutable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ABA = of("aba")

                    val AU_BSB = of("au_bsb")

                    val BR_CODIGO = of("br_codigo")

                    val CA_CPA = of("ca_cpa")

                    val CHIPS = of("chips")

                    val CNAPS = of("cnaps")

                    val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                    val GB_SORT_CODE = of("gb_sort_code")

                    val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                    val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                    val ID_SKNBI_CODE = of("id_sknbi_code")

                    val IN_IFSC = of("in_ifsc")

                    val JP_ZENGIN_CODE = of("jp_zengin_code")

                    val MY_BRANCH_CODE = of("my_branch_code")

                    val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                    val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                    val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                    val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                    val SWIFT = of("swift")

                    val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                    fun of(value: String) = RoutingNumberType(JsonField.of(value))
                }

                enum class Known {
                    ABA,
                    AU_BSB,
                    BR_CODIGO,
                    CA_CPA,
                    CHIPS,
                    CNAPS,
                    DK_INTERBANK_CLEARING_CODE,
                    GB_SORT_CODE,
                    HK_INTERBANK_CLEARING_CODE,
                    HU_INTERBANK_CLEARING_CODE,
                    ID_SKNBI_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                }

                enum class Value {
                    ABA,
                    AU_BSB,
                    BR_CODIGO,
                    CA_CPA,
                    CHIPS,
                    CNAPS,
                    DK_INTERBANK_CLEARING_CODE,
                    GB_SORT_CODE,
                    HK_INTERBANK_CLEARING_CODE,
                    HU_INTERBANK_CLEARING_CODE,
                    ID_SKNBI_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ABA -> Value.ABA
                        AU_BSB -> Value.AU_BSB
                        BR_CODIGO -> Value.BR_CODIGO
                        CA_CPA -> Value.CA_CPA
                        CHIPS -> Value.CHIPS
                        CNAPS -> Value.CNAPS
                        DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                        GB_SORT_CODE -> Value.GB_SORT_CODE
                        HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                        HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                        ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                        IN_IFSC -> Value.IN_IFSC
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Value.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ABA -> Known.ABA
                        AU_BSB -> Known.AU_BSB
                        BR_CODIGO -> Known.BR_CODIGO
                        CA_CPA -> Known.CA_CPA
                        CHIPS -> Known.CHIPS
                        CNAPS -> Known.CNAPS
                        DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                        GB_SORT_CODE -> Known.GB_SORT_CODE
                        HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                        HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                        ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                        IN_IFSC -> Known.IN_IFSC
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PaymentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    val AU_BECS = of("au_becs")

                    val BACS = of("bacs")

                    val BOOK = of("book")

                    val CARD = of("card")

                    val CHATS = of("chats")

                    val CHECK = of("check")

                    val CROSS_BORDER = of("cross_border")

                    val DK_NETS = of("dk_nets")

                    val EFT = of("eft")

                    val HU_ICS = of("hu_ics")

                    val INTERAC = of("interac")

                    val MASAV = of("masav")

                    val MX_CCEN = of("mx_ccen")

                    val NEFT = of("neft")

                    val NICS = of("nics")

                    val NZ_BECS = of("nz_becs")

                    val PL_ELIXIR = of("pl_elixir")

                    val PROVXCHANGE = of("provxchange")

                    val RO_SENT = of("ro_sent")

                    val RTP = of("rtp")

                    val SE_BANKGIROT = of("se_bankgirot")

                    val SEN = of("sen")

                    val SEPA = of("sepa")

                    val SG_GIRO = of("sg_giro")

                    val SIC = of("sic")

                    val SIGNET = of("signet")

                    val SKNBI = of("sknbi")

                    val WIRE = of("wire")

                    val ZENGIN = of("zengin")

                    fun of(value: String) = PaymentType(JsonField.of(value))
                }

                enum class Known {
                    ACH,
                    AU_BECS,
                    BACS,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    WIRE,
                    ZENGIN,
                }

                enum class Value {
                    ACH,
                    AU_BECS,
                    BACS,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    PROVXCHANGE,
                    RO_SENT,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SG_GIRO,
                    SIC,
                    SIGNET,
                    SKNBI,
                    WIRE,
                    ZENGIN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        AU_BECS -> Value.AU_BECS
                        BACS -> Value.BACS
                        BOOK -> Value.BOOK
                        CARD -> Value.CARD
                        CHATS -> Value.CHATS
                        CHECK -> Value.CHECK
                        CROSS_BORDER -> Value.CROSS_BORDER
                        DK_NETS -> Value.DK_NETS
                        EFT -> Value.EFT
                        HU_ICS -> Value.HU_ICS
                        INTERAC -> Value.INTERAC
                        MASAV -> Value.MASAV
                        MX_CCEN -> Value.MX_CCEN
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PL_ELIXIR -> Value.PL_ELIXIR
                        PROVXCHANGE -> Value.PROVXCHANGE
                        RO_SENT -> Value.RO_SENT
                        RTP -> Value.RTP
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
                        SG_GIRO -> Value.SG_GIRO
                        SIC -> Value.SIC
                        SIGNET -> Value.SIGNET
                        SKNBI -> Value.SKNBI
                        WIRE -> Value.WIRE
                        ZENGIN -> Value.ZENGIN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        AU_BECS -> Known.AU_BECS
                        BACS -> Known.BACS
                        BOOK -> Known.BOOK
                        CARD -> Known.CARD
                        CHATS -> Known.CHATS
                        CHECK -> Known.CHECK
                        CROSS_BORDER -> Known.CROSS_BORDER
                        DK_NETS -> Known.DK_NETS
                        EFT -> Known.EFT
                        HU_ICS -> Known.HU_ICS
                        INTERAC -> Known.INTERAC
                        MASAV -> Known.MASAV
                        MX_CCEN -> Known.MX_CCEN
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PL_ELIXIR -> Known.PL_ELIXIR
                        PROVXCHANGE -> Known.PROVXCHANGE
                        RO_SENT -> Known.RO_SENT
                        RTP -> Known.RTP
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SG_GIRO -> Known.SG_GIRO
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        SKNBI -> Known.SKNBI
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingAccount && accountType == other.accountType && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && metadata == other.metadata && partyName == other.partyName && partyIdentifier == other.partyIdentifier && ledgerAccount == other.ledgerAccount && plaidProcessorToken == other.plaidProcessorToken && contactDetails == other.contactDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountType, partyType, partyAddress, name, accountDetails, routingDetails, metadata, partyName, partyIdentifier, ledgerAccount, plaidProcessorToken, contactDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderUpdateParams && id == other.id && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && counterpartyId == other.counterpartyId && currency == other.currency && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && type == other.type && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, counterpartyId, currency, description, direction, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, lineItems, metadata, nsfProtected, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, type, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "PaymentOrderUpdateParams{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
