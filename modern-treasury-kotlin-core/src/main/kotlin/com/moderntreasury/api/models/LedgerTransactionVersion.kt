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

@JsonDeserialize(builder = LedgerTransactionVersion.Builder::class)
@NoAutoDetect
class LedgerTransactionVersion
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val ledgerTransactionId: JsonField<String>,
    private val description: JsonField<String>,
    private val status: JsonField<Status>,
    private val metadata: JsonField<Metadata>,
    private val effectiveAt: JsonField<String>,
    private val effectiveDate: JsonField<LocalDate>,
    private val ledgerEntries: JsonField<List<LedgerEntryOfTransactionVersion>>,
    private val postedAt: JsonField<String>,
    private val ledgerId: JsonField<String>,
    private val ledgerableType: JsonField<LedgerableType>,
    private val ledgerableId: JsonField<String>,
    private val externalId: JsonField<String>,
    private val version: JsonField<Long>,
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

    /** The ID of the ledger transaction */
    fun ledgerTransactionId(): String = ledgerTransactionId.getRequired("ledger_transaction_id")

    /** An optional description for internal use. */
    fun description(): String? = description.getNullable("description")

    /** One of `pending`, `posted`, or `archived` */
    fun status(): Status = status.getRequired("status")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     */
    fun effectiveAt(): String = effectiveAt.getRequired("effective_at")

    /** The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes. */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /** An array of ledger entry objects. */
    fun ledgerEntries(): List<LedgerEntryOfTransactionVersion> =
        ledgerEntries.getRequired("ledger_entries")

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     */
    fun postedAt(): String? = postedAt.getNullable("posted_at")

    /** The ID of the ledger this ledger transaction belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, or reversal.
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

    /** Version number of the ledger transaction. */
    fun version(): Long = version.getRequired("version")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The ID of the ledger transaction */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** One of `pending`, `posted`, or `archived` */
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
     * incoming_payment_detail, expected_payment, return, or reversal.
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

    /** Version number of the ledger transaction. */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerTransactionVersion = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            ledgerTransactionId()
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
            version()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerTransactionVersion &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.description == other.description &&
            this.status == other.status &&
            this.metadata == other.metadata &&
            this.effectiveAt == other.effectiveAt &&
            this.effectiveDate == other.effectiveDate &&
            this.ledgerEntries == other.ledgerEntries &&
            this.postedAt == other.postedAt &&
            this.ledgerId == other.ledgerId &&
            this.ledgerableType == other.ledgerableType &&
            this.ledgerableId == other.ledgerableId &&
            this.externalId == other.externalId &&
            this.version == other.version &&
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
                    ledgerTransactionId,
                    description,
                    status,
                    metadata,
                    effectiveAt,
                    effectiveDate,
                    ledgerEntries,
                    postedAt,
                    ledgerId,
                    ledgerableType,
                    ledgerableId,
                    externalId,
                    version,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LedgerTransactionVersion{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, ledgerTransactionId=$ledgerTransactionId, description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, postedAt=$postedAt, ledgerId=$ledgerId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, externalId=$externalId, version=$version, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var effectiveAt: JsonField<String> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var ledgerEntries: JsonField<List<LedgerEntryOfTransactionVersion>> =
            JsonMissing.of()
        private var postedAt: JsonField<String> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
        private var ledgerableId: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerTransactionVersion: LedgerTransactionVersion) = apply {
            this.id = ledgerTransactionVersion.id
            this.object_ = ledgerTransactionVersion.object_
            this.liveMode = ledgerTransactionVersion.liveMode
            this.createdAt = ledgerTransactionVersion.createdAt
            this.ledgerTransactionId = ledgerTransactionVersion.ledgerTransactionId
            this.description = ledgerTransactionVersion.description
            this.status = ledgerTransactionVersion.status
            this.metadata = ledgerTransactionVersion.metadata
            this.effectiveAt = ledgerTransactionVersion.effectiveAt
            this.effectiveDate = ledgerTransactionVersion.effectiveDate
            this.ledgerEntries = ledgerTransactionVersion.ledgerEntries
            this.postedAt = ledgerTransactionVersion.postedAt
            this.ledgerId = ledgerTransactionVersion.ledgerId
            this.ledgerableType = ledgerTransactionVersion.ledgerableType
            this.ledgerableId = ledgerTransactionVersion.ledgerableId
            this.externalId = ledgerTransactionVersion.externalId
            this.version = ledgerTransactionVersion.version
            additionalProperties(ledgerTransactionVersion.additionalProperties)
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

        /** The ID of the ledger transaction */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /** An optional description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** One of `pending`, `posted`, or `archived` */
        fun status(status: Status) = status(JsonField.of(status))

        /** One of `pending`, `posted`, or `archived` */
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
        fun effectiveAt(effectiveAt: String) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun effectiveAt(effectiveAt: JsonField<String>) = apply { this.effectiveAt = effectiveAt }

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
        fun ledgerEntries(ledgerEntries: List<LedgerEntryOfTransactionVersion>) =
            ledgerEntries(JsonField.of(ledgerEntries))

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryOfTransactionVersion>>) = apply {
            this.ledgerEntries = ledgerEntries
        }

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        fun postedAt(postedAt: String) = postedAt(JsonField.of(postedAt))

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        @JsonProperty("posted_at")
        @ExcludeMissing
        fun postedAt(postedAt: JsonField<String>) = apply { this.postedAt = postedAt }

        /** The ID of the ledger this ledger transaction belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The ID of the ledger this ledger transaction belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, or reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType) =
            ledgerableType(JsonField.of(ledgerableType))

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, or reversal.
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

        /** Version number of the ledger transaction. */
        fun version(version: Long) = version(JsonField.of(version))

        /** Version number of the ledger transaction. */
        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        fun build(): LedgerTransactionVersion =
            LedgerTransactionVersion(
                id,
                object_,
                liveMode,
                createdAt,
                ledgerTransactionId,
                description,
                status,
                metadata,
                effectiveAt,
                effectiveDate,
                ledgerEntries.map { it.toUnmodifiable() },
                postedAt,
                ledgerId,
                ledgerableType,
                ledgerableId,
                externalId,
                version,
                additionalProperties.toUnmodifiable(),
            )
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

    @JsonDeserialize(builder = LedgerEntryOfTransactionVersion.Builder::class)
    @NoAutoDetect
    class LedgerEntryOfTransactionVersion
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val amount: JsonField<Long>,
        private val direction: JsonField<Direction>,
        private val status: JsonField<Status>,
        private val ledgerAccountId: JsonField<String>,
        private val ledgerAccountLockVersion: JsonField<Long>,
        private val ledgerAccountCurrency: JsonField<String>,
        private val ledgerAccountCurrencyExponent: JsonField<Long>,
        private val ledgerTransactionId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val resultingLedgerAccountBalances: JsonField<LedgerBalances>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         */
        fun status(): Status = status.getRequired("status")

        /** The ledger account that this ledger entry is associated with. */
        fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         */
        fun ledgerAccountLockVersion(): Long? =
            ledgerAccountLockVersion.getNullable("ledger_account_lock_version")

        /** The currency of the ledger account. */
        fun ledgerAccountCurrency(): String =
            ledgerAccountCurrency.getRequired("ledger_account_currency")

        /** The currency exponent of the ledger account. */
        fun ledgerAccountCurrencyExponent(): Long =
            ledgerAccountCurrencyExponent.getRequired("ledger_account_currency_exponent")

        /** The ledger transaction that this ledger entry is associated with. */
        fun ledgerTransactionId(): String = ledgerTransactionId.getRequired("ledger_transaction_id")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        fun resultingLedgerAccountBalances(): LedgerBalances? =
            resultingLedgerAccountBalances.getNullable("resulting_ledger_account_balances")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** The ledger account that this ledger entry is associated with. */
        @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun _ledgerAccountLockVersion() = ledgerAccountLockVersion

        /** The currency of the ledger account. */
        @JsonProperty("ledger_account_currency")
        @ExcludeMissing
        fun _ledgerAccountCurrency() = ledgerAccountCurrency

        /** The currency exponent of the ledger account. */
        @JsonProperty("ledger_account_currency_exponent")
        @ExcludeMissing
        fun _ledgerAccountCurrencyExponent() = ledgerAccountCurrencyExponent

        /** The ledger transaction that this ledger entry is associated with. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun _ledgerTransactionId() = ledgerTransactionId

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /**
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        @JsonProperty("resulting_ledger_account_balances")
        @ExcludeMissing
        fun _resultingLedgerAccountBalances() = resultingLedgerAccountBalances

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LedgerEntryOfTransactionVersion = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                amount()
                direction()
                status()
                ledgerAccountId()
                ledgerAccountLockVersion()
                ledgerAccountCurrency()
                ledgerAccountCurrencyExponent()
                ledgerTransactionId()
                metadata().validate()
                resultingLedgerAccountBalances()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerEntryOfTransactionVersion &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.amount == other.amount &&
                this.direction == other.direction &&
                this.status == other.status &&
                this.ledgerAccountId == other.ledgerAccountId &&
                this.ledgerAccountLockVersion == other.ledgerAccountLockVersion &&
                this.ledgerAccountCurrency == other.ledgerAccountCurrency &&
                this.ledgerAccountCurrencyExponent == other.ledgerAccountCurrencyExponent &&
                this.ledgerTransactionId == other.ledgerTransactionId &&
                this.metadata == other.metadata &&
                this.resultingLedgerAccountBalances == other.resultingLedgerAccountBalances &&
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
                        amount,
                        direction,
                        status,
                        ledgerAccountId,
                        ledgerAccountLockVersion,
                        ledgerAccountCurrency,
                        ledgerAccountCurrencyExponent,
                        ledgerTransactionId,
                        metadata,
                        resultingLedgerAccountBalances,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerEntryOfTransactionVersion{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, amount=$amount, direction=$direction, status=$status, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountCurrency=$ledgerAccountCurrency, ledgerAccountCurrencyExponent=$ledgerAccountCurrencyExponent, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, resultingLedgerAccountBalances=$resultingLedgerAccountBalances, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var ledgerAccountId: JsonField<String> = JsonMissing.of()
            private var ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of()
            private var ledgerAccountCurrency: JsonField<String> = JsonMissing.of()
            private var ledgerAccountCurrencyExponent: JsonField<Long> = JsonMissing.of()
            private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var resultingLedgerAccountBalances: JsonField<LedgerBalances> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEntryOfTransactionVersion: LedgerEntryOfTransactionVersion) =
                apply {
                    this.id = ledgerEntryOfTransactionVersion.id
                    this.object_ = ledgerEntryOfTransactionVersion.object_
                    this.liveMode = ledgerEntryOfTransactionVersion.liveMode
                    this.createdAt = ledgerEntryOfTransactionVersion.createdAt
                    this.amount = ledgerEntryOfTransactionVersion.amount
                    this.direction = ledgerEntryOfTransactionVersion.direction
                    this.status = ledgerEntryOfTransactionVersion.status
                    this.ledgerAccountId = ledgerEntryOfTransactionVersion.ledgerAccountId
                    this.ledgerAccountLockVersion =
                        ledgerEntryOfTransactionVersion.ledgerAccountLockVersion
                    this.ledgerAccountCurrency =
                        ledgerEntryOfTransactionVersion.ledgerAccountCurrency
                    this.ledgerAccountCurrencyExponent =
                        ledgerEntryOfTransactionVersion.ledgerAccountCurrencyExponent
                    this.ledgerTransactionId = ledgerEntryOfTransactionVersion.ledgerTransactionId
                    this.metadata = ledgerEntryOfTransactionVersion.metadata
                    this.resultingLedgerAccountBalances =
                        ledgerEntryOfTransactionVersion.resultingLedgerAccountBalances
                    additionalProperties(ledgerEntryOfTransactionVersion.additionalProperties)
                }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * Equal to the state of the ledger transaction when the ledger entry was created. One
             * of `pending`, `posted`, or `archived`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Equal to the state of the ledger transaction when the ledger entry was created. One
             * of `pending`, `posted`, or `archived`.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The ledger account that this ledger entry is associated with. */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /** The ledger account that this ledger entry is associated with. */
            @JsonProperty("ledger_account_id")
            @ExcludeMissing
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
                ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            @JsonProperty("ledger_account_lock_version")
            @ExcludeMissing
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
                this.ledgerAccountLockVersion = ledgerAccountLockVersion
            }

            /** The currency of the ledger account. */
            fun ledgerAccountCurrency(ledgerAccountCurrency: String) =
                ledgerAccountCurrency(JsonField.of(ledgerAccountCurrency))

            /** The currency of the ledger account. */
            @JsonProperty("ledger_account_currency")
            @ExcludeMissing
            fun ledgerAccountCurrency(ledgerAccountCurrency: JsonField<String>) = apply {
                this.ledgerAccountCurrency = ledgerAccountCurrency
            }

            /** The currency exponent of the ledger account. */
            fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: Long) =
                ledgerAccountCurrencyExponent(JsonField.of(ledgerAccountCurrencyExponent))

            /** The currency exponent of the ledger account. */
            @JsonProperty("ledger_account_currency_exponent")
            @ExcludeMissing
            fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: JsonField<Long>) =
                apply {
                    this.ledgerAccountCurrencyExponent = ledgerAccountCurrencyExponent
                }

            /** The ledger transaction that this ledger entry is associated with. */
            fun ledgerTransactionId(ledgerTransactionId: String) =
                ledgerTransactionId(JsonField.of(ledgerTransactionId))

            /** The ledger transaction that this ledger entry is associated with. */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                this.ledgerTransactionId = ledgerTransactionId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The pending, posted, and available balances for this ledger entry's ledger account.
             * The posted balance is the sum of all posted entries on the account. The pending
             * balance is the sum of all pending and posted entries on the account. The available
             * balance is the posted incoming entries minus the sum of the pending and posted
             * outgoing amounts. Please see
             * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
             * details.
             */
            fun resultingLedgerAccountBalances(resultingLedgerAccountBalances: LedgerBalances) =
                resultingLedgerAccountBalances(JsonField.of(resultingLedgerAccountBalances))

            /**
             * The pending, posted, and available balances for this ledger entry's ledger account.
             * The posted balance is the sum of all posted entries on the account. The pending
             * balance is the sum of all pending and posted entries on the account. The available
             * balance is the posted incoming entries minus the sum of the pending and posted
             * outgoing amounts. Please see
             * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
             * details.
             */
            @JsonProperty("resulting_ledger_account_balances")
            @ExcludeMissing
            fun resultingLedgerAccountBalances(
                resultingLedgerAccountBalances: JsonField<LedgerBalances>
            ) = apply { this.resultingLedgerAccountBalances = resultingLedgerAccountBalances }

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

            fun build(): LedgerEntryOfTransactionVersion =
                LedgerEntryOfTransactionVersion(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    amount,
                    direction,
                    status,
                    ledgerAccountId,
                    ledgerAccountLockVersion,
                    ledgerAccountCurrency,
                    ledgerAccountCurrencyExponent,
                    ledgerTransactionId,
                    metadata,
                    resultingLedgerAccountBalances,
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }

        /**
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        @JsonDeserialize(builder = LedgerBalances.Builder::class)
        @NoAutoDetect
        class LedgerBalances
        private constructor(
            private val pendingBalance: JsonField<LedgerBalance>,
            private val postedBalance: JsonField<LedgerBalance>,
            private val availableBalance: JsonField<LedgerBalance>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The pending_balance is the sum of all pending and posted entries. */
            fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

            /** The posted_balance is the sum of all posted entries. */
            fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(): LedgerBalance =
                availableBalance.getRequired("available_balance")

            /** The pending_balance is the sum of all pending and posted entries. */
            @JsonProperty("pending_balance") @ExcludeMissing fun _pendingBalance() = pendingBalance

            /** The posted_balance is the sum of all posted entries. */
            @JsonProperty("posted_balance") @ExcludeMissing fun _postedBalance() = postedBalance

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun _availableBalance() = availableBalance

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LedgerBalances = apply {
                if (!validated) {
                    pendingBalance().validate()
                    postedBalance().validate()
                    availableBalance().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerBalances &&
                    this.pendingBalance == other.pendingBalance &&
                    this.postedBalance == other.postedBalance &&
                    this.availableBalance == other.availableBalance &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            pendingBalance,
                            postedBalance,
                            availableBalance,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerBalances{pendingBalance=$pendingBalance, postedBalance=$postedBalance, availableBalance=$availableBalance, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var pendingBalance: JsonField<LedgerBalance> = JsonMissing.of()
                private var postedBalance: JsonField<LedgerBalance> = JsonMissing.of()
                private var availableBalance: JsonField<LedgerBalance> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerBalances: LedgerBalances) = apply {
                    this.pendingBalance = ledgerBalances.pendingBalance
                    this.postedBalance = ledgerBalances.postedBalance
                    this.availableBalance = ledgerBalances.availableBalance
                    additionalProperties(ledgerBalances.additionalProperties)
                }

                /** The pending_balance is the sum of all pending and posted entries. */
                fun pendingBalance(pendingBalance: LedgerBalance) =
                    pendingBalance(JsonField.of(pendingBalance))

                /** The pending_balance is the sum of all pending and posted entries. */
                @JsonProperty("pending_balance")
                @ExcludeMissing
                fun pendingBalance(pendingBalance: JsonField<LedgerBalance>) = apply {
                    this.pendingBalance = pendingBalance
                }

                /** The posted_balance is the sum of all posted entries. */
                fun postedBalance(postedBalance: LedgerBalance) =
                    postedBalance(JsonField.of(postedBalance))

                /** The posted_balance is the sum of all posted entries. */
                @JsonProperty("posted_balance")
                @ExcludeMissing
                fun postedBalance(postedBalance: JsonField<LedgerBalance>) = apply {
                    this.postedBalance = postedBalance
                }

                /**
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
                 */
                fun availableBalance(availableBalance: LedgerBalance) =
                    availableBalance(JsonField.of(availableBalance))

                /**
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
                 */
                @JsonProperty("available_balance")
                @ExcludeMissing
                fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                    this.availableBalance = availableBalance
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerBalances =
                    LedgerBalances(
                        pendingBalance,
                        postedBalance,
                        availableBalance,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** The pending_balance is the sum of all pending and posted entries. */
            @JsonDeserialize(builder = LedgerBalance.Builder::class)
            @NoAutoDetect
            class LedgerBalance
            private constructor(
                private val credits: JsonField<Long>,
                private val debits: JsonField<Long>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val currencyExponent: JsonField<Long>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun credits(): Long = credits.getRequired("credits")

                fun debits(): Long = debits.getRequired("debits")

                fun amount(): Long = amount.getRequired("amount")

                /** The currency of the ledger account. */
                fun currency(): String = currency.getRequired("currency")

                /** The currency exponent of the ledger account. */
                fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

                @JsonProperty("credits") @ExcludeMissing fun _credits() = credits

                @JsonProperty("debits") @ExcludeMissing fun _debits() = debits

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The currency of the ledger account. */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The currency exponent of the ledger account. */
                @JsonProperty("currency_exponent")
                @ExcludeMissing
                fun _currencyExponent() = currencyExponent

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): LedgerBalance = apply {
                    if (!validated) {
                        credits()
                        debits()
                        amount()
                        currency()
                        currencyExponent()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerBalance &&
                        this.credits == other.credits &&
                        this.debits == other.debits &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.currencyExponent == other.currencyExponent &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                credits,
                                debits,
                                amount,
                                currency,
                                currencyExponent,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "LedgerBalance{credits=$credits, debits=$debits, amount=$amount, currency=$currency, currencyExponent=$currencyExponent, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var credits: JsonField<Long> = JsonMissing.of()
                    private var debits: JsonField<Long> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<String> = JsonMissing.of()
                    private var currencyExponent: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerBalance: LedgerBalance) = apply {
                        this.credits = ledgerBalance.credits
                        this.debits = ledgerBalance.debits
                        this.amount = ledgerBalance.amount
                        this.currency = ledgerBalance.currency
                        this.currencyExponent = ledgerBalance.currencyExponent
                        additionalProperties(ledgerBalance.additionalProperties)
                    }

                    fun credits(credits: Long) = credits(JsonField.of(credits))

                    @JsonProperty("credits")
                    @ExcludeMissing
                    fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

                    fun debits(debits: Long) = debits(JsonField.of(debits))

                    @JsonProperty("debits")
                    @ExcludeMissing
                    fun debits(debits: JsonField<Long>) = apply { this.debits = debits }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The currency of the ledger account. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /** The currency of the ledger account. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(currencyExponent: Long) =
                        currencyExponent(JsonField.of(currencyExponent))

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                        this.currencyExponent = currencyExponent
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): LedgerBalance =
                        LedgerBalance(
                            credits,
                            debits,
                            amount,
                            currency,
                            currencyExponent,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }

    class LedgerableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerableType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

            val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

            val INCOMING_PAYMENT_DETAIL = LedgerableType(JsonField.of("incoming_payment_detail"))

            val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

            val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

            val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

            val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

            val PAYMENT_ORDER_ATTEMPT = LedgerableType(JsonField.of("payment_order_attempt"))

            val RETURN = LedgerableType(JsonField.of("return"))

            val REVERSAL = LedgerableType(JsonField.of("reversal"))

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LINE_ITEM,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            COUNTERPARTY,
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            INTERNAL_ACCOUNT,
            LINE_ITEM,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COUNTERPARTY -> Value.COUNTERPARTY
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                LINE_ITEM -> Value.LINE_ITEM
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COUNTERPARTY -> Known.COUNTERPARTY
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                LINE_ITEM -> Known.LINE_ITEM
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
