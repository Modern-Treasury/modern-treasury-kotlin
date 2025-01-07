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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class LedgerAccountBalanceMonitor
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("alert_condition")
    @ExcludeMissing
    private val alertCondition: JsonField<AlertCondition> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("current_ledger_account_balance_state")
    @ExcludeMissing
    private val currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState> =
        JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    fun alertCondition(): AlertCondition = alertCondition.getRequired("alert_condition")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    fun currentLedgerAccountBalanceState(): CurrentLedgerAccountBalanceState =
        currentLedgerAccountBalanceState.getRequired("current_ledger_account_balance_state")

    /** An optional, free-form description for internal use. */
    fun description(): String? = description.getNullable("description")

    fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

    /** The ledger account associated with this balance monitor. */
    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @JsonProperty("alert_condition")
    @ExcludeMissing
    fun _alertCondition(): JsonField<AlertCondition> = alertCondition

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The ledger account's balances and the monitor state as of the current ledger account lock
     * version.
     */
    @JsonProperty("current_ledger_account_balance_state")
    @ExcludeMissing
    fun _currentLedgerAccountBalanceState(): JsonField<CurrentLedgerAccountBalanceState> =
        currentLedgerAccountBalanceState

    /** An optional, free-form description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /** The ledger account associated with this balance monitor. */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerAccountBalanceMonitor = apply {
        if (!validated) {
            id()
            alertCondition().validate()
            createdAt()
            currentLedgerAccountBalanceState().validate()
            description()
            discardedAt()
            ledgerAccountId()
            liveMode()
            metadata().validate()
            object_()
            updatedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var alertCondition: JsonField<AlertCondition>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>? =
            null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ledgerAccountBalanceMonitor: LedgerAccountBalanceMonitor) = apply {
            id = ledgerAccountBalanceMonitor.id
            alertCondition = ledgerAccountBalanceMonitor.alertCondition
            createdAt = ledgerAccountBalanceMonitor.createdAt
            currentLedgerAccountBalanceState =
                ledgerAccountBalanceMonitor.currentLedgerAccountBalanceState
            description = ledgerAccountBalanceMonitor.description
            discardedAt = ledgerAccountBalanceMonitor.discardedAt
            ledgerAccountId = ledgerAccountBalanceMonitor.ledgerAccountId
            liveMode = ledgerAccountBalanceMonitor.liveMode
            metadata = ledgerAccountBalanceMonitor.metadata
            object_ = ledgerAccountBalanceMonitor.object_
            updatedAt = ledgerAccountBalanceMonitor.updatedAt
            additionalProperties = ledgerAccountBalanceMonitor.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: AlertCondition) =
            alertCondition(JsonField.of(alertCondition))

        /** Describes the condition that must be satisfied for the monitor to be triggered. */
        fun alertCondition(alertCondition: JsonField<AlertCondition>) = apply {
            this.alertCondition = alertCondition
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
        fun currentLedgerAccountBalanceState(
            currentLedgerAccountBalanceState: JsonField<CurrentLedgerAccountBalanceState>
        ) = apply { this.currentLedgerAccountBalanceState = currentLedgerAccountBalanceState }

        /** An optional, free-form description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** An optional, free-form description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /** The ledger account associated with this balance monitor. */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
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

        fun build(): LedgerAccountBalanceMonitor =
            LedgerAccountBalanceMonitor(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(alertCondition) { "`alertCondition` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currentLedgerAccountBalanceState) {
                    "`currentLedgerAccountBalanceState` is required but was not set"
                },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(discardedAt) { "`discardedAt` is required but was not set" },
                checkNotNull(ledgerAccountId) { "`ledgerAccountId` is required but was not set" },
                checkNotNull(liveMode) { "`liveMode` is required but was not set" },
                checkNotNull(metadata) { "`metadata` is required but was not set" },
                checkNotNull(object_) { "`object_` is required but was not set" },
                checkNotNull(updatedAt) { "`updatedAt` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    /** Describes the condition that must be satisfied for the monitor to be triggered. */
    @NoAutoDetect
    class AlertCondition
    @JsonCreator
    private constructor(
        @JsonProperty("field")
        @ExcludeMissing
        private val field: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator")
        @ExcludeMissing
        private val operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

        /**
         * A logical operator to compare the `field` against the `value`. One of `less_than`,
         * `less_than_or_equals`, `equals`, `greater_than_or_equals`, `greater_than`.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

        /**
         * The monitor's `current_ledger_account_balance_state.triggered` will be `true` when
         * comparing the `field` to this integer value using the `operator` is logically true.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

            private var field: JsonField<String>? = null
            private var operator: JsonField<String>? = null
            private var value: JsonField<Long>? = null
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
            fun value(value: JsonField<Long>) = apply { this.value = value }

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

            fun build(): AlertCondition =
                AlertCondition(
                    checkNotNull(field) { "`field` is required but was not set" },
                    checkNotNull(operator) { "`operator` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
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
    @NoAutoDetect
    class CurrentLedgerAccountBalanceState
    @JsonCreator
    private constructor(
        @JsonProperty("balances")
        @ExcludeMissing
        private val balances: JsonField<LedgerBalances> = JsonMissing.of(),
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        private val ledgerAccountLockVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("triggered")
        @ExcludeMissing
        private val triggered: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        @JsonProperty("balances")
        @ExcludeMissing
        fun _balances(): JsonField<LedgerBalances> = balances

        /** The current lock version of the ledger account. */
        @JsonProperty("ledger_account_lock_version")
        @ExcludeMissing
        fun _ledgerAccountLockVersion(): JsonField<Long> = ledgerAccountLockVersion

        /**
         * If `true`, the ledger account's balances satisfy the `alert_condition` at this lock
         * version.
         */
        @JsonProperty("triggered") @ExcludeMissing fun _triggered(): JsonField<Boolean> = triggered

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

            private var balances: JsonField<LedgerBalances>? = null
            private var ledgerAccountLockVersion: JsonField<Long>? = null
            private var triggered: JsonField<Boolean>? = null
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

            fun balances(balances: JsonField<LedgerBalances>) = apply { this.balances = balances }

            /** The current lock version of the ledger account. */
            fun ledgerAccountLockVersion(ledgerAccountLockVersion: Long) =
                ledgerAccountLockVersion(JsonField.of(ledgerAccountLockVersion))

            /** The current lock version of the ledger account. */
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
            fun triggered(triggered: JsonField<Boolean>) = apply { this.triggered = triggered }

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

            fun build(): CurrentLedgerAccountBalanceState =
                CurrentLedgerAccountBalanceState(
                    checkNotNull(balances) { "`balances` is required but was not set" },
                    checkNotNull(ledgerAccountLockVersion) {
                        "`ledgerAccountLockVersion` is required but was not set"
                    },
                    checkNotNull(triggered) { "`triggered` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

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
             */
            fun availableBalance(): LedgerBalance =
                availableBalance.getRequired("available_balance")

            /** The pending_balance is the sum of all pending and posted entries. */
            fun pendingBalance(): LedgerBalance = pendingBalance.getRequired("pending_balance")

            /** The posted_balance is the sum of all posted entries. */
            fun postedBalance(): LedgerBalance = postedBalance.getRequired("posted_balance")

            /**
             * The available_balance is the sum of all posted inbound entries and pending outbound
             * entries. For credit normal, available_amount = posted_credits - pending_debits; for
             * debit normal, available_amount = posted_debits - pending_credits.
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
                if (!validated) {
                    availableBalance().validate()
                    pendingBalance().validate()
                    postedBalance().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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
                 * The available_balance is the sum of all posted inbound entries and pending
                 * outbound entries. For credit normal, available_amount = posted_credits -
                 * pending_debits; for debit normal, available_amount = posted_debits -
                 * pending_credits.
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
                        checkNotNull(availableBalance) {
                            "`availableBalance` is required but was not set"
                        },
                        checkNotNull(pendingBalance) {
                            "`pendingBalance` is required but was not set"
                        },
                        checkNotNull(postedBalance) {
                            "`postedBalance` is required but was not set"
                        },
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                    if (!validated) {
                        amount()
                        credits()
                        currency()
                        currencyExponent()
                        debits()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(credits) { "`credits` is required but was not set" },
                            checkNotNull(currency) { "`currency` is required but was not set" },
                            checkNotNull(currencyExponent) {
                                "`currencyExponent` is required but was not set"
                            },
                            checkNotNull(debits) { "`debits` is required but was not set" },
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountBalanceMonitor && id == other.id && alertCondition == other.alertCondition && createdAt == other.createdAt && currentLedgerAccountBalanceState == other.currentLedgerAccountBalanceState && description == other.description && discardedAt == other.discardedAt && ledgerAccountId == other.ledgerAccountId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, alertCondition, createdAt, currentLedgerAccountBalanceState, description, discardedAt, ledgerAccountId, liveMode, metadata, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerAccountBalanceMonitor{id=$id, alertCondition=$alertCondition, createdAt=$createdAt, currentLedgerAccountBalanceState=$currentLedgerAccountBalanceState, description=$description, discardedAt=$discardedAt, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
