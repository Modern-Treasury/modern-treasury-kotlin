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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = LedgerAccountCategory.Builder::class)
@NoAutoDetect
class LedgerAccountCategory
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val ledgerId: JsonField<String>,
    private val normalBalance: JsonField<NormalBalance>,
    private val balances: JsonField<LedgerBalances>,
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

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The name of the ledger account category. */
    fun name(): String = name.getRequired("name")

    /** The description of the ledger account category. */
    fun description(): String? = description.getNullable("description")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The id of the ledger that this account category belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /** The normal balance of the ledger account category. */
    fun normalBalance(): NormalBalance = normalBalance.getRequired("normal_balance")

    /**
     * The pending, posted, and available balances for this ledger account category. The posted
     * balance is the sum of all posted entries on the account. The pending balance is the sum of
     * all pending and posted entries on the account. The available balance is the posted incoming
     * entries minus the sum of the pending and posted outgoing amounts.
     */
    fun balances(): LedgerBalances = balances.getRequired("balances")

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

    /** The name of the ledger account category. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The description of the ledger account category. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The id of the ledger that this account category belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /** The normal balance of the ledger account category. */
    @JsonProperty("normal_balance") @ExcludeMissing fun _normalBalance() = normalBalance

    /**
     * The pending, posted, and available balances for this ledger account category. The posted
     * balance is the sum of all posted entries on the account. The pending balance is the sum of
     * all pending and posted entries on the account. The available balance is the posted incoming
     * entries minus the sum of the pending and posted outgoing amounts.
     */
    @JsonProperty("balances") @ExcludeMissing fun _balances() = balances

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LedgerAccountCategory = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            name()
            description()
            metadata().validate()
            ledgerId()
            normalBalance()
            balances().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountCategory &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.name == other.name &&
            this.description == other.description &&
            this.metadata == other.metadata &&
            this.ledgerId == other.ledgerId &&
            this.normalBalance == other.normalBalance &&
            this.balances == other.balances &&
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
                    updatedAt,
                    discardedAt,
                    name,
                    description,
                    metadata,
                    ledgerId,
                    normalBalance,
                    balances,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LedgerAccountCategory{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, name=$name, description=$description, metadata=$metadata, ledgerId=$ledgerId, normalBalance=$normalBalance, balances=$balances, additionalProperties=$additionalProperties}"

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
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var normalBalance: JsonField<NormalBalance> = JsonMissing.of()
        private var balances: JsonField<LedgerBalances> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountCategory: LedgerAccountCategory) = apply {
            this.id = ledgerAccountCategory.id
            this.object_ = ledgerAccountCategory.object_
            this.liveMode = ledgerAccountCategory.liveMode
            this.createdAt = ledgerAccountCategory.createdAt
            this.updatedAt = ledgerAccountCategory.updatedAt
            this.discardedAt = ledgerAccountCategory.discardedAt
            this.name = ledgerAccountCategory.name
            this.description = ledgerAccountCategory.description
            this.metadata = ledgerAccountCategory.metadata
            this.ledgerId = ledgerAccountCategory.ledgerId
            this.normalBalance = ledgerAccountCategory.normalBalance
            this.balances = ledgerAccountCategory.balances
            additionalProperties(ledgerAccountCategory.additionalProperties)
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

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The name of the ledger account category. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the ledger account category. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The description of the ledger account category. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the ledger account category. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** The id of the ledger that this account category belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The id of the ledger that this account category belongs to. */
        @JsonProperty("ledger_id")
        @ExcludeMissing
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /** The normal balance of the ledger account category. */
        fun normalBalance(normalBalance: NormalBalance) = normalBalance(JsonField.of(normalBalance))

        /** The normal balance of the ledger account category. */
        @JsonProperty("normal_balance")
        @ExcludeMissing
        fun normalBalance(normalBalance: JsonField<NormalBalance>) = apply {
            this.normalBalance = normalBalance
        }

        /**
         * The pending, posted, and available balances for this ledger account category. The posted
         * balance is the sum of all posted entries on the account. The pending balance is the sum
         * of all pending and posted entries on the account. The available balance is the posted
         * incoming entries minus the sum of the pending and posted outgoing amounts.
         */
        fun balances(balances: LedgerBalances) = balances(JsonField.of(balances))

        /**
         * The pending, posted, and available balances for this ledger account category. The posted
         * balance is the sum of all posted entries on the account. The pending balance is the sum
         * of all pending and posted entries on the account. The available balance is the posted
         * incoming entries minus the sum of the pending and posted outgoing amounts.
         */
        @JsonProperty("balances")
        @ExcludeMissing
        fun balances(balances: JsonField<LedgerBalances>) = apply { this.balances = balances }

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

        fun build(): LedgerAccountCategory =
            LedgerAccountCategory(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                name,
                description,
                metadata,
                ledgerId,
                normalBalance,
                balances,
                additionalProperties.toUnmodifiable(),
            )
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

    class NormalBalance
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NormalBalance && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = NormalBalance(JsonField.of("credit"))

            val DEBIT = NormalBalance(JsonField.of("debit"))

            fun of(value: String) = NormalBalance(JsonField.of(value))
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
                else -> throw ModernTreasuryInvalidDataException("Unknown NormalBalance: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * The pending, posted, and available balances for this ledger account category. The posted
     * balance is the sum of all posted entries on the account. The pending balance is the sum of
     * all pending and posted entries on the account. The available balance is the posted incoming
     * entries minus the sum of the pending and posted outgoing amounts.
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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
