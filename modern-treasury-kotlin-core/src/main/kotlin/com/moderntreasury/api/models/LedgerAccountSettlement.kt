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
class LedgerAccountSettlement
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("contra_ledger_account_id")
    @ExcludeMissing
    private val contraLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currency_exponent")
    @ExcludeMissing
    private val currencyExponent: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    private val effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settled_ledger_account_id")
    @ExcludeMissing
    private val settledLedgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settlement_entry_direction")
    @ExcludeMissing
    private val settlementEntryDirection: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The amount of the ledger account settlement. */
    fun amount(): Long? = amount.getNullable("amount")

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    fun contraLedgerAccountId(): String =
        contraLedgerAccountId.getRequired("contra_ledger_account_id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The currency of the ledger account settlement. */
    fun currency(): String = currency.getRequired("currency")

    /** The currency exponent of the ledger account settlement. */
    fun currencyExponent(): Long? = currencyExponent.getNullable("currency_exponent")

    /** The description of the ledger account settlement. */
    fun description(): String? = description.getNullable("description")

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    fun effectiveAtUpperBound(): OffsetDateTime =
        effectiveAtUpperBound.getRequired("effective_at_upper_bound")

    /** The id of the ledger that this ledger account settlement belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /** The id of the ledger transaction that this settlement is associated with. */
    fun ledgerTransactionId(): String? = ledgerTransactionId.getNullable("ledger_transaction_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    fun settledLedgerAccountId(): String =
        settledLedgerAccountId.getRequired("settled_ledger_account_id")

    /** The direction of the ledger entry with the settlement_ledger_account. */
    fun settlementEntryDirection(): String? =
        settlementEntryDirection.getNullable("settlement_entry_direction")

    /**
     * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
     * `archiving` or `archived`.
     */
    fun status(): Status = status.getRequired("status")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The amount of the ledger account settlement. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * The id of the contra ledger account that sends to or receives funds from the settled ledger
     * account.
     */
    @JsonProperty("contra_ledger_account_id")
    @ExcludeMissing
    fun _contraLedgerAccountId(): JsonField<String> = contraLedgerAccountId

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The currency of the ledger account settlement. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The currency exponent of the ledger account settlement. */
    @JsonProperty("currency_exponent")
    @ExcludeMissing
    fun _currencyExponent(): JsonField<Long> = currencyExponent

    /** The description of the ledger account settlement. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account settlement. The default value is the created_at timestamp of the ledger
     * account settlement.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

    /** The id of the ledger that this ledger account settlement belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    /** The id of the ledger transaction that this settlement is associated with. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * The id of the settled ledger account whose ledger entries are queried against, and its
     * balance is reduced as a result.
     */
    @JsonProperty("settled_ledger_account_id")
    @ExcludeMissing
    fun _settledLedgerAccountId(): JsonField<String> = settledLedgerAccountId

    /** The direction of the ledger entry with the settlement_ledger_account. */
    @JsonProperty("settlement_entry_direction")
    @ExcludeMissing
    fun _settlementEntryDirection(): JsonField<String> = settlementEntryDirection

    /**
     * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
     * `archiving` or `archived`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccountSettlement = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        contraLedgerAccountId()
        createdAt()
        currency()
        currencyExponent()
        description()
        effectiveAtUpperBound()
        ledgerId()
        ledgerTransactionId()
        liveMode()
        metadata().validate()
        object_()
        settledLedgerAccountId()
        settlementEntryDirection()
        status()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountSettlement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var contraLedgerAccountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var currencyExponent: JsonField<Long>? = null
        private var description: JsonField<String>? = null
        private var effectiveAtUpperBound: JsonField<OffsetDateTime>? = null
        private var ledgerId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var settledLedgerAccountId: JsonField<String>? = null
        private var settlementEntryDirection: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountSettlement: LedgerAccountSettlement) = apply {
            id = ledgerAccountSettlement.id
            amount = ledgerAccountSettlement.amount
            contraLedgerAccountId = ledgerAccountSettlement.contraLedgerAccountId
            createdAt = ledgerAccountSettlement.createdAt
            currency = ledgerAccountSettlement.currency
            currencyExponent = ledgerAccountSettlement.currencyExponent
            description = ledgerAccountSettlement.description
            effectiveAtUpperBound = ledgerAccountSettlement.effectiveAtUpperBound
            ledgerId = ledgerAccountSettlement.ledgerId
            ledgerTransactionId = ledgerAccountSettlement.ledgerTransactionId
            liveMode = ledgerAccountSettlement.liveMode
            metadata = ledgerAccountSettlement.metadata
            object_ = ledgerAccountSettlement.object_
            settledLedgerAccountId = ledgerAccountSettlement.settledLedgerAccountId
            settlementEntryDirection = ledgerAccountSettlement.settlementEntryDirection
            status = ledgerAccountSettlement.status
            updatedAt = ledgerAccountSettlement.updatedAt
            additionalProperties = ledgerAccountSettlement.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The amount of the ledger account settlement. */
        fun amount(amount: Long?) = amount(JsonField.ofNullable(amount))

        /** The amount of the ledger account settlement. */
        fun amount(amount: Long) = amount(amount as Long?)

        /** The amount of the ledger account settlement. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
        fun contraLedgerAccountId(contraLedgerAccountId: JsonField<String>) = apply {
            this.contraLedgerAccountId = contraLedgerAccountId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the ledger account settlement. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** The currency of the ledger account settlement. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The currency exponent of the ledger account settlement. */
        fun currencyExponent(currencyExponent: Long?) =
            currencyExponent(JsonField.ofNullable(currencyExponent))

        /** The currency exponent of the ledger account settlement. */
        fun currencyExponent(currencyExponent: Long) = currencyExponent(currencyExponent as Long?)

        /** The currency exponent of the ledger account settlement. */
        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
            this.currencyExponent = currencyExponent
        }

        /** The description of the ledger account settlement. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The description of the ledger account settlement. */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /** The id of the ledger that this ledger account settlement belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this ledger account settlement belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The id of the ledger transaction that this settlement is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /** The id of the ledger transaction that this settlement is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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
        fun settledLedgerAccountId(settledLedgerAccountId: JsonField<String>) = apply {
            this.settledLedgerAccountId = settledLedgerAccountId
        }

        /** The direction of the ledger entry with the settlement_ledger_account. */
        fun settlementEntryDirection(settlementEntryDirection: String?) =
            settlementEntryDirection(JsonField.ofNullable(settlementEntryDirection))

        /** The direction of the ledger entry with the settlement_ledger_account. */
        fun settlementEntryDirection(settlementEntryDirection: JsonField<String>) = apply {
            this.settlementEntryDirection = settlementEntryDirection
        }

        /**
         * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
         * `archiving` or `archived`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
         * `archiving` or `archived`.
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

        fun build(): LedgerAccountSettlement =
            LedgerAccountSettlement(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("contraLedgerAccountId", contraLedgerAccountId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("currencyExponent", currencyExponent),
                checkRequired("description", description),
                checkRequired("effectiveAtUpperBound", effectiveAtUpperBound),
                checkRequired("ledgerId", ledgerId),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("settledLedgerAccountId", settledLedgerAccountId),
                checkRequired("settlementEntryDirection", settlementEntryDirection),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

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

    /**
     * The status of the ledger account settlement. One of `processing`, `pending`, `posted`,
     * `archiving` or `archived`.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val ARCHIVED = of("archived")

            val ARCHIVING = of("archiving")

            val DRAFTING = of("drafting")

            val PENDING = of("pending")

            val POSTED = of("posted")

            val PROCESSING = of("processing")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ARCHIVED,
            ARCHIVING,
            DRAFTING,
            PENDING,
            POSTED,
            PROCESSING,
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
            ARCHIVED,
            ARCHIVING,
            DRAFTING,
            PENDING,
            POSTED,
            PROCESSING,
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
                ARCHIVED -> Value.ARCHIVED
                ARCHIVING -> Value.ARCHIVING
                DRAFTING -> Value.DRAFTING
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                PROCESSING -> Value.PROCESSING
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

        return /* spotless:off */ other is LedgerAccountSettlement && id == other.id && amount == other.amount && contraLedgerAccountId == other.contraLedgerAccountId && createdAt == other.createdAt && currency == other.currency && currencyExponent == other.currencyExponent && description == other.description && effectiveAtUpperBound == other.effectiveAtUpperBound && ledgerId == other.ledgerId && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && settledLedgerAccountId == other.settledLedgerAccountId && settlementEntryDirection == other.settlementEntryDirection && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, contraLedgerAccountId, createdAt, currency, currencyExponent, description, effectiveAtUpperBound, ledgerId, ledgerTransactionId, liveMode, metadata, object_, settledLedgerAccountId, settlementEntryDirection, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountSettlement{id=$id, amount=$amount, contraLedgerAccountId=$contraLedgerAccountId, createdAt=$createdAt, currency=$currency, currencyExponent=$currencyExponent, description=$description, effectiveAtUpperBound=$effectiveAtUpperBound, ledgerId=$ledgerId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, settledLedgerAccountId=$settledLedgerAccountId, settlementEntryDirection=$settlementEntryDirection, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
