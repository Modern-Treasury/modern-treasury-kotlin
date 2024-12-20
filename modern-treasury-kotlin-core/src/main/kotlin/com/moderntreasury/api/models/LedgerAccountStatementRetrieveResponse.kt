// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerAccountStatementRetrieveResponse.Builder::class)
@NoAutoDetect
class LedgerAccountStatementRetrieveResponse
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val ledgerId: JsonField<String>,
    private val description: JsonField<String>,
    private val ledgerAccountId: JsonField<String>,
    private val ledgerAccountLockVersion: JsonField<Long>,
    private val ledgerAccountNormalBalance: JsonField<TransactionDirection>,
    private val effectiveAtLowerBound: JsonField<OffsetDateTime>,
    private val effectiveAtUpperBound: JsonField<OffsetDateTime>,
    private val startingBalance: JsonField<LedgerBalances>,
    private val endingBalance: JsonField<LedgerBalances>,
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

    /** The id of the ledger that this ledger account statement belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /** The description of the ledger account statement. */
    fun description(): String? = description.getNullable("description")

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /** Lock version of the ledger account at the time of statement generation. */
    fun ledgerAccountLockVersion(): Long =
        ledgerAccountLockVersion.getRequired("ledger_account_lock_version")

    /** The normal balance of the ledger account. */
    fun ledgerAccountNormalBalance(): TransactionDirection =
        ledgerAccountNormalBalance.getRequired("ledger_account_normal_balance")

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    fun effectiveAtLowerBound(): OffsetDateTime =
        effectiveAtLowerBound.getRequired("effective_at_lower_bound")

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    fun effectiveAtUpperBound(): OffsetDateTime =
        effectiveAtUpperBound.getRequired("effective_at_upper_bound")

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    fun startingBalance(): LedgerBalances = startingBalance.getRequired("starting_balance")

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    fun endingBalance(): LedgerBalances = endingBalance.getRequired("ending_balance")

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

    /** The id of the ledger that this ledger account statement belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /** The description of the ledger account statement. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     */
    @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

    /** Lock version of the ledger account at the time of statement generation. */
    @JsonProperty("ledger_account_lock_version")
    @ExcludeMissing
    fun _ledgerAccountLockVersion() = ledgerAccountLockVersion

    /** The normal balance of the ledger account. */
    @JsonProperty("ledger_account_normal_balance")
    @ExcludeMissing
    fun _ledgerAccountNormalBalance() = ledgerAccountNormalBalance

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    @JsonProperty("effective_at_lower_bound")
    @ExcludeMissing
    fun _effectiveAtLowerBound() = effectiveAtLowerBound

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound() = effectiveAtUpperBound

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccountStatementRetrieveResponse = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            ledgerId()
            description()
            ledgerAccountId()
            ledgerAccountLockVersion()
            ledgerAccountNormalBalance()
            effectiveAtLowerBound()
            effectiveAtUpperBound()
            startingBalance().validate()
            endingBalance().validate()
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
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of()
        private var ledgerAccountNormalBalance: JsonField<TransactionDirection> = JsonMissing.of()
        private var effectiveAtLowerBound: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startingBalance: JsonField<LedgerBalances> = JsonMissing.of()
        private var endingBalance: JsonField<LedgerBalances> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            ledgerAccountStatementRetrieveResponse: LedgerAccountStatementRetrieveResponse
        ) = apply {
            id = ledgerAccountStatementRetrieveResponse.id
            object_ = ledgerAccountStatementRetrieveResponse.object_
            liveMode = ledgerAccountStatementRetrieveResponse.liveMode
            createdAt = ledgerAccountStatementRetrieveResponse.createdAt
            updatedAt = ledgerAccountStatementRetrieveResponse.updatedAt
            ledgerId = ledgerAccountStatementRetrieveResponse.ledgerId
            description = ledgerAccountStatementRetrieveResponse.description
            ledgerAccountId = ledgerAccountStatementRetrieveResponse.ledgerAccountId
            ledgerAccountLockVersion =
                ledgerAccountStatementRetrieveResponse.ledgerAccountLockVersion
            ledgerAccountNormalBalance =
                ledgerAccountStatementRetrieveResponse.ledgerAccountNormalBalance
            effectiveAtLowerBound = ledgerAccountStatementRetrieveResponse.effectiveAtLowerBound
            effectiveAtUpperBound = ledgerAccountStatementRetrieveResponse.effectiveAtUpperBound
            startingBalance = ledgerAccountStatementRetrieveResponse.startingBalance
            endingBalance = ledgerAccountStatementRetrieveResponse.endingBalance
            metadata = ledgerAccountStatementRetrieveResponse.metadata
            additionalProperties =
                ledgerAccountStatementRetrieveResponse.additionalProperties.toMutableMap()
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

        /** The id of the ledger that this ledger account statement belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this ledger account statement belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The description of the ledger account statement. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the ledger account statement. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /**
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** Lock version of the ledger account at the time of statement generation. */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
            ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

        /** Lock version of the ledger account at the time of statement generation. */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        /** The normal balance of the ledger account. */
        fun ledgerAccountNormalBalance(ledgerAccountNormalBalance: TransactionDirection) =
            ledgerAccountNormalBalance(JsonField.of(ledgerAccountNormalBalance))

        /** The normal balance of the ledger account. */
        @JsonProperty("ledger_account_normal_balance")
        @ExcludeMissing
        fun ledgerAccountNormalBalance(
            ledgerAccountNormalBalance: JsonField<TransactionDirection>
        ) = apply { this.ledgerAccountNormalBalance = ledgerAccountNormalBalance }

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime) =
            effectiveAtLowerBound(JsonField.of(effectiveAtLowerBound))

        /**
         * The inclusive lower bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_lower_bound")
        @ExcludeMissing
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
         * The exclusive upper bound of the effective_at timestamp of the ledger entries to be
         * included in the ledger account statement.
         */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
            this.effectiveAtUpperBound = effectiveAtUpperBound
        }

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
         * The pending, posted, and available balances for this ledger account at the
         * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
         * account. The pending balance is the sum of all pending and posted entries on the account.
         * The available balance is the posted incoming entries minus the sum of the pending and
         * posted outgoing amounts.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun startingBalance(startingBalance: JsonField<LedgerBalances>) = apply {
            this.startingBalance = startingBalance
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
         * The pending, posted, and available balances for this ledger account at the
         * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
         * account. The pending balance is the sum of all pending and posted entries on the account.
         * The available balance is the posted incoming entries minus the sum of the pending and
         * posted outgoing amounts.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun endingBalance(endingBalance: JsonField<LedgerBalances>) = apply {
            this.endingBalance = endingBalance
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

        fun build(): LedgerAccountStatementRetrieveResponse =
            LedgerAccountStatementRetrieveResponse(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                ledgerId,
                description,
                ledgerAccountId,
                ledgerAccountLockVersion,
                ledgerAccountNormalBalance,
                effectiveAtLowerBound,
                effectiveAtUpperBound,
                startingBalance,
                endingBalance,
                metadata,
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
    @JsonDeserialize(builder = LedgerBalances.Builder::class)
    @NoAutoDetect
    class LedgerBalances
    private constructor(
        private val pendingBalance: JsonField<LedgerBalance>,
        private val postedBalance: JsonField<LedgerBalance>,
        private val availableBalance: JsonField<LedgerBalance>,
        private val additionalProperties: Map<String, JsonValue>,
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
            @JsonProperty("available_balance")
            @ExcludeMissing
            fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                this.availableBalance = availableBalance
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
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountStatementRetrieveResponse && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && ledgerId == other.ledgerId && description == other.description && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerAccountNormalBalance == other.ledgerAccountNormalBalance && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && startingBalance == other.startingBalance && endingBalance == other.endingBalance && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, ledgerId, description, ledgerAccountId, ledgerAccountLockVersion, ledgerAccountNormalBalance, effectiveAtLowerBound, effectiveAtUpperBound, startingBalance, endingBalance, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountStatementRetrieveResponse{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, ledgerId=$ledgerId, description=$description, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountNormalBalance=$ledgerAccountNormalBalance, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, startingBalance=$startingBalance, endingBalance=$endingBalance, metadata=$metadata, additionalProperties=$additionalProperties}"
}
