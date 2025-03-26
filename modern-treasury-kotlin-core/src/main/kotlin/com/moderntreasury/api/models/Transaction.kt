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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Transaction
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val asOfDate: JsonField<LocalDate>,
    private val asOfTime: JsonField<String>,
    private val asOfTimezone: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customIdentifiers: JsonField<CustomIdentifiers>,
    private val direction: JsonField<String>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val foreignExchangeRate: JsonField<ForeignExchangeRate>,
    private val internalAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val posted: JsonField<Boolean>,
    private val reconciled: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vendorCode: JsonField<String>,
    private val vendorCodeType: JsonField<VendorCodeType>,
    private val vendorCustomerId: JsonField<String>,
    private val vendorId: JsonField<String>,
    private val details: JsonField<Details>,
    private val vendorDescription: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("as_of_time") @ExcludeMissing asOfTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("as_of_timezone")
        @ExcludeMissing
        asOfTimezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("custom_identifiers")
        @ExcludeMissing
        customIdentifiers: JsonField<CustomIdentifiers> = JsonMissing.of(),
        @JsonProperty("direction") @ExcludeMissing direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_rate")
        @ExcludeMissing
        foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("posted") @ExcludeMissing posted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reconciled")
        @ExcludeMissing
        reconciled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vendor_code")
        @ExcludeMissing
        vendorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        vendorCodeType: JsonField<VendorCodeType> = JsonMissing.of(),
        @JsonProperty("vendor_customer_id")
        @ExcludeMissing
        vendorCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_id") @ExcludeMissing vendorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("details") @ExcludeMissing details: JsonField<Details> = JsonMissing.of(),
        @JsonProperty("vendor_description")
        @ExcludeMissing
        vendorDescription: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        asOfDate,
        asOfTime,
        asOfTimezone,
        createdAt,
        currency,
        customIdentifiers,
        direction,
        discardedAt,
        foreignExchangeRate,
        internalAccountId,
        liveMode,
        metadata,
        object_,
        posted,
        reconciled,
        type,
        updatedAt,
        vendorCode,
        vendorCodeType,
        vendorCustomerId,
        vendorId,
        details,
        vendorDescription,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The date on which the transaction occurred.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

    /**
     * The time on which the transaction occurred. Depending on the granularity of the timestamp
     * information received from the bank, it may be `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun asOfTime(): String? = asOfTime.getNullable("as_of_time")

    /**
     * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
     * provide timezone info.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun asOfTimezone(): String? = asOfTimezone.getNullable("as_of_timezone")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Currency that this transaction is denominated in.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * An object containing key-value pairs, each with a custom identifier as the key and a string
     * value.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customIdentifiers(): CustomIdentifiers = customIdentifiers.getRequired("custom_identifiers")

    /**
     * Either `credit` or `debit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): String = direction.getRequired("direction")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * Associated serialized foreign exchange rate information.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeRate(): ForeignExchangeRate? =
        foreignExchangeRate.getNullable("foreign_exchange_rate")

    /**
     * The ID of the relevant Internal Account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

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

    /**
     * This field will be `true` if the transaction has posted to the account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun posted(): Boolean = posted.getRequired("posted")

    /**
     * This field will be `true` if a transaction is reconciled by the Modern Treasury system. This
     * means that it has transaction line items that sum up to the transaction's amount.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reconciled(): Boolean = reconciled.getRequired("reconciled")

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCode(): String? = vendorCode.getNullable("vendor_code")

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCodeType(): VendorCodeType? = vendorCodeType.getNullable("vendor_code_type")

    /**
     * An identifier given to this transaction by the bank, often `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorCustomerId(): String? = vendorCustomerId.getNullable("vendor_customer_id")

    /**
     * An identifier given to this transaction by the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun details(): Details? = details.getNullable("details")

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [asOfDate].
     *
     * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

    /**
     * Returns the raw JSON value of [asOfTime].
     *
     * Unlike [asOfTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

    /**
     * Returns the raw JSON value of [asOfTimezone].
     *
     * Unlike [asOfTimezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("as_of_timezone")
    @ExcludeMissing
    fun _asOfTimezone(): JsonField<String> = asOfTimezone

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
     * Returns the raw JSON value of [customIdentifiers].
     *
     * Unlike [customIdentifiers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("custom_identifiers")
    @ExcludeMissing
    fun _customIdentifiers(): JsonField<CustomIdentifiers> = customIdentifiers

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [foreignExchangeRate].
     *
     * Unlike [foreignExchangeRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate(): JsonField<ForeignExchangeRate> = foreignExchangeRate

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
     * Returns the raw JSON value of [posted].
     *
     * Unlike [posted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

    /**
     * Returns the raw JSON value of [reconciled].
     *
     * Unlike [reconciled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reconciled") @ExcludeMissing fun _reconciled(): JsonField<Boolean> = reconciled

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vendorCode].
     *
     * Unlike [vendorCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_code") @ExcludeMissing fun _vendorCode(): JsonField<String> = vendorCode

    /**
     * Returns the raw JSON value of [vendorCodeType].
     *
     * Unlike [vendorCodeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_code_type")
    @ExcludeMissing
    fun _vendorCodeType(): JsonField<VendorCodeType> = vendorCodeType

    /**
     * Returns the raw JSON value of [vendorCustomerId].
     *
     * Unlike [vendorCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vendor_customer_id")
    @ExcludeMissing
    fun _vendorCustomerId(): JsonField<String> = vendorCustomerId

    /**
     * Returns the raw JSON value of [vendorId].
     *
     * Unlike [vendorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<Details> = details

    /**
     * Returns the raw JSON value of [vendorDescription].
     *
     * Unlike [vendorDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vendor_description")
    @ExcludeMissing
    fun _vendorDescription(): JsonField<String> = vendorDescription

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
         * Returns a mutable builder for constructing an instance of [Transaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .asOfDate()
         * .asOfTime()
         * .asOfTimezone()
         * .createdAt()
         * .currency()
         * .customIdentifiers()
         * .direction()
         * .discardedAt()
         * .foreignExchangeRate()
         * .internalAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .posted()
         * .reconciled()
         * .type()
         * .updatedAt()
         * .vendorCode()
         * .vendorCodeType()
         * .vendorCustomerId()
         * .vendorId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Transaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var asOfDate: JsonField<LocalDate>? = null
        private var asOfTime: JsonField<String>? = null
        private var asOfTimezone: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customIdentifiers: JsonField<CustomIdentifiers>? = null
        private var direction: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var foreignExchangeRate: JsonField<ForeignExchangeRate>? = null
        private var internalAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var posted: JsonField<Boolean>? = null
        private var reconciled: JsonField<Boolean>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorCode: JsonField<String>? = null
        private var vendorCodeType: JsonField<VendorCodeType>? = null
        private var vendorCustomerId: JsonField<String>? = null
        private var vendorId: JsonField<String>? = null
        private var details: JsonField<Details> = JsonMissing.of()
        private var vendorDescription: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transaction: Transaction) = apply {
            id = transaction.id
            amount = transaction.amount
            asOfDate = transaction.asOfDate
            asOfTime = transaction.asOfTime
            asOfTimezone = transaction.asOfTimezone
            createdAt = transaction.createdAt
            currency = transaction.currency
            customIdentifiers = transaction.customIdentifiers
            direction = transaction.direction
            discardedAt = transaction.discardedAt
            foreignExchangeRate = transaction.foreignExchangeRate
            internalAccountId = transaction.internalAccountId
            liveMode = transaction.liveMode
            metadata = transaction.metadata
            object_ = transaction.object_
            posted = transaction.posted
            reconciled = transaction.reconciled
            type = transaction.type
            updatedAt = transaction.updatedAt
            vendorCode = transaction.vendorCode
            vendorCodeType = transaction.vendorCodeType
            vendorCustomerId = transaction.vendorCustomerId
            vendorId = transaction.vendorId
            details = transaction.details
            vendorDescription = transaction.vendorDescription
            additionalProperties = transaction.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

        /**
         * Sets [Builder.asOfDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /**
         * The time on which the transaction occurred. Depending on the granularity of the timestamp
         * information received from the bank, it may be `null`.
         */
        fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

        /**
         * Sets [Builder.asOfTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /**
         * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
         * provide timezone info.
         */
        fun asOfTimezone(asOfTimezone: String?) = asOfTimezone(JsonField.ofNullable(asOfTimezone))

        /**
         * Sets [Builder.asOfTimezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfTimezone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOfTimezone(asOfTimezone: JsonField<String>) = apply {
            this.asOfTimezone = asOfTimezone
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

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * An object containing key-value pairs, each with a custom identifier as the key and a
         * string value.
         */
        fun customIdentifiers(customIdentifiers: CustomIdentifiers) =
            customIdentifiers(JsonField.of(customIdentifiers))

        /**
         * Sets [Builder.customIdentifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customIdentifiers] with a well-typed [CustomIdentifiers]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customIdentifiers(customIdentifiers: JsonField<CustomIdentifiers>) = apply {
            this.customIdentifiers = customIdentifiers
        }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate?) =
            foreignExchangeRate(JsonField.ofNullable(foreignExchangeRate))

        /**
         * Sets [Builder.foreignExchangeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeRate] with a well-typed
         * [ForeignExchangeRate] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

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

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = posted(JsonField.of(posted))

        /**
         * Sets [Builder.posted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posted] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

        /**
         * This field will be `true` if a transaction is reconciled by the Modern Treasury system.
         * This means that it has transaction line items that sum up to the transaction's amount.
         */
        fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

        /**
         * Sets [Builder.reconciled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reconciled(reconciled: JsonField<Boolean>) = apply { this.reconciled = reconciled }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

        /**
         * Sets [Builder.vendorCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: VendorCodeType?) =
            vendorCodeType(JsonField.ofNullable(vendorCodeType))

        /**
         * Sets [Builder.vendorCodeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCodeType] with a well-typed [VendorCodeType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorCodeType(vendorCodeType: JsonField<VendorCodeType>) = apply {
            this.vendorCodeType = vendorCodeType
        }

        /** An identifier given to this transaction by the bank, often `null`. */
        fun vendorCustomerId(vendorCustomerId: String?) =
            vendorCustomerId(JsonField.ofNullable(vendorCustomerId))

        /**
         * Sets [Builder.vendorCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            this.vendorCustomerId = vendorCustomerId
        }

        /** An identifier given to this transaction by the bank. */
        fun vendorId(vendorId: String?) = vendorId(JsonField.ofNullable(vendorId))

        /**
         * Sets [Builder.vendorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /**
         * This field contains additional information that the bank provided about the transaction.
         * This is structured data. Some of the data in here might overlap with what is in the
         * `vendor_description`. For example, the OBI could be a part of the vendor description, and
         * it would also be included in here. The attributes that are passed through the details
         * field will vary based on your banking partner. Currently, the following keys may be in
         * the details object: `originator_name`, `originator_to_beneficiary_information`.
         */
        fun details(details: Details) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed [Details] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun details(details: JsonField<Details>) = apply { this.details = details }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String?) =
            vendorDescription(JsonField.ofNullable(vendorDescription))

        /**
         * Sets [Builder.vendorDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorDescription(vendorDescription: JsonField<String>) = apply {
            this.vendorDescription = vendorDescription
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
         * Returns an immutable instance of [Transaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .asOfDate()
         * .asOfTime()
         * .asOfTimezone()
         * .createdAt()
         * .currency()
         * .customIdentifiers()
         * .direction()
         * .discardedAt()
         * .foreignExchangeRate()
         * .internalAccountId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .posted()
         * .reconciled()
         * .type()
         * .updatedAt()
         * .vendorCode()
         * .vendorCodeType()
         * .vendorCustomerId()
         * .vendorId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Transaction =
            Transaction(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("asOfDate", asOfDate),
                checkRequired("asOfTime", asOfTime),
                checkRequired("asOfTimezone", asOfTimezone),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customIdentifiers", customIdentifiers),
                checkRequired("direction", direction),
                checkRequired("discardedAt", discardedAt),
                checkRequired("foreignExchangeRate", foreignExchangeRate),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("posted", posted),
                checkRequired("reconciled", reconciled),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                checkRequired("vendorCode", vendorCode),
                checkRequired("vendorCodeType", vendorCodeType),
                checkRequired("vendorCustomerId", vendorCustomerId),
                checkRequired("vendorId", vendorId),
                details,
                vendorDescription,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        asOfDate()
        asOfTime()
        asOfTimezone()
        createdAt()
        currency()
        customIdentifiers().validate()
        direction()
        discardedAt()
        foreignExchangeRate()?.validate()
        internalAccountId()
        liveMode()
        metadata().validate()
        object_()
        posted()
        reconciled()
        type()
        updatedAt()
        vendorCode()
        vendorCodeType()
        vendorCustomerId()
        vendorId()
        details()?.validate()
        vendorDescription()
        validated = true
    }

    /**
     * An object containing key-value pairs, each with a custom identifier as the key and a string
     * value.
     */
    class CustomIdentifiers
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

            /** Returns a mutable builder for constructing an instance of [CustomIdentifiers]. */
            fun builder() = Builder()
        }

        /** A builder for [CustomIdentifiers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customIdentifiers: CustomIdentifiers) = apply {
                additionalProperties = customIdentifiers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomIdentifiers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomIdentifiers = CustomIdentifiers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomIdentifiers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomIdentifiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomIdentifiers{additionalProperties=$additionalProperties}"
    }

    /** Associated serialized foreign exchange rate information. */
    class ForeignExchangeRate
    private constructor(
        private val baseAmount: JsonField<Long>,
        private val baseCurrency: JsonField<Currency>,
        private val exponent: JsonField<Long>,
        private val rateString: JsonField<String>,
        private val targetAmount: JsonField<Long>,
        private val targetCurrency: JsonField<Currency>,
        private val value: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("base_amount")
            @ExcludeMissing
            baseAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("base_currency")
            @ExcludeMissing
            baseCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("exponent") @ExcludeMissing exponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rate_string")
            @ExcludeMissing
            rateString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_amount")
            @ExcludeMissing
            targetAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("target_currency")
            @ExcludeMissing
            targetCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
        ) : this(
            baseAmount,
            baseCurrency,
            exponent,
            rateString,
            targetAmount,
            targetCurrency,
            value,
            mutableMapOf(),
        )

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseAmount(): Long = baseAmount.getRequired("base_amount")

        /**
         * Currency to convert, often called the "sell" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exponent(): Long = exponent.getRequired("exponent")

        /**
         * A string representation of the rate.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateString(): String = rateString.getRequired("rate_string")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetAmount(): Long = targetAmount.getRequired("target_amount")

        /**
         * Currency to convert the `base_currency` to, often called the "buy" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Returns the raw JSON value of [baseAmount].
         *
         * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /**
         * Returns the raw JSON value of [baseCurrency].
         *
         * Unlike [baseCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /**
         * Returns the raw JSON value of [exponent].
         *
         * Unlike [exponent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

        /**
         * Returns the raw JSON value of [rateString].
         *
         * Unlike [rateString], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_string")
        @ExcludeMissing
        fun _rateString(): JsonField<String> = rateString

        /**
         * Returns the raw JSON value of [targetAmount].
         *
         * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        /**
         * Returns the raw JSON value of [targetCurrency].
         *
         * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
             * Returns a mutable builder for constructing an instance of [ForeignExchangeRate].
             *
             * The following fields are required:
             * ```kotlin
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ForeignExchangeRate]. */
        class Builder internal constructor() {

            private var baseAmount: JsonField<Long>? = null
            private var baseCurrency: JsonField<Currency>? = null
            private var exponent: JsonField<Long>? = null
            private var rateString: JsonField<String>? = null
            private var targetAmount: JsonField<Long>? = null
            private var targetCurrency: JsonField<Currency>? = null
            private var value: JsonField<Long>? = null
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
             * Sets [Builder.baseAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /**
             * Sets [Builder.baseCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * Sets [Builder.exponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exponent] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /**
             * Sets [Builder.rateString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Sets [Builder.targetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /**
             * Sets [Builder.targetCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /**
             * Returns an immutable instance of [ForeignExchangeRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    checkRequired("baseAmount", baseAmount),
                    checkRequired("baseCurrency", baseCurrency),
                    checkRequired("exponent", exponent),
                    checkRequired("rateString", rateString),
                    checkRequired("targetAmount", targetAmount),
                    checkRequired("targetCurrency", targetCurrency),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ForeignExchangeRate = apply {
            if (validated) {
                return@apply
            }

            baseAmount()
            baseCurrency()
            exponent()
            rateString()
            targetAmount()
            targetCurrency()
            value()
            validated = true
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
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val OTHER = of("other")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
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
            OTHER,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            OTHER,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                OTHER -> Value.OTHER
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
                OTHER -> Known.OTHER
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    class VendorCodeType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val BAI2 = of("bai2")

            val BANKING_CIRCLE = of("banking_circle")

            val BANKPROV = of("bankprov")

            val BNK_DEV = of("bnk_dev")

            val CLEARTOUCH = of("cleartouch")

            val COLUMN = of("column")

            val CROSS_RIVER = of("cross_river")

            val CURRENCYCLOUD = of("currencycloud")

            val DC_BANK = of("dc_bank")

            val DWOLLA = of("dwolla")

            val EVOLVE = of("evolve")

            val GOLDMAN_SACHS = of("goldman_sachs")

            val ISO20022 = of("iso20022")

            val JPMC = of("jpmc")

            val MX = of("mx")

            val PLAID = of("plaid")

            val PNC = of("pnc")

            val RSPEC_VENDOR = of("rspec_vendor")

            val SIGNET = of("signet")

            val SILVERGATE = of("silvergate")

            val SWIFT = of("swift")

            val US_BANK = of("us_bank")

            val USER = of("user")

            fun of(value: String) = VendorCodeType(JsonField.of(value))
        }

        /** An enum containing [VendorCodeType]'s known values. */
        enum class Known {
            BAI2,
            BANKING_CIRCLE,
            BANKPROV,
            BNK_DEV,
            CLEARTOUCH,
            COLUMN,
            CROSS_RIVER,
            CURRENCYCLOUD,
            DC_BANK,
            DWOLLA,
            EVOLVE,
            GOLDMAN_SACHS,
            ISO20022,
            JPMC,
            MX,
            PLAID,
            PNC,
            RSPEC_VENDOR,
            SIGNET,
            SILVERGATE,
            SWIFT,
            US_BANK,
            USER,
        }

        /**
         * An enum containing [VendorCodeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VendorCodeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BAI2,
            BANKING_CIRCLE,
            BANKPROV,
            BNK_DEV,
            CLEARTOUCH,
            COLUMN,
            CROSS_RIVER,
            CURRENCYCLOUD,
            DC_BANK,
            DWOLLA,
            EVOLVE,
            GOLDMAN_SACHS,
            ISO20022,
            JPMC,
            MX,
            PLAID,
            PNC,
            RSPEC_VENDOR,
            SIGNET,
            SILVERGATE,
            SWIFT,
            US_BANK,
            USER,
            /**
             * An enum member indicating that [VendorCodeType] was instantiated with an unknown
             * value.
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
                BAI2 -> Value.BAI2
                BANKING_CIRCLE -> Value.BANKING_CIRCLE
                BANKPROV -> Value.BANKPROV
                BNK_DEV -> Value.BNK_DEV
                CLEARTOUCH -> Value.CLEARTOUCH
                COLUMN -> Value.COLUMN
                CROSS_RIVER -> Value.CROSS_RIVER
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
                DC_BANK -> Value.DC_BANK
                DWOLLA -> Value.DWOLLA
                EVOLVE -> Value.EVOLVE
                GOLDMAN_SACHS -> Value.GOLDMAN_SACHS
                ISO20022 -> Value.ISO20022
                JPMC -> Value.JPMC
                MX -> Value.MX
                PLAID -> Value.PLAID
                PNC -> Value.PNC
                RSPEC_VENDOR -> Value.RSPEC_VENDOR
                SIGNET -> Value.SIGNET
                SILVERGATE -> Value.SILVERGATE
                SWIFT -> Value.SWIFT
                US_BANK -> Value.US_BANK
                USER -> Value.USER
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
                BAI2 -> Known.BAI2
                BANKING_CIRCLE -> Known.BANKING_CIRCLE
                BANKPROV -> Known.BANKPROV
                BNK_DEV -> Known.BNK_DEV
                CLEARTOUCH -> Known.CLEARTOUCH
                COLUMN -> Known.COLUMN
                CROSS_RIVER -> Known.CROSS_RIVER
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                DC_BANK -> Known.DC_BANK
                DWOLLA -> Known.DWOLLA
                EVOLVE -> Known.EVOLVE
                GOLDMAN_SACHS -> Known.GOLDMAN_SACHS
                ISO20022 -> Known.ISO20022
                JPMC -> Known.JPMC
                MX -> Known.MX
                PLAID -> Known.PLAID
                PNC -> Known.PNC
                RSPEC_VENDOR -> Known.RSPEC_VENDOR
                SIGNET -> Known.SIGNET
                SILVERGATE -> Known.SILVERGATE
                SWIFT -> Known.SWIFT
                US_BANK -> Known.US_BANK
                USER -> Known.USER
                else -> throw ModernTreasuryInvalidDataException("Unknown VendorCodeType: $value")
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

            return /* spotless:off */ other is VendorCodeType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    class Details
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

            /** Returns a mutable builder for constructing an instance of [Details]. */
            fun builder() = Builder()
        }

        /** A builder for [Details]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(details: Details) = apply {
                additionalProperties = details.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Details].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Details = Details(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Details = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Details && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Details{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Transaction && id == other.id && amount == other.amount && asOfDate == other.asOfDate && asOfTime == other.asOfTime && asOfTimezone == other.asOfTimezone && createdAt == other.createdAt && currency == other.currency && customIdentifiers == other.customIdentifiers && direction == other.direction && discardedAt == other.discardedAt && foreignExchangeRate == other.foreignExchangeRate && internalAccountId == other.internalAccountId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && posted == other.posted && reconciled == other.reconciled && type == other.type && updatedAt == other.updatedAt && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && vendorCustomerId == other.vendorCustomerId && vendorId == other.vendorId && details == other.details && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, asOfDate, asOfTime, asOfTimezone, createdAt, currency, customIdentifiers, direction, discardedAt, foreignExchangeRate, internalAccountId, liveMode, metadata, object_, posted, reconciled, type, updatedAt, vendorCode, vendorCodeType, vendorCustomerId, vendorId, details, vendorDescription, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{id=$id, amount=$amount, asOfDate=$asOfDate, asOfTime=$asOfTime, asOfTimezone=$asOfTimezone, createdAt=$createdAt, currency=$currency, customIdentifiers=$customIdentifiers, direction=$direction, discardedAt=$discardedAt, foreignExchangeRate=$foreignExchangeRate, internalAccountId=$internalAccountId, liveMode=$liveMode, metadata=$metadata, object_=$object_, posted=$posted, reconciled=$reconciled, type=$type, updatedAt=$updatedAt, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, vendorCustomerId=$vendorCustomerId, vendorId=$vendorId, details=$details, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
}
