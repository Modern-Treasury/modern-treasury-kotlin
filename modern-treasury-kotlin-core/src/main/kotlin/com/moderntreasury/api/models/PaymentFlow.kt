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
class PaymentFlow
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("client_token")
    @ExcludeMissing
    private val clientToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<Direction> = JsonMissing.of(),
    @JsonProperty("due_date")
    @ExcludeMissing
    private val dueDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("effective_date_selection_enabled")
    @ExcludeMissing
    private val effectiveDateSelectionEnabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("existing_external_accounts_filter")
    @ExcludeMissing
    private val existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter> =
        JsonMissing.of(),
    @JsonProperty("external_account_collection")
    @ExcludeMissing
    private val externalAccountCollection: JsonField<ExternalAccountCollection> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    private val originatingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_order_id")
    @ExcludeMissing
    private val paymentOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    private val receivingAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("selected_effective_date")
    @ExcludeMissing
    private val selectedEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String? = id.getNullable("id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    fun amount(): Long? = amount.getNullable("amount")

    /**
     * The client token of the payment flow. This token can be used to embed a payment workflow in
     * your client-side application.
     */
    fun clientToken(): String? = clientToken.getNullable("client_token")

    /**
     * The ID of a counterparty associated with the payment. As part of the payment workflow an
     * external account will be associated with this counterparty.
     */
    fun counterpartyId(): String? = counterpartyId.getNullable("counterparty_id")

    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /** The currency of the payment. */
    fun currency(): String? = currency.getNullable("currency")

    /**
     * Describes the direction money is flowing in the transaction. Can only be `debit`. A `debit`
     * pulls money from someone else's account to your own.
     */
    fun direction(): Direction? = direction.getNullable("direction")

    /**
     * The due date for the flow. Can only be passed in when `effective_date_selection_enabled` is
     * `true`.
     */
    fun dueDate(): LocalDate? = dueDate.getNullable("due_date")

    /**
     * When `true`, your end-user can schedule the payment `effective_date` while completing the
     * pre-built UI.
     */
    fun effectiveDateSelectionEnabled(): Boolean? =
        effectiveDateSelectionEnabled.getNullable("effective_date_selection_enabled")

    /**
     * When `verified` and `external_account_collection` is `enabled`, filters the list of external
     * accounts your end-user can select to those with a `verification_status` of `verified`.
     */
    fun existingExternalAccountsFilter(): ExistingExternalAccountsFilter? =
        existingExternalAccountsFilter.getNullable("existing_external_accounts_filter")

    /**
     * When `enabled`, your end-user can select from an existing external account when completing
     * the flow. When `disabled`, your end-user must add new payment details when completing the
     * flow.
     */
    fun externalAccountCollection(): ExternalAccountCollection? =
        externalAccountCollection.getNullable("external_account_collection")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean? = liveMode.getNullable("live_mode")

    fun object_(): String? = object_.getNullable("object")

    /** The ID of one of your organization's internal accounts. */
    fun originatingAccountId(): String? = originatingAccountId.getNullable("originating_account_id")

    /** If present, the ID of the payment order created using this flow. */
    fun paymentOrderId(): String? = paymentOrderId.getNullable("payment_order_id")

    /** If present, the ID of the external account created using this flow. */
    fun receivingAccountId(): String? = receivingAccountId.getNullable("receiving_account_id")

    /**
     * This field is set after your end-user selects a payment date while completing the pre-built
     * UI. This field is always `null` unless `effective_date_selection_enabled` is `true`.
     */
    fun selectedEffectiveDate(): LocalDate? =
        selectedEffectiveDate.getNullable("selected_effective_date")

    /**
     * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
     * `cancelled`.
     */
    fun status(): Status? = status.getNullable("status")

    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The client token of the payment flow. This token can be used to embed a payment workflow in
     * your client-side application.
     */
    @JsonProperty("client_token") @ExcludeMissing fun _clientToken() = clientToken

    /**
     * The ID of a counterparty associated with the payment. As part of the payment workflow an
     * external account will be associated with this counterparty.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The currency of the payment. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * Describes the direction money is flowing in the transaction. Can only be `debit`. A `debit`
     * pulls money from someone else's account to your own.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * The due date for the flow. Can only be passed in when `effective_date_selection_enabled` is
     * `true`.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate() = dueDate

    /**
     * When `true`, your end-user can schedule the payment `effective_date` while completing the
     * pre-built UI.
     */
    @JsonProperty("effective_date_selection_enabled")
    @ExcludeMissing
    fun _effectiveDateSelectionEnabled() = effectiveDateSelectionEnabled

    /**
     * When `verified` and `external_account_collection` is `enabled`, filters the list of external
     * accounts your end-user can select to those with a `verification_status` of `verified`.
     */
    @JsonProperty("existing_external_accounts_filter")
    @ExcludeMissing
    fun _existingExternalAccountsFilter() = existingExternalAccountsFilter

    /**
     * When `enabled`, your end-user can select from an existing external account when completing
     * the flow. When `disabled`, your end-user must add new payment details when completing the
     * flow.
     */
    @JsonProperty("external_account_collection")
    @ExcludeMissing
    fun _externalAccountCollection() = externalAccountCollection

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The ID of one of your organization's internal accounts. */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId() = originatingAccountId

    /** If present, the ID of the payment order created using this flow. */
    @JsonProperty("payment_order_id") @ExcludeMissing fun _paymentOrderId() = paymentOrderId

    /** If present, the ID of the external account created using this flow. */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId() = receivingAccountId

    /**
     * This field is set after your end-user selects a payment date while completing the pre-built
     * UI. This field is always `null` unless `effective_date_selection_enabled` is `true`.
     */
    @JsonProperty("selected_effective_date")
    @ExcludeMissing
    fun _selectedEffectiveDate() = selectedEffectiveDate

    /**
     * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
     * `cancelled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentFlow = apply {
        if (!validated) {
            id()
            amount()
            clientToken()
            counterpartyId()
            createdAt()
            currency()
            direction()
            dueDate()
            effectiveDateSelectionEnabled()
            existingExternalAccountsFilter()
            externalAccountCollection()
            liveMode()
            object_()
            originatingAccountId()
            paymentOrderId()
            receivingAccountId()
            selectedEffectiveDate()
            status()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var dueDate: JsonField<LocalDate> = JsonMissing.of()
        private var effectiveDateSelectionEnabled: JsonField<Boolean> = JsonMissing.of()
        private var existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter> =
            JsonMissing.of()
        private var externalAccountCollection: JsonField<ExternalAccountCollection> =
            JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var originatingAccountId: JsonField<String> = JsonMissing.of()
        private var paymentOrderId: JsonField<String> = JsonMissing.of()
        private var receivingAccountId: JsonField<String> = JsonMissing.of()
        private var selectedEffectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentFlow: PaymentFlow) = apply {
            id = paymentFlow.id
            amount = paymentFlow.amount
            clientToken = paymentFlow.clientToken
            counterpartyId = paymentFlow.counterpartyId
            createdAt = paymentFlow.createdAt
            currency = paymentFlow.currency
            direction = paymentFlow.direction
            dueDate = paymentFlow.dueDate
            effectiveDateSelectionEnabled = paymentFlow.effectiveDateSelectionEnabled
            existingExternalAccountsFilter = paymentFlow.existingExternalAccountsFilter
            externalAccountCollection = paymentFlow.externalAccountCollection
            liveMode = paymentFlow.liveMode
            object_ = paymentFlow.object_
            originatingAccountId = paymentFlow.originatingAccountId
            paymentOrderId = paymentFlow.paymentOrderId
            receivingAccountId = paymentFlow.receivingAccountId
            selectedEffectiveDate = paymentFlow.selectedEffectiveDate
            status = paymentFlow.status
            updatedAt = paymentFlow.updatedAt
            additionalProperties = paymentFlow.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The client token of the payment flow. This token can be used to embed a payment workflow
         * in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * The client token of the payment flow. This token can be used to embed a payment workflow
         * in your client-side application.
         */
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        /**
         * The ID of a counterparty associated with the payment. As part of the payment workflow an
         * external account will be associated with this counterparty.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * The ID of a counterparty associated with the payment. As part of the payment workflow an
         * external account will be associated with this counterparty.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the payment. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the payment. */
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
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * The due date for the flow. Can only be passed in when `effective_date_selection_enabled`
         * is `true`.
         */
        fun dueDate(dueDate: LocalDate) = dueDate(JsonField.of(dueDate))

        /**
         * The due date for the flow. Can only be passed in when `effective_date_selection_enabled`
         * is `true`.
         */
        fun dueDate(dueDate: JsonField<LocalDate>) = apply { this.dueDate = dueDate }

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
        fun effectiveDateSelectionEnabled(effectiveDateSelectionEnabled: JsonField<Boolean>) =
            apply {
                this.effectiveDateSelectionEnabled = effectiveDateSelectionEnabled
            }

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
        fun existingExternalAccountsFilter(
            existingExternalAccountsFilter: JsonField<ExistingExternalAccountsFilter>
        ) = apply { this.existingExternalAccountsFilter = existingExternalAccountsFilter }

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
        fun externalAccountCollection(
            externalAccountCollection: JsonField<ExternalAccountCollection>
        ) = apply { this.externalAccountCollection = externalAccountCollection }

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

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** If present, the ID of the payment order created using this flow. */
        fun paymentOrderId(paymentOrderId: String) = paymentOrderId(JsonField.of(paymentOrderId))

        /** If present, the ID of the payment order created using this flow. */
        fun paymentOrderId(paymentOrderId: JsonField<String>) = apply {
            this.paymentOrderId = paymentOrderId
        }

        /** If present, the ID of the external account created using this flow. */
        fun receivingAccountId(receivingAccountId: String) =
            receivingAccountId(JsonField.of(receivingAccountId))

        /** If present, the ID of the external account created using this flow. */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

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
        fun selectedEffectiveDate(selectedEffectiveDate: JsonField<LocalDate>) = apply {
            this.selectedEffectiveDate = selectedEffectiveDate
        }

        /**
         * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
         * `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the payment flow. One of `pending`, `completed`, `expired`, or
         * `cancelled`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): PaymentFlow =
            PaymentFlow(
                id,
                amount,
                clientToken,
                counterpartyId,
                createdAt,
                currency,
                direction,
                dueDate,
                effectiveDateSelectionEnabled,
                existingExternalAccountsFilter,
                externalAccountCollection,
                liveMode,
                object_,
                originatingAccountId,
                paymentOrderId,
                receivingAccountId,
                selectedEffectiveDate,
                status,
                updatedAt,
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

        return /* spotless:off */ other is PaymentFlow && id == other.id && amount == other.amount && clientToken == other.clientToken && counterpartyId == other.counterpartyId && createdAt == other.createdAt && currency == other.currency && direction == other.direction && dueDate == other.dueDate && effectiveDateSelectionEnabled == other.effectiveDateSelectionEnabled && existingExternalAccountsFilter == other.existingExternalAccountsFilter && externalAccountCollection == other.externalAccountCollection && liveMode == other.liveMode && object_ == other.object_ && originatingAccountId == other.originatingAccountId && paymentOrderId == other.paymentOrderId && receivingAccountId == other.receivingAccountId && selectedEffectiveDate == other.selectedEffectiveDate && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, clientToken, counterpartyId, createdAt, currency, direction, dueDate, effectiveDateSelectionEnabled, existingExternalAccountsFilter, externalAccountCollection, liveMode, object_, originatingAccountId, paymentOrderId, receivingAccountId, selectedEffectiveDate, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentFlow{id=$id, amount=$amount, clientToken=$clientToken, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, direction=$direction, dueDate=$dueDate, effectiveDateSelectionEnabled=$effectiveDateSelectionEnabled, existingExternalAccountsFilter=$existingExternalAccountsFilter, externalAccountCollection=$externalAccountCollection, liveMode=$liveMode, object_=$object_, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, receivingAccountId=$receivingAccountId, selectedEffectiveDate=$selectedEffectiveDate, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
