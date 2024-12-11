// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = PaperItem.Builder::class)
@NoAutoDetect
class PaperItem
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val transactionLineItemId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val lockboxNumber: JsonField<String>,
    private val depositDate: JsonField<LocalDate>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val accountNumber: JsonField<String>,
    private val accountNumberSafe: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val checkNumber: JsonField<String>,
    private val remitterName: JsonField<String>,
    private val memoField: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ID of the reconciled Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    /** The ID of the reconciled Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    fun status(): Status = status.getRequired("status")

    /** The identifier for the lockbox assigned by the bank. */
    fun lockboxNumber(): String = lockboxNumber.getRequired("lockbox_number")

    /** The date the paper item was deposited into your organization's bank account. */
    fun depositDate(): LocalDate = depositDate.getRequired("deposit_date")

    /** The amount of the paper item. */
    fun amount(): Long = amount.getRequired("amount")

    /** The currency of the paper item. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The account number on the paper item. */
    fun accountNumber(): String? = accountNumber.getNullable("account_number")

    /** The last 4 digits of the account_number. */
    fun accountNumberSafe(): String? = accountNumberSafe.getNullable("account_number_safe")

    /** The routing number on the paper item. */
    fun routingNumber(): String? = routingNumber.getNullable("routing_number")

    /** The check number on the paper item. */
    fun checkNumber(): String? = checkNumber.getNullable("check_number")

    /** The name of the remitter on the paper item. */
    fun remitterName(): String? = remitterName.getNullable("remitter_name")

    /** The memo field on the paper item. */
    fun memoField(): String? = memoField.getNullable("memo_field")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The ID of the reconciled Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId() = transactionLineItemId

    /** The ID of the reconciled Transaction or `null`. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The identifier for the lockbox assigned by the bank. */
    @JsonProperty("lockbox_number") @ExcludeMissing fun _lockboxNumber() = lockboxNumber

    /** The date the paper item was deposited into your organization's bank account. */
    @JsonProperty("deposit_date") @ExcludeMissing fun _depositDate() = depositDate

    /** The amount of the paper item. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency of the paper item. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The account number on the paper item. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The last 4 digits of the account_number. */
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    fun _accountNumberSafe() = accountNumberSafe

    /** The routing number on the paper item. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The check number on the paper item. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /** The name of the remitter on the paper item. */
    @JsonProperty("remitter_name") @ExcludeMissing fun _remitterName() = remitterName

    /** The memo field on the paper item. */
    @JsonProperty("memo_field") @ExcludeMissing fun _memoField() = memoField

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaperItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            transactionLineItemId()
            transactionId()
            status()
            lockboxNumber()
            depositDate()
            amount()
            currency()
            accountNumber()
            accountNumberSafe()
            routingNumber()
            checkNumber()
            remitterName()
            memoField()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transactionLineItemId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var lockboxNumber: JsonField<String> = JsonMissing.of()
        private var depositDate: JsonField<LocalDate> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var accountNumberSafe: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var remitterName: JsonField<String> = JsonMissing.of()
        private var memoField: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paperItem: PaperItem) = apply {
            this.id = paperItem.id
            this.object_ = paperItem.object_
            this.liveMode = paperItem.liveMode
            this.createdAt = paperItem.createdAt
            this.updatedAt = paperItem.updatedAt
            this.transactionLineItemId = paperItem.transactionLineItemId
            this.transactionId = paperItem.transactionId
            this.status = paperItem.status
            this.lockboxNumber = paperItem.lockboxNumber
            this.depositDate = paperItem.depositDate
            this.amount = paperItem.amount
            this.currency = paperItem.currency
            this.accountNumber = paperItem.accountNumber
            this.accountNumberSafe = paperItem.accountNumberSafe
            this.routingNumber = paperItem.routingNumber
            this.checkNumber = paperItem.checkNumber
            this.remitterName = paperItem.remitterName
            this.memoField = paperItem.memoField
            additionalProperties(paperItem.additionalProperties)
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

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: String) = lockboxNumber(JsonField.of(lockboxNumber))

        /** The identifier for the lockbox assigned by the bank. */
        @JsonProperty("lockbox_number")
        @ExcludeMissing
        fun lockboxNumber(lockboxNumber: JsonField<String>) = apply {
            this.lockboxNumber = lockboxNumber
        }

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: LocalDate) = depositDate(JsonField.of(depositDate))

        /** The date the paper item was deposited into your organization's bank account. */
        @JsonProperty("deposit_date")
        @ExcludeMissing
        fun depositDate(depositDate: JsonField<LocalDate>) = apply {
            this.depositDate = depositDate
        }

        /** The amount of the paper item. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the paper item. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency of the paper item. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the paper item. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number on the paper item. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: String) =
            accountNumberSafe(JsonField.of(accountNumberSafe))

        /** The last 4 digits of the account_number. */
        @JsonProperty("account_number_safe")
        @ExcludeMissing
        fun accountNumberSafe(accountNumberSafe: JsonField<String>) = apply {
            this.accountNumberSafe = accountNumberSafe
        }

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number on the paper item. */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number on the paper item. */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: String) = remitterName(JsonField.of(remitterName))

        /** The name of the remitter on the paper item. */
        @JsonProperty("remitter_name")
        @ExcludeMissing
        fun remitterName(remitterName: JsonField<String>) = apply {
            this.remitterName = remitterName
        }

        /** The memo field on the paper item. */
        fun memoField(memoField: String) = memoField(JsonField.of(memoField))

        /** The memo field on the paper item. */
        @JsonProperty("memo_field")
        @ExcludeMissing
        fun memoField(memoField: JsonField<String>) = apply { this.memoField = memoField }

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

        fun build(): PaperItem =
            PaperItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                transactionLineItemId,
                transactionId,
                status,
                lockboxNumber,
                depositDate,
                amount,
                currency,
                accountNumber,
                accountNumberSafe,
                routingNumber,
                checkNumber,
                remitterName,
                memoField,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItem && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && transactionLineItemId == other.transactionLineItemId && transactionId == other.transactionId && status == other.status && lockboxNumber == other.lockboxNumber && depositDate == other.depositDate && amount == other.amount && currency == other.currency && accountNumber == other.accountNumber && accountNumberSafe == other.accountNumberSafe && routingNumber == other.routingNumber && checkNumber == other.checkNumber && remitterName == other.remitterName && memoField == other.memoField && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, transactionLineItemId, transactionId, status, lockboxNumber, depositDate, amount, currency, accountNumber, accountNumberSafe, routingNumber, checkNumber, remitterName, memoField, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaperItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, transactionLineItemId=$transactionLineItemId, transactionId=$transactionId, status=$status, lockboxNumber=$lockboxNumber, depositDate=$depositDate, amount=$amount, currency=$currency, accountNumber=$accountNumber, accountNumberSafe=$accountNumberSafe, routingNumber=$routingNumber, checkNumber=$checkNumber, remitterName=$remitterName, memoField=$memoField, additionalProperties=$additionalProperties}"
}
