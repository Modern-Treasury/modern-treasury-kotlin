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

@JsonDeserialize(builder = LedgerAccountPayout.Builder::class)
@NoAutoDetect
class LedgerAccountPayout
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val ledgerId: JsonField<String>,
    private val description: JsonField<String>,
    private val status: JsonField<Status>,
    private val payoutLedgerAccountId: JsonField<String>,
    private val fundingLedgerAccountId: JsonField<String>,
    private val effectiveAtUpperBound: JsonField<OffsetDateTime>,
    private val ledgerTransactionId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val payoutEntryDirection: JsonField<String>,
    private val currency: JsonField<String>,
    private val currencyExponent: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
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

    /** The id of the ledger that this ledger account payout belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /** The description of the ledger account payout. */
    fun description(): String? = description.getNullable("description")

    /**
     * The status of the ledger account payout. One of `processing`, `pending`, `posted`,
     * `archiving`, `archived`, `reversing` or `reversed`.
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The id of the payout ledger account whose ledger entries are queried against, and its balance
     * is reduced as a result.
     */
    fun payoutLedgerAccountId(): String =
        payoutLedgerAccountId.getRequired("payout_ledger_account_id")

    /**
     * The id of the funding ledger account that sends to or receives funds from the payout ledger
     * account.
     */
    fun fundingLedgerAccountId(): String =
        fundingLedgerAccountId.getRequired("funding_ledger_account_id")

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account payout. The default value is the created_at timestamp of the ledger
     * account payout.
     */
    fun effectiveAtUpperBound(): OffsetDateTime =
        effectiveAtUpperBound.getRequired("effective_at_upper_bound")

    /** The id of the ledger transaction that this payout is associated with. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /** The amount of the ledger account payout. */
    fun amount(): Long? = amount.getNullable("amount")

    /** The direction of the ledger entry with the payout_ledger_account. */
    fun payoutEntryDirection(): String? = payoutEntryDirection.getNullable("payout_entry_direction")

    /** The currency of the ledger account payout. */
    fun currency(): String = currency.getRequired("currency")

    /** The currency exponent of the ledger account payout. */
    fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The id of the ledger that this ledger account payout belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /** The description of the ledger account payout. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The status of the ledger account payout. One of `processing`, `pending`, `posted`,
     * `archiving`, `archived`, `reversing` or `reversed`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The id of the payout ledger account whose ledger entries are queried against, and its balance
     * is reduced as a result.
     */
    @JsonProperty("payout_ledger_account_id")
    @ExcludeMissing
    fun _payoutLedgerAccountId() = payoutLedgerAccountId

    /**
     * The id of the funding ledger account that sends to or receives funds from the payout ledger
     * account.
     */
    @JsonProperty("funding_ledger_account_id")
    @ExcludeMissing
    fun _fundingLedgerAccountId() = fundingLedgerAccountId

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account payout. The default value is the created_at timestamp of the ledger
     * account payout.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound() = effectiveAtUpperBound

    /** The id of the ledger transaction that this payout is associated with. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /** The amount of the ledger account payout. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The direction of the ledger entry with the payout_ledger_account. */
    @JsonProperty("payout_entry_direction")
    @ExcludeMissing
    fun _payoutEntryDirection() = payoutEntryDirection

    /** The currency of the ledger account payout. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The currency exponent of the ledger account payout. */
    @JsonProperty("currency_exponent") @ExcludeMissing fun _currencyExponent() = currencyExponent

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerAccountPayout = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            ledgerId()
            description()
            status()
            payoutLedgerAccountId()
            fundingLedgerAccountId()
            effectiveAtUpperBound()
            ledgerTransactionId()
            amount()
            payoutEntryDirection()
            currency()
            currencyExponent()
            metadata().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountPayout &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.ledgerId == other.ledgerId &&
            this.description == other.description &&
            this.status == other.status &&
            this.payoutLedgerAccountId == other.payoutLedgerAccountId &&
            this.fundingLedgerAccountId == other.fundingLedgerAccountId &&
            this.effectiveAtUpperBound == other.effectiveAtUpperBound &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.amount == other.amount &&
            this.payoutEntryDirection == other.payoutEntryDirection &&
            this.currency == other.currency &&
            this.currencyExponent == other.currencyExponent &&
            this.metadata == other.metadata &&
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
                    ledgerId,
                    description,
                    status,
                    payoutLedgerAccountId,
                    fundingLedgerAccountId,
                    effectiveAtUpperBound,
                    ledgerTransactionId,
                    amount,
                    payoutEntryDirection,
                    currency,
                    currencyExponent,
                    metadata,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LedgerAccountPayout{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, ledgerId=$ledgerId, description=$description, status=$status, payoutLedgerAccountId=$payoutLedgerAccountId, fundingLedgerAccountId=$fundingLedgerAccountId, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerTransactionId=$ledgerTransactionId, amount=$amount, payoutEntryDirection=$payoutEntryDirection, currency=$currency, currencyExponent=$currencyExponent, metadata=$metadata, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var payoutLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var fundingLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var payoutEntryDirection: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var currencyExponent: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountPayout: LedgerAccountPayout) = apply {
            this.id = ledgerAccountPayout.id
            this.object_ = ledgerAccountPayout.object_
            this.liveMode = ledgerAccountPayout.liveMode
            this.createdAt = ledgerAccountPayout.createdAt
            this.updatedAt = ledgerAccountPayout.updatedAt
            this.ledgerId = ledgerAccountPayout.ledgerId
            this.description = ledgerAccountPayout.description
            this.status = ledgerAccountPayout.status
            this.payoutLedgerAccountId = ledgerAccountPayout.payoutLedgerAccountId
            this.fundingLedgerAccountId = ledgerAccountPayout.fundingLedgerAccountId
            this.effectiveAtUpperBound = ledgerAccountPayout.effectiveAtUpperBound
            this.ledgerTransactionId = ledgerAccountPayout.ledgerTransactionId
            this.amount = ledgerAccountPayout.amount
            this.payoutEntryDirection = ledgerAccountPayout.payoutEntryDirection
            this.currency = ledgerAccountPayout.currency
            this.currencyExponent = ledgerAccountPayout.currencyExponent
            this.metadata = ledgerAccountPayout.metadata
            additionalProperties(ledgerAccountPayout.additionalProperties)
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

        /** The id of the ledger that this ledger account payout belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this ledger account payout belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The description of the ledger account payout. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the ledger account payout. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The status of the ledger account payout. One of `processing`, `pending`, `posted`,
         * `archiving`, `archived`, `reversing` or `reversed`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The status of the ledger account payout. One of `processing`, `pending`, `posted`,
         * `archiving`, `archived`, `reversing` or `reversed`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The id of the payout ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun payoutLedgerAccountId(payoutLedgerAccountId: String) =
            payoutLedgerAccountId(JsonField.of(payoutLedgerAccountId))

        /**
         * The id of the payout ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("payout_ledger_account_id")
        @ExcludeMissing
        fun payoutLedgerAccountId(payoutLedgerAccountId: JsonField<String>) = apply {
            this.payoutLedgerAccountId = payoutLedgerAccountId
        }

        /**
         * The id of the funding ledger account that sends to or receives funds from the payout
         * ledger account.
         */
        fun fundingLedgerAccountId(fundingLedgerAccountId: String) =
            fundingLedgerAccountId(JsonField.of(fundingLedgerAccountId))

        /**
         * The id of the funding ledger account that sends to or receives funds from the payout
         * ledger account.
         */
        @JsonProperty("funding_ledger_account_id")
        @ExcludeMissing
        fun fundingLedgerAccountId(fundingLedgerAccountId: JsonField<String>) = apply {
            this.fundingLedgerAccountId = fundingLedgerAccountId
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account payout. The default value is the created_at timestamp of
         * the ledger account payout.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) =
            effectiveAtUpperBound(JsonField.of(effectiveAtUpperBound))

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account payout. The default value is the created_at timestamp of
         * the ledger account payout.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /** The id of the ledger transaction that this payout is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The id of the ledger transaction that this payout is associated with. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /** The amount of the ledger account payout. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the ledger account payout. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The direction of the ledger entry with the payout_ledger_account. */
        fun payoutEntryDirection(payoutEntryDirection: String) =
            payoutEntryDirection(JsonField.of(payoutEntryDirection))

        /** The direction of the ledger entry with the payout_ledger_account. */
        @JsonProperty("payout_entry_direction")
        @ExcludeMissing
        fun payoutEntryDirection(payoutEntryDirection: JsonField<String>) = apply {
            this.payoutEntryDirection = payoutEntryDirection
        }

        /** The currency of the ledger account payout. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the ledger account payout. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The currency exponent of the ledger account payout. */
        fun currencyExponent(currencyExponent: Long) =
            currencyExponent(JsonField.of(currencyExponent))

        /** The currency exponent of the ledger account payout. */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
            this.currencyExponent = currencyExponent
        }

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

        fun build(): LedgerAccountPayout =
            LedgerAccountPayout(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                ledgerId,
                description,
                status,
                payoutLedgerAccountId,
                fundingLedgerAccountId,
                effectiveAtUpperBound,
                ledgerTransactionId,
                amount,
                payoutEntryDirection,
                currency,
                currencyExponent,
                metadata,
                additionalProperties.toUnmodifiable(),
            )
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

            val ARCHIVED = Status(JsonField.of("archived"))

            val ARCHIVING = Status(JsonField.of("archiving"))

            val PENDING = Status(JsonField.of("pending"))

            val POSTED = Status(JsonField.of("posted"))

            val PROCESSING = Status(JsonField.of("processing"))

            val REVERSED = Status(JsonField.of("reversed"))

            val REVERSING = Status(JsonField.of("reversing"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            ARCHIVING,
            PENDING,
            POSTED,
            PROCESSING,
            REVERSED,
            REVERSING,
        }

        enum class Value {
            ARCHIVED,
            ARCHIVING,
            PENDING,
            POSTED,
            PROCESSING,
            REVERSED,
            REVERSING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                ARCHIVING -> Value.ARCHIVING
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                PROCESSING -> Value.PROCESSING
                REVERSED -> Value.REVERSED
                REVERSING -> Value.REVERSING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                ARCHIVING -> Known.ARCHIVING
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                PROCESSING -> Known.PROCESSING
                REVERSED -> Known.REVERSED
                REVERSING -> Known.REVERSING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
