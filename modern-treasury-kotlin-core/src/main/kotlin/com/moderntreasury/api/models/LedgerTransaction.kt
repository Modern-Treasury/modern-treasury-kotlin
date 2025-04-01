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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LedgerTransaction
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val effectiveDate: JsonField<LocalDate>,
    private val externalId: JsonField<String>,
    private val ledgerEntries: JsonField<List<LedgerEntry>>,
    private val ledgerId: JsonField<String>,
    private val ledgerableId: JsonField<String>,
    private val ledgerableType: JsonField<LedgerableType>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val partiallyPostsLedgerTransactionId: JsonField<String>,
    private val postedAt: JsonField<OffsetDateTime>,
    private val reversedByLedgerTransactionId: JsonField<String>,
    private val reversesLedgerTransactionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_at")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_entries")
        @ExcludeMissing
        ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of(),
        @JsonProperty("ledger_id") @ExcludeMissing ledgerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        ledgerableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partially_posts_ledger_transaction_id")
        @ExcludeMissing
        partiallyPostsLedgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("posted_at")
        @ExcludeMissing
        postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reversed_by_ledger_transaction_id")
        @ExcludeMissing
        reversedByLedgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reverses_ledger_transaction_id")
        @ExcludeMissing
        reversesLedgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        effectiveAt,
        effectiveDate,
        externalId,
        ledgerEntries,
        ledgerId,
        ledgerableId,
        ledgerableType,
        liveMode,
        metadata,
        object_,
        partiallyPostsLedgerTransactionId,
        postedAt,
        reversedByLedgerTransactionId,
        reversesLedgerTransactionId,
        status,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /**
     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * A unique string to represent the ledger transaction. Only one pending or posted ledger
     * transaction may have this ID in the ledger.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalId(): String? = externalId.getNullable("external_id")

    /**
     * An array of ledger entry objects.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerEntries(): List<LedgerEntry> = ledgerEntries.getRequired("ledger_entries")

    /**
     * The ID of the ledger this ledger transaction belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the id will
     * be populated here, otherwise null.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The ID of the ledger transaction that this ledger transaction partially posts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partiallyPostsLedgerTransactionId(): String? =
        partiallyPostsLedgerTransactionId.getNullable("partially_posts_ledger_transaction_id")

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postedAt(): OffsetDateTime? = postedAt.getNullable("posted_at")

    /**
     * The ID of the ledger transaction that reversed this ledger transaction.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reversedByLedgerTransactionId(): String? =
        reversedByLedgerTransactionId.getNullable("reversed_by_ledger_transaction_id")

    /**
     * The ID of the original ledger transaction that this ledger transaction reverses.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reversesLedgerTransactionId(): String? =
        reversesLedgerTransactionId.getNullable("reverses_ledger_transaction_id")

    /**
     * To post a ledger transaction at creation, use `posted`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_at")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [ledgerEntries].
     *
     * Unlike [ledgerEntries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_entries")
    @ExcludeMissing
    fun _ledgerEntries(): JsonField<List<LedgerEntry>> = ledgerEntries

    /**
     * Returns the raw JSON value of [ledgerId].
     *
     * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    /**
     * Returns the raw JSON value of [ledgerableId].
     *
     * Unlike [ledgerableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    fun _ledgerableId(): JsonField<String> = ledgerableId

    /**
     * Returns the raw JSON value of [ledgerableType].
     *
     * Unlike [ledgerableType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [partiallyPostsLedgerTransactionId].
     *
     * Unlike [partiallyPostsLedgerTransactionId], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("partially_posts_ledger_transaction_id")
    @ExcludeMissing
    fun _partiallyPostsLedgerTransactionId(): JsonField<String> = partiallyPostsLedgerTransactionId

    /**
     * Returns the raw JSON value of [postedAt].
     *
     * Unlike [postedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posted_at") @ExcludeMissing fun _postedAt(): JsonField<OffsetDateTime> = postedAt

    /**
     * Returns the raw JSON value of [reversedByLedgerTransactionId].
     *
     * Unlike [reversedByLedgerTransactionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reversed_by_ledger_transaction_id")
    @ExcludeMissing
    fun _reversedByLedgerTransactionId(): JsonField<String> = reversedByLedgerTransactionId

    /**
     * Returns the raw JSON value of [reversesLedgerTransactionId].
     *
     * Unlike [reversesLedgerTransactionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reverses_ledger_transaction_id")
    @ExcludeMissing
    fun _reversesLedgerTransactionId(): JsonField<String> = reversesLedgerTransactionId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [LedgerTransaction].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .description()
         * .effectiveAt()
         * .effectiveDate()
         * .externalId()
         * .ledgerEntries()
         * .ledgerId()
         * .ledgerableId()
         * .ledgerableType()
         * .liveMode()
         * .metadata()
         * .object_()
         * .partiallyPostsLedgerTransactionId()
         * .postedAt()
         * .reversedByLedgerTransactionId()
         * .reversesLedgerTransactionId()
         * .status()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var externalId: JsonField<String>? = null
        private var ledgerEntries: JsonField<MutableList<LedgerEntry>>? = null
        private var ledgerId: JsonField<String>? = null
        private var ledgerableId: JsonField<String>? = null
        private var ledgerableType: JsonField<LedgerableType>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var partiallyPostsLedgerTransactionId: JsonField<String>? = null
        private var postedAt: JsonField<OffsetDateTime>? = null
        private var reversedByLedgerTransactionId: JsonField<String>? = null
        private var reversesLedgerTransactionId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerTransaction: LedgerTransaction) = apply {
            id = ledgerTransaction.id
            createdAt = ledgerTransaction.createdAt
            description = ledgerTransaction.description
            effectiveAt = ledgerTransaction.effectiveAt
            effectiveDate = ledgerTransaction.effectiveDate
            externalId = ledgerTransaction.externalId
            ledgerEntries = ledgerTransaction.ledgerEntries.map { it.toMutableList() }
            ledgerId = ledgerTransaction.ledgerId
            ledgerableId = ledgerTransaction.ledgerableId
            ledgerableType = ledgerTransaction.ledgerableType
            liveMode = ledgerTransaction.liveMode
            metadata = ledgerTransaction.metadata
            object_ = ledgerTransaction.object_
            partiallyPostsLedgerTransactionId = ledgerTransaction.partiallyPostsLedgerTransactionId
            postedAt = ledgerTransaction.postedAt
            reversedByLedgerTransactionId = ledgerTransaction.reversedByLedgerTransactionId
            reversesLedgerTransactionId = ledgerTransaction.reversesLedgerTransactionId
            status = ledgerTransaction.status
            updatedAt = ledgerTransaction.updatedAt
            additionalProperties = ledgerTransaction.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An optional description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** An array of ledger entry objects. */
        fun ledgerEntries(ledgerEntries: List<LedgerEntry>) =
            ledgerEntries(JsonField.of(ledgerEntries))

        /**
         * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerEntries] with a well-typed `List<LedgerEntry>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntry>>) = apply {
            this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
        }

        /**
         * Adds a single [LedgerEntry] to [ledgerEntries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedgerEntry(ledgerEntry: LedgerEntry) = apply {
            ledgerEntries =
                (ledgerEntries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ledgerEntries", it).add(ledgerEntry)
                }
        }

        /** The ID of the ledger this ledger transaction belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /**
         * Sets [Builder.ledgerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: String?) = ledgerableId(JsonField.ofNullable(ledgerableId))

        /**
         * Sets [Builder.ledgerableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            this.ledgerableId = ledgerableId
        }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType?) =
            ledgerableType(JsonField.ofNullable(ledgerableType))

        /**
         * Sets [Builder.ledgerableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerableType] with a well-typed [LedgerableType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
            this.ledgerableType = ledgerableType
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The ID of the ledger transaction that this ledger transaction partially posts. */
        fun partiallyPostsLedgerTransactionId(partiallyPostsLedgerTransactionId: String?) =
            partiallyPostsLedgerTransactionId(
                JsonField.ofNullable(partiallyPostsLedgerTransactionId)
            )

        /**
         * Sets [Builder.partiallyPostsLedgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partiallyPostsLedgerTransactionId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun partiallyPostsLedgerTransactionId(
            partiallyPostsLedgerTransactionId: JsonField<String>
        ) = apply { this.partiallyPostsLedgerTransactionId = partiallyPostsLedgerTransactionId }

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        fun postedAt(postedAt: OffsetDateTime?) = postedAt(JsonField.ofNullable(postedAt))

        /**
         * Sets [Builder.postedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply { this.postedAt = postedAt }

        /** The ID of the ledger transaction that reversed this ledger transaction. */
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: String?) =
            reversedByLedgerTransactionId(JsonField.ofNullable(reversedByLedgerTransactionId))

        /**
         * Sets [Builder.reversedByLedgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversedByLedgerTransactionId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: JsonField<String>) =
            apply {
                this.reversedByLedgerTransactionId = reversedByLedgerTransactionId
            }

        /** The ID of the original ledger transaction that this ledger transaction reverses. */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: String?) =
            reversesLedgerTransactionId(JsonField.ofNullable(reversesLedgerTransactionId))

        /**
         * Sets [Builder.reversesLedgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reversesLedgerTransactionId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: JsonField<String>) = apply {
            this.reversesLedgerTransactionId = reversesLedgerTransactionId
        }

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [LedgerTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .description()
         * .effectiveAt()
         * .effectiveDate()
         * .externalId()
         * .ledgerEntries()
         * .ledgerId()
         * .ledgerableId()
         * .ledgerableType()
         * .liveMode()
         * .metadata()
         * .object_()
         * .partiallyPostsLedgerTransactionId()
         * .postedAt()
         * .reversedByLedgerTransactionId()
         * .reversesLedgerTransactionId()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerTransaction =
            LedgerTransaction(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("externalId", externalId),
                checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                checkRequired("ledgerId", ledgerId),
                checkRequired("ledgerableId", ledgerableId),
                checkRequired("ledgerableType", ledgerableType),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired(
                    "partiallyPostsLedgerTransactionId",
                    partiallyPostsLedgerTransactionId,
                ),
                checkRequired("postedAt", postedAt),
                checkRequired("reversedByLedgerTransactionId", reversedByLedgerTransactionId),
                checkRequired("reversesLedgerTransactionId", reversesLedgerTransactionId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        effectiveAt()
        effectiveDate()
        externalId()
        ledgerEntries().forEach { it.validate() }
        ledgerId()
        ledgerableId()
        ledgerableType()?.validate()
        liveMode()
        metadata().validate()
        object_()
        partiallyPostsLedgerTransactionId()
        postedAt()
        reversedByLedgerTransactionId()
        reversesLedgerTransactionId()
        status().validate()
        updatedAt()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (effectiveAt.asKnown() == null) 0 else 1) +
            (if (effectiveDate.asKnown() == null) 0 else 1) +
            (if (externalId.asKnown() == null) 0 else 1) +
            (ledgerEntries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (ledgerId.asKnown() == null) 0 else 1) +
            (if (ledgerableId.asKnown() == null) 0 else 1) +
            (ledgerableType.asKnown()?.validity() ?: 0) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (object_.asKnown() == null) 0 else 1) +
            (if (partiallyPostsLedgerTransactionId.asKnown() == null) 0 else 1) +
            (if (postedAt.asKnown() == null) 0 else 1) +
            (if (reversedByLedgerTransactionId.asKnown() == null) 0 else 1) +
            (if (reversesLedgerTransactionId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     */
    class LedgerableType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val EXPECTED_PAYMENT = of("expected_payment")

            val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            val PAPER_ITEM = of("paper_item")

            val PAYMENT_ORDER = of("payment_order")

            val RETURN = of("return")

            val REVERSAL = of("reversal")

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        /** An enum containing [LedgerableType]'s known values. */
        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        /**
         * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            /**
             * An enum member indicating that [LedgerableType] was instantiated with an unknown
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
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
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
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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

        fun validate(): LedgerableType = apply {
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

            return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    /** To post a ledger transaction at creation, use `posted`. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val PENDING = of("pending")

            val POSTED = of("posted")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ARCHIVED,
            PENDING,
            POSTED,
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
            PENDING,
            POSTED,
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
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
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
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerTransaction && id == other.id && createdAt == other.createdAt && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerEntries == other.ledgerEntries && ledgerId == other.ledgerId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && partiallyPostsLedgerTransactionId == other.partiallyPostsLedgerTransactionId && postedAt == other.postedAt && reversedByLedgerTransactionId == other.reversedByLedgerTransactionId && reversesLedgerTransactionId == other.reversesLedgerTransactionId && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, effectiveAt, effectiveDate, externalId, ledgerEntries, ledgerId, ledgerableId, ledgerableType, liveMode, metadata, object_, partiallyPostsLedgerTransactionId, postedAt, reversedByLedgerTransactionId, reversesLedgerTransactionId, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerTransaction{id=$id, createdAt=$createdAt, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerEntries=$ledgerEntries, ledgerId=$ledgerId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, liveMode=$liveMode, metadata=$metadata, object_=$object_, partiallyPostsLedgerTransactionId=$partiallyPostsLedgerTransactionId, postedAt=$postedAt, reversedByLedgerTransactionId=$reversedByLedgerTransactionId, reversesLedgerTransactionId=$reversesLedgerTransactionId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
