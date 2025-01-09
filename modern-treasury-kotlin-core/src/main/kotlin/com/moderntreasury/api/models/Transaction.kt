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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Transaction
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("as_of_date")
    @ExcludeMissing
    private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("as_of_time")
    @ExcludeMissing
    private val asOfTime: JsonField<String> = JsonMissing.of(),
    @JsonProperty("as_of_timezone")
    @ExcludeMissing
    private val asOfTimezone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("custom_identifiers")
    @ExcludeMissing
    private val customIdentifiers: JsonField<CustomIdentifiers> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    private val foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("posted")
    @ExcludeMissing
    private val posted: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("reconciled")
    @ExcludeMissing
    private val reconciled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("vendor_code")
    @ExcludeMissing
    private val vendorCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("vendor_code_type")
    @ExcludeMissing
    private val vendorCodeType: JsonField<VendorCodeType> = JsonMissing.of(),
    @JsonProperty("vendor_customer_id")
    @ExcludeMissing
    private val vendorCustomerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("vendor_id")
    @ExcludeMissing
    private val vendorId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("details")
    @ExcludeMissing
    private val details: JsonField<Details> = JsonMissing.of(),
    @JsonProperty("vendor_description")
    @ExcludeMissing
    private val vendorDescription: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** The date on which the transaction occurred. */
    fun asOfDate(): LocalDate? = asOfDate.getNullable("as_of_date")

    /**
     * The time on which the transaction occurred. Depending on the granularity of the timestamp
     * information received from the bank, it may be `null`.
     */
    fun asOfTime(): String? = asOfTime.getNullable("as_of_time")

    /**
     * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
     * provide timezone info.
     */
    fun asOfTimezone(): String? = asOfTimezone.getNullable("as_of_timezone")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Currency that this transaction is denominated in. */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * An object containing key-value pairs, each with a custom identifier as the key and a string
     * value.
     */
    fun customIdentifiers(): CustomIdentifiers = customIdentifiers.getRequired("custom_identifiers")

    /** Either `credit` or `debit`. */
    fun direction(): String = direction.getRequired("direction")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** Associated serialized foreign exchange rate information. */
    fun foreignExchangeRate(): ForeignExchangeRate? =
        foreignExchangeRate.getNullable("foreign_exchange_rate")

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /** This field will be `true` if the transaction has posted to the account. */
    fun posted(): Boolean = posted.getRequired("posted")

    /**
     * This field will be `true` if a transaction is reconciled by the Modern Treasury system. This
     * means that it has transaction line items that sum up to the transaction's amount.
     */
    fun reconciled(): Boolean = reconciled.getRequired("reconciled")

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    fun type(): Type = type.getRequired("type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    fun vendorCode(): String? = vendorCode.getNullable("vendor_code")

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    fun vendorCodeType(): VendorCodeType? = vendorCodeType.getNullable("vendor_code_type")

    /** An identifier given to this transaction by the bank, often `null`. */
    fun vendorCustomerId(): String? = vendorCustomerId.getNullable("vendor_customer_id")

    /** An identifier given to this transaction by the bank. */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    fun details(): Details? = details.getNullable("details")

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    fun vendorDescription(): String? = vendorDescription.getNullable("vendor_description")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The date on which the transaction occurred. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

    /**
     * The time on which the transaction occurred. Depending on the granularity of the timestamp
     * information received from the bank, it may be `null`.
     */
    @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

    /**
     * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
     * provide timezone info.
     */
    @JsonProperty("as_of_timezone")
    @ExcludeMissing
    fun _asOfTimezone(): JsonField<String> = asOfTimezone

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Currency that this transaction is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * An object containing key-value pairs, each with a custom identifier as the key and a string
     * value.
     */
    @JsonProperty("custom_identifiers")
    @ExcludeMissing
    fun _customIdentifiers(): JsonField<CustomIdentifiers> = customIdentifiers

    /** Either `credit` or `debit`. */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** Associated serialized foreign exchange rate information. */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate(): JsonField<ForeignExchangeRate> = foreignExchangeRate

    /** The ID of the relevant Internal Account. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** This field will be `true` if the transaction has posted to the account. */
    @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

    /**
     * This field will be `true` if a transaction is reconciled by the Modern Treasury system. This
     * means that it has transaction line items that sum up to the transaction's amount.
     */
    @JsonProperty("reconciled") @ExcludeMissing fun _reconciled(): JsonField<Boolean> = reconciled

    /**
     * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`, `book`,
     * or `sen`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    @JsonProperty("vendor_code") @ExcludeMissing fun _vendorCode(): JsonField<String> = vendorCode

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    @JsonProperty("vendor_code_type")
    @ExcludeMissing
    fun _vendorCodeType(): JsonField<VendorCodeType> = vendorCodeType

    /** An identifier given to this transaction by the bank, often `null`. */
    @JsonProperty("vendor_customer_id")
    @ExcludeMissing
    fun _vendorCustomerId(): JsonField<String> = vendorCustomerId

    /** An identifier given to this transaction by the bank. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<Details> = details

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    @JsonProperty("vendor_description")
    @ExcludeMissing
    fun _vendorDescription(): JsonField<String> = vendorDescription

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

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

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /**
         * The time on which the transaction occurred. Depending on the granularity of the timestamp
         * information received from the bank, it may be `null`.
         */
        fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

        /**
         * The time on which the transaction occurred. Depending on the granularity of the timestamp
         * information received from the bank, it may be `null`.
         */
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /**
         * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
         * provide timezone info.
         */
        fun asOfTimezone(asOfTimezone: String?) = asOfTimezone(JsonField.ofNullable(asOfTimezone))

        /**
         * The timezone in which the `as_of_time` is represented. Can be `null` if the bank does not
         * provide timezone info.
         */
        fun asOfTimezone(asOfTimezone: JsonField<String>) = apply {
            this.asOfTimezone = asOfTimezone
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Currency that this transaction is denominated in. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * An object containing key-value pairs, each with a custom identifier as the key and a
         * string value.
         */
        fun customIdentifiers(customIdentifiers: CustomIdentifiers) =
            customIdentifiers(JsonField.of(customIdentifiers))

        /**
         * An object containing key-value pairs, each with a custom identifier as the key and a
         * string value.
         */
        fun customIdentifiers(customIdentifiers: JsonField<CustomIdentifiers>) = apply {
            this.customIdentifiers = customIdentifiers
        }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /** Either `credit` or `debit`. */
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate?) =
            foreignExchangeRate(JsonField.ofNullable(foreignExchangeRate))

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
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

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = posted(JsonField.of(posted))

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

        /**
         * This field will be `true` if a transaction is reconciled by the Modern Treasury system.
         * This means that it has transaction line items that sum up to the transaction's amount.
         */
        fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

        /**
         * This field will be `true` if a transaction is reconciled by the Modern Treasury system.
         * This means that it has transaction line items that sum up to the transaction's amount.
         */
        fun reconciled(reconciled: JsonField<Boolean>) = apply { this.reconciled = reconciled }

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
         * `book`, or `sen`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
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
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: JsonField<VendorCodeType>) = apply {
            this.vendorCodeType = vendorCodeType
        }

        /** An identifier given to this transaction by the bank, often `null`. */
        fun vendorCustomerId(vendorCustomerId: String?) =
            vendorCustomerId(JsonField.ofNullable(vendorCustomerId))

        /** An identifier given to this transaction by the bank, often `null`. */
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            this.vendorCustomerId = vendorCustomerId
        }

        /** An identifier given to this transaction by the bank. */
        fun vendorId(vendorId: String?) = vendorId(JsonField.ofNullable(vendorId))

        /** An identifier given to this transaction by the bank. */
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
         * This field contains additional information that the bank provided about the transaction.
         * This is structured data. Some of the data in here might overlap with what is in the
         * `vendor_description`. For example, the OBI could be a part of the vendor description, and
         * it would also be included in here. The attributes that are passed through the details
         * field will vary based on your banking partner. Currently, the following keys may be in
         * the details object: `originator_name`, `originator_to_beneficiary_information`.
         */
        fun details(details: JsonField<Details>) = apply { this.details = details }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String?) =
            vendorDescription(JsonField.ofNullable(vendorDescription))

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
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

        fun build(): Transaction =
            Transaction(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                checkNotNull(asOfTime) { "`asOfTime` is required but was not set" },
                checkNotNull(asOfTimezone) { "`asOfTimezone` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(customIdentifiers) {
                    "`customIdentifiers` is required but was not set"
                },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(foreignExchangeRate) {
                    "`foreignExchangeRate` is required but was not set"
                },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(posted) { "`posted` is required but was not set" },
                checkNotNull(reconciled) { "`reconciled` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                checkNotNull(vendorCode) { "`vendorCode` is required but was not set" },
                checkNotNull(vendorCodeType) { "`vendorCodeType` is required but was not set" },
                checkNotNull(vendorCustomerId) { "`vendorCustomerId` is required but was not set" },
                checkNotNull(vendorId) { "`vendorId` is required but was not set" },
                details,
                vendorDescription,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * An object containing key-value pairs, each with a custom identifier as the key and a string
     * value.
     */
    @NoAutoDetect
    class CustomIdentifiers
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomIdentifiers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

            fun build(): CustomIdentifiers = CustomIdentifiers(additionalProperties.toImmutable())
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
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

        /** A string representation of the rate. */
        @JsonProperty("rate_string")
        @ExcludeMissing
        fun _rateString(): JsonField<String> = rateString

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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
                    checkNotNull(baseAmount) { "`baseAmount` is required but was not set" },
                    checkNotNull(baseCurrency) { "`baseCurrency` is required but was not set" },
                    checkNotNull(exponent) { "`exponent` is required but was not set" },
                    checkNotNull(rateString) { "`rateString` is required but was not set" },
                    checkNotNull(targetAmount) { "`targetAmount` is required but was not set" },
                    checkNotNull(targetCurrency) { "`targetCurrency` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
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
            if (validated) {
                return@apply
            }

            validated = true
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

    class Type
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

            val OTHER = of("other")

            fun of(value: String) = Type(JsonField.of(value))
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
            OTHER,
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
            OTHER,
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
                OTHER -> Value.OTHER
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
                OTHER -> Known.OTHER
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class VendorCodeType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BAI2 = of("bai2")

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

        enum class Known {
            BAI2,
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

        enum class Value {
            BAI2,
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
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BAI2 -> Value.BAI2
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

        fun known(): Known =
            when (this) {
                BAI2 -> Known.BAI2
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

        fun asString(): String = _value().asStringOrThrow()

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
    @NoAutoDetect
    class Details
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Details = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

            fun build(): Details = Details(additionalProperties.toImmutable())
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
