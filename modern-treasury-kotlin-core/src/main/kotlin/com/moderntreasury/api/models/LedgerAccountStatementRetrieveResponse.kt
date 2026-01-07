// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LedgerAccountStatementRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val effectiveAtLowerBound: JsonField<OffsetDateTime>,
    private val effectiveAtUpperBound: JsonField<OffsetDateTime>,
    private val endingBalance: JsonField<LedgerBalances>,
    private val ledgerAccountId: JsonField<String>,
    private val ledgerAccountLockVersion: JsonField<Long>,
    private val ledgerAccountNormalBalance: JsonField<TransactionDirection>,
    private val ledgerId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val startingBalance: JsonField<LedgerBalances>,
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
        @JsonProperty("effective_at_lower_bound")
        @ExcludeMissing
        effectiveAtLowerBound: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<LedgerBalances> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ledger_account_normal_balance")
        @ExcludeMissing
        ledgerAccountNormalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
        @JsonProperty("ledger_id") @ExcludeMissing ledgerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<LedgerBalances> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        effectiveAtLowerBound,
        effectiveAtUpperBound,
        endingBalance,
        ledgerAccountId,
        ledgerAccountLockVersion,
        ledgerAccountNormalBalance,
        ledgerId,
        liveMode,
        metadata,
        object_,
        startingBalance,
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
     * The description of the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAtLowerBound(): OffsetDateTime =
        effectiveAtLowerBound.getRequired("effective_at_lower_bound")

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAtUpperBound(): OffsetDateTime =
        effectiveAtUpperBound.getRequired("effective_at_upper_bound")

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): LedgerBalances = endingBalance.getRequired("ending_balance")

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /**
     * Lock version of the ledger account at the time of statement generation.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountLockVersion(): Long =
        ledgerAccountLockVersion.getRequired("ledger_account_lock_version")

    /**
     * The normal balance of the ledger account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountNormalBalance(): TransactionDirection =
        ledgerAccountNormalBalance.getRequired("ledger_account_normal_balance")

    /**
     * The id of the ledger that this ledger account statement belongs to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

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
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): LedgerBalances = startingBalance.getRequired("starting_balance")

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
     * Returns the raw JSON value of [effectiveAtLowerBound].
     *
     * Unlike [effectiveAtLowerBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_at_lower_bound")
    @ExcludeMissing
    fun _effectiveAtLowerBound(): JsonField<OffsetDateTime> = effectiveAtLowerBound

    /**
     * Returns the raw JSON value of [effectiveAtUpperBound].
     *
     * Unlike [effectiveAtUpperBound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<LedgerBalances> = endingBalance

    /**
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [ledgerAccountNormalBalance].
     *
     * Unlike [ledgerAccountNormalBalance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ledger_account_normal_balance")
    @ExcludeMissing
    fun _ledgerAccountNormalBalance(): JsonField<TransactionDirection> = ledgerAccountNormalBalance

    /**
     * Returns the raw JSON value of [ledgerId].
     *
     * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

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
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<LedgerBalances> = startingBalance

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
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountStatementRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .description()
         * .effectiveAtLowerBound()
         * .effectiveAtUpperBound()
         * .endingBalance()
         * .ledgerAccountId()
         * .ledgerAccountLockVersion()
         * .ledgerAccountNormalBalance()
         * .ledgerId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .startingBalance()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerAccountStatementRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var effectiveAtLowerBound: JsonField<OffsetDateTime>? = null
        private var effectiveAtUpperBound: JsonField<OffsetDateTime>? = null
        private var endingBalance: JsonField<LedgerBalances>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var ledgerAccountLockVersion: JsonField<Long>? = null
        private var ledgerAccountNormalBalance: JsonField<TransactionDirection>? = null
        private var ledgerId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var startingBalance: JsonField<LedgerBalances>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerAccountStatementRetrieveResponse: LedgerAccountStatementRetrieveResponse
        ) = apply {
            id = ledgerAccountStatementRetrieveResponse.id
            createdAt = ledgerAccountStatementRetrieveResponse.createdAt
            description = ledgerAccountStatementRetrieveResponse.description
            effectiveAtLowerBound = ledgerAccountStatementRetrieveResponse.effectiveAtLowerBound
            effectiveAtUpperBound = ledgerAccountStatementRetrieveResponse.effectiveAtUpperBound
            endingBalance = ledgerAccountStatementRetrieveResponse.endingBalance
            ledgerAccountId = ledgerAccountStatementRetrieveResponse.ledgerAccountId
            ledgerAccountLockVersion =
                ledgerAccountStatementRetrieveResponse.ledgerAccountLockVersion
            ledgerAccountNormalBalance =
                ledgerAccountStatementRetrieveResponse.ledgerAccountNormalBalance
            ledgerId = ledgerAccountStatementRetrieveResponse.ledgerId
            liveMode = ledgerAccountStatementRetrieveResponse.liveMode
            metadata = ledgerAccountStatementRetrieveResponse.metadata
            object_ = ledgerAccountStatementRetrieveResponse.object_
            startingBalance = ledgerAccountStatementRetrieveResponse.startingBalance
            updatedAt = ledgerAccountStatementRetrieveResponse.updatedAt
            additionalProperties =
                ledgerAccountStatementRetrieveResponse.additionalProperties.toMutableMap()
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

        /** The description of the ledger account statement. */
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
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) =
            effectiveAtLowerBound(JsonField.of(effectiveAtLowerBound))

        /**
         * Sets [Builder.effectiveAtLowerBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtLowerBound] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtLowerBound = effectiveAtLowerBound
        }

        /**
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime) =
            effectiveAtUpperBound(JsonField.of(effectiveAtUpperBound))

        /**
         * Sets [Builder.effectiveAtUpperBound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAtUpperBound] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

        /**
         * The pending, posted, and available balances for this ledger account at the
         * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
         * account. The pending balance is the sum of all pending and posted entries on the account.
         * The available balance is the posted incoming entries minus the sum of the pending and
         * posted outgoing amounts.
         */
        fun endingBalance(endingBalance: LedgerBalances) =
            endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [LedgerBalances] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endingBalance(endingBalance: JsonField<LedgerBalances>) = apply {
            this.endingBalance = endingBalance
        }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
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

        /** Lock version of the ledger account at the time of statement generation. */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
            ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

        /**
         * Sets [Builder.ledgerAccountLockVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountLockVersion] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        /** The normal balance of the ledger account. */
        fun ledgerAccountNormalBalance(ledgerAccountNormalBalance: TransactionDirection) =
            ledgerAccountNormalBalance(JsonField.of(ledgerAccountNormalBalance))

        /**
         * Sets [Builder.ledgerAccountNormalBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountNormalBalance] with a well-typed
         * [TransactionDirection] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun ledgerAccountNormalBalance(
            ledgerAccountNormalBalance: JsonField<TransactionDirection>
        ) = apply { this.ledgerAccountNormalBalance = ledgerAccountNormalBalance }

        /** The id of the ledger that this ledger account statement belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /**
         * Sets [Builder.ledgerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

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

        /**
         * The pending, posted, and available balances for this ledger account at the
         * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
         * account. The pending balance is the sum of all pending and posted entries on the account.
         * The available balance is the posted incoming entries minus the sum of the pending and
         * posted outgoing amounts.
         */
        fun startingBalance(startingBalance: LedgerBalances) =
            startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [LedgerBalances]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun startingBalance(startingBalance: JsonField<LedgerBalances>) = apply {
            this.startingBalance = startingBalance
        }

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
         * Returns an immutable instance of [LedgerAccountStatementRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .description()
         * .effectiveAtLowerBound()
         * .effectiveAtUpperBound()
         * .endingBalance()
         * .ledgerAccountId()
         * .ledgerAccountLockVersion()
         * .ledgerAccountNormalBalance()
         * .ledgerId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .startingBalance()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountStatementRetrieveResponse =
            LedgerAccountStatementRetrieveResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("effectiveAtLowerBound", effectiveAtLowerBound),
                checkRequired("effectiveAtUpperBound", effectiveAtUpperBound),
                checkRequired("endingBalance", endingBalance),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("ledgerAccountLockVersion", ledgerAccountLockVersion),
                checkRequired("ledgerAccountNormalBalance", ledgerAccountNormalBalance),
                checkRequired("ledgerId", ledgerId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("startingBalance", startingBalance),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerAccountStatementRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        effectiveAtLowerBound()
        effectiveAtUpperBound()
        endingBalance().validate()
        ledgerAccountId()
        ledgerAccountLockVersion()
        ledgerAccountNormalBalance().validate()
        ledgerId()
        liveMode()
        metadata().validate()
        object_()
        startingBalance().validate()
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
            (if (effectiveAtLowerBound.asKnown() == null) 0 else 1) +
            (if (effectiveAtUpperBound.asKnown() == null) 0 else 1) +
            (endingBalance.asKnown()?.validity() ?: 0) +
            (if (ledgerAccountId.asKnown() == null) 0 else 1) +
            (if (ledgerAccountLockVersion.asKnown() == null) 0 else 1) +
            (ledgerAccountNormalBalance.asKnown()?.validity() ?: 0) +
            (if (ledgerId.asKnown() == null) 0 else 1) +
            (if (liveMode.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (object_.asKnown() == null) 0 else 1) +
            (startingBalance.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountStatementRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            description == other.description &&
            effectiveAtLowerBound == other.effectiveAtLowerBound &&
            effectiveAtUpperBound == other.effectiveAtUpperBound &&
            endingBalance == other.endingBalance &&
            ledgerAccountId == other.ledgerAccountId &&
            ledgerAccountLockVersion == other.ledgerAccountLockVersion &&
            ledgerAccountNormalBalance == other.ledgerAccountNormalBalance &&
            ledgerId == other.ledgerId &&
            liveMode == other.liveMode &&
            metadata == other.metadata &&
            object_ == other.object_ &&
            startingBalance == other.startingBalance &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            description,
            effectiveAtLowerBound,
            effectiveAtUpperBound,
            endingBalance,
            ledgerAccountId,
            ledgerAccountLockVersion,
            ledgerAccountNormalBalance,
            ledgerId,
            liveMode,
            metadata,
            object_,
            startingBalance,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountStatementRetrieveResponse{id=$id, createdAt=$createdAt, description=$description, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, endingBalance=$endingBalance, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountNormalBalance=$ledgerAccountNormalBalance, ledgerId=$ledgerId, liveMode=$liveMode, metadata=$metadata, object_=$object_, startingBalance=$startingBalance, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
