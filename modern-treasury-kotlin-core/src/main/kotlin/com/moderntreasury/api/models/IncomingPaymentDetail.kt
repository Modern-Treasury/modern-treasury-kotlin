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
class IncomingPaymentDetail
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("as_of_date")
    @ExcludeMissing
    private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_account_number_safe")
    @ExcludeMissing
    private val originatingAccountNumberSafe: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_account_number_type")
    @ExcludeMissing
    private val originatingAccountNumberType: JsonField<OriginatingAccountNumberType> =
        JsonMissing.of(),
    @JsonProperty("originating_routing_number")
    @ExcludeMissing
    private val originatingRoutingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_routing_number_type")
    @ExcludeMissing
    private val originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType> =
        JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    private val transactionLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("vendor_id")
    @ExcludeMissing
    private val vendorId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("virtual_account")
    @ExcludeMissing
    private val virtualAccount: JsonField<VirtualAccount> = JsonMissing.of(),
    @JsonProperty("virtual_account_id")
    @ExcludeMissing
    private val virtualAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_account_number")
    @ExcludeMissing
    private val originatingAccountNumber: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** The date on which the corresponding transaction will occur. */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The currency of the incoming payment detail. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The raw data from the payment pre-notification file that we get from the bank. */
    fun data(): Data = data.getRequired("data")

    /** One of `credit` or `debit`. */
    fun direction(): TransactionDirection = direction.getRequired("direction")

    /** The ID of the Internal Account for the incoming payment detail. This is always present. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /** The last 4 digits of the originating account_number for the incoming payment detail. */
    fun originatingAccountNumberSafe(): String? =
        originatingAccountNumberSafe.getNullable("originating_account_number_safe")

    /** The type of the originating account number for the incoming payment detail. */
    fun originatingAccountNumberType(): OriginatingAccountNumberType? =
        originatingAccountNumberType.getNullable("originating_account_number_type")

    /** The routing number of the originating account for the incoming payment detail. */
    fun originatingRoutingNumber(): String? =
        originatingRoutingNumber.getNullable("originating_routing_number")

    /** The type of the originating routing number for the incoming payment detail. */
    fun originatingRoutingNumberType(): OriginatingRoutingNumberType? =
        originatingRoutingNumberType.getNullable("originating_routing_number_type")

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    fun status(): Status = status.getRequired("status")

    /** The ID of the reconciled Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the reconciled Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    fun type(): Type = type.getRequired("type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The identifier of the vendor bank. */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    /**
     * If the incoming payment detail is in a virtual account, the serialized virtual account
     * object.
     */
    fun virtualAccount(): VirtualAccount? = virtualAccount.getNullable("virtual_account")

    /** If the incoming payment detail is in a virtual account, the ID of the Virtual Account. */
    fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

    /** The account number of the originating account for the incoming payment detail. */
    fun originatingAccountNumber(): String? =
        originatingAccountNumber.getNullable("originating_account_number")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The date on which the corresponding transaction will occur. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The currency of the incoming payment detail. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The raw data from the payment pre-notification file that we get from the bank. */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /** One of `credit` or `debit`. */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<TransactionDirection> = direction

    /** The ID of the Internal Account for the incoming payment detail. This is always present. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** The last 4 digits of the originating account_number for the incoming payment detail. */
    @JsonProperty("originating_account_number_safe")
    @ExcludeMissing
    fun _originatingAccountNumberSafe(): JsonField<String> = originatingAccountNumberSafe

    /** The type of the originating account number for the incoming payment detail. */
    @JsonProperty("originating_account_number_type")
    @ExcludeMissing
    fun _originatingAccountNumberType(): JsonField<OriginatingAccountNumberType> =
        originatingAccountNumberType

    /** The routing number of the originating account for the incoming payment detail. */
    @JsonProperty("originating_routing_number")
    @ExcludeMissing
    fun _originatingRoutingNumber(): JsonField<String> = originatingRoutingNumber

    /** The type of the originating routing number for the incoming payment detail. */
    @JsonProperty("originating_routing_number_type")
    @ExcludeMissing
    fun _originatingRoutingNumberType(): JsonField<OriginatingRoutingNumberType> =
        originatingRoutingNumberType

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The ID of the reconciled Transaction or `null`. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /** The ID of the reconciled Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /** The identifier of the vendor bank. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

    /**
     * If the incoming payment detail is in a virtual account, the serialized virtual account
     * object.
     */
    @JsonProperty("virtual_account")
    @ExcludeMissing
    fun _virtualAccount(): JsonField<VirtualAccount> = virtualAccount

    /** If the incoming payment detail is in a virtual account, the ID of the Virtual Account. */
    @JsonProperty("virtual_account_id")
    @ExcludeMissing
    fun _virtualAccountId(): JsonField<String> = virtualAccountId

    /** The account number of the originating account for the incoming payment detail. */
    @JsonProperty("originating_account_number")
    @ExcludeMissing
    fun _originatingAccountNumber(): JsonField<String> = originatingAccountNumber

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IncomingPaymentDetail = apply {
        if (!validated) {
            id()
            amount()
            asOfDate()
            createdAt()
            currency()
            data().validate()
            direction()
            internalAccountId()
            ledgerTransactionId()
            liveMode()
            metadata().validate()
            object_()
            originatingAccountNumberSafe()
            originatingAccountNumberType()
            originatingRoutingNumber()
            originatingRoutingNumberType()
            status()
            transactionId()
            transactionLineItemId()
            type()
            updatedAt()
            vendorId()
            virtualAccount()?.validate()
            virtualAccountId()
            originatingAccountNumber()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var asOfDate: JsonField<LocalDate>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var data: JsonField<Data>? = null
        private var direction: JsonField<TransactionDirection>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var originatingAccountNumberSafe: JsonField<String>? = null
        private var originatingAccountNumberType: JsonField<OriginatingAccountNumberType>? = null
        private var originatingRoutingNumber: JsonField<String>? = null
        private var originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorId: JsonField<String>? = null
        private var virtualAccount: JsonField<VirtualAccount>? = null
        private var virtualAccountId: JsonField<String>? = null
        private var originatingAccountNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(incomingPaymentDetail: IncomingPaymentDetail) = apply {
            id = incomingPaymentDetail.id
            amount = incomingPaymentDetail.amount
            asOfDate = incomingPaymentDetail.asOfDate
            createdAt = incomingPaymentDetail.createdAt
            currency = incomingPaymentDetail.currency
            data = incomingPaymentDetail.data
            direction = incomingPaymentDetail.direction
            internalAccountId = incomingPaymentDetail.internalAccountId
            ledgerTransactionId = incomingPaymentDetail.ledgerTransactionId
            liveMode = incomingPaymentDetail.liveMode
            metadata = incomingPaymentDetail.metadata
            object_ = incomingPaymentDetail.object_
            originatingAccountNumberSafe = incomingPaymentDetail.originatingAccountNumberSafe
            originatingAccountNumberType = incomingPaymentDetail.originatingAccountNumberType
            originatingRoutingNumber = incomingPaymentDetail.originatingRoutingNumber
            originatingRoutingNumberType = incomingPaymentDetail.originatingRoutingNumberType
            status = incomingPaymentDetail.status
            transactionId = incomingPaymentDetail.transactionId
            transactionLineItemId = incomingPaymentDetail.transactionLineItemId
            type = incomingPaymentDetail.type
            updatedAt = incomingPaymentDetail.updatedAt
            vendorId = incomingPaymentDetail.vendorId
            virtualAccount = incomingPaymentDetail.virtualAccount
            virtualAccountId = incomingPaymentDetail.virtualAccountId
            originatingAccountNumber = incomingPaymentDetail.originatingAccountNumber
            additionalProperties = incomingPaymentDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The date on which the corresponding transaction will occur. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date on which the corresponding transaction will occur. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the incoming payment detail. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the incoming payment detail. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The raw data from the payment pre-notification file that we get from the bank. */
        fun data(data: Data) = data(JsonField.of(data))

        /** The raw data from the payment pre-notification file that we get from the bank. */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

        /** One of `credit` or `debit`. */
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            this.direction = direction
        }

        /**
         * The ID of the Internal Account for the incoming payment detail. This is always present.
         */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * The ID of the Internal Account for the incoming payment detail. This is always present.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
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

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The last 4 digits of the originating account_number for the incoming payment detail. */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: String?) =
            originatingAccountNumberSafe(JsonField.ofNullable(originatingAccountNumberSafe))

        /** The last 4 digits of the originating account_number for the incoming payment detail. */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: JsonField<String>) = apply {
            this.originatingAccountNumberSafe = originatingAccountNumberSafe
        }

        /** The type of the originating account number for the incoming payment detail. */
        fun originatingAccountNumberType(
            originatingAccountNumberType: OriginatingAccountNumberType?
        ) = originatingAccountNumberType(JsonField.ofNullable(originatingAccountNumberType))

        /** The type of the originating account number for the incoming payment detail. */
        fun originatingAccountNumberType(
            originatingAccountNumberType: JsonField<OriginatingAccountNumberType>
        ) = apply { this.originatingAccountNumberType = originatingAccountNumberType }

        /** The routing number of the originating account for the incoming payment detail. */
        fun originatingRoutingNumber(originatingRoutingNumber: String?) =
            originatingRoutingNumber(JsonField.ofNullable(originatingRoutingNumber))

        /** The routing number of the originating account for the incoming payment detail. */
        fun originatingRoutingNumber(originatingRoutingNumber: JsonField<String>) = apply {
            this.originatingRoutingNumber = originatingRoutingNumber
        }

        /** The type of the originating routing number for the incoming payment detail. */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: OriginatingRoutingNumberType?
        ) = originatingRoutingNumberType(JsonField.ofNullable(originatingRoutingNumberType))

        /** The type of the originating routing number for the incoming payment detail. */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>
        ) = apply { this.originatingRoutingNumberType = originatingRoutingNumberType }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type) = type(JsonField.of(type))

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The identifier of the vendor bank. */
        fun vendorId(vendorId: String?) = vendorId(JsonField.ofNullable(vendorId))

        /** The identifier of the vendor bank. */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /**
         * If the incoming payment detail is in a virtual account, the serialized virtual account
         * object.
         */
        fun virtualAccount(virtualAccount: VirtualAccount?) =
            virtualAccount(JsonField.ofNullable(virtualAccount))

        /**
         * If the incoming payment detail is in a virtual account, the serialized virtual account
         * object.
         */
        fun virtualAccount(virtualAccount: JsonField<VirtualAccount>) = apply {
            this.virtualAccount = virtualAccount
        }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String?) =
            virtualAccountId(JsonField.ofNullable(virtualAccountId))

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /** The account number of the originating account for the incoming payment detail. */
        fun originatingAccountNumber(originatingAccountNumber: String?) =
            originatingAccountNumber(JsonField.ofNullable(originatingAccountNumber))

        /** The account number of the originating account for the incoming payment detail. */
        fun originatingAccountNumber(originatingAccountNumber: JsonField<String>) = apply {
            this.originatingAccountNumber = originatingAccountNumber
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

        fun build(): IncomingPaymentDetail =
            IncomingPaymentDetail(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(data) { "`data` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(ledgerTransactionId) {
                    "`ledgerTransactionId` is required but was not set"
                },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(originatingAccountNumberSafe) {
                    "`originatingAccountNumberSafe` is required but was not set"
                },
                checkNotNull(originatingAccountNumberType) {
                    "`originatingAccountNumberType` is required but was not set"
                },
                checkNotNull(originatingRoutingNumber) {
                    "`originatingRoutingNumber` is required but was not set"
                },
                checkNotNull(originatingRoutingNumberType) {
                    "`originatingRoutingNumberType` is required but was not set"
                },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(transactionId) { "`transactionId` is required but was not set" },
                checkNotNull(transactionLineItemId) {
                    "`transactionLineItemId` is required but was not set"
                },
                checkNotNull(type) { "`type` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                checkNotNull(vendorId) { "`vendorId` is required but was not set" },
                checkNotNull(virtualAccount) { "`virtualAccount` is required but was not set" },
                checkNotNull(virtualAccountId) { "`virtualAccountId` is required but was not set" },
                originatingAccountNumber,
                additionalProperties.toImmutable(),
            )
    }

    /** The raw data from the payment pre-notification file that we get from the bank. */
    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
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

            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
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

    class OriginatingAccountNumberType
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

            fun of(value: String) = OriginatingAccountNumberType(JsonField.of(value))
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
                        "Unknown OriginatingAccountNumberType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OriginatingAccountNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class OriginatingRoutingNumberType
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

            val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

            val MY_BRANCH_CODE = of("my_branch_code")

            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            val SWIFT = of("swift")

            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            fun of(value: String) = OriginatingRoutingNumberType(JsonField.of(value))
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
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
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
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
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
                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
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
                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown OriginatingRoutingNumberType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OriginatingRoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETED = of("completed")

            val PENDING = of("pending")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
        }

        enum class Value {
            COMPLETED,
            PENDING,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            val BOOK = of("book")

            val CHECK = of("check")

            val EFT = of("eft")

            val INTERAC = of("interac")

            val RTP = of("rtp")

            val SEPA = of("sepa")

            val SIGNET = of("signet")

            val WIRE = of("wire")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetail && id == other.id && amount == other.amount && asOfDate == other.asOfDate && createdAt == other.createdAt && currency == other.currency && data == other.data && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && originatingAccountNumberSafe == other.originatingAccountNumberSafe && originatingAccountNumberType == other.originatingAccountNumberType && originatingRoutingNumber == other.originatingRoutingNumber && originatingRoutingNumberType == other.originatingRoutingNumberType && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && type == other.type && updatedAt == other.updatedAt && vendorId == other.vendorId && virtualAccount == other.virtualAccount && virtualAccountId == other.virtualAccountId && originatingAccountNumber == other.originatingAccountNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, asOfDate, createdAt, currency, data, direction, internalAccountId, ledgerTransactionId, liveMode, metadata, object_, originatingAccountNumberSafe, originatingAccountNumberType, originatingRoutingNumber, originatingRoutingNumberType, status, transactionId, transactionLineItemId, type, updatedAt, vendorId, virtualAccount, virtualAccountId, originatingAccountNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IncomingPaymentDetail{id=$id, amount=$amount, asOfDate=$asOfDate, createdAt=$createdAt, currency=$currency, data=$data, direction=$direction, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, originatingAccountNumberSafe=$originatingAccountNumberSafe, originatingAccountNumberType=$originatingAccountNumberType, originatingRoutingNumber=$originatingRoutingNumber, originatingRoutingNumberType=$originatingRoutingNumberType, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, vendorId=$vendorId, virtualAccount=$virtualAccount, virtualAccountId=$virtualAccountId, originatingAccountNumber=$originatingAccountNumber, additionalProperties=$additionalProperties}"
}
