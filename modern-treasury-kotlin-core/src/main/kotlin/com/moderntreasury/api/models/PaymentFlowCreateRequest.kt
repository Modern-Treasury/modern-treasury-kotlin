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
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class PaymentFlowCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val counterpartyId: JsonField<String>,
    private val currency: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val originatingAccountId: JsonField<String>,
    private val dueDate: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("due_date") @ExcludeMissing dueDate: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        amount,
        counterpartyId,
        currency,
        direction,
        originatingAccountId,
        dueDate,
        mutableMapOf(),
    )

    /**
     * Required. Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     * Can be any integer up to 36 digits.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * Required. The ID of a counterparty associated with the payment. As part of the payment
     * workflow an external account will be associated with this model.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /**
     * Required. The currency of the payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Required. Describes the direction money is flowing in the transaction. Can only be `debit`. A
     * `debit` pulls money from someone else's account to your own.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * Required. The ID of one of your organization's internal accounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /**
     * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When set,
     * the due date is shown to your end-user in the pre-built UI as they are selecting a payment
     * `effective_date`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId(): JsonField<String> = originatingAccountId

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<LocalDate> = dueDate

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
         * Returns a mutable builder for constructing an instance of [PaymentFlowCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .counterpartyId()
         * .currency()
         * .direction()
         * .originatingAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentFlowCreateRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var counterpartyId: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var originatingAccountId: JsonField<String>? = null
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentFlowCreateRequest: PaymentFlowCreateRequest) = apply {
            amount = paymentFlowCreateRequest.amount
            counterpartyId = paymentFlowCreateRequest.counterpartyId
            currency = paymentFlowCreateRequest.currency
            direction = paymentFlowCreateRequest.direction
            originatingAccountId = paymentFlowCreateRequest.originatingAccountId
            dueDate = paymentFlowCreateRequest.dueDate
            additionalProperties = paymentFlowCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Required. Value in specified currency's smallest unit. e.g. $10 would be represented
         * as 1000. Can be any integer up to 36 digits.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * Required. The ID of a counterparty associated with the payment. As part of the payment
         * workflow an external account will be associated with this model.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

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

        /** Required. The currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Required. Describes the direction money is flowing in the transaction. Can only be
         * `debit`. A `debit` pulls money from someone else's account to your own.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** Required. The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * Optional. Can only be passed in when `effective_date_selection_enabled` is `true`. When
         * set, the due date is shown to your end-user in the pre-built UI as they are selecting a
         * payment `effective_date`.
         */
        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

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
         * Returns an immutable instance of [PaymentFlowCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .counterpartyId()
         * .currency()
         * .direction()
         * .originatingAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentFlowCreateRequest =
            PaymentFlowCreateRequest(
                checkRequired("amount", amount),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("currency", currency),
                checkRequired("direction", direction),
                checkRequired("originatingAccountId", originatingAccountId),
                dueDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PaymentFlowCreateRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        counterpartyId()
        currency()
        direction().validate()
        originatingAccountId()
        dueDate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (amount.asKnown() == null) 0 else 1) +
            (if (counterpartyId.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (direction.asKnown()?.validity() ?: 0) +
            (if (originatingAccountId.asKnown() == null) 0 else 1) +
            (if (dueDate.asKnown() == null) 0 else 1)

    /**
     * Required. Describes the direction money is flowing in the transaction. Can only be `debit`. A
     * `debit` pulls money from someone else's account to your own.
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ModernTreasuryInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentFlowCreateRequest &&
            amount == other.amount &&
            counterpartyId == other.counterpartyId &&
            currency == other.currency &&
            direction == other.direction &&
            originatingAccountId == other.originatingAccountId &&
            dueDate == other.dueDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            counterpartyId,
            currency,
            direction,
            originatingAccountId,
            dueDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentFlowCreateRequest{amount=$amount, counterpartyId=$counterpartyId, currency=$currency, direction=$direction, originatingAccountId=$originatingAccountId, dueDate=$dueDate, additionalProperties=$additionalProperties}"
}
