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

@JsonDeserialize(builder = LedgerTransaction.Builder::class)
@NoAutoDetect
class LedgerTransaction
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val status: JsonField<Status>,
    private val metadata: JsonField<Metadata>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val effectiveDate: JsonField<LocalDate>,
    private val ledgerEntries: JsonField<List<LedgerEntry>>,
    private val postedAt: JsonField<OffsetDateTime>,
    private val ledgerId: JsonField<String>,
    private val ledgerableType: JsonField<LedgerableType>,
    private val ledgerableId: JsonField<String>,
    private val externalId: JsonField<String>,
    private val reversesLedgerTransactionId: JsonField<String>,
    private val reversedByLedgerTransactionId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** An optional description for internal use. */
    fun description(): String? = description.getNullable("description")

    /** To post a ledger transaction at creation, use `posted`. */
    fun status(): Status = status.getRequired("status")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /** The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes. */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /** An array of ledger entry objects. */
    fun ledgerEntries(): List<LedgerEntry> = ledgerEntries.getRequired("ledger_entries")

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     */
    fun postedAt(): OffsetDateTime? = postedAt.getNullable("posted_at")

    /** The ID of the ledger this ledger transaction belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     */
    fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the id will
     * be populated here, otherwise null.
     */
    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

    /**
     * A unique string to represent the ledger transaction. Only one pending or posted ledger
     * transaction may have this ID in the ledger.
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /** The ID of the original ledger transaction that this ledger transaction reverses. */
    fun reversesLedgerTransactionId(): String? =
        reversesLedgerTransactionId.getNullable("reverses_ledger_transaction_id")

    /** The ID of the ledger transaction that reversed this ledger transaction. */
    fun reversedByLedgerTransactionId(): String? =
        reversedByLedgerTransactionId.getNullable("reversed_by_ledger_transaction_id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** To post a ledger transaction at creation, use `posted`. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     */
    @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

    /** The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes. */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    /** An array of ledger entry objects. */
    @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     */
    @JsonProperty("posted_at") @ExcludeMissing fun _postedAt() = postedAt

    /** The ID of the ledger this ledger transaction belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     */
    @JsonProperty("ledgerable_type") @ExcludeMissing fun _ledgerableType() = ledgerableType

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the id will
     * be populated here, otherwise null.
     */
    @JsonProperty("ledgerable_id") @ExcludeMissing fun _ledgerableId() = ledgerableId

    /**
     * A unique string to represent the ledger transaction. Only one pending or posted ledger
     * transaction may have this ID in the ledger.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /** The ID of the original ledger transaction that this ledger transaction reverses. */
    @JsonProperty("reverses_ledger_transaction_id")
    @ExcludeMissing
    fun _reversesLedgerTransactionId() = reversesLedgerTransactionId

    /** The ID of the ledger transaction that reversed this ledger transaction. */
    @JsonProperty("reversed_by_ledger_transaction_id")
    @ExcludeMissing
    fun _reversedByLedgerTransactionId() = reversedByLedgerTransactionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerTransaction = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            description()
            status()
            metadata().validate()
            effectiveAt()
            effectiveDate()
            ledgerEntries().forEach { it.validate() }
            postedAt()
            ledgerId()
            ledgerableType()
            ledgerableId()
            externalId()
            reversesLedgerTransactionId()
            reversedByLedgerTransactionId()
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
        private var description: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of()
        private var postedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
        private var ledgerableId: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var reversesLedgerTransactionId: JsonField<String> = JsonMissing.of()
        private var reversedByLedgerTransactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerTransaction: LedgerTransaction) = apply {
            this.id = ledgerTransaction.id
            this.object_ = ledgerTransaction.object_
            this.liveMode = ledgerTransaction.liveMode
            this.createdAt = ledgerTransaction.createdAt
            this.updatedAt = ledgerTransaction.updatedAt
            this.description = ledgerTransaction.description
            this.status = ledgerTransaction.status
            this.metadata = ledgerTransaction.metadata
            this.effectiveAt = ledgerTransaction.effectiveAt
            this.effectiveDate = ledgerTransaction.effectiveDate
            this.ledgerEntries = ledgerTransaction.ledgerEntries
            this.postedAt = ledgerTransaction.postedAt
            this.ledgerId = ledgerTransaction.ledgerId
            this.ledgerableType = ledgerTransaction.ledgerableType
            this.ledgerableId = ledgerTransaction.ledgerableId
            this.externalId = ledgerTransaction.externalId
            this.reversesLedgerTransactionId = ledgerTransaction.reversesLedgerTransactionId
            this.reversedByLedgerTransactionId = ledgerTransaction.reversedByLedgerTransactionId
            additionalProperties(ledgerTransaction.additionalProperties)
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

        /** An optional description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(status: Status) = status(JsonField.of(status))

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** An array of ledger entry objects. */
        fun ledgerEntries(ledgerEntries: List<LedgerEntry>) =
            ledgerEntries(JsonField.of(ledgerEntries))

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntry>>) = apply {
            this.ledgerEntries = ledgerEntries
        }

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        fun postedAt(postedAt: OffsetDateTime) = postedAt(JsonField.of(postedAt))

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        @JsonProperty("posted_at")
        @ExcludeMissing
        fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply { this.postedAt = postedAt }

        /** The ID of the ledger this ledger transaction belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The ID of the ledger this ledger transaction belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType) =
            ledgerableType(JsonField.of(ledgerableType))

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
            this.ledgerableType = ledgerableType
        }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            this.ledgerableId = ledgerableId
        }

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The ID of the original ledger transaction that this ledger transaction reverses. */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: String) =
            reversesLedgerTransactionId(JsonField.of(reversesLedgerTransactionId))

        /** The ID of the original ledger transaction that this ledger transaction reverses. */
        @JsonProperty("reverses_ledger_transaction_id")
        @ExcludeMissing
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: JsonField<String>) = apply {
            this.reversesLedgerTransactionId = reversesLedgerTransactionId
        }

        /** The ID of the ledger transaction that reversed this ledger transaction. */
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: String) =
            reversedByLedgerTransactionId(JsonField.of(reversedByLedgerTransactionId))

        /** The ID of the ledger transaction that reversed this ledger transaction. */
        @JsonProperty("reversed_by_ledger_transaction_id")
        @ExcludeMissing
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: JsonField<String>) =
            apply {
                this.reversedByLedgerTransactionId = reversedByLedgerTransactionId
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

        fun build(): LedgerTransaction =
            LedgerTransaction(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                description,
                status,
                metadata,
                effectiveAt,
                effectiveDate,
                ledgerEntries.map { it.toImmutable() },
                postedAt,
                ledgerId,
                ledgerableType,
                ledgerableId,
                externalId,
                reversesLedgerTransactionId,
                reversedByLedgerTransactionId,
                additionalProperties.toImmutable(),
            )
    }

    class LedgerableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

            val INCOMING_PAYMENT_DETAIL = LedgerableType(JsonField.of("incoming_payment_detail"))

            val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

            val RETURN = LedgerableType(JsonField.of("return"))

            val REVERSAL = LedgerableType(JsonField.of("reversal"))

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ARCHIVED = Status(JsonField.of("archived"))

            val PENDING = Status(JsonField.of("pending"))

            val POSTED = Status(JsonField.of("posted"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PENDING,
            POSTED,
        }

        enum class Value {
            ARCHIVED,
            PENDING,
            POSTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransaction && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && description == other.description && status == other.status && metadata == other.metadata && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerEntries == other.ledgerEntries && postedAt == other.postedAt && ledgerId == other.ledgerId && ledgerableType == other.ledgerableType && ledgerableId == other.ledgerableId && externalId == other.externalId && reversesLedgerTransactionId == other.reversesLedgerTransactionId && reversedByLedgerTransactionId == other.reversedByLedgerTransactionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, description, status, metadata, effectiveAt, effectiveDate, ledgerEntries, postedAt, ledgerId, ledgerableType, ledgerableId, externalId, reversesLedgerTransactionId, reversedByLedgerTransactionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerTransaction{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, postedAt=$postedAt, ledgerId=$ledgerId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, externalId=$externalId, reversesLedgerTransactionId=$reversesLedgerTransactionId, reversedByLedgerTransactionId=$reversedByLedgerTransactionId, additionalProperties=$additionalProperties}"
}
