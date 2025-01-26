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

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The description of the ledger account statement. */
    fun description(): String? = description.getNullable("description")

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
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    fun endingBalance(): LedgerBalances = endingBalance.getRequired("ending_balance")

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

    /** The id of the ledger that this ledger account statement belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    fun startingBalance(): LedgerBalances = startingBalance.getRequired("starting_balance")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The description of the ledger account statement. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The inclusive lower bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    @JsonProperty("effective_at_lower_bound")
    @ExcludeMissing
    fun _effectiveAtLowerBound(): JsonField<OffsetDateTime> = effectiveAtLowerBound

    /**
     * The exclusive upper bound of the effective_at timestamp of the ledger entries to be included
     * in the ledger account statement.
     */
    @JsonProperty("effective_at_upper_bound")
    @ExcludeMissing
    fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<LedgerBalances> = endingBalance

    /**
     * The id of the ledger account whose ledger entries are queried against, and its balances are
     * computed as a result.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /** Lock version of the ledger account at the time of statement generation. */
    @JsonProperty("ledger_account_lock_version")
    @ExcludeMissing
    fun _ledgerAccountLockVersion(): JsonField<Long> = ledgerAccountLockVersion

    /** The normal balance of the ledger account. */
    @JsonProperty("ledger_account_normal_balance")
    @ExcludeMissing
    fun _ledgerAccountNormalBalance(): JsonField<TransactionDirection> = ledgerAccountNormalBalance

    /** The id of the ledger that this ledger account statement belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * The pending, posted, and available balances for this ledger account at the
     * `effective_at_lower_bound`. The posted balance is the sum of all posted entries on the
     * account. The pending balance is the sum of all pending and posted entries on the account. The
     * available balance is the posted incoming entries minus the sum of the pending and posted
     * outgoing amounts.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<LedgerBalances> = startingBalance

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

        fun builder() = Builder()
    }

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

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The description of the ledger account statement. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The description of the ledger account statement. */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * The pending, posted, and available balances for this ledger account at the
         * `effective_at_upper_bound`. The posted balance is the sum of all posted entries on the
         * account. The pending balance is the sum of all pending and posted entries on the account.
         * The available balance is the posted incoming entries minus the sum of the pending and
         * posted outgoing amounts.
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
         * The id of the ledger account whose ledger entries are queried against, and its balances
         * are computed as a result.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** Lock version of the ledger account at the time of statement generation. */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
            ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

        /** Lock version of the ledger account at the time of statement generation. */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        /** The normal balance of the ledger account. */
        fun ledgerAccountNormalBalance(ledgerAccountNormalBalance: TransactionDirection) =
            ledgerAccountNormalBalance(JsonField.of(ledgerAccountNormalBalance))

        /** The normal balance of the ledger account. */
        fun ledgerAccountNormalBalance(
            ledgerAccountNormalBalance: JsonField<TransactionDirection>
        ) = apply { this.ledgerAccountNormalBalance = ledgerAccountNormalBalance }

        /** The id of the ledger that this ledger account statement belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this ledger account statement belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

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
        fun startingBalance(startingBalance: JsonField<LedgerBalances>) = apply {
            this.startingBalance = startingBalance
        }

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
         */
        fun availableBalance(): LedgerBalance = availableBalance.getRequired("available_balance")

        /** The pending_balance is the sum of all pending and posted entries. */
        fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

        /** The posted_balance is the sum of all posted entries. */
        fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

        /**
         * The available_balance is the sum of all posted inbound entries and pending outbound
         * entries. For credit normal, available_amount = posted_credits - pending_debits; for debit
         * normal, available_amount = posted_debits - pending_credits.
         */
        @JsonProperty("available_balance")
        @ExcludeMissing
        fun _availableBalance(): JsonField<LedgerBalance> = availableBalance

        /** The pending_balance is the sum of all pending and posted entries. */
        @JsonProperty("pending_balance")
        @ExcludeMissing
        fun _pendingBalance(): JsonField<LedgerBalance> = pendingBalance

        /** The posted_balance is the sum of all posted entries. */
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

            fun builder() = Builder()
        }

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
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(availableBalance: JsonField<LedgerBalance>) = apply {
                this.availableBalance = availableBalance
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

            fun amount(): Long = amount.getRequired("amount")

            fun credits(): Long = credits.getRequired("credits")

            /** The currency of the ledger account. */
            fun currency(): String = currency.getRequired("currency")

            /** The currency exponent of the ledger account. */
            fun currencyExponent(): Long = currencyExponent.getRequired("currency_exponent")

            fun debits(): Long = debits.getRequired("debits")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

            /** The currency of the ledger account. */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            fun _currencyExponent(): JsonField<Long> = currencyExponent

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

                fun builder() = Builder()
            }

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

                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun credits(credits: Long) = credits(JsonField.of(credits))

                fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

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

                fun debits(debits: Long) = debits(JsonField.of(debits))

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
