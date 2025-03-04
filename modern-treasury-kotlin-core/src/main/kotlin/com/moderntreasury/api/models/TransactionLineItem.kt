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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class TransactionLineItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    private val expectedPaymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reconcilable")
    @ExcludeMissing
    private val reconcilable: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("transactable_id")
    @ExcludeMissing
    private val transactableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transactable_type")
    @ExcludeMissing
    private val transactableType: JsonField<TransactableType> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    fun amount(): Long = amount.getRequired("amount")

    /** The ID for the counterparty for this transaction line item. */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    fun description(): String = description.getRequired("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    fun expectedPaymentId(): String? = expectedPaymentId.getNullable("expected_payment_id")

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    fun reconcilable(): Boolean = reconcilable.getRequired("reconcilable")

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    fun transactableId(): String? = transactableId.getNullable("transactable_id")

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    fun transactableType(): TransactableType? = transactableType.getNullable("transactable_type")

    /** The ID of the parent transaction. */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    fun type(): Type = type.getRequired("type")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /** The ID for the counterparty for this transaction line item. */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    fun _expectedPaymentId(): JsonField<String> = expectedPaymentId

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    @JsonProperty("reconcilable")
    @ExcludeMissing
    fun _reconcilable(): JsonField<Boolean> = reconcilable

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_id")
    @ExcludeMissing
    fun _transactableId(): JsonField<String> = transactableId

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_type")
    @ExcludeMissing
    fun _transactableType(): JsonField<TransactableType> = transactableType

    /** The ID of the parent transaction. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionLineItem = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        counterpartyId()
        createdAt()
        description()
        discardedAt()
        expectedPaymentId()
        liveMode()
        object_()
        reconcilable()
        transactableId()
        transactableType()
        transactionId()
        type()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionLineItem].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .counterpartyId()
         * .createdAt()
         * .description()
         * .discardedAt()
         * .expectedPaymentId()
         * .liveMode()
         * .object_()
         * .reconcilable()
         * .transactableId()
         * .transactableType()
         * .transactionId()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransactionLineItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var expectedPaymentId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var reconcilable: JsonField<Boolean>? = null
        private var transactableId: JsonField<String>? = null
        private var transactableType: JsonField<TransactableType>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transactionLineItem: TransactionLineItem) = apply {
            id = transactionLineItem.id
            amount = transactionLineItem.amount
            counterpartyId = transactionLineItem.counterpartyId
            createdAt = transactionLineItem.createdAt
            description = transactionLineItem.description
            discardedAt = transactionLineItem.discardedAt
            expectedPaymentId = transactionLineItem.expectedPaymentId
            liveMode = transactionLineItem.liveMode
            object_ = transactionLineItem.object_
            reconcilable = transactionLineItem.reconcilable
            transactableId = transactionLineItem.transactableId
            transactableType = transactionLineItem.transactableType
            transactionId = transactionLineItem.transactionId
            type = transactionLineItem.type
            updatedAt = transactionLineItem.updatedAt
            additionalProperties = transactionLineItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The ID for the counterparty for this transaction line item. */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** The ID for the counterparty for this transaction line item. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String?) =
            expectedPaymentId(JsonField.ofNullable(expectedPaymentId))

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /**
         * This field will be true if this object exists in the live environment, or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment, or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: Boolean) = reconcilable(JsonField.of(reconcilable))

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: JsonField<Boolean>) = apply {
            this.reconcilable = reconcilable
        }

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: String?) =
            transactableId(JsonField.ofNullable(transactableId))

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: JsonField<String>) = apply {
            this.transactableId = transactableId
        }

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: TransactableType?) =
            transactableType(JsonField.ofNullable(transactableType))

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: JsonField<TransactableType>) = apply {
            this.transactableType = transactableType
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
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
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): TransactionLineItem =
            TransactionLineItem(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("expectedPaymentId", expectedPaymentId),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("reconcilable", reconcilable),
                checkRequired("transactableId", transactableId),
                checkRequired("transactableType", transactableType),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    class TransactableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val PAPER_ITEM = of("paper_item")

            val PAYMENT_ORDER = of("payment_order")

            val PAYMENT_ORDER_ATTEMPT = of("payment_order_attempt")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

            fun of(value: String) = TransactableType(JsonField.of(value))
        }

        /** An enum containing [TransactableType]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        /**
         * An enum containing [TransactableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            /**
             * An enum member indicating that [TransactableType] was instantiated with an unknown
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
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
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
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown TransactableType: $value")
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

            return /* spotless:off */ other is TransactableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
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

            val ORIGINATING = of("originating")

            val RECEIVING = of("receiving")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ORIGINATING,
            RECEIVING,
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
            ORIGINATING,
            RECEIVING,
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
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
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
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItem && id == other.id && amount == other.amount && counterpartyId == other.counterpartyId && createdAt == other.createdAt && description == other.description && discardedAt == other.discardedAt && expectedPaymentId == other.expectedPaymentId && liveMode == other.liveMode && object_ == other.object_ && reconcilable == other.reconcilable && transactableId == other.transactableId && transactableType == other.transactableType && transactionId == other.transactionId && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, counterpartyId, createdAt, description, discardedAt, expectedPaymentId, liveMode, object_, reconcilable, transactableId, transactableType, transactionId, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionLineItem{id=$id, amount=$amount, counterpartyId=$counterpartyId, createdAt=$createdAt, description=$description, discardedAt=$discardedAt, expectedPaymentId=$expectedPaymentId, liveMode=$liveMode, object_=$object_, reconcilable=$reconcilable, transactableId=$transactableId, transactableType=$transactableType, transactionId=$transactionId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
