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
    private val externalAccountCollection: JsonField<ExternalAccountCollection>,
    private val existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter>,
    private val additionalProperties: Map<String, JsonValue>,
) {

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

    /**
     * When `enabled`, your end-user can select from an existing external account when completing
     * the flow. When `disabled`, your end-user must add new payment details when completing the
     * flow.
     */
    fun externalAccountCollection(): ExternalAccountCollection? =
        externalAccountCollection.getNullable("external_account_collection")

    /**
     * When `verified` and `external_account_collection` is `enabled`, filters the list of external
     * accounts your end-user can select to those with a `verification_status` of `verified`.
     */
    fun existingExternalAccountsFilter(): ExistingExternalAccountsFilter? =
        existingExternalAccountsFilter.getNullable("existing_external_accounts_filter")

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

    /**
     * When `enabled`, your end-user can select from an existing external account when completing
     * the flow. When `disabled`, your end-user must add new payment details when completing the
     * flow.
     */
    @JsonProperty("external_account_collection")
    @ExcludeMissing
    fun _externalAccountCollection() = externalAccountCollection

    /**
     * When `verified` and `external_account_collection` is `enabled`, filters the list of external
     * accounts your end-user can select to those with a `verification_status` of `verified`.
     */
    @JsonProperty("existing_external_accounts_filter")
    @ExcludeMissing
    fun _existingExternalAccountsFilter() = existingExternalAccountsFilter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
            externalAccountCollection()
            existingExternalAccountsFilter()
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
        private var externalAccountCollection: JsonField<ExternalAccountCollection> =
            JsonMissing.of()
        private var existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentFlow: PaymentFlow) = apply {
            id = paymentFlow.id
            object_ = paymentFlow.object_
            liveMode = paymentFlow.liveMode
            createdAt = paymentFlow.createdAt
            updatedAt = paymentFlow.updatedAt
            clientToken = paymentFlow.clientToken
            status = paymentFlow.status
            amount = paymentFlow.amount
            currency = paymentFlow.currency
            direction = paymentFlow.direction
            counterpartyId = paymentFlow.counterpartyId
            receivingAccountId = paymentFlow.receivingAccountId
            originatingAccountId = paymentFlow.originatingAccountId
            paymentOrderId = paymentFlow.paymentOrderId
            effectiveDateSelectionEnabled = paymentFlow.effectiveDateSelectionEnabled
            dueDate = paymentFlow.dueDate
            selectedEffectiveDate = paymentFlow.selectedEffectiveDate
            externalAccountCollection = paymentFlow.externalAccountCollection
            existingExternalAccountsFilter = paymentFlow.existingExternalAccountsFilter
            additionalProperties = paymentFlow.additionalProperties.toMutableMap()
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

        /**
         * When `enabled`, your end-user can select from an existing external account when
         * completing the flow. When `disabled`, your end-user must add new payment details when
         * completing the flow.
         */
        fun externalAccountCollection(externalAccountCollection: ExternalAccountCollection) =
            externalAccountCollection(JsonField.of(externalAccountCollection))

        /**
         * When `enabled`, your end-user can select from an existing external account when
         * completing the flow. When `disabled`, your end-user must add new payment details when
         * completing the flow.
         */
        @JsonProperty("external_account_collection")
        @ExcludeMissing
        fun externalAccountCollection(
            externalAccountCollection: JsonField<ExternalAccountCollection>
        ) = apply { this.externalAccountCollection = externalAccountCollection }

        /**
         * When `verified` and `external_account_collection` is `enabled`, filters the list of
         * external accounts your end-user can select to those with a `verification_status` of
         * `verified`.
         */
        fun existingExternalAccountsFilter(
            existingExternalAccountsFilter: ExistingExternalAccountsFilter
        ) = existingExternalAccountsFilter(JsonField.of(existingExternalAccountsFilter))

        /**
         * When `verified` and `external_account_collection` is `enabled`, filters the list of
         * external accounts your end-user can select to those with a `verification_status` of
         * `verified`.
         */
        @JsonProperty("existing_external_accounts_filter")
        @ExcludeMissing
        fun existingExternalAccountsFilter(
            existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter>
        ) = apply { this.existingExternalAccountsFilter = existingExternalAccountsFilter }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                externalAccountCollection,
                existingExternalAccountsFilter,
                additionalProperties.toImmutable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CREDIT = of("credit")

            val DEBIT = of("debit")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExistingExternalAccountsFilter
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val VERIFIED = of("verified")

            fun of(value: String) = ExistingExternalAccountsFilter(JsonField.of(value))
        }

        enum class Known {
            VERIFIED,
        }

        enum class Value {
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ExistingExternalAccountsFilter: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExistingExternalAccountsFilter && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalAccountCollection
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DISABLED = of("disabled")

            val ENABLED = of("enabled")

            fun of(value: String) = ExternalAccountCollection(JsonField.of(value))
        }

        enum class Known {
            DISABLED,
            ENABLED,
        }

        enum class Value {
            DISABLED,
            ENABLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DISABLED -> Value.DISABLED
                ENABLED -> Value.ENABLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DISABLED -> Known.DISABLED
                ENABLED -> Known.ENABLED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ExternalAccountCollection: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountCollection && value == other.value /* spotless:on */
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

            val CANCELLED = of("cancelled")

            val COMPLETED = of("completed")

            val EXPIRED = of("expired")

            val PENDING = of("pending")

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

        return /* spotless:off */ other is PaymentFlow && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && clientToken == other.clientToken && status == other.status && amount == other.amount && currency == other.currency && direction == other.direction && counterpartyId == other.counterpartyId && receivingAccountId == other.receivingAccountId && originatingAccountId == other.originatingAccountId && paymentOrderId == other.paymentOrderId && effectiveDateSelectionEnabled == other.effectiveDateSelectionEnabled && dueDate == other.dueDate && selectedEffectiveDate == other.selectedEffectiveDate && externalAccountCollection == other.externalAccountCollection && existingExternalAccountsFilter == other.existingExternalAccountsFilter && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, clientToken, status, amount, currency, direction, counterpartyId, receivingAccountId, originatingAccountId, paymentOrderId, effectiveDateSelectionEnabled, dueDate, selectedEffectiveDate, externalAccountCollection, existingExternalAccountsFilter, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentFlow{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, clientToken=$clientToken, status=$status, amount=$amount, currency=$currency, direction=$direction, counterpartyId=$counterpartyId, receivingAccountId=$receivingAccountId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, effectiveDateSelectionEnabled=$effectiveDateSelectionEnabled, dueDate=$dueDate, selectedEffectiveDate=$selectedEffectiveDate, externalAccountCollection=$externalAccountCollection, existingExternalAccountsFilter=$existingExternalAccountsFilter, additionalProperties=$additionalProperties}"
}
