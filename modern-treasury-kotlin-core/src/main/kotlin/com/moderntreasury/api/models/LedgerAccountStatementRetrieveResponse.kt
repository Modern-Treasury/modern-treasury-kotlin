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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerAccountStatementRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_at_lower_bound")
    @ExcludeMissing
    private val effectiveAtLowerBound: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    private val effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ending_balance")
    @ExcludeMissing
    private val endingBalance: JsonField<LedgerBalances> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_lock_version")
    @ExcludeMissing
    private val ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ledger_account_normal_balance")
    @ExcludeMissing
    private val ledgerAccountNormalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("starting_balance")
    @ExcludeMissing
    private val startingBalance: JsonField<LedgerBalances> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        ledgerAccountNormalBalance()
        ledgerId()
        liveMode()
        metadata().validate()
        object_()
        startingBalance().validate()
        updatedAt()
        validated = true
    }

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
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
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
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun availableBalance(): LedgerBalance = availableBalance.getRequired("available_balance")

        /**
         * The pending_balance is the sum of all pending and posted entries.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

        /**
         * The posted_balance is the sum of all posted entries.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

        /**
         * Returns the raw JSON value of [availableBalance].
         *
         * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("available_balance")
        @ExcludeMissing
        fun _availableBalance(): JsonField<LedgerBalance> = availableBalance

        /**
         * Returns the raw JSON value of [pendingBalance].
         *
         * Unlike [pendingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(availableBalance: LedgerBalance) =
                availableBalance(JsonField.of(availableBalance))

            /**
             * Sets [Builder.availableBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableBalance] with a well-typed [LedgerBalance]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.pendingBalance] with a well-typed [LedgerBalance]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

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
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
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
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun credits(): Long = credits.getRequired("credits")

            /**
             * The currency of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * The currency exponent of the ledger account.
             *
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

            /**
             * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun debits(): Long = debits.getRequired("debits")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [credits].
             *
             * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
             * Unlike [debits], this method doesn't throw if the JSON field has an unexpected type.
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
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun credits(credits: Long) = credits(JsonField.of(credits))

                /**
                 * Sets [Builder.credits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credits] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

                /** The currency of the ledger account. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long) =
                    currencyExponent(JsonField.of(currencyExponent))

                /**
                 * Sets [Builder.currencyExponent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencyExponent] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                    this.currencyExponent = currencyExponent
                }

                fun debits(debits: Long) = debits(JsonField.of(debits))

                /**
                 * Sets [Builder.debits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debits] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountStatementRetrieveResponse && id == other.id && createdAt == other.createdAt && description == other.description && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && endingBalance == other.endingBalance && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerAccountNormalBalance == other.ledgerAccountNormalBalance && ledgerId == other.ledgerId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && startingBalance == other.startingBalance && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, effectiveAtLowerBound, effectiveAtUpperBound, endingBalance, ledgerAccountId, ledgerAccountLockVersion, ledgerAccountNormalBalance, ledgerId, liveMode, metadata, object_, startingBalance, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountStatementRetrieveResponse{id=$id, createdAt=$createdAt, description=$description, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, endingBalance=$endingBalance, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountNormalBalance=$ledgerAccountNormalBalance, ledgerId=$ledgerId, liveMode=$liveMode, metadata=$metadata, object_=$object_, startingBalance=$startingBalance, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
