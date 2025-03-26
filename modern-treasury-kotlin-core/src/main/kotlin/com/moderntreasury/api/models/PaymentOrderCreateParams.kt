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
import com.moderntreasury.api.core.MultipartField
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Create a new Payment Order */
class PaymentOrderCreateParams
private constructor(
    private val body: PaymentOrderCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000 (cents).
     * For RTP, the maximum amount allowed by the network is $100,000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = body.direction()

    /**
     * The ID of one of your organization's internal accounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatingAccountId(): String = body.originatingAccountId()

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): PaymentOrderType = body.type()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accounting(): Accounting? = body.accounting()

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
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun chargeBearer(): ChargeBearer? = body.chargeBearer()

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
     * An array of documents to be attached to the payment order. Note that if you attach documents,
     * the request's content type must be `multipart/form-data`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documents(): List<DocumentCreateRequest>? = body.documents()

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
     * Specifies a ledger transaction object that will be created with the payment order. If the
     * ledger transaction cannot be created, then the payment order creation will fail. The
     * resulting ledger transaction will mirror the status of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransaction(): LedgerTransactionCreateRequest? = body.ledgerTransaction()

    /**
     * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
     * transaction can be attached upon payment order creation. Once the payment order is created,
     * the status of the ledger transaction tracks the payment order automatically.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): String? = body.ledgerTransactionId()

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
     * A flag that determines whether a payment order should go through transaction monitoring.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionMonitoringEnabled(): Boolean? = body.transactionMonitoringEnabled()

    /**
     * Identifier of the ultimate originator of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyIdentifier(): String? = body.ultimateOriginatingPartyIdentifier()

    /**
     * Name of the ultimate originator of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyName(): String? = body.ultimateOriginatingPartyName()

    /**
     * Identifier of the ultimate funds recipient.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyIdentifier(): String? = body.ultimateReceivingPartyIdentifier()

    /**
     * Name of the ultimate funds recipient.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyName(): String? = body.ultimateReceivingPartyName()

    /**
     * Returns the raw multipart value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _amount(): MultipartField<Long> = body._amount()

    /**
     * Returns the raw multipart value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _direction(): MultipartField<Direction> = body._direction()

    /**
     * Returns the raw multipart value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _originatingAccountId(): MultipartField<String> = body._originatingAccountId()

    /**
     * Returns the raw multipart value of [type].
     *
     * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _type(): MultipartField<PaymentOrderType> = body._type()

    /**
     * Returns the raw multipart value of [accounting].
     *
     * Unlike [accounting], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _accounting(): MultipartField<Accounting> = body._accounting()

    /**
     * Returns the raw multipart value of [accountingCategoryId].
     *
     * Unlike [accountingCategoryId], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _accountingCategoryId(): MultipartField<String> = body._accountingCategoryId()

    /**
     * Returns the raw multipart value of [accountingLedgerClassId].
     *
     * Unlike [accountingLedgerClassId], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    fun _accountingLedgerClassId(): MultipartField<String> = body._accountingLedgerClassId()

    /**
     * Returns the raw multipart value of [chargeBearer].
     *
     * Unlike [chargeBearer], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _chargeBearer(): MultipartField<ChargeBearer> = body._chargeBearer()

    /**
     * Returns the raw multipart value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _currency(): MultipartField<Currency> = body._currency()

    /**
     * Returns the raw multipart value of [description].
     *
     * Unlike [description], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _description(): MultipartField<String> = body._description()

    /**
     * Returns the raw multipart value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _documents(): MultipartField<List<DocumentCreateRequest>> = body._documents()

    /**
     * Returns the raw multipart value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _effectiveDate(): MultipartField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw multipart value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _expiresAt(): MultipartField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw multipart value of [fallbackType].
     *
     * Unlike [fallbackType], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _fallbackType(): MultipartField<FallbackType> = body._fallbackType()

    /**
     * Returns the raw multipart value of [foreignExchangeContract].
     *
     * Unlike [foreignExchangeContract], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _foreignExchangeContract(): MultipartField<String> = body._foreignExchangeContract()

    /**
     * Returns the raw multipart value of [foreignExchangeIndicator].
     *
     * Unlike [foreignExchangeIndicator], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _foreignExchangeIndicator(): MultipartField<ForeignExchangeIndicator> =
        body._foreignExchangeIndicator()

    /**
     * Returns the raw multipart value of [ledgerTransaction].
     *
     * Unlike [ledgerTransaction], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _ledgerTransaction(): MultipartField<LedgerTransactionCreateRequest> =
        body._ledgerTransaction()

    /**
     * Returns the raw multipart value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _ledgerTransactionId(): MultipartField<String> = body._ledgerTransactionId()

    /**
     * Returns the raw multipart value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _lineItems(): MultipartField<List<LineItemRequest>> = body._lineItems()

    /**
     * Returns the raw multipart value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _metadata(): MultipartField<Metadata> = body._metadata()

    /**
     * Returns the raw multipart value of [nsfProtected].
     *
     * Unlike [nsfProtected], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _nsfProtected(): MultipartField<Boolean> = body._nsfProtected()

    /**
     * Returns the raw multipart value of [originatingPartyName].
     *
     * Unlike [originatingPartyName], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _originatingPartyName(): MultipartField<String> = body._originatingPartyName()

    /**
     * Returns the raw multipart value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _priority(): MultipartField<Priority> = body._priority()

    /**
     * Returns the raw multipart value of [processAfter].
     *
     * Unlike [processAfter], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _processAfter(): MultipartField<OffsetDateTime> = body._processAfter()

    /**
     * Returns the raw multipart value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _purpose(): MultipartField<String> = body._purpose()

    /**
     * Returns the raw multipart value of [receivingAccount].
     *
     * Unlike [receivingAccount], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _receivingAccount(): MultipartField<ReceivingAccount> = body._receivingAccount()

    /**
     * Returns the raw multipart value of [receivingAccountId].
     *
     * Unlike [receivingAccountId], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _receivingAccountId(): MultipartField<String> = body._receivingAccountId()

    /**
     * Returns the raw multipart value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _remittanceInformation(): MultipartField<String> = body._remittanceInformation()

    /**
     * Returns the raw multipart value of [sendRemittanceAdvice].
     *
     * Unlike [sendRemittanceAdvice], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _sendRemittanceAdvice(): MultipartField<Boolean> = body._sendRemittanceAdvice()

    /**
     * Returns the raw multipart value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _statementDescriptor(): MultipartField<String> = body._statementDescriptor()

    /**
     * Returns the raw multipart value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _subtype(): MultipartField<PaymentOrderSubtype> = body._subtype()

    /**
     * Returns the raw multipart value of [transactionMonitoringEnabled].
     *
     * Unlike [transactionMonitoringEnabled], this method doesn't throw if the multipart field has
     * an unexpected type.
     */
    fun _transactionMonitoringEnabled(): MultipartField<Boolean> =
        body._transactionMonitoringEnabled()

    /**
     * Returns the raw multipart value of [ultimateOriginatingPartyIdentifier].
     *
     * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the multipart field
     * has an unexpected type.
     */
    fun _ultimateOriginatingPartyIdentifier(): MultipartField<String> =
        body._ultimateOriginatingPartyIdentifier()

    /**
     * Returns the raw multipart value of [ultimateOriginatingPartyName].
     *
     * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the multipart field has
     * an unexpected type.
     */
    fun _ultimateOriginatingPartyName(): MultipartField<String> =
        body._ultimateOriginatingPartyName()

    /**
     * Returns the raw multipart value of [ultimateReceivingPartyIdentifier].
     *
     * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the multipart field
     * has an unexpected type.
     */
    fun _ultimateReceivingPartyIdentifier(): MultipartField<String> =
        body._ultimateReceivingPartyIdentifier()

    /**
     * Returns the raw multipart value of [ultimateReceivingPartyName].
     *
     * Unlike [ultimateReceivingPartyName], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _ultimateReceivingPartyName(): MultipartField<String> = body._ultimateReceivingPartyName()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentOrderCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .direction()
         * .originatingAccountId()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentOrderCreateParams]. */
    class Builder internal constructor() {

        private var body: PaymentOrderCreateRequest.Builder = PaymentOrderCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(paymentOrderCreateParams: PaymentOrderCreateParams) = apply {
            body = paymentOrderCreateParams.body.toBuilder()
            additionalHeaders = paymentOrderCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary multipart value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: MultipartField<Long>) = apply { body.amount(amount) }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary multipart value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: MultipartField<Direction>) = apply { body.direction(direction) }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: MultipartField<String>) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary multipart value.
         *
         * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: MultipartField<PaymentOrderType>) = apply { body.type(type) }

        fun accounting(accounting: Accounting) = apply { body.accounting(accounting) }

        /**
         * Sets [Builder.accounting] to an arbitrary multipart value.
         *
         * You should usually call [Builder.accounting] with a well-typed [Accounting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounting(accounting: MultipartField<Accounting>) = apply {
            body.accounting(accounting)
        }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: String?) = apply {
            body.accountingCategoryId(accountingCategoryId)
        }

        /**
         * Sets [Builder.accountingCategoryId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.accountingCategoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: MultipartField<String>) = apply {
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
         * Sets [Builder.accountingLedgerClassId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.accountingLedgerClassId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: MultipartField<String>) = apply {
            body.accountingLedgerClassId(accountingLedgerClassId)
        }

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: ChargeBearer?) = apply { body.chargeBearer(chargeBearer) }

        /**
         * Sets [Builder.chargeBearer] to an arbitrary multipart value.
         *
         * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeBearer(chargeBearer: MultipartField<ChargeBearer>) = apply {
            body.chargeBearer(chargeBearer)
        }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary multipart value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: MultipartField<Currency>) = apply { body.currency(currency) }

        /** An optional description for internal use. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary multipart value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: MultipartField<String>) = apply {
            body.description(description)
        }

        /**
         * An array of documents to be attached to the payment order. Note that if you attach
         * documents, the request's content type must be `multipart/form-data`.
         */
        fun documents(documents: List<DocumentCreateRequest>) = apply { body.documents(documents) }

        /**
         * Sets [Builder.documents] to an arbitrary multipart value.
         *
         * You should usually call [Builder.documents] with a well-typed
         * `List<DocumentCreateRequest>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun documents(documents: MultipartField<List<DocumentCreateRequest>>) = apply {
            body.documents(documents)
        }

        /**
         * Adds a single [DocumentCreateRequest] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: DocumentCreateRequest) = apply { body.addDocument(document) }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary multipart value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: MultipartField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary multipart value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: MultipartField<OffsetDateTime>) = apply {
            body.expiresAt(expiresAt)
        }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { body.fallbackType(fallbackType) }

        /**
         * Sets [Builder.fallbackType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.fallbackType] with a well-typed [FallbackType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackType(fallbackType: MultipartField<FallbackType>) = apply {
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
         * Sets [Builder.foreignExchangeContract] to an arbitrary multipart value.
         *
         * You should usually call [Builder.foreignExchangeContract] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun foreignExchangeContract(foreignExchangeContract: MultipartField<String>) = apply {
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
         * Sets [Builder.foreignExchangeIndicator] to an arbitrary multipart value.
         *
         * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
         * [ForeignExchangeIndicator] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun foreignExchangeIndicator(
            foreignExchangeIndicator: MultipartField<ForeignExchangeIndicator>
        ) = apply { body.foreignExchangeIndicator(foreignExchangeIndicator) }

        /**
         * Specifies a ledger transaction object that will be created with the payment order. If the
         * ledger transaction cannot be created, then the payment order creation will fail. The
         * resulting ledger transaction will mirror the status of the payment order.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
            body.ledgerTransaction(ledgerTransaction)
        }

        /**
         * Sets [Builder.ledgerTransaction] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ledgerTransaction] with a well-typed
         * [LedgerTransactionCreateRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ledgerTransaction(ledgerTransaction: MultipartField<LedgerTransactionCreateRequest>) =
            apply {
                body.ledgerTransaction(ledgerTransaction)
            }

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon payment order creation. Once the payment order is
         * created, the status of the ledger transaction tracks the payment order automatically.
         */
        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            body.ledgerTransactionId(ledgerTransactionId)
        }

        /**
         * Sets [Builder.ledgerTransactionId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ledgerTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerTransactionId(ledgerTransactionId: MultipartField<String>) = apply {
            body.ledgerTransactionId(ledgerTransactionId)
        }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun lineItems(lineItems: List<LineItemRequest>) = apply { body.lineItems(lineItems) }

        /**
         * Sets [Builder.lineItems] to an arbitrary multipart value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItemRequest>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lineItems(lineItems: MultipartField<List<LineItemRequest>>) = apply {
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
         * Sets [Builder.metadata] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: MultipartField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = apply { body.nsfProtected(nsfProtected) }

        /**
         * Sets [Builder.nsfProtected] to an arbitrary multipart value.
         *
         * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nsfProtected(nsfProtected: MultipartField<Boolean>) = apply {
            body.nsfProtected(nsfProtected)
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
         * Sets [Builder.originatingPartyName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.originatingPartyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingPartyName(originatingPartyName: MultipartField<String>) = apply {
            body.originatingPartyName(originatingPartyName)
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { body.priority(priority) }

        /**
         * Sets [Builder.priority] to an arbitrary multipart value.
         *
         * You should usually call [Builder.priority] with a well-typed [Priority] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priority(priority: MultipartField<Priority>) = apply { body.priority(priority) }

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: OffsetDateTime?) = apply { body.processAfter(processAfter) }

        /**
         * Sets [Builder.processAfter] to an arbitrary multipart value.
         *
         * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processAfter(processAfter: MultipartField<OffsetDateTime>) = apply {
            body.processAfter(processAfter)
        }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String?) = apply { body.purpose(purpose) }

        /**
         * Sets [Builder.purpose] to an arbitrary multipart value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: MultipartField<String>) = apply { body.purpose(purpose) }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
            body.receivingAccount(receivingAccount)
        }

        /**
         * Sets [Builder.receivingAccount] to an arbitrary multipart value.
         *
         * You should usually call [Builder.receivingAccount] with a well-typed [ReceivingAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun receivingAccount(receivingAccount: MultipartField<ReceivingAccount>) = apply {
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
         * Sets [Builder.receivingAccountId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingAccountId(receivingAccountId: MultipartField<String>) = apply {
            body.receivingAccountId(receivingAccountId)
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
         * Sets [Builder.remittanceInformation] to an arbitrary multipart value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: MultipartField<String>) = apply {
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
         * Sets [Builder.sendRemittanceAdvice] to an arbitrary multipart value.
         *
         * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: MultipartField<Boolean>) = apply {
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
         * Sets [Builder.statementDescriptor] to an arbitrary multipart value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: MultipartField<String>) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype?) = apply { body.subtype(subtype) }

        /**
         * Sets [Builder.subtype] to an arbitrary multipart value.
         *
         * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subtype(subtype: MultipartField<PaymentOrderSubtype>) = apply { body.subtype(subtype) }

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         */
        fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) = apply {
            body.transactionMonitoringEnabled(transactionMonitoringEnabled)
        }

        /**
         * Sets [Builder.transactionMonitoringEnabled] to an arbitrary multipart value.
         *
         * You should usually call [Builder.transactionMonitoringEnabled] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transactionMonitoringEnabled(transactionMonitoringEnabled: MultipartField<Boolean>) =
            apply {
                body.transactionMonitoringEnabled(transactionMonitoringEnabled)
            }

        /** Identifier of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
            apply {
                body.ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier)
            }

        /**
         * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateOriginatingPartyIdentifier(
            ultimateOriginatingPartyIdentifier: MultipartField<String>
        ) = apply { body.ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier) }

        /** Name of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) = apply {
            body.ultimateOriginatingPartyName(ultimateOriginatingPartyName)
        }

        /**
         * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: MultipartField<String>) =
            apply {
                body.ultimateOriginatingPartyName(ultimateOriginatingPartyName)
            }

        /** Identifier of the ultimate funds recipient. */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) = apply {
            body.ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier)
        }

        /**
         * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateReceivingPartyIdentifier(
            ultimateReceivingPartyIdentifier: MultipartField<String>
        ) = apply { body.ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier) }

        /** Name of the ultimate funds recipient. */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) = apply {
            body.ultimateReceivingPartyName(ultimateReceivingPartyName)
        }

        /**
         * Sets [Builder.ultimateReceivingPartyName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: MultipartField<String>) = apply {
            body.ultimateReceivingPartyName(ultimateReceivingPartyName)
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
         * Returns an immutable instance of [PaymentOrderCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .direction()
         * .originatingAccountId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentOrderCreateParams =
            PaymentOrderCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Map<String, MultipartField<*>> =
        mapOf(
                "amount" to _amount(),
                "direction" to _direction(),
                "originating_account_id" to _originatingAccountId(),
                "type" to _type(),
                "accounting" to _accounting(),
                "accounting_category_id" to _accountingCategoryId(),
                "accounting_ledger_class_id" to _accountingLedgerClassId(),
                "charge_bearer" to _chargeBearer(),
                "currency" to _currency(),
                "description" to _description(),
                "documents" to _documents(),
                "effective_date" to _effectiveDate(),
                "expires_at" to _expiresAt(),
                "fallback_type" to _fallbackType(),
                "foreign_exchange_contract" to _foreignExchangeContract(),
                "foreign_exchange_indicator" to _foreignExchangeIndicator(),
                "ledger_transaction" to _ledgerTransaction(),
                "ledger_transaction_id" to _ledgerTransactionId(),
                "line_items" to _lineItems(),
                "metadata" to _metadata(),
                "nsf_protected" to _nsfProtected(),
                "originating_party_name" to _originatingPartyName(),
                "priority" to _priority(),
                "process_after" to _processAfter(),
                "purpose" to _purpose(),
                "receiving_account" to _receivingAccount(),
                "receiving_account_id" to _receivingAccountId(),
                "remittance_information" to _remittanceInformation(),
                "send_remittance_advice" to _sendRemittanceAdvice(),
                "statement_descriptor" to _statementDescriptor(),
                "subtype" to _subtype(),
                "transaction_monitoring_enabled" to _transactionMonitoringEnabled(),
                "ultimate_originating_party_identifier" to _ultimateOriginatingPartyIdentifier(),
                "ultimate_originating_party_name" to _ultimateOriginatingPartyName(),
                "ultimate_receiving_party_identifier" to _ultimateReceivingPartyIdentifier(),
                "ultimate_receiving_party_name" to _ultimateReceivingPartyName(),
            )
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class PaymentOrderCreateRequest
    private constructor(
        private val amount: MultipartField<Long>,
        private val direction: MultipartField<Direction>,
        private val originatingAccountId: MultipartField<String>,
        private val type: MultipartField<PaymentOrderType>,
        private val accounting: MultipartField<Accounting>,
        private val accountingCategoryId: MultipartField<String>,
        private val accountingLedgerClassId: MultipartField<String>,
        private val chargeBearer: MultipartField<ChargeBearer>,
        private val currency: MultipartField<Currency>,
        private val description: MultipartField<String>,
        private val documents: MultipartField<List<DocumentCreateRequest>>,
        private val effectiveDate: MultipartField<LocalDate>,
        private val expiresAt: MultipartField<OffsetDateTime>,
        private val fallbackType: MultipartField<FallbackType>,
        private val foreignExchangeContract: MultipartField<String>,
        private val foreignExchangeIndicator: MultipartField<ForeignExchangeIndicator>,
        private val ledgerTransaction: MultipartField<LedgerTransactionCreateRequest>,
        private val ledgerTransactionId: MultipartField<String>,
        private val lineItems: MultipartField<List<LineItemRequest>>,
        private val metadata: MultipartField<Metadata>,
        private val nsfProtected: MultipartField<Boolean>,
        private val originatingPartyName: MultipartField<String>,
        private val priority: MultipartField<Priority>,
        private val processAfter: MultipartField<OffsetDateTime>,
        private val purpose: MultipartField<String>,
        private val receivingAccount: MultipartField<ReceivingAccount>,
        private val receivingAccountId: MultipartField<String>,
        private val remittanceInformation: MultipartField<String>,
        private val sendRemittanceAdvice: MultipartField<Boolean>,
        private val statementDescriptor: MultipartField<String>,
        private val subtype: MultipartField<PaymentOrderSubtype>,
        private val transactionMonitoringEnabled: MultipartField<Boolean>,
        private val ultimateOriginatingPartyIdentifier: MultipartField<String>,
        private val ultimateOriginatingPartyName: MultipartField<String>,
        private val ultimateReceivingPartyIdentifier: MultipartField<String>,
        private val ultimateReceivingPartyName: MultipartField<String>,
    ) {

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.value.getRequired("amount")

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): Direction = direction.value.getRequired("direction")

        /**
         * The ID of one of your organization's internal accounts.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingAccountId(): String =
            originatingAccountId.value.getRequired("originating_account_id")

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): PaymentOrderType = type.value.getRequired("type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accounting(): Accounting? = accounting.value.getNullable("accounting")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(): String? =
            accountingCategoryId.value.getNullable("accounting_category_id")

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(): String? =
            accountingLedgerClassId.value.getNullable("accounting_ledger_class_id")

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun chargeBearer(): ChargeBearer? = chargeBearer.value.getNullable("charge_bearer")

        /**
         * Defaults to the currency of the originating account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Currency? = currency.value.getNullable("currency")

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.value.getNullable("description")

        /**
         * An array of documents to be attached to the payment order. Note that if you attach
         * documents, the request's content type must be `multipart/form-data`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documents(): List<DocumentCreateRequest>? = documents.value.getNullable("documents")

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate? = effectiveDate.value.getNullable("effective_date")

        /**
         * RFP payments require an expires_at. This value must be past the effective_date.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime? = expiresAt.value.getNullable("expires_at")

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fallbackType(): FallbackType? = fallbackType.value.getNullable("fallback_type")

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun foreignExchangeContract(): String? =
            foreignExchangeContract.value.getNullable("foreign_exchange_contract")

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun foreignExchangeIndicator(): ForeignExchangeIndicator? =
            foreignExchangeIndicator.value.getNullable("foreign_exchange_indicator")

        /**
         * Specifies a ledger transaction object that will be created with the payment order. If the
         * ledger transaction cannot be created, then the payment order creation will fail. The
         * resulting ledger transaction will mirror the status of the payment order.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerTransaction(): LedgerTransactionCreateRequest? =
            ledgerTransaction.value.getNullable("ledger_transaction")

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon payment order creation. Once the payment order is
         * created, the status of the ledger transaction tracks the payment order automatically.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerTransactionId(): String? =
            ledgerTransactionId.value.getNullable("ledger_transaction_id")

        /**
         * An array of line items that must sum up to the amount of the payment order.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lineItems(): List<LineItemRequest>? = lineItems.value.getNullable("line_items")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.value.getNullable("metadata")

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nsfProtected(): Boolean? = nsfProtected.value.getNullable("nsf_protected")

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun originatingPartyName(): String? =
            originatingPartyName.value.getNullable("originating_party_name")

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun priority(): Priority? = priority.value.getNullable("priority")

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun processAfter(): OffsetDateTime? = processAfter.value.getNullable("process_after")

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purpose(): String? = purpose.value.getNullable("purpose")

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivingAccount(): ReceivingAccount? =
            receivingAccount.value.getNullable("receiving_account")

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivingAccountId(): String? =
            receivingAccountId.value.getNullable("receiving_account_id")

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.value.getNullable("remittance_information")

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendRemittanceAdvice(): Boolean? =
            sendRemittanceAdvice.value.getNullable("send_remittance_advice")

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
        fun statementDescriptor(): String? =
            statementDescriptor.value.getNullable("statement_descriptor")

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subtype(): PaymentOrderSubtype? = subtype.value.getNullable("subtype")

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun transactionMonitoringEnabled(): Boolean? =
            transactionMonitoringEnabled.value.getNullable("transaction_monitoring_enabled")

        /**
         * Identifier of the ultimate originator of the payment order.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateOriginatingPartyIdentifier(): String? =
            ultimateOriginatingPartyIdentifier.value.getNullable(
                "ultimate_originating_party_identifier"
            )

        /**
         * Name of the ultimate originator of the payment order.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateOriginatingPartyName(): String? =
            ultimateOriginatingPartyName.value.getNullable("ultimate_originating_party_name")

        /**
         * Identifier of the ultimate funds recipient.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateReceivingPartyIdentifier(): String? =
            ultimateReceivingPartyIdentifier.value.getNullable(
                "ultimate_receiving_party_identifier"
            )

        /**
         * Name of the ultimate funds recipient.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ultimateReceivingPartyName(): String? =
            ultimateReceivingPartyName.value.getNullable("ultimate_receiving_party_name")

        /**
         * Returns the raw multipart value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): MultipartField<Long> = amount

        /**
         * Returns the raw multipart value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): MultipartField<Direction> = direction

        /**
         * Returns the raw multipart value of [originatingAccountId].
         *
         * Unlike [originatingAccountId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): MultipartField<String> = originatingAccountId

        /**
         * Returns the raw multipart value of [type].
         *
         * Unlike [type], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): MultipartField<PaymentOrderType> = type

        /**
         * Returns the raw multipart value of [accounting].
         *
         * Unlike [accounting], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("accounting")
        @ExcludeMissing
        fun _accounting(): MultipartField<Accounting> = accounting

        /**
         * Returns the raw multipart value of [accountingCategoryId].
         *
         * Unlike [accountingCategoryId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        fun _accountingCategoryId(): MultipartField<String> = accountingCategoryId

        /**
         * Returns the raw multipart value of [accountingLedgerClassId].
         *
         * Unlike [accountingLedgerClassId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("accounting_ledger_class_id")
        @ExcludeMissing
        fun _accountingLedgerClassId(): MultipartField<String> = accountingLedgerClassId

        /**
         * Returns the raw multipart value of [chargeBearer].
         *
         * Unlike [chargeBearer], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("charge_bearer")
        @ExcludeMissing
        fun _chargeBearer(): MultipartField<ChargeBearer> = chargeBearer

        /**
         * Returns the raw multipart value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun _currency(): MultipartField<Currency> = currency

        /**
         * Returns the raw multipart value of [description].
         *
         * Unlike [description], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): MultipartField<String> = description

        /**
         * Returns the raw multipart value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): MultipartField<List<DocumentCreateRequest>> = documents

        /**
         * Returns the raw multipart value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): MultipartField<LocalDate> = effectiveDate

        /**
         * Returns the raw multipart value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun _expiresAt(): MultipartField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw multipart value of [fallbackType].
         *
         * Unlike [fallbackType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("fallback_type")
        @ExcludeMissing
        fun _fallbackType(): MultipartField<FallbackType> = fallbackType

        /**
         * Returns the raw multipart value of [foreignExchangeContract].
         *
         * Unlike [foreignExchangeContract], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("foreign_exchange_contract")
        @ExcludeMissing
        fun _foreignExchangeContract(): MultipartField<String> = foreignExchangeContract

        /**
         * Returns the raw multipart value of [foreignExchangeIndicator].
         *
         * Unlike [foreignExchangeIndicator], this method doesn't throw if the multipart field has
         * an unexpected type.
         */
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        fun _foreignExchangeIndicator(): MultipartField<ForeignExchangeIndicator> =
            foreignExchangeIndicator

        /**
         * Returns the raw multipart value of [ledgerTransaction].
         *
         * Unlike [ledgerTransaction], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("ledger_transaction")
        @ExcludeMissing
        fun _ledgerTransaction(): MultipartField<LedgerTransactionCreateRequest> = ledgerTransaction

        /**
         * Returns the raw multipart value of [ledgerTransactionId].
         *
         * Unlike [ledgerTransactionId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun _ledgerTransactionId(): MultipartField<String> = ledgerTransactionId

        /**
         * Returns the raw multipart value of [lineItems].
         *
         * Unlike [lineItems], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun _lineItems(): MultipartField<List<LineItemRequest>> = lineItems

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): MultipartField<Metadata> = metadata

        /**
         * Returns the raw multipart value of [nsfProtected].
         *
         * Unlike [nsfProtected], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("nsf_protected")
        @ExcludeMissing
        fun _nsfProtected(): MultipartField<Boolean> = nsfProtected

        /**
         * Returns the raw multipart value of [originatingPartyName].
         *
         * Unlike [originatingPartyName], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("originating_party_name")
        @ExcludeMissing
        fun _originatingPartyName(): MultipartField<String> = originatingPartyName

        /**
         * Returns the raw multipart value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("priority")
        @ExcludeMissing
        fun _priority(): MultipartField<Priority> = priority

        /**
         * Returns the raw multipart value of [processAfter].
         *
         * Unlike [processAfter], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("process_after")
        @ExcludeMissing
        fun _processAfter(): MultipartField<OffsetDateTime> = processAfter

        /**
         * Returns the raw multipart value of [purpose].
         *
         * Unlike [purpose], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("purpose") @ExcludeMissing fun _purpose(): MultipartField<String> = purpose

        /**
         * Returns the raw multipart value of [receivingAccount].
         *
         * Unlike [receivingAccount], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("receiving_account")
        @ExcludeMissing
        fun _receivingAccount(): MultipartField<ReceivingAccount> = receivingAccount

        /**
         * Returns the raw multipart value of [receivingAccountId].
         *
         * Unlike [receivingAccountId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        fun _receivingAccountId(): MultipartField<String> = receivingAccountId

        /**
         * Returns the raw multipart value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): MultipartField<String> = remittanceInformation

        /**
         * Returns the raw multipart value of [sendRemittanceAdvice].
         *
         * Unlike [sendRemittanceAdvice], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        fun _sendRemittanceAdvice(): MultipartField<Boolean> = sendRemittanceAdvice

        /**
         * Returns the raw multipart value of [statementDescriptor].
         *
         * Unlike [statementDescriptor], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun _statementDescriptor(): MultipartField<String> = statementDescriptor

        /**
         * Returns the raw multipart value of [subtype].
         *
         * Unlike [subtype], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("subtype")
        @ExcludeMissing
        fun _subtype(): MultipartField<PaymentOrderSubtype> = subtype

        /**
         * Returns the raw multipart value of [transactionMonitoringEnabled].
         *
         * Unlike [transactionMonitoringEnabled], this method doesn't throw if the multipart field
         * has an unexpected type.
         */
        @JsonProperty("transaction_monitoring_enabled")
        @ExcludeMissing
        fun _transactionMonitoringEnabled(): MultipartField<Boolean> = transactionMonitoringEnabled

        /**
         * Returns the raw multipart value of [ultimateOriginatingPartyIdentifier].
         *
         * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the multipart
         * field has an unexpected type.
         */
        @JsonProperty("ultimate_originating_party_identifier")
        @ExcludeMissing
        fun _ultimateOriginatingPartyIdentifier(): MultipartField<String> =
            ultimateOriginatingPartyIdentifier

        /**
         * Returns the raw multipart value of [ultimateOriginatingPartyName].
         *
         * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the multipart field
         * has an unexpected type.
         */
        @JsonProperty("ultimate_originating_party_name")
        @ExcludeMissing
        fun _ultimateOriginatingPartyName(): MultipartField<String> = ultimateOriginatingPartyName

        /**
         * Returns the raw multipart value of [ultimateReceivingPartyIdentifier].
         *
         * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the multipart
         * field has an unexpected type.
         */
        @JsonProperty("ultimate_receiving_party_identifier")
        @ExcludeMissing
        fun _ultimateReceivingPartyIdentifier(): MultipartField<String> =
            ultimateReceivingPartyIdentifier

        /**
         * Returns the raw multipart value of [ultimateReceivingPartyName].
         *
         * Unlike [ultimateReceivingPartyName], this method doesn't throw if the multipart field has
         * an unexpected type.
         */
        @JsonProperty("ultimate_receiving_party_name")
        @ExcludeMissing
        fun _ultimateReceivingPartyName(): MultipartField<String> = ultimateReceivingPartyName

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [PaymentOrderCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .direction()
             * .originatingAccountId()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentOrderCreateRequest]. */
        class Builder internal constructor() {

            private var amount: MultipartField<Long>? = null
            private var direction: MultipartField<Direction>? = null
            private var originatingAccountId: MultipartField<String>? = null
            private var type: MultipartField<PaymentOrderType>? = null
            private var accounting: MultipartField<Accounting> = MultipartField.of(null)
            private var accountingCategoryId: MultipartField<String> = MultipartField.of(null)
            private var accountingLedgerClassId: MultipartField<String> = MultipartField.of(null)
            private var chargeBearer: MultipartField<ChargeBearer> = MultipartField.of(null)
            private var currency: MultipartField<Currency> = MultipartField.of(null)
            private var description: MultipartField<String> = MultipartField.of(null)
            private var documents: MultipartField<MutableList<DocumentCreateRequest>>? = null
            private var effectiveDate: MultipartField<LocalDate> = MultipartField.of(null)
            private var expiresAt: MultipartField<OffsetDateTime> = MultipartField.of(null)
            private var fallbackType: MultipartField<FallbackType> = MultipartField.of(null)
            private var foreignExchangeContract: MultipartField<String> = MultipartField.of(null)
            private var foreignExchangeIndicator: MultipartField<ForeignExchangeIndicator> =
                MultipartField.of(null)
            private var ledgerTransaction: MultipartField<LedgerTransactionCreateRequest> =
                MultipartField.of(null)
            private var ledgerTransactionId: MultipartField<String> = MultipartField.of(null)
            private var lineItems: MultipartField<MutableList<LineItemRequest>>? = null
            private var metadata: MultipartField<Metadata> = MultipartField.of(null)
            private var nsfProtected: MultipartField<Boolean> = MultipartField.of(null)
            private var originatingPartyName: MultipartField<String> = MultipartField.of(null)
            private var priority: MultipartField<Priority> = MultipartField.of(null)
            private var processAfter: MultipartField<OffsetDateTime> = MultipartField.of(null)
            private var purpose: MultipartField<String> = MultipartField.of(null)
            private var receivingAccount: MultipartField<ReceivingAccount> = MultipartField.of(null)
            private var receivingAccountId: MultipartField<String> = MultipartField.of(null)
            private var remittanceInformation: MultipartField<String> = MultipartField.of(null)
            private var sendRemittanceAdvice: MultipartField<Boolean> = MultipartField.of(null)
            private var statementDescriptor: MultipartField<String> = MultipartField.of(null)
            private var subtype: MultipartField<PaymentOrderSubtype> = MultipartField.of(null)
            private var transactionMonitoringEnabled: MultipartField<Boolean> =
                MultipartField.of(null)
            private var ultimateOriginatingPartyIdentifier: MultipartField<String> =
                MultipartField.of(null)
            private var ultimateOriginatingPartyName: MultipartField<String> =
                MultipartField.of(null)
            private var ultimateReceivingPartyIdentifier: MultipartField<String> =
                MultipartField.of(null)
            private var ultimateReceivingPartyName: MultipartField<String> = MultipartField.of(null)

            internal fun from(paymentOrderCreateRequest: PaymentOrderCreateRequest) = apply {
                amount = paymentOrderCreateRequest.amount
                direction = paymentOrderCreateRequest.direction
                originatingAccountId = paymentOrderCreateRequest.originatingAccountId
                type = paymentOrderCreateRequest.type
                accounting = paymentOrderCreateRequest.accounting
                accountingCategoryId = paymentOrderCreateRequest.accountingCategoryId
                accountingLedgerClassId = paymentOrderCreateRequest.accountingLedgerClassId
                chargeBearer = paymentOrderCreateRequest.chargeBearer
                currency = paymentOrderCreateRequest.currency
                description = paymentOrderCreateRequest.description
                documents = paymentOrderCreateRequest.documents.map { it.toMutableList() }
                effectiveDate = paymentOrderCreateRequest.effectiveDate
                expiresAt = paymentOrderCreateRequest.expiresAt
                fallbackType = paymentOrderCreateRequest.fallbackType
                foreignExchangeContract = paymentOrderCreateRequest.foreignExchangeContract
                foreignExchangeIndicator = paymentOrderCreateRequest.foreignExchangeIndicator
                ledgerTransaction = paymentOrderCreateRequest.ledgerTransaction
                ledgerTransactionId = paymentOrderCreateRequest.ledgerTransactionId
                lineItems = paymentOrderCreateRequest.lineItems.map { it.toMutableList() }
                metadata = paymentOrderCreateRequest.metadata
                nsfProtected = paymentOrderCreateRequest.nsfProtected
                originatingPartyName = paymentOrderCreateRequest.originatingPartyName
                priority = paymentOrderCreateRequest.priority
                processAfter = paymentOrderCreateRequest.processAfter
                purpose = paymentOrderCreateRequest.purpose
                receivingAccount = paymentOrderCreateRequest.receivingAccount
                receivingAccountId = paymentOrderCreateRequest.receivingAccountId
                remittanceInformation = paymentOrderCreateRequest.remittanceInformation
                sendRemittanceAdvice = paymentOrderCreateRequest.sendRemittanceAdvice
                statementDescriptor = paymentOrderCreateRequest.statementDescriptor
                subtype = paymentOrderCreateRequest.subtype
                transactionMonitoringEnabled =
                    paymentOrderCreateRequest.transactionMonitoringEnabled
                ultimateOriginatingPartyIdentifier =
                    paymentOrderCreateRequest.ultimateOriginatingPartyIdentifier
                ultimateOriginatingPartyName =
                    paymentOrderCreateRequest.ultimateOriginatingPartyName
                ultimateReceivingPartyIdentifier =
                    paymentOrderCreateRequest.ultimateReceivingPartyIdentifier
                ultimateReceivingPartyName = paymentOrderCreateRequest.ultimateReceivingPartyName
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(amount: Long) = amount(MultipartField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary multipart value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: MultipartField<Long>) = apply { this.amount = amount }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: Direction) = direction(MultipartField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary multipart value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: MultipartField<Direction>) = apply {
                this.direction = direction
            }

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(MultipartField.of(originatingAccountId))

            /**
             * Sets [Builder.originatingAccountId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.originatingAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingAccountId(originatingAccountId: MultipartField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(type: PaymentOrderType) = type(MultipartField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary multipart value.
             *
             * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: MultipartField<PaymentOrderType>) = apply { this.type = type }

            fun accounting(accounting: Accounting) = accounting(MultipartField.of(accounting))

            /**
             * Sets [Builder.accounting] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accounting] with a well-typed [Accounting] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accounting(accounting: MultipartField<Accounting>) = apply {
                this.accounting = accounting
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(accountingCategoryId: String?) =
                accountingCategoryId(MultipartField.of(accountingCategoryId))

            /**
             * Sets [Builder.accountingCategoryId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(accountingCategoryId: MultipartField<String>) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                accountingLedgerClassId(MultipartField.of(accountingLedgerClassId))

            /**
             * Sets [Builder.accountingLedgerClassId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountingLedgerClassId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(accountingLedgerClassId: MultipartField<String>) = apply {
                this.accountingLedgerClassId = accountingLedgerClassId
            }

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(chargeBearer: ChargeBearer?) =
                chargeBearer(MultipartField.of(chargeBearer))

            /**
             * Sets [Builder.chargeBearer] to an arbitrary multipart value.
             *
             * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chargeBearer(chargeBearer: MultipartField<ChargeBearer>) = apply {
                this.chargeBearer = chargeBearer
            }

            /** Defaults to the currency of the originating account. */
            fun currency(currency: Currency) = currency(MultipartField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary multipart value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: MultipartField<Currency>) = apply { this.currency = currency }

            /** An optional description for internal use. */
            fun description(description: String?) = description(MultipartField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary multipart value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: MultipartField<String>) = apply {
                this.description = description
            }

            /**
             * An array of documents to be attached to the payment order. Note that if you attach
             * documents, the request's content type must be `multipart/form-data`.
             */
            fun documents(documents: List<DocumentCreateRequest>) =
                documents(MultipartField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documents] with a well-typed
             * `List<DocumentCreateRequest>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun documents(documents: MultipartField<List<DocumentCreateRequest>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [DocumentCreateRequest] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: DocumentCreateRequest) = apply {
                documents =
                    (documents ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
            }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(effectiveDate: LocalDate) =
                effectiveDate(MultipartField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary multipart value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: MultipartField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(MultipartField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary multipart value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: MultipartField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(fallbackType: FallbackType) =
                fallbackType(MultipartField.of(fallbackType))

            /**
             * Sets [Builder.fallbackType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.fallbackType] with a well-typed [FallbackType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fallbackType(fallbackType: MultipartField<FallbackType>) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(foreignExchangeContract: String?) =
                foreignExchangeContract(MultipartField.of(foreignExchangeContract))

            /**
             * Sets [Builder.foreignExchangeContract] to an arbitrary multipart value.
             *
             * You should usually call [Builder.foreignExchangeContract] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun foreignExchangeContract(foreignExchangeContract: MultipartField<String>) = apply {
                this.foreignExchangeContract = foreignExchangeContract
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                foreignExchangeIndicator(MultipartField.of(foreignExchangeIndicator))

            /**
             * Sets [Builder.foreignExchangeIndicator] to an arbitrary multipart value.
             *
             * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
             * [ForeignExchangeIndicator] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun foreignExchangeIndicator(
                foreignExchangeIndicator: MultipartField<ForeignExchangeIndicator>
            ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                ledgerTransaction(MultipartField.of(ledgerTransaction))

            /**
             * Sets [Builder.ledgerTransaction] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerTransaction] with a well-typed
             * [LedgerTransactionCreateRequest] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun ledgerTransaction(
                ledgerTransaction: MultipartField<LedgerTransactionCreateRequest>
            ) = apply { this.ledgerTransaction = ledgerTransaction }

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            fun ledgerTransactionId(ledgerTransactionId: String) =
                ledgerTransactionId(MultipartField.of(ledgerTransactionId))

            /**
             * Sets [Builder.ledgerTransactionId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerTransactionId(ledgerTransactionId: MultipartField<String>) = apply {
                this.ledgerTransactionId = ledgerTransactionId
            }

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(lineItems: List<LineItemRequest>) =
                lineItems(MultipartField.of(lineItems))

            /**
             * Sets [Builder.lineItems] to an arbitrary multipart value.
             *
             * You should usually call [Builder.lineItems] with a well-typed `List<LineItemRequest>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lineItems(lineItems: MultipartField<List<LineItemRequest>>) = apply {
                this.lineItems = lineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [LineItemRequest] to [lineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLineItem(lineItem: LineItemRequest) = apply {
                lineItems =
                    (lineItems ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("lineItems", it).add(lineItem)
                    }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(nsfProtected: Boolean) = nsfProtected(MultipartField.of(nsfProtected))

            /**
             * Sets [Builder.nsfProtected] to an arbitrary multipart value.
             *
             * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nsfProtected(nsfProtected: MultipartField<Boolean>) = apply {
                this.nsfProtected = nsfProtected
            }

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(originatingPartyName: String?) =
                originatingPartyName(MultipartField.of(originatingPartyName))

            /**
             * Sets [Builder.originatingPartyName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.originatingPartyName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingPartyName(originatingPartyName: MultipartField<String>) = apply {
                this.originatingPartyName = originatingPartyName
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(priority: Priority) = priority(MultipartField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary multipart value.
             *
             * You should usually call [Builder.priority] with a well-typed [Priority] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: MultipartField<Priority>) = apply { this.priority = priority }

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(processAfter: OffsetDateTime?) =
                processAfter(MultipartField.of(processAfter))

            /**
             * Sets [Builder.processAfter] to an arbitrary multipart value.
             *
             * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun processAfter(processAfter: MultipartField<OffsetDateTime>) = apply {
                this.processAfter = processAfter
            }

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            fun purpose(purpose: String?) = purpose(MultipartField.of(purpose))

            /**
             * Sets [Builder.purpose] to an arbitrary multipart value.
             *
             * You should usually call [Builder.purpose] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purpose(purpose: MultipartField<String>) = apply { this.purpose = purpose }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(receivingAccount: ReceivingAccount) =
                receivingAccount(MultipartField.of(receivingAccount))

            /**
             * Sets [Builder.receivingAccount] to an arbitrary multipart value.
             *
             * You should usually call [Builder.receivingAccount] with a well-typed
             * [ReceivingAccount] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun receivingAccount(receivingAccount: MultipartField<ReceivingAccount>) = apply {
                this.receivingAccount = receivingAccount
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(receivingAccountId: String) =
                receivingAccountId(MultipartField.of(receivingAccountId))

            /**
             * Sets [Builder.receivingAccountId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receivingAccountId(receivingAccountId: MultipartField<String>) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(remittanceInformation: String?) =
                remittanceInformation(MultipartField.of(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary multipart value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: MultipartField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                sendRemittanceAdvice(MultipartField.of(sendRemittanceAdvice))

            /**
             * Alias for [Builder.sendRemittanceAdvice].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

            /**
             * Sets [Builder.sendRemittanceAdvice] to an arbitrary multipart value.
             *
             * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: MultipartField<Boolean>) = apply {
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
                statementDescriptor(MultipartField.of(statementDescriptor))

            /**
             * Sets [Builder.statementDescriptor] to an arbitrary multipart value.
             *
             * You should usually call [Builder.statementDescriptor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statementDescriptor(statementDescriptor: MultipartField<String>) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(subtype: PaymentOrderSubtype?) = subtype(MultipartField.of(subtype))

            /**
             * Sets [Builder.subtype] to an arbitrary multipart value.
             *
             * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subtype(subtype: MultipartField<PaymentOrderSubtype>) = apply {
                this.subtype = subtype
            }

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
                transactionMonitoringEnabled(MultipartField.of(transactionMonitoringEnabled))

            /**
             * Sets [Builder.transactionMonitoringEnabled] to an arbitrary multipart value.
             *
             * You should usually call [Builder.transactionMonitoringEnabled] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun transactionMonitoringEnabled(
                transactionMonitoringEnabled: MultipartField<Boolean>
            ) = apply { this.transactionMonitoringEnabled = transactionMonitoringEnabled }

            /** Identifier of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
                ultimateOriginatingPartyIdentifier(
                    MultipartField.of(ultimateOriginatingPartyIdentifier)
                )

            /**
             * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun ultimateOriginatingPartyIdentifier(
                ultimateOriginatingPartyIdentifier: MultipartField<String>
            ) = apply {
                this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
            }

            /** Name of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                ultimateOriginatingPartyName(MultipartField.of(ultimateOriginatingPartyName))

            /**
             * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: MultipartField<String>) =
                apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

            /** Identifier of the ultimate funds recipient. */
            fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                ultimateReceivingPartyIdentifier(
                    MultipartField.of(ultimateReceivingPartyIdentifier)
                )

            /**
             * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateReceivingPartyIdentifier(
                ultimateReceivingPartyIdentifier: MultipartField<String>
            ) = apply { this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier }

            /** Name of the ultimate funds recipient. */
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                ultimateReceivingPartyName(MultipartField.of(ultimateReceivingPartyName))

            /**
             * Sets [Builder.ultimateReceivingPartyName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: MultipartField<String>) =
                apply {
                    this.ultimateReceivingPartyName = ultimateReceivingPartyName
                }

            /**
             * Returns an immutable instance of [PaymentOrderCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .direction()
             * .originatingAccountId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentOrderCreateRequest =
                PaymentOrderCreateRequest(
                    checkRequired("amount", amount),
                    checkRequired("direction", direction),
                    checkRequired("originatingAccountId", originatingAccountId),
                    checkRequired("type", type),
                    accounting,
                    accountingCategoryId,
                    accountingLedgerClassId,
                    chargeBearer,
                    currency,
                    description,
                    (documents ?: MultipartField.of(null)).map { it.toImmutable() },
                    effectiveDate,
                    expiresAt,
                    fallbackType,
                    foreignExchangeContract,
                    foreignExchangeIndicator,
                    ledgerTransaction,
                    ledgerTransactionId,
                    (lineItems ?: MultipartField.of(null)).map { it.toImmutable() },
                    metadata,
                    nsfProtected,
                    originatingPartyName,
                    priority,
                    processAfter,
                    purpose,
                    receivingAccount,
                    receivingAccountId,
                    remittanceInformation,
                    sendRemittanceAdvice,
                    statementDescriptor,
                    subtype,
                    transactionMonitoringEnabled,
                    ultimateOriginatingPartyIdentifier,
                    ultimateOriginatingPartyName,
                    ultimateReceivingPartyIdentifier,
                    ultimateReceivingPartyName,
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentOrderCreateRequest = apply {
            if (validated) {
                return@apply
            }

            amount()
            direction()
            originatingAccountId()
            type()
            accounting()?.validate()
            accountingCategoryId()
            accountingLedgerClassId()
            chargeBearer()
            currency()
            description()
            documents()?.forEach { it.validate() }
            effectiveDate()
            expiresAt()
            fallbackType()
            foreignExchangeContract()
            foreignExchangeIndicator()
            ledgerTransaction()?.validate()
            ledgerTransactionId()
            lineItems()?.forEach { it.validate() }
            metadata()?.validate()
            nsfProtected()
            originatingPartyName()
            priority()
            processAfter()
            purpose()
            receivingAccount()?.validate()
            receivingAccountId()
            remittanceInformation()
            sendRemittanceAdvice()
            statementDescriptor()
            subtype()
            transactionMonitoringEnabled()
            ultimateOriginatingPartyIdentifier()
            ultimateOriginatingPartyName()
            ultimateReceivingPartyIdentifier()
            ultimateReceivingPartyName()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentOrderCreateRequest && amount == other.amount && direction == other.direction && originatingAccountId == other.originatingAccountId && type == other.type && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && chargeBearer == other.chargeBearer && currency == other.currency && description == other.description && documents == other.documents && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && subtype == other.subtype && transactionMonitoringEnabled == other.transactionMonitoringEnabled && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, direction, originatingAccountId, type, accounting, accountingCategoryId, accountingLedgerClassId, chargeBearer, currency, description, documents, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, ledgerTransaction, ledgerTransactionId, lineItems, metadata, nsfProtected, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, subtype, transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentOrderCreateRequest{amount=$amount, direction=$direction, originatingAccountId=$originatingAccountId, type=$type, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, chargeBearer=$chargeBearer, currency=$currency, description=$description, documents=$documents, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, subtype=$subtype, transactionMonitoringEnabled=$transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Accounting
    private constructor(
        private val accountId: MultipartField<String>,
        private val classId: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountId(): String? = accountId.value.getNullable("account_id")

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun classId(): String? = classId.value.getNullable("class_id")

        /**
         * Returns the raw multipart value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun _accountId(): MultipartField<String> = accountId

        /**
         * Returns the raw multipart value of [classId].
         *
         * Unlike [classId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("class_id") @ExcludeMissing fun _classId(): MultipartField<String> = classId

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

            private var accountId: MultipartField<String> = MultipartField.of(null)
            private var classId: MultipartField<String> = MultipartField.of(null)
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
            fun accountId(accountId: String?) = accountId(MultipartField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: MultipartField<String>) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: String?) = classId(MultipartField.of(classId))

            /**
             * Sets [Builder.classId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.classId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classId(classId: MultipartField<String>) = apply { this.classId = classId }

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

    /**
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class DocumentCreateRequest
    private constructor(
        private val documentableId: MultipartField<String>,
        private val documentableType: MultipartField<DocumentableType>,
        private val file: MultipartField<InputStream>,
        private val documentType: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The unique identifier for the associated object.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentableId(): String = documentableId.value.getRequired("documentable_id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun documentableType(): DocumentableType =
            documentableType.value.getRequired("documentable_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * A category given to the document, can be `null`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentType(): String? = documentType.value.getNullable("document_type")

        /**
         * Returns the raw multipart value of [documentableId].
         *
         * Unlike [documentableId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentable_id")
        @ExcludeMissing
        fun _documentableId(): MultipartField<String> = documentableId

        /**
         * Returns the raw multipart value of [documentableType].
         *
         * Unlike [documentableType], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("documentable_type")
        @ExcludeMissing
        fun _documentableType(): MultipartField<DocumentableType> = documentableType

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [documentType].
         *
         * Unlike [documentType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("document_type")
        @ExcludeMissing
        fun _documentType(): MultipartField<String> = documentType

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
             * Returns a mutable builder for constructing an instance of [DocumentCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .documentableId()
             * .documentableType()
             * .file()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [DocumentCreateRequest]. */
        class Builder internal constructor() {

            private var documentableId: MultipartField<String>? = null
            private var documentableType: MultipartField<DocumentableType>? = null
            private var file: MultipartField<InputStream>? = null
            private var documentType: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(documentCreateRequest: DocumentCreateRequest) = apply {
                documentableId = documentCreateRequest.documentableId
                documentableType = documentCreateRequest.documentableType
                file = documentCreateRequest.file
                documentType = documentCreateRequest.documentType
                additionalProperties = documentCreateRequest.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the associated object. */
            fun documentableId(documentableId: String) =
                documentableId(MultipartField.of(documentableId))

            /**
             * Sets [Builder.documentableId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentableId(documentableId: MultipartField<String>) = apply {
                this.documentableId = documentableId
            }

            fun documentableType(documentableType: DocumentableType) =
                documentableType(MultipartField.of(documentableType))

            /**
             * Sets [Builder.documentableType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentableType] with a well-typed
             * [DocumentableType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun documentableType(documentableType: MultipartField<DocumentableType>) = apply {
                this.documentableType = documentableType
            }

            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            fun file(file: ByteArray) = file(file.inputStream())

            fun file(file: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(file.inputStream())
                        .filename(file.name)
                        .build()
                )

            /** A category given to the document, can be `null`. */
            fun documentType(documentType: String) = documentType(MultipartField.of(documentType))

            /**
             * Sets [Builder.documentType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.documentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentType(documentType: MultipartField<String>) = apply {
                this.documentType = documentType
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
             * Returns an immutable instance of [DocumentCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .documentableId()
             * .documentableType()
             * .file()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DocumentCreateRequest =
                DocumentCreateRequest(
                    checkRequired("documentableId", documentableId),
                    checkRequired("documentableType", documentableType),
                    checkRequired("file", file),
                    documentType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DocumentCreateRequest = apply {
            if (validated) {
                return@apply
            }

            documentableId()
            documentableType()
            file()
            documentType()
            validated = true
        }

        class DocumentableType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val CASES = of("cases")

                val COUNTERPARTIES = of("counterparties")

                val EXPECTED_PAYMENTS = of("expected_payments")

                val EXTERNAL_ACCOUNTS = of("external_accounts")

                val INCOMING_PAYMENT_DETAILS = of("incoming_payment_details")

                val INTERNAL_ACCOUNTS = of("internal_accounts")

                val ORGANIZATIONS = of("organizations")

                val PAPER_ITEMS = of("paper_items")

                val PAYMENT_ORDERS = of("payment_orders")

                val TRANSACTIONS = of("transactions")

                val DECISIONS = of("decisions")

                val CONNECTIONS = of("connections")

                fun of(value: String) = DocumentableType(JsonField.of(value))
            }

            /** An enum containing [DocumentableType]'s known values. */
            enum class Known {
                CASES,
                COUNTERPARTIES,
                EXPECTED_PAYMENTS,
                EXTERNAL_ACCOUNTS,
                INCOMING_PAYMENT_DETAILS,
                INTERNAL_ACCOUNTS,
                ORGANIZATIONS,
                PAPER_ITEMS,
                PAYMENT_ORDERS,
                TRANSACTIONS,
                DECISIONS,
                CONNECTIONS,
            }

            /**
             * An enum containing [DocumentableType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [DocumentableType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CASES,
                COUNTERPARTIES,
                EXPECTED_PAYMENTS,
                EXTERNAL_ACCOUNTS,
                INCOMING_PAYMENT_DETAILS,
                INTERNAL_ACCOUNTS,
                ORGANIZATIONS,
                PAPER_ITEMS,
                PAYMENT_ORDERS,
                TRANSACTIONS,
                DECISIONS,
                CONNECTIONS,
                /**
                 * An enum member indicating that [DocumentableType] was instantiated with an
                 * unknown value.
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
                    CASES -> Value.CASES
                    COUNTERPARTIES -> Value.COUNTERPARTIES
                    EXPECTED_PAYMENTS -> Value.EXPECTED_PAYMENTS
                    EXTERNAL_ACCOUNTS -> Value.EXTERNAL_ACCOUNTS
                    INCOMING_PAYMENT_DETAILS -> Value.INCOMING_PAYMENT_DETAILS
                    INTERNAL_ACCOUNTS -> Value.INTERNAL_ACCOUNTS
                    ORGANIZATIONS -> Value.ORGANIZATIONS
                    PAPER_ITEMS -> Value.PAPER_ITEMS
                    PAYMENT_ORDERS -> Value.PAYMENT_ORDERS
                    TRANSACTIONS -> Value.TRANSACTIONS
                    DECISIONS -> Value.DECISIONS
                    CONNECTIONS -> Value.CONNECTIONS
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
                    CASES -> Known.CASES
                    COUNTERPARTIES -> Known.COUNTERPARTIES
                    EXPECTED_PAYMENTS -> Known.EXPECTED_PAYMENTS
                    EXTERNAL_ACCOUNTS -> Known.EXTERNAL_ACCOUNTS
                    INCOMING_PAYMENT_DETAILS -> Known.INCOMING_PAYMENT_DETAILS
                    INTERNAL_ACCOUNTS -> Known.INTERNAL_ACCOUNTS
                    ORGANIZATIONS -> Known.ORGANIZATIONS
                    PAPER_ITEMS -> Known.PAPER_ITEMS
                    PAYMENT_ORDERS -> Known.PAYMENT_ORDERS
                    TRANSACTIONS -> Known.TRANSACTIONS
                    DECISIONS -> Known.DECISIONS
                    CONNECTIONS -> Known.CONNECTIONS
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown DocumentableType: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DocumentableType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DocumentCreateRequest && documentableId == other.documentableId && documentableType == other.documentableType && file == other.file && documentType == other.documentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(documentableId, documentableType, file, documentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DocumentCreateRequest{documentableId=$documentableId, documentableType=$documentableType, file=$file, documentType=$documentType, additionalProperties=$additionalProperties}"
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies a ledger transaction object that will be created with the payment order. If the
     * ledger transaction cannot be created, then the payment order creation will fail. The
     * resulting ledger transaction will mirror the status of the payment order.
     */
    class LedgerTransactionCreateRequest
    private constructor(
        private val ledgerEntries: MultipartField<List<LedgerEntryCreateRequest>>,
        private val description: MultipartField<String>,
        private val effectiveAt: MultipartField<OffsetDateTime>,
        private val effectiveDate: MultipartField<LocalDate>,
        private val externalId: MultipartField<String>,
        private val ledgerableId: MultipartField<String>,
        private val ledgerableType: MultipartField<LedgerableType>,
        private val metadata: MultipartField<Metadata>,
        private val status: MultipartField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * An array of ledger entry objects.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerEntries(): List<LedgerEntryCreateRequest> =
            ledgerEntries.value.getRequired("ledger_entries")

        /**
         * An optional description for internal use.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.value.getNullable("description")

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveAt(): OffsetDateTime? = effectiveAt.value.getNullable("effective_at")

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate? = effectiveDate.value.getNullable("effective_date")

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun externalId(): String? = externalId.value.getNullable("external_id")

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerableId(): String? = ledgerableId.value.getNullable("ledgerable_id")

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerableType(): LedgerableType? = ledgerableType.value.getNullable("ledgerable_type")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.value.getNullable("metadata")

        /**
         * To post a ledger transaction at creation, use `posted`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Status? = status.value.getNullable("status")

        /**
         * Returns the raw multipart value of [ledgerEntries].
         *
         * Unlike [ledgerEntries], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun _ledgerEntries(): MultipartField<List<LedgerEntryCreateRequest>> = ledgerEntries

        /**
         * Returns the raw multipart value of [description].
         *
         * Unlike [description], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): MultipartField<String> = description

        /**
         * Returns the raw multipart value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): MultipartField<OffsetDateTime> = effectiveAt

        /**
         * Returns the raw multipart value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): MultipartField<LocalDate> = effectiveDate

        /**
         * Returns the raw multipart value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): MultipartField<String> = externalId

        /**
         * Returns the raw multipart value of [ledgerableId].
         *
         * Unlike [ledgerableId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        fun _ledgerableId(): MultipartField<String> = ledgerableId

        /**
         * Returns the raw multipart value of [ledgerableType].
         *
         * Unlike [ledgerableType], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        fun _ledgerableType(): MultipartField<LedgerableType> = ledgerableType

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): MultipartField<Metadata> = metadata

        /**
         * Returns the raw multipart value of [status].
         *
         * Unlike [status], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): MultipartField<Status> = status

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
             * [LedgerTransactionCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .ledgerEntries()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerTransactionCreateRequest]. */
        class Builder internal constructor() {

            private var ledgerEntries: MultipartField<MutableList<LedgerEntryCreateRequest>>? = null
            private var description: MultipartField<String> = MultipartField.of(null)
            private var effectiveAt: MultipartField<OffsetDateTime> = MultipartField.of(null)
            private var effectiveDate: MultipartField<LocalDate> = MultipartField.of(null)
            private var externalId: MultipartField<String> = MultipartField.of(null)
            private var ledgerableId: MultipartField<String> = MultipartField.of(null)
            private var ledgerableType: MultipartField<LedgerableType> = MultipartField.of(null)
            private var metadata: MultipartField<Metadata> = MultipartField.of(null)
            private var status: MultipartField<Status> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                apply {
                    ledgerEntries =
                        ledgerTransactionCreateRequest.ledgerEntries.map { it.toMutableList() }
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
            fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                ledgerEntries(MultipartField.of(ledgerEntries))

            /**
             * Sets [Builder.ledgerEntries] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerEntries] with a well-typed
             * `List<LedgerEntryCreateRequest>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun ledgerEntries(ledgerEntries: MultipartField<List<LedgerEntryCreateRequest>>) =
                apply {
                    this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                }

            /**
             * Adds a single [LedgerEntryCreateRequest] to [ledgerEntries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                ledgerEntries =
                    (ledgerEntries ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("ledgerEntries", it).add(ledgerEntry)
                    }
            }

            /** An optional description for internal use. */
            fun description(description: String?) = description(MultipartField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary multipart value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: MultipartField<String>) = apply {
                this.description = description
            }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(effectiveAt: OffsetDateTime) =
                effectiveAt(MultipartField.of(effectiveAt))

            /**
             * Sets [Builder.effectiveAt] to an arbitrary multipart value.
             *
             * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveAt(effectiveAt: MultipartField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
            }

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(effectiveDate: LocalDate) =
                effectiveDate(MultipartField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary multipart value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: MultipartField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(externalId: String) = externalId(MultipartField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: MultipartField<String>) = apply {
                this.externalId = externalId
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(ledgerableId: String) = ledgerableId(MultipartField.of(ledgerableId))

            /**
             * Sets [Builder.ledgerableId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerableId(ledgerableId: MultipartField<String>) = apply {
                this.ledgerableId = ledgerableId
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(ledgerableType: LedgerableType) =
                ledgerableType(MultipartField.of(ledgerableType))

            /**
             * Sets [Builder.ledgerableType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerableType] with a well-typed [LedgerableType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerableType(ledgerableType: MultipartField<LedgerableType>) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<Metadata>) = apply { this.metadata = metadata }

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(status: Status) = status(MultipartField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary multipart value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: MultipartField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [LedgerTransactionCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .ledgerEntries()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerTransactionCreateRequest =
                LedgerTransactionCreateRequest(
                    checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                    description,
                    effectiveAt,
                    effectiveDate,
                    externalId,
                    ledgerableId,
                    ledgerableType,
                    metadata,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LedgerTransactionCreateRequest = apply {
            if (validated) {
                return@apply
            }

            ledgerEntries().forEach { it.validate() }
            description()
            effectiveAt()
            effectiveDate()
            externalId()
            ledgerableId()
            ledgerableType()
            metadata()?.validate()
            status()
            validated = true
        }

        class LedgerEntryCreateRequest
        private constructor(
            private val amount: MultipartField<Long>,
            private val direction: MultipartField<TransactionDirection>,
            private val ledgerAccountId: MultipartField<String>,
            private val availableBalanceAmount: MultipartField<AvailableBalanceAmount>,
            private val lockVersion: MultipartField<Long>,
            private val metadata: MultipartField<Metadata>,
            private val pendingBalanceAmount: MultipartField<PendingBalanceAmount>,
            private val postedBalanceAmount: MultipartField<PostedBalanceAmount>,
            private val showResultingLedgerAccountBalances: MultipartField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.value.getRequired("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): TransactionDirection = direction.value.getRequired("direction")

            /**
             * The ledger account that this ledger entry is associated with.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ledgerAccountId(): String = ledgerAccountId.value.getRequired("ledger_account_id")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun availableBalanceAmount(): AvailableBalanceAmount? =
                availableBalanceAmount.value.getNullable("available_balance_amount")

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lockVersion(): Long? = lockVersion.value.getNullable("lock_version")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.value.getNullable("metadata")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun pendingBalanceAmount(): PendingBalanceAmount? =
                pendingBalanceAmount.value.getNullable("pending_balance_amount")

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postedBalanceAmount(): PostedBalanceAmount? =
                postedBalanceAmount.value.getNullable("posted_balance_amount")

            /**
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun showResultingLedgerAccountBalances(): Boolean? =
                showResultingLedgerAccountBalances.value.getNullable(
                    "show_resulting_ledger_account_balances"
                )

            /**
             * Returns the raw multipart value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): MultipartField<Long> = amount

            /**
             * Returns the raw multipart value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): MultipartField<TransactionDirection> = direction

            /**
             * Returns the raw multipart value of [ledgerAccountId].
             *
             * Unlike [ledgerAccountId], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun _ledgerAccountId(): MultipartField<String> = ledgerAccountId

            /**
             * Returns the raw multipart value of [availableBalanceAmount].
             *
             * Unlike [availableBalanceAmount], this method doesn't throw if the multipart field has
             * an unexpected type.
             */
            @JsonProperty("available_balance_amount")
            @ExcludeMissing
            fun _availableBalanceAmount(): MultipartField<AvailableBalanceAmount> =
                availableBalanceAmount

            /**
             * Returns the raw multipart value of [lockVersion].
             *
             * Unlike [lockVersion], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("lock_version")
            @ExcludeMissing
            fun _lockVersion(): MultipartField<Long> = lockVersion

            /**
             * Returns the raw multipart value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): MultipartField<Metadata> = metadata

            /**
             * Returns the raw multipart value of [pendingBalanceAmount].
             *
             * Unlike [pendingBalanceAmount], this method doesn't throw if the multipart field has
             * an unexpected type.
             */
            @JsonProperty("pending_balance_amount")
            @ExcludeMissing
            fun _pendingBalanceAmount(): MultipartField<PendingBalanceAmount> = pendingBalanceAmount

            /**
             * Returns the raw multipart value of [postedBalanceAmount].
             *
             * Unlike [postedBalanceAmount], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("posted_balance_amount")
            @ExcludeMissing
            fun _postedBalanceAmount(): MultipartField<PostedBalanceAmount> = postedBalanceAmount

            /**
             * Returns the raw multipart value of [showResultingLedgerAccountBalances].
             *
             * Unlike [showResultingLedgerAccountBalances], this method doesn't throw if the
             * multipart field has an unexpected type.
             */
            @JsonProperty("show_resulting_ledger_account_balances")
            @ExcludeMissing
            fun _showResultingLedgerAccountBalances(): MultipartField<Boolean> =
                showResultingLedgerAccountBalances

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
                 * [LedgerEntryCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .direction()
                 * .ledgerAccountId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerEntryCreateRequest]. */
            class Builder internal constructor() {

                private var amount: MultipartField<Long>? = null
                private var direction: MultipartField<TransactionDirection>? = null
                private var ledgerAccountId: MultipartField<String>? = null
                private var availableBalanceAmount: MultipartField<AvailableBalanceAmount> =
                    MultipartField.of(null)
                private var lockVersion: MultipartField<Long> = MultipartField.of(null)
                private var metadata: MultipartField<Metadata> = MultipartField.of(null)
                private var pendingBalanceAmount: MultipartField<PendingBalanceAmount> =
                    MultipartField.of(null)
                private var postedBalanceAmount: MultipartField<PostedBalanceAmount> =
                    MultipartField.of(null)
                private var showResultingLedgerAccountBalances: MultipartField<Boolean> =
                    MultipartField.of(null)
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
                fun amount(amount: Long) = amount(MultipartField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: MultipartField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: TransactionDirection) =
                    direction(MultipartField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.direction] with a well-typed
                 * [TransactionDirection] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun direction(direction: MultipartField<TransactionDirection>) = apply {
                    this.direction = direction
                }

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(ledgerAccountId: String) =
                    ledgerAccountId(MultipartField.of(ledgerAccountId))

                /**
                 * Sets [Builder.ledgerAccountId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.ledgerAccountId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ledgerAccountId(ledgerAccountId: MultipartField<String>) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                    availableBalanceAmount(MultipartField.of(availableBalanceAmount))

                /**
                 * Sets [Builder.availableBalanceAmount] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.availableBalanceAmount] with a well-typed
                 * [AvailableBalanceAmount] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun availableBalanceAmount(
                    availableBalanceAmount: MultipartField<AvailableBalanceAmount>
                ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(lockVersion: Long?) = lockVersion(MultipartField.of(lockVersion))

                /**
                 * Alias for [Builder.lockVersion].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                /**
                 * Sets [Builder.lockVersion] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.lockVersion] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lockVersion(lockVersion: MultipartField<Long>) = apply {
                    this.lockVersion = lockVersion
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: MultipartField<Metadata>) = apply {
                    this.metadata = metadata
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                    pendingBalanceAmount(MultipartField.of(pendingBalanceAmount))

                /**
                 * Sets [Builder.pendingBalanceAmount] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.pendingBalanceAmount] with a well-typed
                 * [PendingBalanceAmount] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pendingBalanceAmount(
                    pendingBalanceAmount: MultipartField<PendingBalanceAmount>
                ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                    postedBalanceAmount(MultipartField.of(postedBalanceAmount))

                /**
                 * Sets [Builder.postedBalanceAmount] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.postedBalanceAmount] with a well-typed
                 * [PostedBalanceAmount] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun postedBalanceAmount(postedBalanceAmount: MultipartField<PostedBalanceAmount>) =
                    apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean?
                ) =
                    showResultingLedgerAccountBalances(
                        MultipartField.of(showResultingLedgerAccountBalances)
                    )

                /**
                 * Alias for [Builder.showResultingLedgerAccountBalances].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean
                ) =
                    showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances as Boolean?
                    )

                /**
                 * Sets [Builder.showResultingLedgerAccountBalances] to an arbitrary multipart
                 * value.
                 *
                 * You should usually call [Builder.showResultingLedgerAccountBalances] with a
                 * well-typed [Boolean] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: MultipartField<Boolean>
                ) = apply {
                    this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
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
                 * Returns an immutable instance of [LedgerEntryCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .direction()
                 * .ledgerAccountId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LedgerEntryCreateRequest =
                    LedgerEntryCreateRequest(
                        checkRequired("amount", amount),
                        checkRequired("direction", direction),
                        checkRequired("ledgerAccountId", ledgerAccountId),
                        availableBalanceAmount,
                        lockVersion,
                        metadata,
                        pendingBalanceAmount,
                        postedBalanceAmount,
                        showResultingLedgerAccountBalances,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LedgerEntryCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                direction()
                ledgerAccountId()
                availableBalanceAmount()?.validate()
                lockVersion()
                metadata()?.validate()
                pendingBalanceAmount()?.validate()
                postedBalanceAmount()?.validate()
                showResultingLedgerAccountBalances()
                validated = true
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            class AvailableBalanceAmount
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [AvailableBalanceAmount].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AvailableBalanceAmount]. */
                class Builder internal constructor() {

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

                    /**
                     * Returns an immutable instance of [AvailableBalanceAmount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AvailableBalanceAmount =
                        AvailableBalanceAmount(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): AvailableBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
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
            class Metadata
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
            class PendingBalanceAmount
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PendingBalanceAmount].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PendingBalanceAmount]. */
                class Builder internal constructor() {

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

                    /**
                     * Returns an immutable instance of [PendingBalanceAmount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PendingBalanceAmount =
                        PendingBalanceAmount(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): PendingBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
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
            class PostedBalanceAmount
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PostedBalanceAmount].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PostedBalanceAmount]. */
                class Builder internal constructor() {

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

                    /**
                     * Returns an immutable instance of [PostedBalanceAmount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PostedBalanceAmount =
                        PostedBalanceAmount(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): PostedBalanceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
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

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        class LedgerableType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val EXPECTED_PAYMENT = of("expected_payment")

                val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

                val PAPER_ITEM = of("paper_item")

                val PAYMENT_ORDER = of("payment_order")

                val RETURN = of("return")

                val REVERSAL = of("reversal")

                fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            /** An enum containing [LedgerableType]'s known values. */
            enum class Known {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
            }

            /**
             * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                PAPER_ITEM,
                PAYMENT_ORDER,
                RETURN,
                REVERSAL,
                /**
                 * An enum member indicating that [LedgerableType] was instantiated with an unknown
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
                    EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                    PAPER_ITEM -> Value.PAPER_ITEM
                    PAYMENT_ORDER -> Value.PAYMENT_ORDER
                    RETURN -> Value.RETURN
                    REVERSAL -> Value.REVERSAL
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
                    EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                    PAPER_ITEM -> Known.PAPER_ITEM
                    PAYMENT_ORDER -> Known.PAYMENT_ORDER
                    RETURN -> Known.RETURN
                    REVERSAL -> Known.REVERSAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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
        class Metadata
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

        /** To post a ledger transaction at creation, use `posted`. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val ARCHIVED = of("archived")

                val PENDING = of("pending")

                val POSTED = of("posted")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ARCHIVED,
                PENDING,
                POSTED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARCHIVED,
                PENDING,
                POSTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ARCHIVED -> Value.ARCHIVED
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
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
                    ARCHIVED -> Known.ARCHIVED
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

    class LineItemRequest
    private constructor(
        private val amount: MultipartField<Long>,
        private val accountingCategoryId: MultipartField<String>,
        private val description: MultipartField<String>,
        private val metadata: MultipartField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.value.getRequired("amount")

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountingCategoryId(): String? =
            accountingCategoryId.value.getNullable("accounting_category_id")

        /**
         * A free-form description of the line item.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.value.getNullable("description")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.value.getNullable("metadata")

        /**
         * Returns the raw multipart value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): MultipartField<Long> = amount

        /**
         * Returns the raw multipart value of [accountingCategoryId].
         *
         * Unlike [accountingCategoryId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        fun _accountingCategoryId(): MultipartField<String> = accountingCategoryId

        /**
         * Returns the raw multipart value of [description].
         *
         * Unlike [description], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): MultipartField<String> = description

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): MultipartField<Metadata> = metadata

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

            private var amount: MultipartField<Long>? = null
            private var accountingCategoryId: MultipartField<String> = MultipartField.of(null)
            private var description: MultipartField<String> = MultipartField.of(null)
            private var metadata: MultipartField<Metadata> = MultipartField.of(null)
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
            fun amount(amount: Long) = amount(MultipartField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary multipart value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: MultipartField<Long>) = apply { this.amount = amount }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountingCategoryId(accountingCategoryId: String?) =
                accountingCategoryId(MultipartField.of(accountingCategoryId))

            /**
             * Sets [Builder.accountingCategoryId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountingCategoryId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountingCategoryId(accountingCategoryId: MultipartField<String>) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /** A free-form description of the line item. */
            fun description(description: String?) = description(MultipartField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary multipart value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: MultipartField<String>) = apply {
                this.description = description
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<Metadata>) = apply { this.metadata = metadata }

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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        class Metadata
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
    class Metadata
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
    class ReceivingAccount
    private constructor(
        private val accountDetails: MultipartField<List<AccountDetail>>,
        private val accountType: MultipartField<ExternalAccountType>,
        private val contactDetails: MultipartField<List<ContactDetailCreateRequest>>,
        private val ledgerAccount: MultipartField<LedgerAccountCreateRequest>,
        private val metadata: MultipartField<Metadata>,
        private val name: MultipartField<String>,
        private val partyAddress: MultipartField<AddressRequest>,
        private val partyIdentifier: MultipartField<String>,
        private val partyName: MultipartField<String>,
        private val partyType: MultipartField<PartyType>,
        private val plaidProcessorToken: MultipartField<String>,
        private val routingDetails: MultipartField<List<RoutingDetail>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountDetails(): List<AccountDetail>? =
            accountDetails.value.getNullable("account_details")

        /**
         * Can be `checking`, `savings` or `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountType(): ExternalAccountType? = accountType.value.getNullable("account_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactDetails(): List<ContactDetailCreateRequest>? =
            contactDetails.value.getNullable("contact_details")

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
            ledgerAccount.value.getNullable("ledger_account")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.value.getNullable("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): String? = name.value.getNullable("name")

        /**
         * Required if receiving wire payments.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyAddress(): AddressRequest? = partyAddress.value.getNullable("party_address")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyIdentifier(): String? = partyIdentifier.value.getNullable("party_identifier")

        /**
         * If this value isn't provided, it will be inherited from the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyName(): String? = partyName.value.getNullable("party_name")

        /**
         * Either `individual` or `business`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyType(): PartyType? = partyType.value.getNullable("party_type")

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun plaidProcessorToken(): String? =
            plaidProcessorToken.value.getNullable("plaid_processor_token")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingDetails(): List<RoutingDetail>? =
            routingDetails.value.getNullable("routing_details")

        /**
         * Returns the raw multipart value of [accountDetails].
         *
         * Unlike [accountDetails], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): MultipartField<List<AccountDetail>> = accountDetails

        /**
         * Returns the raw multipart value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): MultipartField<ExternalAccountType> = accountType

        /**
         * Returns the raw multipart value of [contactDetails].
         *
         * Unlike [contactDetails], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): MultipartField<List<ContactDetailCreateRequest>> = contactDetails

        /**
         * Returns the raw multipart value of [ledgerAccount].
         *
         * Unlike [ledgerAccount], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account")
        @ExcludeMissing
        fun _ledgerAccount(): MultipartField<LedgerAccountCreateRequest> = ledgerAccount

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): MultipartField<Metadata> = metadata

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [partyAddress].
         *
         * Unlike [partyAddress], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): MultipartField<AddressRequest> = partyAddress

        /**
         * Returns the raw multipart value of [partyIdentifier].
         *
         * Unlike [partyIdentifier], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("party_identifier")
        @ExcludeMissing
        fun _partyIdentifier(): MultipartField<String> = partyIdentifier

        /**
         * Returns the raw multipart value of [partyName].
         *
         * Unlike [partyName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("party_name")
        @ExcludeMissing
        fun _partyName(): MultipartField<String> = partyName

        /**
         * Returns the raw multipart value of [partyType].
         *
         * Unlike [partyType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): MultipartField<PartyType> = partyType

        /**
         * Returns the raw multipart value of [plaidProcessorToken].
         *
         * Unlike [plaidProcessorToken], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        fun _plaidProcessorToken(): MultipartField<String> = plaidProcessorToken

        /**
         * Returns the raw multipart value of [routingDetails].
         *
         * Unlike [routingDetails], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): MultipartField<List<RoutingDetail>> = routingDetails

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

            private var accountDetails: MultipartField<MutableList<AccountDetail>>? = null
            private var accountType: MultipartField<ExternalAccountType> = MultipartField.of(null)
            private var contactDetails: MultipartField<MutableList<ContactDetailCreateRequest>>? =
                null
            private var ledgerAccount: MultipartField<LedgerAccountCreateRequest> =
                MultipartField.of(null)
            private var metadata: MultipartField<Metadata> = MultipartField.of(null)
            private var name: MultipartField<String> = MultipartField.of(null)
            private var partyAddress: MultipartField<AddressRequest> = MultipartField.of(null)
            private var partyIdentifier: MultipartField<String> = MultipartField.of(null)
            private var partyName: MultipartField<String> = MultipartField.of(null)
            private var partyType: MultipartField<PartyType> = MultipartField.of(null)
            private var plaidProcessorToken: MultipartField<String> = MultipartField.of(null)
            private var routingDetails: MultipartField<MutableList<RoutingDetail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(receivingAccount: ReceivingAccount) = apply {
                accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                accountType = receivingAccount.accountType
                contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
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
                accountDetails(MultipartField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountDetails(accountDetails: MultipartField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [AccountDetail] to [accountDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails =
                    (accountDetails ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("accountDetails", it).add(accountDetail)
                    }
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(MultipartField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountType(accountType: MultipartField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                contactDetails(MultipartField.of(contactDetails))

            /**
             * Sets [Builder.contactDetails] to an arbitrary multipart value.
             *
             * You should usually call [Builder.contactDetails] with a well-typed
             * `List<ContactDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun contactDetails(contactDetails: MultipartField<List<ContactDetailCreateRequest>>) =
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
                    (contactDetails ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("contactDetails", it).add(contactDetail)
                    }
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                ledgerAccount(MultipartField.of(ledgerAccount))

            /**
             * Sets [Builder.ledgerAccount] to an arbitrary multipart value.
             *
             * You should usually call [Builder.ledgerAccount] with a well-typed
             * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ledgerAccount(ledgerAccount: MultipartField<LedgerAccountCreateRequest>) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<Metadata>) = apply { this.metadata = metadata }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(MultipartField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(MultipartField.of(partyAddress))

            /**
             * Sets [Builder.partyAddress] to an arbitrary multipart value.
             *
             * You should usually call [Builder.partyAddress] with a well-typed [AddressRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partyAddress(partyAddress: MultipartField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            fun partyIdentifier(partyIdentifier: String) =
                partyIdentifier(MultipartField.of(partyIdentifier))

            /**
             * Sets [Builder.partyIdentifier] to an arbitrary multipart value.
             *
             * You should usually call [Builder.partyIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyIdentifier(partyIdentifier: MultipartField<String>) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(MultipartField.of(partyName))

            /**
             * Sets [Builder.partyName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.partyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyName(partyName: MultipartField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(MultipartField.of(partyType))

            /**
             * Sets [Builder.partyType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.partyType] with a well-typed [PartyType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyType(partyType: MultipartField<PartyType>) = apply {
                this.partyType = partyType
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) =
                plaidProcessorToken(MultipartField.of(plaidProcessorToken))

            /**
             * Sets [Builder.plaidProcessorToken] to an arbitrary multipart value.
             *
             * You should usually call [Builder.plaidProcessorToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plaidProcessorToken(plaidProcessorToken: MultipartField<String>) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(MultipartField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary multipart value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun routingDetails(routingDetails: MultipartField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [RoutingDetail] to [routingDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails =
                    (routingDetails ?: MultipartField.of(mutableListOf())).also {
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
                    (accountDetails ?: MultipartField.of(null)).map { it.toImmutable() },
                    accountType,
                    (contactDetails ?: MultipartField.of(null)).map { it.toImmutable() },
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    (routingDetails ?: MultipartField.of(null)).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ReceivingAccount = apply {
            if (validated) {
                return@apply
            }

            accountDetails()?.forEach { it.validate() }
            accountType()
            contactDetails()?.forEach { it.validate() }
            ledgerAccount()?.validate()
            metadata()?.validate()
            name()
            partyAddress()?.validate()
            partyIdentifier()
            partyName()
            partyType()
            plaidProcessorToken()
            routingDetails()?.forEach { it.validate() }
            validated = true
        }

        class AccountDetail
        private constructor(
            private val accountNumber: MultipartField<String>,
            private val accountNumberType: MultipartField<AccountNumberType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.value.getRequired("account_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountNumberType(): AccountNumberType? =
                accountNumberType.value.getNullable("account_number_type")

            /**
             * Returns the raw multipart value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): MultipartField<String> = accountNumber

            /**
             * Returns the raw multipart value of [accountNumberType].
             *
             * Unlike [accountNumberType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("account_number_type")
            @ExcludeMissing
            fun _accountNumberType(): MultipartField<AccountNumberType> = accountNumberType

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

                private var accountNumber: MultipartField<String>? = null
                private var accountNumberType: MultipartField<AccountNumberType> =
                    MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) =
                    accountNumber(MultipartField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: MultipartField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType) =
                    accountNumberType(MultipartField.of(accountNumberType))

                /**
                 * Sets [Builder.accountNumberType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.accountNumberType] with a well-typed
                 * [AccountNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun accountNumberType(accountNumberType: MultipartField<AccountNumberType>) =
                    apply {
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
                accountNumberType()
                validated = true
            }

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

                /** An enum containing [AccountNumberType]'s known values. */
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
                    CLABE,
                    HK_NUMBER,
                    IBAN,
                    ID_NUMBER,
                    NZ_NUMBER,
                    OTHER,
                    PAN,
                    SG_NUMBER,
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

        class ContactDetailCreateRequest
        private constructor(
            private val contactIdentifier: MultipartField<String>,
            private val contactIdentifierType: MultipartField<ContactIdentifierType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun contactIdentifier(): String? =
                contactIdentifier.value.getNullable("contact_identifier")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun contactIdentifierType(): ContactIdentifierType? =
                contactIdentifierType.value.getNullable("contact_identifier_type")

            /**
             * Returns the raw multipart value of [contactIdentifier].
             *
             * Unlike [contactIdentifier], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            fun _contactIdentifier(): MultipartField<String> = contactIdentifier

            /**
             * Returns the raw multipart value of [contactIdentifierType].
             *
             * Unlike [contactIdentifierType], this method doesn't throw if the multipart field has
             * an unexpected type.
             */
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            fun _contactIdentifierType(): MultipartField<ContactIdentifierType> =
                contactIdentifierType

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
                 * [ContactDetailCreateRequest].
                 */
                fun builder() = Builder()
            }

            /** A builder for [ContactDetailCreateRequest]. */
            class Builder internal constructor() {

                private var contactIdentifier: MultipartField<String> = MultipartField.of(null)
                private var contactIdentifierType: MultipartField<ContactIdentifierType> =
                    MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties =
                        contactDetailCreateRequest.additionalProperties.toMutableMap()
                }

                fun contactIdentifier(contactIdentifier: String) =
                    contactIdentifier(MultipartField.of(contactIdentifier))

                /**
                 * Sets [Builder.contactIdentifier] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.contactIdentifier] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contactIdentifier(contactIdentifier: MultipartField<String>) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                    contactIdentifierType(MultipartField.of(contactIdentifierType))

                /**
                 * Sets [Builder.contactIdentifierType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.contactIdentifierType] with a well-typed
                 * [ContactIdentifierType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun contactIdentifierType(
                    contactIdentifierType: MultipartField<ContactIdentifierType>
                ) = apply { this.contactIdentifierType = contactIdentifierType }

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
                 * Returns an immutable instance of [ContactDetailCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ContactDetailCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                contactIdentifier()
                contactIdentifierType()
                validated = true
            }

            class ContactIdentifierType
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

                    val EMAIL = of("email")

                    val PHONE_NUMBER = of("phone_number")

                    val WEBSITE = of("website")

                    fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                }

                /** An enum containing [ContactIdentifierType]'s known values. */
                enum class Known {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                }

                /**
                 * An enum containing [ContactIdentifierType]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [ContactIdentifierType] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                    /**
                     * An enum member indicating that [ContactIdentifierType] was instantiated with
                     * an unknown value.
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
                        EMAIL -> Value.EMAIL
                        PHONE_NUMBER -> Value.PHONE_NUMBER
                        WEBSITE -> Value.WEBSITE
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
                        EMAIL -> Known.EMAIL
                        PHONE_NUMBER -> Known.PHONE_NUMBER
                        WEBSITE -> Known.WEBSITE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ContactIdentifierType: $value"
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
        class LedgerAccountCreateRequest
        private constructor(
            private val currency: MultipartField<String>,
            private val ledgerId: MultipartField<String>,
            private val name: MultipartField<String>,
            private val normalBalance: MultipartField<TransactionDirection>,
            private val currencyExponent: MultipartField<Long>,
            private val description: MultipartField<String>,
            private val ledgerAccountCategoryIds: MultipartField<List<String>>,
            private val ledgerableId: MultipartField<String>,
            private val ledgerableType: MultipartField<LedgerableType>,
            private val metadata: MultipartField<Metadata>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * The currency of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.value.getRequired("currency")

            /**
             * The id of the ledger that this account belongs to.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ledgerId(): String = ledgerId.value.getRequired("ledger_id")

            /**
             * The name of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.value.getRequired("name")

            /**
             * The normal balance of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun normalBalance(): TransactionDirection =
                normalBalance.value.getRequired("normal_balance")

            /**
             * The currency exponent of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currencyExponent(): Long? = currencyExponent.value.getNullable("currency_exponent")

            /**
             * The description of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): String? = description.value.getNullable("description")

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerAccountCategoryIds(): List<String>? =
                ledgerAccountCategoryIds.value.getNullable("ledger_account_category_ids")

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerableId(): String? = ledgerableId.value.getNullable("ledgerable_id")

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ledgerableType(): LedgerableType? =
                ledgerableType.value.getNullable("ledgerable_type")

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.value.getNullable("metadata")

            /**
             * Returns the raw multipart value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): MultipartField<String> = currency

            /**
             * Returns the raw multipart value of [ledgerId].
             *
             * Unlike [ledgerId], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("ledger_id")
            @ExcludeMissing
            fun _ledgerId(): MultipartField<String> = ledgerId

            /**
             * Returns the raw multipart value of [name].
             *
             * Unlike [name], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

            /**
             * Returns the raw multipart value of [normalBalance].
             *
             * Unlike [normalBalance], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("normal_balance")
            @ExcludeMissing
            fun _normalBalance(): MultipartField<TransactionDirection> = normalBalance

            /**
             * Returns the raw multipart value of [currencyExponent].
             *
             * Unlike [currencyExponent], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            fun _currencyExponent(): MultipartField<Long> = currencyExponent

            /**
             * Returns the raw multipart value of [description].
             *
             * Unlike [description], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): MultipartField<String> = description

            /**
             * Returns the raw multipart value of [ledgerAccountCategoryIds].
             *
             * Unlike [ledgerAccountCategoryIds], this method doesn't throw if the multipart field
             * has an unexpected type.
             */
            @JsonProperty("ledger_account_category_ids")
            @ExcludeMissing
            fun _ledgerAccountCategoryIds(): MultipartField<List<String>> = ledgerAccountCategoryIds

            /**
             * Returns the raw multipart value of [ledgerableId].
             *
             * Unlike [ledgerableId], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            fun _ledgerableId(): MultipartField<String> = ledgerableId

            /**
             * Returns the raw multipart value of [ledgerableType].
             *
             * Unlike [ledgerableType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            fun _ledgerableType(): MultipartField<LedgerableType> = ledgerableType

            /**
             * Returns the raw multipart value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): MultipartField<Metadata> = metadata

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
                 * [LedgerAccountCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .ledgerId()
                 * .name()
                 * .normalBalance()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerAccountCreateRequest]. */
            class Builder internal constructor() {

                private var currency: MultipartField<String>? = null
                private var ledgerId: MultipartField<String>? = null
                private var name: MultipartField<String>? = null
                private var normalBalance: MultipartField<TransactionDirection>? = null
                private var currencyExponent: MultipartField<Long> = MultipartField.of(null)
                private var description: MultipartField<String> = MultipartField.of(null)
                private var ledgerAccountCategoryIds: MultipartField<MutableList<String>>? = null
                private var ledgerableId: MultipartField<String> = MultipartField.of(null)
                private var ledgerableType: MultipartField<LedgerableType> = MultipartField.of(null)
                private var metadata: MultipartField<Metadata> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    currency = ledgerAccountCreateRequest.currency
                    ledgerId = ledgerAccountCreateRequest.ledgerId
                    name = ledgerAccountCreateRequest.name
                    normalBalance = ledgerAccountCreateRequest.normalBalance
                    currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    description = ledgerAccountCreateRequest.description
                    ledgerAccountCategoryIds =
                        ledgerAccountCreateRequest.ledgerAccountCategoryIds.map {
                            it.toMutableList()
                        }
                    ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties =
                        ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                }

                /** The currency of the ledger account. */
                fun currency(currency: String) = currency(MultipartField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: MultipartField<String>) = apply { this.currency = currency }

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: String) = ledgerId(MultipartField.of(ledgerId))

                /**
                 * Sets [Builder.ledgerId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.ledgerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ledgerId(ledgerId: MultipartField<String>) = apply { this.ledgerId = ledgerId }

                /** The name of the ledger account. */
                fun name(name: String) = name(MultipartField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: MultipartField<String>) = apply { this.name = name }

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: TransactionDirection) =
                    normalBalance(MultipartField.of(normalBalance))

                /**
                 * Sets [Builder.normalBalance] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.normalBalance] with a well-typed
                 * [TransactionDirection] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun normalBalance(normalBalance: MultipartField<TransactionDirection>) = apply {
                    this.normalBalance = normalBalance
                }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long?) =
                    currencyExponent(MultipartField.of(currencyExponent))

                /**
                 * Alias for [Builder.currencyExponent].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun currencyExponent(currencyExponent: Long) =
                    currencyExponent(currencyExponent as Long?)

                /**
                 * Sets [Builder.currencyExponent] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.currencyExponent] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyExponent(currencyExponent: MultipartField<Long>) = apply {
                    this.currencyExponent = currencyExponent
                }

                /** The description of the ledger account. */
                fun description(description: String?) = description(MultipartField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: MultipartField<String>) = apply {
                    this.description = description
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                    ledgerAccountCategoryIds(MultipartField.of(ledgerAccountCategoryIds))

                /**
                 * Sets [Builder.ledgerAccountCategoryIds] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.ledgerAccountCategoryIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun ledgerAccountCategoryIds(
                    ledgerAccountCategoryIds: MultipartField<List<String>>
                ) = apply {
                    this.ledgerAccountCategoryIds =
                        ledgerAccountCategoryIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [ledgerAccountCategoryIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                    ledgerAccountCategoryIds =
                        (ledgerAccountCategoryIds ?: MultipartField.of(mutableListOf())).also {
                            checkKnown("ledgerAccountCategoryIds", it).add(ledgerAccountCategoryId)
                        }
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) =
                    ledgerableId(MultipartField.of(ledgerableId))

                /**
                 * Sets [Builder.ledgerableId] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.ledgerableId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ledgerableId(ledgerableId: MultipartField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(MultipartField.of(ledgerableType))

                /**
                 * Sets [Builder.ledgerableType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.ledgerableType] with a well-typed
                 * [LedgerableType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun ledgerableType(ledgerableType: MultipartField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(MultipartField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: MultipartField<Metadata>) = apply {
                    this.metadata = metadata
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
                 * Returns an immutable instance of [LedgerAccountCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .currency()
                 * .ledgerId()
                 * .name()
                 * .normalBalance()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LedgerAccountCreateRequest =
                    LedgerAccountCreateRequest(
                        checkRequired("currency", currency),
                        checkRequired("ledgerId", ledgerId),
                        checkRequired("name", name),
                        checkRequired("normalBalance", normalBalance),
                        currencyExponent,
                        description,
                        (ledgerAccountCategoryIds ?: MultipartField.of(null)).map {
                            it.toImmutable()
                        },
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LedgerAccountCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                currency()
                ledgerId()
                name()
                normalBalance()
                currencyExponent()
                description()
                ledgerAccountCategoryIds()
                ledgerableId()
                ledgerableType()
                metadata()?.validate()
                validated = true
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            class LedgerableType
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

                    val COUNTERPARTY = of("counterparty")

                    val EXTERNAL_ACCOUNT = of("external_account")

                    val INTERNAL_ACCOUNT = of("internal_account")

                    val VIRTUAL_ACCOUNT = of("virtual_account")

                    fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                /** An enum containing [LedgerableType]'s known values. */
                enum class Known {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                }

                /**
                 * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [LedgerableType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                    /**
                     * An enum member indicating that [LedgerableType] was instantiated with an
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
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
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
                        COUNTERPARTY -> Known.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
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
            class Metadata
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

                return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        class Metadata
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
        class AddressRequest
        private constructor(
            private val country: MultipartField<String>,
            private val line1: MultipartField<String>,
            private val line2: MultipartField<String>,
            private val locality: MultipartField<String>,
            private val postalCode: MultipartField<String>,
            private val region: MultipartField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * Country code conforms to [ISO 3166-1 alpha-2]
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun country(): String? = country.value.getNullable("country")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun line1(): String? = line1.value.getNullable("line1")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun line2(): String? = line2.value.getNullable("line2")

            /**
             * Locality or City.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun locality(): String? = locality.value.getNullable("locality")

            /**
             * The postal code of the address.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun postalCode(): String? = postalCode.value.getNullable("postal_code")

            /**
             * Region or State.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun region(): String? = region.value.getNullable("region")

            /**
             * Returns the raw multipart value of [country].
             *
             * Unlike [country], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): MultipartField<String> = country

            /**
             * Returns the raw multipart value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): MultipartField<String> = line1

            /**
             * Returns the raw multipart value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): MultipartField<String> = line2

            /**
             * Returns the raw multipart value of [locality].
             *
             * Unlike [locality], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("locality")
            @ExcludeMissing
            fun _locality(): MultipartField<String> = locality

            /**
             * Returns the raw multipart value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): MultipartField<String> = postalCode

            /**
             * Returns the raw multipart value of [region].
             *
             * Unlike [region], this method doesn't throw if the multipart field has an unexpected
             * type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): MultipartField<String> = region

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

                /** Returns a mutable builder for constructing an instance of [AddressRequest]. */
                fun builder() = Builder()
            }

            /** A builder for [AddressRequest]. */
            class Builder internal constructor() {

                private var country: MultipartField<String> = MultipartField.of(null)
                private var line1: MultipartField<String> = MultipartField.of(null)
                private var line2: MultipartField<String> = MultipartField.of(null)
                private var locality: MultipartField<String> = MultipartField.of(null)
                private var postalCode: MultipartField<String> = MultipartField.of(null)
                private var region: MultipartField<String> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(addressRequest: AddressRequest) = apply {
                    country = addressRequest.country
                    line1 = addressRequest.line1
                    line2 = addressRequest.line2
                    locality = addressRequest.locality
                    postalCode = addressRequest.postalCode
                    region = addressRequest.region
                    additionalProperties = addressRequest.additionalProperties.toMutableMap()
                }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String?) = country(MultipartField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: MultipartField<String>) = apply { this.country = country }

                fun line1(line1: String?) = line1(MultipartField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: MultipartField<String>) = apply { this.line1 = line1 }

                fun line2(line2: String?) = line2(MultipartField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: MultipartField<String>) = apply { this.line2 = line2 }

                /** Locality or City. */
                fun locality(locality: String?) = locality(MultipartField.of(locality))

                /**
                 * Sets [Builder.locality] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.locality] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locality(locality: MultipartField<String>) = apply { this.locality = locality }

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = postalCode(MultipartField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: MultipartField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** Region or State. */
                fun region(region: String?) = region(MultipartField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: MultipartField<String>) = apply { this.region = region }

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
                 * Returns an immutable instance of [AddressRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AddressRequest =
                    AddressRequest(
                        country,
                        line1,
                        line2,
                        locality,
                        postalCode,
                        region,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AddressRequest = apply {
                if (validated) {
                    return@apply
                }

                country()
                line1()
                line2()
                locality()
                postalCode()
                region()
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RoutingDetail
        private constructor(
            private val routingNumber: MultipartField<String>,
            private val routingNumberType: MultipartField<RoutingNumberType>,
            private val paymentType: MultipartField<PaymentType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.value.getRequired("routing_number")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumberType(): RoutingNumberType =
                routingNumberType.value.getRequired("routing_number_type")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paymentType(): PaymentType? = paymentType.value.getNullable("payment_type")

            /**
             * Returns the raw multipart value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): MultipartField<String> = routingNumber

            /**
             * Returns the raw multipart value of [routingNumberType].
             *
             * Unlike [routingNumberType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            fun _routingNumberType(): MultipartField<RoutingNumberType> = routingNumberType

            /**
             * Returns the raw multipart value of [paymentType].
             *
             * Unlike [paymentType], this method doesn't throw if the multipart field has an
             * unexpected type.
             */
            @JsonProperty("payment_type")
            @ExcludeMissing
            fun _paymentType(): MultipartField<PaymentType> = paymentType

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

                private var routingNumber: MultipartField<String>? = null
                private var routingNumberType: MultipartField<RoutingNumberType>? = null
                private var paymentType: MultipartField<PaymentType> = MultipartField.of(null)
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(routingDetail: RoutingDetail) = apply {
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) =
                    routingNumber(MultipartField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: MultipartField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) =
                    routingNumberType(MultipartField.of(routingNumberType))

                /**
                 * Sets [Builder.routingNumberType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.routingNumberType] with a well-typed
                 * [RoutingNumberType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun routingNumberType(routingNumberType: MultipartField<RoutingNumberType>) =
                    apply {
                        this.routingNumberType = routingNumberType
                    }

                fun paymentType(paymentType: PaymentType) =
                    paymentType(MultipartField.of(paymentType))

                /**
                 * Sets [Builder.paymentType] to an arbitrary multipart value.
                 *
                 * You should usually call [Builder.paymentType] with a well-typed [PaymentType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentType(paymentType: MultipartField<PaymentType>) = apply {
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
                routingNumberType()
                paymentType()
                validated = true
            }

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

                /** An enum containing [PaymentType]'s known values. */
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

            return /* spotless:off */ other is ReceivingAccount && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrderCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentOrderCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
