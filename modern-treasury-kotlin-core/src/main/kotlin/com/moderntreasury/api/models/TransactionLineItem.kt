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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = TransactionLineItem.Builder::class)
@NoAutoDetect
class TransactionLineItem
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val transactableType: JsonField<TransactableType>,
    private val transactableId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val description: JsonField<String>,
    private val counterpartyId: JsonField<String>,
    private val expectedPaymentId: JsonField<String>,
    private val transactionId: JsonField<String>,
    private val reconcilable: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    fun transactableType(): TransactableType? = transactableType.getNullable("transactable_type")

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    fun transactableId(): String? = transactableId.getNullable("transactable_id")

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    fun description(): String = description.getRequired("description")

    /** The ID for the counterparty for this transaction line item. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    fun expectedPaymentId(): String? = expectedPaymentId.getNullable("expected_payment_id")

    /** The ID of the parent transaction. */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    fun reconcilable(): Boolean = reconcilable.getRequired("reconcilable")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_type") @ExcludeMissing fun _transactableType() = transactableType

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_id") @ExcludeMissing fun _transactableId() = transactableId

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The ID for the counterparty for this transaction line item. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    fun _expectedPaymentId() = expectedPaymentId

    /** The ID of the parent transaction. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    @JsonProperty("reconcilable") @ExcludeMissing fun _reconcilable() = reconcilable

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TransactionLineItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            type()
            transactableType()
            transactableId()
            amount()
            description()
            counterpartyId()
            expectedPaymentId()
            transactionId()
            reconcilable()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionLineItem &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.type == other.type &&
            this.transactableType == other.transactableType &&
            this.transactableId == other.transactableId &&
            this.amount == other.amount &&
            this.description == other.description &&
            this.counterpartyId == other.counterpartyId &&
            this.expectedPaymentId == other.expectedPaymentId &&
            this.transactionId == other.transactionId &&
            this.reconcilable == other.reconcilable &&
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
                    discardedAt,
                    type,
                    transactableType,
                    transactableId,
                    amount,
                    description,
                    counterpartyId,
                    expectedPaymentId,
                    transactionId,
                    reconcilable,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TransactionLineItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, type=$type, transactableType=$transactableType, transactableId=$transactableId, amount=$amount, description=$description, counterpartyId=$counterpartyId, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, reconcilable=$reconcilable, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var transactableType: JsonField<TransactableType> = JsonMissing.of()
        private var transactableId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var expectedPaymentId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var reconcilable: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionLineItem: TransactionLineItem) = apply {
            this.id = transactionLineItem.id
            this.object_ = transactionLineItem.object_
            this.liveMode = transactionLineItem.liveMode
            this.createdAt = transactionLineItem.createdAt
            this.updatedAt = transactionLineItem.updatedAt
            this.discardedAt = transactionLineItem.discardedAt
            this.type = transactionLineItem.type
            this.transactableType = transactionLineItem.transactableType
            this.transactableId = transactionLineItem.transactableId
            this.amount = transactionLineItem.amount
            this.description = transactionLineItem.description
            this.counterpartyId = transactionLineItem.counterpartyId
            this.expectedPaymentId = transactionLineItem.expectedPaymentId
            this.transactionId = transactionLineItem.transactionId
            this.reconcilable = transactionLineItem.reconcilable
            additionalProperties(transactionLineItem.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment, or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment, or false if it
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

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * Indicates whether the line item is `originating` or `receiving` (see
         * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Indicates whether the line item is `originating` or `receiving` (see
         * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: TransactableType) =
            transactableType(JsonField.of(transactableType))

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        @JsonProperty("transactable_type")
        @ExcludeMissing
        fun transactableType(transactableType: JsonField<TransactableType>) = apply {
            this.transactableType = transactableType
        }

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: String) = transactableId(JsonField.of(transactableId))

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        @JsonProperty("transactable_id")
        @ExcludeMissing
        fun transactableId(transactableId: JsonField<String>) = apply {
            this.transactableId = transactableId
        }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If no matching object is found, `description` will be a free-form text field describing
         * the line item. This field may contain personally identifiable information (PII) and is
         * not included in API responses by default. Learn more about changing your settings at
         * https://docs.moderntreasury.com/reference/personally-identifiable-information.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * If no matching object is found, `description` will be a free-form text field describing
         * the line item. This field may contain personally identifiable information (PII) and is
         * not included in API responses by default. Learn more about changing your settings at
         * https://docs.moderntreasury.com/reference/personally-identifiable-information.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID for the counterparty for this transaction line item. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID for the counterparty for this transaction line item. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String) =
            expectedPaymentId(JsonField.of(expectedPaymentId))

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        @JsonProperty("expected_payment_id")
        @ExcludeMissing
        fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the parent transaction. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: Boolean) = reconcilable(JsonField.of(reconcilable))

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        @JsonProperty("reconcilable")
        @ExcludeMissing
        fun reconcilable(reconcilable: JsonField<Boolean>) = apply {
            this.reconcilable = reconcilable
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

        fun build(): TransactionLineItem =
            TransactionLineItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                type,
                transactableType,
                transactableId,
                amount,
                description,
                counterpartyId,
                expectedPaymentId,
                transactionId,
                reconcilable,
                additionalProperties.toUnmodifiable(),
            )
    }

    class TransactableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INCOMING_PAYMENT_DETAIL = TransactableType(JsonField.of("incoming_payment_detail"))

            val PAPER_ITEM = TransactableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = TransactableType(JsonField.of("payment_order"))

            val PAYMENT_ORDER_ATTEMPT = TransactableType(JsonField.of("payment_order_attempt"))

            val RETURN = TransactableType(JsonField.of("return"))

            val REVERSAL = TransactableType(JsonField.of("reversal"))

            fun of(value: String) = TransactableType(JsonField.of(value))
        }

        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown TransactableType: $value")
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

            val ORIGINATING = Type(JsonField.of("originating"))

            val RECEIVING = Type(JsonField.of("receiving"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ORIGINATING,
            RECEIVING,
        }

        enum class Value {
            ORIGINATING,
            RECEIVING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
