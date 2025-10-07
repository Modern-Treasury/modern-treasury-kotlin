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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Update a payment order */
class PaymentOrderUpdateParams
private constructor(
    private val id: String?,
    private val body: PaymentOrderUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accounting(): Accounting? = body.accounting()

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun accountingCategoryId(): String? = body.accountingCategoryId()

    /**
     * The ID of one of your accounting ledger classes. Note that these will only be accessible if
     * your accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun accountingLedgerClassId(): String? = body.accountingLedgerClassId()

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000 (cents).
     * For RTP, the maximum amount allowed by the network is $100,000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Long? = body.amount()

    /**
     * The party that will pay the fees for the payment order. See
     * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the differences
     * between the options.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun chargeBearer(): ChargeBearer? = body.chargeBearer()

    /**
     * Required when receiving_account_id is passed the ID of an external account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): String? = body.counterpartyId()

    /**
     * Defaults to the currency of the originating account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Currency? = body.currency()

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): Direction? = body.direction()

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate? = body.effectiveDate()

    /**
     * RFP payments require an expires_at. This value must be past the effective_date.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = body.expiresAt()

    /**
     * A payment type to fallback to if the original type is not valid for the receiving account.
     * Currently, this only supports falling back from RTP to ACH (type=rtp and fallback_type=ach)
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fallbackType(): FallbackType? = body.fallbackType()

    /**
     * If present, indicates a specific foreign exchange contract number that has been generated by
     * your financial institution.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeContract(): String? = body.foreignExchangeContract()

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeIndicator(): ForeignExchangeIndicator? = body.foreignExchangeIndicator()

    /**
     * An array of line items that must sum up to the amount of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItemRequest>? = body.lineItems()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * A boolean to determine if NSF Protection is enabled for this payment order. Note that this
     * setting must also be turned on in your organization settings page.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nsfProtected(): Boolean? = body.nsfProtected()

    /**
     * The ID of one of your organization's internal accounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingAccountId(): String? = body.originatingAccountId()

    /**
     * If present, this will replace your default company name on receiver's bank statement. This
     * field can only be used for ACH payments currently. For ACH, only the first 16 characters of
     * this string will be used. Any additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingPartyName(): String? = body.originatingPartyName()

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priority(): Priority? = body.priority()

    /**
     * If present, Modern Treasury will not process the payment until after this time. If
     * `process_after` is past the cutoff for `effective_date`, `process_after` will take precedence
     * and `effective_date` will automatically update to reflect the earliest possible sending date
     * after `process_after`. Format is ISO8601 timestamp.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun processAfter(): OffsetDateTime? = body.processAfter()

    /**
     * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt" field
     * in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be attached to
     * the payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purpose(): String? = body.purpose()

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingAccount(): ReceivingAccount? = body.receivingAccount()

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingAccountId(): String? = body.receivingAccountId()

    /**
     * True if the object is reconciled, false otherwise.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciled(): Boolean? = body.reconciled()

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /**
     * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
     * `send_remittance_advice` on the Counterparty is used.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendRemittanceAdvice(): Boolean? = body.sendRemittanceAdvice()

    /**
     * An optional descriptor which will appear in the receiver's statement. For `check` payments
     * this field will be used as the memo line. For `ach` the maximum length is 10 characters. Note
     * that for ACH payments, the name on your bank account will be included automatically by the
     * bank, so you can use the characters for other useful information. For `eft` the maximum
     * length is 15 characters.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statementDescriptor(): String? = body.statementDescriptor()

    /**
     * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
     * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Status? = body.status()

    /**
     * An additional layer of classification for the type of payment order you are doing. This field
     * is only used for `ach` payment orders currently. For `ach` payment orders, the `subtype`
     * represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and
     * `TEL`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subtype(): PaymentOrderSubtype? = body.subtype()

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): PaymentOrderType? = body.type()

    /**
     * This represents the identifier by which the person is known to the receiver when using the
     * CIE subtype for ACH payments. Only the first 22 characters of this string will be used. Any
     * additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyIdentifier(): String? = body.ultimateOriginatingPartyIdentifier()

    /**
     * This represents the name of the person that the payment is on behalf of when using the CIE
     * subtype for ACH payments. Only the first 15 characters of this string will be used. Any
     * additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyName(): String? = body.ultimateOriginatingPartyName()

    /**
     * This represents the name of the merchant that the payment is being sent to when using the CIE
     * subtype for ACH payments. Only the first 22 characters of this string will be used. Any
     * additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyIdentifier(): String? = body.ultimateReceivingPartyIdentifier()

    /**
     * This represents the identifier by which the merchant is known to the person initiating an ACH
     * payment with CIE subtype. Only the first 15 characters of this string will be used. Any
     * additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyName(): String? = body.ultimateReceivingPartyName()

    /**
     * Returns the raw JSON value of [accounting].
     *
     * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _accounting(): JsonField<Accounting> = body._accounting()

    /**
     * Returns the raw JSON value of [accountingCategoryId].
     *
     * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    fun _accountingCategoryId(): JsonField<String> = body._accountingCategoryId()

    /**
     * Returns the raw JSON value of [accountingLedgerClassId].
     *
     * Unlike [accountingLedgerClassId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _accountingLedgerClassId(): JsonField<String> = body._accountingLedgerClassId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [chargeBearer].
     *
     * Unlike [chargeBearer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chargeBearer(): JsonField<ChargeBearer> = body._chargeBearer()

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<Direction> = body._direction()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [fallbackType].
     *
     * Unlike [fallbackType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fallbackType(): JsonField<FallbackType> = body._fallbackType()

    /**
     * Returns the raw JSON value of [foreignExchangeContract].
     *
     * Unlike [foreignExchangeContract], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _foreignExchangeContract(): JsonField<String> = body._foreignExchangeContract()

    /**
     * Returns the raw JSON value of [foreignExchangeIndicator].
     *
     * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
        body._foreignExchangeIndicator()

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lineItems(): JsonField<List<LineItemRequest>> = body._lineItems()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [nsfProtected].
     *
     * Unlike [nsfProtected], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nsfProtected(): JsonField<Boolean> = body._nsfProtected()

    /**
     * Returns the raw JSON value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _originatingAccountId(): JsonField<String> = body._originatingAccountId()

    /**
     * Returns the raw JSON value of [originatingPartyName].
     *
     * Unlike [originatingPartyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _originatingPartyName(): JsonField<String> = body._originatingPartyName()

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _priority(): JsonField<Priority> = body._priority()

    /**
     * Returns the raw JSON value of [processAfter].
     *
     * Unlike [processAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _processAfter(): JsonField<OffsetDateTime> = body._processAfter()

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _purpose(): JsonField<String> = body._purpose()

    /**
     * Returns the raw JSON value of [receivingAccount].
     *
     * Unlike [receivingAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _receivingAccount(): JsonField<ReceivingAccount> = body._receivingAccount()

    /**
     * Returns the raw JSON value of [receivingAccountId].
     *
     * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _receivingAccountId(): JsonField<String> = body._receivingAccountId()

    /**
     * Returns the raw JSON value of [reconciled].
     *
     * Unlike [reconciled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reconciled(): JsonField<Boolean> = body._reconciled()

    /**
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /**
     * Returns the raw JSON value of [sendRemittanceAdvice].
     *
     * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendRemittanceAdvice(): JsonField<Boolean> = body._sendRemittanceAdvice()

    /**
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statementDescriptor(): JsonField<String> = body._statementDescriptor()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subtype(): JsonField<PaymentOrderSubtype> = body._subtype()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<PaymentOrderType> = body._type()

    /**
     * Returns the raw JSON value of [ultimateOriginatingPartyIdentifier].
     *
     * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
        body._ultimateOriginatingPartyIdentifier()

    /**
     * Returns the raw JSON value of [ultimateOriginatingPartyName].
     *
     * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ultimateOriginatingPartyName(): JsonField<String> = body._ultimateOriginatingPartyName()

    /**
     * Returns the raw JSON value of [ultimateReceivingPartyIdentifier].
     *
     * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
        body._ultimateReceivingPartyIdentifier()

    /**
     * Returns the raw JSON value of [ultimateReceivingPartyName].
     *
     * Unlike [ultimateReceivingPartyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ultimateReceivingPartyName(): JsonField<String> = body._ultimateReceivingPartyName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): PaymentOrderUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PaymentOrderUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [PaymentOrderUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: PaymentOrderUpdateRequest.Builder = PaymentOrderUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentOrderUpdateParams: PaymentOrderUpdateParams) = apply {
            id = paymentOrderUpdateParams.id
            body = paymentOrderUpdateParams.body.toBuilder()
            additionalHeaders = paymentOrderUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accounting]
         * - [accountingCategoryId]
         * - [accountingLedgerClassId]
         * - [amount]
         * - [chargeBearer]
         * - etc.
         */
        fun body(body: PaymentOrderUpdateRequest) = apply { this.body = body.toBuilder() }

        @Deprecated("deprecated")
        fun accounting(accounting: Accounting) = apply { body.accounting(accounting) }

        /**
         * Sets [Builder.accounting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounting] with a well-typed [Accounting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun accounting(accounting: JsonField<Accounting>) = apply { body.accounting(accounting) }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: String?) = apply {
            body.accountingCategoryId(accountingCategoryId)
        }

        /**
         * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingCategoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
            body.accountingCategoryId(accountingCategoryId)
        }

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: String?) = apply {
            body.accountingLedgerClassId(accountingLedgerClassId)
        }

        /**
         * Sets [Builder.accountingLedgerClassId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingLedgerClassId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
            body.accountingLedgerClassId(accountingLedgerClassId)
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The party that will pay the fees for the payment order. See
         * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the differences
         * between the options.
         */
        fun chargeBearer(chargeBearer: ChargeBearer?) = apply { body.chargeBearer(chargeBearer) }

        /**
         * Sets [Builder.chargeBearer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
            body.chargeBearer(chargeBearer)
        }

        /** Required when receiving_account_id is passed the ID of an external account. */
        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** An optional description for internal use. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { body.fallbackType(fallbackType) }

        /**
         * Sets [Builder.fallbackType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackType] with a well-typed [FallbackType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
            body.fallbackType(fallbackType)
        }

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: String?) = apply {
            body.foreignExchangeContract(foreignExchangeContract)
        }

        /**
         * Sets [Builder.foreignExchangeContract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeContract] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
            body.foreignExchangeContract(foreignExchangeContract)
        }

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) = apply {
            body.foreignExchangeIndicator(foreignExchangeIndicator)
        }

        /**
         * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
         * [ForeignExchangeIndicator] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun foreignExchangeIndicator(
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
        ) = apply { body.foreignExchangeIndicator(foreignExchangeIndicator) }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun lineItems(lineItems: List<LineItemRequest>) = apply { body.lineItems(lineItems) }

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItemRequest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
            body.lineItems(lineItems)
        }

        /**
         * Adds a single [LineItemRequest] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItemRequest) = apply { body.addLineItem(lineItem) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = apply { body.nsfProtected(nsfProtected) }

        /**
         * Sets [Builder.nsfProtected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
            body.nsfProtected(nsfProtected)
        }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: String?) = apply {
            body.originatingPartyName(originatingPartyName)
        }

        /**
         * Sets [Builder.originatingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingPartyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
            body.originatingPartyName(originatingPartyName)
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Priority] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priority(priority: JsonField<Priority>) = apply { body.priority(priority) }

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: OffsetDateTime?) = apply { body.processAfter(processAfter) }

        /**
         * Sets [Builder.processAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
            body.processAfter(processAfter)
        }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String?) = apply { body.purpose(purpose) }

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { body.purpose(purpose) }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
            body.receivingAccount(receivingAccount)
        }

        /**
         * Sets [Builder.receivingAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccount] with a well-typed [ReceivingAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
            body.receivingAccount(receivingAccount)
        }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccountId(receivingAccountId: String) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /**
         * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /** True if the object is reconciled, false otherwise. */
        fun reconciled(reconciled: Boolean) = apply { body.reconciled(reconciled) }

        /**
         * Sets [Builder.reconciled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reconciled(reconciled: JsonField<Boolean>) = apply { body.reconciled(reconciled) }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String?) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /**
         * Alias for [Builder.sendRemittanceAdvice].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
            sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

        /**
         * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: String?) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
         * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
         */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype?) = apply { body.subtype(subtype) }

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply { body.subtype(subtype) }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<PaymentOrderType>) = apply { body.type(type) }

        /**
         * This represents the identifier by which the person is known to the receiver when using
         * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
         * used. Any additional characters will be truncated.
         */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
            apply {
                body.ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier)
            }

        /**
         * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateOriginatingPartyIdentifier(
            ultimateOriginatingPartyIdentifier: JsonField<String>
        ) = apply { body.ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier) }

        /**
         * This represents the name of the person that the payment is on behalf of when using the
         * CIE subtype for ACH payments. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) = apply {
            body.ultimateOriginatingPartyName(ultimateOriginatingPartyName)
        }

        /**
         * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) = apply {
            body.ultimateOriginatingPartyName(ultimateOriginatingPartyName)
        }

        /**
         * This represents the name of the merchant that the payment is being sent to when using the
         * CIE subtype for ACH payments. Only the first 22 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) = apply {
            body.ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier)
        }

        /**
         * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: JsonField<String>) =
            apply {
                body.ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier)
            }

        /**
         * This represents the identifier by which the merchant is known to the person initiating an
         * ACH payment with CIE subtype. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) = apply {
            body.ultimateReceivingPartyName(ultimateReceivingPartyName)
        }

        /**
         * Sets [Builder.ultimateReceivingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) = apply {
            body.ultimateReceivingPartyName(ultimateReceivingPartyName)
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

        /**
         * Returns an immutable instance of [PaymentOrderUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PaymentOrderUpdateParams =
            PaymentOrderUpdateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): PaymentOrderUpdateRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class PaymentOrderUpdateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accounting: JsonField<Accounting>,
        private val accountingCategoryId: JsonField<String>,
        private val accountingLedgerClassId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val chargeBearer: JsonField<ChargeBearer>,
        private val counterpartyId: JsonField<String>,
        private val currency: JsonField<Currency>,
        private val description: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val effectiveDate: JsonField<LocalDate>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val fallbackType: JsonField<FallbackType>,
        private val foreignExchangeContract: JsonField<String>,
        private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
        private val lineItems: JsonField<List<LineItemRequest>>,
        private val metadata: JsonField<Metadata>,
        private val nsfProtected: JsonField<Boolean>,
        private val originatingAccountId: JsonField<String>,
        private val originatingPartyName: JsonField<String>,
        private val priority: JsonField<Priority>,
        private val processAfter: JsonField<OffsetDateTime>,
        private val purpose: JsonField<String>,
        private val receivingAccount: JsonField<ReceivingAccount>,
        private val receivingAccountId: JsonField<String>,
        private val reconciled: JsonField<Boolean>,
        private val remittanceInformation: JsonField<String>,
        private val sendRemittanceAdvice: JsonField<Boolean>,
        private val statementDescriptor: JsonField<String>,
        private val status: JsonField<Status>,
        private val subtype: JsonField<PaymentOrderSubtype>,
        private val type: JsonField<PaymentOrderType>,
        private val ultimateOriginatingPartyIdentifier: JsonField<String>,
        private val ultimateOriginatingPartyName: JsonField<String>,
        private val ultimateReceivingPartyIdentifier: JsonField<String>,
        private val ultimateReceivingPartyName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accounting")
            @ExcludeMissing
            accounting: JsonField<Accounting> = JsonMissing.of(),
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            accountingCategoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fallback_type")
            @ExcludeMissing
            fallbackType: JsonField<FallbackType> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            foreignExchangeContract: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            nsfProtected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            originatingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            originatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Priority> = JsonMissing.of(),
            @JsonProperty("process_after")
            @ExcludeMissing
            processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_account")
            @ExcludeMissing
            receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of(),
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            receivingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reconciled")
            @ExcludeMissing
            reconciled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("subtype")
            @ExcludeMissing
            subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<PaymentOrderType> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
        ) : this(
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
            reconciled,
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
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun accounting(): Accounting? = accounting.getNullable("accounting")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(): String? =
            accountingCategoryId.getNullable("accounting_category_id")

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(): String? =
            accountingLedgerClassId.getNullable("accounting_ledger_class_id")

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amount(): Long? = amount.getNullable("amount")

        /**
         * The party that will pay the fees for the payment order. See
         * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the differences
         * between the options.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun chargeBearer(): ChargeBearer? = chargeBearer.getNullable("charge_bearer")

        /**
         * Required when receiving_account_id is passed the ID of an external account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

        /**
         * Defaults to the currency of the originating account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.getNullable("currency")

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun direction(): Direction? = direction.getNullable("direction")

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

        /**
         * RFP payments require an expires_at. This value must be past the effective_date.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expires_at")

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fallbackType(): FallbackType? = fallbackType.getNullable("fallback_type")

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun foreignExchangeContract(): String? =
            foreignExchangeContract.getNullable("foreign_exchange_contract")

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
            foreignExchangeIndicator.getNullable("foreign_exchange_indicator")

        /**
         * An array of line items that must sum up to the amount of the payment order.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lineItems(): List<LineItemRequest>? = lineItems.getNullable("line_items")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nsfProtected(): Boolean? = nsfProtected.getNullable("nsf_protected")

        /**
         * The ID of one of your organization's internal accounts.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun originatingAccountId(): String? =
            originatingAccountId.getNullable("originating_account_id")

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun originatingPartyName(): String? =
            originatingPartyName.getNullable("originating_party_name")

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun priority(): Priority? = priority.getNullable("priority")

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun processAfter(): OffsetDateTime? = processAfter.getNullable("process_after")

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purpose(): String? = purpose.getNullable("purpose")

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivingAccount(): ReceivingAccount? =
            receivingAccount.getNullable("receiving_account")

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

        /**
         * True if the object is reconciled, false otherwise.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reconciled(): Boolean? = reconciled.getNullable("reconciled")

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittance_information")

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendRemittanceAdvice(): Boolean? =
            sendRemittanceAdvice.getNullable("send_remittance_advice")

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun statementDescriptor(): String? = statementDescriptor.getNullable("statement_descriptor")

        /**
         * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
         * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Status? = status.getNullable("status")

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subtype(): PaymentOrderSubtype? = subtype.getNullable("subtype")

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): PaymentOrderType? = type.getNullable("type")

        /**
         * This represents the identifier by which the person is known to the receiver when using
         * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
         * used. Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateOriginatingPartyIdentifier(): String? =
            ultimateOriginatingPartyIdentifier.getNullable("ultimate_originating_party_identifier")

        /**
         * This represents the name of the person that the payment is on behalf of when using the
         * CIE subtype for ACH payments. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateOriginatingPartyName(): String? =
            ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")

        /**
         * This represents the name of the merchant that the payment is being sent to when using the
         * CIE subtype for ACH payments. Only the first 22 characters of this string will be used.
         * Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateReceivingPartyIdentifier(): String? =
            ultimateReceivingPartyIdentifier.getNullable("ultimate_receiving_party_identifier")

        /**
         * This represents the identifier by which the merchant is known to the person initiating an
         * ACH payment with CIE subtype. Only the first 15 characters of this string will be used.
         * Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateReceivingPartyName(): String? =
            ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")

        /**
         * Returns the raw JSON value of [accounting].
         *
         * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("accounting")
        @ExcludeMissing
        fun _accounting(): JsonField<Accounting> = accounting

        /**
         * Returns the raw JSON value of [accountingCategoryId].
         *
         * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

        /**
         * Returns the raw JSON value of [accountingLedgerClassId].
         *
         * Unlike [accountingLedgerClassId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("accounting_ledger_class_id")
        @ExcludeMissing
        fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [chargeBearer].
         *
         * Unlike [chargeBearer], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("charge_bearer")
        @ExcludeMissing
        fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

        /**
         * Returns the raw JSON value of [counterpartyId].
         *
         * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [fallbackType].
         *
         * Unlike [fallbackType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fallback_type")
        @ExcludeMissing
        fun _fallbackType(): JsonField<FallbackType> = fallbackType

        /**
         * Returns the raw JSON value of [foreignExchangeContract].
         *
         * Unlike [foreignExchangeContract], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_exchange_contract")
        @ExcludeMissing
        fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

        /**
         * Returns the raw JSON value of [foreignExchangeIndicator].
         *
         * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
            foreignExchangeIndicator

        /**
         * Returns the raw JSON value of [lineItems].
         *
         * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [nsfProtected].
         *
         * Unlike [nsfProtected], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nsf_protected")
        @ExcludeMissing
        fun _nsfProtected(): JsonField<Boolean> = nsfProtected

        /**
         * Returns the raw JSON value of [originatingAccountId].
         *
         * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /**
         * Returns the raw JSON value of [originatingPartyName].
         *
         * Unlike [originatingPartyName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originating_party_name")
        @ExcludeMissing
        fun _originatingPartyName(): JsonField<String> = originatingPartyName

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Priority> = priority

        /**
         * Returns the raw JSON value of [processAfter].
         *
         * Unlike [processAfter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("process_after")
        @ExcludeMissing
        fun _processAfter(): JsonField<OffsetDateTime> = processAfter

        /**
         * Returns the raw JSON value of [purpose].
         *
         * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

        /**
         * Returns the raw JSON value of [receivingAccount].
         *
         * Unlike [receivingAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiving_account")
        @ExcludeMissing
        fun _receivingAccount(): JsonField<ReceivingAccount> = receivingAccount

        /**
         * Returns the raw JSON value of [receivingAccountId].
         *
         * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        fun _receivingAccountId(): JsonField<String> = receivingAccountId

        /**
         * Returns the raw JSON value of [reconciled].
         *
         * Unlike [reconciled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reconciled")
        @ExcludeMissing
        fun _reconciled(): JsonField<Boolean> = reconciled

        /**
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /**
         * Returns the raw JSON value of [sendRemittanceAdvice].
         *
         * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

        /**
         * Returns the raw JSON value of [statementDescriptor].
         *
         * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subtype")
        @ExcludeMissing
        fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

        /**
         * Returns the raw JSON value of [ultimateOriginatingPartyIdentifier].
         *
         * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("ultimate_originating_party_identifier")
        @ExcludeMissing
        fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
            ultimateOriginatingPartyIdentifier

        /**
         * Returns the raw JSON value of [ultimateOriginatingPartyName].
         *
         * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ultimate_originating_party_name")
        @ExcludeMissing
        fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

        /**
         * Returns the raw JSON value of [ultimateReceivingPartyIdentifier].
         *
         * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("ultimate_receiving_party_identifier")
        @ExcludeMissing
        fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
            ultimateReceivingPartyIdentifier

        /**
         * Returns the raw JSON value of [ultimateReceivingPartyName].
         *
         * Unlike [ultimateReceivingPartyName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ultimate_receiving_party_name")
        @ExcludeMissing
        fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

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
             * Returns a mutable builder for constructing an instance of
             * [PaymentOrderUpdateRequest].
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentOrderUpdateRequest]. */
        class Builder internal constructor() {

            private var accounting: JsonField<Accounting> = JsonMissing.of()
            private var accountingCategoryId: JsonField<String> = JsonMissing.of()
            private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
            private var counterpartyId: JsonField<String> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
            private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
            private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                JsonMissing.of()
            private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
            private var originatingAccountId: JsonField<String> = JsonMissing.of()
            private var originatingPartyName: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Priority> = JsonMissing.of()
            private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
            private var purpose: JsonField<String> = JsonMissing.of()
            private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
            private var receivingAccountId: JsonField<String> = JsonMissing.of()
            private var reconciled: JsonField<Boolean> = JsonMissing.of()
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
            private var statementDescriptor: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
            private var type: JsonField<PaymentOrderType> = JsonMissing.of()
            private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
            private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
            private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
            private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentOrderUpdateRequest: PaymentOrderUpdateRequest) = apply {
                accounting = paymentOrderUpdateRequest.accounting
                accountingCategoryId = paymentOrderUpdateRequest.accountingCategoryId
                accountingLedgerClassId = paymentOrderUpdateRequest.accountingLedgerClassId
                amount = paymentOrderUpdateRequest.amount
                chargeBearer = paymentOrderUpdateRequest.chargeBearer
                counterpartyId = paymentOrderUpdateRequest.counterpartyId
                currency = paymentOrderUpdateRequest.currency
                description = paymentOrderUpdateRequest.description
                direction = paymentOrderUpdateRequest.direction
                effectiveDate = paymentOrderUpdateRequest.effectiveDate
                expiresAt = paymentOrderUpdateRequest.expiresAt
                fallbackType = paymentOrderUpdateRequest.fallbackType
                foreignExchangeContract = paymentOrderUpdateRequest.foreignExchangeContract
                foreignExchangeIndicator = paymentOrderUpdateRequest.foreignExchangeIndicator
                lineItems = paymentOrderUpdateRequest.lineItems.map { it.toMutableList() }
                metadata = paymentOrderUpdateRequest.metadata
                nsfProtected = paymentOrderUpdateRequest.nsfProtected
                originatingAccountId = paymentOrderUpdateRequest.originatingAccountId
                originatingPartyName = paymentOrderUpdateRequest.originatingPartyName
                priority = paymentOrderUpdateRequest.priority
                processAfter = paymentOrderUpdateRequest.processAfter
                purpose = paymentOrderUpdateRequest.purpose
                receivingAccount = paymentOrderUpdateRequest.receivingAccount
                receivingAccountId = paymentOrderUpdateRequest.receivingAccountId
                reconciled = paymentOrderUpdateRequest.reconciled
                remittanceInformation = paymentOrderUpdateRequest.remittanceInformation
                sendRemittanceAdvice = paymentOrderUpdateRequest.sendRemittanceAdvice
                statementDescriptor = paymentOrderUpdateRequest.statementDescriptor
                status = paymentOrderUpdateRequest.status
                subtype = paymentOrderUpdateRequest.subtype
                type = paymentOrderUpdateRequest.type
                ultimateOriginatingPartyIdentifier =
                    paymentOrderUpdateRequest.ultimateOriginatingPartyIdentifier
                ultimateOriginatingPartyName =
                    paymentOrderUpdateRequest.ultimateOriginatingPartyName
                ultimateReceivingPartyIdentifier =
                    paymentOrderUpdateRequest.ultimateReceivingPartyIdentifier
                ultimateReceivingPartyName = paymentOrderUpdateRequest.ultimateReceivingPartyName
                additionalProperties = paymentOrderUpdateRequest.additionalProperties.toMutableMap()
            }

            @Deprecated("deprecated")
            fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

            /**
             * Sets [Builder.accounting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accounting] with a well-typed [Accounting] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun accounting(accounting: JsonField<Accounting>) = apply {
                this.accounting = accounting
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(accountingCategoryId: String?) =
                accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

            /**
             * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

            /**
             * Sets [Builder.accountingLedgerClassId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingLedgerClassId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                this.accountingLedgerClassId = accountingLedgerClassId
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The party that will pay the fees for the payment order. See
             * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the
             * differences between the options.
             */
            fun chargeBearer(chargeBearer: ChargeBearer?) =
                chargeBearer(JsonField.ofNullable(chargeBearer))

            /**
             * Sets [Builder.chargeBearer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                this.chargeBearer = chargeBearer
            }

            /** Required when receiving_account_id is passed the ID of an external account. */
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

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** An optional description for internal use. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(fallbackType: FallbackType) = fallbackType(JsonField.of(fallbackType))

            /**
             * Sets [Builder.fallbackType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackType] with a well-typed [FallbackType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(foreignExchangeContract: String?) =
                foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

            /**
             * Sets [Builder.foreignExchangeContract] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignExchangeContract] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                this.foreignExchangeContract = foreignExchangeContract
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

            /**
             * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
             * [ForeignExchangeIndicator] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun foreignExchangeIndicator(
                foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
            ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

            /**
             * Sets [Builder.lineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineItems] with a well-typed `List<LineItemRequest>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItemRequest] to [lineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItem(lineItem: LineItemRequest) = apply {
                lineItems =
                    (lineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

            /**
             * Sets [Builder.nsfProtected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                this.nsfProtected = nsfProtected
            }

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /**
             * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(originatingPartyName: String?) =
                originatingPartyName(JsonField.ofNullable(originatingPartyName))

            /**
             * Sets [Builder.originatingPartyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingPartyName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                this.originatingPartyName = originatingPartyName
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(priority: Priority) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Priority] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(processAfter: OffsetDateTime?) =
                processAfter(JsonField.ofNullable(processAfter))

            /**
             * Sets [Builder.processAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                this.processAfter = processAfter
            }

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

            /**
             * Sets [Builder.purpose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purpose] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(receivingAccount: ReceivingAccount) =
                receivingAccount(JsonField.of(receivingAccount))

            /**
             * Sets [Builder.receivingAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivingAccount] with a well-typed
             * [ReceivingAccount] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                this.receivingAccount = receivingAccount
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(receivingAccountId: String) =
                receivingAccountId(JsonField.of(receivingAccountId))

            /**
             * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /** True if the object is reconciled, false otherwise. */
            fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

            /**
             * Sets [Builder.reconciled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reconciled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reconciled(reconciled: JsonField<Boolean>) = apply { this.reconciled = reconciled }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(remittanceInformation: String?) =
                remittanceInformation(JsonField.ofNullable(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

            /**
             * Alias for [Builder.sendRemittanceAdvice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

            /**
             * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(statementDescriptor: String?) =
                statementDescriptor(JsonField.ofNullable(statementDescriptor))

            /**
             * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementDescriptor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply { this.subtype = subtype }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(type: PaymentOrderType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
                ultimateOriginatingPartyIdentifier(
                    JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
                )

            /**
             * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun ultimateOriginatingPartyIdentifier(
                ultimateOriginatingPartyIdentifier: JsonField<String>
            ) = apply {
                this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
            }

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

            /**
             * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                ultimateReceivingPartyIdentifier(
                    JsonField.ofNullable(ultimateReceivingPartyIdentifier)
                )

            /**
             * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateReceivingPartyIdentifier(
                ultimateReceivingPartyIdentifier: JsonField<String>
            ) = apply { this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier }

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

            /**
             * Sets [Builder.ultimateReceivingPartyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) = apply {
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

            /**
             * Returns an immutable instance of [PaymentOrderUpdateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PaymentOrderUpdateRequest =
                PaymentOrderUpdateRequest(
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
                    (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    nsfProtected,
                    originatingAccountId,
                    originatingPartyName,
                    priority,
                    processAfter,
                    purpose,
                    receivingAccount,
                    receivingAccountId,
                    reconciled,
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentOrderUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            accounting()?.validate()
            accountingCategoryId()
            accountingLedgerClassId()
            amount()
            chargeBearer()?.validate()
            counterpartyId()
            currency()?.validate()
            description()
            direction()?.validate()
            effectiveDate()
            expiresAt()
            fallbackType()?.validate()
            foreignExchangeContract()
            foreignExchangeIndicator()?.validate()
            lineItems()?.forEach { it.validate() }
            metadata()?.validate()
            nsfProtected()
            originatingAccountId()
            originatingPartyName()
            priority()?.validate()
            processAfter()
            purpose()
            receivingAccount()?.validate()
            receivingAccountId()
            reconciled()
            remittanceInformation()
            sendRemittanceAdvice()
            statementDescriptor()
            status()?.validate()
            subtype()?.validate()
            type()?.validate()
            ultimateOriginatingPartyIdentifier()
            ultimateOriginatingPartyName()
            ultimateReceivingPartyIdentifier()
            ultimateReceivingPartyName()
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
            (accounting.asKnown()?.validity() ?: 0) +
                (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                (if (accountingLedgerClassId.asKnown() == null) 0 else 1) +
                (if (amount.asKnown() == null) 0 else 1) +
                (chargeBearer.asKnown()?.validity() ?: 0) +
                (if (counterpartyId.asKnown() == null) 0 else 1) +
                (currency.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (direction.asKnown()?.validity() ?: 0) +
                (if (effectiveDate.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (fallbackType.asKnown()?.validity() ?: 0) +
                (if (foreignExchangeContract.asKnown() == null) 0 else 1) +
                (foreignExchangeIndicator.asKnown()?.validity() ?: 0) +
                (lineItems.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (nsfProtected.asKnown() == null) 0 else 1) +
                (if (originatingAccountId.asKnown() == null) 0 else 1) +
                (if (originatingPartyName.asKnown() == null) 0 else 1) +
                (priority.asKnown()?.validity() ?: 0) +
                (if (processAfter.asKnown() == null) 0 else 1) +
                (if (purpose.asKnown() == null) 0 else 1) +
                (receivingAccount.asKnown()?.validity() ?: 0) +
                (if (receivingAccountId.asKnown() == null) 0 else 1) +
                (if (reconciled.asKnown() == null) 0 else 1) +
                (if (remittanceInformation.asKnown() == null) 0 else 1) +
                (if (sendRemittanceAdvice.asKnown() == null) 0 else 1) +
                (if (statementDescriptor.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (subtype.asKnown()?.validity() ?: 0) +
                (type.asKnown()?.validity() ?: 0) +
                (if (ultimateOriginatingPartyIdentifier.asKnown() == null) 0 else 1) +
                (if (ultimateOriginatingPartyName.asKnown() == null) 0 else 1) +
                (if (ultimateReceivingPartyIdentifier.asKnown() == null) 0 else 1) +
                (if (ultimateReceivingPartyName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentOrderUpdateRequest &&
                accounting == other.accounting &&
                accountingCategoryId == other.accountingCategoryId &&
                accountingLedgerClassId == other.accountingLedgerClassId &&
                amount == other.amount &&
                chargeBearer == other.chargeBearer &&
                counterpartyId == other.counterpartyId &&
                currency == other.currency &&
                description == other.description &&
                direction == other.direction &&
                effectiveDate == other.effectiveDate &&
                expiresAt == other.expiresAt &&
                fallbackType == other.fallbackType &&
                foreignExchangeContract == other.foreignExchangeContract &&
                foreignExchangeIndicator == other.foreignExchangeIndicator &&
                lineItems == other.lineItems &&
                metadata == other.metadata &&
                nsfProtected == other.nsfProtected &&
                originatingAccountId == other.originatingAccountId &&
                originatingPartyName == other.originatingPartyName &&
                priority == other.priority &&
                processAfter == other.processAfter &&
                purpose == other.purpose &&
                receivingAccount == other.receivingAccount &&
                receivingAccountId == other.receivingAccountId &&
                reconciled == other.reconciled &&
                remittanceInformation == other.remittanceInformation &&
                sendRemittanceAdvice == other.sendRemittanceAdvice &&
                statementDescriptor == other.statementDescriptor &&
                status == other.status &&
                subtype == other.subtype &&
                type == other.type &&
                ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier &&
                ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
                ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
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
                processAfter,
                purpose,
                receivingAccount,
                receivingAccountId,
                reconciled,
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

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentOrderUpdateRequest{accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, reconciled=$reconciled, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
    }

    @Deprecated("deprecated")
    class Accounting
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val classId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("class_id") @ExcludeMissing classId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, classId, mutableMapOf())

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun accountId(): String? = accountId.getNullable("account_id")

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun classId(): String? = classId.getNullable("class_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("account_id")
        @ExcludeMissing
        fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [classId].
         *
         * Unlike [classId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("class_id")
        @ExcludeMissing
        fun _classId(): JsonField<String> = classId

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

            /** Returns a mutable builder for constructing an instance of [Accounting]. */
            fun builder() = Builder()
        }

        /** A builder for [Accounting]. */
        class Builder internal constructor() {

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
            @Deprecated("deprecated")
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun classId(classId: String?) = classId(JsonField.ofNullable(classId))

            /**
             * Sets [Builder.classId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
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

            /**
             * Returns an immutable instance of [Accounting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Accounting =
                Accounting(accountId, classId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Accounting = apply {
            if (validated) {
                return@apply
            }

            accountId()
            classId()
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
            (if (accountId.asKnown() == null) 0 else 1) + (if (classId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Accounting &&
                accountId == other.accountId &&
                classId == other.classId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
    }

    /**
     * The party that will pay the fees for the payment order. See
     * https://docs.moderntreasury.com/payments/docs/charge-bearer to understand the differences
     * between the options.
     */
    class ChargeBearer @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val SHARED = of("shared")

            val SENDER = of("sender")

            val RECEIVER = of("receiver")

            fun of(value: String) = ChargeBearer(JsonField.of(value))
        }

        /** An enum containing [ChargeBearer]'s known values. */
        enum class Known {
            SHARED,
            SENDER,
            RECEIVER,
        }

        /**
         * An enum containing [ChargeBearer]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChargeBearer] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SHARED,
            SENDER,
            RECEIVER,
            /**
             * An enum member indicating that [ChargeBearer] was instantiated with an unknown value.
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
                SHARED -> Value.SHARED
                SENDER -> Value.SENDER
                RECEIVER -> Value.RECEIVER
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
                SHARED -> Known.SHARED
                SENDER -> Known.SENDER
                RECEIVER -> Known.RECEIVER
                else -> throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
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

        fun validate(): ChargeBearer = apply {
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

            return other is ChargeBearer && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
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

    /**
     * A payment type to fallback to if the original type is not valid for the receiving account.
     * Currently, this only supports falling back from RTP to ACH (type=rtp and fallback_type=ach)
     */
    class FallbackType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val ACH = of("ach")

            fun of(value: String) = FallbackType(JsonField.of(value))
        }

        /** An enum containing [FallbackType]'s known values. */
        enum class Known {
            ACH
        }

        /**
         * An enum containing [FallbackType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FallbackType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            /**
             * An enum member indicating that [FallbackType] was instantiated with an unknown value.
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
                ACH -> Value.ACH
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
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
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

        fun validate(): FallbackType = apply {
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

            return other is FallbackType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     */
    class ForeignExchangeIndicator
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

            val FIXED_TO_VARIABLE = of("fixed_to_variable")

            val VARIABLE_TO_FIXED = of("variable_to_fixed")

            fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
        }

        /** An enum containing [ForeignExchangeIndicator]'s known values. */
        enum class Known {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
        }

        /**
         * An enum containing [ForeignExchangeIndicator]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ForeignExchangeIndicator] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            /**
             * An enum member indicating that [ForeignExchangeIndicator] was instantiated with an
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
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
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
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ForeignExchangeIndicator: $value"
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

        fun validate(): ForeignExchangeIndicator = apply {
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

            return other is ForeignExchangeIndicator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LineItemRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val accountingCategoryId: JsonField<String>,
        private val description: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            accountingCategoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(amount, accountingCategoryId, description, metadata, mutableMapOf())

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountingCategoryId(): String? =
            accountingCategoryId.getNullable("accounting_category_id")

        /**
         * A free-form description of the line item.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [accountingCategoryId].
         *
         * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * Returns a mutable builder for constructing an instance of [LineItemRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LineItemRequest]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var accountingCategoryId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
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
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(accountingCategoryId: String?) =
                accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

            /**
             * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /** A free-form description of the line item. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * Returns an immutable instance of [LineItemRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItemRequest =
                LineItemRequest(
                    checkRequired("amount", amount),
                    accountingCategoryId,
                    description,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LineItemRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            accountingCategoryId()
            description()
            metadata()?.validate()
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
            (if (amount.asKnown() == null) 0 else 1) +
                (if (accountingCategoryId.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

            return other is LineItemRequest &&
                amount == other.amount &&
                accountingCategoryId == other.accountingCategoryId &&
                description == other.description &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
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
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    class Priority @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val HIGH = of("high")

            val NORMAL = of("normal")

            fun of(value: String) = Priority(JsonField.of(value))
        }

        /** An enum containing [Priority]'s known values. */
        enum class Known {
            HIGH,
            NORMAL,
        }

        /**
         * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Priority] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGH,
            NORMAL,
            /** An enum member indicating that [Priority] was instantiated with an unknown value. */
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
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
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
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
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

        fun validate(): Priority = apply {
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

            return other is Priority && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     */
    class ReceivingAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountDetails: JsonField<List<AccountDetail>>,
        private val accountType: JsonField<ExternalAccountType>,
        private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
        private val externalId: JsonField<String>,
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val partyAddress: JsonField<AddressRequest>,
        private val partyIdentifier: JsonField<String>,
        private val partyName: JsonField<String>,
        private val partyType: JsonField<PartyType>,
        private val plaidProcessorToken: JsonField<String>,
        private val routingDetails: JsonField<List<RoutingDetail>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_details")
            @ExcludeMissing
            accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
            @JsonProperty("contact_details")
            @ExcludeMissing
            contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account")
            @ExcludeMissing
            ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_address")
            @ExcludeMissing
            partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
            @JsonProperty("party_identifier")
            @ExcludeMissing
            partyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_name")
            @ExcludeMissing
            partyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_type")
            @ExcludeMissing
            partyType: JsonField<PartyType> = JsonMissing.of(),
            @JsonProperty("plaid_processor_token")
            @ExcludeMissing
            plaidProcessorToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_details")
            @ExcludeMissing
            routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        ) : this(
            accountDetails,
            accountType,
            contactDetails,
            externalId,
            ledgerAccount,
            metadata,
            name,
            partyAddress,
            partyIdentifier,
            partyName,
            partyType,
            plaidProcessorToken,
            routingDetails,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountDetails(): List<AccountDetail>? = accountDetails.getNullable("account_details")

        /**
         * Can be `checking`, `savings` or `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountType(): ExternalAccountType? = accountType.getNullable("account_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactDetails(): List<ContactDetailCreateRequest>? =
            contactDetails.getNullable("contact_details")

        /**
         * An optional user-defined 180 character unique identifier.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.getNullable("external_id")

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccount(): LedgerAccountCreateRequest? =
            ledgerAccount.getNullable("ledger_account")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * Required if receiving wire payments.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyAddress(): AddressRequest? = partyAddress.getNullable("party_address")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyIdentifier(): String? = partyIdentifier.getNullable("party_identifier")

        /**
         * If this value isn't provided, it will be inherited from the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyName(): String? = partyName.getNullable("party_name")

        /**
         * Either `individual` or `business`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyType(): PartyType? = partyType.getNullable("party_type")

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun plaidProcessorToken(): String? =
            plaidProcessorToken.getNullable("plaid_processor_token")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingDetails(): List<RoutingDetail>? = routingDetails.getNullable("routing_details")

        /**
         * Returns the raw JSON value of [accountDetails].
         *
         * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        /**
         * Returns the raw JSON value of [contactDetails].
         *
         * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [ledgerAccount].
         *
         * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_account")
        @ExcludeMissing
        fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [partyAddress].
         *
         * Unlike [partyAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<AddressRequest> = partyAddress

        /**
         * Returns the raw JSON value of [partyIdentifier].
         *
         * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_identifier")
        @ExcludeMissing
        fun _partyIdentifier(): JsonField<String> = partyIdentifier

        /**
         * Returns the raw JSON value of [partyName].
         *
         * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /**
         * Returns the raw JSON value of [partyType].
         *
         * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        /**
         * Returns the raw JSON value of [plaidProcessorToken].
         *
         * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

        /**
         * Returns the raw JSON value of [routingDetails].
         *
         * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

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

            /** Returns a mutable builder for constructing an instance of [ReceivingAccount]. */
            fun builder() = Builder()
        }

        /** A builder for [ReceivingAccount]. */
        class Builder internal constructor() {

            private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetailCreateRequest>>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
            private var partyIdentifier: JsonField<String> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(receivingAccount: ReceivingAccount) = apply {
                accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                accountType = receivingAccount.accountType
                contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
                externalId = receivingAccount.externalId
                ledgerAccount = receivingAccount.ledgerAccount
                metadata = receivingAccount.metadata
                name = receivingAccount.name
                partyAddress = receivingAccount.partyAddress
                partyIdentifier = receivingAccount.partyIdentifier
                partyName = receivingAccount.partyName
                partyType = receivingAccount.partyType
                plaidProcessorToken = receivingAccount.plaidProcessorToken
                routingDetails = receivingAccount.routingDetails.map { it.toMutableList() }
                additionalProperties = receivingAccount.additionalProperties.toMutableMap()
            }

            fun accountDetails(accountDetails: List<AccountDetail>) =
                accountDetails(JsonField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [AccountDetail] to [accountDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails =
                    (accountDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountDetails", it).add(accountDetail)
                    }
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                contactDetails(JsonField.of(contactDetails))

            /**
             * Sets [Builder.contactDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactDetails] with a well-typed
             * `List<ContactDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun contactDetails(contactDetails: JsonField<List<ContactDetailCreateRequest>>) =
                apply {
                    this.contactDetails = contactDetails.map { it.toMutableList() }
                }

            /**
             * Adds a single [ContactDetailCreateRequest] to [contactDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contactDetails", it).add(contactDetail)
                    }
            }

            /** An optional user-defined 180 character unique identifier. */
            fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                ledgerAccount(JsonField.of(ledgerAccount))

            /**
             * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccount] with a well-typed
             * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(JsonField.of(partyAddress))

            /**
             * Sets [Builder.partyAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyAddress] with a well-typed [AddressRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            fun partyIdentifier(partyIdentifier: String) =
                partyIdentifier(JsonField.of(partyIdentifier))

            /**
             * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /**
             * Sets [Builder.partyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /**
             * Sets [Builder.partyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyType] with a well-typed [PartyType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) =
                plaidProcessorToken(JsonField.of(plaidProcessorToken))

            /**
             * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plaidProcessorToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [RoutingDetail] to [routingDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails =
                    (routingDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routingDetails", it).add(routingDetail)
                    }
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
             * Returns an immutable instance of [ReceivingAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ReceivingAccount =
                ReceivingAccount(
                    (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    accountType,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    externalId,
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReceivingAccount = apply {
            if (validated) {
                return@apply
            }

            accountDetails()?.forEach { it.validate() }
            accountType()?.validate()
            contactDetails()?.forEach { it.validate() }
            externalId()
            ledgerAccount()?.validate()
            metadata()?.validate()
            name()
            partyAddress()?.validate()
            partyIdentifier()
            partyName()
            partyType()?.validate()
            plaidProcessorToken()
            routingDetails()?.forEach { it.validate() }
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
            (accountDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (accountType.asKnown()?.validity() ?: 0) +
                (contactDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (externalId.asKnown() == null) 0 else 1) +
                (ledgerAccount.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (name.asKnown() == null) 0 else 1) +
                (partyAddress.asKnown()?.validity() ?: 0) +
                (if (partyIdentifier.asKnown() == null) 0 else 1) +
                (if (partyName.asKnown() == null) 0 else 1) +
                (partyType.asKnown()?.validity() ?: 0) +
                (if (plaidProcessorToken.asKnown() == null) 0 else 1) +
                (routingDetails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class AccountDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountNumberType: JsonField<AccountNumberType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("account_number_type")
                @ExcludeMissing
                accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
            ) : this(accountNumber, accountNumberType, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountNumberType(): AccountNumberType? =
                accountNumberType.getNullable("account_number_type")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [accountNumberType].
             *
             * Unlike [accountNumberType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("account_number_type")
            @ExcludeMissing
            fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
                 * Returns a mutable builder for constructing an instance of [AccountDetail].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountDetail]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType) =
                    accountNumberType(JsonField.of(accountNumberType))

                /**
                 * Sets [Builder.accountNumberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumberType] with a well-typed
                 * [AccountNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
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

                /**
                 * Returns an immutable instance of [AccountDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccountDetail =
                    AccountDetail(
                        checkRequired("accountNumber", accountNumber),
                        accountNumberType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountDetail = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                accountNumberType()?.validate()
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    (accountNumberType.asKnown()?.validity() ?: 0)

            class AccountNumberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AU_NUMBER = of("au_number")

                    val BASE_ADDRESS = of("base_address")

                    val CLABE = of("clabe")

                    val ETHEREUM_ADDRESS = of("ethereum_address")

                    val HK_NUMBER = of("hk_number")

                    val IBAN = of("iban")

                    val ID_NUMBER = of("id_number")

                    val NZ_NUMBER = of("nz_number")

                    val OTHER = of("other")

                    val PAN = of("pan")

                    val POLYGON_ADDRESS = of("polygon_address")

                    val SG_NUMBER = of("sg_number")

                    val SOLANA_ADDRESS = of("solana_address")

                    val WALLET_ADDRESS = of("wallet_address")

                    fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                /** An enum containing [AccountNumberType]'s known values. */
                enum class Known {
                    AU_NUMBER,
                    BASE_ADDRESS,
                    CLABE,
                    ETHEREUM_ADDRESS,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    POLYGON_ADDRESS,
                    SG_NUMBER,
                    SOLANA_ADDRESS,
                    WALLET_ADDRESS,
                }

                /**
                 * An enum containing [AccountNumberType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [AccountNumberType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AU_NUMBER,
                    BASE_ADDRESS,
                    CLABE,
                    ETHEREUM_ADDRESS,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    POLYGON_ADDRESS,
                    SG_NUMBER,
                    SOLANA_ADDRESS,
                    WALLET_ADDRESS,
                    /**
                     * An enum member indicating that [AccountNumberType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AU_NUMBER -> Value.AU_NUMBER
                        BASE_ADDRESS -> Value.BASE_ADDRESS
                        CLABE -> Value.CLABE
                        ETHEREUM_ADDRESS -> Value.ETHEREUM_ADDRESS
                        HK_NUMBER -> Value.HK_NUMBER
                        IBAN -> Value.IBAN
                        ID_NUMBER -> Value.ID_NUMBER
                        NZ_NUMBER -> Value.NZ_NUMBER
                        OTHER -> Value.OTHER
                        PAN -> Value.PAN
                        POLYGON_ADDRESS -> Value.POLYGON_ADDRESS
                        SG_NUMBER -> Value.SG_NUMBER
                        SOLANA_ADDRESS -> Value.SOLANA_ADDRESS
                        WALLET_ADDRESS -> Value.WALLET_ADDRESS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AU_NUMBER -> Known.AU_NUMBER
                        BASE_ADDRESS -> Known.BASE_ADDRESS
                        CLABE -> Known.CLABE
                        ETHEREUM_ADDRESS -> Known.ETHEREUM_ADDRESS
                        HK_NUMBER -> Known.HK_NUMBER
                        IBAN -> Known.IBAN
                        ID_NUMBER -> Known.ID_NUMBER
                        NZ_NUMBER -> Known.NZ_NUMBER
                        OTHER -> Known.OTHER
                        PAN -> Known.PAN
                        POLYGON_ADDRESS -> Known.POLYGON_ADDRESS
                        SG_NUMBER -> Known.SG_NUMBER
                        SOLANA_ADDRESS -> Known.SOLANA_ADDRESS
                        WALLET_ADDRESS -> Known.WALLET_ADDRESS
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown AccountNumberType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): AccountNumberType = apply {
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

                    return other is AccountNumberType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountDetail &&
                    accountNumber == other.accountNumber &&
                    accountNumberType == other.accountNumberType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountNumber, accountNumberType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

        /** Either `individual` or `business`. */
        class PartyType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BUSINESS = of("business")

                val INDIVIDUAL = of("individual")

                fun of(value: String) = PartyType(JsonField.of(value))
            }

            /** An enum containing [PartyType]'s known values. */
            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            /**
             * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PartyType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                /**
                 * An enum member indicating that [PartyType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): PartyType = apply {
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

                return other is PartyType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RoutingDetail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val routingNumber: JsonField<String>,
            private val routingNumberType: JsonField<RoutingNumberType>,
            private val paymentType: JsonField<PaymentType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("routing_number")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routing_number_type")
                @ExcludeMissing
                routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
                @JsonProperty("payment_type")
                @ExcludeMissing
                paymentType: JsonField<PaymentType> = JsonMissing.of(),
            ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumberType(): RoutingNumberType =
                routingNumberType.getRequired("routing_number_type")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentType(): PaymentType? = paymentType.getNullable("payment_type")

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [routingNumberType].
             *
             * Unlike [routingNumberType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

            /**
             * Returns the raw JSON value of [paymentType].
             *
             * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payment_type")
            @ExcludeMissing
            fun _paymentType(): JsonField<PaymentType> = paymentType

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
                 * Returns a mutable builder for constructing an instance of [RoutingDetail].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .routingNumber()
                 * .routingNumberType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [RoutingDetail]. */
            class Builder internal constructor() {

                private var routingNumber: JsonField<String>? = null
                private var routingNumberType: JsonField<RoutingNumberType>? = null
                private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) =
                    routingNumberType(JsonField.of(routingNumberType))

                /**
                 * Sets [Builder.routingNumberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumberType] with a well-typed
                 * [RoutingNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

                /**
                 * Sets [Builder.paymentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentType] with a well-typed [PaymentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentType(paymentType: JsonField<PaymentType>) = apply {
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

                /**
                 * Returns an immutable instance of [RoutingDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .routingNumber()
                 * .routingNumberType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("routingNumberType", routingNumberType),
                        paymentType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RoutingDetail = apply {
                if (validated) {
                    return@apply
                }

                routingNumber()
                routingNumberType().validate()
                paymentType()?.validate()
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
                (if (routingNumber.asKnown() == null) 0 else 1) +
                    (routingNumberType.asKnown()?.validity() ?: 0) +
                    (paymentType.asKnown()?.validity() ?: 0)

            class RoutingNumberType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
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

                    val IL_BANK_CODE = of("il_bank_code")

                    val IN_IFSC = of("in_ifsc")

                    val JP_ZENGIN_CODE = of("jp_zengin_code")

                    val MY_BRANCH_CODE = of("my_branch_code")

                    val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                    val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                    val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                    val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                    val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

                    val SWIFT = of("swift")

                    val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                    fun of(value: String) = RoutingNumberType(JsonField.of(value))
                }

                /** An enum containing [RoutingNumberType]'s known values. */
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
                    IL_BANK_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SG_INTERBANK_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                }

                /**
                 * An enum containing [RoutingNumberType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RoutingNumberType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
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
                    IL_BANK_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SG_INTERBANK_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
                    /**
                     * An enum member indicating that [RoutingNumberType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
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
                        IL_BANK_CODE -> Value.IL_BANK_CODE
                        IN_IFSC -> Value.IN_IFSC
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                        SWIFT -> Value.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
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
                        IL_BANK_CODE -> Known.IL_BANK_CODE
                        IN_IFSC -> Known.IN_IFSC
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): RoutingNumberType = apply {
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

                    return other is RoutingNumberType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PaymentType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACH = of("ach")

                    val AU_BECS = of("au_becs")

                    val BACS = of("bacs")

                    val BASE = of("base")

                    val BOOK = of("book")

                    val CARD = of("card")

                    val CHATS = of("chats")

                    val CHECK = of("check")

                    val CROSS_BORDER = of("cross_border")

                    val DK_NETS = of("dk_nets")

                    val EFT = of("eft")

                    val ETHEREUM = of("ethereum")

                    val GB_FPS = of("gb_fps")

                    val HU_ICS = of("hu_ics")

                    val INTERAC = of("interac")

                    val MASAV = of("masav")

                    val MX_CCEN = of("mx_ccen")

                    val NEFT = of("neft")

                    val NICS = of("nics")

                    val NZ_BECS = of("nz_becs")

                    val PL_ELIXIR = of("pl_elixir")

                    val POLYGON = of("polygon")

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

                    val SOLANA = of("solana")

                    val WIRE = of("wire")

                    val ZENGIN = of("zengin")

                    fun of(value: String) = PaymentType(JsonField.of(value))
                }

                /** An enum containing [PaymentType]'s known values. */
                enum class Known {
                    ACH,
                    AU_BECS,
                    BACS,
                    BASE,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    ETHEREUM,
                    GB_FPS,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    POLYGON,
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
                    SOLANA,
                    WIRE,
                    ZENGIN,
                }

                /**
                 * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [PaymentType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    AU_BECS,
                    BACS,
                    BASE,
                    BOOK,
                    CARD,
                    CHATS,
                    CHECK,
                    CROSS_BORDER,
                    DK_NETS,
                    EFT,
                    ETHEREUM,
                    GB_FPS,
                    HU_ICS,
                    INTERAC,
                    MASAV,
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
                    POLYGON,
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
                    SOLANA,
                    WIRE,
                    ZENGIN,
                    /**
                     * An enum member indicating that [PaymentType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        AU_BECS -> Value.AU_BECS
                        BACS -> Value.BACS
                        BASE -> Value.BASE
                        BOOK -> Value.BOOK
                        CARD -> Value.CARD
                        CHATS -> Value.CHATS
                        CHECK -> Value.CHECK
                        CROSS_BORDER -> Value.CROSS_BORDER
                        DK_NETS -> Value.DK_NETS
                        EFT -> Value.EFT
                        ETHEREUM -> Value.ETHEREUM
                        GB_FPS -> Value.GB_FPS
                        HU_ICS -> Value.HU_ICS
                        INTERAC -> Value.INTERAC
                        MASAV -> Value.MASAV
                        MX_CCEN -> Value.MX_CCEN
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PL_ELIXIR -> Value.PL_ELIXIR
                        POLYGON -> Value.POLYGON
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
                        SOLANA -> Value.SOLANA
                        WIRE -> Value.WIRE
                        ZENGIN -> Value.ZENGIN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        AU_BECS -> Known.AU_BECS
                        BACS -> Known.BACS
                        BASE -> Known.BASE
                        BOOK -> Known.BOOK
                        CARD -> Known.CARD
                        CHATS -> Known.CHATS
                        CHECK -> Known.CHECK
                        CROSS_BORDER -> Known.CROSS_BORDER
                        DK_NETS -> Known.DK_NETS
                        EFT -> Known.EFT
                        ETHEREUM -> Known.ETHEREUM
                        GB_FPS -> Known.GB_FPS
                        HU_ICS -> Known.HU_ICS
                        INTERAC -> Known.INTERAC
                        MASAV -> Known.MASAV
                        MX_CCEN -> Known.MX_CCEN
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PL_ELIXIR -> Known.PL_ELIXIR
                        POLYGON -> Known.POLYGON
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
                        SOLANA -> Known.SOLANA
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ModernTreasuryInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw ModernTreasuryInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): PaymentType = apply {
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

                    return other is PaymentType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RoutingDetail &&
                    routingNumber == other.routingNumber &&
                    routingNumberType == other.routingNumberType &&
                    paymentType == other.paymentType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReceivingAccount &&
                accountDetails == other.accountDetails &&
                accountType == other.accountType &&
                contactDetails == other.contactDetails &&
                externalId == other.externalId &&
                ledgerAccount == other.ledgerAccount &&
                metadata == other.metadata &&
                name == other.name &&
                partyAddress == other.partyAddress &&
                partyIdentifier == other.partyIdentifier &&
                partyName == other.partyName &&
                partyType == other.partyType &&
                plaidProcessorToken == other.plaidProcessorToken &&
                routingDetails == other.routingDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountDetails,
                accountType,
                contactDetails,
                externalId,
                ledgerAccount,
                metadata,
                name,
                partyAddress,
                partyIdentifier,
                partyName,
                partyType,
                plaidProcessorToken,
                routingDetails,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, externalId=$externalId, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    /**
     * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
     * `approved`. To undo approval on a denied or approved payment order, use `needs_approval`.
     */
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

            val APPROVED = of("approved")

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val DENIED = of("denied")

            val FAILED = of("failed")

            val HELD = of("held")

            val NEEDS_APPROVAL = of("needs_approval")

            val PENDING = of("pending")

            val PROCESSING = of("processing")

            val RETURNED = of("returned")

            val REVERSED = of("reversed")

            val SENT = of("sent")

            val STOPPED = of("stopped")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            HELD,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            STOPPED,
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
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            HELD,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            STOPPED,
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
                APPROVED -> Value.APPROVED
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                HELD -> Value.HELD
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                REVERSED -> Value.REVERSED
                SENT -> Value.SENT
                STOPPED -> Value.STOPPED
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
                APPROVED -> Known.APPROVED
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                HELD -> Known.HELD
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                REVERSED -> Known.REVERSED
                SENT -> Known.SENT
                STOPPED -> Known.STOPPED
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

        return other is PaymentOrderUpdateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PaymentOrderUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
