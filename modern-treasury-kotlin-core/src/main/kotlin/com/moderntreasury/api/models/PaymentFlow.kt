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

@JsonDeserialize(builder = PaymentFlow.Builder::class)
@NoAutoDetect
class PaymentFlow
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val clientToken: JsonField<String>,
    private val status: JsonField<Status>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val counterpartyId: JsonField<String>,
    private val receivingAccountId: JsonField<String>,
    private val originatingAccountId: JsonField<String>,
    private val paymentOrderId: JsonField<String>,
    private val effectiveDateSelectionEnabled: JsonField<Boolean>,
    private val dueDate: JsonField<LocalDate>,
    private val selectedEffectiveDate: JsonField<LocalDate>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String? = id.getNullable("id")

    fun object_(): String? = object_.getNullable("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * The client token of the payment flow. This token can be used to embed a payment workflow in
     * your client-side application.
     */
    fun clientToken(): String? = clientToken.getNullable("client_token")

    /**
     * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
     * `cancelled`.
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    fun amount(): Long? = amount.getNullable("amount")

    /** The currency of the payment. */
    fun currency(): String? = currency.getNullable("currency")

    /**
     * Describes the direction money is flowing in the transaction. Can only be `debit`. A `debit`
     * pulls money from someone else's account to your own.
     */
    fun direction(): Direction? = direction.getNullable("direction")

    /**
     * The ID of a counterparty associated with the payment. As part of the payment workflow an
     * external account will be associated with this counterparty.
     */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    /** If present, the ID of the external account created using this flow. */
    fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

    /** The ID of one of your organization's internal accounts. */
    fun originatingAccountId(): String? = originatingAccountId.getNullable("originating_account_id")

    /** If present, the ID of the payment order created using this flow. */
    fun paymentOrderId(): String? = paymentOrderId.getNullable("payment_order_id")

    /**
     * When `true`, your end-user can schedule the payment `effective_date` while completing the
     * pre-built UI.
     */
    fun effectiveDateSelectionEnabled(): Boolean? =
        effectiveDateSelectionEnabled.getNullable("effective_date_selection_enabled")

    /**
     * The due date for the flow. Can only be passed in when `effective_date_selection_enabled` is
     * `true`.
     */
    fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

    /**
     * This field is set after your end-user selects a payment date while completing the pre-built
     * UI. This field is always `null` unless `effective_date_selection_enabled` is `true`.
     */
    fun selectedEffectiveDate(): LocalDate? =
        selectedEffectiveDate.getNullable("selected_effective_date")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The client token of the payment flow. This token can be used to embed a payment workflow in
     * your client-side application.
     */
    @JsonProperty("client_token") @ExcludeMissing fun _clientToken() = clientToken

    /**
     * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
     * `cancelled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * Describes the direction money is flowing in the transaction. Can only be `debit`. A `debit`
     * pulls money from someone else's account to your own.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * The ID of a counterparty associated with the payment. As part of the payment workflow an
     * external account will be associated with this counterparty.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** If present, the ID of the external account created using this flow. */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId() = receivingAccountId

    /** The ID of one of your organization's internal accounts. */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId() = originatingAccountId

    /** If present, the ID of the payment order created using this flow. */
    @JsonProperty("payment_order_id") @ExcludeMissing fun _paymentOrderId() = paymentOrderId

    /**
     * When `true`, your end-user can schedule the payment `effective_date` while completing the
     * pre-built UI.
     */
    @JsonProperty("effective_date_selection_enabled")
    @ExcludeMissing
    fun _effectiveDateSelectionEnabled() = effectiveDateSelectionEnabled

    /**
     * The due date for the flow. Can only be passed in when `effective_date_selection_enabled` is
     * `true`.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate() = dueDate

    /**
     * This field is set after your end-user selects a payment date while completing the pre-built
     * UI. This field is always `null` unless `effective_date_selection_enabled` is `true`.
     */
    @JsonProperty("selected_effective_date")
    @ExcludeMissing
    fun _selectedEffectiveDate() = selectedEffectiveDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PaymentFlow = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            clientToken()
            status()
            amount()
            currency()
            direction()
            counterpartyId()
            receivingAccountId()
            originatingAccountId()
            paymentOrderId()
            effectiveDateSelectionEnabled()
            dueDate()
            selectedEffectiveDate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentFlow &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.clientToken == other.clientToken &&
            this.status == other.status &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.direction == other.direction &&
            this.counterpartyId == other.counterpartyId &&
            this.receivingAccountId == other.receivingAccountId &&
            this.originatingAccountId == other.originatingAccountId &&
            this.paymentOrderId == other.paymentOrderId &&
            this.effectiveDateSelectionEnabled == other.effectiveDateSelectionEnabled &&
            this.dueDate == other.dueDate &&
            this.selectedEffectiveDate == other.selectedEffectiveDate &&
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
                    clientToken,
                    status,
                    amount,
                    currency,
                    direction,
                    counterpartyId,
                    receivingAccountId,
                    originatingAccountId,
                    paymentOrderId,
                    effectiveDateSelectionEnabled,
                    dueDate,
                    selectedEffectiveDate,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PaymentFlow{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, clientToken=$clientToken, status=$status, amount=$amount, currency=$currency, direction=$direction, counterpartyId=$counterpartyId, receivingAccountId=$receivingAccountId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, effectiveDateSelectionEnabled=$effectiveDateSelectionEnabled, dueDate=$dueDate, selectedEffectiveDate=$selectedEffectiveDate, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var receivingAccountId: JsonField<String> = JsonMissing.of()
        private var originatingAccountId: JsonField<String> = JsonMissing.of()
        private var paymentOrderId: JsonField<String> = JsonMissing.of()
        private var effectiveDateSelectionEnabled: JsonField<Boolean> = JsonMissing.of()
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var selectedEffectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentFlow: PaymentFlow) = apply {
            this.id = paymentFlow.id
            this.object_ = paymentFlow.object_
            this.liveMode = paymentFlow.liveMode
            this.createdAt = paymentFlow.createdAt
            this.updatedAt = paymentFlow.updatedAt
            this.clientToken = paymentFlow.clientToken
            this.status = paymentFlow.status
            this.amount = paymentFlow.amount
            this.currency = paymentFlow.currency
            this.direction = paymentFlow.direction
            this.counterpartyId = paymentFlow.counterpartyId
            this.receivingAccountId = paymentFlow.receivingAccountId
            this.originatingAccountId = paymentFlow.originatingAccountId
            this.paymentOrderId = paymentFlow.paymentOrderId
            this.effectiveDateSelectionEnabled = paymentFlow.effectiveDateSelectionEnabled
            this.dueDate = paymentFlow.dueDate
            this.selectedEffectiveDate = paymentFlow.selectedEffectiveDate
            additionalProperties(paymentFlow.additionalProperties)
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
         * The client token of the payment flow. This token can be used to embed a payment workflow
         * in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * The client token of the payment flow. This token can be used to embed a payment workflow
         * in your client-side application.
         */
        @JsonProperty("client_token")
        @ExcludeMissing
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        /**
         * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
         * `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
         * `cancelled`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the payment. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Describes the direction money is flowing in the transaction. Can only be `debit`. A
         * `debit` pulls money from someone else's account to your own.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Describes the direction money is flowing in the transaction. Can only be `debit`. A
         * `debit` pulls money from someone else's account to your own.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * The ID of a counterparty associated with the payment. As part of the payment workflow an
         * external account will be associated with this counterparty.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * The ID of a counterparty associated with the payment. As part of the payment workflow an
         * external account will be associated with this counterparty.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** If present, the ID of the external account created using this flow. */
        fun receivingAccountId(receivingAccountId: String) =
            receivingAccountId(JsonField.of(receivingAccountId))

        /** If present, the ID of the external account created using this flow. */
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /** The ID of one of your organization's internal accounts. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** If present, the ID of the payment order created using this flow. */
        fun paymentOrderId(paymentOrderId: String) = paymentOrderId(JsonField.of(paymentOrderId))

        /** If present, the ID of the payment order created using this flow. */
        @JsonProperty("payment_order_id")
        @ExcludeMissing
        fun paymentOrderId(paymentOrderId: JsonField<String>) = apply {
            this.paymentOrderId = paymentOrderId
        }

        /**
         * When `true`, your end-user can schedule the payment `effective_date` while completing the
         * pre-built UI.
         */
        fun effectiveDateSelectionEnabled(effectiveDateSelectionEnabled: Boolean) =
            effectiveDateSelectionEnabled(JsonField.of(effectiveDateSelectionEnabled))

        /**
         * When `true`, your end-user can schedule the payment `effective_date` while completing the
         * pre-built UI.
         */
        @JsonProperty("effective_date_selection_enabled")
        @ExcludeMissing
        fun effectiveDateSelectionEnabled(effectiveDateSelectionEnabled: JsonField<Boolean>) =
            apply {
                this.effectiveDateSelectionEnabled = effectiveDateSelectionEnabled
            }

        /**
         * The due date for the flow. Can only be passed in when `effective_date_selection_enabled`
         * is `true`.
         */
        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * The due date for the flow. Can only be passed in when `effective_date_selection_enabled`
         * is `true`.
         */
        @JsonProperty("due_date")
        @ExcludeMissing
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

        /**
         * This field is set after your end-user selects a payment date while completing the
         * pre-built UI. This field is always `null` unless `effective_date_selection_enabled` is
         * `true`.
         */
        fun selectedEffectiveDate(selectedEffectiveDate: LocalDate) =
            selectedEffectiveDate(JsonField.of(selectedEffectiveDate))

        /**
         * This field is set after your end-user selects a payment date while completing the
         * pre-built UI. This field is always `null` unless `effective_date_selection_enabled` is
         * `true`.
         */
        @JsonProperty("selected_effective_date")
        @ExcludeMissing
        fun selectedEffectiveDate(selectedEffectiveDate: JsonField<LocalDate>) = apply {
            this.selectedEffectiveDate = selectedEffectiveDate
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

        fun build(): PaymentFlow =
            PaymentFlow(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                clientToken,
                status,
                amount,
                currency,
                direction,
                counterpartyId,
                receivingAccountId,
                originatingAccountId,
                paymentOrderId,
                effectiveDateSelectionEnabled,
                dueDate,
                selectedEffectiveDate,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = Direction(JsonField.of("credit"))

            val DEBIT = Direction(JsonField.of("debit"))

            fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
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

            val CANCELLED = Status(JsonField.of("cancelled"))

            val COMPLETED = Status(JsonField.of("completed"))

            val EXPIRED = Status(JsonField.of("expired"))

            val PENDING = Status(JsonField.of("pending"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
        }

        enum class Value {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
