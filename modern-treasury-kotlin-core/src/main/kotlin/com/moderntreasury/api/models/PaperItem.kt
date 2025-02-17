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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PaperItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    private val accountNumberSafe: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("check_number")
    @ExcludeMissing
    private val checkNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("deposit_date")
    @ExcludeMissing
    private val depositDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("lockbox_number")
    @ExcludeMissing
    private val lockboxNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo_field")
    @ExcludeMissing
    private val memoField: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("remitter_name")
    @ExcludeMissing
    private val remitterName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    private val transactionLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The account number on the paper item. */
    fun accountNumber(): String? = accountNumber.getNullable("account_number")

    /** The last 4 digits of the account_number. */
    fun accountNumberSafe(): String? = accountNumberSafe.getNullable("account_number_safe")

    /** The amount of the paper item. */
    fun amount(): Long = amount.getRequired("amount")

    /** The check number on the paper item. */
    fun checkNumber(): String? = checkNumber.getNullable("check_number")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The currency of the paper item. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The date the paper item was deposited into your organization's bank account. */
    fun depositDate(): LocalDate = depositDate.getRequired("deposit_date")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** The identifier for the lockbox assigned by the bank. */
    fun lockboxNumber(): String = lockboxNumber.getRequired("lockbox_number")

    /** The memo field on the paper item. */
    fun memoField(): String? = memoField.getNullable("memo_field")

    fun object_(): String = object_.getRequired("object")

    /** The name of the remitter on the paper item. */
    fun remitterName(): String? = remitterName.getNullable("remitter_name")

    /** The routing number on the paper item. */
    fun routingNumber(): String? = routingNumber.getNullable("routing_number")

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the reconciled Transaction or `null`. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** The ID of the reconciled Transaction Line Item or `null`. */
    fun transactionLineItemId(): String? =
        transactionLineItemId.getNullable("transaction_line_item_id")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The account number on the paper item. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /** The last 4 digits of the account_number. */
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    fun _accountNumberSafe(): JsonField<String> = accountNumberSafe

    /** The amount of the paper item. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The check number on the paper item. */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The currency of the paper item. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The date the paper item was deposited into your organization's bank account. */
    @JsonProperty("deposit_date")
    @ExcludeMissing
    fun _depositDate(): JsonField<LocalDate> = depositDate

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** The identifier for the lockbox assigned by the bank. */
    @JsonProperty("lockbox_number")
    @ExcludeMissing
    fun _lockboxNumber(): JsonField<String> = lockboxNumber

    /** The memo field on the paper item. */
    @JsonProperty("memo_field") @ExcludeMissing fun _memoField(): JsonField<String> = memoField

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /** The name of the remitter on the paper item. */
    @JsonProperty("remitter_name")
    @ExcludeMissing
    fun _remitterName(): JsonField<String> = remitterName

    /** The routing number on the paper item. */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The ID of the reconciled Transaction or `null`. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /** The ID of the reconciled Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaperItem = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumber()
        accountNumberSafe()
        amount()
        checkNumber()
        createdAt()
        currency()
        depositDate()
        liveMode()
        lockboxNumber()
        memoField()
        object_()
        remitterName()
        routingNumber()
        status()
        transactionId()
        transactionLineItemId()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [PaperItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var accountNumberSafe: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var checkNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var depositDate: JsonField<LocalDate>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var lockboxNumber: JsonField<String>? = null
        private var memoField: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var remitterName: JsonField<String>? = null
        private var routingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paperItem: PaperItem) = apply {
            id = paperItem.id
            accountNumber = paperItem.accountNumber
            accountNumberSafe = paperItem.accountNumberSafe
            amount = paperItem.amount
            checkNumber = paperItem.checkNumber
            createdAt = paperItem.createdAt
            currency = paperItem.currency
            depositDate = paperItem.depositDate
            liveMode = paperItem.liveMode
            lockboxNumber = paperItem.lockboxNumber
            memoField = paperItem.memoField
            object_ = paperItem.object_
            remitterName = paperItem.remitterName
            routingNumber = paperItem.routingNumber
            status = paperItem.status
            transactionId = paperItem.transactionId
            transactionLineItemId = paperItem.transactionLineItemId
            updatedAt = paperItem.updatedAt
            additionalProperties = paperItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: String?) =
            accountNumber(JsonField.ofNullable(accountNumber))

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: String?) =
            accountNumberSafe(JsonField.ofNullable(accountNumberSafe))

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: JsonField<String>) = apply {
            this.accountNumberSafe = accountNumberSafe
        }

        /** The amount of the paper item. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the paper item. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: String?) = checkNumber(JsonField.ofNullable(checkNumber))

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the paper item. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the paper item. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: LocalDate) = depositDate(JsonField.of(depositDate))

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: JsonField<LocalDate>) = apply {
            this.depositDate = depositDate
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

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: String) = lockboxNumber(JsonField.of(lockboxNumber))

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: JsonField<String>) = apply {
            this.lockboxNumber = lockboxNumber
        }

        /** The memo field on the paper item. */
        fun memoField(memoField: String?) = memoField(JsonField.ofNullable(memoField))

        /** The memo field on the paper item. */
        fun memoField(memoField: JsonField<String>) = apply { this.memoField = memoField }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: String?) = remitterName(JsonField.ofNullable(remitterName))

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: JsonField<String>) = apply {
            this.remitterName = remitterName
        }

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: String?) =
            routingNumber(JsonField.ofNullable(routingNumber))

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): PaperItem =
            PaperItem(
                checkRequired("id", id),
                checkRequired("accountNumber", accountNumber),
                checkRequired("accountNumberSafe", accountNumberSafe),
                checkRequired("amount", amount),
                checkRequired("checkNumber", checkNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("depositDate", depositDate),
                checkRequired("liveMode", liveMode),
                checkRequired("lockboxNumber", lockboxNumber),
                checkRequired("memoField", memoField),
                checkRequired("object_", object_),
                checkRequired("remitterName", remitterName),
                checkRequired("routingNumber", routingNumber),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("transactionLineItemId", transactionLineItemId),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
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

            val COMPLETED = of("completed")

            val PENDING = of("pending")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
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
            COMPLETED,
            PENDING,
            RETURNED,
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
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItem && id == other.id && accountNumber == other.accountNumber && accountNumberSafe == other.accountNumberSafe && amount == other.amount && checkNumber == other.checkNumber && createdAt == other.createdAt && currency == other.currency && depositDate == other.depositDate && liveMode == other.liveMode && lockboxNumber == other.lockboxNumber && memoField == other.memoField && object_ == other.object_ && remitterName == other.remitterName && routingNumber == other.routingNumber && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountNumber, accountNumberSafe, amount, checkNumber, createdAt, currency, depositDate, liveMode, lockboxNumber, memoField, object_, remitterName, routingNumber, status, transactionId, transactionLineItemId, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaperItem{id=$id, accountNumber=$accountNumber, accountNumberSafe=$accountNumberSafe, amount=$amount, checkNumber=$checkNumber, createdAt=$createdAt, currency=$currency, depositDate=$depositDate, liveMode=$liveMode, lockboxNumber=$lockboxNumber, memoField=$memoField, object_=$object_, remitterName=$remitterName, routingNumber=$routingNumber, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
