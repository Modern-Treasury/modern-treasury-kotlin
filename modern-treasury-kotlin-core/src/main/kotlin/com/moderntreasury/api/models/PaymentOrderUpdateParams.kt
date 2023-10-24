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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = PaymentOrderUpdateBody.Builder::class)
    @NoAutoDetect
    class PaymentOrderUpdateBody
    internal constructor(
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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. If you are using Currencycloud, this is the
         * `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that will be
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
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentOrderUpdateBody &&
                this.accounting == other.accounting &&
                this.accountingCategoryId == other.accountingCategoryId &&
                this.accountingLedgerClassId == other.accountingLedgerClassId &&
                this.amount == other.amount &&
                this.chargeBearer == other.chargeBearer &&
                this.counterpartyId == other.counterpartyId &&
                this.currency == other.currency &&
                this.description == other.description &&
                this.direction == other.direction &&
                this.effectiveDate == other.effectiveDate &&
                this.expiresAt == other.expiresAt &&
                this.fallbackType == other.fallbackType &&
                this.foreignExchangeContract == other.foreignExchangeContract &&
                this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                this.lineItems == other.lineItems &&
                this.metadata == other.metadata &&
                this.nsfProtected == other.nsfProtected &&
                this.originatingAccountId == other.originatingAccountId &&
                this.originatingPartyName == other.originatingPartyName &&
                this.priority == other.priority &&
                this.purpose == other.purpose &&
                this.receivingAccount == other.receivingAccount &&
                this.receivingAccountId == other.receivingAccountId &&
                this.remittanceInformation == other.remittanceInformation &&
                this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
                this.statementDescriptor == other.statementDescriptor &&
                this.status == other.status &&
                this.subtype == other.subtype &&
                this.type == other.type &&
                this.ultimateOriginatingPartyIdentifier ==
                    other.ultimateOriginatingPartyIdentifier &&
                this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                this.ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
                this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
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
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentOrderUpdateBody{accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"

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
                this.accounting = paymentOrderUpdateBody.accounting
                this.accountingCategoryId = paymentOrderUpdateBody.accountingCategoryId
                this.accountingLedgerClassId = paymentOrderUpdateBody.accountingLedgerClassId
                this.amount = paymentOrderUpdateBody.amount
                this.chargeBearer = paymentOrderUpdateBody.chargeBearer
                this.counterpartyId = paymentOrderUpdateBody.counterpartyId
                this.currency = paymentOrderUpdateBody.currency
                this.description = paymentOrderUpdateBody.description
                this.direction = paymentOrderUpdateBody.direction
                this.effectiveDate = paymentOrderUpdateBody.effectiveDate
                this.expiresAt = paymentOrderUpdateBody.expiresAt
                this.fallbackType = paymentOrderUpdateBody.fallbackType
                this.foreignExchangeContract = paymentOrderUpdateBody.foreignExchangeContract
                this.foreignExchangeIndicator = paymentOrderUpdateBody.foreignExchangeIndicator
                this.lineItems = paymentOrderUpdateBody.lineItems
                this.metadata = paymentOrderUpdateBody.metadata
                this.nsfProtected = paymentOrderUpdateBody.nsfProtected
                this.originatingAccountId = paymentOrderUpdateBody.originatingAccountId
                this.originatingPartyName = paymentOrderUpdateBody.originatingPartyName
                this.priority = paymentOrderUpdateBody.priority
                this.purpose = paymentOrderUpdateBody.purpose
                this.receivingAccount = paymentOrderUpdateBody.receivingAccount
                this.receivingAccountId = paymentOrderUpdateBody.receivingAccountId
                this.remittanceInformation = paymentOrderUpdateBody.remittanceInformation
                this.sendRemittanceAdvice = paymentOrderUpdateBody.sendRemittanceAdvice
                this.statementDescriptor = paymentOrderUpdateBody.statementDescriptor
                this.status = paymentOrderUpdateBody.status
                this.subtype = paymentOrderUpdateBody.subtype
                this.type = paymentOrderUpdateBody.type
                this.ultimateOriginatingPartyIdentifier =
                    paymentOrderUpdateBody.ultimateOriginatingPartyIdentifier
                this.ultimateOriginatingPartyName =
                    paymentOrderUpdateBody.ultimateOriginatingPartyName
                this.ultimateReceivingPartyIdentifier =
                    paymentOrderUpdateBody.ultimateReceivingPartyIdentifier
                this.ultimateReceivingPartyName = paymentOrderUpdateBody.ultimateReceivingPartyName
                additionalProperties(paymentOrderUpdateBody.additionalProperties)
            }

            @JsonProperty("accounting")
            fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(accountingCategoryId: String) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
                this.accountingLedgerClassId = accountingLedgerClassId
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            fun chargeBearer(chargeBearer: ChargeBearer) = apply {
                this.chargeBearer = chargeBearer
            }

            /** Required when receiving_account_id is passed the ID of an external account. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(counterpartyId: String) = apply {
                this.counterpartyId = counterpartyId
            }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(fallbackType: FallbackType) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(foreignExchangeContract: String) = apply {
                this.foreignExchangeContract = foreignExchangeContract
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItemRequest>) = apply { this.lineItems = lineItems }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(originatingPartyName: String) = apply {
                this.originatingPartyName = originatingPartyName
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            fun priority(priority: Priority) = apply { this.priority = priority }

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(purpose: String) = apply { this.purpose = purpose }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
                this.receivingAccount = receivingAccount
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(receivingAccountId: String) = apply {
                this.receivingAccountId = receivingAccountId
            }

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
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(type: PaymentOrderType) = apply { this.type = type }

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
                this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
            }

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) = apply {
                this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
            }

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
                this.ultimateReceivingPartyName = ultimateReceivingPartyName
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
                    lineItems?.toUnmodifiable(),
                    metadata,
                    nsfProtected,
                    originatingAccountId,
                    originatingPartyName,
                    priority,
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

        return other is PaymentOrderUpdateParams &&
            this.id == other.id &&
            this.accounting == other.accounting &&
            this.accountingCategoryId == other.accountingCategoryId &&
            this.accountingLedgerClassId == other.accountingLedgerClassId &&
            this.amount == other.amount &&
            this.chargeBearer == other.chargeBearer &&
            this.counterpartyId == other.counterpartyId &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.direction == other.direction &&
            this.effectiveDate == other.effectiveDate &&
            this.expiresAt == other.expiresAt &&
            this.fallbackType == other.fallbackType &&
            this.foreignExchangeContract == other.foreignExchangeContract &&
            this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
            this.lineItems == other.lineItems &&
            this.metadata == other.metadata &&
            this.nsfProtected == other.nsfProtected &&
            this.originatingAccountId == other.originatingAccountId &&
            this.originatingPartyName == other.originatingPartyName &&
            this.priority == other.priority &&
            this.purpose == other.purpose &&
            this.receivingAccount == other.receivingAccount &&
            this.receivingAccountId == other.receivingAccountId &&
            this.remittanceInformation == other.remittanceInformation &&
            this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
            this.statementDescriptor == other.statementDescriptor &&
            this.status == other.status &&
            this.subtype == other.subtype &&
            this.type == other.type &&
            this.ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier &&
            this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
            this.ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
            this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
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
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentOrderUpdateParams{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentOrderUpdateParams: PaymentOrderUpdateParams) = apply {
            this.id = paymentOrderUpdateParams.id
            this.accounting = paymentOrderUpdateParams.accounting
            this.accountingCategoryId = paymentOrderUpdateParams.accountingCategoryId
            this.accountingLedgerClassId = paymentOrderUpdateParams.accountingLedgerClassId
            this.amount = paymentOrderUpdateParams.amount
            this.chargeBearer = paymentOrderUpdateParams.chargeBearer
            this.counterpartyId = paymentOrderUpdateParams.counterpartyId
            this.currency = paymentOrderUpdateParams.currency
            this.description = paymentOrderUpdateParams.description
            this.direction = paymentOrderUpdateParams.direction
            this.effectiveDate = paymentOrderUpdateParams.effectiveDate
            this.expiresAt = paymentOrderUpdateParams.expiresAt
            this.fallbackType = paymentOrderUpdateParams.fallbackType
            this.foreignExchangeContract = paymentOrderUpdateParams.foreignExchangeContract
            this.foreignExchangeIndicator = paymentOrderUpdateParams.foreignExchangeIndicator
            this.lineItems(paymentOrderUpdateParams.lineItems ?: listOf())
            this.metadata = paymentOrderUpdateParams.metadata
            this.nsfProtected = paymentOrderUpdateParams.nsfProtected
            this.originatingAccountId = paymentOrderUpdateParams.originatingAccountId
            this.originatingPartyName = paymentOrderUpdateParams.originatingPartyName
            this.priority = paymentOrderUpdateParams.priority
            this.purpose = paymentOrderUpdateParams.purpose
            this.receivingAccount = paymentOrderUpdateParams.receivingAccount
            this.receivingAccountId = paymentOrderUpdateParams.receivingAccountId
            this.remittanceInformation = paymentOrderUpdateParams.remittanceInformation
            this.sendRemittanceAdvice = paymentOrderUpdateParams.sendRemittanceAdvice
            this.statementDescriptor = paymentOrderUpdateParams.statementDescriptor
            this.status = paymentOrderUpdateParams.status
            this.subtype = paymentOrderUpdateParams.subtype
            this.type = paymentOrderUpdateParams.type
            this.ultimateOriginatingPartyIdentifier =
                paymentOrderUpdateParams.ultimateOriginatingPartyIdentifier
            this.ultimateOriginatingPartyName =
                paymentOrderUpdateParams.ultimateOriginatingPartyName
            this.ultimateReceivingPartyIdentifier =
                paymentOrderUpdateParams.ultimateReceivingPartyIdentifier
            this.ultimateReceivingPartyName = paymentOrderUpdateParams.ultimateReceivingPartyName
            additionalQueryParams(paymentOrderUpdateParams.additionalQueryParams)
            additionalHeaders(paymentOrderUpdateParams.additionalHeaders)
            additionalBodyProperties(paymentOrderUpdateParams.additionalBodyProperties)
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
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. If you are using Currencycloud, this is the
         * `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that will be
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
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
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
                if (lineItems.size == 0) null else lineItems.toUnmodifiable(),
                metadata,
                nsfProtected,
                originatingAccountId,
                originatingPartyName,
                priority,
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
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Accounting.Builder::class)
    @NoAutoDetect
    class Accounting
    private constructor(
        private val accountId: String?,
        private val classId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Accounting &&
                this.accountId == other.accountId &&
                this.classId == other.classId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        classId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var classId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accounting: Accounting) = apply {
                this.accountId = accounting.accountId
                this.classId = accounting.classId
                additionalProperties(accounting.additionalProperties)
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            @JsonProperty("class_id")
            fun classId(classId: String) = apply { this.classId = classId }

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

            fun build(): Accounting =
                Accounting(
                    accountId,
                    classId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class ChargeBearer
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChargeBearer && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val SHARED = ChargeBearer(JsonField.of("shared"))

            val SENDER = ChargeBearer(JsonField.of("sender"))

            val RECEIVER = ChargeBearer(JsonField.of("receiver"))

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
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
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

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FallbackType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = FallbackType(JsonField.of("ach"))

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
    }

    class ForeignExchangeIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ForeignExchangeIndicator && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val FIXED_TO_VARIABLE = ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

            val VARIABLE_TO_FIXED = ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItemRequest &&
                this.amount == other.amount &&
                this.metadata == other.metadata &&
                this.description == other.description &&
                this.accountingCategoryId == other.accountingCategoryId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        metadata,
                        description,
                        accountingCategoryId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

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

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Priority && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val HIGH = Priority(JsonField.of("high"))

            val NORMAL = Priority(JsonField.of("normal"))

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
    }

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     */
    @JsonDeserialize(builder = ReceivingAccount.Builder::class)
    @NoAutoDetect
    class ReceivingAccount
    private constructor(
        private val accountType: ExternalAccountType?,
        private val partyType: PartyType?,
        private val partyAddress: AddressRequest?,
        private val name: String?,
        private val accountDetails: List<AccountDetail>?,
        private val routingDetails: List<RoutingDetail>?,
        private val metadata: Metadata?,
        private val partyName: String?,
        private val partyIdentifier: String?,
        private val ledgerAccount: LedgerAccountCreateRequest?,
        private val plaidProcessorToken: String?,
        private val contactDetails: List<ContactDetailCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReceivingAccount &&
                this.accountType == other.accountType &&
                this.partyType == other.partyType &&
                this.partyAddress == other.partyAddress &&
                this.name == other.name &&
                this.accountDetails == other.accountDetails &&
                this.routingDetails == other.routingDetails &&
                this.metadata == other.metadata &&
                this.partyName == other.partyName &&
                this.partyIdentifier == other.partyIdentifier &&
                this.ledgerAccount == other.ledgerAccount &&
                this.plaidProcessorToken == other.plaidProcessorToken &&
                this.contactDetails == other.contactDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountType,
                        partyType,
                        partyAddress,
                        name,
                        accountDetails,
                        routingDetails,
                        metadata,
                        partyName,
                        partyIdentifier,
                        ledgerAccount,
                        plaidProcessorToken,
                        contactDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"

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
                this.accountType = receivingAccount.accountType
                this.partyType = receivingAccount.partyType
                this.partyAddress = receivingAccount.partyAddress
                this.name = receivingAccount.name
                this.accountDetails = receivingAccount.accountDetails
                this.routingDetails = receivingAccount.routingDetails
                this.metadata = receivingAccount.metadata
                this.partyName = receivingAccount.partyName
                this.partyIdentifier = receivingAccount.partyIdentifier
                this.ledgerAccount = receivingAccount.ledgerAccount
                this.plaidProcessorToken = receivingAccount.plaidProcessorToken
                this.contactDetails = receivingAccount.contactDetails
                additionalProperties(receivingAccount.additionalProperties)
            }

            /** Can be `checking`, `savings` or `other`. */
            @JsonProperty("account_type")
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            @JsonProperty("party_type")
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

            /** Required if receiving wire payments. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails
            }

            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                this.routingDetails = routingDetails
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            @JsonProperty("party_identifier")
            fun partyIdentifier(partyIdentifier: String) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            @JsonProperty("ledger_account")
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            @JsonProperty("plaid_processor_token")
            fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                this.contactDetails = contactDetails
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

            fun build(): ReceivingAccount =
                ReceivingAccount(
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails?.toUnmodifiable(),
                    routingDetails?.toUnmodifiable(),
                    metadata,
                    partyName,
                    partyIdentifier,
                    ledgerAccount,
                    plaidProcessorToken,
                    contactDetails?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = AccountDetail.Builder::class)
        @NoAutoDetect
        class AccountDetail
        private constructor(
            private val accountNumber: String?,
            private val accountNumberType: AccountNumberType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): AccountNumberType? = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountDetail &&
                    this.accountNumber == other.accountNumber &&
                    this.accountNumberType == other.accountNumberType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            accountNumberType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    this.accountNumber = accountDetail.accountNumber
                    this.accountNumberType = accountDetail.accountNumberType
                    additionalProperties(accountDetail.additionalProperties)
                }

                @JsonProperty("account_number")
                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                @JsonProperty("account_number_type")
                fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                    this.accountNumberType = accountNumberType
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

                fun build(): AccountDetail =
                    AccountDetail(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val IBAN = AccountNumberType(JsonField.of("iban"))

                    val CLABE = AccountNumberType(JsonField.of("clabe"))

                    val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                    val PAN = AccountNumberType(JsonField.of("pan"))

                    val OTHER = AccountNumberType(JsonField.of("other"))

                    fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                enum class Known {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                }

                enum class Value {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        IBAN -> Value.IBAN
                        CLABE -> Value.CLABE
                        WALLET_ADDRESS -> Value.WALLET_ADDRESS
                        PAN -> Value.PAN
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        IBAN -> Known.IBAN
                        CLABE -> Known.CLABE
                        WALLET_ADDRESS -> Known.WALLET_ADDRESS
                        PAN -> Known.PAN
                        OTHER -> Known.OTHER
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown AccountNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
        @NoAutoDetect
        class ContactDetailCreateRequest
        private constructor(
            private val contactIdentifier: String?,
            private val contactIdentifierType: ContactIdentifierType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContactDetailCreateRequest &&
                    this.contactIdentifier == other.contactIdentifier &&
                    this.contactIdentifierType == other.contactIdentifierType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            contactIdentifier,
                            contactIdentifierType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    this.contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    this.contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties(contactDetailCreateRequest.additionalProperties)
                }

                @JsonProperty("contact_identifier")
                fun contactIdentifier(contactIdentifier: String) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                @JsonProperty("contact_identifier_type")
                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                    this.contactIdentifierType = contactIdentifierType
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

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ContactIdentifierType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ContactIdentifierType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val EMAIL = ContactIdentifierType(JsonField.of("email"))

                    val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                    val WEBSITE = ContactIdentifierType(JsonField.of("website"))

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
            }
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerAccountCreateRequest
        private constructor(
            private val name: String?,
            private val description: String?,
            private val normalBalance: TransactionDirection?,
            private val ledgerId: String?,
            private val currency: String?,
            private val currencyExponent: Long?,
            private val ledgerableId: String?,
            private val ledgerableType: LedgerableType?,
            private val metadata: Metadata?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String? = name

            /** The description of the ledger account. */
            @JsonProperty("description") fun description(): String? = description

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection? = normalBalance

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerAccountCreateRequest &&
                    this.name == other.name &&
                    this.description == other.description &&
                    this.normalBalance == other.normalBalance &&
                    this.ledgerId == other.ledgerId &&
                    this.currency == other.currency &&
                    this.currencyExponent == other.currencyExponent &&
                    this.ledgerableId == other.ledgerableId &&
                    this.ledgerableType == other.ledgerableType &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            description,
                            normalBalance,
                            ledgerId,
                            currency,
                            currencyExponent,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"

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
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    this.name = ledgerAccountCreateRequest.name
                    this.description = ledgerAccountCreateRequest.description
                    this.normalBalance = ledgerAccountCreateRequest.normalBalance
                    this.ledgerId = ledgerAccountCreateRequest.ledgerId
                    this.currency = ledgerAccountCreateRequest.currency
                    this.currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    this.ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    this.ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    this.metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties(ledgerAccountCreateRequest.additionalProperties)
                }

                /** The name of the ledger account. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The description of the ledger account. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /** The normal balance of the ledger account. */
                @JsonProperty("normal_balance")
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The id of the ledger that this account belongs to. */
                @JsonProperty("ledger_id")
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The currency of the ledger account. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                @JsonProperty("currency_exponent")
                fun currencyExponent(currencyExponent: Long) = apply {
                    this.currencyExponent = currencyExponent
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
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
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
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

                    val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                    val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                }

                enum class Value {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
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

        /** Required if receiving wire payments. */
        @JsonDeserialize(builder = AddressRequest.Builder::class)
        @NoAutoDetect
        class AddressRequest
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val locality: String?,
            private val region: String?,
            private val postalCode: String?,
            private val country: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressRequest &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.locality == other.locality &&
                    this.region == other.region &&
                    this.postalCode == other.postalCode &&
                    this.country == other.country &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            locality,
                            region,
                            postalCode,
                            country,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

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
                    this.line1 = addressRequest.line1
                    this.line2 = addressRequest.line2
                    this.locality = addressRequest.locality
                    this.region = addressRequest.region
                    this.postalCode = addressRequest.postalCode
                    this.country = addressRequest.country
                    additionalProperties(addressRequest.additionalProperties)
                }

                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** Locality or City. */
                @JsonProperty("locality")
                fun locality(locality: String) = apply { this.locality = locality }

                /** Region or State. */
                @JsonProperty("region") fun region(region: String) = apply { this.region = region }

                /** The postal code of the address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

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

                fun build(): AddressRequest =
                    AddressRequest(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class PartyType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PartyType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BUSINESS = PartyType(JsonField.of("business"))

                val INDIVIDUAL = PartyType(JsonField.of("individual"))

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
        }

        @JsonDeserialize(builder = RoutingDetail.Builder::class)
        @NoAutoDetect
        class RoutingDetail
        private constructor(
            private val routingNumber: String?,
            private val routingNumberType: RoutingNumberType?,
            private val paymentType: PaymentType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType? = routingNumberType

            @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RoutingDetail &&
                    this.routingNumber == other.routingNumber &&
                    this.routingNumberType == other.routingNumberType &&
                    this.paymentType == other.paymentType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            routingNumber,
                            routingNumberType,
                            paymentType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var routingNumber: String? = null
                private var routingNumberType: RoutingNumberType? = null
                private var paymentType: PaymentType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    this.routingNumber = routingDetail.routingNumber
                    this.routingNumberType = routingDetail.routingNumberType
                    this.paymentType = routingDetail.paymentType
                    additionalProperties(routingDetail.additionalProperties)
                }

                @JsonProperty("routing_number")
                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                @JsonProperty("routing_number_type")
                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                @JsonProperty("payment_type")
                fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

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

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RoutingNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ABA = RoutingNumberType(JsonField.of("aba"))

                    val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

                    val SE_BANKGIRO_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                    val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

                    val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

                    val CHIPS = RoutingNumberType(JsonField.of("chips"))

                    val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

                    val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                    val HK_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

                    val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                    val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                    val NZ_NATIONAL_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                    val SWIFT = RoutingNumberType(JsonField.of("swift"))

                    val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                    fun of(value: String) = RoutingNumberType(JsonField.of(value))
                }

                enum class Known {
                    ABA,
                    AU_BSB,
                    SE_BANKGIRO_CLEARING_CODE,
                    BR_CODIGO,
                    CA_CPA,
                    CHIPS,
                    CNAPS,
                    GB_SORT_CODE,
                    HK_INTERBANK_CLEARING_CODE,
                    IN_IFSC,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SWIFT,
                    JP_ZENGIN_CODE,
                }

                enum class Value {
                    ABA,
                    AU_BSB,
                    SE_BANKGIRO_CLEARING_CODE,
                    BR_CODIGO,
                    CA_CPA,
                    CHIPS,
                    CNAPS,
                    GB_SORT_CODE,
                    HK_INTERBANK_CLEARING_CODE,
                    IN_IFSC,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SWIFT,
                    JP_ZENGIN_CODE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ABA -> Value.ABA
                        AU_BSB -> Value.AU_BSB
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        BR_CODIGO -> Value.BR_CODIGO
                        CA_CPA -> Value.CA_CPA
                        CHIPS -> Value.CHIPS
                        CNAPS -> Value.CNAPS
                        GB_SORT_CODE -> Value.GB_SORT_CODE
                        HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                        IN_IFSC -> Value.IN_IFSC
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        SWIFT -> Value.SWIFT
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ABA -> Known.ABA
                        AU_BSB -> Known.AU_BSB
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        BR_CODIGO -> Known.BR_CODIGO
                        CA_CPA -> Known.CA_CPA
                        CHIPS -> Known.CHIPS
                        CNAPS -> Known.CNAPS
                        GB_SORT_CODE -> Known.GB_SORT_CODE
                        HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                        IN_IFSC -> Known.IN_IFSC
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class PaymentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PaymentType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH = PaymentType(JsonField.of("ach"))

                    val AU_BECS = PaymentType(JsonField.of("au_becs"))

                    val BACS = PaymentType(JsonField.of("bacs"))

                    val BOOK = PaymentType(JsonField.of("book"))

                    val CARD = PaymentType(JsonField.of("card"))

                    val CHATS = PaymentType(JsonField.of("chats"))

                    val CHECK = PaymentType(JsonField.of("check"))

                    val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                    val EFT = PaymentType(JsonField.of("eft"))

                    val INTERAC = PaymentType(JsonField.of("interac"))

                    val MASAV = PaymentType(JsonField.of("masav"))

                    val NEFT = PaymentType(JsonField.of("neft"))

                    val NICS = PaymentType(JsonField.of("nics"))

                    val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                    val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                    val RTP = PaymentType(JsonField.of("rtp"))

                    val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                    val SEN = PaymentType(JsonField.of("sen"))

                    val SEPA = PaymentType(JsonField.of("sepa"))

                    val SIC = PaymentType(JsonField.of("sic"))

                    val SIGNET = PaymentType(JsonField.of("signet"))

                    val WIRE = PaymentType(JsonField.of("wire"))

                    val ZENGIN = PaymentType(JsonField.of("zengin"))

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
                    EFT,
                    INTERAC,
                    MASAV,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PROVXCHANGE,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SIC,
                    SIGNET,
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
                    EFT,
                    INTERAC,
                    MASAV,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PROVXCHANGE,
                    RTP,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
                    SIC,
                    SIGNET,
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
                        EFT -> Value.EFT
                        INTERAC -> Value.INTERAC
                        MASAV -> Value.MASAV
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PROVXCHANGE -> Value.PROVXCHANGE
                        RTP -> Value.RTP
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
                        SIC -> Value.SIC
                        SIGNET -> Value.SIGNET
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
                        EFT -> Known.EFT
                        INTERAC -> Known.INTERAC
                        MASAV -> Known.MASAV
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PROVXCHANGE -> Known.PROVXCHANGE
                        RTP -> Known.RTP
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
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

            val APPROVED = Status(JsonField.of("approved"))

            val CANCELLED = Status(JsonField.of("cancelled"))

            val COMPLETED = Status(JsonField.of("completed"))

            val DENIED = Status(JsonField.of("denied"))

            val FAILED = Status(JsonField.of("failed"))

            val NEEDS_APPROVAL = Status(JsonField.of("needs_approval"))

            val PENDING = Status(JsonField.of("pending"))

            val PROCESSING = Status(JsonField.of("processing"))

            val RETURNED = Status(JsonField.of("returned"))

            val REVERSED = Status(JsonField.of("reversed"))

            val SENT = Status(JsonField.of("sent"))

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
    }
}
