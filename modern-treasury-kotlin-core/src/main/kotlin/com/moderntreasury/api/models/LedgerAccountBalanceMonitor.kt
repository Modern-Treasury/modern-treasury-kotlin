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

@JsonDeserialize(builder = LedgerAccountBalanceMonitor.Builder::class)
@NoAutoDetect
class LedgerAccountBalanceMonitor
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val ledgerAccountId: JsonField<String>,
    private val description: JsonField<String>,
    private val alertCondition: JsonField<AlertCondition>,
    private val currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>,
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

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ledger account associated with this balance monitor. */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /** An optional, free-form description for internal use. */
    fun description(): String? = description.getNullable("description")

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    fun alertCondition(): AlertCondition = alertCondition.getRequired("alert_condition")

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    fun currentLedgerAccountBalanceState(): CurrentLedgerAccountBalanceState =
        currentLedgerAccountBalanceState.getRequired("current_ledger_account_balance_state")

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

    /** The ledger account associated with this balance monitor. */
    @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

    /** An optional, free-form description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @JsonProperty("alert_condition") @ExcludeMissing fun _alertCondition() = alertCondition

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    @JsonProperty("current_ledger_account_balance_state")
    @ExcludeMissing
    fun _currentLedgerAccountBalanceState() = currentLedgerAccountBalanceState

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccountBalanceMonitor = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            ledgerAccountId()
            description()
            alertCondition().validate()
            currentLedgerAccountBalanceState().validate()
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
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var alertCondition: JsonField<AlertCondition> = JsonMissing.of()
        private var currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState> =
            JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountBalanceMonitor: LedgerAccountBalanceMonitor) = apply {
            id = ledgerAccountBalanceMonitor.id
            object_ = ledgerAccountBalanceMonitor.object_
            liveMode = ledgerAccountBalanceMonitor.liveMode
            createdAt = ledgerAccountBalanceMonitor.createdAt
            updatedAt = ledgerAccountBalanceMonitor.updatedAt
            discardedAt = ledgerAccountBalanceMonitor.discardedAt
            ledgerAccountId = ledgerAccountBalanceMonitor.ledgerAccountId
            description = ledgerAccountBalanceMonitor.description
            alertCondition = ledgerAccountBalanceMonitor.alertCondition
            currentLedgerAccountBalanceState =
                ledgerAccountBalanceMonitor.currentLedgerAccountBalanceState
            metadata = ledgerAccountBalanceMonitor.metadata
            additionalProperties = ledgerAccountBalanceMonitor.additionalProperties.toMutableMap()
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

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /** The ledger account associated with this balance monitor. */
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** An optional, free-form description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional, free-form description for internal use. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: AlertCondition) =
            alertCondition(JsonField.of(alertCondition))

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        @JsonProperty("alert_condition")
        @ExcludeMissing
        fun alertCondition(alertCondition: JsonField<AlertCondition>) = apply {
            this.alertCondition = alertCondition
        }

        /**
         * The ledger account's balances and the monitor state as of the current ledger account lock
         * version.
         */
        fun currentLedgerAccountBalanceState(
            currentLedgerAccountBalanceState: CurrentLedgerAccountBalanceState
        ) = currentLedgerAccountBalanceState(JsonField.of(currentLedgerAccountBalanceState))

        /**
         * The ledger account's balances and the monitor state as of the current ledger account lock
         * version.
         */
        @JsonProperty("current_ledger_account_balance_state")
        @ExcludeMissing
        fun currentLedgerAccountBalanceState(
            currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>
        ) = apply { this.currentLedgerAccountBalanceState = currentLedgerAccountBalanceState }

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

        fun build(): LedgerAccountBalanceMonitor =
            LedgerAccountBalanceMonitor(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                ledgerAccountId,
                description,
                alertCondition,
                currentLedgerAccountBalanceState,
                metadata,
                additionalProperties.toImmutable(),
            )
    }

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @JsonDeserialize(builder = AlertCondition.Builder::class)
    @NoAutoDetect
    class AlertCondition
    private constructor(
        private val field: JsonField<String>,
        private val operator: JsonField<String>,
        private val value: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         */
        fun field(): String = field.getRequired("field")

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        fun operator(): String = operator.getRequired("operator")

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        fun value(): Long = value.getRequired("value")

        /**
         * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
         * `ledger_account_lock_version`.
         */
        @JsonProperty("field") @ExcludeMissing fun _field() = field

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AlertCondition = apply {
            if (!validated) {
                field()
                operator()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var field: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<String> = JsonMissing.of()
            private var value: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(alertCondition: AlertCondition) = apply {
                field = alertCondition.field
                operator = alertCondition.operator
                value = alertCondition.value
                additionalProperties = alertCondition.additionalProperties.toMutableMap()
            }

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * One of `available_balance_amount`, `pending_balance_amount`, `posted_balance_amount`,
             * `ledger_account_lock_version`.
             */
            @JsonProperty("field")
            @ExcludeMissing
            fun field(field: JsonField<String>) = apply { this.field = field }

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            fun operator(operator: String) = operator(JsonField.of(operator))

            /**
             * A logical operator to compare the `field` against the `value`. One of `less_than`,
             * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun operator(operator: JsonField<String>) = apply { this.operator = operator }

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
             * comparing the `field` to this integer value using the `operator` is logically true.
             */
            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            fun build(): AlertCondition =
                AlertCondition(
                    field,
                    operator,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCondition && field == other.field && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(field, operator, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertCondition{field=$field, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    @JsonDeserialize(builder = CurrentLedgerAccountBalanceState.Builder::class)
    @NoAutoDetect
    class CurrentLedgerAccountBalanceState
    private constructor(
        private val balances: JsonField<LedgerBalances>,
        private val ledgerAccountLockVersion: JsonField<Long>,
        private val triggered: JsonField<Boolean>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun balances(): LedgerBalances = balances.getRequired("balances")

        /** The current lock version of the ledger account. */
        fun ledgerAccountLockVersion(): Long =
            ledgerAccountLockVersion.getRequired("ledger_account_lock_version")

        /**
         * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
         * version.
         */
        fun triggered(): Boolean = triggered.getRequired("triggered")

        @JsonProperty("balances") @ExcludeMissing fun _balances() = balances

        /** The current lock version of the ledger account. */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun _ledgerAccountLockVersion() = ledgerAccountLockVersion

        /**
         * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
         * version.
         */
        @JsonProperty("triggered") @ExcludeMissing fun _triggered() = triggered

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CurrentLedgerAccountBalanceState = apply {
            if (!validated) {
                balances().validate()
                ledgerAccountLockVersion()
                triggered()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var balances: JsonField<LedgerBalances> = JsonMissing.of()
            private var ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of()
            private var triggered: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(currentLedgerAccountBalanceState: CurrentLedgerAccountBalanceState) =
                apply {
                    balances = currentLedgerAccountBalanceState.balances
                    ledgerAccountLockVersion =
                        currentLedgerAccountBalanceState.ledgerAccountLockVersion
                    triggered = currentLedgerAccountBalanceState.triggered
                    additionalProperties =
                        currentLedgerAccountBalanceState.additionalProperties.toMutableMap()
                }

            fun balances(balances: LedgerBalances) = balances(JsonField.of(balances))

            @JsonProperty("balances")
            @ExcludeMissing
            fun balances(balances: JsonField<LedgerBalances>) = apply { this.balances = balances }

            /** The current lock version of the ledger account. */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
                ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

            /** The current lock version of the ledger account. */
            @JsonProperty("ledger_account_lock_version")
            @ExcludeMissing
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: JsonField<Long>) = apply {
                this.ledgerAccountLockVersion = ledgerAccountLockVersion
            }

            /**
             * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
             * version.
             */
            fun triggered(triggered: Boolean) = triggered(JsonField.of(triggered))

            /**
             * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
             * version.
             */
            @JsonProperty("triggered")
            @ExcludeMissing
            fun triggered(triggered: JsonField<Boolean>) = apply { this.triggered = triggered }

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

            fun build(): CurrentLedgerAccountBalanceState =
                CurrentLedgerAccountBalanceState(
                    balances,
                    ledgerAccountLockVersion,
                    triggered,
                    additionalProperties.toImmutable(),
                )
        }

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
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
             */
            fun availableBalance(): LedgerBalance =
                availableBalance.getRequired("available_balance")

            /** The pending_balance is the sum of all pending and posted entries. */
            @JsonProperty("pending_balance") @ExcludeMissing fun _pendingBalance() = pendingBalance

            /** The posted_balance is the sum of all posted entries. */
            @JsonProperty("posted_balance") @ExcludeMissing fun _postedBalance() = postedBalance

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
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
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
                 */
                fun availableBalance(availableBalance: LedgerBalance) =
                    availableBalance(JsonField.of(availableBalance))

                /**
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
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
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CurrentLedgerAccountBalanceState && balances == other.balances && ledgerAccountLockVersion == other.ledgerAccountLockVersion && triggered == other.triggered && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(balances, ledgerAccountLockVersion, triggered, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentLedgerAccountBalanceState{balances=$balances, ledgerAccountLockVersion=$ledgerAccountLockVersion, triggered=$triggered, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is LedgerAccountBalanceMonitor && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && ledgerAccountId == other.ledgerAccountId && description == other.description && alertCondition == other.alertCondition && currentLedgerAccountBalanceState == other.currentLedgerAccountBalanceState && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, ledgerAccountId, description, alertCondition, currentLedgerAccountBalanceState, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountBalanceMonitor{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, ledgerAccountId=$ledgerAccountId, description=$description, alertCondition=$alertCondition, currentLedgerAccountBalanceState=$currentLedgerAccountBalanceState, metadata=$metadata, additionalProperties=$additionalProperties}"
}
