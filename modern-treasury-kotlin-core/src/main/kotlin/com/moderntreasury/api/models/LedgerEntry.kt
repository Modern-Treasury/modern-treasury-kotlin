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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerEntry
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("direction")
    @ExcludeMissing
    private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_lock_version")
    @ExcludeMissing
    private val ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ledger_account_currency")
    @ExcludeMissing
    private val ledgerAccountCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_account_currency_exponent")
    @ExcludeMissing
    private val ledgerAccountCurrencyExponent: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resulting_ledger_account_balances")
    @ExcludeMissing
    private val resultingLedgerAccountBalances: JsonField<LedgerBalances> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     */
    fun direction(): TransactionDirection = direction.getRequired("direction")

    /**
     * Equal to the state of the ledger transaction when the ledger entry was created. One of
     * `pending`, `posted`, or `archived`.
     */
    fun status(): Status = status.getRequired("status")

    /** The ledger account that this ledger entry is associated with. */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /**
     * Lock version of the ledger account. This can be passed when creating a ledger transaction to
     * only succeed if no ledger transactions have posted since the given version. See our post
     * about Designing the Ledgers API with Optimistic Locking for more details.
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
     * The pending, posted, and available balances for this ledger entry's ledger account. The
     * posted balance is the sum of all posted entries on the account. The pending balance is the
     * sum of all pending and posted entries on the account. The available balance is the posted
     * incoming entries minus the sum of the pending and posted outgoing amounts. Please see
     * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more details.
     */
    fun resultingLedgerAccountBalances(): LedgerBalances? =
        resultingLedgerAccountBalances.getNullable("resulting_ledger_account_balances")

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

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can be
     * any integer up to 36 digits.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
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
     * Lock version of the ledger account. This can be passed when creating a ledger transaction to
     * only succeed if no ledger transactions have posted since the given version. See our post
     * about Designing the Ledgers API with Optimistic Locking for more details.
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
     * The pending, posted, and available balances for this ledger entry's ledger account. The
     * posted balance is the sum of all posted entries on the account. The pending balance is the
     * sum of all pending and posted entries on the account. The available balance is the posted
     * incoming entries minus the sum of the pending and posted outgoing amounts. Please see
     * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more details.
     */
    @JsonProperty("resulting_ledger_account_balances")
    @ExcludeMissing
    fun _resultingLedgerAccountBalances() = resultingLedgerAccountBalances

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerEntry = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            amount()
            direction()
            status()
            ledgerAccountId()
            ledgerAccountLockVersion()
            ledgerAccountCurrency()
            ledgerAccountCurrencyExponent()
            ledgerTransactionId()
            resultingLedgerAccountBalances()?.validate()
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
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var direction: JsonField<TransactionDirection> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of()
        private var ledgerAccountCurrency: JsonField<String> = JsonMissing.of()
        private var ledgerAccountCurrencyExponent: JsonField<Long> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var resultingLedgerAccountBalances: JsonField<LedgerBalances> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerEntry: LedgerEntry) = apply {
            id = ledgerEntry.id
            object_ = ledgerEntry.object_
            liveMode = ledgerEntry.liveMode
            createdAt = ledgerEntry.createdAt
            updatedAt = ledgerEntry.updatedAt
            discardedAt = ledgerEntry.discardedAt
            amount = ledgerEntry.amount
            direction = ledgerEntry.direction
            status = ledgerEntry.status
            ledgerAccountId = ledgerEntry.ledgerAccountId
            ledgerAccountLockVersion = ledgerEntry.ledgerAccountLockVersion
            ledgerAccountCurrency = ledgerEntry.ledgerAccountCurrency
            ledgerAccountCurrencyExponent = ledgerEntry.ledgerAccountCurrencyExponent
            ledgerTransactionId = ledgerEntry.ledgerTransactionId
            resultingLedgerAccountBalances = ledgerEntry.resultingLedgerAccountBalances
            metadata = ledgerEntry.metadata
            additionalProperties = ledgerEntry.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

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
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. Can
         * be any integer up to 36 digits.
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
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            this.direction = direction
        }

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Equal to the state of the ledger transaction when the ledger entry was created. One of
         * `pending`, `posted`, or `archived`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ledger account that this ledger entry is associated with. */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /** The ledger account that this ledger entry is associated with. */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
            ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

        /**
         * Lock version of the ledger account. This can be passed when creating a ledger transaction
         * to only succeed if no ledger transactions have posted since the given version. See our
         * post about Designing the Ledgers API with Optimistic Locking for more details.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        /** The currency of the ledger account. */
        fun ledgerAccountCurrency(ledgerAccountCurrency: String) =
            ledgerAccountCurrency(JsonField.of(ledgerAccountCurrency))

        /** The currency of the ledger account. */
        fun ledgerAccountCurrency(ledgerAccountCurrency: JsonField<String>) = apply {
            this.ledgerAccountCurrency = ledgerAccountCurrency
        }

        /** The currency exponent of the ledger account. */
        fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: Long) =
            ledgerAccountCurrencyExponent(JsonField.of(ledgerAccountCurrencyExponent))

        /** The currency exponent of the ledger account. */
        fun ledgerAccountCurrencyExponent(ledgerAccountCurrencyExponent: JsonField<Long>) = apply {
            this.ledgerAccountCurrencyExponent = ledgerAccountCurrencyExponent
        }

        /** The ledger transaction that this ledger entry is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ledger transaction that this ledger entry is associated with. */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        fun resultingLedgerAccountBalances(resultingLedgerAccountBalances: LedgerBalances) =
            resultingLedgerAccountBalances(JsonField.of(resultingLedgerAccountBalances))

        /**
         * The pending, posted, and available balances for this ledger entry's ledger account. The
         * posted balance is the sum of all posted entries on the account. The pending balance is
         * the sum of all pending and posted entries on the account. The available balance is the
         * posted incoming entries minus the sum of the pending and posted outgoing amounts. Please
         * see https://docs.moderntreasury.com/docs/transaction-status-and-balances for more
         * details.
         */
        fun resultingLedgerAccountBalances(
            resultingLedgerAccountBalances: JsonField<LedgerBalances>
        ) = apply { this.resultingLedgerAccountBalances = resultingLedgerAccountBalances }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): LedgerEntry =
            LedgerEntry(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                amount,
                direction,
                status,
                ledgerAccountId,
                ledgerAccountLockVersion,
                ledgerAccountCurrency,
                ledgerAccountCurrencyExponent,
                ledgerTransactionId,
                resultingLedgerAccountBalances,
                metadata,
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
     * The pending, posted, and available balances for this ledger entry's ledger account. The
     * posted balance is the sum of all posted entries on the account. The pending balance is the
     * sum of all pending and posted entries on the account. The available balance is the posted
     * incoming entries minus the sum of the pending and posted outgoing amounts. Please see
     * https://docs.moderntreasury.com/docs/transaction-status-and-balances for more details.
     */
    @NoAutoDetect
    class LedgerBalances
    @JsonCreator
    private constructor(
        @JsonProperty("pending_balance")
        @ExcludeMissing
        private val pendingBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonProperty("posted_balance")
        @ExcludeMissing
        private val postedBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonProperty("available_balance")
        @ExcludeMissing
        private val availableBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The pending_balance is the sum of all pending and posted entries. */
        fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

        /** The posted_balance is the sum of all posted entries. */
        fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

        /**
         * The available_balance is the sum of all posted inbound entries and pending outbound
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
         */
        fun availableBalance(): LedgerBalance = availableBalance.getRequired("available_balance")

        /** The pending_balance is the sum of all pending and posted entries. */
        @JsonProperty("pending_balance") @ExcludeMissing fun _pendingBalance() = pendingBalance

        /** The posted_balance is the sum of all posted entries. */
        @JsonProperty("posted_balance") @ExcludeMissing fun _postedBalance() = postedBalance

        /**
         * The available_balance is the sum of all posted inbound entries and pending outbound
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
         */
        @JsonProperty("available_balance")
        @ExcludeMissing
        fun _availableBalance() = availableBalance

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LedgerBalances = apply {
            if (!validated) {
                pendingBalance().validate()
                postedBalance().validate()
                availableBalance().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var pendingBalance: JsonField<LedgerBalance> = JsonMissing.of()
            private var postedBalance: JsonField<LedgerBalance> = JsonMissing.of()
            private var availableBalance: JsonField<LedgerBalance> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerBalances: LedgerBalances) = apply {
                pendingBalance = ledgerBalances.pendingBalance
                postedBalance = ledgerBalances.postedBalance
                availableBalance = ledgerBalances.availableBalance
                additionalProperties = ledgerBalances.additionalProperties.toMutableMap()
            }

            /** The pending_balance is the sum of all pending and posted entries. */
            fun pendingBalance(pendingBalance: LedgerBalance) =
                pendingBalance(JsonField.of(pendingBalance))

            /** The pending_balance is the sum of all pending and posted entries. */
            fun pendingBalance(pendingBalance: JsonField<LedgerBalance>) = apply {
                this.pendingBalance = pendingBalance
            }

            /** The posted_balance is the sum of all posted entries. */
            fun postedBalance(postedBalance: LedgerBalance) =
                postedBalance(JsonField.of(postedBalance))

            /** The posted_balance is the sum of all posted entries. */
            fun postedBalance(postedBalance: JsonField<LedgerBalance>) = apply {
                this.postedBalance = postedBalance
            }

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(availableBalance: LedgerBalance) =
                availableBalance(JsonField.of(availableBalance))

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                this.availableBalance = availableBalance
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
                    pendingBalance,
                    postedBalance,
                    availableBalance,
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
            @JsonProperty("credits")
            @ExcludeMissing
            private val credits: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("debits")
            @ExcludeMissing
            private val debits: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            private val currencyExponent: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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

            private var validated: Boolean = false

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
                    credits = ledgerBalance.credits
                    debits = ledgerBalance.debits
                    amount = ledgerBalance.amount
                    currency = ledgerBalance.currency
                    currencyExponent = ledgerBalance.currencyExponent
                    additionalProperties = ledgerBalance.additionalProperties.toMutableMap()
                }

                fun credits(credits: Long) = credits(JsonField.of(credits))

                fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

                fun debits(debits: Long) = debits(JsonField.of(debits))

                fun debits(debits: JsonField<Long>) = apply { this.debits = debits }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The currency of the ledger account. */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /** The currency of the ledger account. */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long) =
                    currencyExponent(JsonField.of(currencyExponent))

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                    this.currencyExponent = currencyExponent
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

                fun build(): LedgerBalance =
                    LedgerBalance(
                        credits,
                        debits,
                        amount,
                        currency,
                        currencyExponent,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LedgerBalance && credits == other.credits && debits == other.debits && amount == other.amount && currency == other.currency && currencyExponent == other.currencyExponent && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(credits, debits, amount, currency, currencyExponent, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerBalance{credits=$credits, debits=$debits, amount=$amount, currency=$currency, currencyExponent=$currencyExponent, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerBalances && pendingBalance == other.pendingBalance && postedBalance == other.postedBalance && availableBalance == other.availableBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(pendingBalance, postedBalance, availableBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerBalances{pendingBalance=$pendingBalance, postedBalance=$postedBalance, availableBalance=$availableBalance, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ARCHIVED = of("archived")

            val PENDING = of("pending")

            val POSTED = of("posted")

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

        return /* spotless:off */ other is LedgerEntry && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && amount == other.amount && direction == other.direction && status == other.status && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerAccountCurrency == other.ledgerAccountCurrency && ledgerAccountCurrencyExponent == other.ledgerAccountCurrencyExponent && ledgerTransactionId == other.ledgerTransactionId && resultingLedgerAccountBalances == other.resultingLedgerAccountBalances && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, amount, direction, status, ledgerAccountId, ledgerAccountLockVersion, ledgerAccountCurrency, ledgerAccountCurrencyExponent, ledgerTransactionId, resultingLedgerAccountBalances, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerEntry{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, amount=$amount, direction=$direction, status=$status, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountCurrency=$ledgerAccountCurrency, ledgerAccountCurrencyExponent=$ledgerAccountCurrencyExponent, ledgerTransactionId=$ledgerTransactionId, resultingLedgerAccountBalances=$resultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
}
