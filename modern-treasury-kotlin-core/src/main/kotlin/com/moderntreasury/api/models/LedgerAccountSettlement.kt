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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerAccountSettlement.Builder::class)
@NoAutoDetect
class LedgerAccountSettlement
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val ledgerId: JsonField<String>,
    private val description: JsonField<String>,
    private val status: JsonField<Status>,
    private val settledLedgerAccountId: JsonField<String>,
    private val contraLedgerAccountId: JsonField<String>,
    private val effectiveAtUpperBound: JsonField<OffsetDateTime>,
    private val ledgerTransactionId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val settlementEntryDirection: JsonField<String>,
    private val currency: JsonField<String>,
    private val currencyExponent: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The id of the ledger that this ledger account settlement belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /** The description of the ledger account settlement. */
    fun description(): String? = description.getNullable("description")

    /**
     * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
     * `archiving` or `archived`.
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    fun settledLedgerAccountId(): String =
        settledLedgerAccountId.getRequired("settled_ledger_account_id")

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    fun contraLedgerAccountId(): String =
        contraLedgerAccountId.getRequired("contra_ledger_account_id")

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    fun effectiveAtUpperBound(): OffsetDateTime =
        effectiveAtUpperBound.getRequired("effective_at_upper_bound")

    /** The id of the ledger transaction that this settlement is associated with. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /** The amount of the ledger account settlement. */
    fun amount(): Long? = amount.getNullable("amount")

    /** The direction of the ledger entry with the settlement_ledger_account. */
    fun settlementEntryDirection(): String? =
        settlementEntryDirection.getNullable("settlement_entry_direction")

    /** The currency of the ledger account settlement. */
    fun currency(): String = currency.getRequired("currency")

    /** The currency exponent of the ledger account settlement. */
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

    /** The id of the ledger that this ledger account settlement belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /** The description of the ledger account settlement. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
     * `archiving` or `archived`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    @JsonProperty("settled_ledger_account_id")
    @ExcludeMissing
    fun _settledLedgerAccountId() = settledLedgerAccountId

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    @JsonProperty("contra_ledger_account_id")
    @ExcludeMissing
    fun _contraLedgerAccountId() = contraLedgerAccountId

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound() = effectiveAtUpperBound

    /** The id of the ledger transaction that this settlement is associated with. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /** The amount of the ledger account settlement. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The direction of the ledger entry with the settlement_ledger_account. */
    @JsonProperty("settlement_entry_direction")
    @ExcludeMissing
    fun _settlementEntryDirection() = settlementEntryDirection

    /** The currency of the ledger account settlement. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The currency exponent of the ledger account settlement. */
    @JsonProperty("currency_exponent") @ExcludeMissing fun _currencyExponent() = currencyExponent

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccountSettlement = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            ledgerId()
            description()
            status()
            settledLedgerAccountId()
            contraLedgerAccountId()
            effectiveAtUpperBound()
            ledgerTransactionId()
            amount()
            settlementEntryDirection()
            currency()
            currencyExponent()
            metadata().validate()
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
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var settledLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var contraLedgerAccountId: JsonField<String> = JsonMissing.of()
        private var effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var settlementEntryDirection: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var currencyExponent: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountSettlement: LedgerAccountSettlement) = apply {
            id = ledgerAccountSettlement.id
            object_ = ledgerAccountSettlement.object_
            liveMode = ledgerAccountSettlement.liveMode
            createdAt = ledgerAccountSettlement.createdAt
            updatedAt = ledgerAccountSettlement.updatedAt
            ledgerId = ledgerAccountSettlement.ledgerId
            description = ledgerAccountSettlement.description
            status = ledgerAccountSettlement.status
            settledLedgerAccountId = ledgerAccountSettlement.settledLedgerAccountId
            contraLedgerAccountId = ledgerAccountSettlement.contraLedgerAccountId
            effectiveAtUpperBound = ledgerAccountSettlement.effectiveAtUpperBound
            ledgerTransactionId = ledgerAccountSettlement.ledgerTransactionId
            amount = ledgerAccountSettlement.amount
            settlementEntryDirection = ledgerAccountSettlement.settlementEntryDirection
            currency = ledgerAccountSettlement.currency
            currencyExponent = ledgerAccountSettlement.currencyExponent
            metadata = ledgerAccountSettlement.metadata
            additionalProperties = ledgerAccountSettlement.additionalProperties.toMutableMap()
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

        /** The id of the ledger that this ledger account settlement belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this ledger account settlement belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The description of the ledger account settlement. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the ledger account settlement. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
         * `archiving` or `archived`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
         * `archiving` or `archived`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        fun settledLedgerAccountId(settledLedgerAccountId: String) =
            settledLedgerAccountId(JsonField.of(settledLedgerAccountId))

        /**
         * The id of the settled ledger account whose ledger entries are queried against, and its
         * balance is reduced as a result.
         */
        @JsonProperty("settled_ledger_account_id")
        @ExcludeMissing
        fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
            this.settledLedgerAccountId = settledLedgerAccountId
        }

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        fun contraLedgerAccountId(contraLedgerAccountId: String) =
            contraLedgerAccountId(JsonField.of(contraLedgerAccountId))

        /**
         * The id of the contra ledger account that sends to or receives funds from the settled
         * ledger account.
         */
        @JsonProperty("contra_ledger_account_id")
        @ExcludeMissing
        fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
            this.contraLedgerAccountId = contraLedgerAccountId
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) =
            effectiveAtUpperBound(JsonField.of(effectiveAtUpperBound))

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account settlement. The default value is the created_at timestamp
         * of the ledger account settlement.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /** The id of the ledger transaction that this settlement is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The id of the ledger transaction that this settlement is associated with. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /** The amount of the ledger account settlement. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the ledger account settlement. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The direction of the ledger entry with the settlement_ledger_account. */
        fun settlementEntryDirection(settlementEntryDirection: String) =
            settlementEntryDirection(JsonField.of(settlementEntryDirection))

        /** The direction of the ledger entry with the settlement_ledger_account. */
        @JsonProperty("settlement_entry_direction")
        @ExcludeMissing
        fun settlementEntryDirection(settlementEntryDirection: JsonField<String>) = apply {
            this.settlementEntryDirection = settlementEntryDirection
        }

        /** The currency of the ledger account settlement. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the ledger account settlement. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The currency exponent of the ledger account settlement. */
        fun currencyExponent(currencyExponent: Long) =
            currencyExponent(JsonField.of(currencyExponent))

        /** The currency exponent of the ledger account settlement. */
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

        fun build(): LedgerAccountSettlement =
            LedgerAccountSettlement(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                ledgerId,
                description,
                status,
                settledLedgerAccountId,
                contraLedgerAccountId,
                effectiveAtUpperBound,
                ledgerTransactionId,
                amount,
                settlementEntryDirection,
                currency,
                currencyExponent,
                metadata,
                additionalProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ARCHIVED = of("archived")

            val ARCHIVING = of("archiving")

            val DRAFTING = of("drafting")

            val PENDING = of("pending")

            val POSTED = of("posted")

            val PROCESSING = of("processing")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            ARCHIVING,
            DRAFTING,
            PENDING,
            POSTED,
            PROCESSING,
        }

        enum class Value {
            ARCHIVED,
            ARCHIVING,
            DRAFTING,
            PENDING,
            POSTED,
            PROCESSING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                ARCHIVING -> Value.ARCHIVING
                DRAFTING -> Value.DRAFTING
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                PROCESSING -> Value.PROCESSING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                ARCHIVING -> Known.ARCHIVING
                DRAFTING -> Known.DRAFTING
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                PROCESSING -> Known.PROCESSING
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

        return /* spotless:off */ other is LedgerAccountSettlement && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && ledgerId == other.ledgerId && description == other.description && status == other.status && settledLedgerAccountId == other.settledLedgerAccountId && contraLedgerAccountId == other.contraLedgerAccountId && effectiveAtUpperBound == other.effectiveAtUpperBound && ledgerTransactionId == other.ledgerTransactionId && amount == other.amount && settlementEntryDirection == other.settlementEntryDirection && currency == other.currency && currencyExponent == other.currencyExponent && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, ledgerId, description, status, settledLedgerAccountId, contraLedgerAccountId, effectiveAtUpperBound, ledgerTransactionId, amount, settlementEntryDirection, currency, currencyExponent, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountSettlement{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, ledgerId=$ledgerId, description=$description, status=$status, settledLedgerAccountId=$settledLedgerAccountId, contraLedgerAccountId=$contraLedgerAccountId, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerTransactionId=$ledgerTransactionId, amount=$amount, settlementEntryDirection=$settlementEntryDirection, currency=$currency, currencyExponent=$currencyExponent, metadata=$metadata, additionalProperties=$additionalProperties}"
}
