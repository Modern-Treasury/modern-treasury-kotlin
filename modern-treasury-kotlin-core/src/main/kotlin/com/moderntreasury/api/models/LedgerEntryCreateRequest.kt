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
import java.util.Collections
import java.util.Objects

class LedgerEntryCreateRequest
private constructor(
    private val amount: JsonField<Long>,
    private val direction: JsonField<TransactionDirection>,
    private val ledgerAccountId: JsonField<String>,
    private val availableBalanceAmount: JsonField<AvailableBalanceAmount>,
    private val lockVersion: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val pendingBalanceAmount: JsonField<PendingBalanceAmount>,
    private val postedBalanceAmount: JsonField<PostedBalanceAmount>,
    private val showResultingLedgerAccountBalances: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<TransactionDirection> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_balance_amount")
        @ExcludeMissing
        availableBalanceAmount: JsonField<AvailableBalanceAmount> = JsonMissing.of(),
        @JsonProperty("lock_version")
        @ExcludeMissing
        lockVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("pending_balance_amount")
        @ExcludeMissing
        pendingBalanceAmount: JsonField<PendingBalanceAmount> = JsonMissing.of(),
        @JsonProperty("posted_balance_amount")
        @ExcludeMissing
        postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of(),
        @JsonProperty("show_resulting_ledger_account_balances")
        @ExcludeMissing
        showResultingLedgerAccountBalances: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        amount,
        direction,
        ledgerAccountId,
        availableBalanceAmount,
        lockVersion,
        metadata,
        pendingBalanceAmount,
        postedBalanceAmount,
        showResultingLedgerAccountBalances,
        mutableMapOf(),
    )

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): TransactionDirection = direction.getRequired("direction")

    /**
     * The ledger account that this ledger entry is associated with.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
     * available balance. If any of these conditions would be false after the transaction is
     * created, the entire call will fail with error code 422.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun availableBalanceAmount(): AvailableBalanceAmount? =
        availableBalanceAmount.getNullable("available_balance_amount")

    /**
     * Lock version of the ledger account. This can be passed when creating a ledger transaction to
     * only succeed if no ledger transactions have posted since the given version. See our post
     * about Designing the Ledgers API with Optimistic Locking for more details.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lockVersion(): Long? = lockVersion.getNullable("lock_version")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s pending
     * balance. If any of these conditions would be false after the transaction is created, the
     * entire call will fail with error code 422.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pendingBalanceAmount(): PendingBalanceAmount? =
        pendingBalanceAmount.getNullable("pending_balance_amount")

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s posted
     * balance. If any of these conditions would be false after the transaction is created, the
     * entire call will fail with error code 422.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postedBalanceAmount(): PostedBalanceAmount? =
        postedBalanceAmount.getNullable("posted_balance_amount")

    /**
     * If true, response will include the balance of the associated ledger account for the entry.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showResultingLedgerAccountBalances(): Boolean? =
        showResultingLedgerAccountBalances.getNullable("show_resulting_ledger_account_balances")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<TransactionDirection> = direction

    /**
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /**
     * Returns the raw JSON value of [availableBalanceAmount].
     *
     * Unlike [availableBalanceAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("available_balance_amount")
    @ExcludeMissing
    fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> = availableBalanceAmount

    /**
     * Returns the raw JSON value of [lockVersion].
     *
     * Unlike [lockVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion(): JsonField<Long> = lockVersion

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [pendingBalanceAmount].
     *
     * Unlike [pendingBalanceAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_balance_amount")
    @ExcludeMissing
    fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> = pendingBalanceAmount

    /**
     * Returns the raw JSON value of [postedBalanceAmount].
     *
     * Unlike [postedBalanceAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("posted_balance_amount")
    @ExcludeMissing
    fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

    /**
     * Returns the raw JSON value of [showResultingLedgerAccountBalances].
     *
     * Unlike [showResultingLedgerAccountBalances], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("show_resulting_ledger_account_balances")
    @ExcludeMissing
    fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
        showResultingLedgerAccountBalances

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
         * Returns a mutable builder for constructing an instance of [LedgerEntryCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .direction()
         * .ledgerAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LedgerEntryCreateRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var direction: JsonField<TransactionDirection>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var availableBalanceAmount: JsonField<AvailableBalanceAmount> = JsonMissing.of()
        private var lockVersion: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var pendingBalanceAmount: JsonField<PendingBalanceAmount> = JsonMissing.of()
        private var postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of()
        private var showResultingLedgerAccountBalances: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
            amount = ledgerEntryCreateRequest.amount
            direction = ledgerEntryCreateRequest.direction
            ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
            availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
            lockVersion = ledgerEntryCreateRequest.lockVersion
            metadata = ledgerEntryCreateRequest.metadata
            pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
            postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
            showResultingLedgerAccountBalances =
                ledgerEntryCreateRequest.showResultingLedgerAccountBalances
            additionalProperties = ledgerEntryCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [TransactionDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            this.direction = direction
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
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
         * available balance. If any of these conditions would be false after the transaction is
         * created, the entire call will fail with error code 422.
         */
        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
            availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

        /**
         * Sets [Builder.availableBalanceAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBalanceAmount] with a well-typed
         * [AvailableBalanceAmount] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun availableBalanceAmount(availableBalanceAmount: JsonField<AvailableBalanceAmount>) =
            apply {
                this.availableBalanceAmount = availableBalanceAmount
            }

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         */
        fun lockVersion(lockVersion: Long?) = lockVersion(JsonField.ofNullable(lockVersion))

        /**
         * Alias for [Builder.lockVersion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

        /**
         * Sets [Builder.lockVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockVersion] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lockVersion(lockVersion: JsonField<Long>) = apply { this.lockVersion = lockVersion }

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

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
         * pending balance. If any of these conditions would be false after the transaction is
         * created, the entire call will fail with error code 422.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
            pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

        /**
         * Sets [Builder.pendingBalanceAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingBalanceAmount] with a well-typed
         * [PendingBalanceAmount] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: JsonField<PendingBalanceAmount>) = apply {
            this.pendingBalanceAmount = pendingBalanceAmount
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
         * posted balance. If any of these conditions would be false after the transaction is
         * created, the entire call will fail with error code 422.
         */
        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
            postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

        /**
         * Sets [Builder.postedBalanceAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postedBalanceAmount] with a well-typed
         * [PostedBalanceAmount] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) = apply {
            this.postedBalanceAmount = postedBalanceAmount
        }

        /**
         * If true, response will include the balance of the associated ledger account for the
         * entry.
         */
        fun showResultingLedgerAccountBalances(showResultingLedgerAccountBalances: Boolean?) =
            showResultingLedgerAccountBalances(
                JsonField.ofNullable(showResultingLedgerAccountBalances)
            )

        /**
         * Alias for [Builder.showResultingLedgerAccountBalances].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun showResultingLedgerAccountBalances(showResultingLedgerAccountBalances: Boolean) =
            showResultingLedgerAccountBalances(showResultingLedgerAccountBalances as Boolean?)

        /**
         * Sets [Builder.showResultingLedgerAccountBalances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showResultingLedgerAccountBalances] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun showResultingLedgerAccountBalances(
            showResultingLedgerAccountBalances: JsonField<Boolean>
        ) = apply { this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [LedgerEntryCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .direction()
         * .ledgerAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerEntryCreateRequest =
            LedgerEntryCreateRequest(
                checkRequired("amount", amount),
                checkRequired("direction", direction),
                checkRequired("ledgerAccountId", ledgerAccountId),
                availableBalanceAmount,
                lockVersion,
                metadata,
                pendingBalanceAmount,
                postedBalanceAmount,
                showResultingLedgerAccountBalances,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LedgerEntryCreateRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        direction().validate()
        ledgerAccountId()
        availableBalanceAmount()?.validate()
        lockVersion()
        metadata()?.validate()
        pendingBalanceAmount()?.validate()
        postedBalanceAmount()?.validate()
        showResultingLedgerAccountBalances()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (direction.asKnown()?.validity() ?: 0) +
            (if (ledgerAccountId.asKnown() == null) 0 else 1) +
            (availableBalanceAmount.asKnown()?.validity() ?: 0) +
            (if (lockVersion.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (pendingBalanceAmount.asKnown()?.validity() ?: 0) +
            (postedBalanceAmount.asKnown()?.validity() ?: 0) +
            (if (showResultingLedgerAccountBalances.asKnown() == null) 0 else 1)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
     * available balance. If any of these conditions would be false after the transaction is
     * created, the entire call will fail with error code 422.
     */
    class AvailableBalanceAmount
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

            /**
             * Returns a mutable builder for constructing an instance of [AvailableBalanceAmount].
             */
            fun builder() = Builder()
        }

        /** A builder for [AvailableBalanceAmount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                additionalProperties = availableBalanceAmount.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [AvailableBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AvailableBalanceAmount =
                AvailableBalanceAmount(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AvailableBalanceAmount = apply {
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

            return other is AvailableBalanceAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s pending
     * balance. If any of these conditions would be false after the transaction is created, the
     * entire call will fail with error code 422.
     */
    class PendingBalanceAmount
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

            /** Returns a mutable builder for constructing an instance of [PendingBalanceAmount]. */
            fun builder() = Builder()
        }

        /** A builder for [PendingBalanceAmount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                additionalProperties = pendingBalanceAmount.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PendingBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PendingBalanceAmount =
                PendingBalanceAmount(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PendingBalanceAmount = apply {
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

            return other is PendingBalanceAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PendingBalanceAmount{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s posted
     * balance. If any of these conditions would be false after the transaction is created, the
     * entire call will fail with error code 422.
     */
    class PostedBalanceAmount
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

            /** Returns a mutable builder for constructing an instance of [PostedBalanceAmount]. */
            fun builder() = Builder()
        }

        /** A builder for [PostedBalanceAmount]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                additionalProperties = postedBalanceAmount.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PostedBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PostedBalanceAmount =
                PostedBalanceAmount(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PostedBalanceAmount = apply {
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

            return other is PostedBalanceAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PostedBalanceAmount{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerEntryCreateRequest &&
            amount == other.amount &&
            direction == other.direction &&
            ledgerAccountId == other.ledgerAccountId &&
            availableBalanceAmount == other.availableBalanceAmount &&
            lockVersion == other.lockVersion &&
            metadata == other.metadata &&
            pendingBalanceAmount == other.pendingBalanceAmount &&
            postedBalanceAmount == other.postedBalanceAmount &&
            showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            direction,
            ledgerAccountId,
            availableBalanceAmount,
            lockVersion,
            metadata,
            pendingBalanceAmount,
            postedBalanceAmount,
            showResultingLedgerAccountBalances,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
}
