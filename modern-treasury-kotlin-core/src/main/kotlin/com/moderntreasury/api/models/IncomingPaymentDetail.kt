// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = IncomingPaymentDetail.Builder::class)
@NoAutoDetect
class IncomingPaymentDetail
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val internalAccountId: JsonField<String>,
    private val virtualAccountId: JsonField<String>,
    private val virtualAccount: JsonField<VirtualAccount>,
    private val transactionLineItemId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val ledgerTransactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val data: JsonField<Data>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val direction: JsonField<TransactionDirection>,
    private val status: JsonField<Status>,
    private val metadata: JsonField<Metadata>,
    private val asOfDate: JsonField<LocalDate>,
    private val vendorId: JsonField<String>,
    private val originatingRoutingNumber: JsonField<String>,
    private val originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>,
    private val originatingAccountNumber: JsonField<String>,
    private val originatingAccountNumberSafe: JsonField<String>,
    private val originatingAccountNumberType: JsonField<OriginatingAccountNumberType>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ID of the Internal Account for the incoming payment detail. This is always present. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** If the incoming payment detail is in a virtual account, the ID of the Virtual Account. */
    fun virtualAccountId(): String? = virtualAccountId.getNullable("virtual_account_id")

    /**
     * If the incoming payment detail is in a virtual account, the serialized virtual account
     * object.
     */
    fun virtualAccount(): VirtualAccount? = virtualAccount.getNullable("virtual_account")

    /** The ID of the reconciled Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /** The ID of the reconciled Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    fun type(): Type = type.getRequired("type")

    /** The raw data from the payment pre-notification file that we get from the bank. */
    fun data(): Data = data.getRequired("data")

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** The currency of the incoming payment detail. */
    fun currency(): Currency? = currency.getNullable("currency")

    /** One of `credit` or `debit`. */
    fun direction(): TransactionDirection = direction.getRequired("direction")

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    fun status(): Status = status.getRequired("status")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The date on which the corresponding transaction will occur. */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    /** The identifier of the vendor bank. */
    fun vendorId(): String? = vendorId.getNullable("vendor_id")

    /** The routing number of the originating account for the incoming payment detail. */
    fun originatingRoutingNumber(): String? =
        originatingRoutingNumber.getNullable("originating_routing_number")

    /** The type of the originating routing number for the incoming payment detail. */
    fun originatingRoutingNumberType(): OriginatingRoutingNumberType? =
        originatingRoutingNumberType.getNullable("originating_routing_number_type")

    /** The account number of the originating account for the incoming payment detail. */
    fun originatingAccountNumber(): String? =
        originatingAccountNumber.getNullable("originating_account_number")

    /** The last 4 digits of the originating account_number for the incoming payment detail. */
    fun originatingAccountNumberSafe(): String? =
        originatingAccountNumberSafe.getNullable("originating_account_number_safe")

    /** The type of the originating account number for the incoming payment detail. */
    fun originatingAccountNumberType(): OriginatingAccountNumberType? =
        originatingAccountNumberType.getNullable("originating_account_number_type")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The ID of the Internal Account for the incoming payment detail. This is always present. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /** If the incoming payment detail is in a virtual account, the ID of the Virtual Account. */
    @JsonProperty("virtual_account_id") @ExcludeMissing fun _virtualAccountId() = virtualAccountId

    /**
     * If the incoming payment detail is in a virtual account, the serialized virtual account
     * object.
     */
    @JsonProperty("virtual_account") @ExcludeMissing fun _virtualAccount() = virtualAccount

    /** The ID of the reconciled Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId() = transactionLineItemId

    /** The ID of the reconciled Transaction or `null`. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /** The raw data from the payment pre-notification file that we get from the bank. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency of the incoming payment detail. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** One of `credit` or `debit`. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The date on which the corresponding transaction will occur. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate() = asOfDate

    /** The identifier of the vendor bank. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId() = vendorId

    /** The routing number of the originating account for the incoming payment detail. */
    @JsonProperty("originating_routing_number")
    @ExcludeMissing
    fun _originatingRoutingNumber() = originatingRoutingNumber

    /** The type of the originating routing number for the incoming payment detail. */
    @JsonProperty("originating_routing_number_type")
    @ExcludeMissing
    fun _originatingRoutingNumberType() = originatingRoutingNumberType

    /** The account number of the originating account for the incoming payment detail. */
    @JsonProperty("originating_account_number")
    @ExcludeMissing
    fun _originatingAccountNumber() = originatingAccountNumber

    /** The last 4 digits of the originating account_number for the incoming payment detail. */
    @JsonProperty("originating_account_number_safe")
    @ExcludeMissing
    fun _originatingAccountNumberSafe() = originatingAccountNumberSafe

    /** The type of the originating account number for the incoming payment detail. */
    @JsonProperty("originating_account_number_type")
    @ExcludeMissing
    fun _originatingAccountNumberType() = originatingAccountNumberType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): IncomingPaymentDetail = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            internalAccountId()
            virtualAccountId()
            virtualAccount()?.validate()
            transactionLineItemId()
            transactionId()
            ledgerTransactionId()
            type()
            data().validate()
            amount()
            currency()
            direction()
            status()
            metadata().validate()
            asOfDate()
            vendorId()
            originatingRoutingNumber()
            originatingRoutingNumberType()
            originatingAccountNumber()
            originatingAccountNumberSafe()
            originatingAccountNumberType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IncomingPaymentDetail &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.internalAccountId == other.internalAccountId &&
            this.virtualAccountId == other.virtualAccountId &&
            this.virtualAccount == other.virtualAccount &&
            this.transactionLineItemId == other.transactionLineItemId &&
            this.transactionId == other.transactionId &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.type == other.type &&
            this.data == other.data &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.direction == other.direction &&
            this.status == other.status &&
            this.metadata == other.metadata &&
            this.asOfDate == other.asOfDate &&
            this.vendorId == other.vendorId &&
            this.originatingRoutingNumber == other.originatingRoutingNumber &&
            this.originatingRoutingNumberType == other.originatingRoutingNumberType &&
            this.originatingAccountNumber == other.originatingAccountNumber &&
            this.originatingAccountNumberSafe == other.originatingAccountNumberSafe &&
            this.originatingAccountNumberType == other.originatingAccountNumberType &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    internalAccountId,
                    virtualAccountId,
                    virtualAccount,
                    transactionLineItemId,
                    transactionId,
                    ledgerTransactionId,
                    type,
                    data,
                    amount,
                    currency,
                    direction,
                    status,
                    metadata,
                    asOfDate,
                    vendorId,
                    originatingRoutingNumber,
                    originatingRoutingNumberType,
                    originatingAccountNumber,
                    originatingAccountNumberSafe,
                    originatingAccountNumberType,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "IncomingPaymentDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, internalAccountId=$internalAccountId, virtualAccountId=$virtualAccountId, virtualAccount=$virtualAccount, transactionLineItemId=$transactionLineItemId, transactionId=$transactionId, ledgerTransactionId=$ledgerTransactionId, type=$type, data=$data, amount=$amount, currency=$currency, direction=$direction, status=$status, metadata=$metadata, asOfDate=$asOfDate, vendorId=$vendorId, originatingRoutingNumber=$originatingRoutingNumber, originatingRoutingNumberType=$originatingRoutingNumberType, originatingAccountNumber=$originatingAccountNumber, originatingAccountNumberSafe=$originatingAccountNumberSafe, originatingAccountNumberType=$originatingAccountNumberType, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var virtualAccountId: JsonField<String> = JsonMissing.of()
        private var virtualAccount: JsonField<VirtualAccount> = JsonMissing.of()
        private var transactionLineItemId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var direction: JsonField<TransactionDirection> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var asOfDate: JsonField<LocalDate> = JsonMissing.of()
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var originatingRoutingNumber: JsonField<String> = JsonMissing.of()
        private var originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType> =
            JsonMissing.of()
        private var originatingAccountNumber: JsonField<String> = JsonMissing.of()
        private var originatingAccountNumberSafe: JsonField<String> = JsonMissing.of()
        private var originatingAccountNumberType: JsonField<OriginatingAccountNumberType> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(incomingPaymentDetail: IncomingPaymentDetail) = apply {
            this.id = incomingPaymentDetail.id
            this.object_ = incomingPaymentDetail.object_
            this.liveMode = incomingPaymentDetail.liveMode
            this.createdAt = incomingPaymentDetail.createdAt
            this.updatedAt = incomingPaymentDetail.updatedAt
            this.internalAccountId = incomingPaymentDetail.internalAccountId
            this.virtualAccountId = incomingPaymentDetail.virtualAccountId
            this.virtualAccount = incomingPaymentDetail.virtualAccount
            this.transactionLineItemId = incomingPaymentDetail.transactionLineItemId
            this.transactionId = incomingPaymentDetail.transactionId
            this.ledgerTransactionId = incomingPaymentDetail.ledgerTransactionId
            this.type = incomingPaymentDetail.type
            this.data = incomingPaymentDetail.data
            this.amount = incomingPaymentDetail.amount
            this.currency = incomingPaymentDetail.currency
            this.direction = incomingPaymentDetail.direction
            this.status = incomingPaymentDetail.status
            this.metadata = incomingPaymentDetail.metadata
            this.asOfDate = incomingPaymentDetail.asOfDate
            this.vendorId = incomingPaymentDetail.vendorId
            this.originatingRoutingNumber = incomingPaymentDetail.originatingRoutingNumber
            this.originatingRoutingNumberType = incomingPaymentDetail.originatingRoutingNumberType
            this.originatingAccountNumber = incomingPaymentDetail.originatingAccountNumber
            this.originatingAccountNumberSafe = incomingPaymentDetail.originatingAccountNumberSafe
            this.originatingAccountNumberType = incomingPaymentDetail.originatingAccountNumberType
            additionalProperties(incomingPaymentDetail.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * The ID of the Internal Account for the incoming payment detail. This is always present.
         */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * The ID of the Internal Account for the incoming payment detail. This is always present.
         */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String) =
            virtualAccountId(JsonField.of(virtualAccountId))

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /**
         * If the incoming payment detail is in a virtual account, the serialized virtual account
         * object.
         */
        fun virtualAccount(virtualAccount: VirtualAccount) =
            virtualAccount(JsonField.of(virtualAccount))

        /**
         * If the incoming payment detail is in a virtual account, the serialized virtual account
         * object.
         */
        @JsonProperty("virtual_account")
        @ExcludeMissing
        fun virtualAccount(virtualAccount: JsonField<VirtualAccount>) = apply {
            this.virtualAccount = virtualAccount
        }

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String) =
            transactionLineItemId(JsonField.of(transactionLineItemId))

        /** The ID of the reconciled Transaction Line Item or `null`. */
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the reconciled Transaction or `null`. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type) = type(JsonField.of(type))

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The raw data from the payment pre-notification file that we get from the bank. */
        fun data(data: Data) = data(JsonField.of(data))

        /** The raw data from the payment pre-notification file that we get from the bank. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency of the incoming payment detail. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the incoming payment detail. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

        /** One of `credit` or `debit`. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            this.direction = direction
        }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The date on which the corresponding transaction will occur. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date on which the corresponding transaction will occur. */
        @JsonProperty("as_of_date")
        @ExcludeMissing
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /** The identifier of the vendor bank. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** The identifier of the vendor bank. */
        @JsonProperty("vendor_id")
        @ExcludeMissing
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /** The routing number of the originating account for the incoming payment detail. */
        fun originatingRoutingNumber(originatingRoutingNumber: String) =
            originatingRoutingNumber(JsonField.of(originatingRoutingNumber))

        /** The routing number of the originating account for the incoming payment detail. */
        @JsonProperty("originating_routing_number")
        @ExcludeMissing
        fun originatingRoutingNumber(originatingRoutingNumber: JsonField<String>) = apply {
            this.originatingRoutingNumber = originatingRoutingNumber
        }

        /** The type of the originating routing number for the incoming payment detail. */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: OriginatingRoutingNumberType
        ) = originatingRoutingNumberType(JsonField.of(originatingRoutingNumberType))

        /** The type of the originating routing number for the incoming payment detail. */
        @JsonProperty("originating_routing_number_type")
        @ExcludeMissing
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>
        ) = apply { this.originatingRoutingNumberType = originatingRoutingNumberType }

        /** The account number of the originating account for the incoming payment detail. */
        fun originatingAccountNumber(originatingAccountNumber: String) =
            originatingAccountNumber(JsonField.of(originatingAccountNumber))

        /** The account number of the originating account for the incoming payment detail. */
        @JsonProperty("originating_account_number")
        @ExcludeMissing
        fun originatingAccountNumber(originatingAccountNumber: JsonField<String>) = apply {
            this.originatingAccountNumber = originatingAccountNumber
        }

        /** The last 4 digits of the originating account_number for the incoming payment detail. */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: String) =
            originatingAccountNumberSafe(JsonField.of(originatingAccountNumberSafe))

        /** The last 4 digits of the originating account_number for the incoming payment detail. */
        @JsonProperty("originating_account_number_safe")
        @ExcludeMissing
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: JsonField<String>) = apply {
            this.originatingAccountNumberSafe = originatingAccountNumberSafe
        }

        /** The type of the originating account number for the incoming payment detail. */
        fun originatingAccountNumberType(
            originatingAccountNumberType: OriginatingAccountNumberType
        ) = originatingAccountNumberType(JsonField.of(originatingAccountNumberType))

        /** The type of the originating account number for the incoming payment detail. */
        @JsonProperty("originating_account_number_type")
        @ExcludeMissing
        fun originatingAccountNumberType(
            originatingAccountNumberType: JsonField<OriginatingAccountNumberType>
        ) = apply { this.originatingAccountNumberType = originatingAccountNumberType }

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

        fun build(): IncomingPaymentDetail =
            IncomingPaymentDetail(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                internalAccountId,
                virtualAccountId,
                virtualAccount,
                transactionLineItemId,
                transactionId,
                ledgerTransactionId,
                type,
                data,
                amount,
                currency,
                direction,
                status,
                metadata,
                asOfDate,
                vendorId,
                originatingRoutingNumber,
                originatingRoutingNumberType,
                originatingAccountNumber,
                originatingAccountNumberSafe,
                originatingAccountNumberType,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The raw data from the payment pre-notification file that we get from the bank. */
    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Data{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                additionalProperties(data.additionalProperties)
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

            fun build(): Data = Data(additionalProperties.toUnmodifiable())
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

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

    class OriginatingAccountNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OriginatingAccountNumberType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CLABE = OriginatingAccountNumberType(JsonField.of("clabe"))

            val HK_NUMBER = OriginatingAccountNumberType(JsonField.of("hk_number"))

            val IBAN = OriginatingAccountNumberType(JsonField.of("iban"))

            val OTHER = OriginatingAccountNumberType(JsonField.of("other"))

            val PAN = OriginatingAccountNumberType(JsonField.of("pan"))

            val WALLET_ADDRESS = OriginatingAccountNumberType(JsonField.of("wallet_address"))

            fun of(value: String) = OriginatingAccountNumberType(JsonField.of(value))
        }

        enum class Known {
            CLABE,
            HK_NUMBER,
            IBAN,
            OTHER,
            PAN,
            WALLET_ADDRESS,
        }

        enum class Value {
            CLABE,
            HK_NUMBER,
            IBAN,
            OTHER,
            PAN,
            WALLET_ADDRESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CLABE -> Value.CLABE
                HK_NUMBER -> Value.HK_NUMBER
                IBAN -> Value.IBAN
                OTHER -> Value.OTHER
                PAN -> Value.PAN
                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CLABE -> Known.CLABE
                HK_NUMBER -> Known.HK_NUMBER
                IBAN -> Known.IBAN
                OTHER -> Known.OTHER
                PAN -> Known.PAN
                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown OriginatingAccountNumberType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class OriginatingRoutingNumberType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OriginatingRoutingNumberType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ABA = OriginatingRoutingNumberType(JsonField.of("aba"))

            val AU_BSB = OriginatingRoutingNumberType(JsonField.of("au_bsb"))

            val BR_CODIGO = OriginatingRoutingNumberType(JsonField.of("br_codigo"))

            val CA_CPA = OriginatingRoutingNumberType(JsonField.of("ca_cpa"))

            val CHIPS = OriginatingRoutingNumberType(JsonField.of("chips"))

            val CNAPS = OriginatingRoutingNumberType(JsonField.of("cnaps"))

            val DK_INTERBANK_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("dk_interbank_clearing_code"))

            val GB_SORT_CODE = OriginatingRoutingNumberType(JsonField.of("gb_sort_code"))

            val HK_INTERBANK_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

            val HU_INTERBANK_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("hu_interbank_clearing_code"))

            val ID_SKNBI_CODE = OriginatingRoutingNumberType(JsonField.of("id_sknbi_code"))

            val IN_IFSC = OriginatingRoutingNumberType(JsonField.of("in_ifsc"))

            val JP_ZENGIN_CODE = OriginatingRoutingNumberType(JsonField.of("jp_zengin_code"))

            val MY_BRANCH_CODE = OriginatingRoutingNumberType(JsonField.of("my_branch_code"))

            val NZ_NATIONAL_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("nz_national_clearing_code"))

            val PL_NATIONAL_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("pl_national_clearing_code"))

            val SE_BANKGIRO_CLEARING_CODE =
                OriginatingRoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

            val SWIFT = OriginatingRoutingNumberType(JsonField.of("swift"))

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
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
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
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SWIFT,
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
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Value.SWIFT
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
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SWIFT -> Known.SWIFT
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown OriginatingRoutingNumberType: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val COMPLETED = Status(JsonField.of("completed"))

            val PENDING = Status(JsonField.of("pending"))

            val RETURNED = Status(JsonField.of("returned"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACH = Type(JsonField.of("ach"))

            val BOOK = Type(JsonField.of("book"))

            val CHECK = Type(JsonField.of("check"))

            val EFT = Type(JsonField.of("eft"))

            val INTERAC = Type(JsonField.of("interac"))

            val RTP = Type(JsonField.of("rtp"))

            val SEPA = Type(JsonField.of("sepa"))

            val SIGNET = Type(JsonField.of("signet"))

            val WIRE = Type(JsonField.of("wire"))

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
    }
}
