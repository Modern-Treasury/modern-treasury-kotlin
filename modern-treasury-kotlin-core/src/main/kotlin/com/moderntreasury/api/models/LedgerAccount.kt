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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balances")
    @ExcludeMissing
    private val balances: JsonField<LedgerBalancesWithEffectiveAt> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    private val ledgerableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("lock_version")
    @ExcludeMissing
    private val lockVersion: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("normal_balance")
    @ExcludeMissing
    private val normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * The pending, posted, and available balances for this ledger account. The posted balance is
     * the sum of all posted entries on the account. The pending balance is the sum of all pending
     * and posted entries on the account. The available balance is the posted incoming entries minus
     * the sum of the pending and posted outgoing amounts.
     */
    fun balances(): LedgerBalancesWithEffectiveAt = balances.getRequired("balances")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The description of the ledger account. */
    fun description(): String? = description.getNullable("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The id of the ledger that this account belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * If the ledger account links to another object in Modern Treasury, the id will be populated
     * here, otherwise null.
     */
    fun ledgerableId(): String? = ledgerableId.getNullable("ledgerable_id")

    /**
     * If the ledger account links to another object in Modern Treasury, the type will be populated
     * here, otherwise null. The value is one of internal_account or external_account.
     */
    fun ledgerableType(): LedgerableType? = ledgerableType.getNullable("ledgerable_type")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Lock version of the ledger account. */
    fun lockVersion(): Long = lockVersion.getRequired("lock_version")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The name of the ledger account. */
    fun name(): String = name.getRequired("name")

    /** The normal balance of the ledger account. */
    fun normalBalance(): TransactionDirection = normalBalance.getRequired("normal_balance")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The pending, posted, and available balances for this ledger account. The posted balance is
     * the sum of all posted entries on the account. The pending balance is the sum of all pending
     * and posted entries on the account. The available balance is the posted incoming entries minus
     * the sum of the pending and posted outgoing amounts.
     */
    @JsonProperty("balances")
    @ExcludeMissing
    fun _balances(): JsonField<LedgerBalancesWithEffectiveAt> = balances

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The description of the ledger account. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The id of the ledger that this account belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

    /**
     * If the ledger account links to another object in Modern Treasury, the id will be populated
     * here, otherwise null.
     */
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    fun _ledgerableId(): JsonField<String> = ledgerableId

    /**
     * If the ledger account links to another object in Modern Treasury, the type will be populated
     * here, otherwise null. The value is one of internal_account or external_account.
     */
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Lock version of the ledger account. */
    @JsonProperty("lock_version") @ExcludeMissing fun _lockVersion(): JsonField<Long> = lockVersion

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The name of the ledger account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The normal balance of the ledger account. */
    @JsonProperty("normal_balance")
    @ExcludeMissing
    fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        balances().validate()
        createdAt()
        description()
        discardedAt()
        ledgerId()
        ledgerableId()
        ledgerableType()
        liveMode()
        lockVersion()
        metadata().validate()
        name()
        normalBalance()
        object_()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [LedgerAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var balances: JsonField<LedgerBalancesWithEffectiveAt>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var ledgerId: JsonField<String>? = null
        private var ledgerableId: JsonField<String>? = null
        private var ledgerableType: JsonField<LedgerableType>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var lockVersion: JsonField<Long>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var normalBalance: JsonField<TransactionDirection>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccount: LedgerAccount) = apply {
            id = ledgerAccount.id
            balances = ledgerAccount.balances
            createdAt = ledgerAccount.createdAt
            description = ledgerAccount.description
            discardedAt = ledgerAccount.discardedAt
            ledgerId = ledgerAccount.ledgerId
            ledgerableId = ledgerAccount.ledgerableId
            ledgerableType = ledgerAccount.ledgerableType
            liveMode = ledgerAccount.liveMode
            lockVersion = ledgerAccount.lockVersion
            metadata = ledgerAccount.metadata
            name = ledgerAccount.name
            normalBalance = ledgerAccount.normalBalance
            object_ = ledgerAccount.object_
            updatedAt = ledgerAccount.updatedAt
            additionalProperties = ledgerAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The pending, posted, and available balances for this ledger account. The posted balance
         * is the sum of all posted entries on the account. The pending balance is the sum of all
         * pending and posted entries on the account. The available balance is the posted incoming
         * entries minus the sum of the pending and posted outgoing amounts.
         */
        fun balances(balances: LedgerBalancesWithEffectiveAt) = balances(JsonField.of(balances))

        /**
         * The pending, posted, and available balances for this ledger account. The posted balance
         * is the sum of all posted entries on the account. The pending balance is the sum of all
         * pending and posted entries on the account. The available balance is the posted incoming
         * entries minus the sum of the pending and posted outgoing amounts.
         */
        fun balances(balances: JsonField<LedgerBalancesWithEffectiveAt>) = apply {
            this.balances = balances
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The description of the ledger account. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The description of the ledger account. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this account belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /**
         * If the ledger account links to another object in Modern Treasury, the id will be
         * populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: String?) = ledgerableId(JsonField.ofNullable(ledgerableId))

        /**
         * If the ledger account links to another object in Modern Treasury, the id will be
         * populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            this.ledgerableId = ledgerableId
        }

        /**
         * If the ledger account links to another object in Modern Treasury, the type will be
         * populated here, otherwise null. The value is one of internal_account or external_account.
         */
        fun ledgerableType(ledgerableType: LedgerableType?) =
            ledgerableType(JsonField.ofNullable(ledgerableType))

        /**
         * If the ledger account links to another object in Modern Treasury, the type will be
         * populated here, otherwise null. The value is one of internal_account or external_account.
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
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /** Lock version of the ledger account. */
        fun lockVersion(lockVersion: Long) = lockVersion(JsonField.of(lockVersion))

        /** Lock version of the ledger account. */
        fun lockVersion(lockVersion: JsonField<Long>) = apply { this.lockVersion = lockVersion }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The name of the ledger account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the ledger account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The normal balance of the ledger account. */
        fun normalBalance(normalBalance: TransactionDirection) =
            normalBalance(JsonField.of(normalBalance))

        /** The normal balance of the ledger account. */
        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
            this.normalBalance = normalBalance
        }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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

        fun build(): LedgerAccount =
            LedgerAccount(
                checkRequired("id", id),
                checkRequired("balances", balances),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("ledgerId", ledgerId),
                checkRequired("ledgerableId", ledgerableId),
                checkRequired("ledgerableType", ledgerableType),
                checkRequired("liveMode", liveMode),
                checkRequired("lockVersion", lockVersion),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("normalBalance", normalBalance),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The pending, posted, and available balances for this ledger account. The posted balance is
     * the sum of all posted entries on the account. The pending balance is the sum of all pending
     * and posted entries on the account. The available balance is the posted incoming entries minus
     * the sum of the pending and posted outgoing amounts.
     */
    @NoAutoDetect
    class LedgerBalancesWithEffectiveAt
    @JsonCreator
    private constructor(
        @JsonProperty("available_balance")
        @ExcludeMissing
        private val availableBalance: JsonField<LedgerBalance> = JsonMissing.of(),
        @JsonProperty("effective_at_lower_bound")
        @ExcludeMissing
        private val effectiveAtLowerBound: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        private val effectiveAtUpperBound: JsonField<OffsetDateTime> = JsonMissing.of(),
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

        /** The inclusive lower bound of the effective_at timestamp for the returned balances. */
        fun effectiveAtLowerBound(): OffsetDateTime? =
            effectiveAtLowerBound.getNullable("effective_at_lower_bound")

        /** The exclusive upper bound of the effective_at timestamp for the returned balances. */
        fun effectiveAtUpperBound(): OffsetDateTime? =
            effectiveAtUpperBound.getNullable("effective_at_upper_bound")

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

        /** The inclusive lower bound of the effective_at timestamp for the returned balances. */
        @JsonProperty("effective_at_lower_bound")
        @ExcludeMissing
        fun _effectiveAtLowerBound(): JsonField<OffsetDateTime> = effectiveAtLowerBound

        /** The exclusive upper bound of the effective_at timestamp for the returned balances. */
        @JsonProperty("effective_at_upper_bound")
        @ExcludeMissing
        fun _effectiveAtUpperBound(): JsonField<OffsetDateTime> = effectiveAtUpperBound

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

        fun validate(): LedgerBalancesWithEffectiveAt = apply {
            if (validated) {
                return@apply
            }

            availableBalance().validate()
            effectiveAtLowerBound()
            effectiveAtUpperBound()
            pendingBalance().validate()
            postedBalance().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LedgerBalancesWithEffectiveAt]. */
        class Builder internal constructor() {

            private var availableBalance: JsonField<LedgerBalance>? = null
            private var effectiveAtLowerBound: JsonField<OffsetDateTime>? = null
            private var effectiveAtUpperBound: JsonField<OffsetDateTime>? = null
            private var pendingBalance: JsonField<LedgerBalance>? = null
            private var postedBalance: JsonField<LedgerBalance>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ledgerBalancesWithEffectiveAt: LedgerBalancesWithEffectiveAt) =
                apply {
                    availableBalance = ledgerBalancesWithEffectiveAt.availableBalance
                    effectiveAtLowerBound = ledgerBalancesWithEffectiveAt.effectiveAtLowerBound
                    effectiveAtUpperBound = ledgerBalancesWithEffectiveAt.effectiveAtUpperBound
                    pendingBalance = ledgerBalancesWithEffectiveAt.pendingBalance
                    postedBalance = ledgerBalancesWithEffectiveAt.postedBalance
                    additionalProperties =
                        ledgerBalancesWithEffectiveAt.additionalProperties.toMutableMap()
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

            /**
             * The inclusive lower bound of the effective_at timestamp for the returned balances.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime?) =
                effectiveAtLowerBound(JsonField.ofNullable(effectiveAtLowerBound))

            /**
             * The inclusive lower bound of the effective_at timestamp for the returned balances.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * The exclusive upper bound of the effective_at timestamp for the returned balances.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) =
                effectiveAtUpperBound(JsonField.ofNullable(effectiveAtUpperBound))

            /**
             * The exclusive upper bound of the effective_at timestamp for the returned balances.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: JsonField<OffsetDateTime>) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
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

            fun build(): LedgerBalancesWithEffectiveAt =
                LedgerBalancesWithEffectiveAt(
                    checkRequired("availableBalance", availableBalance),
                    checkRequired("effectiveAtLowerBound", effectiveAtLowerBound),
                    checkRequired("effectiveAtUpperBound", effectiveAtUpperBound),
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

            return /* spotless:off */ other is LedgerBalancesWithEffectiveAt && availableBalance == other.availableBalance && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && pendingBalance == other.pendingBalance && postedBalance == other.postedBalance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(availableBalance, effectiveAtLowerBound, effectiveAtUpperBound, pendingBalance, postedBalance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerBalancesWithEffectiveAt{availableBalance=$availableBalance, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, pendingBalance=$pendingBalance, postedBalance=$postedBalance, additionalProperties=$additionalProperties}"
    }

    /**
     * If the ledger account links to another object in Modern Treasury, the type will be populated
     * here, otherwise null. The value is one of internal_account or external_account.
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

            val COUNTERPARTY = of("counterparty")

            val EXTERNAL_ACCOUNT = of("external_account")

            val INTERNAL_ACCOUNT = of("internal_account")

            val VIRTUAL_ACCOUNT = of("virtual_account")

            fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        /** An enum containing [LedgerableType]'s known values. */
        enum class Known {
            COUNTERPARTY,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
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
            COUNTERPARTY,
            EXTERNAL_ACCOUNT,
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
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
                COUNTERPARTY -> Value.COUNTERPARTY
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
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
                COUNTERPARTY -> Known.COUNTERPARTY
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is LedgerAccount && id == other.id && balances == other.balances && createdAt == other.createdAt && description == other.description && discardedAt == other.discardedAt && ledgerId == other.ledgerId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && liveMode == other.liveMode && lockVersion == other.lockVersion && metadata == other.metadata && name == other.name && normalBalance == other.normalBalance && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, balances, createdAt, description, discardedAt, ledgerId, ledgerableId, ledgerableType, liveMode, lockVersion, metadata, name, normalBalance, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccount{id=$id, balances=$balances, createdAt=$createdAt, description=$description, discardedAt=$discardedAt, ledgerId=$ledgerId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, liveMode=$liveMode, lockVersion=$lockVersion, metadata=$metadata, name=$name, normalBalance=$normalBalance, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
