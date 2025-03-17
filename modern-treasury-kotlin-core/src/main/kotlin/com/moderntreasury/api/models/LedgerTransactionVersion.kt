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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerTransactionVersion
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_entries")
    @ExcludeMissing
    private val ledgerEntries: JsonField<List<LedgerEntryOfTransactionVersion>> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    private val ledgerableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("partially_posts_ledger_transaction_id")
    @ExcludeMissing
    private val partiallyPostsLedgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("posted_at")
    @ExcludeMissing
    private val postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("reversed_by_ledger_transaction_id")
    @ExcludeMissing
    private val reversedByLedgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reverses_ledger_transaction_id")
    @ExcludeMissing
    private val reversesLedgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    fun ledgerEntries(): List<LedgerEntryOfTransactionVersion> =
        ledgerEntries.getRequired("ledger_entries")

    /**
     * The ID of the ledger this ledger transaction belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * The ID of the ledger transaction
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): String = ledgerTransactionId.getRequired("ledger_transaction_id")

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
     * incoming_payment_detail, expected_payment, return, or reversal.
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
     * The ID of the original ledger transaction. that this ledger transaction reverses.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reversesLedgerTransactionId(): String? =
        reversesLedgerTransactionId.getNullable("reverses_ledger_transaction_id")

    /**
     * One of `pending`, `posted`, or `archived`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Version number of the ledger transaction.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

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
    fun _ledgerEntries(): JsonField<List<LedgerEntryOfTransactionVersion>> = ledgerEntries

    /**
     * Returns the raw JSON value of [ledgerId].
     *
     * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    /**
     * Returns the raw JSON value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

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
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerTransactionVersion = apply {
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
        ledgerTransactionId()
        ledgerableId()
        ledgerableType()
        liveMode()
        metadata().validate()
        object_()
        partiallyPostsLedgerTransactionId()
        postedAt()
        reversedByLedgerTransactionId()
        reversesLedgerTransactionId()
        status()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerTransactionVersion].
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
         * .ledgerTransactionId()
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
         * .version()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerTransactionVersion]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var externalId: JsonField<String>? = null
        private var ledgerEntries: JsonField<MutableList<LedgerEntryOfTransactionVersion>>? = null
        private var ledgerId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
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
        private var version: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerTransactionVersion: LedgerTransactionVersion) = apply {
            id = ledgerTransactionVersion.id
            createdAt = ledgerTransactionVersion.createdAt
            description = ledgerTransactionVersion.description
            effectiveAt = ledgerTransactionVersion.effectiveAt
            effectiveDate = ledgerTransactionVersion.effectiveDate
            externalId = ledgerTransactionVersion.externalId
            ledgerEntries = ledgerTransactionVersion.ledgerEntries.map { it.toMutableList() }
            ledgerId = ledgerTransactionVersion.ledgerId
            ledgerTransactionId = ledgerTransactionVersion.ledgerTransactionId
            ledgerableId = ledgerTransactionVersion.ledgerableId
            ledgerableType = ledgerTransactionVersion.ledgerableType
            liveMode = ledgerTransactionVersion.liveMode
            metadata = ledgerTransactionVersion.metadata
            object_ = ledgerTransactionVersion.object_
            partiallyPostsLedgerTransactionId =
                ledgerTransactionVersion.partiallyPostsLedgerTransactionId
            postedAt = ledgerTransactionVersion.postedAt
            reversedByLedgerTransactionId = ledgerTransactionVersion.reversedByLedgerTransactionId
            reversesLedgerTransactionId = ledgerTransactionVersion.reversesLedgerTransactionId
            status = ledgerTransactionVersion.status
            version = ledgerTransactionVersion.version
            additionalProperties = ledgerTransactionVersion.additionalProperties.toMutableMap()
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
        fun ledgerEntries(ledgerEntries: List<LedgerEntryOfTransactionVersion>) =
            ledgerEntries(JsonField.of(ledgerEntries))

        /**
         * Sets [Builder.ledgerEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerEntries] with a well-typed
         * `List<LedgerEntryOfTransactionVersion>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryOfTransactionVersion>>) = apply {
            this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
        }

        /**
         * Adds a single [LedgerEntryOfTransactionVersion] to [ledgerEntries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLedgerEntry(ledgerEntry: LedgerEntryOfTransactionVersion) = apply {
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

        /** The ID of the ledger transaction */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /**
         * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

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
         * incoming_payment_detail, expected_payment, return, or reversal.
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

        /** The ID of the original ledger transaction. that this ledger transaction reverses. */
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

        /** One of `pending`, `posted`, or `archived`. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Version number of the ledger transaction. */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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
         * Returns an immutable instance of [LedgerTransactionVersion].
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
         * .ledgerTransactionId()
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
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerTransactionVersion =
            LedgerTransactionVersion(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("externalId", externalId),
                checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                checkRequired("ledgerId", ledgerId),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
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
                checkRequired("version", version),
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class LedgerEntryOfTransactionVersion
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
        @JsonProperty("ledger_account_currency")
        @ExcludeMissing
        private val ledgerAccountCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_account_currency_exponent")
        @ExcludeMissing
        private val ledgerAccountCurrencyExponent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        private val ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("resulting_ledger_account_balances")
        @ExcludeMissing
        private val resultingLedgerAccountBalances: JsonField<LedgerBalances> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): TransactionDirection = direction.getRequired("direction")

        /**
         * The currency of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerAccountCurrency(): String =
            ledgerAccountCurrency.getRequired("ledger_account_currency")

        /**
         * The currency exponent of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerAccountCurrencyExponent(): Long =
            ledgerAccountCurrencyExponent.getRequired("ledger_account_currency_exponent")

        /**
         * The ledger account that this ledger entry is associated with.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccountLockVersion(): Long? =
            ledgerAccountLockVersion.getNullable("ledger_account_lock_version")

        /**
         * The ledger transaction that this ledger entry is associated with.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerTransactionId(): String = ledgerTransactionId.getRequired("ledger_transaction_id")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
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
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun resultingLedgerAccountBalances(): LedgerBalances? =
            resultingLedgerAccountBalances.getNullable("resulting_ledger_account_balances")

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<TransactionDirection> = direction

        /**
         * Returns the raw JSON value of [ledgerAccountCurrency].
         *
         * Unlike [ledgerAccountCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_currency")
        @ExcludeMissing
        fun _ledgerAccountCurrency(): JsonField<String> = ledgerAccountCurrency

        /**
         * Returns the raw JSON value of [ledgerAccountCurrencyExponent].
         *
         * Unlike [ledgerAccountCurrencyExponent], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("ledger_account_currency_exponent")
        @ExcludeMissing
        fun _ledgerAccountCurrencyExponent(): JsonField<Long> = ledgerAccountCurrencyExponent

        /**
         * Returns the raw JSON value of [ledgerAccountId].
         *
         * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

        /**
         * Returns the raw JSON value of [ledgerAccountLockVersion].
         *
         * Unlike [ledgerAccountLockVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun _ledgerAccountLockVersion(): JsonField<Long> = ledgerAccountLockVersion

        /**
         * Returns the raw JSON value of [ledgerTransactionId].
         *
         * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

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
         * Returns the raw JSON value of [resultingLedgerAccountBalances].
         *
         * Unlike [resultingLedgerAccountBalances], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("resulting_ledger_account_balances")
        @ExcludeMissing
        fun _resultingLedgerAccountBalances(): JsonField<LedgerBalances> =
            resultingLedgerAccountBalances

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerEntryOfTransactionVersion = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            direction()
            ledgerAccountCurrency()
            ledgerAccountCurrencyExponent()
            ledgerAccountId()
            ledgerAccountLockVersion()
            ledgerTransactionId()
            liveMode()
            metadata().validate()
            object_()
            resultingLedgerAccountBalances()?.validate()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LedgerEntryOfTransactionVersion].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .direction()
             * .ledgerAccountCurrency()
             * .ledgerAccountCurrencyExponent()
             * .ledgerAccountId()
             * .ledgerAccountLockVersion()
             * .ledgerTransactionId()
             * .liveMode()
             * .metadata()
             * .object_()
             * .resultingLedgerAccountBalances()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LedgerEntryOfTransactionVersion]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var direction: JsonField<TransactionDirection>? = null
            private var ledgerAccountCurrency: JsonField<String>? = null
            private var ledgerAccountCurrencyExponent: JsonField<Long>? = null
            private var ledgerAccountId: JsonField<String>? = null
            private var ledgerAccountLockVersion: JsonField<Long>? = null
            private var ledgerTransactionId: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var metadata: JsonField<Metadata>? = null
            private var object_: JsonField<String>? = null
            private var resultingLedgerAccountBalances: JsonField<LedgerBalances>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerEntryOfTransactionVersion: LedgerEntryOfTransactionVersion) =
                apply {
                    id = ledgerEntryOfTransactionVersion.id
                    amount = ledgerEntryOfTransactionVersion.amount
                    createdAt = ledgerEntryOfTransactionVersion.createdAt
                    direction = ledgerEntryOfTransactionVersion.direction
                    ledgerAccountCurrency = ledgerEntryOfTransactionVersion.ledgerAccountCurrency
                    ledgerAccountCurrencyExponent =
                        ledgerEntryOfTransactionVersion.ledgerAccountCurrencyExponent
                    ledgerAccountId = ledgerEntryOfTransactionVersion.ledgerAccountId
                    ledgerAccountLockVersion =
                        ledgerEntryOfTransactionVersion.ledgerAccountLockVersion
                    ledgerTransactionId = ledgerEntryOfTransactionVersion.ledgerTransactionId
                    liveMode = ledgerEntryOfTransactionVersion.liveMode
                    metadata = ledgerEntryOfTransactionVersion.metadata
                    object_ = ledgerEntryOfTransactionVersion.object_
                    resultingLedgerAccountBalances =
                        ledgerEntryOfTransactionVersion.resultingLedgerAccountBalances
                    status = ledgerEntryOfTransactionVersion.status
                    additionalProperties =
                        ledgerEntryOfTransactionVersion.additionalProperties.toMutableMap()
                }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [TransactionDirection]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun direction(direction: JsonField<TransactionDirection>) = apply {
                this.direction = direction
            }

            /** The currency of the ledger account. */
            fun ledgerAccountCurrency(ledgerAccountCurrency: String) =
                ledgerAccountCurrency(JsonField.of(ledgerAccountCurrency))

            /**
             * Sets [Builder.ledgerAccountCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountCurrency] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerAccountCurrency(ledgerAccountCurrency: JsonField<String>) = apply {
                this.ledgerAccountCurrency = ledgerAccountCurrency
            }

            /** The currency exponent of the ledger account. */
            fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: Long) =
                ledgerAccountCurrencyExponent(JsonField.of(ledgerAccountCurrencyExponent))

            /**
             * Sets [Builder.ledgerAccountCurrencyExponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountCurrencyExponent] with a well-typed
             * [Long] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: JsonField<Long>) =
                apply {
                    this.ledgerAccountCurrencyExponent = ledgerAccountCurrencyExponent
                }

            /** The ledger account that this ledger entry is associated with. */
            fun ledgerAccountId(ledgerAccountId: String) =
                ledgerAccountId(JsonField.of(ledgerAccountId))

            /**
             * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                this.ledgerAccountId = ledgerAccountId
            }

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long?) =
                ledgerAccountLockVersion(JsonField.ofNullable(ledgerAccountLockVersion))

            /**
             * Alias for [Builder.ledgerAccountLockVersion].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
                ledgerAccountLockVersion(ledgerAccountLockVersion as Long?)

            /**
             * Sets [Builder.ledgerAccountLockVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountLockVersion] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
                this.ledgerAccountLockVersion = ledgerAccountLockVersion
            }

            /** The ledger transaction that this ledger entry is associated with. */
            fun ledgerTransactionId(ledgerTransactionId: String) =
                ledgerTransactionId(JsonField.of(ledgerTransactionId))

            /**
             * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                this.ledgerTransactionId = ledgerTransactionId
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * The pending, posted, and available balances for this ledger entry's ledger account.
             * The posted balance is the sum of all posted entries on the account. The pending
             * balance is the sum of all pending and posted entries on the account. The available
             * balance is the posted incoming entries minus the sum of the pending and posted
             * outgoing amounts. Please see
             * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
             * details.
             */
            fun resultingLedgerAccountBalances(resultingLedgerAccountBalances: LedgerBalances?) =
                resultingLedgerAccountBalances(JsonField.ofNullable(resultingLedgerAccountBalances))

            /**
             * Sets [Builder.resultingLedgerAccountBalances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resultingLedgerAccountBalances] with a well-typed
             * [LedgerBalances] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun resultingLedgerAccountBalances(
                resultingLedgerAccountBalances: JsonField<LedgerBalances>
            ) = apply { this.resultingLedgerAccountBalances = resultingLedgerAccountBalances }

            /**
             * Equal to the state of the ledger transaction when the ledger entry was created. One
             * of `pending`, `posted`, or `archived`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [LedgerEntryOfTransactionVersion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .direction()
             * .ledgerAccountCurrency()
             * .ledgerAccountCurrencyExponent()
             * .ledgerAccountId()
             * .ledgerAccountLockVersion()
             * .ledgerTransactionId()
             * .liveMode()
             * .metadata()
             * .object_()
             * .resultingLedgerAccountBalances()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerEntryOfTransactionVersion =
                LedgerEntryOfTransactionVersion(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("direction", direction),
                    checkRequired("ledgerAccountCurrency", ledgerAccountCurrency),
                    checkRequired("ledgerAccountCurrencyExponent", ledgerAccountCurrencyExponent),
                    checkRequired("ledgerAccountId", ledgerAccountId),
                    checkRequired("ledgerAccountLockVersion", ledgerAccountLockVersion),
                    checkRequired("ledgerTransactionId", ledgerTransactionId),
                    checkRequired("liveMode", liveMode),
                    checkRequired("metadata", metadata),
                    checkRequired("object_", object_),
                    checkRequired("resultingLedgerAccountBalances", resultingLedgerAccountBalances),
                    checkRequired("status", status),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        @NoAutoDetect
        class LedgerBalances
        @JsonCreator
        private constructor(
            @JsonProperty("available_balance")
            @ExcludeMissing
            private val availableBalance: JsonField<LedgerBalance> = JsonMissing.of(),
            @JsonProperty("pending_balance")
            @ExcludeMissing
            private val pendingBalance: JsonField<LedgerBalance> = JsonMissing.of(),
            @JsonProperty("posted_balance")
            @ExcludeMissing
            private val postedBalance: JsonField<LedgerBalance> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun availableBalance(): LedgerBalance =
                availableBalance.getRequired("available_balance")

            /**
             * The pending_balance is the sum of all pending and posted entries.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

            /**
             * The posted_balance is the sum of all posted entries.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

            /**
             * Returns the raw JSON value of [availableBalance].
             *
             * Unlike [availableBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun _availableBalance(): JsonField<LedgerBalance> = availableBalance

            /**
             * Returns the raw JSON value of [pendingBalance].
             *
             * Unlike [pendingBalance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pending_balance")
            @ExcludeMissing
            fun _pendingBalance(): JsonField<LedgerBalance> = pendingBalance

            /**
             * Returns the raw JSON value of [postedBalance].
             *
             * Unlike [postedBalance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("posted_balance")
            @ExcludeMissing
            fun _postedBalance(): JsonField<LedgerBalance> = postedBalance

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerBalances = apply {
                if (validated) {
                    return@apply
                }

                availableBalance().validate()
                pendingBalance().validate()
                postedBalance().validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [LedgerBalances].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .pendingBalance()
                 * .postedBalance()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [LedgerBalances]. */
            class Builder internal constructor() {

                private var availableBalance: JsonField<LedgerBalance>? = null
                private var pendingBalance: JsonField<LedgerBalance>? = null
                private var postedBalance: JsonField<LedgerBalance>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(ledgerBalances: LedgerBalances) = apply {
                    availableBalance = ledgerBalances.availableBalance
                    pendingBalance = ledgerBalances.pendingBalance
                    postedBalance = ledgerBalances.postedBalance
                    additionalProperties = ledgerBalances.additionalProperties.toMutableMap()
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
                 * Sets [Builder.availableBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.availableBalance] with a well-typed
                 * [LedgerBalance] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                    this.availableBalance = availableBalance
                }

                /** The pending_balance is the sum of all pending and posted entries. */
                fun pendingBalance(pendingBalance: LedgerBalance) =
                    pendingBalance(JsonField.of(pendingBalance))

                /**
                 * Sets [Builder.pendingBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pendingBalance] with a well-typed
                 * [LedgerBalance] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun pendingBalance(pendingBalance: JsonField<LedgerBalance>) = apply {
                    this.pendingBalance = pendingBalance
                }

                /** The posted_balance is the sum of all posted entries. */
                fun postedBalance(postedBalance: LedgerBalance) =
                    postedBalance(JsonField.of(postedBalance))

                /**
                 * Sets [Builder.postedBalance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postedBalance] with a well-typed [LedgerBalance]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun postedBalance(postedBalance: JsonField<LedgerBalance>) = apply {
                    this.postedBalance = postedBalance
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LedgerBalances].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .availableBalance()
                 * .pendingBalance()
                 * .postedBalance()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): LedgerBalances =
                    LedgerBalances(
                        checkRequired("availableBalance", availableBalance),
                        checkRequired("pendingBalance", pendingBalance),
                        checkRequired("postedBalance", postedBalance),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            @NoAutoDetect
            class LedgerBalance
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("credits")
                @ExcludeMissing
                private val credits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                private val currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency_exponent")
                @ExcludeMissing
                private val currencyExponent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("debits")
                @ExcludeMissing
                private val debits: JsonField<Long> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun credits(): Long = credits.getRequired("credits")

                /**
                 * The currency of the ledger account.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * The currency exponent of the ledger account.
                 *
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

                /**
                 * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun debits(): Long = debits.getRequired("debits")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [credits].
                 *
                 * Unlike [credits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [currencyExponent].
                 *
                 * Unlike [currencyExponent], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("currency_exponent")
                @ExcludeMissing
                fun _currencyExponent(): JsonField<Long> = currencyExponent

                /**
                 * Returns the raw JSON value of [debits].
                 *
                 * Unlike [debits], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("debits") @ExcludeMissing fun _debits(): JsonField<Long> = debits

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LedgerBalance = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    credits()
                    currency()
                    currencyExponent()
                    debits()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [LedgerBalance].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .credits()
                     * .currency()
                     * .currencyExponent()
                     * .debits()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LedgerBalance]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var credits: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var currencyExponent: JsonField<Long>? = null
                    private var debits: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(ledgerBalance: LedgerBalance) = apply {
                        amount = ledgerBalance.amount
                        credits = ledgerBalance.credits
                        currency = ledgerBalance.currency
                        currencyExponent = ledgerBalance.currencyExponent
                        debits = ledgerBalance.debits
                        additionalProperties = ledgerBalance.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun credits(credits: Long) = credits(JsonField.of(credits))

                    /**
                     * Sets [Builder.credits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.credits] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

                    /** The currency of the ledger account. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(currencyExponent: Long) =
                        currencyExponent(JsonField.of(currencyExponent))

                    /**
                     * Sets [Builder.currencyExponent] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currencyExponent] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                        this.currencyExponent = currencyExponent
                    }

                    fun debits(debits: Long) = debits(JsonField.of(debits))

                    /**
                     * Sets [Builder.debits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.debits] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun debits(debits: JsonField<Long>) = apply { this.debits = debits }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LedgerBalance].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .credits()
                     * .currency()
                     * .currencyExponent()
                     * .debits()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LedgerBalance =
                        LedgerBalance(
                            checkRequired("amount", amount),
                            checkRequired("credits", credits),
                            checkRequired("currency", currency),
                            checkRequired("currencyExponent", currencyExponent),
                            checkRequired("debits", debits),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerBalance && amount == other.amount && credits == other.credits && currency == other.currency && currencyExponent == other.currencyExponent && debits == other.debits && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, credits, currency, currencyExponent, debits, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerBalance{amount=$amount, credits=$credits, currency=$currency, currencyExponent=$currencyExponent, debits=$debits, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerBalances && availableBalance == other.availableBalance && pendingBalance == other.pendingBalance && postedBalance == other.postedBalance && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(availableBalance, pendingBalance, postedBalance, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerBalances{availableBalance=$availableBalance, pendingBalance=$pendingBalance, postedBalance=$postedBalance, additionalProperties=$additionalProperties}"
        }

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ARCHIVED,
                PENDING,
                POSTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw ModernTreasuryInvalidDataException("Value is not a String")

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

            return /* spotless:off */ other is LedgerEntryOfTransactionVersion && id == other.id && amount == other.amount && createdAt == other.createdAt && direction == other.direction && ledgerAccountCurrency == other.ledgerAccountCurrency && ledgerAccountCurrencyExponent == other.ledgerAccountCurrencyExponent && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && resultingLedgerAccountBalances == other.resultingLedgerAccountBalances && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, createdAt, direction, ledgerAccountCurrency, ledgerAccountCurrencyExponent, ledgerAccountId, ledgerAccountLockVersion, ledgerTransactionId, liveMode, metadata, object_, resultingLedgerAccountBalances, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerEntryOfTransactionVersion{id=$id, amount=$amount, createdAt=$createdAt, direction=$direction, ledgerAccountCurrency=$ledgerAccountCurrency, ledgerAccountCurrencyExponent=$ledgerAccountCurrencyExponent, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, resultingLedgerAccountBalances=$resultingLedgerAccountBalances, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, or reversal.
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
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

    /** One of `pending`, `posted`, or `archived`. */
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

        return /* spotless:off */ other is LedgerTransactionVersion && id == other.id && createdAt == other.createdAt && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerEntries == other.ledgerEntries && ledgerId == other.ledgerId && ledgerTransactionId == other.ledgerTransactionId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && partiallyPostsLedgerTransactionId == other.partiallyPostsLedgerTransactionId && postedAt == other.postedAt && reversedByLedgerTransactionId == other.reversedByLedgerTransactionId && reversesLedgerTransactionId == other.reversesLedgerTransactionId && status == other.status && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, effectiveAt, effectiveDate, externalId, ledgerEntries, ledgerId, ledgerTransactionId, ledgerableId, ledgerableType, liveMode, metadata, object_, partiallyPostsLedgerTransactionId, postedAt, reversedByLedgerTransactionId, reversesLedgerTransactionId, status, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerTransactionVersion{id=$id, createdAt=$createdAt, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerEntries=$ledgerEntries, ledgerId=$ledgerId, ledgerTransactionId=$ledgerTransactionId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, liveMode=$liveMode, metadata=$metadata, object_=$object_, partiallyPostsLedgerTransactionId=$partiallyPostsLedgerTransactionId, postedAt=$postedAt, reversedByLedgerTransactionId=$reversedByLedgerTransactionId, reversesLedgerTransactionId=$reversesLedgerTransactionId, status=$status, version=$version, additionalProperties=$additionalProperties}"
}
